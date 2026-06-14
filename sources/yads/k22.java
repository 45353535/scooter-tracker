package yads;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class k22 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n22 f112560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public hg2 f112561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public dx1 f112562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v5 f112563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u5 f112564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f112565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n22 f112566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f112567i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k22(n22 n22Var, Continuation continuation) {
        super(continuation);
        this.f112566h = n22Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f112565g = obj;
        this.f112567i |= Integer.MIN_VALUE;
        return this.f112566h.a(null, null, null, this);
    }
}
