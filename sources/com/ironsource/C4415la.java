package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.la, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4415la {
    public static Map<String, Object> a(Object[][] objArr) {
        HashMap map = new HashMap();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    map.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                C4462o4.d().a(e10);
            }
        }
        return map;
    }
}
