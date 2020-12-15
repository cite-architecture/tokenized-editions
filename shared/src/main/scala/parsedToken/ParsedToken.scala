package edu.furman.classics.citeAnalyzedTokens

import edu.holycross.shot.cite._

import scala.collection.mutable.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.annotation._

import edu.holycross.shot.cex._

/** Class for a Parsed Token
*
* @param collections Defintions of structure of individual collections.
*/
@JSExportAll  case class ParsedToken(
    urn: Cite2Urn,
    label: String,
    passage: CtsUrn,
    token: String,
    lexeme: Cite2Urn,
    form: Cite2Urn,
    category: Cite2Urn,
    sequence: Int
) {

  override def toString = {
    s"Parsed token: ${this.label}"
  }

  // The passage must be at the version- or exemplar-level
  require( passage.isVersion | passage.isExemplar )

  // The passage must have a passage, and not be a range
  require( passage.citationDepth.size == 1)

}

/** Object providing factory methods for
* creating ParsedToken instances from various
* kinds of sources.
*/
object ParsedToken {

  
}
