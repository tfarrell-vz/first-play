package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok("Hello, World!")
  }

  def hello(name: String) = Action {
    Ok("Hello " + name)
  }

  def squareIt(num: Int): Int = {
    num * num
  }

  def square(num: String) = Action {
    Ok(squareIt(num.toInt).toString)
  }

}