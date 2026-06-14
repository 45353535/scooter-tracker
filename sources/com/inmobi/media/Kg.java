package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.SignalsConfig;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Kg extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37223a;

    public Kg(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Kg(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Kg((Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f37223a;
        try {
            if (i10 == 0) {
                kotlin.d.b(obj);
                Og og2 = Og.f37496a;
                og2.getClass();
                Context context = Ji.f37157a;
                JSONObject jSONObject = null;
                if (context != null) {
                    if (Og.f37499d == null) {
                        Og.f37499d = new C4209zg(context, "pub_signals_store");
                    }
                    C4209zg c4209zg = Og.f37499d;
                    if (c4209zg == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                        c4209zg = null;
                    }
                    String strA = c4209zg.a("saved_signals");
                    if (strA != null) {
                        jSONObject = new JSONObject(strA);
                    }
                }
                if (jSONObject == null) {
                    return Unit.f93236a;
                }
                SignalsConfig.PublisherConfig publisherConfigC = Og.c();
                JSONObject jSONObjectA = Pg.a(Pg.a(Pg.a(jSONObject, "obj_", publisherConfigC.getObj().getExpiry()), "auto_", publisherConfigC.getAuto().getExpiry()), "dir_", publisherConfigC.getDirect().getExpiry());
                this.f37223a = 1;
                if (og2.a(jSONObjectA, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
        } catch (Exception e10) {
            Lazy lazy = P9.f37527a;
            AbstractC3779i9.a(e10);
        }
        return Unit.f93236a;
    }
}
