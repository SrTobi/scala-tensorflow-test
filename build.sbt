name := "tensorflow-test"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies += "org.platanios" %% "tensorflow" % "0.4.1" classifier "linux-cpu-x86_64"
libraryDependencies += "org.platanios" %% "tensorflow-data" % "0.4.1"