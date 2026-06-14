package yads;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class ho1 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f111647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a f111648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f111649e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho1(com.monetization.ads.mediation.base.initialize.a aVar, Continuation continuation) {
        super(continuation);
        this.f111648d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f111647c = obj;
        this.f111649e |= Integer.MIN_VALUE;
        return this.f111648d.a(null, null, this);
    }
}
