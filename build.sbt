name := """play-example"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)

maintainer in Linux := "Foo Bar <foo.bar@example.com>"

packageSummary in Linux := "Example application"

packageDescription := "My longer package description"
