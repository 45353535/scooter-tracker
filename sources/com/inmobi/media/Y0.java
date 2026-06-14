package com.inmobi.media;

import android.util.Log;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.AdSession;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class Y0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3669e1 f38019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f38020b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y0(AbstractC3669e1 abstractC3669e1, ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.f38019a = abstractC3669e1;
        this.f38020b = viewGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Y0(this.f38019a, this.f38020b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Y0(this.f38019a, this.f38020b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        try {
            AdSession adSession = this.f38019a.f38485c;
            if (adSession != null) {
                adSession.registerAdView(this.f38020b);
            }
        } catch (IllegalArgumentException e10) {
            InterfaceC3878m9 interfaceC3878m9 = this.f38019a.f38484b;
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).a(AbstractC3669e1.f38482f, "Failed to registerAdView. " + Log.getStackTraceString(e10));
            }
        }
        return Unit.f93236a;
    }
}
