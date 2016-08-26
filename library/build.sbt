val commonSettings = Seq(
  organization := "com.example",
  scalaVersion := "2.12.0-M5",
  name := "foldable"
)

val foldableV1 = project.settings(
  commonSettings,
  version := "0.1" 
)

val foldableV2 = project.settings(
  commonSettings,
  mimaPreviousArtifacts := Set(organization.value % s"${name.value}_2.12.0-M5" % "0.1"),
  version := "0.2"
)
