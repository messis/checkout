package co

object COApp extends App {
  unfiltered.jetty.Http(5000).plan(new COPlan).run()
}
