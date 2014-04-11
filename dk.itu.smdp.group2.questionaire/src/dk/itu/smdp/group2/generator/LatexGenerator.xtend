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
		\documentclass[a4paper,10pt,BCOR10mm,oneside,headsepline]{scrartcl}
		\usepackage[ngerman]{babel}
		\usepackage[utf8]{inputenc}
		\usepackage{wasysym}% provides \ocircle and \Box
		\usepackage{enumitem}% easy control of topsep and leftmargin for lists
		\usepackage{color}% used for background color
		\usepackage{forloop}% used for \Qrating and \Qlines
		\usepackage{ifthen}% used for \Qitem and \QItem
		\usepackage{typearea}
		\areaset{17cm}{26cm}
		\setlength{\topmargin}{-1cm}
		\usepackage{scrpage2}
		\pagestyle{scrheadings}
		\ihead{Example questionnaire created with \LaTeX}
		\ohead{\pagemark}
		\chead{}
		\cfoot{}
		
		%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		%% Beginning of questionnaire command definitions %%
		%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		%%
		%% 2010, 2012 by Sven Hartenstein
		%% mail@svenhartenstein.de
		%% http://www.svenhartenstein.de
		%%
		%% Please be warned that this is NOT a full-featured framework for
		%% creating (all sorts of) questionnaires. Rather, it is a small
		%% collection of LaTeX commands that I found useful when creating a
		%% questionnaire. Feel free to copy and adjust any parts you like.
		%% Most probably, you will want to change the commands, so that they
		%% fit your taste.
		%%
		%% Also note that I am not a LaTeX expert! Things can very likely be
		%% done much more elegant than I was able to. If you have suggestions
		%% about what can be improved please send me an email. I intend to
		%% add good tipps to my website and to name contributers of course.
		%%
		%% 10/2012: Thanks to karathan for the suggestion to put \noindent
		%% before \rule!
		
		%% \Qq = Questionaire question. Oh, this is just too simple. It helps
		%% making it easy to globally change the appearance of questions.
		\newcommand{\Qq}[1]{\subsection*{#1}}
		
		%% \QO = Circle or box to be ticked. Used both by direct call and by
		%% \Qrating and \Qlist.
		\newcommand{\QO}{$\Box$}% or: $\ocircle$
		
		\newcommand{\Qnum}[2]{\textit{You must choose between #1 and #2 options.}}
		
		%% \Qrating = Automatically create a rating scale with NUM steps, like
		%% this: 0--0--0--0--0.
		\newcounter{qr}
		\newcommand{\Qrating}[1]{\QO\forloop{qr}{1}{\value{qr} < #1}{---\QO}}
		
		%% \Qline = Again, this is very simple. It helps setting the line
		%% thickness globally. Used both by direct call and by \Qlines.
		\newcommand{\Qline}[1]{\noindent\rule{#1}{0.6pt}}
		
		%% \Qlines = Insert NUM lines with width=\linewith. You can change the
		%% \vskip value to adjust the spacing.
		\newcounter{ql}
		\newcommand{\Qlines}[1]{\forloop{ql}{0}{\value{ql}<#1}{\vskip1em\Qline{\linewidth}}}
		
		%% \Qlist = This is an environment very similar to itemize but with
		%% \QO in front of each list item. Useful for classical multiple
		%% choice. Change leftmargin and topsep accourding to your taste.
		\newenvironment{Qlist}{%
		\renewcommand{\labelitemi}{\QO}
		\begin{itemize}[leftmargin=1.5em,topsep=1em]
		}{%
		\end{itemize}
		}
		
		%% \Qtab = A "tabulator simulation". The first argument is the
		%% distance from the left margin. The second argument is content which
		%% is indented within the current row.
		\newlength{\qt}
		\newcommand{\Qtab}[2]{
		\setlength{\qt}{\linewidth}
		\addtolength{\qt}{-#1}
		\hfill\parbox[t]{\qt}{\raggedright #2}
		}
		
		%% \Qitem = Item with automatic numbering. The first optional argument
		%% can be used to create sub-items like 2a, 2b, 2c, ... The item
		%% number is increased if the first argument is omitted or equals 'a'.
		%% You will have to adjust this if you prefer a different numbering
		%% scheme. Adjust topsep and leftmargin as needed.
		\newcounter{itemnummer}
		\newcommand{\Qitem}[2][]{% #1 optional, #2 notwendig
		\ifthenelse{\equal{#1}{}}{\stepcounter{itemnummer}}{}
		\ifthenelse{\equal{#1}{a}}{\stepcounter{itemnummer}}{}
		\begin{enumerate}[topsep=2pt,leftmargin=2.8em]
		\item[\textbf{\arabic{itemnummer}#1.}] #2
		\end{enumerate}
		}
		
		%% \QItem = Like \Qitem but with alternating background color. This
		%% might be error prone as I hard-coded some lengths (-5.25pt and
		%% -3pt)! I do not yet understand why I need them.
		\definecolor{bgodd}{rgb}{0.8,0.8,0.8}
		\definecolor{bgeven}{rgb}{0.9,0.9,0.9}
		\newcounter{itemoddeven}
		\newlength{\gb}
		\newcommand{\QItem}[2][]{% #1 optional, #2 notwendig
		\setlength{\gb}{\linewidth}
		\addtolength{\gb}{-5.25pt}
		\ifthenelse{\equal{\value{itemoddeven}}{0}}{%
		\noindent\colorbox{bgeven}{\hskip-3pt\begin{minipage}{\gb}\Qitem[#1]{#2}\end{minipage}}%
		\stepcounter{itemoddeven}%
		}{%
		\noindent\colorbox{bgodd}{\hskip-3pt\begin{minipage}{\gb}\Qitem[#1]{#2}\end{minipage}}%
		\setcounter{itemoddeven}{0}%
		}
		}
		
		%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		%% End of questionnaire command definitions %%
		%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		
		\begin{document}
		'''
	}
	
	def static staticEndCode() {
		'''
		
		\center{\emph{Thank you for filling out our questionaire.}}
		\end{document}
		'''
	}
	
	/***************************
	 *         Elements        *
	 ***************************/
	
	
	
	def static compileHeading(Heading it)  {
		'''
		\section*{«text»}
		'''
	}
	def static compileParagraph(Paragraph it)  {
		'''
		«text»\\
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
	def static compileTextQuestion(TextQuestion it)  {
		'''
		\Qlines{«lines»}
		'''
	}
	def static compileIntegerQuestion(IntegerQuestion it)  {
		var ArrayList<Integer> numbers = new ArrayList<Integer>() 
		var int i = minValue
		while(i < maxValue){
			numbers.add(i)
			i = i + step
		}
		'''
		\emph{Put an X on the chosen number.}
		«FOR n : numbers»
		(«n»)---
		«ENDFOR»
		(«maxValue»)
		'''
	}
	def static compileCalendarQuestion(CalendarQuestion it)  {
		
	}
	def static compileMatrixQuestion(MatrixQuestion it)  {
		
	}
	def static compileChoiceQuestion(ChoiceQuestion it)  {
		'''
		\Qnum{«minSelections»}{«maxSelections»}
		\begin{Qlist}
		«FOR option : options»
			\item «option.text»
		«ENDFOR»
		\end{Qlist}
		'''
	}
	def static compileQuestionBase(QuestionBase it)  {
		'''
		\Qq{«title»«IF mandatory» *«ENDIF»}
		«IF description != null»«description»«ENDIF»\\
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