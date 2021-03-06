/*
 * Copyright (c) 2020. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package jetbrains.letsPlot.intern.layer.stat

import jetbrains.datalore.plot.base.stat.Bin2dStat
import jetbrains.letsPlot.intern.Options
import jetbrains.letsPlot.intern.layer.OptionsCapsule

interface Bin2dStatParameters : OptionsCapsule {
    val bins: Pair<Int, Int>?
    val binWidth: Pair<Number?, Number?>?
    val drop: Boolean?

    override fun seal() = Options.of(
        Bin2dStat.P_BINS to bins?.toList(),
        Bin2dStat.P_BINWIDTH to binWidth?.toList(),
        Bin2dStat.P_DROP to drop
    )
}