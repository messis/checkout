package co

import unfiltered.filter.Plan
import unfiltered.request.{Seg, Path, GET}
import unfiltered.response._
import unfiltered.response.Html5

class COPlan extends Plan {
  def intent = {
    case GET(Path("/")) => Html5(Pages.index)
    case GET(Path("/about")) => Html5(Pages.about)
    case GET(Path(Seg("img" :: _ :: Nil)) | Path(Seg("css" :: _ :: Nil)) | Path(Seg("js" :: _ :: Nil)) | Path(Seg("favicon.ico" :: Nil)) | Path(Seg("robots.txt" :: Nil))) => Pass
    case GET(_) => NotFound ~> Html5(<h1>Page not found</h1>)
  }

}
