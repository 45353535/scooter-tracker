package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.t f23047a = new com.fyber.inneractive.sdk.player.exoplayer2.util.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f23049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f23050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f23051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f23052f;

    public final synchronized void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.s sVar;
        int i10;
        float f10;
        try {
            if (this.f23048b <= 0) {
                throw new IllegalStateException();
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int i11 = (int) (jElapsedRealtime - this.f23049c);
            long j10 = i11;
            this.f23051e += j10;
            long j11 = this.f23052f;
            long j12 = this.f23050d;
            this.f23052f = j11 + j12;
            if (i11 > 0) {
                float f11 = (RtspMediaSource.DEFAULT_TIMEOUT_MS * j12) / j10;
                com.fyber.inneractive.sdk.player.exoplayer2.util.t tVar = this.f23047a;
                int iSqrt = (int) Math.sqrt(j12);
                if (tVar.f23150d != 1) {
                    Collections.sort(tVar.f23148b, com.fyber.inneractive.sdk.player.exoplayer2.util.t.f23145h);
                    tVar.f23150d = 1;
                }
                int i12 = tVar.f23153g;
                if (i12 > 0) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.s[] sVarArr = tVar.f23149c;
                    int i13 = i12 - 1;
                    tVar.f23153g = i13;
                    sVar = sVarArr[i13];
                } else {
                    sVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.s();
                }
                int i14 = tVar.f23151e;
                tVar.f23151e = i14 + 1;
                sVar.f23142a = i14;
                sVar.f23143b = iSqrt;
                sVar.f23144c = f11;
                tVar.f23148b.add(sVar);
                tVar.f23152f += iSqrt;
                while (true) {
                    int i15 = tVar.f23152f;
                    int i16 = tVar.f23147a;
                    i10 = 0;
                    if (i15 <= i16) {
                        break;
                    }
                    int i17 = i15 - i16;
                    com.fyber.inneractive.sdk.player.exoplayer2.util.s sVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.util.s) tVar.f23148b.get(0);
                    int i18 = sVar2.f23143b;
                    if (i18 <= i17) {
                        tVar.f23152f -= i18;
                        tVar.f23148b.remove(0);
                        int i19 = tVar.f23153g;
                        if (i19 < 5) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.s[] sVarArr2 = tVar.f23149c;
                            tVar.f23153g = i19 + 1;
                            sVarArr2[i19] = sVar2;
                        }
                    } else {
                        sVar2.f23143b = i18 - i17;
                        tVar.f23152f -= i17;
                    }
                }
                if (this.f23051e >= 2000 || this.f23052f >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.t tVar2 = this.f23047a;
                    if (tVar2.f23150d != 0) {
                        Collections.sort(tVar2.f23148b, com.fyber.inneractive.sdk.player.exoplayer2.util.t.f23146i);
                        tVar2.f23150d = 0;
                    }
                    float f12 = 0.5f * tVar2.f23152f;
                    int i20 = 0;
                    while (true) {
                        if (i10 < tVar2.f23148b.size()) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.s sVar3 = (com.fyber.inneractive.sdk.player.exoplayer2.util.s) tVar2.f23148b.get(i10);
                            i20 += sVar3.f23143b;
                            if (i20 >= f12) {
                                f10 = sVar3.f23144c;
                                break;
                            }
                            i10++;
                        } else if (tVar2.f23148b.isEmpty()) {
                            f10 = Float.NaN;
                        } else {
                            ArrayList arrayList = tVar2.f23148b;
                            f10 = ((com.fyber.inneractive.sdk.player.exoplayer2.util.s) arrayList.get(arrayList.size() - 1)).f23144c;
                        }
                    }
                    Float.isNaN(f10);
                }
            }
            int i21 = this.f23048b - 1;
            this.f23048b = i21;
            if (i21 > 0) {
                this.f23049c = jElapsedRealtime;
            }
            this.f23050d = 0L;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
