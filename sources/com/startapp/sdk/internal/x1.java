package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class x1 implements zd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f65497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ce f65498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y1 f65499c;

    /* JADX WARN: Multi-variable type inference failed */
    public x1(y1 y1Var, zd zdVar) {
        this.f65499c = y1Var;
        this.f65498b = (ce) zdVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.startapp.sdk.internal.ce, com.startapp.sdk.internal.zd] */
    @Override // com.startapp.sdk.internal.zd
    public final synchronized void a(Object obj) {
        if (this.f65497a) {
            return;
        }
        this.f65497a = true;
        this.f65499c.f65591c.removeCallbacksAndMessages(null);
        this.f65498b.a(obj);
    }
}
