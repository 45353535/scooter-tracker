package com.pubmatic.sdk.common.utility;

import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u001c\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¨\u0006\u0006"}, d2 = {"putIfNotEmpty", "Lorg/json/JSONObject;", C4240b4.i.W, "", "value", "putIfNotNullOrEmpty", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public abstract class POBExtensionsKt {
    @NotNull
    public static final JSONObject putIfNotEmpty(@NotNull JSONObject jSONObject, @NotNull String key, @NotNull JSONObject value) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.length() > 0) {
            jSONObject.put(key, value);
        }
        return jSONObject;
    }

    @NotNull
    public static final JSONObject putIfNotNullOrEmpty(@NotNull JSONObject jSONObject, @NotNull String key, @Nullable String str) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (str != null && str.length() != 0) {
            jSONObject.put(key, str);
        }
        return jSONObject;
    }
}
