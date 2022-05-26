/**
 * This file has already imported
 * import sbt._
 * import Process._
 * import Keys._
 */

/**
 * These are `Setting`s
 * SettingKey[T] evaluated once when SBT starts (or with reload command)
 * TaskKey[T] is evaluated every time a command is run
 * InputKey[T] is for tasks taking arguments (e.g. testOnly *.SomeSpec)
 */
ThisBuild / organization := "com.theguardian"
ThisBuild / name := "understanding-sbt"
ThisBuild / licenses += "Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")
ThisBuild / libraryDependencies += "org.typelevel" %% "cats-core" % "1.0.0-RC1"

/**
 * Lifecycle:
 * - compile scala code (this)
 * - create build definition
 * - create build execution plan (a task graph modelling deps between tasks)
 * - run the build
 */

/**
 * Glossary
 * - build definition: A set of projects containing settings
 * -
 */

lazy val common = project
lazy val lib = project.dependsOn(common)
lazy val app = project.dependsOn(common, lib)
