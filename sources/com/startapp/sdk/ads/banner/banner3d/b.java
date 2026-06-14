package com.startapp.sdk.ads.banner.banner3d;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Banner3D f63699a;

    public b(Banner3D banner3D) {
        this.f63699a = banner3D;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f63699a.rotationEnabled = true;
    }
}
