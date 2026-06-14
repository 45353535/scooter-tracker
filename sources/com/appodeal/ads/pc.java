package com.appodeal.ads;

import android.app.Activity;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes6.dex */
public final class pc implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f14279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppodealUnityBannerView f14281d;

    public pc(AppodealUnityBannerView appodealUnityBannerView, Activity activity, int i10) {
        this.f14281d = appodealUnityBannerView;
        this.f14279b = activity;
        this.f14280c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f14281d.f11831a != null) {
            Appodeal.hide(this.f14279b, this.f14280c);
            vc vcVar = this.f14281d.f11831a;
            if (vcVar.getParent() != null && (vcVar.getParent() instanceof ViewGroup)) {
                ((ViewGroup) vcVar.getParent()).removeView(vcVar);
            }
            this.f14281d.f11831a = null;
        }
    }
}
