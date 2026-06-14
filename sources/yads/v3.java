package yads;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class v3 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w3 f116856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public td1 f116857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b92 f116858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f116859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w3 f116860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f116861g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(w3 w3Var, Continuation continuation) {
        super(continuation);
        this.f116860f = w3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f116859e = obj;
        this.f116861g |= Integer.MIN_VALUE;
        return this.f116860f.a(null, null, null, null, this);
    }
}
