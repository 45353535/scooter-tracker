package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.os.ConditionVariable;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConditionVariable f22997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f22998b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, ConditionVariable conditionVariable) {
        super("SimpleCache.initialize()");
        this.f22998b = lVar;
        this.f22997a = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f22998b) {
            this.f22997a.open();
            try {
                l.a(this.f22998b);
            } catch (a e10) {
                this.f22998b.f23004f = e10;
            }
            this.f22998b.f23000b.getClass();
        }
    }
}
