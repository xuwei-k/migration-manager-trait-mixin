package com.example

object Main {

  def main(args: Array[String]): Unit = {
    val list = FoldableInstances.vector.toList(Vector(1, 2, 3))
    println(list)
  }

}
