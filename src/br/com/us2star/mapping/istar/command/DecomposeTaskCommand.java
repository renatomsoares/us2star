package br.com.us2star.mapping.istar.command;

import br.com.us2star.istar.IstarCompartment;
import br.com.us2star.istar.IstarCompartmentType;
import br.com.us2star.istar.IstarContributionType;
import br.com.us2star.istar.IstarDependencyLink;
import br.com.us2star.istar.IstarElement;
import br.com.us2star.istar.IstarElementType;
import br.com.us2star.istar.IstarIntentionalElement;
import br.com.us2star.istar.IstarTaskDecomposition;
import br.com.us2star.mapping.istar.IstarData;
import br.com.us2star.mapping.us.UsData;

public class DecomposeTaskCommand extends AbstractMappingCommand implements IMappingCommand {

	private UsData usData;

	public DecomposeTaskCommand(IstarData istarData, UsData usData) {
		super(istarData);
		this.usData = usData;
	}

	@Override
	public Object execute() {

		getIstarData().getIstar_model().getElements().clear();

		for (int i = 0 ; i < usData.getUsList().size() ; i++) {

			if (!getIstarData().goalExists(usData.getUsList().get(i).getElements().get(2).getDescription())) {
				IstarElement new_element = getIstarData().getIstar_factory().createIstarElement();
				new_element.setName(usData.getUsList().get(i).getElements().get(2).getDescription());
				new_element.setId(usData.getUsList().get(i).getElements().get(2).getId());
				new_element.setType(IstarElementType.GOAL);
				getIstarData().getIstar_model().getElements().add(new_element);
			} else {

				String goal = usData.getUsList().get(i).getElements().get(2).getDescription();
				String taskName = getIstarData().getTaskNameFromGoal(goal);

				if (taskName != null) {
					if (!taskName.equals(usData.getUsList().get(i).getElements().get(1).getDescription())) {
						System.out.println("chegou");
						System.out.println("taskname=" + taskName);

						IstarIntentionalElement new_it_task = getIstarData().getIstar_factory().createIstarIntentionalElement();
						new_it_task.setName("{Generic TASK by goal: " + usData.getUsList().get(i).getElements().get(2).getDescription() + "}");
						
						IstarElement new_task = getIstarData().getIstar_factory().createIstarElement();
						new_task.setName("{Generic TASK by goal: " + usData.getUsList().get(i).getElements().get(2).getDescription() + "}");
						new_task.setType(IstarElementType.TASK);
						getIstarData().getIstar_model().getCompartments().get(0).getElements().add(new_task);
						
						IstarTaskDecomposition decomposition1 = getIstarData().getIstar_factory().createIstarTaskDecomposition();
						decomposition1.setSource(new_it_task);
						decomposition1.setTarget(getIstarData().searchTask(taskName));
						addUniqueTaskDecomposition(decomposition1);

						IstarTaskDecomposition decomposition2 = getIstarData().getIstar_factory().createIstarTaskDecomposition();
						decomposition2.setSource(new_it_task);
						decomposition2.setTarget(getIstarData().searchTask(usData.getUsList().get(i).getElements().get(1).getDescription()));
						addUniqueTaskDecomposition(decomposition2);

						IstarDependencyLink dependency_goal_gTask = getIstarData().getIstar_factory().createIstarDependencyLink();
						dependency_goal_gTask.setSource(getIstarData().searchGoal(usData.getUsList().get(i).getElements().get(2).getDescription()));
						dependency_goal_gTask.setTarget(new_it_task);
						getIstarData().getIstar_model().getDependencyLinks().add(dependency_goal_gTask);
						
						getIstarData().removeDependencyLink(goal, taskName);
						getIstarData().removeDependencyLink(goal, getIstarData().searchTask(usData.getUsList().get(i).getElements().get(1).getDescription()).getName());
					}
				}
			}
		}
		return true;
	}

	private void addUniqueTaskDecomposition(IstarTaskDecomposition taskDecomposition) {
		if (!getIstarData().taskDecompositionExists(taskDecomposition.getSource(), taskDecomposition.getTarget())) {
			getIstarData().getIstar_model().getCompartments().get(0).getTasksDecompositions().add(taskDecomposition);
		}		
	}
}
