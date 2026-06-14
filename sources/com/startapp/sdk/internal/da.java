package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Point;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.AdsConstants$AdApiType;
import com.startapp.sdk.adsbase.model.AdPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class da extends com.startapp.sdk.adsbase.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ca f64417k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(Context context, AdPreferences preferences, AdPreferences.Placement placement, lb httpClient, lb networkApiExecutor, lb eventTracer, lb motionProcessor, ca builder) {
        super(context, null, preferences, null, placement, httpClient, networkApiExecutor, eventTracer, motionProcessor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(networkApiExecutor, "networkApiExecutor");
        Intrinsics.checkNotNullParameter(eventTracer, "eventTracer");
        Intrinsics.checkNotNullParameter(motionProcessor, "motionProcessor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f64417k = builder;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final boolean a(Object obj) {
        return true;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        f9 f9Var = new f9();
        ca caVar = this.f64417k;
        f9Var.W0 = caVar.f64356b;
        f9Var.X0 = caVar.f64357c;
        AdUnitConfig adUnitConfig = caVar.f64358d;
        f9Var.Y0 = adUnitConfig != null ? adUnitConfig.getBp() : null;
        ca caVar2 = this.f64417k;
        f9Var.Z0 = caVar2.f64359e;
        f9Var.V0 = caVar2.f64355a;
        f9Var.f64490b1 = caVar2.f64361g;
        f9Var.f64489a1 = caVar2.f64362h.intValue();
        f9Var.f64491c1 = this.f64417k.f64363i;
        com.startapp.sdk.adsbase.model.a aVarA = a((com.startapp.sdk.adsbase.model.a) f9Var);
        if (aVarA != null) {
            aVarA.f(this.f64014a);
            Point point = this.f64417k.f64360f;
            aVarA.L = point != null ? point.x : aVarA.L;
            aVarA.M = point != null ? point.y : aVarA.M;
        }
        return aVarA;
    }

    @Override // com.startapp.sdk.adsbase.c
    public final Object e() {
        com.startapp.sdk.adsbase.model.a aVarC = c();
        if (aVarC == null) {
            return null;
        }
        p8 p8Var = new p8((q8) this.f64020g.a(), aVarC.a(i0.a(AdsConstants$AdApiType.HTML, this.f64018e)));
        p8Var.f65094e = new i7() { // from class: com.startapp.sdk.internal.vl
            @Override // com.startapp.sdk.internal.i7
            public final Object a(Object obj) {
                return da.a(this.f65415b, (Throwable) obj);
            }
        };
        return p8Var.a();
    }

    public static final Void a(da this$0, Throwable th2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f64019f = th2 != null ? th2.getMessage() : null;
        return null;
    }
}
