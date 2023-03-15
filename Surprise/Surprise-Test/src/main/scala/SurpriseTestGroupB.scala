// capitalize a particular character in the string and also display the count of that character in that string.

object SurpriseTestGroupB extends App{

  private def characterCapitalization(user_String: String, character: String ): String = {

    user_String.replace(character, character.toUpperCase())

  }

  private def countCharacter(new_string: String, character_to_be_counted: String): Unit= {

//    new_string.count(character_to_be_counted)
  }

  private val string = scala.io.StdIn.readLine()
  private val character = scala.io.StdIn.readLine()
  private val capitalize_Character_String =  characterCapitalization(string, character)

  println(capitalize_Character_String)
  println(countCharacter(capitalize_Character_String.toLowerCase(),character))

}
