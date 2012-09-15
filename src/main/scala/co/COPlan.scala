package co

import unfiltered.filter.Plan
import unfiltered.request.GET
import unfiltered.response.{Html5, HtmlContent, ResponseString}

class COPlan extends Plan {
  def intent = {
    case GET(_) => Html5(Pages.index)
  }
}
