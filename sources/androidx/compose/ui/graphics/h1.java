package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class h1 {
    static {
        Path.Companion companion = Path.INSTANCE;
    }

    public static void a(Path path, Rect rect, float f10, float f11, boolean z10) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        path.arcTo(rect, DegreesKt.degrees(f10), DegreesKt.degrees(f11), z10);
    }

    public static /* synthetic */ void c(Path path, Path path2, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i10 & 2) != 0) {
            j10 = Offset.INSTANCE.m1387getZeroF1C5BW0();
        }
        path.mo1503addPathUv8p0NA(path2, j10);
    }
}
