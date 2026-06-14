package com.appodeal.ads.services.facebook_analytics;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    public static final Bundle a(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Integer) {
                bundle.putInt(str, ((Number) value).intValue());
            } else if (value instanceof int[]) {
                bundle.putIntArray(str, (int[]) value);
            } else if (value instanceof Long) {
                bundle.putLong(str, ((Number) value).longValue());
            } else if (value instanceof long[]) {
                bundle.putLongArray(str, (long[]) value);
            } else if (value instanceof Double) {
                bundle.putDouble(str, ((Number) value).doubleValue());
            } else if (value instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) value);
            } else if (value instanceof Float) {
                bundle.putFloat(str, ((Number) value).floatValue());
            } else if (value instanceof float[]) {
                bundle.putFloatArray(str, (float[]) value);
            } else if (value instanceof String) {
                bundle.putString(str, (String) value);
            } else if (value instanceof Object[]) {
                Object[] objArr = (Object[]) value;
                ArrayList arrayList2 = new ArrayList(objArr.length);
                for (Object obj : objArr) {
                    arrayList2.add(String.valueOf(obj));
                }
                bundle.putStringArray(str, (String[]) arrayList2.toArray(new String[0]));
            } else if (value instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) value);
            }
            arrayList.add(Unit.f93236a);
        }
        return bundle;
    }
}
