package com.ironsource.adqualitysdk.sdk.i;

import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes10.dex */
public final class dd extends cz {
    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static String m6155(List<Object> list) {
        return kc.m7148((String) cz.m6139(list, 0, String.class));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static List<String> m6156(List<Object> list) {
        String str = (String) cz.m6139(list, 0, String.class);
        return list.get(1) instanceof String ? kc.m7155(str, (String) cz.m6139(list, 1, String.class)) : kc.m7156(str, new JSONArray((Collection) cz.m6139(list, 1, List.class)));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m6157(List<Object> list) {
        return kc.m7154((String) cz.m6139(list, 0, String.class));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static List<String> m6158(List<Object> list) {
        return hu.m6637().m6639().m6742(cz.m6139(list, 0, Object.class), (List<String>) cz.m6139(list, 1, List.class), ((Integer) cz.m6139(list, 2, Integer.class)).intValue());
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static String m6159(List<Object> list) {
        String str = (String) cz.m6139(list, 0, String.class);
        boolean zBooleanValue = list.size() > 2 ? ((Boolean) cz.m6139(list, 2, Boolean.class)).booleanValue() : true;
        return list.get(1) instanceof String ? kc.m7149(str, (String) cz.m6139(list, 1, String.class), zBooleanValue) : kc.m7158(str, new JSONArray((Collection) cz.m6139(list, 1, List.class)), zBooleanValue);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static int m6160(List<Object> list) {
        return kc.m7147((String) cz.m6139(list, 0, String.class), (String) cz.m6139(list, 1, String.class));
    }
}
