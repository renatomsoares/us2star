/**
 */
package istar;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Actor Link Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see istar.IstarPackage#getIstarActorLinkType()
 * @model
 * @generated
 */
public enum IstarActorLinkType implements Enumerator {
	/**
	 * The '<em><b>ISA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISA_VALUE
	 * @generated
	 * @ordered
	 */
	ISA(0, "ISA", "ISA"),

	/**
	 * The '<em><b>COVERS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COVERS_VALUE
	 * @generated
	 * @ordered
	 */
	COVERS(1, "COVERS", "COVERS"),

	/**
	 * The '<em><b>ISPARTOF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISPARTOF_VALUE
	 * @generated
	 * @ordered
	 */
	ISPARTOF(2, "ISPARTOF", "ISPARTOF"),

	/**
	 * The '<em><b>OCCUPIES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCCUPIES_VALUE
	 * @generated
	 * @ordered
	 */
	OCCUPIES(3, "OCCUPIES", "OCCUPIES"),

	/**
	 * The '<em><b>PLAYS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAYS_VALUE
	 * @generated
	 * @ordered
	 */
	PLAYS(4, "PLAYS", "PLAYS"),

	/**
	 * The '<em><b>INS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INS_VALUE
	 * @generated
	 * @ordered
	 */
	INS(5, "INS", "INS");

	/**
	 * The '<em><b>ISA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISA_VALUE = 0;

	/**
	 * The '<em><b>COVERS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COVERS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COVERS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COVERS_VALUE = 1;

	/**
	 * The '<em><b>ISPARTOF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISPARTOF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISPARTOF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ISPARTOF_VALUE = 2;

	/**
	 * The '<em><b>OCCUPIES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OCCUPIES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OCCUPIES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OCCUPIES_VALUE = 3;

	/**
	 * The '<em><b>PLAYS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLAYS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLAYS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLAYS_VALUE = 4;

	/**
	 * The '<em><b>INS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INS_VALUE = 5;

	/**
	 * An array of all the '<em><b>Actor Link Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IstarActorLinkType[] VALUES_ARRAY =
		new IstarActorLinkType[] {
			ISA,
			COVERS,
			ISPARTOF,
			OCCUPIES,
			PLAYS,
			INS,
		};

	/**
	 * A public read-only list of all the '<em><b>Actor Link Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IstarActorLinkType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Actor Link Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IstarActorLinkType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IstarActorLinkType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Actor Link Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IstarActorLinkType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IstarActorLinkType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Actor Link Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IstarActorLinkType get(int value) {
		switch (value) {
			case ISA_VALUE: return ISA;
			case COVERS_VALUE: return COVERS;
			case ISPARTOF_VALUE: return ISPARTOF;
			case OCCUPIES_VALUE: return OCCUPIES;
			case PLAYS_VALUE: return PLAYS;
			case INS_VALUE: return INS;
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
	private IstarActorLinkType(int value, String name, String literal) {
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
	
} //IstarActorLinkType
