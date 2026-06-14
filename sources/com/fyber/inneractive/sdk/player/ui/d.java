package com.fyber.inneractive.sdk.player.ui;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f23355b;

    public d(e eVar, boolean z10) {
        this.f23355b = eVar;
        this.f23354a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f23354a == this.f23355b.hasWindowFocus()) {
            this.f23355b.e();
        }
    }
}
