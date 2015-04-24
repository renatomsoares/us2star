/**
 */
package istar.tests;

import istar.IstarDependencyLink;
import istar.IstarFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dependency Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IstarDependencyLinkTest extends IstarRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IstarDependencyLinkTest.class);
	}

	/**
	 * Constructs a new Dependency Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarDependencyLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dependency Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IstarDependencyLink getFixture() {
		return (IstarDependencyLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IstarFactory.eINSTANCE.createIstarDependencyLink());
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

} //IstarDependencyLinkTest
