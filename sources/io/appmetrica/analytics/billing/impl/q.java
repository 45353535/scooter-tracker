package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.BillingConfig;
import io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class q implements JsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f74986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f74987b;

    public q() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final RemoteBillingConfig parse(@NotNull JSONObject jSONObject) {
        s sVar;
        g gVar = this.f74986a;
        this.f74987b.getClass();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("auto_inapp_collecting");
        if (jSONObjectOptJSONObject == null) {
            sVar = new s();
        } else {
            s sVar2 = new s();
            Integer numOptIntOrNull = JsonUtils.optIntOrNull(jSONObjectOptJSONObject, "send_frequency_seconds");
            if (numOptIntOrNull != null) {
                sVar2.f74990a = numOptIntOrNull.intValue();
            }
            Integer numOptIntOrNull2 = JsonUtils.optIntOrNull(jSONObjectOptJSONObject, "first_collecting_inapp_max_age_seconds");
            if (numOptIntOrNull2 != null) {
                sVar2.f74991b = numOptIntOrNull2.intValue();
            }
            sVar = sVar2;
        }
        gVar.getClass();
        return new RemoteBillingConfig(true, new BillingConfig(sVar.f74990a, sVar.f74991b));
    }

    @Nullable
    public final RemoteBillingConfig b(@NotNull JSONObject jSONObject) {
        return (RemoteBillingConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (RemoteBillingConfig) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    public q(@NotNull g gVar, @NotNull f fVar) {
        this.f74986a = gVar;
        this.f74987b = fVar;
    }

    public /* synthetic */ q(g gVar, f fVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new g() : gVar, (i10 & 2) != 0 ? new f() : fVar);
    }
}
