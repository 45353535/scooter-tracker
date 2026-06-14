package com.fyber.inneractive.sdk.click;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f20280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f20281b;

    public n(r rVar, b bVar) {
        this.f20281b = rVar;
        this.f20280a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = this.f20281b.f20285d;
        if (oVar != null) {
            oVar.a(this.f20280a);
        }
    }
}
