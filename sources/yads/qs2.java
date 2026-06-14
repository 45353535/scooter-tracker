package yads;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class qs2 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rs2 f115146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v5 f115147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u5 f115148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f115149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rs2 f115150f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f115151g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs2(rs2 rs2Var, Continuation continuation) {
        super(continuation);
        this.f115150f = rs2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f115149e = obj;
        this.f115151g |= Integer.MIN_VALUE;
        return this.f115150f.a(this);
    }
}
