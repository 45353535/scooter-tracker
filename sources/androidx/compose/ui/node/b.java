package androidx.compose.ui.node;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static void a(LayoutAwareModifierNode layoutAwareModifierNode, LookaheadLayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
    }

    public static void b(LayoutAwareModifierNode layoutAwareModifierNode, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
    }

    public static void c(LayoutAwareModifierNode layoutAwareModifierNode, long j10) {
    }
}
