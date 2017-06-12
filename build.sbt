import Settings._

name := "ssc"

version := "0.1-SNAPSHOT"

organization := "com.github.chengpohi"

scalaVersion := "2.12.1"

unmanagedBase := baseDirectory.value / "lib"

resolvers += Resolver.mavenLocal

resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"

//mainClass in Compile := Some("com.github.chengpohi.repl.ELKRepl")

libraryDependencies ++= dependencies

enablePlugins(JavaAppPackaging)


lazy val compileScalaStyle = taskKey[Unit]("compileScalastyle")

compileScalaStyle := org.scalastyle.sbt.ScalastylePlugin.scalastyle
  .in(Compile)
  .toTask("")
  .value

(scalastyleConfig in Compile) := file("project/scalastyle-config.xml")
(scalastyleConfig in Test) := file("project/scalastyle-test-config.xml")

(compile in Compile) <<= (compile in Compile) dependsOn compileScalaStyle
(test in Test) := {
  (test in Test) dependsOn compileScalaStyle
}
