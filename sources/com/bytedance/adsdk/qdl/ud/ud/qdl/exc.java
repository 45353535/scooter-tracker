package com.bytedance.adsdk.qdl.ud.ud.qdl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class exc implements com.bytedance.adsdk.qdl.ud.ud.ud {
    private com.bytedance.adsdk.qdl.ud.ud.qdl lnr;
    private com.bytedance.adsdk.qdl.ud.ud.qdl qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private com.bytedance.adsdk.qdl.ud.ud.qdl f15976ud;

    @Override // com.bytedance.adsdk.qdl.ud.ud.ud
    public void lnr(com.bytedance.adsdk.qdl.ud.ud.qdl qdlVar) {
        this.lnr = qdlVar;
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public Object qdl(Map<String, JSONObject> map) {
        Object objQdl = this.qdl.qdl(map);
        if (objQdl == null) {
            return null;
        }
        return ((Boolean) objQdl).booleanValue() ? this.f15976ud.qdl(map) : this.lnr.qdl(map);
    }

    public String toString() {
        return ud();
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.ud
    public void ud(com.bytedance.adsdk.qdl.ud.ud.qdl qdlVar) {
        this.f15976ud = qdlVar;
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public String ud() {
        return this.qdl.ud() + "?" + this.f15976ud.ud() + StringUtils.PROCESS_POSTFIX_DELIMITER + this.lnr.ud();
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public com.bytedance.adsdk.qdl.ud.mml.mzz qdl() {
        return com.bytedance.adsdk.qdl.ud.mml.mo.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.ud
    public void qdl(com.bytedance.adsdk.qdl.ud.ud.qdl qdlVar) {
        this.qdl = qdlVar;
    }
}
