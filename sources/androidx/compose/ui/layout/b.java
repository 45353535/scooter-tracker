package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static void a(LayoutCoordinates layoutCoordinates, LayoutCoordinates sourceCoordinates, float[] matrix) {
        Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        throw new UnsupportedOperationException("transformFrom is not implemented on this LayoutCoordinates");
    }

    public static /* synthetic */ Rect c(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, z10);
    }
}
