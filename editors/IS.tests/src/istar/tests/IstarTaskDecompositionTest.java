/**
 */
package istar.tests;

import istar.IstarFactory;
import istar.IstarTaskDecomposition;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Task Decomposition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IstarTaskDecompositionTest extends IstarRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IstarTaskDecompositionTest.class);
	}

	/**
	 * Constructs a new Task Decomposition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarTaskDecompositionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Task Decomposition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IstarTaskDecomposition getFixture() {
		return (IstarTaskDecomposition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IstarFactory.eINSTANCE.createIstarTaskDecomposition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //IstarTaskDecompositionTest
