resolvers ++= Seq(
  Resolver.url("aliyun", url("http://maven.aliyun.com/nexus/content/groups/public/")),
  Resolver.url("Sonatype snapshots",url("http://oss.sonatype.org/content/repositories/snapshots/")),
  Resolver.mavenLocal,
  Classpaths.typesafeResolver,
  Resolver.url("sbt-plugin-releases", new URL("http://dl.bintray.com/sbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)
)

addSbtPlugin("com.jsuereth" % "xsbt-gpg-plugin" % "0.6")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.1.0")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse" % "2.1.0")

addSbtPlugin("com.eed3si9n" %% "sbt-assembly" % "0.9.2")
