package com.fyber.inneractive.sdk.external;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdUnitController f20610a;

    public h(NativeAdUnitController nativeAdUnitController) {
        this.f20610a = nativeAdUnitController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20610a.a();
    }
}
