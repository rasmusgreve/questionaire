/*
 * generated by Xtext
 */
package dk.itu.smdp.group2.generator

import java.io.File
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import questionairemodel.Questionaire
import questionairemodel.Question
import questionairemodel.Option
import questionairemodel.Paragraph
import questionairemodel.Heading
import questionairemodel.ChoiceQuestion
import questionairemodel.Element
import questionairemodel.MatrixQuestion
import java.util.List
import questionairemodel.impl.ChoiceQuestionImpl

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class QuestionaireGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		resource.allContents.toIterable.filter(typeof(Questionaire)).forEach [ Questionaire it |
			
			//Remove quotes
			name = name.replaceAll("[^a-zA-Z0-9_-]","") //Remove illegal chars (this needs to be a valid file name)
			resultEmail = removeQuotes(resultEmail)
			
			elements.forEach[removeQuotes]
			
			//Fix default values max selections for choice questions
			elements.filter(ChoiceQuestionImpl).forEach[
				if (maxSelections == 0) //If max not entered it means exactly min.
					maxSelections = minSelections
			]
			
			val fname = it.name.toFirstUpper
			
			// generate Android implementation
			fsa.generateFile("android/QuestionsFragment.java", AndroidGenerator.compileToAndroid(it))
			
			// generate Latex
			fsa.generateFile("latex/" + fname +".tex", LatexGenerator.compileToLatex(it))
			
		]
	}
	
	/*
	 * Remove quotes from the start and end of all strings
	 */
	def static removeQuotes(Element it){
		if(it instanceof Heading){
			(it as Heading).text = removeQuotes((it as Heading).text)
		}
		if(it instanceof Paragraph){
			(it as Paragraph).text = removeQuotes((it as Paragraph).text)
		}
		if(it instanceof Question){
			val base = (it as Question).questionBase
			base.title = removeQuotes(base.title)
			base.description = removeQuotes(base.description)
		}
		if(it instanceof ChoiceQuestion){
			(it as ChoiceQuestion).options.forEach[
				name = removeQuotes(name)
				text = removeQuotes(text)
			]
		}
		if(it instanceof MatrixQuestion) {
			val q = (it as MatrixQuestion);
			q.rowNames.forEach[elem, i|q.rowNames.set(i,removeQuotes(elem))]
			q.columnNames.forEach[elem, i|q.columnNames.set(i,removeQuotes(elem))]
		}
	}
	
	def static removeQuotes(String it)
	{
		//Remove quotes in the start and end of lines in the string
		it?.replaceAll("^\"","")?.replaceAll("\"$","")
	}
}

