package yads;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class zk0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public al0 f118725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f118726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ al0 f118727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f118728e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk0(al0 al0Var, Continuation continuation) {
        super(continuation);
        this.f118727d = al0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f118726c = obj;
        this.f118728e |= Integer.MIN_VALUE;
        return this.f118727d.a(null, this);
    }
}
