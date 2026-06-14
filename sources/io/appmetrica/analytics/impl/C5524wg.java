package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C4240b4;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5524wg {
    public static P7 a(String str) {
        HashMap map;
        HashMap mapB = b(str);
        if (mapB.isEmpty()) {
            mapB = b(Uri.decode(str));
        }
        String strDecode = Uri.decode((String) mapB.get("appmetrica_deep_link"));
        if (TextUtils.isEmpty(strDecode)) {
            map = null;
        } else {
            HashMap mapB2 = b(strDecode);
            map = new HashMap(mapB2.size());
            for (Map.Entry entry : mapB2.entrySet()) {
                map.put(Uri.decode((String) entry.getKey()), Uri.decode((String) entry.getValue()));
            }
        }
        return new P7(strDecode, map, str);
    }

    public static HashMap b(String str) {
        HashMap map = new HashMap();
        if (str != null) {
            int iLastIndexOf = str.lastIndexOf(63);
            if (iLastIndexOf >= 0) {
                str = str.substring(iLastIndexOf + 1);
            }
            if (str.contains(C4240b4.j.f42668b)) {
                for (String str2 : str.split(C4240b4.j.f42670c)) {
                    int iIndexOf = str2.indexOf(C4240b4.j.f42668b);
                    if (iIndexOf >= 0) {
                        map.put(str2.substring(0, iIndexOf), str2.substring(iIndexOf + 1));
                    } else {
                        map.put(str2, "");
                    }
                }
            }
        }
        return map;
    }
}
