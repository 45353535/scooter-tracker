package yads;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class ox0 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public px0 f114439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f114440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f114441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ px0 f114442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f114443f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox0(px0 px0Var, Continuation continuation) {
        super(continuation);
        this.f114442e = px0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f114441d = obj;
        this.f114443f |= Integer.MIN_VALUE;
        return this.f114442e.a(null, false, this);
    }
}
