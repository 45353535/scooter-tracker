package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.C5245lb;
import io.appmetrica.analytics.impl.C5248le;
import io.appmetrica.analytics.impl.C5348pe;
import io.appmetrica.analytics.impl.Hc;
import io.appmetrica.analytics.impl.Q9;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ExternalAttributions {
    @NonNull
    public static ExternalAttribution adjust(@Nullable Object obj) {
        return obj == null ? new C5248le(Q9.ADJUST) : new C5348pe(Q9.ADJUST, obj);
    }

    @NonNull
    public static ExternalAttribution airbridge(@Nullable Map<String, String> map) {
        return map == null ? new C5248le(Q9.AIRBRIDGE) : new Hc(Q9.AIRBRIDGE, map);
    }

    @NonNull
    public static ExternalAttribution appsflyer(@Nullable Map<String, Object> map) {
        return map == null ? new C5248le(Q9.APPSFLYER) : new Hc(Q9.APPSFLYER, map);
    }

    @NonNull
    public static ExternalAttribution kochava(@Nullable JSONObject jSONObject) {
        return jSONObject == null ? new C5248le(Q9.KOCHAVA) : new C5245lb(Q9.KOCHAVA, jSONObject);
    }

    @NonNull
    public static ExternalAttribution singular(@Nullable Map<String, Object> map) {
        return map == null ? new C5248le(Q9.SINGULAR) : new Hc(Q9.SINGULAR, map);
    }

    @NonNull
    public static ExternalAttribution tenjin(@Nullable Map<String, String> map) {
        return map == null ? new C5248le(Q9.TENJIN) : new Hc(Q9.TENJIN, map);
    }
}
