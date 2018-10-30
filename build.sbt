name := "sbt-trial"

version := "0.1"

scalaVersion := "2.12.7"

// enablePlugins(ScalaJSBundlerPlugin)
enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"
scalaVersion := "2.12.6" // or any other Scala version >= 2.10.2

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

// npmDependencies in Compile += "snabbdom" -> "0.5.3"

// libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.6"
