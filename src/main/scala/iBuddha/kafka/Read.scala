package iBuddha.kafka

import java.util
import java.util.Scanner

import scala.collection.JavaConversions._

/**
 * Created by xhuang on 1/5/15.
 */
object Read extends App {
  val scanner = new Scanner(System.in)
  println("enter broker port")
  val port = scanner.nextLine().trim().toInt
  var finished = false
  val brokers = new util.ArrayList[String]()
  while (!finished) {
    println("enter broker ip")
    val ip = scanner.nextLine().trim
    brokers.add(ip)
    println("finish enter broker ip? (y/n)")
    val yn = scanner.nextLine.trim
    if (yn.equalsIgnoreCase("y"))
      finished = true
  }
  while (true) {
    println("enter topic")
    val topic = scanner.nextLine().trim;
    println("enter partition")
    val partition = scanner.nextLine().trim().toInt
    println("enter start offset")
    val startOffset = scanner.nextLine().trim().toLong
    println("enter end offset")
    val endOffset = scanner.nextLine().trim.toLong
    println("wait ....")
    val api = new KafkaSimpleApi();
    val messagesAndOffset = api.getMessagesAndOffsetsBetween(startOffset, endOffset, topic, partition, brokers, port)
    printMessages(messagesAndOffset)
    println("continue fetch messages? (y/n)")
    val yn = scanner.nextLine.trim
    if(!yn.equalsIgnoreCase("y")){
      println("bye")
      System.exit(0)
    }
  }


  def printMessages(messages: util.Map[java.lang.Long, Array[Byte]]): Unit = {
    messages.foreach { e =>
      val offset = e._1
      val message = new String(e._2)
      println(s"offset: $offset\n$message")
    }
  }
}
