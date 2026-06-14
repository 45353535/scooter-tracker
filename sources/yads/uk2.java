package yads;

import kotlin.Result;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class uk2 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f116703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xk2 f116704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f116705d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk2(xk2 xk2Var, Continuation continuation) {
        super(continuation);
        this.f116704c = xk2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f116703b = obj;
        this.f116705d |= Integer.MIN_VALUE;
        Object objA = this.f116704c.a(this);
        return objA == pf.b.g() ? objA : Result.a(objA);
    }
}
