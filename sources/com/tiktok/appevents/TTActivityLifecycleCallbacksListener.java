package com.tiktok.appevents;

import androidx.lifecycle.LifecycleOwner;
import e6.b;

/* JADX INFO: loaded from: classes11.dex */
class TTActivityLifecycleCallbacksListener extends TTLifeCycleCallbacksAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f67759d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f67760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f67761c;

    private void a(long j10) {
        try {
            b.a(Long.valueOf(j10)).put("latency", System.currentTimeMillis() - j10);
            throw null;
        } catch (Exception unused) {
        }
    }

    private void b(long j10) {
        try {
            b.a(Long.valueOf(j10)).put("latency", System.currentTimeMillis() - j10);
            throw null;
        } catch (Exception unused) {
        }
    }

    @Override // com.tiktok.appevents.TTLifeCycleCallbacksAdapter, androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        throw null;
    }

    @Override // com.tiktok.appevents.TTLifeCycleCallbacksAdapter, androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner lifecycleOwner) {
        b(this.f67760b);
        this.f67761c = System.currentTimeMillis();
        throw null;
    }

    @Override // com.tiktok.appevents.TTLifeCycleCallbacksAdapter, androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner lifecycleOwner) {
        if (!f67759d) {
            f67759d = false;
        } else {
            a(this.f67761c);
            this.f67760b = System.currentTimeMillis();
            throw null;
        }
    }

    @Override // com.tiktok.appevents.TTLifeCycleCallbacksAdapter, androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner lifecycleOwner) {
        throw null;
    }
}
