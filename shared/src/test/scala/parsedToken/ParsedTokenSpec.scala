package edu.furman.classics.citeAnalyzedTokens
import org.scalatest.FlatSpec
import edu.holycross.shot.cite._

/**
  urn: Cite2Urn,
    label: String,
    passage: CtsUrn,
    token: String,
    lexeme: Cite2Urn,
    form: Cite2Urn,
    category: Cite2Urn,
    sequence: Int
*/


/**
*/
class ParsedTokenSpec extends FlatSpec {

  // Good params
  val urn = Cite2Urn("urn:cite2:testToken:coll.v:1")
  val label = "testToken"
  val passage = CtsUrn("urn:cts:testNS:g.w.v:1.1.1")
  val token = "μῆνιν"
  val lexeme = Cite2Urn("urn:cite2:hmt:lsj.chicago_md:n67485")
  val form = Cite2Urn("urn:cite2:testForm:coll.v:xxx")
  val category = Cite2Urn("urn:cite2:testCat:coll.v:1")
  val sequence = 1

  "A ParsedToken" should "compile and test" in {
    assert(true)
  }

  it should "construct a ParsedToken object" in {

      val pf = ParsedToken(urn, label, passage, token, lexeme, form, category, sequence)

  }

  it should "fail if the passage CtsUrn is not at the version or exemplar level" in {
      val workUrn = CtsUrn("urn:cts:testNS:g.w:1.1.1")
      val versionUrn = CtsUrn("urn:cts:testNS:g.w.v:1.1.1")
      val exemplarUrn = CtsUrn("urn:cts:testNS:g.w.v.e:1.1.1")

      assertThrows[java.lang.IllegalArgumentException] {
        val pf = ParsedToken(
          urn, label, workUrn, token, lexeme, form, category, sequence
        )
      }

      val pf2 = ParsedToken(
          urn, label, versionUrn, token, lexeme, form, category, sequence
      )

      val pf3 = ParsedToken(
          urn, label, exemplarUrn, token, lexeme, form, category, sequence
      )

  }

  it should "fail if there is no passage component in the CtsUrn" in {

    val noPassage = CtsUrn("urn:cts:testNS:g.w.v:")

    assertThrows[java.lang.IllegalArgumentException] {
      val pf = ParsedToken(
        urn, label, noPassage, token, lexeme, form, category, sequence
      )
    }
  }

}
