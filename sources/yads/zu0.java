package yads;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class zu0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dv0 f118831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public yk2 f118832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f118833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dv0 f118834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f118835f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu0(dv0 dv0Var, Continuation continuation) {
        super(continuation);
        this.f118834e = dv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f118833d = obj;
        this.f118835f |= Integer.MIN_VALUE;
        return this.f118834e.a(null, this);
    }
}
