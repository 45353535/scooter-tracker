package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdEvents;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class Z0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3669e1 f38087a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(AbstractC3669e1 abstractC3669e1, Continuation continuation) {
        super(2, continuation);
        this.f38087a = abstractC3669e1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Z0(this.f38087a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Z0(this.f38087a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        AdEvents adEvents = this.f38087a.f38487e;
        if (adEvents != null) {
            adEvents.impressionOccurred();
        }
        return Unit.f93236a;
    }
}
