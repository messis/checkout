package co

import util.Properties

object COApp extends App {
  val port = Properties.envOrElse("PORT", "5000").toInt

  unfiltered.jetty.Http(port).plan(new COPlan).run()
}
