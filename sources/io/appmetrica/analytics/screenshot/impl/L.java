package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class L implements JsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f78963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X f78964b;

    public L() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J parse(@NotNull JSONObject jSONObject) {
        N n10;
        P p10;
        Q q10;
        boolean zExtractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject, "screenshot", AbstractC5621o.f79037a);
        Y y10 = this.f78963a;
        X x10 = this.f78964b;
        x10.getClass();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("screenshot");
        if (jSONObjectOptJSONObject == null) {
            q10 = new Q();
            q10.f78976a = new N();
            q10.f78977b = new P();
            O o10 = new O();
            o10.f78971c = AbstractC5621o.f79038b;
            q10.f78978c = o10;
        } else {
            Q q11 = new Q();
            x10.f78986a.getClass();
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("api_captor_config");
            O o11 = null;
            if (jSONObjectOptJSONObject2 == null) {
                n10 = null;
            } else {
                n10 = new N();
                Boolean boolOptBooleanOrNull = JsonUtils.optBooleanOrNull(jSONObjectOptJSONObject2, "enabled");
                if (boolOptBooleanOrNull != null) {
                    n10.f78967a = boolOptBooleanOrNull.booleanValue();
                }
            }
            if (n10 != null) {
                q11.f78976a = n10;
            }
            x10.f78987b.getClass();
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("service_captor_config");
            if (jSONObjectOptJSONObject3 == null) {
                p10 = null;
            } else {
                p10 = new P();
                Boolean boolOptBooleanOrNull2 = JsonUtils.optBooleanOrNull(jSONObjectOptJSONObject3, "enabled");
                if (boolOptBooleanOrNull2 != null) {
                    p10.f78973a = boolOptBooleanOrNull2.booleanValue();
                }
                Long lOptLongOrNull = JsonUtils.optLongOrNull(jSONObjectOptJSONObject3, "delay_seconds");
                if (lOptLongOrNull != null) {
                    p10.f78974b = lOptLongOrNull.longValue();
                }
            }
            if (p10 != null) {
                q11.f78977b = p10;
            }
            x10.f78988c.getClass();
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("content_observer_captor_config");
            if (jSONObjectOptJSONObject4 != null) {
                o11 = new O();
                Boolean boolOptBooleanOrNull3 = JsonUtils.optBooleanOrNull(jSONObjectOptJSONObject4, "enabled");
                if (boolOptBooleanOrNull3 != null) {
                    o11.f78969a = boolOptBooleanOrNull3.booleanValue();
                }
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject4.optJSONArray("media_store_column_names");
                if (jSONArrayOptJSONArray != null) {
                    IntRange intRangeV = kotlin.ranges.g.v(0, jSONArrayOptJSONArray.length());
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeV, 10));
                    Iterator it = intRangeV.iterator();
                    while (it.hasNext()) {
                        arrayList.add(jSONArrayOptJSONArray.getString(((IntIterator) it).nextInt()));
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    o11.f78971c = (String[]) array;
                }
                Long lOptLongOrNull2 = JsonUtils.optLongOrNull(jSONObjectOptJSONObject4, "detect_window_seconds");
                if (lOptLongOrNull2 != null) {
                    o11.f78970b = lOptLongOrNull2.longValue();
                }
            }
            if (o11 != null) {
                q11.f78978c = o11;
            }
            q10 = q11;
        }
        return new J(zExtractFeature, y10.toModel(q10));
    }

    @Nullable
    public final J b(@NotNull JSONObject jSONObject) {
        return (J) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (J) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    public L(@NotNull Y y10, @NotNull X x10) {
        this.f78963a = y10;
        this.f78964b = x10;
    }

    public /* synthetic */ L(Y y10, X x10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Y(null, null, null, 7, null) : y10, (i10 & 2) != 0 ? new X() : x10);
    }
}
