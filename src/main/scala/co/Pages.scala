package co

import xml.NodeSeq

object Pages {

  def index = template(
    <!-- Main hero unit for a primary marketing message or call to action -->
      <div class="hero-unit">
        <h1>checkout!</h1>
        <p>
          <it>checkout</it>
          is a simple tool to remember stuff you need to (you guesed it)
          <b>check out!</b>
        </p>
        <!--p>
              <a class="btn btn-primary btn-large">Learn more
                &raquo;
              </a>
            </p-->
      </div>
  )

  def about = template(
    <!-- Main hero unit for a primary marketing message or call to action -->
      <div class="hero-unit">
        <h1>about</h1>
        <p>
          <it>checkout</it>
          is a pet project to check out
          <a href="www,scala.org" target="_blank">Scala</a>,
          <a href="unfiltered.databinder.net" target="_blank">Unfiltered</a>,
          <a href="twitter.github.com/bootstrap" target="_blank">Bootstrap</a>,
          <a href="http://ethanmarcotte.com" target="_blank">Responsive Web design</a>,
          and
          <a href="www.mongodb.org" target="_blank">MongoDB</a>
          on
          <a href="www.heroku.com/" target="_blank">Heroku</a>.
        </p>
        <p>
          This work is indeed in progress. Currently the MongoDB-stuff is not present hence no dynamics. And the Bootstrap default template is not that mobile friendly. But time will show.
        </p>
        <p>
          Code on <a href="github.com/messis/checkout" target="_blank">github</a>.
        </p>
        <!--p>
              <a class="btn btn-primary btn-large">Learn more
                &raquo;
              </a>
            </p-->
      </div>
  )

  def contact = template(
    <!-- Main hero unit for a primary marketing message or call to action -->
      <div class="hero-unit">
        <h1>contact</h1>
        <p></p>
        <p>
          <a href="twitter.com/messis" target="_blank">twitter.com/messis</a>
        </p>
        <p>
          <a href="github.com/messis" target="_blank">github.com/messis</a>
        </p>
      </div>
  )

  def template(content: NodeSeq) = {
    <html lang="en">
      <head>
        <meta charset="utf-8"/>
        <title>Bootstrap, from Twitter</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <meta name="description" content=" "/>
        <meta name="author" content=" "/>

        <!-- Le styles -->
        <link href="/css/bootstrap.css" rel="stylesheet"/>
        <style type="text/css">body
          {"""padding - top: 60 px;padding - bottom: 40 px;"""}
        </style>
        <link href="../css/bootstrap-responsive.css" rel="stylesheet"/>

        <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
                <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
                <![endif]-->

        <!-- Le fav and touch icons -->
        <link rel="shortcut icon" href="http://twitter.github.com/bootstrap/assets/ico/favicon.ico"/>
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="http://twitter.github.com/bootstrap/assets/ico/apple-touch-icon-144-precomposed.png"/>
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="http://twitter.github.com/bootstrap/assets/ico/apple-touch-icon-114-precomposed.png"/>
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="http://twitter.github.com/bootstrap/assets/ico/apple-touch-icon-72-precomposed.png"/>
        <link rel="apple-touch-icon-precomposed" href="http://twitter.github.com/bootstrap/assets/ico/apple-touch-icon-57-precomposed.png"/>
        <script type="text/javascript">
          {"""
            var _gaq = _gaq || [];
            _gaq.push(['_setAccount', 'UA-34868343-1']);
            _gaq.push(['_trackPageview']);

            (function() {
            var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
            ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
            var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
            })();
          """}
        </script>

      </head>

      <body>

        <div class="navbar navbar-inverse navbar-fixed-top">
          <div class="navbar-inner">
            <div class="container">
              <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </a>
              <a class="brand" href="/">checkout</a>
              <div class="nav-collapse collapse">
                <ul class="nav">
                  <li>
                    <a href="/about">About</a>
                  </li>
                  <li>
                    <a href="/contact">Contact</a>
                  </li>
                  <!--
                  <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown
                      <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                      <li>
                        <a href="#">Action</a>
                      </li>
                      <li>
                        <a href="#">Another action</a>
                      </li>
                      <li>
                        <a href="#">Something else here</a>
                      </li>
                      <li class="divider"></li>
                      <li class="nav-header">Nav header</li>
                      <li>
                        <a href="#">Separated link</a>
                      </li>
                      <li>
                        <a href="#">One more separated link</a>
                      </li>
                    </ul>
                  </li>
                  -->
                </ul>
                <form class="navbar-form pull-right">
                  <input class="span2" type="text" placeholder="Email"/>
                  <input class="span2" type="password" placeholder="Password"/>
                  <button type="submit" class="btn">Sign in</button>
                </form>
              </div> <!--/.nav-collapse -->
            </div>
          </div>
        </div>


        <div class="container">

          {content}<!-- Example row of columns -->
          <!--
          <div class="row">
            <div class="span4">
              <h2>Heading</h2>
              <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.</p>
              <p>
                <a class="btn" href="#">View details
                  &raquo;
                </a>
              </p>
            </div>
            <div class="span4">
              <h2>Heading</h2>
              <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.</p>
              <p>
                <a class="btn" href="#">View details
                  &raquo;
                </a>
              </p>
            </div>
            <div class="span4">
              <h2>Heading</h2>
              <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
              <p>
                <a class="btn" href="#">View details
                  &raquo;
                </a>
              </p>
            </div>
          </div>
          -->
          <hr/>

          <footer>
            <p>
              &copy;
              checkout 2012</p>
          </footer>

        </div> <!-- /container -->

        <!-- Le javascript ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="http://twitter.github.com/bootstrap/assets/js/jquery.js"></script>
        <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-transition.js"></script>
        <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-alert.js"></script>
        <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-modal.js"></script>
        <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-dropdown.js"></script>
        <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-scrollspy.js"></script>
        <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-tab.js"></script>
        <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-tooltip.js"></script>
        <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-popover.js"></script>
        <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-button.js"></script>
        <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-collapse.js"></script>
        <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-carousel.js"></script>
        <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-typeahead.js"></script>

      </body>
    </html>


  }
}
