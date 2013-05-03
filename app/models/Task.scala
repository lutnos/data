package models

/**
 * Created with IntelliJ IDEA.
 * User: dave
 * Date: 03/05/2013
 * Time: 10:58
 * Task model
 */

case class Task(id: Long, label: String)

object Task {

  def all(): List[Task] = Nil

  def create(label: String) {}

  def delete(id: Long) {}

}
