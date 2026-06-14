package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes10.dex */
public class f0 {
    public static void mia(Context context, String str) {
        String str2 = null;
        try {
            Object objInvoke = context.getClass().getMethod(k0.a("HF5TNFK/J75/JczQhFKsJr5B"), null).invoke(context, null);
            if (objInvoke != null) {
                Method method = objInvoke.getClass().getMethod(k0.a("HF5T5dQMHN=="), Uri.class);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(k0.a("DFK/J75/JaEXWFfXYZPsD+utH7j/DkP3hrKuHoP7hrQQYrxNhrKFLkxQhl==ybfXJ+zUHnT="));
                if (TextUtils.isEmpty(str)) {
                    str = k0.a("n+xg");
                }
                sb2.append(str);
                str2 = (String) method.invoke(objInvoke, Uri.parse(sb2.toString()));
            }
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                q0.b("MiaUtil", th2.getMessage());
            }
        }
        com.mbridge.msdk.foundation.same.report.j.b(str2);
    }
}
