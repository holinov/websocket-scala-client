import sbt.Keys._
import sbt.{Defaults, Opts, _}

object BuildSettings {

  val projectId = "websocket-scala-client"

  lazy val coreSettings = Defaults.coreDefaultSettings ++ Seq(
    organization := "com.github.andyglow",

    scalaVersion := "2.12.8",
    crossScalaVersions := Seq("2.11.12", "2.12.10"),

    scalacOptions in Compile        ++= Seq("-unchecked", "-deprecation", "-Ywarn-unused-import"),
    scalacOptions in (Compile, doc) ++= Seq("-unchecked", "-deprecation", "-implicits", "-skip-packages", "samples"),
    scalacOptions in (Compile, doc) ++= Opts.doc.title("Websocket Scala Client"),

    libraryDependencies ++= Dependencies.all

  ) ++ Bintray.settings
}
