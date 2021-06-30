fun main(args: Array<String>) {
   println("Welcome to Mad Libraries")
   println("Answer the following questions to help create a new story.")
   val name: String? = askText("Please enter a name:")
   val noun: String? = askText("Please enter a plural noun:")
   val number = askNumber("Please enter a number:")
   val bodyPart: String? = askText("Please enter a body part:")
   val verb: String? = askText("Please enter a verb:")
   tellStory(name, noun, number, bodyPart, verb)
}

fun askText(prompt: String):String?{
     println(prompt)
    val text = readLine()
    return text
}

fun askNumber(prompt:String):Int{
    println(prompt)
    val scan = java.util.Scanner(System.`in`)
    val num = scan.nextInt()
    return num
}

fun tellStory(name: String?, noun: String?, number: Int, bodyPart: String?, verb: String?){

    println("Here's your story:")
    println("The famous explorer " + name + "had nearly given up a life-long quest to find")
    println("The Lost City of " + noun +"found the explorer. ")
    println("Surrounded by" + number + " "+ noun + "." + "a tear came to " + name +"'s "+bodyPart)
    println("After all this time. the quest was finally over. And then. the" + noun)
    println("promptly devoured" + name + "The moral of the story? Be careful what you. " + verb + "for")
}