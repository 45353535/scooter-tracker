package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.VideoListener;

/* JADX INFO: loaded from: classes11.dex */
public final class nj implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VideoListener f64969a;

    public nj(VideoListener videoListener, Context context) {
        this.f64969a = videoListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f64969a.onVideoCompleted();
        } catch (Throwable th2) {
            vi.a((Object) this.f64969a, th2);
        }
    }
}
