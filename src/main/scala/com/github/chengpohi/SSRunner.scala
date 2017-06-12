package com.github.chengpohi

object SSRunner {
  import scala.sys.process._
  def main(args: Array[String]): Unit = {
    if (args.isEmpty) {
      Console.err.println("Usage:ss file.ss")
      System.exit(-1)
    }
    val p = s"scala ${args.head}".run()
    p.exitValue()
  }
}
