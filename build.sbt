import _root_.sbt.Keys._
import xerial.sbt.Pack.packSettings

name := "kafkaReader"

version := "1.0"

scalaVersion := "2.10.0"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "org.apache.kafka" % "kafka_2.10" % "0.8.1.1"

libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.7.2"

excludeFilter in unmanagedResources := "*"

packSettings

packMain := Map("kafkaReaer" -> "iBuddha.kafka.Read")

packResourceDir += (baseDirectory.value / "src/main/resources" -> "conf")
