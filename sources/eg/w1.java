package eg;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
final class w1 extends jg.a0 implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f69180f;

    public w1(long j10, Continuation continuation) {
        super(continuation.getContext(), continuation);
        this.f69180f = j10;
    }

    @Override // java.lang.Runnable
    public void run() {
        K(x1.a(this.f69180f, k0.c(getContext()), this));
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.b0
    public String z0() {
        return super.z0() + "(timeMillis=" + this.f69180f + ')';
    }
}
