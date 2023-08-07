val scala3Version = "3.3.0"
val zioVersion = "$zio_version$"

lazy val root = project
  .in(file("."))
  .settings(
    name := "$name$",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % zioVersion,
      "dev.zio" %% "zio-test" % zioVersion % Test,
      "dev.zio" %% "zio-test-sbt" % zioVersion % Test
    )
  )
