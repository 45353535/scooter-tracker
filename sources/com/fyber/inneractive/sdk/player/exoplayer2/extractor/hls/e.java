package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21820g;

    public e(y yVar, int[] iArr) {
        super(yVar, iArr);
        int i10 = 0;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = yVar.f22914b[0];
        while (true) {
            if (i10 >= this.f22926b) {
                i10 = -1;
                break;
            } else if (this.f22928d[i10] == oVar) {
                break;
            } else {
                i10++;
            }
        }
        this.f21820g = i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b
    public final int a() {
        return this.f21820g;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b
    public final Object b() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b
    public final int c() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b
    public final void d() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f22929e[this.f21820g] > jElapsedRealtime) {
            for (int i10 = this.f22926b - 1; i10 >= 0; i10--) {
                if (this.f22929e[i10] <= jElapsedRealtime) {
                    this.f21820g = i10;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
