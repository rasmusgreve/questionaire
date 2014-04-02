/**
 */
package questionairemodel.tests;

import junit.textui.TestRunner;

import questionairemodel.IntegerQuestion;
import questionairemodel.QuestionairemodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Integer Question</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegerQuestionTest extends QuestionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntegerQuestionTest.class);
	}

	/**
	 * Constructs a new Integer Question test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerQuestionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Integer Question test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntegerQuestion getFixture() {
		return (IntegerQuestion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuestionairemodelFactory.eINSTANCE.createIntegerQuestion());
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

} //IntegerQuestionTest
