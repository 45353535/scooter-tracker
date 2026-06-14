package com.mbridge.msdk.thrid.okio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    static o f51772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static long f51773b;

    private p() {
    }

    static o a() {
        synchronized (p.class) {
            try {
                o oVar = f51772a;
                if (oVar == null) {
                    return new o();
                }
                f51772a = oVar.f51770f;
                oVar.f51770f = null;
                f51773b -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                return oVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static void a(o oVar) {
        if (oVar.f51770f == null && oVar.f51771g == null) {
            if (oVar.f51768d) {
                return;
            }
            synchronized (p.class) {
                try {
                    long j10 = f51773b + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                    if (j10 > PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                        return;
                    }
                    f51773b = j10;
                    oVar.f51770f = f51772a;
                    oVar.f51767c = 0;
                    oVar.f51766b = 0;
                    f51772a = oVar;
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
