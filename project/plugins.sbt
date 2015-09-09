lazy val plugins = project in file(".") dependsOn `sbt-rest-rpc` dependsOn `sbt-release`

lazy val `sbt-rest-rpc` = project

addSbtPlugin("com.qifun" % "sbt-haxe" % "1.3.0")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")

// Use a unstable version of sbt-release due to a bug in sbt-release 1.0.1(https://github.com/sbt/sbt-release/pull/122)
lazy val `sbt-release` = RootProject(uri("https://github.com/sbt/sbt-release.git#master"))
