/**
 */
package istar;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Compartment Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see istar.IstarPackage#getIstarCompartmentType()
 * @model
 * @generated
 */
public enum IstarCompartmentType implements Enumerator {
	/**
	 * The '<em><b>ACTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTOR_VALUE
	 * @generated
	 * @ordered
	 */
	ACTOR(0, "ACTOR", "ACTOR"),

	/**
	 * The '<em><b>AGENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGENT_VALUE
	 * @generated
	 * @ordered
	 */
	AGENT(1, "AGENT", "AGENT"),

	/**
	 * The '<em><b>ROLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLE_VALUE
	 * @generated
	 * @ordered
	 */
	ROLE(2, "ROLE", "ROLE"),

	/**
	 * The '<em><b>POSITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITION_VALUE
	 * @generated
	 * @ordered
	 */
	POSITION(3, "POSITION", "POSITION");

	/**
	 * The '<em><b>ACTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACTOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTOR_VALUE = 0;

	/**
	 * The '<em><b>AGENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AGENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AGENT_VALUE = 1;

	/**
	 * The '<em><b>ROLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROLE_VALUE = 2;

	/**
	 * The '<em><b>POSITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POSITION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSITION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POSITION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Compartment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IstarCompartmentType[] VALUES_ARRAY =
		new IstarCompartmentType[] {
			ACTOR,
			AGENT,
			ROLE,
			POSITION,
		};

	/**
	 * A public read-only list of all the '<em><b>Compartment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IstarCompartmentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Compartment Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IstarCompartmentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IstarCompartmentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Compartment Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IstarCompartmentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IstarCompartmentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Compartment Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IstarCompartmentType get(int value) {
		switch (value) {
			case ACTOR_VALUE: return ACTOR;
			case AGENT_VALUE: return AGENT;
			case ROLE_VALUE: return ROLE;
			case POSITION_VALUE: return POSITION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private IstarCompartmentType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //IstarCompartmentType
