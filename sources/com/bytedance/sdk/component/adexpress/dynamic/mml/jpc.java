package com.bytedance.sdk.component.adexpress.dynamic.mml;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class jpc {
    private String exu;
    private List<List<jpc>> fs;
    private float jpc;
    private float lnr;
    private float mml;
    private float mo;
    private float mzz;
    private String qdl;
    private boolean rdp;
    private jpc rq;
    private List<jpc> to;
    private mzz tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private float f16362ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private float f16363wd;
    private Map<String, String> bjy = new HashMap();
    private Map<Integer, String> jtx = new HashMap();

    public Map<String, String> aaj() {
        return this.bjy;
    }

    public boolean bch() {
        return this.tvp.mzz().lq() < 0 || this.tvp.mzz().gg() < 0 || this.tvp.mzz().tqd() < 0 || this.tvp.mzz().fzn() < 0;
    }

    public float bjy() {
        mo moVarMzz = this.tvp.mzz();
        return exu() + moVarMzz.bjy() + moVarMzz.jtx() + (moVarMzz.fs() * 2.0f);
    }

    public boolean exc() {
        return this.rdp;
    }

    public int exu() {
        mo moVarMzz = this.tvp.mzz();
        return moVarMzz.gt() + moVarMzz.irn();
    }

    public jpc fs() {
        return this.rq;
    }

    public boolean jl() {
        List<jpc> list = this.to;
        return list == null || list.size() <= 0;
    }

    public float jpc() {
        return this.mo;
    }

    public float jtx() {
        mo moVarMzz = this.tvp.mzz();
        return rdp() + moVarMzz.yt() + moVarMzz.rdp() + (moVarMzz.fs() * 2.0f);
    }

    public void jyq() {
        List<List<jpc>> list = this.fs;
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (List<jpc> list2 : this.fs) {
            if (list2 != null && list2.size() > 0) {
                arrayList.add(list2);
            }
        }
        this.fs = arrayList;
    }

    public String ljh() {
        return this.tvp.mzz().ljh();
    }

    public String lnr() {
        return this.qdl;
    }

    public float mml() {
        return this.mml;
    }

    public float mo() {
        return this.f16362ud;
    }

    public float mzz() {
        return this.mzz;
    }

    public boolean oth() {
        return TextUtils.equals(this.tvp.mzz().koa(), "flex");
    }

    public String qdl() {
        return this.exu;
    }

    public int rdp() {
        mo moVarMzz = this.tvp.mzz();
        return moVarMzz.yh() + moVarMzz.wak();
    }

    public List<jpc> rq() {
        return this.to;
    }

    public mzz to() {
        return this.tvp;
    }

    public String toString() {
        return "DynamicLayoutUnit{id='" + this.qdl + "', x=" + this.f16362ud + ", y=" + this.lnr + ", width=" + this.mo + ", height=" + this.f16363wd + ", remainWidth=" + this.jpc + ", rootBrick=" + this.tvp + ", childrenBrickUnits=" + this.to + '}';
    }

    public float tvp() {
        return this.f16363wd;
    }

    public Map<Integer, String> ud() {
        return this.jtx;
    }

    public float wd() {
        return this.lnr;
    }

    public List<List<jpc>> yt() {
        return this.fs;
    }

    public void lnr(float f10) {
        this.f16362ud = f10;
    }

    public void mml(float f10) {
        this.lnr = f10;
    }

    public void mo(float f10) {
        this.f16363wd = f10;
    }

    public void mzz(float f10) {
        this.mo = f10;
    }

    public void qdl(String str) {
        this.exu = str;
    }

    public void ud(String str) {
        this.qdl = str;
    }

    public void wd(float f10) {
        this.jpc = f10;
    }

    public void lnr(String str) {
        this.tvp.mzz().mo(str);
    }

    public void qdl(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    this.jtx.put(Integer.valueOf(jSONObjectOptJSONObject.optInt("id")), jSONObjectOptJSONObject.optString("value"));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void ud(float f10) {
        this.mzz = f10;
    }

    public void ud(List<List<jpc>> list) {
        this.fs = list;
    }

    public void qdl(float f10) {
        this.mml = f10;
    }

    public void qdl(mzz mzzVar) {
        this.tvp = mzzVar;
    }

    public void qdl(List<jpc> list) {
        this.to = list;
    }

    public void qdl(jpc jpcVar) {
        this.rq = jpcVar;
    }

    public void qdl(boolean z10) {
        this.rdp = z10;
    }

    public void qdl(String str, String str2) {
        this.bjy.put(str, str2);
    }

    public String qdl(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.tvp.ud());
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb2.append(this.qdl);
        if (this.tvp.mzz() != null) {
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(this.tvp.mzz().syy());
        }
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb2.append(i10);
        return sb2.toString();
    }
}
