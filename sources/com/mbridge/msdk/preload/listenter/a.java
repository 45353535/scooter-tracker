package com.mbridge.msdk.preload.listenter;

import com.mbridge.msdk.out.PreloadListener;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public class a implements PreloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    WeakReference<PreloadListener> f50072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f50073b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f50074c = false;

    public a(PreloadListener preloadListener) {
        if (preloadListener != null) {
            this.f50072a = new WeakReference<>(preloadListener);
        }
    }

    public boolean a() {
        return this.f50074c;
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadFaild(String str) {
        WeakReference<PreloadListener> weakReference = this.f50072a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f50072a.get().onPreloadFaild(str);
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadSucceed() {
        WeakReference<PreloadListener> weakReference = this.f50072a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f50072a.get().onPreloadSucceed();
    }

    public void a(boolean z10) {
        this.f50074c = z10;
    }
}
