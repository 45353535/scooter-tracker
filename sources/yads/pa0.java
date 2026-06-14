package yads;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class pa0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qa0 f114584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ja0 f114585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f114586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qa0 f114587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f114588f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa0(qa0 qa0Var, Continuation continuation) {
        super(continuation);
        this.f114587e = qa0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f114586d = obj;
        this.f114588f |= Integer.MIN_VALUE;
        return this.f114587e.a(null, null, this);
    }
}
