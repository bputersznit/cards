object Suit extends Enumeration {

  protected case class Val(color:String, shape:String) extends super.Val

  implicit def valueToSuit(x:Value): Val = x.asInstanceOf[Val]

  val Club = Val("BLACK","ROUND")
  val Diamond = Val("RED","SHARP")
  val Heart = Val("RED","ROUND")
  val Spade = Val("BLACK","SHARP")

}
