package eg;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
class j1 extends kotlinx.coroutines.a {
    public j1(CoroutineContext coroutineContext, boolean z10) {
        super(coroutineContext, true, z10);
    }

    @Override // kotlinx.coroutines.b0
    protected boolean o0(Throwable th2) {
        d0.a(getContext(), th2);
        return true;
    }
}
