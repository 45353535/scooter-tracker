package com.bytedance.sdk.component.ud.qdl.ud;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes6.dex */
final class mo {
    static mzz qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    static long f16711ud;

    private mo() {
    }

    static mzz qdl() {
        synchronized (mo.class) {
            mzz mzzVar = qdl;
            if (mzzVar == null) {
                return new mzz();
            }
            qdl = mzzVar.mo;
            mzzVar.mo = null;
            f16711ud -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            return mzzVar;
        }
    }

    static void qdl(mzz mzzVar) {
        if (mzzVar.mo == null && mzzVar.f16713wd == null) {
            if (mzzVar.mml) {
                return;
            }
            synchronized (mo.class) {
                try {
                    long j10 = f16711ud;
                    if (j10 + PlaybackStateCompat.ACTION_PLAY_FROM_URI > PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                        return;
                    }
                    f16711ud = j10 + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                    mzzVar.mo = qdl;
                    mzzVar.lnr = 0;
                    mzzVar.f16712ud = 0;
                    qdl = mzzVar;
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
