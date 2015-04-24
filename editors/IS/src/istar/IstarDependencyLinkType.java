/**
 */
package istar;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dependency Link Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see istar.IstarPackage#getIstarDependencyLinkType()
 * @model
 * @generated
 */
public enum IstarDependencyLinkType implements Enumerator {
	/**
	 * The '<em><b>COMMITTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMITTED_VALUE
	 * @generated
	 * @ordered
	 */
	COMMITTED(0, "COMMITTED", "COMMITTED"),

	/**
	 * The '<em><b>OPEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN(1, "OPEN", "OPEN"),

	/**
	 * The '<em><b>CRITICAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CRITICAL_VALUE
	 * @generated
	 * @ordered
	 */
	CRITICAL(2, "CRITICAL", "CRITICAL");

	/**
	 * The '<em><b>COMMITTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMMITTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMITTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMMITTED_VALUE = 0;

	/**
	 * The '<em><b>OPEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_VALUE = 1;

	/**
	 * The '<em><b>CRITICAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CRITICAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CRITICAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CRITICAL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Dependency Link Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IstarDependencyLinkType[] VALUES_ARRAY =
		new IstarDependencyLinkType[] {
			COMMITTED,
			OPEN,
			CRITICAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Dependency Link Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IstarDependencyLinkType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dependency Link Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IstarDependencyLinkType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IstarDependencyLinkType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dependency Link Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IstarDependencyLinkType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IstarDependencyLinkType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dependency Link Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IstarDependencyLinkType get(int value) {
		switch (value) {
			case COMMITTED_VALUE: return COMMITTED;
			case OPEN_VALUE: return OPEN;
			case CRITICAL_VALUE: return CRITICAL;
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
	private IstarDependencyLinkType(int value, String name, String literal) {
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
	
} //IstarDependencyLinkType
