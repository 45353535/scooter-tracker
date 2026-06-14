package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdEvents;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3747h2 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Cc f38680a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3747h2(Cc cc2, Continuation continuation) {
        super(2, continuation);
        this.f38680a = cc2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3747h2(this.f38680a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3747h2(this.f38680a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        AdEvents adEvents = this.f38680a.f38487e;
        if (adEvents != null) {
            adEvents.loaded();
        }
        return Unit.f93236a;
    }
}
