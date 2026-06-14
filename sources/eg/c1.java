package eg;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
final class c1 extends j0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Continuation f69136e;

    public c1(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.f69136e = pf.b.b(function2, this, this);
    }

    @Override // kotlinx.coroutines.b0
    protected void H0() throws Throwable {
        kg.a.b(this.f69136e, this);
    }
}
