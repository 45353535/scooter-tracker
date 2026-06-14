package com.appodeal.ads;

import android.content.Context;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class q5 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14295r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ za f14296s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f14297t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(za zaVar, Context context, Continuation continuation) {
        super(2, continuation);
        this.f14296s = zaVar;
        this.f14297t = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new q5(this.f14296s, this.f14297t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new q5(this.f14296s, this.f14297t, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objG = pf.b.g();
        int i10 = this.f14295r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            za zaVar = this.f14296s;
            this.f14295r = 1;
            objA = com.appodeal.ads.networking.v.a(zaVar, com.appodeal.ads.networking.processors.c.f14154b, this);
            if (objA == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            objA = ((Result) obj).l();
        }
        Context context = this.f14297t;
        if (Result.j(objA)) {
            JSONObject jSONObject = (JSONObject) objA;
            if (com.appodeal.ads.segments.g0.f14471c == null) {
                com.appodeal.ads.segments.g0.f14471c = new com.appodeal.ads.segments.g0();
            }
            com.appodeal.ads.segments.g0 g0Var = com.appodeal.ads.segments.g0.f14471c;
            g0Var.getClass();
            if (jSONObject != null && jSONObject.has("inapp_amount")) {
                float fOptDouble = (float) jSONObject.optDouble("inapp_amount", 0.0d);
                g0Var.f14476a = fOptDouble;
                g0Var.f14477b = fOptDouble > 0.0f;
                com.appodeal.ads.segments.s0.b(context);
            }
        }
        return Unit.f93236a;
    }
}
