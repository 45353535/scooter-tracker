package org.bidon.sdk.config.models;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.k;
import org.bidon.sdk.utils.json.JsonParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/config/models/ConfigResponseParser;", "Lorg/bidon/sdk/utils/json/JsonParser;", "Lorg/bidon/sdk/config/models/ConfigResponse;", "<init>", "()V", "parseOrNull", "jsonString", "", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConfigResponseParser implements JsonParser<ConfigResponse> {
    @Override // org.bidon.sdk.utils.json.JsonParser
    @Nullable
    public ConfigResponse parseOrNull(@NotNull String jsonString) {
        Object objB;
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        try {
            Result.Companion companion = Result.f93230c;
            JSONObject jSONObject = new JSONObject(jsonString).getJSONObject("init");
            long j10 = jSONObject.getLong("tmax");
            JSONObject jSONObject2 = jSONObject.getJSONObject("adapters");
            Iterator<String> itKeys = jSONObject2.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
            Sequence sequenceH = k.h(itKeys);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : sequenceH) {
                linkedHashMap.put(obj, jSONObject2.getJSONObject((String) obj));
            }
            objB = Result.b(new ConfigResponse(j10, linkedHashMap));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        return (ConfigResponse) objB;
    }
}
