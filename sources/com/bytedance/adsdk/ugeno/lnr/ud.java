package com.bytedance.adsdk.ugeno.lnr;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.lnr.qdl;
import com.bytedance.adsdk.ugeno.mzz;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    public static String qdl(String str, JSONObject jSONObject) {
        qdl qdlVarLnr;
        qdl.InterfaceC0208qdl interfaceC0208qdlQdl;
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                if (str.startsWith("${") && str.endsWith("}") && (qdlVarLnr = mzz.qdl().lnr()) != null && (interfaceC0208qdlQdl = qdlVarLnr.qdl(str.substring(2, str.length() - 1))) != null) {
                    return (String) interfaceC0208qdlQdl.qdl(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }
}
