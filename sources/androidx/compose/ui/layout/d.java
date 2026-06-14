package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ long a(LookaheadLayoutCoordinates lookaheadLayoutCoordinates, LookaheadLayoutCoordinates lookaheadLayoutCoordinates2, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localLookaheadPositionOf-R5De75A");
        }
        if ((i10 & 2) != 0) {
            j10 = Offset.INSTANCE.m1387getZeroF1C5BW0();
        }
        return lookaheadLayoutCoordinates.mo3024localLookaheadPositionOfR5De75A(lookaheadLayoutCoordinates2, j10);
    }
}
