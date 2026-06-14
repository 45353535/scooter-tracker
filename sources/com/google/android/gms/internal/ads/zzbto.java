package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbto {
    @Nullable
    public static final List zza(JSONObject jSONObject, String str) throws JSONException {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            arrayList.add(jSONArrayOptJSONArray.getString(i10));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }
}
