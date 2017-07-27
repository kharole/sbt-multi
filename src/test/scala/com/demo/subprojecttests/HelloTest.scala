package com.demo.subprojecttests

import com.demo.bar.Bar
import com.demo.foo.Foo
import org.scalatest.FunSuite

class HelloTest extends FunSuite {

  test("the Foo name is set correctly") {
    val f = Foo("Foo")
    assert(f.name == "Foo")
  }

  test("the Bar name is set correctly") {
    val b = Bar("Bar")
    assert(b.name == "Bar")
  }

}