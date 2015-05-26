object Hi {
  def main(args: Array[String]) = 
  {
  	println("Hi!")
  	foo
  }
  def foo = println("foo")
}

class Hello {
	Hi.foo
}