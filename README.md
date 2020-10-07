# `citeTokenizedEditions`

## What it is

`citeTokenizedEditions` is…

## Current version: 0.1.0

Status:  in active development.  See [release notes](releases.md)

## License

[GPL 3.0](https://opensource.org/licenses/gpl-3.0.html)


## Documentation

See <https://cite-architecture.github.io/citeTokenizedEditions/> for any formal documentation.

For development notes, see these [**in progress notes** on design and functionality](dev_notes.md).

## Using, building, testing

`citeTokenizedEditions` is compiled for both the JVM and ScalaJS using scala versions 2.11 and 2.12.  Due to a dependency on `scala-xml`, the JVM builds cannot be used with Scala 2.10.  ScalaJS builds can be compiled for 2.10 as well as 2.11 and 2.12.

Binaries for all platforms are available from jcenter.

If you are using sbt, include Resolver.jcenterRepo in your list of resolvers

    resolvers += Resolver.jcenterRepo

and add this to your library dependencies:

    "edu.furman.classics" %%% "citeTokenizedEditions" % VERSION

For maven, ivy or gradle equivalents, refer to <https://bintray.com/eumaeus/maven/citeTokenizedEditions>.

To build from source and test, use normal `sbt` commands (`compile`, `test` ...).
