/**
 */
package us.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import us.USModel;
import us.UsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>US Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class USModelTest extends TestCase {

	/**
	 * The fixture for this US Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected USModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(USModelTest.class);
	}

	/**
	 * Constructs a new US Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public USModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this US Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(USModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this US Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected USModel getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UsFactory.eINSTANCE.createUSModel());
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

} //USModelTest
