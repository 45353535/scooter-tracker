package jg;

import eg.n1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f85915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f85916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n1[] f85917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f85918d;

    public r0(CoroutineContext coroutineContext, int i10) {
        this.f85915a = coroutineContext;
        this.f85916b = new Object[i10];
        this.f85917c = new n1[i10];
    }

    public final void a(n1 n1Var, Object obj) {
        Object[] objArr = this.f85916b;
        int i10 = this.f85918d;
        objArr[i10] = obj;
        n1[] n1VarArr = this.f85917c;
        this.f85918d = i10 + 1;
        Intrinsics.checkNotNull(n1Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        n1VarArr[i10] = n1Var;
    }

    public final void b(CoroutineContext coroutineContext) {
        int length = this.f85917c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            n1 n1Var = this.f85917c[length];
            Intrinsics.checkNotNull(n1Var);
            n1Var.restoreThreadContext(coroutineContext, this.f85916b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}
