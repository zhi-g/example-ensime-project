package core 
import macros.Macros
import scala.language.experimental.macros

object Hi {
  def main(args: Array[String]) = 
  {
  	println("Hi!")
  	Macros.hello
  	foo
  }
  def foo = println("foo")
}

class Hello {
	Hi.foo
}

object Test extends App {
  Macros.hello
}