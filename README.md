# build.sbt

`project` is not part of your project code. It's the build.
Or more specifically the build project.

It is also recursive, so `project/project` works just fine!
This will compile any children first before compiling the parent.

Uses? No idea, [but here's some examples](https://www.scala-sbt.org/1.x/docs/Organizing-Build.html).

If this can't compile, SBT will not start.

# Source directories
https://www.scala-sbt.org/1.x/docs/Directories.html

# Scala new

https://www.scala-sbt.org/1.x/docs/sbt-new-and-Templates.html