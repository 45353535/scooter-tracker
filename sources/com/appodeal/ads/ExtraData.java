package com.appodeal.ads;

import com.appodeal.ads.ext.JsonObjectBuilder;
import com.appodeal.ads.ext.JsonObjectBuilderKt;
import com.ironsource.C4240b4;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/appodeal/ads/ExtraData;", "", "", C4240b4.i.W, "value", "", "putExtra", "(Ljava/lang/String;Ljava/lang/Object;)V", "clear", "()V", "", "isNotEmpty", "()Z", "Lorg/json/JSONObject;", "asJson", "()Lorg/json/JSONObject;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExtraData {

    @NotNull
    public static final ExtraData INSTANCE = new ExtraData();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f11832a = new LinkedHashMap();

    public static final Unit a(JsonObjectBuilder jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "$this$jsonObject");
        for (Map.Entry entry : f11832a.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof JSONObject) {
                jsonObject.hasObject(str, (JSONObject) value);
            } else if (value instanceof JSONArray) {
                jsonObject.hasArray(str, (JSONArray) value);
            } else {
                jsonObject.hasValue(str, value);
            }
        }
        return Unit.f93236a;
    }

    @NotNull
    public final JSONObject asJson() {
        return JsonObjectBuilderKt.jsonObject(new Function1() { // from class: com.appodeal.ads.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ExtraData.a((JsonObjectBuilder) obj);
            }
        });
    }

    public final void clear() {
        f11832a.clear();
    }

    public final boolean isNotEmpty() {
        return !f11832a.isEmpty();
    }

    public final void putExtra(@NotNull String key, @Nullable Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        f11832a.put(key, value);
    }
}
