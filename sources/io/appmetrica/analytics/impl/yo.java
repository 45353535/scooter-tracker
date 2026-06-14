package io.appmetrica.analytics.impl;

import android.util.Base64;
import com.adjust.sdk.Constants;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class yo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ao f78594a;

    public yo(C5068ef c5068ef, C5167ia c5167ia) {
        this.f78594a = new Ao(c5068ef, c5167ia, new Bo() { // from class: io.appmetrica.analytics.impl.br
            @Override // io.appmetrica.analytics.impl.Bo
            public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
                return yo.a(jSONObject, jSONObject2);
            }
        });
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("device_id", JsonUtils.optStringOrNullable(jSONObject2, "device_id", JsonUtils.optStringOrNull(jSONObject, "device_id")));
        jSONObject3.put("device_id_hash", JsonUtils.optStringOrNullable(jSONObject2, "device_id_hash", JsonUtils.optStringOrNull(jSONObject, "device_id_hash")));
        jSONObject3.put(Constants.REFERRER, JsonUtils.optStringOrNullable(jSONObject2, Constants.REFERRER, JsonUtils.optStringOrNull(jSONObject, Constants.REFERRER)));
        jSONObject3.put("referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_checked", Boolean.FALSE)));
        jSONObject3.put("last_migration_api_level", AbstractC5295nb.a(jSONObject2, "last_migration_api_level", AbstractC5295nb.a(jSONObject, "last_migration_api_level", -1)));
        return jSONObject3;
    }

    public final synchronized void b(String str) {
        Ao ao = this.f78594a;
        ao.a(ao.a().put("device_id_hash", str));
    }

    public final synchronized boolean c() {
        return this.f78594a.a().optBoolean("referrer_checked", false);
    }

    public final synchronized void d() {
        Ao ao = this.f78594a;
        ao.a(ao.a().put("referrer_checked", true));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized io.appmetrica.analytics.impl.C5424sg b() {
        /*
            r2 = this;
            monitor-enter(r2)
            io.appmetrica.analytics.impl.Ao r0 = r2.f78594a     // Catch: java.lang.Throwable -> L29
            org.json.JSONObject r0 = r0.a()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "referrer"
            java.lang.String r0 = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(r0, r1)     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L26
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Throwable -> L26
            byte[] r0 = r0.getBytes(r1)     // Catch: java.lang.Throwable -> L26
            r1 = 0
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L26
            int r1 = r0.length     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L20
            goto L26
        L20:
            io.appmetrica.analytics.impl.sg r1 = new io.appmetrica.analytics.impl.sg     // Catch: java.lang.Throwable -> L26
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L26
            goto L27
        L26:
            r1 = 0
        L27:
            monitor-exit(r2)
            return r1
        L29:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L29
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.yo.b():io.appmetrica.analytics.impl.sg");
    }

    public final synchronized void a(String str) {
        Ao ao = this.f78594a;
        ao.a(ao.a().put("device_id", str));
    }

    public final synchronized String a() {
        return JsonUtils.optStringOrNull(this.f78594a.a(), "device_id_hash");
    }

    public final synchronized void a(C5424sg c5424sg) {
        try {
            Ao ao = this.f78594a;
            ao.a(ao.a().put(Constants.REFERRER, c5424sg != null ? new String(Base64.encode(c5424sg.a(), 0), Charsets.UTF_8) : null));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
