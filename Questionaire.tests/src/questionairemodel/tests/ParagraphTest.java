/**
 */
package questionairemodel.tests;

import junit.textui.TestRunner;

import questionairemodel.Paragraph;
import questionairemodel.QuestionairemodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Paragraph</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParagraphTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParagraphTest.class);
	}

	/**
	 * Constructs a new Paragraph test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParagraphTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Paragraph test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Paragraph getFixture() {
		return (Paragraph)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuestionairemodelFactory.eINSTANCE.createParagraph());
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

} //ParagraphTest
