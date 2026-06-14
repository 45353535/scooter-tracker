package com.startapp.sdk.ads.nativead;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f63839a;

    public f(NativeAdDetails nativeAdDetails) {
        this.f63839a = nativeAdDetails;
    }

    public final void a() {
        if (this.f63839a.displayListener == null || this.f63839a.hiddenSent) {
            return;
        }
        this.f63839a.displayListener.adHidden(this.f63839a);
        this.f63839a.hiddenSent = true;
    }
}
