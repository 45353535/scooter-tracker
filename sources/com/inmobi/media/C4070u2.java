package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4070u2 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC4145x2 f39631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VastProperties f39632b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4070u2(AbstractC4145x2 abstractC4145x2, VastProperties vastProperties, Continuation continuation) {
        super(2, continuation);
        this.f39631a = abstractC4145x2;
        this.f39632b = vastProperties;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4070u2(this.f39631a, this.f39632b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4070u2(this.f39631a, this.f39632b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        AdEvents adEvents = this.f39631a.f38487e;
        if (adEvents != null) {
            adEvents.loaded(this.f39632b);
        }
        return Unit.f93236a;
    }
}
