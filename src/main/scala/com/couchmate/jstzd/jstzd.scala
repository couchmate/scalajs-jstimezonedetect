package com.couchmate.jstzd

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("jstz")
object JSTZ extends js.Object {
  def determine(): Timezone = js.native
}

@js.native
trait Timezone extends js.Object {
  def name(): String = js.native
}