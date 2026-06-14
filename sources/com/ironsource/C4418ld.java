package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4418ld {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f43558b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f43559c = "placements";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String f43560d = "placementName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final JSONArray f43561a;

    /* JADX INFO: renamed from: com.ironsource.ld$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C4418ld(@NotNull JSONObject configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f43561a = configuration.optJSONArray(f43559c);
    }

    @NotNull
    public final <T> Map<String, T> a(@NotNull Function1<? super JSONObject, ? extends T> valueExtractor) throws JSONException {
        Intrinsics.checkNotNullParameter(valueExtractor, "valueExtractor");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray jSONArray = this.f43561a;
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jsonObject = jSONArray.getJSONObject(i10);
                String key = jsonObject.optString("placementName");
                Intrinsics.checkNotNullExpressionValue(jsonObject, "jsonObject");
                T tInvoke = valueExtractor.invoke(jsonObject);
                Intrinsics.checkNotNullExpressionValue(key, "key");
                linkedHashMap.put(key, tInvoke);
            }
        }
        return linkedHashMap;
    }
}
