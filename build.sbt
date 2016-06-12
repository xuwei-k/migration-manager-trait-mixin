val commonSettings = Seq(
  scalaVersion := "2.11.8"
)

val sampleLibrary = project.settings(
  commonSettings,
  libraryDependencies += "com.example" %% "foldable" % "0.1"
)

val sampleMain = project.settings(
  commonSettings,
  libraryDependencies += "com.example" %% "foldable" % "0.2"
).dependsOn(
  sampleLibrary
)
