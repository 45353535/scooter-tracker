package com.bytedance.adsdk.qdl.ud.ud.qdl;

import com.ironsource.C4240b4;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class wd implements com.bytedance.adsdk.qdl.ud.ud.qdl {
    private final Object qdl;

    public wd(String str) {
        if (str.equalsIgnoreCase("true")) {
            this.qdl = Boolean.TRUE;
        } else if (str.equalsIgnoreCase("false")) {
            this.qdl = Boolean.FALSE;
        } else {
            if (!str.equalsIgnoreCase("null")) {
                throw new IllegalArgumentException();
            }
            this.qdl = null;
        }
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public Object qdl(Map<String, JSONObject> map) {
        return this.qdl;
    }

    public String toString() {
        return "KeywordNode [keywordValue=" + this.qdl + C4240b4.j.f42674e;
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public String ud() {
        Object obj = this.qdl;
        return obj != null ? obj.toString() : "NULL";
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public com.bytedance.adsdk.qdl.ud.mml.mzz qdl() {
        return com.bytedance.adsdk.qdl.ud.mml.mo.CONSTANT;
    }
}
