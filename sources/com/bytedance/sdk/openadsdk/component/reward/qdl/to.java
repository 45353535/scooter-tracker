package com.bytedance.sdk.openadsdk.component.reward.qdl;

import android.R;
import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.bch.ud.mzz;
import com.bytedance.sdk.openadsdk.component.reward.qdl.mml;
import com.bytedance.sdk.openadsdk.core.lnr.lnr;
import com.bytedance.sdk.openadsdk.core.lnr.qdl;
import com.bytedance.sdk.openadsdk.core.model.fs;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class to {
    private final com.bytedance.sdk.openadsdk.core.lnr.mzz lnr;
    private final qdl qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.lnr.ud f17100ud;

    public to(qdl qdlVar) {
        this.qdl = qdlVar;
        this.lnr = qdl(qdlVar, qdlVar.f17090ud);
        this.f17100ud = new com.bytedance.sdk.openadsdk.core.lnr.ud(qdlVar.f17086ag, qdlVar.f17090ud, qdlVar.mzz, qdlVar.mml ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.to.1
            @Override // com.bytedance.sdk.openadsdk.core.lnr.ud, com.bytedance.sdk.openadsdk.core.lnr.lnr
            public void qdl(View view, float f10, float f11, float f12, float f13, SparseArray<lnr.qdl> sparseArray, boolean z10) {
                try {
                    to.this.qdl(view, f10, f11, f12, f13, sparseArray, this.koa, this.xmv, this.bqt);
                } catch (Exception e10) {
                    aaj.lnr("TTAD.RFReportManager", "onClickReport error :" + e10.getMessage());
                }
                com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(to.this.qdl.f17090ud, 9);
                to.this.qdl.bch.ag();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject jpc() {
        com.bytedance.sdk.openadsdk.activity.jpc jpcVar;
        qdl qdlVar = this.qdl;
        if (!qdlVar.f17088ra || (jpcVar = qdlVar.lq) == null) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.mml.lnr.qdl(jpcVar.rq + 1);
        } catch (Throwable unused) {
            return null;
        }
    }

    private JSONObject to() {
        try {
            long jOth = this.qdl.bch.oth();
            int iLjh = this.qdl.bch.ljh();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", jOth);
                jSONObject.put("percent", iLjh);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private boolean tvp() {
        ljh ljhVar = this.qdl.f17090ud;
        return ljhVar != null && ljhVar.syy() == 1;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public com.bytedance.sdk.openadsdk.core.lnr.mzz lnr() {
        this.lnr.qdl(this.qdl.f17086ag.findViewById(R.id.content));
        if (this.qdl.uw.lnr() != null) {
            this.lnr.qdl(this.qdl.uw.lnr());
        }
        this.qdl.xmv.qdl(this.lnr);
        this.lnr.qdl(new qdl.InterfaceC0263qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.to.3
            @Override // com.bytedance.sdk.openadsdk.core.lnr.qdl.InterfaceC0263qdl
            public long getVideoProgress() {
                return to.this.qdl.bch.fs();
            }
        });
        com.bytedance.sdk.openadsdk.component.reward.view.fs fsVar = this.qdl.gy;
        com.bytedance.sdk.openadsdk.core.lnr.mzz mzzVar = this.lnr;
        fsVar.qdl(mzzVar, mzzVar, this.f17100ud);
        this.qdl.mrf.qdl(this.lnr);
        return this.lnr;
    }

    public com.bytedance.sdk.openadsdk.core.lnr.ud mml() {
        return this.f17100ud;
    }

    public void mo() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.qdl.to.get()) {
                jSONObject.put("endcard_content", this.qdl.hkc.lnr() ? 1 : this.qdl.hzv.mml() ? 3 : this.qdl.hkc.mml() ? 2 : 0);
            } else {
                jSONObject.put("endCardNotShow", 1);
            }
        } catch (JSONException unused) {
        }
        qdl qdlVar = this.qdl;
        com.bytedance.sdk.openadsdk.mml.lnr.ud(qdlVar.f17090ud, qdlVar.mzz, "click_close", jSONObject);
    }

    public com.bytedance.sdk.openadsdk.core.lnr.mzz mzz() {
        return this.lnr;
    }

    public void wd() {
        qdl qdlVar = this.qdl;
        com.bytedance.sdk.openadsdk.mml.lnr.ud(qdlVar.f17090ud, qdlVar.mzz, (JSONObject) null, jpc());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ud() {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.qdl.to.ud():void");
    }

    public void qdl() {
        com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
        if (this.qdl.exu.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.activity.jpc jpcVar = this.qdl.lq;
        if (jpcVar != null && jpcVar.cx().bch()) {
            qdl qdlVar = this.qdl;
            if (!qdlVar.irn && !qdlVar.lq.taz()) {
                return;
            }
        }
        JSONObject jSONObject = new JSONObject();
        ljh ljhVar = this.qdl.f17090ud;
        JSONObject jSONObjectJpc = jpc();
        if (this.qdl.exu.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, this.qdl.mzz, jSONObject, jSONObjectJpc);
            this.qdl.f17091wc.rq();
            mzz.qdl qdlVar2 = new mzz.qdl(-1);
            qdl(qdlVar2);
            com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(this.qdl.f17086ag.findViewById(R.id.content), ljhVar, qdlVar2);
            com.bytedance.sdk.openadsdk.bch.qdl.lnr.qdl(ljhVar);
            com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm = ljhVar.zm();
            if (mmlVarZm == null || (mmlVarQdl = mmlVarZm.qdl()) == null) {
                return;
            }
            mmlVarQdl.qdl(0L);
        }
    }

    public void lnr(boolean z10) {
        qdl qdlVar = this.qdl;
        if (qdlVar != null && z10 && qdlVar.f17090ud.jwd() && !this.qdl.f17090ud.ljh()) {
            this.qdl.f17090ud.mo(true);
            qdl qdlVar2 = this.qdl;
            ljh ljhVar = qdlVar2.f17090ud;
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, qdlVar2.mzz, ljhVar.fo());
        }
    }

    public void qdl(final Map<String, Object> map) {
        if (this.qdl.exu.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.activity.jpc jpcVar = this.qdl.lq;
        if (jpcVar != null && jpcVar.cx().bch()) {
            qdl qdlVar = this.qdl;
            if (!qdlVar.irn && !qdlVar.lq.taz()) {
                return;
            }
        }
        this.qdl.exu.set(true);
        final View viewFindViewById = this.qdl.f17086ag.findViewById(R.id.content);
        if (viewFindViewById == null) {
            viewFindViewById = this.qdl.f17086ag.getWindow().getDecorView();
        }
        viewFindViewById.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.to.2
            @Override // java.lang.Runnable
            public void run() {
                Map map2;
                ljh ljhVar = to.this.qdl.f17090ud;
                JSONObject jSONObject = null;
                try {
                    jSONObject = map != null ? new JSONObject(map) : new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("width", viewFindViewById.getWidth());
                    jSONObject2.put("height", viewFindViewById.getHeight());
                    jSONObject2.put("alpha", viewFindViewById.getAlpha());
                    jSONObject.put("root_view", jSONObject2.toString());
                } catch (Throwable th2) {
                    aaj.qdl("TTAD.RFReportManager", "run: ", th2);
                }
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, to.this.qdl.mzz, jSONObject, to.this.jpc());
                to.this.qdl.f17091wc.rq();
                mzz.qdl qdlVar2 = new mzz.qdl(to.this.qdl.bqt != null && (map2 = map) != null && map2.containsKey("dynamic_show_type") ? to.this.qdl.bqt.rq() : -1);
                to.this.qdl(qdlVar2);
                com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(to.this.qdl.f17086ag.findViewById(R.id.content), ljhVar, qdlVar2);
                com.bytedance.sdk.openadsdk.bch.qdl.lnr.qdl(ljhVar);
            }
        });
    }

    public void ud(boolean z10) {
        qdl qdlVar = this.qdl;
        if (qdlVar == null) {
            return;
        }
        if (!z10 && qdlVar.exu.get() && this.qdl.dk > 0) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.qdl.dk);
            qdl qdlVar2 = this.qdl;
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(strValueOf, qdlVar2.f17090ud, qdlVar2.mzz, qdlVar2.bch.mzz());
            this.qdl.dk = 0L;
        } else {
            this.qdl.dk = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(this.qdl.f17090ud, z10 ? 4 : 8);
        com.bytedance.sdk.openadsdk.bch.qdl.lnr.qdl(this.qdl.f17090ud, z10 ? 4 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(mzz.qdl qdlVar) {
        com.bytedance.sdk.openadsdk.activity.jpc jpcVar;
        qdl qdlVar2 = this.qdl;
        if (!qdlVar2.f17088ra || (jpcVar = qdlVar2.lq) == null) {
            return;
        }
        qdlVar.f16937ud = jpcVar.rq;
    }

    public void qdl(boolean z10) {
        ljh ljhVar = this.qdl.f17090ud;
        if (ljhVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.bjy.qdl.mml mmlVarMzz = com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().qdl(z10 ? 7 : 8).lnr(String.valueOf(ljhVar.fz())).mzz(this.qdl.f17090ud.cev());
        mmlVarMzz.ud(this.qdl.hkc.jl()).mo(this.qdl.hkc.exc());
        mmlVarMzz.wd(this.qdl.f17090ud.ir()).mml(this.qdl.f17090ud.yre());
        com.bytedance.sdk.openadsdk.bjy.lnr.qdl().ud(mmlVarMzz);
    }

    private void ud(View view, float f10, float f11, float f12, float f13, SparseArray<lnr.qdl> sparseArray, int i10, int i11, int i12) {
        if (!tvp() || this.qdl.f17090ud == null || view == null) {
            return;
        }
        int id2 = view.getId();
        if (id2 == com.bytedance.sdk.openadsdk.utils.jtx.mzz || id2 == com.bytedance.sdk.openadsdk.utils.jtx.mml || id2 == com.bytedance.sdk.openadsdk.utils.jtx.lnr || id2 == com.bytedance.sdk.openadsdk.utils.jtx.f17869ud || id2 == com.bytedance.sdk.openadsdk.utils.jtx.fs || id2 == com.bytedance.sdk.openadsdk.utils.jtx.blf || id2 == com.bytedance.sdk.openadsdk.utils.jtx.jtx || id2 == 520093705 || id2 == com.bytedance.sdk.openadsdk.utils.jtx.rq || id2 == 520093707 || id2 == com.bytedance.sdk.openadsdk.utils.jtx.f17872wd) {
            int i13 = ax.to(com.bytedance.sdk.openadsdk.core.yt.qdl());
            com.bytedance.sdk.openadsdk.core.model.fs fsVarQdl = new fs.qdl().mo(f10).mzz(f11).mml(f12).lnr(f13).ud(System.currentTimeMillis()).qdl(0L).qdl(ax.qdl(this.qdl.gy.rq())).ud(ax.lnr(this.qdl.gy.rq())).mml(i11).mzz(i12).mo(i10).qdl(sparseArray).ud(com.bytedance.sdk.openadsdk.core.tvp.ud().qdl() ? 1 : 2).lnr(i13).qdl(ax.jpc(com.bytedance.sdk.openadsdk.core.yt.qdl())).ud(ax.tvp(com.bytedance.sdk.openadsdk.core.yt.qdl())).qdl();
            HashMap map = new HashMap();
            map.put("duration", Long.valueOf(this.qdl.bch.fs()));
            qdl qdlVar = this.qdl;
            com.bytedance.sdk.openadsdk.mml.lnr.qdl("click_other", qdlVar.f17090ud, fsVarQdl, qdlVar.mzz, true, (Map<String, Object>) map, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(View view, float f10, float f11, float f12, float f13, SparseArray<lnr.qdl> sparseArray, int i10, int i11, int i12) {
        if (view == null) {
            return;
        }
        if (view.getId() == com.bytedance.sdk.openadsdk.utils.jtx.mzz) {
            qdl("click_play_star_level", (JSONObject) null);
        } else if (view.getId() != com.bytedance.sdk.openadsdk.utils.jtx.mml && view.getId() != com.bytedance.sdk.openadsdk.utils.jtx.f17872wd) {
            if (view.getId() == com.bytedance.sdk.openadsdk.utils.jtx.lnr) {
                qdl("click_play_source", (JSONObject) null);
            } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.jtx.f17869ud) {
                qdl("click_play_logo", (JSONObject) null);
            } else if (view.getId() != com.bytedance.sdk.openadsdk.utils.jtx.fs && view.getId() != com.bytedance.sdk.openadsdk.utils.jtx.blf && view.getId() != com.bytedance.sdk.openadsdk.utils.jtx.jtx) {
                if (view.getId() == 520093705) {
                    qdl("click_start_play", to());
                } else if (view.getId() == com.bytedance.sdk.openadsdk.utils.jtx.rq) {
                    qdl("click_video", to());
                } else if (view.getId() == 520093707 || view.getId() == com.bytedance.sdk.openadsdk.utils.jtx.jpc) {
                    qdl("fallback_endcard_click", to());
                }
            } else {
                qdl("click_start_play_bar", to());
            }
        } else {
            qdl("click_play_star_nums", (JSONObject) null);
        }
        ud(view, f10, f11, f12, f13, sparseArray, i10, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(String str, JSONObject jSONObject) {
        qdl qdlVar = this.qdl;
        ljh ljhVar = qdlVar.f17090ud;
        String str2 = qdlVar.mzz;
        if (!qdlVar.mml) {
            jSONObject = null;
        }
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, str2, str, jSONObject);
    }

    public com.bytedance.sdk.openadsdk.core.lnr.mzz qdl(final qdl qdlVar, final ljh ljhVar) {
        return new com.bytedance.sdk.openadsdk.core.lnr.mzz(qdlVar.f17086ag, ljhVar, qdlVar.mzz, qdlVar.mml ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.to.4
            @Override // com.bytedance.sdk.openadsdk.core.lnr.mzz
            public void qdl(View view, float f10, float f11, float f12, float f13, SparseArray<lnr.qdl> sparseArray, int i10, int i11, int i12, boolean z10) {
                if (ljhVar.uj() && view != null) {
                    Object tag = view.getTag(570425345);
                    if (tag instanceof String) {
                        qdl((String) tag);
                    }
                }
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(qdlVar.bch.fs()));
                if (qdlVar.to.get()) {
                    map.put("click_scence", 2);
                } else {
                    map.put("click_scence", 1);
                }
                com.bytedance.sdk.openadsdk.activity.jpc jpcVar = qdlVar.lq;
                if (jpcVar != null) {
                    jpcVar.qdl(map, f10, f11);
                }
                qdl(map);
                qdlVar.f17091wc.mrf();
                qdlVar.uw.qdl(view, f10, f11, f12, f13, sparseArray, i10, i11, i12, new mml.qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.to.4.1
                    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.mml.qdl
                    public void qdl(String str, JSONObject jSONObject) {
                        to.this.qdl(str, jSONObject);
                    }

                    @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.mml.qdl
                    public void qdl(View view2, float f14, float f15, float f16, float f17, SparseArray<lnr.qdl> sparseArray2, int i13, int i14, int i15) {
                        to.this.qdl(view2, f14, f15, f16, f17, sparseArray2, i13, i14, i15);
                    }
                });
                com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(ljhVar, 9);
                qdlVar.bch.ag();
            }
        };
    }
}
