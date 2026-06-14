package com.fyber.inneractive.sdk.network;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f21289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f21290c;

    public c(f fVar, int i10, long j10) {
        this.f21290c = fVar;
        this.f21288a = i10;
        this.f21289b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21290c.f21307d.sendEmptyMessageDelayed(this.f21288a, this.f21289b);
    }
}
