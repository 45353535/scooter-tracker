package p;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.Intrinsics;
import y.h;

/* JADX INFO: loaded from: classes5.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f98008a = Constraints.INSTANCE.m3927fixedJhjzzOo(0, 0);

    public static final float a(long j10, float f10) {
        return kotlin.ranges.g.m(f10, Constraints.m3920getMinHeightimpl(j10), Constraints.m3918getMaxHeightimpl(j10));
    }

    public static final float b(long j10, float f10) {
        return kotlin.ranges.g.m(f10, Constraints.m3921getMinWidthimpl(j10), Constraints.m3919getMaxWidthimpl(j10));
    }

    public static final long c() {
        return f98008a;
    }

    public static final h d(Object obj, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1151830858, i10, -1, "coil.compose.requestOf (Utils.kt:21)");
        }
        return obj instanceof h ? (h) obj : new h.a((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).b(obj).a();
    }

    public static final long e(long j10) {
        return IntSizeKt.IntSize(zf.a.d(Size.m1440getWidthimpl(j10)), zf.a.d(Size.m1437getHeightimpl(j10)));
    }

    public static final z.h f(ContentScale contentScale) {
        ContentScale.Companion companion = ContentScale.INSTANCE;
        return Intrinsics.areEqual(contentScale, companion.getFit()) ? true : Intrinsics.areEqual(contentScale, companion.getInside()) ? z.h.FIT : z.h.FILL;
    }
}
