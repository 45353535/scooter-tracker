package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.ho;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class cv extends cz {
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Field m6078(List<Object> list) {
        return hu.m6637().m6640().m6586((Class) cz.m6139(list, 0, Class.class), (String) cz.m6139(list, 1, String.class));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Field m6080(List<Object> list) {
        if (!(list.get(0) instanceof Class)) {
            Object objM6139 = cz.m6139(list, 0, Object.class);
            return hu.m6637().m6640().m6588(objM6139.getClass(), (Class) cz.m6139(list, 1, Class.class));
        }
        Class cls = (Class) cz.m6139(list, 0, Class.class);
        if (list.get(1) instanceof Class) {
            return hu.m6637().m6640().m6588(cls, (Class) cz.m6139(list, 1, Class.class));
        }
        return hu.m6637().m6640().m6587(cls, (ho) cz.m6139(list, 1, ho.class));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static List<Field> m6081(List<Object> list) {
        if (!(list.get(0) instanceof Class)) {
            Object objM6139 = cz.m6139(list, 0, Object.class);
            boolean zBooleanValue = list.size() > 1 ? ((Boolean) cz.m6139(list, 1, Boolean.class)).booleanValue() : false;
            hu.m6637().m6640();
            Field[] fieldArrM6583 = hq.m6583(objM6139.getClass(), zBooleanValue, -1, null);
            if (fieldArrM6583 != null) {
                return Arrays.asList(fieldArrM6583);
            }
        } else if (list.size() > 1) {
            return hu.m6637().m6640().m6589((Class) cz.m6139(list, 0, Class.class), (ho) cz.m6139(list, 1, ho.class));
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Field m6082(List<Object> list) {
        return hu.m6637().m6640().m6587((Class) cz.m6139(list, 0, Class.class), (ho) cz.m6139(list, 1, ho.class));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static ho.a m6079() {
        hu.m6637().m6640();
        return hq.m6584();
    }
}
