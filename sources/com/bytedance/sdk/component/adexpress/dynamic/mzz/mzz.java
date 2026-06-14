package com.bytedance.sdk.component.adexpress.dynamic.mzz;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.mzz.ud;
import com.bytedance.sdk.component.adexpress.ud.exu;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class mzz {
    private com.bytedance.sdk.component.adexpress.dynamic.mml.jpc lnr;
    private qdl mml;
    public com.bytedance.sdk.component.adexpress.dynamic.mml.ud qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    protected ud f16392ud;

    static class qdl {
        float lnr;
        float qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        float f16393ud;

        qdl() {
        }
    }

    public mzz(double d10, int i10, double d11, String str, exu exuVar) {
        this.f16392ud = new ud(d10, i10, d11, str, exuVar);
    }

    public void qdl(qdl qdlVar) {
        this.mml = qdlVar;
    }

    public void qdl() {
        this.f16392ud.qdl();
    }

    public void qdl(com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar, float f10, float f11) {
        if (jpcVar != null) {
            this.lnr = jpcVar;
        }
        com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar2 = this.lnr;
        float fJpc = jpcVar2.jpc();
        float fTvp = jpcVar2.tvp();
        float f12 = TextUtils.equals(jpcVar2.to().mzz().bqt(), "fixed") ? fTvp : 65536.0f;
        this.f16392ud.qdl();
        this.f16392ud.lnr(jpcVar2, fJpc, f12);
        ud.lnr lnrVarQdl = this.f16392ud.qdl(jpcVar2);
        com.bytedance.sdk.component.adexpress.dynamic.mml.ud udVar = new com.bytedance.sdk.component.adexpress.dynamic.mml.ud();
        udVar.qdl = f10;
        udVar.f16386ud = f11;
        if (lnrVarQdl != null) {
            fJpc = lnrVarQdl.qdl;
        }
        udVar.lnr = fJpc;
        if (lnrVarQdl != null) {
            fTvp = lnrVarQdl.f16397ud;
        }
        udVar.mml = fTvp;
        udVar.mzz = "root";
        udVar.tvp = 1280.0f;
        udVar.mo = jpcVar2;
        jpcVar2.lnr(f10);
        udVar.mo.mml(udVar.f16386ud);
        udVar.mo.mzz(udVar.lnr);
        udVar.mo.mo(udVar.mml);
        com.bytedance.sdk.component.adexpress.dynamic.mml.ud udVarQdl = qdl(udVar, 0.0f);
        this.qdl = udVarQdl;
        qdl(udVarQdl);
    }

    public void qdl(com.bytedance.sdk.component.adexpress.dynamic.mml.ud udVar) {
        if (udVar == null) {
            return;
        }
        udVar.mo.to().ud();
        List<List<com.bytedance.sdk.component.adexpress.dynamic.mml.ud>> list = udVar.f16387wd;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.mml.ud> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.mml.ud> it = list2.iterator();
                while (it.hasNext()) {
                    qdl(it.next());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.adexpress.dynamic.mml.ud qdl(com.bytedance.sdk.component.adexpress.dynamic.mml.ud r37, float r38) {
        /*
            Method dump skipped, instruction units count: 1004
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.mzz.mzz.qdl(com.bytedance.sdk.component.adexpress.dynamic.mml.ud, float):com.bytedance.sdk.component.adexpress.dynamic.mml.ud");
    }

    private com.bytedance.sdk.component.adexpress.dynamic.mml.tvp qdl(com.bytedance.sdk.component.adexpress.dynamic.mml.mo moVar, ud.lnr lnrVar, ud.lnr lnrVar2) {
        float fTqd = moVar.tqd();
        float fLq = moVar.lq();
        float fFzn = moVar.fzn();
        float fGg = moVar.gg();
        boolean zMlb = moVar.mlb();
        boolean zLte = moVar.lte();
        boolean zDk = moVar.dk();
        boolean zIjp = moVar.ijp();
        if (!zMlb) {
            if (zLte) {
                float f10 = this.mml.qdl;
                fTqd = ((f10 != 0.0f ? Math.min(f10, lnrVar.qdl) : lnrVar.qdl) - fFzn) - lnrVar2.qdl;
            } else {
                fTqd = 0.0f;
            }
        }
        if (!zDk) {
            if (zIjp) {
                float f11 = this.mml.f16393ud;
                if (f11 == 0.0f) {
                    f11 = lnrVar.f16397ud;
                }
                fLq = (f11 - fGg) - lnrVar2.f16397ud;
            } else {
                fLq = 0.0f;
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.mml.tvp(fTqd, fLq);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.mml.tvp qdl(com.bytedance.sdk.component.adexpress.dynamic.mml.ud udVar, com.bytedance.sdk.component.adexpress.dynamic.mml.mo moVar, float f10, float f11) {
        float f12;
        float f13;
        float f14 = udVar.qdl;
        float f15 = udVar.f16386ud;
        float fTqd = moVar.tqd();
        float fLq = moVar.lq();
        float fFzn = moVar.fzn();
        float fGg = moVar.gg();
        boolean zMlb = moVar.mlb();
        boolean zLte = moVar.lte();
        boolean zDk = moVar.dk();
        boolean zIjp = moVar.ijp();
        String strCar = moVar.car();
        float f16 = udVar.lnr;
        float f17 = udVar.mml;
        if (TextUtils.equals(strCar, "0")) {
            if (zMlb) {
                f14 = udVar.qdl + fTqd;
            } else if (zLte) {
                f14 = ((udVar.qdl + f16) - fFzn) - f10;
            }
            if (zDk) {
                f13 = udVar.f16386ud;
                f15 = f13 + fLq;
            } else if (zIjp) {
                f12 = udVar.f16386ud;
                f15 = ((f12 + f17) - fGg) - f11;
            }
        } else if (TextUtils.equals(strCar, "1")) {
            f14 = udVar.qdl + ((f16 - f10) / 2.0f);
            if (zDk) {
                f13 = udVar.f16386ud;
                f15 = f13 + fLq;
            } else if (zIjp) {
                f12 = udVar.f16386ud;
                f15 = ((f12 + f17) - fGg) - f11;
            }
        } else if (TextUtils.equals(strCar, "2")) {
            f15 = udVar.f16386ud + ((f17 - f11) / 2.0f);
            if (zMlb) {
                f14 = udVar.qdl + fTqd;
            } else if (zLte) {
                f14 = ((udVar.qdl + f16) - fFzn) - f10;
            }
        } else if (TextUtils.equals(strCar, "3")) {
            f14 = udVar.qdl + ((f16 - f10) / 2.0f);
            f15 = udVar.f16386ud + ((f17 - f11) / 2.0f);
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.mml.tvp(f14, f15);
    }
}
