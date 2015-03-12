name := """todolist"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
  "mysql" % "mysql-connector-java" % "5.1.27"
)


fork in run := true

//libraryDependencies ++= Seq(jdbc,anorm,cache,"mysql" % "mysql-connector-java" % "5.1.27")