package yads;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class gx1 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gi f111382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f111383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kx1 f111384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f111385e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx1(kx1 kx1Var, Continuation continuation) {
        super(continuation);
        this.f111384d = kx1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f111383c = obj;
        this.f111385e |= Integer.MIN_VALUE;
        return kx1.a(this.f111384d, (gi) null, this);
    }
}
