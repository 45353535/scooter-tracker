package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.sd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4538sd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<LevelPlay.AdFormat, a> f44920a;

    /* JADX INFO: renamed from: com.ironsource.sd$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Map<String, b> f44921a;

        public a(@NotNull JSONObject adFormatProviderOrder) throws JSONException {
            Intrinsics.checkNotNullParameter(adFormatProviderOrder, "adFormatProviderOrder");
            List<String> listB = C4365ia.b(adFormatProviderOrder.names());
            listB = listB == null ? CollectionsKt.emptyList() : listB;
            LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listB, 10)), 16));
            for (Object obj : listB) {
                JSONArray jSONArrayOptJSONArray = adFormatProviderOrder.optJSONArray((String) obj);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                } else {
                    Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray, "adFormatProviderOrder.op…(adUnitId) ?: JSONArray()");
                }
                linkedHashMap.put(obj, new b(jSONArrayOptJSONArray));
            }
            this.f44921a = linkedHashMap;
        }

        @NotNull
        public final Map<String, b> a() {
            return this.f44921a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.sd$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<String> f44922a;

        public b(@NotNull JSONArray providerOrder) throws JSONException {
            Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
            List<String> listB = C4365ia.b(providerOrder);
            Intrinsics.checkNotNullExpressionValue(listB, "jsonArrayToStringList(providerOrder)");
            this.f44922a = listB;
        }

        @NotNull
        public final List<String> a() {
            return this.f44922a;
        }
    }

    public C4538sd(@NotNull JSONObject providerOrder) {
        Intrinsics.checkNotNullParameter(providerOrder, "providerOrder");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(adFormatArrValues.length), 16));
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            JSONObject jSONObjectOptJSONObject = providerOrder.optJSONObject(C4456nf.a(adFormat));
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            } else {
                Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject, "providerOrder.optJSONObj…dFormat)) ?: JSONObject()");
            }
            linkedHashMap.put(adFormat, new a(jSONObjectOptJSONObject));
        }
        this.f44920a = linkedHashMap;
    }

    @NotNull
    public final Map<LevelPlay.AdFormat, a> a() {
        return this.f44920a;
    }
}
