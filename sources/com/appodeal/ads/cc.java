package com.appodeal.ads;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class cc implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f13175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f13180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AppodealUnityBannerView f13181h;

    public cc(AppodealUnityBannerView appodealUnityBannerView, Activity activity, int i10, int i11, int i12, int i13, FrameLayout frameLayout) {
        this.f13181h = appodealUnityBannerView;
        this.f13175b = activity;
        this.f13176c = i10;
        this.f13177d = i11;
        this.f13178e = i12;
        this.f13179f = i13;
        this.f13180g = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f13181h.f11831a != null) {
            Appodeal.hide(this.f13175b, this.f13176c);
            vc vcVar = this.f13181h.f11831a;
            if (vcVar.getParent() != null && (vcVar.getParent() instanceof ViewGroup)) {
                ((ViewGroup) vcVar.getParent()).removeView(vcVar);
            }
            this.f13181h.f11831a = null;
        }
        int i10 = this.f13177d;
        AppodealUnityBannerView appodealUnityBannerView = this.f13181h;
        int i11 = this.f13178e;
        int i12 = this.f13179f;
        appodealUnityBannerView.getClass();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, -2, (i11 != -3 ? (i11 == -2 || i11 == -1) ? 1 : 3 : 5) | (i12 != 8 ? 48 : 80));
        this.f13181h.f11831a = new vc(this.f13175b);
        vc vcVar2 = this.f13181h.f11831a;
        int i13 = this.f13178e;
        if (i13 == -4 || i13 == -3 || i13 == -2 || i13 == -1) {
            i13 = 0;
        }
        int i14 = this.f13179f;
        if (i14 == 8 || i14 == 16) {
            i14 = 0;
        }
        vcVar2.f15158e = i13;
        vcVar2.f15159f = i14;
        vcVar2.requestLayout();
        vcVar2.invalidate();
        this.f13181h.f11831a.setBackgroundColor(0);
        this.f13181h.f11831a.addView(this.f13180g, layoutParams);
        this.f13175b.addContentView(this.f13181h.f11831a, new FrameLayout.LayoutParams(-1, -1));
    }
}
