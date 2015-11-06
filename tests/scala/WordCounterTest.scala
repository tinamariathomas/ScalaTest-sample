package scala

import org.scalatest.FunSuite
import org.scalatest.matchers.Matchers

class WordCounterTest extends FunSuite with Matchers {

  test("full stop is punctuation") {
    val wordCounter = new WordCounter();
    assert(wordCounter.isPunctuation('.') == true)
  }

  test("alphabet is not punctuation") {
    val wordCounter = new WordCounter();
    assert(wordCounter.isPunctuation('.') == true)
  }

  test("remove punctuations from string") {
    val wordCounter = new WordCounter();
    val inputString = "Hello how are you."
    val expectedOutputString = "Hello how are you"
    assert(wordCounter.removePunctuation(inputString) == expectedOutputString)
  }

  test("get Count Per Word") {
    val wordCounter = new WordCounter();
    val inputString = "Hello hi Hello."
    val expectedOutput = Map("Hello" -> 2, "hi" -> 1).toSeq
    assert(wordCounter.getCountPerWord(inputString) == expectedOutput)
  }

}
