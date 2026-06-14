package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class zo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ao f78664a;

    public zo(C4991bf c4991bf, Do r32, String str) {
        this.f78664a = new Ao(c4991bf, r32, new Bo() { // from class: io.appmetrica.analytics.impl.cr
            @Override // io.appmetrica.analytics.impl.Bo
            public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
                return zo.a(jSONObject, jSONObject2);
            }
        });
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        Boolean bool = Boolean.FALSE;
        jSONObject3.put("first_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "first_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "first_event_done", bool)));
        jSONObject3.put("init_event_done", JsonUtils.optBooleanOrNullable(jSONObject2, "init_event_done", JsonUtils.optBooleanOrNullable(jSONObject, "init_event_done", bool)));
        jSONObject3.put("report_request_id", AbstractC5295nb.a(jSONObject2, "report_request_id", AbstractC5295nb.a(jSONObject, "report_request_id", -1)));
        jSONObject3.put("global_number", JsonUtils.optLongOrDefault(jSONObject2, "global_number", JsonUtils.optLongOrDefault(jSONObject, "global_number", 0L)));
        jSONObject3.put("session_id", JsonUtils.optLongOrDefault(jSONObject2, "session_id", JsonUtils.optLongOrDefault(jSONObject, "session_id", -1L)));
        jSONObject3.put("referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_handled", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_handled", bool)));
        jSONObject3.put("numbers_of_type", JsonUtils.optJsonObjectOrNullable(jSONObject2, "numbers_of_type", JsonUtils.optJsonObjectOrNull(jSONObject, "numbers_of_type")));
        jSONObject3.put("open_id", AbstractC5295nb.a(jSONObject2, "open_id", AbstractC5295nb.a(jSONObject, "open_id", 1)));
        jSONObject3.put("attribution_id", AbstractC5295nb.a(jSONObject2, "attribution_id", AbstractC5295nb.a(jSONObject, "attribution_id", 1)));
        jSONObject3.put("last_migration_api_level", AbstractC5295nb.a(jSONObject2, "last_migration_api_level", AbstractC5295nb.a(jSONObject, "last_migration_api_level", 0)));
        jSONObject3.put("external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject2, "external_attribution_window_start", JsonUtils.optLongOrDefault(jSONObject, "external_attribution_window_start", -1L)));
        return jSONObject3;
    }

    public final synchronized void b(long j10) {
        Ao ao = this.f78664a;
        ao.a(ao.a().put("global_number", j10));
    }

    public final synchronized boolean c() {
        return this.f78664a.a().optBoolean("first_event_done", false);
    }

    public final synchronized boolean d() {
        return this.f78664a.a().optBoolean("init_event_done", false);
    }

    public final synchronized int b() {
        return this.f78664a.a().optInt("open_id", 1);
    }

    public final synchronized void c(long j10) {
        Ao ao = this.f78664a;
        ao.a(ao.a().put("session_id", j10));
    }

    public final synchronized void b(int i10) {
        Ao ao = this.f78664a;
        ao.a(ao.a().put("last_migration_api_level", i10));
    }

    public final synchronized void c(int i10) {
        Ao ao = this.f78664a;
        ao.a(ao.a().put("open_id", i10));
    }

    public final synchronized void a(JSONObject jSONObject) {
        Ao ao = this.f78664a;
        ao.a(ao.a().put("numbers_of_type", jSONObject));
    }

    public final synchronized int a() {
        return this.f78664a.a().optInt("attribution_id", 1);
    }

    public final synchronized void a(int i10) {
        Ao ao = this.f78664a;
        ao.a(ao.a().put("attribution_id", i10));
    }

    public final synchronized void a(long j10) {
        Ao ao = this.f78664a;
        ao.a(ao.a().put("external_attribution_window_start", j10));
    }
}
