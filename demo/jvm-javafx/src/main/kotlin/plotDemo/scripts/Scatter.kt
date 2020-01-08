/*
 * Copyright (c) 2019. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package plotDemo.scripts

import jetbrains.letsPlot.geom.geom_point
import jetbrains.letsPlot.ggplot
import plotDemo.SwingJfxDemoFrontend

object Scatter {
    @JvmStatic
    fun main(args: Array<String>) {
        SwingJfxDemoFrontend.eval("Scatter") {
            val data = mapOf<String, Any>(
                "weight" to listOf(68, 84, 73),
                "height" to listOf(175, 169, 180),
                "shoe" to listOf(42, 40, 45)
            )


            val p = ggplot(data) +
                    geom_point(color = "red") {
                        x = "weight"
                        y = "height"
                        size = "shoe"
                    }

            p.show()
        }
    }
}