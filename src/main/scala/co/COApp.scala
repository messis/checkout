package co

object COApp extends App {
  unfiltered.jetty.Http(19901).plan(new COPlan).run()
}
