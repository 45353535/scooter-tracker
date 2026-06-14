package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.purchase.ADJPConstants;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5370qb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f78059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f78061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f78062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f78063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f78064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f78065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f78066h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CounterConfigurationReporterType f78067i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f78068j;

    public C5370qb(@NonNull String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f78059a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f78060b = jSONObject2.getString("name");
        this.f78061c = jSONObject2.getInt("bytes_truncated");
        this.f78068j = JsonUtils.optStringOrNull(jSONObject2, ADJPConstants.KEY_ENVIRONMENT);
        String strOptString = jSONObject2.optString("trimmed_fields");
        this.f78062d = new HashMap();
        if (strOptString != null) {
            try {
                HashMap mapC = AbstractC5295nb.c(strOptString);
                if (mapC != null) {
                    for (Map.Entry entry : mapC.entrySet()) {
                        this.f78062d.put(T3.valueOf((String) entry.getKey()), Integer.valueOf(Integer.parseInt((String) entry.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f78063e = jSONObject3.getString("package_name");
        this.f78064f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.f78065g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f78066h = jSONObject4.getString("api_key");
        this.f78067i = a(jSONObject4);
    }

    public final String a() {
        return this.f78066h;
    }

    public final int b() {
        return this.f78061c;
    }

    public final byte[] c() {
        return this.f78059a;
    }

    @Nullable
    public final String d() {
        return this.f78068j;
    }

    public final String e() {
        return this.f78060b;
    }

    public final String f() {
        return this.f78063e;
    }

    public final Integer g() {
        return this.f78064f;
    }

    public final String h() {
        return this.f78065g;
    }

    @NonNull
    public final CounterConfigurationReporterType i() {
        return this.f78067i;
    }

    @NonNull
    public final HashMap<T3, Integer> j() {
        return this.f78062d;
    }

    public final String k() throws JSONException {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f78062d.entrySet()) {
            map.put(((T3) entry.getKey()).name(), (Integer) entry.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f78064f).put("psid", this.f78065g).put("package_name", this.f78063e)).put("reporter_configuration", new JSONObject().put("api_key", this.f78066h).put("reporter_type", this.f78067i.getStringValue())).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f78059a, 0)).put("name", this.f78060b).put("bytes_truncated", this.f78061c).put("trimmed_fields", AbstractC5295nb.b(map)).putOpt(ADJPConstants.KEY_ENVIRONMENT, this.f78068j)).toString();
    }

    public static CounterConfigurationReporterType a(JSONObject jSONObject) {
        return jSONObject.has("reporter_type") ? CounterConfigurationReporterType.fromStringValue(jSONObject.getString("reporter_type")) : CounterConfigurationReporterType.MAIN;
    }

    public C5370qb(@NonNull W5 w52, @NonNull P3 p32, @Nullable HashMap<T3, Integer> map) {
        this.f78059a = w52.getValueBytes();
        this.f78060b = w52.getName();
        this.f78061c = w52.getBytesTruncated();
        if (map != null) {
            this.f78062d = map;
        } else {
            this.f78062d = new HashMap();
        }
        Gf gfA = p32.a();
        this.f78063e = gfA.e();
        this.f78064f = gfA.f();
        this.f78065g = gfA.g();
        CounterConfiguration counterConfigurationB = p32.b();
        this.f78066h = counterConfigurationB.getApiKey();
        this.f78067i = counterConfigurationB.getReporterType();
        this.f78068j = w52.f();
    }
}
