/**
 */
package us.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import us.UsFactory;
import us.UsPart;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsPartTest extends TestCase {

	/**
	 * The fixture for this Part test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsPart fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UsPartTest.class);
	}

	/**
	 * Constructs a new Part test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsPartTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Part test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UsPart fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Part test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsPart getFixture() {
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
		setFixture(UsFactory.eINSTANCE.createUsPart());
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

} //UsPartTest
