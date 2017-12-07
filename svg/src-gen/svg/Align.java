/**
 */
package svg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Align</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see svg.SvgPackage#getAlign()
 * @model
 * @generated
 */
public enum Align implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "none", "none"),

	/**
	 * The '<em><b>XMin YMin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMIN_YMIN_VALUE
	 * @generated
	 * @ordered
	 */
	XMIN_YMIN(0, "xMinYMin", "xMinYMin"),

	/**
	 * The '<em><b>XMid YMin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMID_YMIN_VALUE
	 * @generated
	 * @ordered
	 */
	XMID_YMIN(0, "xMidYMin", "xMidYMin"),

	/**
	 * The '<em><b>XMax YMin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMAX_YMIN_VALUE
	 * @generated
	 * @ordered
	 */
	XMAX_YMIN(0, "xMaxYMin", "xMaxYMin"),

	/**
	 * The '<em><b>XMin YMid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMIN_YMID_VALUE
	 * @generated
	 * @ordered
	 */
	XMIN_YMID(0, "xMinYMid", "xMinYMid"),

	/**
	 * The '<em><b>XMid YMid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMID_YMID_VALUE
	 * @generated
	 * @ordered
	 */
	XMID_YMID(0, "xMidYMid", "xMidYMid"),

	/**
	 * The '<em><b>XMax YMid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMAX_YMID_VALUE
	 * @generated
	 * @ordered
	 */
	XMAX_YMID(0, "xMaxYMid", "xMaxYMid"),

	/**
	 * The '<em><b>XMin YMax</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMIN_YMAX_VALUE
	 * @generated
	 * @ordered
	 */
	XMIN_YMAX(0, "xMinYMax", "xMinYMax"),

	/**
	 * The '<em><b>XMid YMax</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMID_YMAX_VALUE
	 * @generated
	 * @ordered
	 */
	XMID_YMAX(0, "xMidYMax", "xMidYMax"),

	/**
	 * The '<em><b>XMax YMax</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XMAX_YMAX_VALUE
	 * @generated
	 * @ordered
	 */
	XMAX_YMAX(0, "xMaxYMax", "xMaxYMax");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>XMin YMin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMin YMin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMIN_YMIN
	 * @model name="xMinYMin"
	 * @generated
	 * @ordered
	 */
	public static final int XMIN_YMIN_VALUE = 0;

	/**
	 * The '<em><b>XMid YMin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMid YMin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMID_YMIN
	 * @model name="xMidYMin"
	 * @generated
	 * @ordered
	 */
	public static final int XMID_YMIN_VALUE = 0;

	/**
	 * The '<em><b>XMax YMin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMax YMin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMAX_YMIN
	 * @model name="xMaxYMin"
	 * @generated
	 * @ordered
	 */
	public static final int XMAX_YMIN_VALUE = 0;

	/**
	 * The '<em><b>XMin YMid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMin YMid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMIN_YMID
	 * @model name="xMinYMid"
	 * @generated
	 * @ordered
	 */
	public static final int XMIN_YMID_VALUE = 0;

	/**
	 * The '<em><b>XMid YMid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMid YMid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMID_YMID
	 * @model name="xMidYMid"
	 * @generated
	 * @ordered
	 */
	public static final int XMID_YMID_VALUE = 0;

	/**
	 * The '<em><b>XMax YMid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMax YMid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMAX_YMID
	 * @model name="xMaxYMid"
	 * @generated
	 * @ordered
	 */
	public static final int XMAX_YMID_VALUE = 0;

	/**
	 * The '<em><b>XMin YMax</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMin YMax</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMIN_YMAX
	 * @model name="xMinYMax"
	 * @generated
	 * @ordered
	 */
	public static final int XMIN_YMAX_VALUE = 0;

	/**
	 * The '<em><b>XMid YMax</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMid YMax</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMID_YMAX
	 * @model name="xMidYMax"
	 * @generated
	 * @ordered
	 */
	public static final int XMID_YMAX_VALUE = 0;

	/**
	 * The '<em><b>XMax YMax</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XMax YMax</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XMAX_YMAX
	 * @model name="xMaxYMax"
	 * @generated
	 * @ordered
	 */
	public static final int XMAX_YMAX_VALUE = 0;

	/**
	 * An array of all the '<em><b>Align</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Align[] VALUES_ARRAY = new Align[] { NONE, XMIN_YMIN, XMID_YMIN, XMAX_YMIN, XMIN_YMID,
			XMID_YMID, XMAX_YMID, XMIN_YMAX, XMID_YMAX, XMAX_YMAX, };

	/**
	 * A public read-only list of all the '<em><b>Align</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Align> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Align</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Align get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Align result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Align</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Align getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Align result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Align</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Align get(int value) {
		switch (value) {
		case NONE_VALUE:
			return NONE;
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
	private Align(int value, String name, String literal) {
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

} //Align
