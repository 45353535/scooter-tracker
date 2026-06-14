package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSession;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3618c1 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3669e1 f38315a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3618c1(AbstractC3669e1 abstractC3669e1, Continuation continuation) {
        super(2, continuation);
        this.f38315a = abstractC3669e1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3618c1(this.f38315a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3618c1(this.f38315a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        AdSession adSession = this.f38315a.f38485c;
        if (adSession != null) {
            adSession.finish();
        }
        this.f38315a.f38485c = null;
        return Unit.f93236a;
    }
}
