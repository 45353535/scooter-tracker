package com.appodeal.ads;

import com.ironsource.C4240b4;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class qc extends ed {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f14306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.appodeal.ads.networking.binders.s[] f14308e;

    public qc(List eventsIds) {
        Intrinsics.checkNotNullParameter(eventsIds, "eventsIds");
        this.f14306c = eventsIds;
        this.f14307d = "mark_event_sent";
        com.appodeal.ads.networking.binders.s.f14082b.getClass();
        this.f14308e = (com.appodeal.ads.networking.binders.s[]) com.appodeal.ads.networking.binders.s.f14083c.toArray(new com.appodeal.ads.networking.binders.s[0]);
    }

    @Override // com.appodeal.ads.ed
    public final Object a(Continuation continuation) throws JSONException {
        z8 z8Var = new z8();
        JSONArray jSONArray = new JSONArray((Collection) this.f14306c);
        Intrinsics.checkNotNullParameter("service_events", C4240b4.i.W);
        ((JSONObject) z8Var.f15309b.getValue()).put("service_events", jSONArray);
        com.appodeal.ads.networking.binders.s[] sVarArr = this.f14308e;
        return z8Var.a((com.appodeal.ads.networking.binders.s[]) Arrays.copyOf(sVarArr, sVarArr.length), (kotlin.coroutines.jvm.internal.d) continuation);
    }

    @Override // com.appodeal.ads.networking.b0
    public final String c() {
        return this.f14307d;
    }

    @Override // com.appodeal.ads.ed
    public final com.appodeal.ads.networking.binders.s[] d() {
        return this.f14308e;
    }
}
