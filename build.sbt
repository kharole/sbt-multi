lazy val root = Project(id = "hello",
  base = file(".")) aggregate(foo, bar) dependsOn(foo, bar)

// sub-project in the Foo subdirectory
lazy val foo = Project(id = "hello-foo",
  base = file("Foo"))

// sub-project in the Bar subdirectory
lazy val bar = Project(id = "hello-bar",
  base = file("Bar"))


name := "sbt-multi"

version := "1.0"

scalaVersion := "2.12.2"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"