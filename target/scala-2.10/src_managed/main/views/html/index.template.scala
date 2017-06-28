
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Task],Form[Task],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(tasks: List[Task], taskForm: Form[Task]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.43*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("List to do")/*5.20*/ {_display_(Seq[Any](format.raw/*5.22*/("""


<h2>Nombre de tâches: """),_display_(Seq[Any](/*8.24*/tasks/*8.29*/.size())),format.raw/*8.36*/("""</h2>
<div class="table-responsive">
    <table class="table table-striped">
        <thead>
        <tr>
            <th>id</th>
            <th>Name</th>
            <th>Contenu</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <tbody>

        """),_display_(Seq[Any](/*22.10*/for(task <- tasks) yield /*22.28*/ {_display_(Seq[Any](format.raw/*22.30*/("""
        <tr>
            <td>"""),_display_(Seq[Any](/*24.18*/task/*24.22*/.id)),format.raw/*24.25*/("""</td>
            <td>"""),_display_(Seq[Any](/*25.18*/task/*25.22*/.name)),format.raw/*25.27*/("""</td>
            <td>"""),_display_(Seq[Any](/*26.18*/task/*26.22*/.label)),format.raw/*26.28*/("""</td>
            <td><a"""),_display_(Seq[Any](/*27.20*/form(routes.Application.deleteTask(task.id))/*27.64*/ {_display_(Seq[Any](format.raw/*27.66*/("""
                  <input type="submit" value="Modifier">
                    """)))})),format.raw/*29.22*/("""
            </td>
        
            <td>
                """),_display_(Seq[Any](/*33.18*/form(routes.Application.deleteTask(task.id))/*33.62*/ {_display_(Seq[Any](format.raw/*33.64*/("""
                <input type="submit" value="Suprimer">
                """)))})),format.raw/*35.18*/("""
            </td>
            
        </tr>
        """)))})),format.raw/*39.10*/("""
        </tbody>
    </table>
</div>




<div id="add">
<h2>Tâche </h2>

"""),_display_(Seq[Any](/*50.2*/form(routes.Application.newTask())/*50.36*/ {_display_(Seq[Any](format.raw/*50.38*/("""


<h2>Nom :  </h2>
"""),_display_(Seq[Any](/*54.2*/inputText(taskForm("name")))),format.raw/*54.29*/("""

<h2>Contenu : </h2>
"""),_display_(Seq[Any](/*57.2*/inputText(taskForm("label")))),format.raw/*57.30*/("""

    <div id="ad"><input type="submit" value="ajouter"></div>

""")))})),format.raw/*61.2*/("""

</div>
""")))})))}
    }
    
    def render(tasks:List[Task],taskForm:Form[Task]): play.api.templates.HtmlFormat.Appendable = apply(tasks,taskForm)
    
    def f:((List[Task],Form[Task]) => play.api.templates.HtmlFormat.Appendable) = (tasks,taskForm) => apply(tasks,taskForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 26 00:18:51 CEST 2017
                    SOURCE: /Users/florianeMac/awi/app/views/index.scala.html
                    HASH: b327d8aad99eb5895576f6ed71d57972de9f72a2
                    MATRIX: 789->1|940->42|968->61|1004->63|1030->81|1069->83|1130->109|1143->114|1171->121|1493->407|1527->425|1567->427|1634->458|1647->462|1672->465|1731->488|1744->492|1771->497|1830->520|1843->524|1871->530|1932->555|1985->599|2025->601|2136->680|2234->742|2287->786|2327->788|2432->861|2519->916|2629->991|2672->1025|2712->1027|2768->1048|2817->1075|2875->1098|2925->1126|3021->1191
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|36->8|36->8|36->8|50->22|50->22|50->22|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|57->29|61->33|61->33|61->33|63->35|67->39|78->50|78->50|78->50|82->54|82->54|85->57|85->57|89->61
                    -- GENERATED --
                */
            