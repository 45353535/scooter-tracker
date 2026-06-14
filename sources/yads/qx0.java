package yads;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class qx0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f115191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rx0 f115192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f115193d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx0(rx0 rx0Var, Continuation continuation) {
        super(continuation);
        this.f115192c = rx0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f115191b = obj;
        this.f115193d |= Integer.MIN_VALUE;
        return this.f115192c.a(false, this);
    }
}
