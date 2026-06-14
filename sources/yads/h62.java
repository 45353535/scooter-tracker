package yads;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class h62 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k62 f111494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f111495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k62 f111496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f111497e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h62(k62 k62Var, Continuation continuation) {
        super(continuation);
        this.f111496d = k62Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f111495c = obj;
        this.f111497e |= Integer.MIN_VALUE;
        return k62.a(this.f111496d, null, this);
    }
}
