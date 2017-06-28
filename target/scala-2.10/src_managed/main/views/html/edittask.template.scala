
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object edittask extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Task],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, taskForm: Form[Task]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.34*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Edit Task")/*4.19*/ {_display_(Seq[Any](format.raw/*4.21*/("""
	<h1> Edit task </h1>
	"""),_display_(Seq[Any](/*6.3*/form(routes.Application.update(id))/*6.38*/ {_display_(Seq[Any](format.raw/*6.40*/("""

		"""),_display_(Seq[Any](/*8.4*/inputText(taskForm("label")))),format.raw/*8.32*/("""
		"""),_display_(Seq[Any](/*9.4*/inputText(taskForm("name")))),format.raw/*9.31*/("""
		
		<input type="submit" value="Save">


		<a href=""""),_display_(Seq[Any](/*14.13*/routes/*14.19*/.Application.index)),format.raw/*14.37*/("""">Cancel</a>
	""")))})),format.raw/*15.3*/("""
""")))})),format.raw/*16.2*/("""
"""))}
    }
    
    def render(id:Long,taskForm:Form[Task]): play.api.templates.HtmlFormat.Appendable = apply(id,taskForm)
    
    def f:((Long,Form[Task]) => play.api.templates.HtmlFormat.Appendable) = (id,taskForm) => apply(id,taskForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 27 22:48:48 CEST 2017
                    SOURCE: /Users/florianeMac/awi/app/views/edittask.scala.html
                    HASH: a9721894ae8f8a677b5ae9f736d9e2f02eb14bf3
                    MATRIX: 786->1|928->33|955->51|991->53|1016->70|1055->72|1114->97|1157->132|1196->134|1235->139|1284->167|1322->171|1370->198|1461->253|1476->259|1516->277|1562->292|1595->294
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|34->6|34->6|34->6|36->8|36->8|37->9|37->9|42->14|42->14|42->14|43->15|44->16
                    -- GENERATED --
                */
            