package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class dk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f64440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fk f64441b;

    public dk(fk fkVar, String str) {
        this.f64441b = fkVar;
        this.f64440a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f64441b.f64522d.a(this.f64440a);
    }
}
