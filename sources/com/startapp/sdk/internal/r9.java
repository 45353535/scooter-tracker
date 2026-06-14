package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class r9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g9 f65194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f65195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f65196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w9 f65197d;

    public r9(w9 w9Var, g9 g9Var, int i10, long j10) {
        this.f65197d = w9Var;
        this.f65194a = g9Var;
        this.f65195b = i10;
        this.f65196c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f65197d.a(this.f65194a, this.f65195b, this.f65196c);
        } catch (Throwable unused) {
        }
    }
}
