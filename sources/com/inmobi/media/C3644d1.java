package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3644d1 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3669e1 f38416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InteractionType f38417b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3644d1(AbstractC3669e1 abstractC3669e1, InteractionType interactionType, Continuation continuation) {
        super(2, continuation);
        this.f38416a = abstractC3669e1;
        this.f38417b = interactionType;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3644d1(this.f38416a, this.f38417b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3644d1(this.f38416a, this.f38417b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        MediaEvents mediaEvents = this.f38416a.f38486d;
        if (mediaEvents != null) {
            mediaEvents.adUserInteraction(this.f38417b);
        }
        return Unit.f93236a;
    }
}
