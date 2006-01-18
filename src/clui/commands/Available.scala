package sbaz.clui.commands

object Available extends Command {
  val name = "available"
  val oneLineHelp = "list the available packages for installation"
  val fullHelp: String = "XXX"



  def run(args: List[String], settings: Settings) = {
    import settings._

    if(! args.isEmpty)
      usageExit

    val sortedSpecs = dir.available.sortedSpecs 

    for(val spec <- sortedSpecs) {
      Console.println(spec)
    }
    Console.println(sortedSpecs.length.toString() + " packages available")
  }
}
