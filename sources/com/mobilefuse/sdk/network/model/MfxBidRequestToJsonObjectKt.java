package com.mobilefuse.sdk.network.model;

import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toJsonObject", "Lorg/json/JSONObject;", "Lcom/mobilefuse/sdk/network/model/MfxBidRequest;", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
public final class MfxBidRequestToJsonObjectKt {
    @NotNull
    public static final JSONObject toJsonObject(@NotNull MfxBidRequest toJsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(toJsonObject, "$this$toJsonObject");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : MfxBidRequestToMapKt.toMap(toJsonObject, false).entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        if (!toJsonObject.getEidValues().isEmpty()) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, String> entry2 : toJsonObject.getEidValues().entrySet()) {
                jSONObject2.put(entry2.getKey(), entry2.getValue());
            }
            jSONObject.put(TelemetryCategory.EID, jSONObject2);
        }
        return jSONObject;
    }
}
