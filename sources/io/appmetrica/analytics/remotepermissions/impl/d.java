package io.appmetrica.analytics.remotepermissions.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements JsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78933a = "permissions";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78934b = "name";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78935c = "list";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f78936d = "enabled";

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a parse(@NotNull JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        HashSet hashSet = new HashSet();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(this.f78933a);
        if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(this.f78935c)) != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.optBoolean(this.f78936d)) {
                    String strOptString = jSONObjectOptJSONObject2.optString(this.f78934b);
                    if (!TextUtils.isEmpty(strOptString)) {
                        hashSet.add(strOptString);
                    }
                }
            }
        }
        return new a(hashSet);
    }

    @Nullable
    public final a b(@NotNull JSONObject jSONObject) {
        return (a) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (a) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }
}
