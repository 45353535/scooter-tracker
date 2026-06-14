package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class qh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yh f65163a;

    public qh(yh yhVar) {
        this.f65163a = yhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yh yhVar = this.f65163a;
        try {
            if (yhVar.a() != null && yhVar.f65615f == null) {
                vh vhVarA = yhVar.a((Class) null);
                yhVar.f65615f = vhVarA;
                if (vhVarA != null) {
                    vhVarA.a();
                }
            }
        } catch (Throwable th2) {
            if (yhVar.a(1)) {
                g9.a(th2);
            }
        }
    }
}
