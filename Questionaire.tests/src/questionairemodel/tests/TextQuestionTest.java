/**
 */
package questionairemodel.tests;

import junit.textui.TestRunner;

import questionairemodel.QuestionairemodelFactory;
import questionairemodel.TextQuestion;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Text Question</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextQuestionTest extends QuestionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TextQuestionTest.class);
	}

	/**
	 * Constructs a new Text Question test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextQuestionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Text Question test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TextQuestion getFixture() {
		return (TextQuestion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuestionairemodelFactory.eINSTANCE.createTextQuestion());
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

} //TextQuestionTest
