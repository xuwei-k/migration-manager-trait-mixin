package com.example

object FoldableInstances {
  val vector = new Foldable[Vector] {
    def foldLeft[A, B](fa: Vector[A], z: B)(f: (B, A) => B): B =
      fa.foldLeft(z)(f)
  }
}
