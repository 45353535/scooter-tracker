package com.vungle.ads.internal.util;

import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/vungle/ads/internal/util/JsonUtil;", "", "()V", "getContentStringValue", "", "json", "Lkotlinx/serialization/json/JsonObject;", C4240b4.i.W, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class JsonUtil {

    @NotNull
    public static final JsonUtil INSTANCE = new JsonUtil();

    private JsonUtil() {
    }

    @Nullable
    public final String getContentStringValue(@NotNull JsonObject json, @NotNull String key) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return j.j((JsonElement) MapsKt.getValue(json, key)).e();
        } catch (Exception unused) {
            return null;
        }
    }
}
