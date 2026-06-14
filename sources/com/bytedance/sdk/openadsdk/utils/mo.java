package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.ironsource.C4240b4;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class mo {
    public static String qdl(String str) {
        if (!com.bytedance.sdk.component.utils.bjy.mml() || TextUtils.isEmpty(str)) {
            return str;
        }
        com.bytedance.sdk.openadsdk.core.model.to toVar = new com.bytedance.sdk.openadsdk.core.model.to(com.bytedance.sdk.openadsdk.core.tvp.ud().exu());
        StringBuilder sb2 = new StringBuilder(str);
        Iterator<String> it = toVar.ud().iterator();
        while (it.hasNext()) {
            if (sb2.toString().contains(it.next())) {
                if (sb2.toString().contains("?")) {
                    sb2.append(C4240b4.j.f42670c);
                    sb2.append(toVar.qdl());
                } else {
                    sb2.append("?");
                    sb2.append(toVar.qdl());
                }
            }
        }
        return sb2.toString();
    }
}
