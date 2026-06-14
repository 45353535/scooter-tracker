package com.google.android.exoplayer2;

import android.os.SystemClock;
import com.google.android.exoplayer2.SimpleBasePlayer;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class e5 {
    static {
        SimpleBasePlayer.PositionSupplier positionSupplier = SimpleBasePlayer.PositionSupplier.ZERO;
    }

    public static SimpleBasePlayer.PositionSupplier a(final long j10) {
        return new SimpleBasePlayer.PositionSupplier() { // from class: com.google.android.exoplayer2.d5
            @Override // com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier
            public final long get() {
                return e5.c(j10);
            }
        };
    }

    public static SimpleBasePlayer.PositionSupplier b(final long j10, final float f10) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new SimpleBasePlayer.PositionSupplier() { // from class: com.google.android.exoplayer2.c5
            @Override // com.google.android.exoplayer2.SimpleBasePlayer.PositionSupplier
            public final long get() {
                return e5.d(j10, jElapsedRealtime, f10);
            }
        };
    }

    public static /* synthetic */ long d(long j10, long j11, float f10) {
        return j10 + ((long) ((SystemClock.elapsedRealtime() - j11) * f10));
    }

    public static /* synthetic */ long c(long j10) {
        return j10;
    }
}
