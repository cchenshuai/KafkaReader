resolvers += Resolver.url("http://repo1.maven.org/maven2/org/xerial/sbt/")

addSbtPlugin("org.xerial.sbt" % "sbt-pack" % "0.6.0") // for sbt-0.13.x or higher

logLevel := Level.Warn
