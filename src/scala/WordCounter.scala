package scala

class WordCounter {

  def getCountPerWord(inputString:String):Seq[(String, Int)]={
    return removePunctuation(inputString).split("\\s").groupBy(identity).mapValues(x=>x.size).toSeq
  }

  def isPunctuation(character:Char):Boolean={
    val punctuators = List(',','.',';')
    return punctuators.contains(character)
  }

  def removePunctuation(string:String):String={
    return string.filterNot(x=>(isPunctuation(x)))
  }

}

