package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class oe implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ re f65039b;

    public oe(re reVar, int i10) {
        this.f65039b = reVar;
        this.f65038a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yj yjVar = this.f65039b.f65217b;
        if (yjVar != null) {
            yjVar.a(this.f65038a);
        }
    }
}
