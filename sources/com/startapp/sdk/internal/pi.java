package com.startapp.sdk.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.startapp.json.JsonParser;
import com.startapp.json.TypeParser;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class pi<T> implements TypeParser<List<T>> {
    private static final String LOG_TAG = "pi";

    @NonNull
    private final Class<T> itemClass;

    public pi(Class cls) {
        this.itemClass = cls;
    }

    @Override // com.startapp.json.TypeParser
    @Nullable
    public List<T> parse(@NonNull Class<List<T>> cls, @Nullable Object obj) {
        int length;
        i7 oiVar;
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            length = jSONArray.length();
            oiVar = new ni(jSONArray);
        } else {
            if (!(obj instanceof JSONObject)) {
                return null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            length = jSONObject.length();
            oiVar = new oi(jSONObject);
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            try {
                arrayList.add(JsonParser.fromJsonObject((JSONObject) oiVar.a(Integer.valueOf(i10)), this.itemClass));
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }
}
