package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSession;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3592b1 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3669e1 f38236a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3592b1(AbstractC3669e1 abstractC3669e1, Continuation continuation) {
        super(2, continuation);
        this.f38236a = abstractC3669e1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3592b1(this.f38236a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3592b1(this.f38236a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        try {
            AdSession adSession = this.f38236a.f38485c;
            if (adSession != null) {
                adSession.start();
            }
        } catch (Exception e10) {
            AbstractC3669e1 abstractC3669e1 = this.f38236a;
            abstractC3669e1.f38485c = null;
            InterfaceC3878m9 interfaceC3878m9 = abstractC3669e1.f38484b;
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).a(AbstractC3669e1.f38482f, "AdSession start error " + e10);
            }
        }
        return Unit.f93236a;
    }
}
