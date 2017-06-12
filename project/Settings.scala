import sbt._

object Settings {
  lazy val dependencies = Seq(
    "org.scalatest" %% "scalatest" % "3.0.1" % "test",
    "org.scalactic" %% "scalactic" % "3.0.1",
    "com.typesafe" % "config" % "1.3.0",
    "com.lihaoyi" %% "fastparse" % "0.4.2",
    "jline" % "jline" % "2.12",
    "org.json4s" %% "json4s-native" % "3.5.0",
    "org.json4s" %% "json4s-jackson" % "3.5.0",
    "org.apache.commons" % "commons-lang3" % "3.5"
  )
}
