/**
 */
package istar.tests;

import istar.IstarFactory;
import istar.IstarMeanEndLink;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mean End Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IstarMeanEndLinkTest extends IstarRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IstarMeanEndLinkTest.class);
	}

	/**
	 * Constructs a new Mean End Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IstarMeanEndLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mean End Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IstarMeanEndLink getFixture() {
		return (IstarMeanEndLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IstarFactory.eINSTANCE.createIstarMeanEndLink());
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

} //IstarMeanEndLinkTest
