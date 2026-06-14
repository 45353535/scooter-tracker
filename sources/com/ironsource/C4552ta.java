package com.ironsource;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4552ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f45490a = 100;

    public static final boolean a(@NotNull JSONObject lhs, @NotNull JSONObject rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        return a(lhs, rhs, 0);
    }

    public static final boolean a(@NotNull JSONArray lhs, @NotNull JSONArray rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        return a(lhs, rhs, 0);
    }

    private static final boolean a(JSONObject jSONObject, JSONObject jSONObject2, int i10) {
        if (jSONObject == jSONObject2) {
            return true;
        }
        if (jSONObject.length() != jSONObject2.length() || i10 > 100) {
            return false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "lhs.keys()");
        for (String str : kotlin.sequences.k.h(itKeys)) {
            if (!jSONObject2.has(str) || !a(jSONObject.get(str), jSONObject2.get(str), i10)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean a(JSONArray jSONArray, JSONArray jSONArray2, int i10) {
        if (jSONArray == jSONArray2) {
            return true;
        }
        if (jSONArray.length() != jSONArray2.length() || i10 > 100) {
            return false;
        }
        Iterable iterableV = kotlin.ranges.g.v(0, jSONArray.length());
        if (!(iterableV instanceof Collection) || !((Collection) iterableV).isEmpty()) {
            Iterator it = iterableV.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                if (!a(jSONArray.get(iNextInt), jSONArray2.get(iNextInt), i10)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static final boolean a(Object obj, Object obj2, int i10) {
        if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
            return a((JSONObject) obj, (JSONObject) obj2, i10 + 1);
        }
        if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
            return a((JSONArray) obj, (JSONArray) obj2, i10 + 1);
        }
        if ((obj instanceof Number) && (obj2 instanceof Number)) {
            return ((Number) obj).doubleValue() == ((Number) obj2).doubleValue();
        }
        return Intrinsics.areEqual(obj, obj2);
    }
}
