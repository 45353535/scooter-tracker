package com.startapp.sdk.ads.list3d;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DView f63831a;

    public d(List3DView list3DView) {
        this.f63831a = list3DView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iA;
        List3DView list3DView = this.f63831a;
        if (list3DView.f63805b != 1 || (iA = list3DView.a(list3DView.f63806c, list3DView.f63807d)) == -1) {
            return;
        }
        this.f63831a.a(iA);
    }
}
