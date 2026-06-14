package com.inmobi.media;

import java.util.Calendar;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.z8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4201z8 {
    public static HashMap a() {
        String str;
        HashMap map = new HashMap();
        try {
            map.put("mk-version", Ki.a());
            C4044t1 c4044t1 = AbstractC4213zk.f40073a;
            Boolean bool = c4044t1 != null ? c4044t1.f39573c : null;
            if (bool != null) {
                map.put("u-id-adt", bool.booleanValue() ? "1" : "0");
            }
            map.put("ts", String.valueOf(Calendar.getInstance().getTimeInMillis()));
            Calendar calendar = Calendar.getInstance();
            map.put("tz", String.valueOf(calendar.get(16) + calendar.get(15)));
            Qi.f37598a.getClass();
            HashMap map2 = new HashMap();
            if (Qi.f37602e && (str = Qi.f37601d) != null) {
                map2.put("u-s-id", str);
            }
            map.putAll(map2);
            return map;
        } catch (Exception e10) {
            Intrinsics.checkNotNullExpressionValue("z8", "TAG");
            e10.getMessage();
            return map;
        }
    }
}
