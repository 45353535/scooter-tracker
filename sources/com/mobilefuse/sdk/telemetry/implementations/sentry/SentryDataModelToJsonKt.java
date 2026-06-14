package com.mobilefuse.sdk.telemetry.implementations.sentry;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.foundation.entity.b;
import com.mobilefuse.sdk.telemetry.TelemetryBreadcrumb;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\b\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\n\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\f\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"json", "Lorg/json/JSONObject;", "Lcom/mobilefuse/sdk/telemetry/TelemetryBreadcrumb;", "getJson", "(Lcom/mobilefuse/sdk/telemetry/TelemetryBreadcrumb;)Lorg/json/JSONObject;", "Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryBreadcrumbs;", "(Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryBreadcrumbs;)Lorg/json/JSONObject;", "Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryEvent;", "(Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryEvent;)Lorg/json/JSONObject;", "Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryException;", "(Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryException;)Lorg/json/JSONObject;", "Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryStackFrame;", "(Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryStackFrame;)Lorg/json/JSONObject;", "Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryStackTrace;", "(Lcom/mobilefuse/sdk/telemetry/implementations/sentry/SentryStackTrace;)Lorg/json/JSONObject;", "mobilefuse-sdk-telemetry_release"}, k = 2, mv = {1, 4, 3})
public final class SentryDataModelToJsonKt {
    @NotNull
    public static final JSONObject getJson(@NotNull SentryEvent json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "$this$json");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_id", json.getEventId());
        jSONObject.put("timestamp", json.getTimestamp());
        jSONObject.put(PglCryptUtils.KEY_MESSAGE, json.getMessage());
        jSONObject.put("exception", getJson(json.getException()));
        jSONObject.put("platform", json.getPlatform());
        if (!json.getModules().isEmpty()) {
            jSONObject.put("modules", SentryHelpersKt.getJsonWithStringValues(json.getModules()));
        }
        if (!json.getExtra().isEmpty()) {
            jSONObject.put("extra", SentryHelpersKt.getJsonWithStringValues(json.getExtra()));
        }
        String release = json.getRelease();
        if (release != null) {
            jSONObject.put("release", release);
        }
        String culprit = json.getCulprit();
        if (culprit != null) {
            jSONObject.put("culprit", culprit);
        }
        SentryBreadcrumbs breadcrumbs = json.getBreadcrumbs();
        if (breadcrumbs != null && !breadcrumbs.getValues().isEmpty()) {
            jSONObject.put("breadcrumbs", getJson(breadcrumbs));
        }
        return jSONObject;
    }

    @NotNull
    public static final JSONObject getJson(@NotNull SentryException json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "$this$json");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", json.getType());
        jSONObject.put("value", json.getValue());
        jSONObject.put("module", json.getModule());
        JSONObject jSONObjectPut = jSONObject.put("stacktrace", getJson(json.getStacktrace()));
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "run {\n        with(JSONO…ace.json)\n        }\n    }");
        return jSONObjectPut;
    }

    @NotNull
    public static final JSONObject getJson(@NotNull SentryStackTrace json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "$this$json");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = json.getFrames().iterator();
        while (it.hasNext()) {
            jSONArray.put(getJson((SentryStackFrame) it.next()));
        }
        JSONObject jSONObjectPut = jSONObject.put(b.JSON_KEY_FRAME_ADS, jSONArray);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "run {\n        with(JSONO…mesArray)\n        }\n    }");
        return jSONObjectPut;
    }

    @NotNull
    public static final JSONObject getJson(@NotNull SentryStackFrame json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "$this$json");
        JSONObject jSONObject = new JSONObject();
        if (json.getFunction().length() > 0) {
            jSONObject.put("function", json.getFunction());
        }
        if (json.getFilename().length() > 0) {
            jSONObject.put("filename", json.getFilename());
        }
        if (json.getModule().length() > 0) {
            jSONObject.put("module", json.getModule());
        }
        JSONObject jSONObjectPut = jSONObject.put("lineno", json.getLineNumber());
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "run {\n        with(JSONO…neNumber)\n        }\n    }");
        return jSONObjectPut;
    }

    @NotNull
    public static final JSONObject getJson(@NotNull TelemetryBreadcrumb json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "$this$json");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timestamp", json.getTimestamp() / ((long) 1000));
        jSONObject.put(PglCryptUtils.KEY_MESSAGE, json.getMessage());
        jSONObject.put("category", json.getCategory());
        Map<String, Object> data = json.getData();
        if (data != null) {
            jSONObject.put("data", SentryHelpersKt.getJsonWithStringValues(data));
        }
        return jSONObject;
    }

    @NotNull
    public static final JSONObject getJson(@NotNull SentryBreadcrumbs json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "$this$json");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = json.getValues().iterator();
        while (it.hasNext()) {
            jSONArray.put(getJson((TelemetryBreadcrumb) it.next()));
        }
        JSONObject jSONObjectPut = jSONObject.put("values", jSONArray);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "run {\n        with(JSONO…uesArray)\n        }\n    }");
        return jSONObjectPut;
    }
}
