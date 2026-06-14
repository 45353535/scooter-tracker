package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class N6 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Yc f37401a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N6(Yc yc2, Continuation continuation) {
        super(2, continuation);
        this.f37401a = yc2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new N6(this.f37401a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new N6(this.f37401a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        Yc yc2 = this.f37401a;
        Hc hc2 = yc2.f37479d;
        G g10 = yc2.f39960a.f39883b;
        hc2.onAdFetchSuccessful(new AdMetaInfo(g10.f36902e, g10.f36909l));
        return Unit.f93236a;
    }
}
