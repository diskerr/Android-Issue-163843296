package kr.co.diskerr.androidpathtest

import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private val path = Path()
    private val path2 = Path()

    init {
        path.moveTo(796.0f, 254.0f)
        path.lineTo(799.0f, 263.0f)
        path.lineTo(801.0f, 271.0f)
        path.lineTo(802.0f, 282.0f)
        path.lineTo(802.0f, 294.0f)
        path.lineTo(799.0f, 344.0f)
        path.lineTo(799.0f, 375.0f)
        path.lineTo(801.0f, 412.0f)
        path.lineTo(802.0f, 433.0f)
        path.lineTo(802.0f, 456.0f)
        path.lineTo(803.0f, 480.0f)
        path.lineTo(803.0f, 505.0f)
        path.lineTo(804.0f, 533.0f)
        path.lineTo(802.0f, 598.0f)
        path.lineTo(800.0f, 672.0f)
        path.lineTo(798.0f, 710.0f)
        path.lineTo(797.0f, 721.0f)

        path2.moveTo(623.0f, 271.0f)
        path2.lineTo(622.0f, 279.0f)
        path2.lineTo(622.0f, 324.0f)
        path2.lineTo(623.0f, 331.0f)
        path2.lineTo(623.0f, 376.0f)
        path2.lineTo(625.0f, 389.0f)
        path2.lineTo(625.0f, 396.0f)
        path2.lineTo(626.0f, 402.0f)
        path2.lineTo(626.0f, 409.0f)
        path2.lineTo(627.0f, 414.0f)
        path2.lineTo(627.0f, 436.0f)
        path2.lineTo(626.0f, 439.0f)
        path2.lineTo(627.0f, 440.0f)
        path2.lineTo(626.0f, 448.0f)
        path2.lineTo(625.0f, 477.0f)
        path2.lineTo(624.0f, 487.0f)
        path2.lineTo(621.0f, 498.0f)
        path2.lineTo(620.0f, 506.0f)
        path2.lineTo(618.0f, 512.0f)
        path2.lineTo(616.0f, 523.0f) // -2, +11
        path2.lineTo(614.0f, 532.0f) // -2, +9
        path2.lineTo(612.0f, 541.0f) // -1, +9
        path2.lineTo(611.0f, 553.0f) // -1, 12
        path2.lineTo(610.0f, 565.0f) // -1, 12
        path2.lineTo(608.0f, 575.0f) // -2, 10
        path2.lineTo(608.0f, 584.0f)
        path2.lineTo(607.0f, 590.0f)
        path2.lineTo(607.0f, 595.0f)
        path2.lineTo(606.0f, 600.0f)
        path2.lineTo(606.0f, 607.0f)
        path2.lineTo(600.0f, 648.0f)
        path2.lineTo(596.0f, 674.0f)
        path2.lineTo(593.0f, 687.0f)
        path2.lineTo(592.0f, 695.0f)
        path2.lineTo(590.0f, 694.0f)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}