package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class rh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yh f65224a;

    public rh(yh yhVar) {
        this.f65224a = yhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yh yhVar = this.f65224a;
        try {
            vh vhVar = yhVar.f65615f;
            if (vhVar != null) {
                vhVar.b();
                yhVar.f65615f = null;
            }
        } catch (Throwable th2) {
            if (yhVar.a(4)) {
                g9.a(th2);
            }
        }
    }
}
