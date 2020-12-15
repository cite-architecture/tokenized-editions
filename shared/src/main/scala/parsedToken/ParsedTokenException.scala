package edu.furman.edu




package citeAnalyzedTokens {

  import scala.scalajs.js
  import scala.scalajs.js.annotation._

  /** Extension for exceptions specific to the `citeobj` package.
  */
  @JSExportAll  case class ParsedTokenException(message: String = "", cause: Option[Throwable] = None) extends Exception(message) {
    cause.foreach(initCause)
  }

}
