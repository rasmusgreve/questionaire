package dk.itu.smdp.group2.generator

import questionairemodel.CalendarQuestion
import questionairemodel.ChoiceQuestion
import questionairemodel.Heading
import questionairemodel.IntegerQuestion
import questionairemodel.MatrixQuestion
import questionairemodel.Option
import questionairemodel.Paragraph
import questionairemodel.Question
import questionairemodel.QuestionBase
import questionairemodel.QuestionCondition
import questionairemodel.Questionaire
import questionairemodel.TextQuestion
import java.util.ArrayList

class LatexGenerator {
	
	def static staticStartCode(){
		'''
		\documentclass[12pt,fleqn]{scrreprt}
		\usepackage[ngerman]{babel}
		\usepackage[top=2.5cm,bottom=2.5cm,left=2cm,right=2cm]{geometry}
		\usepackage[latin1]{inputenc}
		\RequirePackage{amssymb,latexsym,amsmath}
		\RequirePackage{stmaryrd}
		\RequirePackage{paralist}
		\RequirePackage{longtable}
		\RequirePackage{framed}
		\RequirePackage{color}
		\RequirePackage{array,booktabs,calc} 
		\RequirePackage{forloop}
		
		\definecolor{shadecolor}{rgb}{0.95,0.95,0.95}
		\definecolor{framecolor}{rgb}{0,0,0}
		\setlength{\fboxrule}{0.3mm}
		
		\parindent0cm 
		\pagestyle{empty}
		
		
		
		\newcommand{\bbox}{\framebox[0.6cm]{\rule{0cm}{0.6cm}}}
		
		
		%Heading
		\newcommand{\heading}[1]{{\huge #1}}
		
		%Paragraph
		\renewenvironment{paragraph}{%
		\def\FrameCommand{\fcolorbox{framecolor}{shadecolor}}%
		\MakeFramed {\FrameRestore}}%
		{\endMakeFramed}
		
		
		%Question
		\renewcommand*\thechapter{\bf{\arabic{chapter}.}}
		\catcode `@11
		\def\question{\@startsection {chapter}{1}{\z@}{-3.5ex plus
		-1ex minus  -.2ex}{1.5ex plus .2ex}{}}
		
		
		%Text question
		\newcounter{openC}
		\newcommand{\textanswer}[1]{\begin{addmargin}{1.5cm}
		\vspace{0.4cm}
		\forloop{openC}{0}{\value{openC}<#1}{
		\raisebox{-4.5mm}{\parbox{13cm}{\hrule\strut}}\vspace{0.4cm}
		
		}
		\end{addmargin}}
		
		%Integer question
		\newcounter{integerC}
		\newcommand{\integeranswer}[3]{\begin{center}
		\begin{tabular}{*{#2}{c}}
		\hfill\forloop[#3]{integerC}{#1}{\value{integerC} < #2}{$\Box$ & }$\Box$\\
		\hfill\forloop[#3]{integerC}{#1}{\value{integerC} < #2}{\arabic{integerC} & }#2
		\end{tabular}
		\end{center}}
		
		%Calendar question
		\def\year{$\stackrel{\bbox\ \bbox\ \bbox\ \bbox}{\mbox{ \footnotesize Year }}\hspace{.8cm}$}
		\def\month{$\stackrel{\bbox\ \bbox}{\mbox{\footnotesize Month}}\hspace{.8cm}$}
		\def\day{$\stackrel{\bbox\ \bbox}{\mbox{\footnotesize Day}}\hspace{.8cm}$}
		\def\hour{$\stackrel{\bbox\ \bbox}{\mbox{\footnotesize Hour}}\hspace{.8cm}$}
		\def\minute{$\stackrel{\bbox\ \bbox}{\mbox{\footnotesize Minute}}\hspace{.8cm}$}
		
		%Choice question
		\newenvironment{choiceoptions}{\vspace{0.25cm}\begin{addmargin}[2cm]{6cm}\begin{compactitem}[]}{\end{compactitem}\end{addmargin}}
		\newcommand{\option}[1]{\item #1\dotfill$\square$}  
		\newcommand{\choicenumber}[2]{\textit{You must choose between #1 and #2 options.}}
		
		
		%Matrix question (not done)
		\newcommand{\matrixfive}[6]{\vspace{0.5cm}\begin{tabular}{p{4.7cm}p{1.8cm}p{1.8cm}p{1.8cm}p{1.8cm}p{1.8cm}p{0.000001cm}}
		&\centering #1&\centering #2&\centering #3&\centering #4&\centering #5&\\#6\end{tabular}\vspace{0.5cm}}
		\newcommand{\matrixlinefive}[1]{#1\vspace{0.2cm}& \centering$\Box$ & \centering$\Box$ & \centering$\Box$ & \centering$\Box$&\centering$\Box$&\\}
		
		\begin{document}

		'''
	}
	
	def static staticEndCode() {
		'''
		
		\begin{paragraph}
		Thank you for filling out our questionaire.
		\end{paragraph}
		\end{document}
		'''
	}
	
	/***************************
	 *         Elements        *
	 ***************************/
	
	
	
	def static compileHeading(Heading it)  {
		'''
		\heading{«text»}
		'''
	}
	def static compileParagraph(Paragraph it)  {
		'''
		\begin{paragraph}
		«text»
		\end{paragraph}
		'''
	}


	def static compileQuestion(Question it)  {
		'''
		%%«it.class.name»
		«questionBase.compileQuestionBase»
		«IF (it instanceof TextQuestion)»«compileTextQuestion»«ENDIF»
		«IF (it instanceof IntegerQuestion)»«compileIntegerQuestion»«ENDIF»
		«IF (it instanceof CalendarQuestion)»«compileCalendarQuestion»«ENDIF»
		«IF (it instanceof MatrixQuestion)»«compileMatrixQuestion»«ENDIF»
		«IF (it instanceof ChoiceQuestion)»«compileChoiceQuestion»«ENDIF»
		'''
	}
	def static compileQuestionBase(QuestionBase it)  {
		'''
		\question{«title»«IF mandatory» *«ENDIF»«IF description != null»\\«description»«ENDIF»}
		'''
	}
	def static compileTextQuestion(TextQuestion it)  {
		'''
		\textanswer{«lines»}
		'''
	}
	def static compileIntegerQuestion(IntegerQuestion it)  {
		'''
		integeranswer{«minValue»}{«maxValue»}{«step»}
		'''
	}
	def static compileCalendarQuestion(CalendarQuestion it)  {
		'''
		«IF year»\year«ENDIF»
		«IF month»\month«ENDIF»
		«IF day»\day«ENDIF»
		«IF hour»\hour«ENDIF»
		«IF minute»\minute«ENDIF»
		'''
	}
	
	def static compileMatrixQuestion(MatrixQuestion it)  {
		'''
		\begin{paragraph}
		Matrix questions not implemented yet...
		\end{paragraph}
		'''
	}
	def static compileChoiceQuestion(ChoiceQuestion it)  {
		'''
		\choicenumber{«minSelections»}{«maxSelections»}
		\begin{choiceoptions}
		«FOR option : options»
			\option{«option.text»}
		«ENDFOR»
		\end{choiceoptions}
		'''
	}
	def static compileQuestionCondition(QuestionCondition it)  {
		
	}

	
	
	
	def static compileToLatex(Questionaire it) {
		staticStartCode
		staticEndCode
		'''
		«staticStartCode»
		«// TODO: Output it.name and it.email
		»
		«FOR element : elements»
			«IF (element instanceof Heading)»«element.compileHeading»«ENDIF»
			«IF (element instanceof Paragraph)»«element.compileParagraph»«ENDIF»
			«IF (element instanceof Question)»«element.compileQuestion»«ENDIF»
		«ENDFOR»
		«staticEndCode»
		'''
	}
}