package com.yandex.div.internal.util;

import androidx.activity.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\f\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "R", "Lorg/json/JSONArray;", "", "asList", "(Lorg/json/JSONArray;)Ljava/util/List;", "Lorg/json/JSONObject;", "", "indentSpaces", "", "summary", "(Lorg/json/JSONObject;I)Ljava/lang/String;", "(Lorg/json/JSONArray;I)Ljava/lang/String;", "", "isEmpty", "(Lorg/json/JSONObject;)Z", "div-data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class JsonUtilsKt {
    @NotNull
    public static final <R> List<R> asList(@NotNull JSONArray jSONArray) throws JSONException {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            if (!s.a(obj)) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean isEmpty(@NotNull JSONObject jSONObject) {
        return jSONObject.length() == 0;
    }

    @NotNull
    public static final String summary(@NotNull JSONObject jSONObject, int i10) {
        return new JsonPrinter(i10, 1).print(jSONObject);
    }

    public static /* synthetic */ String summary$default(JSONObject jSONObject, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return summary(jSONObject, i10);
    }

    @NotNull
    public static final String summary(@NotNull JSONArray jSONArray, int i10) {
        return new JsonPrinter(i10, 1).print(jSONArray);
    }

    public static /* synthetic */ String summary$default(JSONArray jSONArray, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return summary(jSONArray, i10);
    }
}
