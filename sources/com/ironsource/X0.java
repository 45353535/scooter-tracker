package com.ironsource;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class X0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f42006b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f42007c = "adUnits";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final JSONObject f42008a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public X0(@NotNull JSONObject configurations) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        this.f42008a = configurations.optJSONObject(f42007c);
    }

    @NotNull
    public final <T> Map<String, T> a(@NotNull Function1<? super JSONObject, ? extends T> valueExtractor) throws JSONException {
        Intrinsics.checkNotNullParameter(valueExtractor, "valueExtractor");
        JSONObject jSONObject = this.f42008a;
        if (jSONObject == null) {
            return MapsKt.emptyMap();
        }
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "adUnits.keys()");
        Sequence sequenceH = kotlin.sequences.k.h(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequenceH) {
            JSONObject jSONObject2 = jSONObject.getJSONObject((String) obj);
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "adUnits.getJSONObject(adUnitId)");
            linkedHashMap.put(obj, valueExtractor.invoke(jSONObject2));
        }
        return linkedHashMap;
    }
}
