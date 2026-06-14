package yads;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class gi0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v5 f111219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u5 f111220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f111221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ki0 f111222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f111223f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi0(ki0 ki0Var, Continuation continuation) {
        super(continuation);
        this.f111222e = ki0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f111221d = obj;
        this.f111223f |= Integer.MIN_VALUE;
        return this.f111222e.a(this);
    }
}
