/*
 * Copyright (c) 2010 - 2012 Novus Partners, Inc. <http://novus.com>
 *
 * Module:        salat-util
 * Class:         SalatDAOUtilSpec.scala
 * Last modified: 2012-06-27 23:42:09 EDT
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Project:      http://github.com/novus/salat
 * Wiki:         http://github.com/novus/salat/wiki
 * Mailing list: http://groups.google.com/group/scala-salat
 */

package com.novus.salat.util

import org.specs2.mutable.Specification

class SalatDAOUtilSpec extends Specification {

  "DAO Utils" should {
    "provide a method that returns exactly one result or detonates with a useful error" in {
      SalatDAOUtils.exactlyOne(List(1)) must_== 1
      SalatDAOUtils.exactlyOne(List(1, 2)) must throwA[RuntimeException]

      SalatDAOUtils.exactlyOne(List("A")) must_== "A"
      SalatDAOUtils.exactlyOne(List[String]()) must throwA[RuntimeException]
    }
  }

}