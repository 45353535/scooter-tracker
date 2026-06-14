package com.bytedance.sdk.openadsdk.core.model;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class jpc {
    private List<Integer> lnr;
    private int mml;
    private int mo;
    private List<String> mzz;
    private int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f17354ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private int f17355wd;

    public JSONObject jpc() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interceptor_x", this.qdl);
            jSONObject.put("interceptor_y", this.f17354ud);
            if (this.lnr != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator<Integer> it = this.lnr.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().intValue());
                }
                jSONObject.put("interceptor_page", jSONArray);
            }
            jSONObject.put("interceptor_interval_time", this.mml);
            if (this.mzz != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<String> it2 = this.mzz.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next());
                }
                jSONObject.put("url_regular", jSONArray2);
            }
            jSONObject.put("is_act", this.mo);
            jSONObject.put("boc_index", this.f17355wd);
            return jSONObject;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.aaj.lnr(th2.getMessage(), new Object[0]);
            return jSONObject;
        }
    }

    public List<String> lnr() {
        return this.mzz;
    }

    public int mml() {
        return this.qdl;
    }

    public List<Integer> mo() {
        return this.lnr;
    }

    public int mzz() {
        return this.f17354ud;
    }

    public boolean qdl() {
        return this.mo == 1;
    }

    public int ud() {
        int i10 = this.f17355wd;
        if (i10 >= 2) {
            return i10;
        }
        return 0;
    }

    public int wd() {
        return this.mml;
    }

    public void lnr(int i10) {
        this.qdl = i10;
    }

    public void mml(int i10) {
        this.f17354ud = i10;
    }

    public void mzz(int i10) {
        this.mml = i10;
    }

    public void qdl(int i10) {
        this.mo = i10;
    }

    public void ud(int i10) {
        this.f17355wd = i10;
    }

    public void qdl(List<String> list) {
        this.mzz = list;
    }

    public void ud(List<Integer> list) {
        this.lnr = list;
    }
}
