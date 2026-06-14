package yads;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class ps2 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v5 f114762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u5 f114763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f114764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rs2 f114765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f114766f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps2(rs2 rs2Var, Continuation continuation) {
        super(continuation);
        this.f114765e = rs2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f114764d = obj;
        this.f114766f |= Integer.MIN_VALUE;
        return this.f114765e.b(null, this);
    }
}
