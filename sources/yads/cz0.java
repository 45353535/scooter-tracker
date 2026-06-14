package yads;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class cz0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f109665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dz0 f109666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f109667d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz0(dz0 dz0Var, Continuation continuation) {
        super(continuation);
        this.f109666c = dz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f109665b = obj;
        this.f109667d |= Integer.MIN_VALUE;
        return this.f109666c.a(null, null, this);
    }
}
