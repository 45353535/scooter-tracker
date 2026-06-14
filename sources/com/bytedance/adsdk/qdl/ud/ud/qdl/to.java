package com.bytedance.adsdk.qdl.ud.ud.qdl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class to implements com.bytedance.adsdk.qdl.ud.ud.qdl {
    private com.bytedance.adsdk.qdl.ud.qdl.qdl lnr;
    private boolean mml;
    private com.bytedance.adsdk.qdl.ud.ud.qdl[] qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private String f15977ud;

    public to(String str) {
        this.f15977ud = str;
    }

    public boolean lnr() {
        return this.mml;
    }

    public void qdl(com.bytedance.adsdk.qdl.ud.ud.qdl[] qdlVarArr) {
        this.qdl = qdlVarArr;
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public String ud() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f15977ud);
        sb2.append("(");
        com.bytedance.adsdk.qdl.ud.ud.qdl[] qdlVarArr = this.qdl;
        if (qdlVarArr != null && qdlVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                com.bytedance.adsdk.qdl.ud.ud.qdl[] qdlVarArr2 = this.qdl;
                if (i10 >= qdlVarArr2.length) {
                    break;
                }
                sb2.append(qdlVarArr2[i10].ud());
                sb2.append(StringUtils.COMMA);
                i10++;
            }
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void qdl(boolean z10) {
        this.mml = z10;
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public Object qdl(Map<String, JSONObject> map) {
        com.bytedance.adsdk.qdl.ud.qdl.qdl qdlVar = new com.bytedance.adsdk.qdl.ud.qdl.qdl();
        this.lnr = qdlVar;
        qdlVar.qdl(this.f15977ud);
        Object[] objArr = new Object[this.qdl.length];
        int i10 = 0;
        while (true) {
            com.bytedance.adsdk.qdl.ud.ud.qdl[] qdlVarArr = this.qdl;
            if (i10 < qdlVarArr.length) {
                com.bytedance.adsdk.qdl.ud.ud.qdl qdlVar2 = qdlVarArr[i10];
                if (qdlVar2 != null) {
                    objArr[i10] = qdlVar2.qdl(map);
                }
                i10++;
            } else {
                this.lnr.qdl(objArr);
                return com.bytedance.adsdk.qdl.jtx.qdl(this.f15977ud).qdl(map.get("default_key"), objArr);
            }
        }
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public com.bytedance.adsdk.qdl.ud.mml.mzz qdl() {
        return com.bytedance.adsdk.qdl.ud.mml.ud.METHOD;
    }
}
