package com.mbridge.msdk.config.dynamic.binddata;

import android.text.TextUtils;
import android.view.View;
import com.ironsource.C4240b4;
import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class a {
    public static void a(String str, View view, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str) || view == null) {
            return;
        }
        b(str, view, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void b(String str, View view, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String[] strArrSplit = str.split("\\|");
            HashMap map = new HashMap();
            d dVar = new d();
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(C4240b4.j.f42668b);
                if (strArrSplit2.length == 2) {
                    String str3 = strArrSplit2[1];
                    a(str3, "", view, aVar);
                    map.put(strArrSplit2[0], dVar.a(str3, aVar));
                }
            }
            map.put("globalModel", aVar);
            if (view instanceof com.mbridge.msdk.config.dynamic.baseview.inter.a) {
                ((com.mbridge.msdk.config.dynamic.baseview.inter.a) view).setXmlData(map);
            }
        } catch (Exception e10) {
            q0.b("ComponentBindData", e10.getMessage(), e10);
        }
    }

    public static void a(String str, String str2, View view, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str) || view == null || !str.startsWith("$")) {
            return;
        }
        try {
            String strReplace = str.replace("$", "");
            c cVar = new c(str, str2, view, 0);
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVarA = com.mbridge.msdk.config.global.a.a(aVar, strReplace);
            if (aVarA != null) {
                aVarA.b(strReplace, cVar);
            }
        } catch (Exception e10) {
            q0.b("ComponentBindData", e10.getMessage(), e10);
        }
    }
}
