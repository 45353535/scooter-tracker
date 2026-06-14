package com.appodeal.consent.ump;

import android.content.Context;
import com.google.android.ump.UserMessagingPlatform;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15563r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f15564s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f15565t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, g gVar, Continuation continuation) {
        super(2, continuation);
        this.f15564s = context;
        this.f15565t = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f15564s, this.f15565t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new d(this.f15564s, this.f15565t, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f15563r;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        Context context = this.f15564s;
        g gVar = this.f15565t;
        this.f15563r = 1;
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(this), 1);
        eVar.I();
        UserMessagingPlatform.loadConsentForm(context, new b(gVar, eVar), new c(eVar));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(this);
        }
        return objC == objG ? objG : objC;
    }
}
