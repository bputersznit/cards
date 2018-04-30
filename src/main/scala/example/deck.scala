sealed abstract class SuitColor
case object Red extends SuiteColor
case object Black extends SuiteColor

sealed abstract class SuitShape
case object Sharp extends SuitShape
case object Round extends SuitShape

sealed abstract class Suit(val color:SuitColor, val shape:SuitShape)
case object Club(Red,Round) extends Suit
