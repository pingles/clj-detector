# clj-detector

Clojure interface to the UADetector `User-Agent` analyser.

## Usage

Add `clj-detector` to your project.clj. You'll also need to reference the
`uadetector-resources` release you'd like to use. For example:

```clojure
:dependencies [[clj-detector "0.0.3"]
               [net.sf.uadetector/uadetector-resources "2014.10"]]
```

You can then parse a string with the `user-agent` function:

```clojure
(ns example
  (:require [clj-detector.core :as ua]))

; windows desktop
(ua/user-agent "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.0; WOW64; SLCC1; .NET CLR 2.0.50727; Media Center PC 5.0; .NET CLR 3.5.21022; .NET CLR 3.5.30729; .NET CLR 3.0.30618; MDDC; .NET4.0C; InfoPath.2; BRI/2)")
{:name "IE",
 :producer "Microsoft Corporation.",
 :type :browser,
 :version "7.0",
 :device :pc,
 :os {:name "Windows Vista", :family "Windows", :version "6.0"}}

; ipad
(ua/user-agent "Mozilla/5.0 (iPad; CPU OS 7_0_4 like Mac OS X) AppleWebKit/537.51.1 (KHTML, like Gecko) Version/7.0 Mobile/11B554a Safari/9537.53")
{:name "Mobile Safari",
 :producer "Apple Inc.",
 :type :mobile-browser,
 :version "7.0",
 :device :tablet,
 :os {:name "iOS 7", :family "iOS", :version "7.0.4"}}

; google bot
(ua/user-agent "Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)")
{:name "Googlebot/2.1",
 :producer "Google Inc.",
 :type :robot,
 :version "2.1",
 :device :other,
 :os {:name "unknown", :family "unknown", :version ""}}
```

## License

Copyright © 2014 Paul Ingles

Distributed under the Eclipse Public License either version 1.0 or (at your
option) any later version.
