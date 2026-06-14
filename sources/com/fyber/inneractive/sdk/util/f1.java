package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import com.ironsource.C4240b4;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class f1 {
    public static String a(String str, HashMap map) {
        StringBuilder sb2 = new StringBuilder(str);
        boolean z10 = true;
        for (Map.Entry entry : map.entrySet()) {
            sb2.append(z10 ? "?" : C4240b4.j.f42670c);
            sb2.append((String) entry.getKey());
            sb2.append(C4240b4.j.f42668b);
            sb2.append(Uri.encode((String) entry.getValue()));
            z10 = false;
        }
        return sb2.toString();
    }
}
