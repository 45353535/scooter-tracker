package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.json.JsonParser;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.GetAdResponse;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d8 extends com.startapp.sdk.adsbase.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(Context context, qd qdVar, AdEventListener adEventListener, lb networkApiExecutor, lb eventTracer, String adm) {
        super(qdVar, networkApiExecutor, context, adEventListener, adm);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(networkApiExecutor, "networkApiExecutor");
        Intrinsics.checkNotNullParameter(eventTracer, "eventTracer");
        Intrinsics.checkNotNullParameter(adm, "adm");
    }

    @Override // com.startapp.sdk.adsbase.d
    public final Object a(String adm) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        try {
            Object objFromJson = JsonParser.fromJson(adm, GetAdResponse.class);
            GetAdResponse getAdResponse = (GetAdResponse) objFromJson;
            Ad ad2 = this.f64041a;
            Intrinsics.checkNotNull(ad2);
            gb gbVar = (gb) ad2;
            gbVar.setAdInfoOverride(getAdResponse.c());
            gbVar.a(u0.a(this.f64043c, getAdResponse.d(), 0, new HashSet(), true));
            return (GetAdResponse) objFromJson;
        } catch (Throwable unused) {
            return null;
        }
    }
}
