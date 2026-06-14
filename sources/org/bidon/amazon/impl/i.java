package org.bidon.amazon.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.amazon.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class i {
    public final Map a(JSONObject jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        JSONArray jSONArray = jsonObject.getJSONArray("slots");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                Result.Companion companion = Result.f93230c;
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                String string = jSONObject.getString("format");
                f.a aVar = org.bidon.amazon.f.f97031c;
                Intrinsics.checkNotNull(string);
                org.bidon.amazon.f fVarA = aVar.a(string);
                if (fVarA == null) {
                    throw new IllegalStateException(("Unknown slot type " + string).toString());
                }
                String string2 = jSONObject.getString("slot_uuid");
                List listEmptyList = (List) mapCreateMapBuilder.get(fVarA);
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                Result.b((List) mapCreateMapBuilder.put(fVarA, CollectionsKt.plus((Collection<? extends String>) listEmptyList, string2)));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                Result.b(kotlin.d.a(th2));
            }
        }
        return MapsKt.build(mapCreateMapBuilder);
    }
}
