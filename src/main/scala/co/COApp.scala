package co

object COApp extends App {
  unfiltered.jetty.Http(1337).plan(new COPlan).run()
}
