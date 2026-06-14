package yads;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class ze2 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f118640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ af2 f118641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f118642d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze2(af2 af2Var, Continuation continuation) {
        super(continuation);
        this.f118641c = af2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f118640b = obj;
        this.f118642d |= Integer.MIN_VALUE;
        return this.f118641c.a(null, null, this);
    }
}
