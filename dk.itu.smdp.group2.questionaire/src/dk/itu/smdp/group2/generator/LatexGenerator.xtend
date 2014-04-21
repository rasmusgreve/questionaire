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
		%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		%                                                  %
		%            Based on LaTeX styles by              %
		%        Miriam Dieter & Anja Zwingenberger        %
		%          University of Duisburg-Essen            %
		%                                                  %
		% Available at http://www.qdds.de/index.php?id=129 %
		%                                                  %
		%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		
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
		\newcommand{\bigintegeranswer}[3]{
		\textit{You must write a number between #1 and #2 (both inclusive)\ifthenelse{#3 > 1}{ on a #3-step scale}{}.}\par\vspace{.2cm}
		\numberBoxes{#2}}
		\newcounter{nbC}
		\newcommand{\numberBoxes}[1]{
		\setcounter{nbC}{#1 /10}
		\bbox %
		\ifthenelse{\value{nbC}>0}{\numberBoxes{\value{nbC}}}{}
		}
		
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
		\newcounter{lineC}
		\newcommand{\matrixline}[2]{#2\vspace{0.2cm}& \forloop{lineC}{0}{\value{lineC}<#1}{\centering$\Box$ & }\\}
		
		
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
	
	def static linebreaks(String it)
	{
		if (it == null) null else
		replaceAll("\r","").replaceAll("\n","\\\\\\\\")
	}	
	
	def static compileHeading(Heading it)  {
		'''
		\heading{«linebreaks(text)»}
		'''
	}
	def static compileParagraph(Paragraph it)  {
		'''
		\begin{paragraph}
		«linebreaks(text)»
		\end{paragraph}
		'''
	}


	def static compileQuestion(Question it)  {
		'''
		%%«it.class.name»
		«questionBase.compileQuestionBase»
		«IF (it instanceof TextQuestion)»«compileTextQuestion(it as TextQuestion)»«ENDIF»
		«IF (it instanceof IntegerQuestion)»«compileIntegerQuestion(it as IntegerQuestion)»«ENDIF»
		«IF (it instanceof CalendarQuestion)»«compileCalendarQuestion(it as CalendarQuestion)»«ENDIF»
		«IF (it instanceof MatrixQuestion)»«compileMatrixQuestion(it as MatrixQuestion)»«ENDIF»
		«IF (it instanceof ChoiceQuestion)»«compileChoiceQuestion(it as ChoiceQuestion)»«ENDIF»
		'''
	}
	def static compileQuestionBase(QuestionBase it)  {
		'''
		\question{«linebreaks(title)»«IF mandatory» *«ENDIF»«IF description != null»\\«linebreaks(description)»«ENDIF»}
		'''
	}
	def static compileTextQuestion(TextQuestion it)  {
		'''
		\textanswer{«lines»}
		'''
	}
	def static compileIntegerQuestion(IntegerQuestion it)  {
		'''
		«IF (maxValue - minValue)/step+1 > 100»
		\bigintegeranswer{«minValue»}{«maxValue»}{«step»}
		«ELSEIF (maxValue - minValue)/step+1 > 20»
		\integeranswer{«minValue»}{«minValue+(19*step)»}{«step»}
		«minValue = minValue+(20*step)»
		«compileIntegerQuestion»
		«ELSE»
		\integeranswer{«minValue»}{«maxValue»}{«step»}
		«ENDIF»
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
		\vspace{0.5cm}
		\begin{tabular}{p{4.7cm}*{«columnNames.length»}{p{«Math.round(1000.0/columnNames.length)/100.0»cm}}p{0.000001cm}}
		&«FOR c : columnNames»\centering «linebreaks(c)»&«ENDFOR»\\
		«FOR row : rowNames»
		\matrixline{«columnNames.length»}{«linebreaks(row)»}
		«ENDFOR»
		\end{tabular}
		\vspace{0.5cm}
		'''
	}
	def static compileChoiceQuestion(ChoiceQuestion it)  {
		'''
		\choicenumber{«minSelections»}{«maxSelections»}
		\begin{choiceoptions}
		«FOR option : options»
			\option{«linebreaks(option.text)»}
		«ENDFOR»
		\end{choiceoptions}
		'''
	}
	def static compileQuestionCondition(QuestionCondition it)  {
		
	}

	
	
	
	def static compileToLatex(Questionaire it) {
		'''
		«staticStartCode»
		«// TODO: Output it.name and it.email
		»
		«FOR element : elements»
			«IF (element instanceof Heading)»«compileHeading(element as Heading)»«ENDIF»
			«IF (element instanceof Paragraph)»«compileParagraph(element as Paragraph)»«ENDIF»
			«IF (element instanceof Question)»«compileQuestion(element as Question)»«ENDIF»
		«ENDFOR»
		«staticEndCode»
		'''
	}
}