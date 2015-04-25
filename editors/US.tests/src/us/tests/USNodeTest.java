/**
 */
package us.tests;

import junit.textui.TestRunner;

import us.USNode;
import us.UsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>US Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class USNodeTest extends UsPartTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(USNodeTest.class);
	}

	/**
	 * Constructs a new US Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public USNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this US Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected USNode getFixture() {
		return (USNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UsFactory.eINSTANCE.createUSNode());
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

} //USNodeTest
