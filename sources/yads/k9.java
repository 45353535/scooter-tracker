package yads;

import android.net.Uri;
import com.ironsource.C4240b4;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k9 {
    public static HashMap a(Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        HashMap map2 = new HashMap();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            sb2.append(C4240b4.j.f42670c);
            sb2.append(Uri.encode(str));
            sb2.append(C4240b4.j.f42668b);
            sb2.append(Uri.encode(str2));
            if (sb2.length() > 61440) {
                nt1 nt1Var = bj2.f109020a;
                bj2.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 61440, 61440);
                return map2;
            }
            map2.put(str, str2);
        }
        return map2;
    }

    public static String a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            int length = Uri.encode(str).length();
            if (length <= 1024) {
                return str;
            }
            nt1 nt1Var = bj2.f109020a;
            bj2.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. Current size is %s bytes", 1024, Integer.valueOf(length));
            return null;
        } catch (Exception unused) {
            boolean z10 = lb1.f113032a;
            return null;
        }
    }
}
