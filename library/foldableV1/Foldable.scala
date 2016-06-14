package com.example

abstract class Foldable[F[_]]{
  def foldLeft[A, B](fa: F[A], z: B)(f: (B, A) => B): B
}
