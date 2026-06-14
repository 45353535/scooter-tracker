package com.bytedance.sdk.component.adexpress.dynamic.mzz;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.ud.exu;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    private String jpc;
    private int mo;
    private double mzz;
    private exu tvp;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private double f16396wd;
    public Map<String, lnr> qdl = new HashMap();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public Map<String, lnr> f16395ud = new HashMap();
    public Map<String, lnr> lnr = new HashMap();
    private double mml = Math.random();

    static class lnr {
        float qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        float f16397ud;

        public lnr() {
        }

        public String toString() {
            return "UnitSize{width=" + this.qdl + ", height=" + this.f16397ud + '}';
        }

        public lnr(float f10, float f11) {
            this.qdl = f10;
            this.f16397ud = f11;
        }
    }

    static class qdl implements Cloneable {
        float lnr;
        float qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        boolean f16398ud;

        qdl() {
        }

        public Object clone() {
            try {
                return (qdl) super.clone();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.mzz.ud$ud, reason: collision with other inner class name */
    static class C0219ud {
        int lnr;
        double mml;
        float mzz;
        float qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        int f16399ud;

        C0219ud() {
        }

        static JSONObject qdl(C0219ud c0219ud) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("fontSize", c0219ud.qdl);
                jSONObject.put("letterSpacing", c0219ud.f16399ud);
                jSONObject.put("lineHeight", c0219ud.mml);
                jSONObject.put("maxWidth", c0219ud.mzz);
                jSONObject.put("fontWeight", c0219ud.lnr);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }
    }

    public ud(double d10, int i10, double d11, String str, exu exuVar) {
        this.mzz = d10;
        this.mo = i10;
        this.f16396wd = d11;
        this.jpc = str;
        this.tvp = exuVar;
    }

    private lnr mo(com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar, float f10, float f11) {
        new lnr();
        com.bytedance.sdk.component.adexpress.dynamic.mml.mo moVarMzz = jpcVar.to().mzz();
        jpcVar.to().lnr();
        moVarMzz.zlt();
        float fJl = moVarMzz.jl();
        int iJjk = moVarMzz.jjk();
        double dXi = moVarMzz.xi();
        int iTaz = moVarMzz.taz();
        boolean zOm = moVarMzz.om();
        boolean zTid = moVarMzz.tid();
        int iCx = moVarMzz.cx();
        C0219ud c0219ud = new C0219ud();
        c0219ud.qdl = fJl;
        c0219ud.f16399ud = iJjk;
        c0219ud.lnr = iTaz;
        c0219ud.mml = dXi;
        c0219ud.mzz = f10;
        return qdl(jpcVar.to().lnr(), c0219ud, zOm, zTid, iCx, jpcVar);
    }

    private lnr mzz(com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar, float f10, float f11) {
        String str = jpcVar.lnr() + "_" + f10 + "_" + f11;
        if (this.lnr.containsKey(str)) {
            return this.lnr.get(str);
        }
        lnr lnrVarMo = mo(jpcVar, f10, f11);
        this.lnr.put(str, lnrVarMo);
        return lnrVarMo;
    }

    public lnr lnr(com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar, float f10, float f11) {
        if (jpcVar == null) {
            return null;
        }
        lnr lnrVarQdl = qdl(jpcVar);
        if (lnrVarQdl != null && (lnrVarQdl.qdl != 0.0f || lnrVarQdl.f16397ud != 0.0f)) {
            return lnrVarQdl;
        }
        lnr lnrVarMml = mml(jpcVar, f10, f11);
        qdl(jpcVar, lnrVarMml);
        return lnrVarMml;
    }

    public lnr mml(com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar, float f10, float f11) {
        float fMin;
        float f12;
        float f13;
        lnr lnrVar = new lnr();
        float f14 = 0.0f;
        if (f11 <= 0.0f || f10 <= 0.0f) {
            lnrVar.qdl = 0.0f;
            lnrVar.f16397ud = 0.0f;
            return lnrVar;
        }
        if (jpcVar.jl()) {
            return qdl(jpcVar, f10, f11);
        }
        float fJpc = jpcVar.jpc();
        float fTvp = jpcVar.tvp();
        float fBjy = jpcVar.bjy();
        float fJtx = jpcVar.jtx();
        com.bytedance.sdk.component.adexpress.dynamic.mml.mo moVarMzz = jpcVar.to().mzz();
        String strKoa = moVarMzz.koa();
        String strBqt = moVarMzz.bqt();
        float fMin2 = ((TextUtils.equals(strKoa, "flex") || TextUtils.equals(strKoa, "auto")) ? f10 : Math.min(fJpc, f10)) - fBjy;
        if (TextUtils.equals(strBqt, "scale")) {
            fMin = Math.round(fMin2 / fTvp) + fJtx;
            if (fMin > f11) {
                fMin2 = Math.round((f11 - fJtx) * fTvp);
            }
        } else {
            fMin = (TextUtils.equals(strBqt, "auto") || TextUtils.equals(strBqt, "flex")) ? f11 : Math.min(fTvp, f11);
        }
        float f15 = fMin - fJtx;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc>> listYt = jpcVar.yt();
        float fMax = 0.0f;
        float fMax2 = 0.0f;
        for (List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> list : listYt) {
            float f16 = f14;
            float f17 = fBjy;
            lnr lnrVarUd = ud(list, fMin2, f15);
            if (ud(list)) {
                f13 = f16 + 1.0f;
            } else {
                fMax = Math.max(fMax, lnrVarUd.qdl);
                f13 = f16;
            }
            float f18 = f13;
            float f19 = fMin2;
            fMax2 = jpcVar.to().ud().equals("carousel") ? Math.max(jpcVar.tvp(), lnrVarUd.f16397ud) : fMax2 + lnrVarUd.f16397ud;
            fBjy = f17;
            f14 = f18;
            fMin2 = f19;
        }
        float f20 = f14;
        float f21 = fMin2;
        float f22 = fBjy;
        if (!TextUtils.equals(strKoa, "auto")) {
            f12 = f21;
        } else if (f20 == listYt.size()) {
            f12 = f10;
        } else {
            for (List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> list2 : listYt) {
                lnr(list2);
                ud(list2, fMax, f15);
            }
            f12 = fMax;
        }
        if (TextUtils.equals(strBqt, "auto")) {
            if (fMax2 <= f11) {
                f15 = fMax2;
            } else {
                qdl(listYt, f12, f15);
            }
        } else if ((TextUtils.equals(strBqt, "fixed") || TextUtils.equals(strBqt, "flex")) && f15 < fMax2) {
            qdl(listYt, f12, f15);
        }
        lnrVar.qdl = Math.min(f12 + f22, f10);
        lnrVar.f16397ud = Math.min(f15 + fJtx, f11);
        return lnrVar;
    }

    public lnr qdl(com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar, float f10, float f11) {
        float f12;
        if (TextUtils.isEmpty(jpcVar.to().lnr()) && jpcVar.to().mzz().zy() == null) {
            return new lnr(0.0f, 0.0f);
        }
        if (TextUtils.equals(jpcVar.to().ud(), "creative-playable-bait")) {
            return new lnr(0.0f, 0.0f);
        }
        float fJpc = jpcVar.jpc();
        float fTvp = jpcVar.tvp();
        com.bytedance.sdk.component.adexpress.dynamic.mml.mo moVarMzz = jpcVar.to().mzz();
        String strKoa = moVarMzz.koa();
        String strBqt = moVarMzz.bqt();
        float fExu = jpcVar.exu();
        float fRdp = jpcVar.rdp();
        float fBjy = jpcVar.bjy();
        float fJtx = jpcVar.jtx();
        if (TextUtils.equals(strKoa, "fixed")) {
            f10 = Math.min(fJpc, f10);
            if (TextUtils.equals(strBqt, "auto")) {
                f12 = ud(jpcVar, f10 - fBjy, f11 - fJtx).f16397ud;
                fTvp = f12 + fJtx;
            }
        } else if (TextUtils.equals(strKoa, "auto")) {
            lnr lnrVarUd = ud(jpcVar, f10 - fBjy, f11 - fJtx);
            f10 = lnrVarUd.qdl + fBjy;
            if (TextUtils.equals(strBqt, "auto")) {
                f12 = lnrVarUd.f16397ud;
                fTvp = f12 + fJtx;
            }
        } else if (!TextUtils.equals(strKoa, "flex")) {
            f10 = fJpc;
        } else if (TextUtils.equals(strBqt, "auto")) {
            f12 = ud(jpcVar, f10 - fBjy, f11 - fJtx).f16397ud;
            fTvp = f12 + fJtx;
        }
        if (TextUtils.equals(strBqt, "scale")) {
            float fRound = Math.round((f10 - fExu) / fTvp) + fRdp;
            if (fRound > f11) {
                f10 = Math.round((f11 - fRdp) * fTvp) + fExu;
            } else {
                f11 = fRound;
            }
        } else if (TextUtils.equals(strBqt, "fixed")) {
            f11 = Math.min(fTvp + fRdp, f11);
        } else if (!TextUtils.equals(strBqt, "flex")) {
            f11 = fTvp;
        }
        lnr lnrVar = new lnr();
        lnrVar.qdl = f10;
        lnrVar.f16397ud = f11;
        return lnrVar;
    }

    public lnr ud(com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar, float f10, float f11) {
        lnr lnrVar = new lnr();
        if (jpcVar.to().mzz() == null) {
            return lnrVar;
        }
        lnr lnrVarMzz = mzz(jpcVar, f10, f11);
        float f12 = lnrVarMzz.qdl;
        float f13 = lnrVarMzz.f16397ud;
        lnrVar.qdl = Math.min(f12, f10);
        lnrVar.f16397ud = Math.min(f13, f11);
        return lnrVar;
    }

    private lnr lnr(List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> list, float f10, float f11) {
        float fMax;
        mml(list);
        lnr lnrVar = new lnr();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.mml.mo moVarMzz = jpcVar.to().mzz();
            if (moVarMzz.sy() == 1 || moVarMzz.sy() == 2) {
                arrayList.add(jpcVar);
            }
            if (moVarMzz.sy() != 1 && moVarMzz.sy() != 2) {
                arrayList2.add(jpcVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lnr((com.bytedance.sdk.component.adexpress.dynamic.mml.jpc) it.next(), f10, f11);
        }
        if (arrayList2.size() <= 0) {
            return lnrVar;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Float.valueOf(lnr(it2.next(), f10, f11).qdl));
        }
        ArrayList arrayList4 = new ArrayList();
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList2.size()) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar2 = arrayList2.get(i10);
            String strKoa = jpcVar2.to().mzz().koa();
            float fJpc = jpcVar2.jpc();
            boolean zEquals = TextUtils.equals(strKoa, "flex");
            if (TextUtils.equals(strKoa, "auto")) {
                List<List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc>> listYt = jpcVar2.yt();
                if (listYt == null || listYt.size() <= 0) {
                    zEquals = false;
                } else {
                    Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc>> it3 = listYt.iterator();
                    while (it3.hasNext()) {
                        if (ud(it3.next())) {
                            zEquals = true;
                            break;
                        }
                    }
                    zEquals = false;
                }
            }
            qdl qdlVar = new qdl();
            if (!zEquals) {
                fJpc = ((Float) arrayList3.get(i10)).floatValue();
            }
            qdlVar.qdl = fJpc;
            qdlVar.f16398ud = !zEquals;
            if (zEquals) {
                fMax = ((Float) arrayList3.get(i10)).floatValue();
            }
            qdlVar.lnr = fMax;
            arrayList4.add(qdlVar);
            i10++;
        }
        qdl(arrayList4, f10, arrayList2);
        List<qdl> listQdl = to.qdl(f10, arrayList4);
        float f12 = 0.0f;
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            f12 += listQdl.get(i11).qdl;
            if (((Float) arrayList3.get(i11)).floatValue() != listQdl.get(i11).qdl) {
                mml(arrayList2.get(i11));
            }
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> it4 = arrayList2.iterator();
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            i12++;
            if (!ud(it4.next())) {
                z10 = false;
                break;
            }
            if (i12 == arrayList2.size()) {
                z10 = true;
            }
        }
        fMax = z10 ? f11 : 0.0f;
        ArrayList arrayList5 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar3 = arrayList2.get(i13);
            lnr lnrVarLnr = lnr(jpcVar3, listQdl.get(i13).qdl, f11);
            if (!ud(jpcVar3)) {
                fMax = Math.max(fMax, lnrVarLnr.f16397ud);
            }
            arrayList5.add(lnrVarLnr);
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            arrayList6.add(Float.valueOf(((lnr) it5.next()).f16397ud));
        }
        if (!z10) {
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar4 = arrayList2.get(i14);
                if (ud(jpcVar4) && ((Float) arrayList6.get(i14)).floatValue() != fMax) {
                    mml(jpcVar4);
                    lnr(jpcVar4, listQdl.get(i14).qdl, fMax);
                }
            }
        }
        lnrVar.qdl = f12;
        lnrVar.f16397ud = fMax;
        return lnrVar;
    }

    private boolean ud(List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> list) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc>> listYt;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().to().mzz().koa(), "flex")) {
                return true;
            }
        }
        while (true) {
            boolean z10 = false;
            for (com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar : list) {
                if (TextUtils.equals(jpcVar.to().mzz().koa(), "auto") && (listYt = jpcVar.yt()) != null) {
                    int i10 = 0;
                    for (List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> list2 : listYt) {
                        i10++;
                        if (!ud(list2)) {
                            break;
                        }
                        if (i10 == list2.size()) {
                            z10 = true;
                        }
                    }
                }
            }
            return z10;
        }
    }

    private String mzz(com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        return jpcVar.lnr();
    }

    private lnr ud(List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> list, float f10, float f11) {
        lnr lnrVarQdl = qdl(list);
        if (lnrVarQdl != null && (lnrVarQdl.qdl != 0.0f || lnrVarQdl.f16397ud != 0.0f)) {
            return lnrVarQdl;
        }
        lnr lnrVarLnr = lnr(list, f10, f11);
        qdl(list, lnrVarLnr);
        return lnrVarLnr;
    }

    private boolean ud(com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        if (jpcVar == null) {
            return false;
        }
        if (TextUtils.equals(jpcVar.to().mzz().bqt(), "flex")) {
            return true;
        }
        return lnr(jpcVar);
    }

    private lnr qdl(String str, C0219ud c0219ud, boolean z10, boolean z11, int i10, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        return rq.qdl(str, jpcVar.to().ud(), C0219ud.qdl(c0219ud).toString(), z10, z11, i10, jpcVar, this.mzz, this.mo, this.f16396wd, this.jpc, this.tvp);
    }

    private void qdl(List<List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc>> list, float f10, float f11) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc>> it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (qdl(it.next(), false)) {
                z10 = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> list2 : list) {
            qdl qdlVar = new qdl();
            boolean zQdl = qdl(list2, !z10);
            qdlVar.qdl = zQdl ? 1.0f : ud(list2, f10, f11).f16397ud;
            qdlVar.f16398ud = !zQdl;
            arrayList.add(qdlVar);
        }
        List<qdl> listQdl = to.qdl(f11, arrayList);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((qdl) arrayList.get(i10)).qdl != listQdl.get(i10).qdl) {
                List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> list3 = list.get(i10);
                lnr(list3);
                ud(list3, f10, listQdl.get(i10).qdl);
            }
        }
    }

    private void mml(com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        this.qdl.remove(mzz(jpcVar));
        List<List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc>> listYt = jpcVar.yt();
        if (listYt == null || listYt.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc>> it = listYt.iterator();
        while (it.hasNext()) {
            lnr(it.next());
        }
    }

    private String mml(List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String strLnr = list.get(i10).lnr();
            if (i10 < list.size() - 1) {
                sb2.append(strLnr);
                sb2.append(TokenBuilder.TOKEN_DELIMITER);
            } else {
                sb2.append(strLnr);
            }
        }
        return sb2.toString();
    }

    private boolean qdl(List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> list, boolean z10) {
        for (com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.mml.mo moVarMzz = jpcVar.to().mzz();
            String strBqt = moVarMzz.bqt();
            if (TextUtils.equals(strBqt, "flex") || (z10 && ((TextUtils.equals(moVarMzz.koa(), "flex") && TextUtils.equals(moVarMzz.bqt(), "scale") && com.bytedance.sdk.component.adexpress.dynamic.mml.mzz.qdl.get(jpcVar.to().ud()).intValue() == 7) || TextUtils.equals(strBqt, "flex")))) {
                return true;
            }
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> it = list.iterator();
        while (it.hasNext()) {
            if (lnr(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean lnr(com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc>> listYt;
        if (!jpcVar.jl() && TextUtils.equals(jpcVar.to().mzz().bqt(), "auto") && (listYt = jpcVar.yt()) != null && listYt.size() > 0) {
            if (listYt.size() == 1) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> it = listYt.get(0).iterator();
                while (it.hasNext()) {
                    if (!ud(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc>> it2 = listYt.iterator();
            while (it2.hasNext()) {
                if (qdl(it2.next(), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void qdl(List<qdl> list, float f10, List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> list2) {
        float f11 = 0.0f;
        for (qdl qdlVar : list) {
            if (qdlVar.f16398ud) {
                f11 += qdlVar.qdl;
            }
        }
        if (f11 > f10) {
            int i10 = 0;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (list.get(i11).f16398ud && list2.get(i11).oth()) {
                    i10++;
                }
            }
            if (i10 > 0) {
                float fCeil = (float) (Math.ceil(((f11 - f10) / i10) * 1000.0f) / 1000.0d);
                for (int i12 = 0; i12 < list2.size(); i12++) {
                    qdl qdlVar2 = list.get(i12);
                    if (qdlVar2.f16398ud && list2.get(i12).oth()) {
                        qdlVar2.qdl -= fCeil;
                    }
                }
            }
        }
    }

    private void lnr(List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f16395ud.remove(mml(list));
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> it = list.iterator();
        while (it.hasNext()) {
            mml(it.next());
        }
    }

    public void qdl() {
        this.lnr.clear();
        this.qdl.clear();
        this.f16395ud.clear();
    }

    public lnr qdl(com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar) {
        return this.qdl.get(mzz(jpcVar));
    }

    public lnr qdl(List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> list) {
        return this.f16395ud.get(mml(list));
    }

    private void qdl(com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar, lnr lnrVar) {
        this.qdl.put(mzz(jpcVar), lnrVar);
    }

    private void qdl(List<com.bytedance.sdk.component.adexpress.dynamic.mml.jpc> list, lnr lnrVar) {
        this.f16395ud.put(mml(list), lnrVar);
    }
}
