package com.bytedance.adsdk.qdl;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mzz implements tvp {
    @Override // com.bytedance.adsdk.qdl.tvp
    public Object qdl(JSONObject jSONObject, Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                String strValueOf = String.valueOf(obj);
                if (!TextUtils.isEmpty(strValueOf) && !TextUtils.equals(strValueOf, "null")) {
                    return strValueOf;
                }
            }
        }
        return null;
    }
}
