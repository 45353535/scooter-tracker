package yads;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class xk0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yk0 f117842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f117843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yk0 f117844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f117845e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk0(yk0 yk0Var, Continuation continuation) {
        super(continuation);
        this.f117844d = yk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f117843c = obj;
        this.f117845e |= Integer.MIN_VALUE;
        return this.f117844d.a(null, this);
    }
}
