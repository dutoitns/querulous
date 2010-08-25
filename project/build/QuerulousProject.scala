import sbt._
import com.twitter.sbt.StandardProject


class QuerulousProject(info: ProjectInfo) extends StandardProject(info) {
  val vscaladoc = "org.scala-tools" % "vscaladoc" % "1.1-md-3"
  val configgy  = "net.lag" % "configgy" % "1.5.2"
  val dbcp      = "commons-dbcp" % "commons-dbcp" % "1.4"
  val mysqljdbc = "mysql" % "mysql-connector-java" % "5.1.6"
  val pool      = "commons-pool" % "commons-pool" % "1.5.4"
  val util      = "com.twitter" % "util" % "1.1-SNAPSHOT"

  val hamcrest  = "org.hamcrest" % "hamcrest-all" % "1.1" % "test"
  val specs     = "org.scala-tools.testing" % "specs" % "1.6.2.1" % "test"
  val objenesis = "org.objenesis" % "objenesis" % "1.1" % "test"
  val jmock     = "org.jmock" % "jmock" % "2.4.0" % "test"
  val cglib     = "cglib" % "cglib" % "2.1_3" % "test"
  val asm       = "asm" % "asm" %  "1.5.3" % "test"

  override def pomExtra =
    <licenses>
      <license>
        <name>Apache 2</name>
        <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
        <distribution>repo</distribution>
      </license>
    </licenses>

  Credentials(Path.userHome / ".ivy2" / "credentials", log)
  val publishTo = "nexus" at "http://nexus.scala-tools.org/content/repositories/releases/"
}
