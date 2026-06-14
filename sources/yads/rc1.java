package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class rc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kotlinx.serialization.json.b f115402a = kotlinx.serialization.json.v.b(null, qc1.f114941b, 1, null);

    public static final Integer a(String str, JSONObject jSONObject) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(Integer.valueOf(jSONObject.getInt(str)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        return (Integer) objB;
    }

    public static List b(String str, JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        int length = jSONArrayOptJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            String strOptString = jSONArrayOptJSONArray.optString(i10);
            if (strOptString != null && strOptString.length() != 0 && !Intrinsics.areEqual("null", strOptString)) {
                listCreateListBuilder.add(strOptString);
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    public static Map a(JSONObject jSONObject) {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next);
            if (strOptString != null && strOptString.length() != 0 && !Intrinsics.areEqual("null", strOptString)) {
                mapCreateMapBuilder.put(next, strOptString);
            }
        }
        return MapsKt.build(mapCreateMapBuilder);
    }

    public static kotlinx.serialization.json.b a() {
        return f115402a;
    }

    public static final JSONObject a(String str) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(new JSONObject(str));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        return (JSONObject) objB;
    }
}
