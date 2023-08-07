val scala3Version = "3.3.0"

val ZIO_VERSION = "2.0.15"

lazy val root = project
  .in(file("."))
  .settings(
    name := "$name$",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % ZIO_VERSION,
      "dev.zio" %% "zio-test" % ZIO_VERSION % Test,
      "dev.zio" %% "zio-test-sbt" % ZIO_VERSION % Test
    )
  )
