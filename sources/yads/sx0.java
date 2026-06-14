package yads;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class sx0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public tx0 f115967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f115968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tx0 f115969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f115970e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx0(tx0 tx0Var, Continuation continuation) {
        super(continuation);
        this.f115969d = tx0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f115968c = obj;
        this.f115970e |= Integer.MIN_VALUE;
        return this.f115969d.a(false, this);
    }
}
