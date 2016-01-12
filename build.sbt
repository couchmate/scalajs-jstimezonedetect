lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

name := "ScalaJS Facade for jsTimeZoneDetect"

normalizedName := "scalajs-jstimezonedetect"

version := "0.0.1"

organization := "com.couchmate"

scalaVersion := "2.11.7"

libraryDependencies +=
  "org.webjars" % "jstimezonedetect" % "1.0.6"

jsDependencies +=
  "org.webjars" % "jstimezonedetect" % "1.0.6" / "jstz.min.js"
