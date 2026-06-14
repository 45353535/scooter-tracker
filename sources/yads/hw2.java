package yads;

import android.os.ConditionVariable;

/* JADX INFO: loaded from: classes4.dex */
public final class hw2 extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConditionVariable f111789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ iw2 f111790c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw2(iw2 iw2Var, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f111790c = iw2Var;
        this.f111789b = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f111790c) {
            this.f111789b.open();
            this.f111790c.b();
            this.f111790c.f112168b.getClass();
        }
    }
}
