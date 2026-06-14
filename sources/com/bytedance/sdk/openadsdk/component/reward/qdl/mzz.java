package com.bytedance.sdk.openadsdk.component.reward.qdl;

import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.hkc;
import com.bytedance.sdk.openadsdk.core.model.aaj;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.mml.ud;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.oth;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mzz {
    private qdl lnr;
    private final com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.reward.view.jpc f17085ud;

    public interface qdl {
        void qdl(boolean z10, boolean z11, boolean z12, com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar, int i10);
    }

    public mzz(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        this.qdl = qdlVar;
        this.f17085ud = new com.bytedance.sdk.openadsdk.component.reward.view.jpc(qdlVar);
    }

    private int mo() {
        int iGuw = this.qdl.f17090ud.guw();
        if (iGuw <= 5000 && iGuw >= 0) {
            if (iGuw < 1000) {
                iGuw += 1000;
            }
            int iQdl = com.bytedance.sdk.openadsdk.core.yt.mml().qdl(this.qdl.f17090ud.fz());
            if (iQdl <= 5000 && iQdl >= 0) {
                if (iQdl < 1000) {
                    iQdl += 1000;
                }
                return Math.min(iGuw, iQdl);
            }
        }
        return -1;
    }

    public void lnr() {
        this.f17085ud.mml();
    }

    public void mml() {
        qdl(true);
    }

    public boolean mzz() {
        return this.f17085ud.mzz();
    }

    public void qdl() {
        this.f17085ud.qdl();
    }

    public void ud() {
        this.f17085ud.lnr();
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.lnr.mzz mzzVar) {
        this.f17085ud.qdl(mzzVar);
    }

    public boolean ud(com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar) {
        boolean z10;
        this.qdl.jpc = mo();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        int i10 = qdlVar.jpc;
        if (qdlVar.f17090ud.jtx()) {
            return false;
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.qdl;
        int i11 = qdlVar2.jpc;
        if (i11 != -1) {
            if (i11 >= 0) {
                qdlVar2.jyq.set(false);
                Message messageObtain = Message.obtain();
                messageObtain.what = 700;
                com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = this.qdl;
                messageObtain.arg1 = qdlVar3.jpc;
                qdlVar3.cx.sendMessage(messageObtain);
                if (!vu.wd(this.qdl.f17090ud)) {
                    z10 = true;
                }
            }
            z10 = false;
        } else if (qdlVar2.lq == null && vu.jpc(qdlVar2.f17090ud) && this.qdl.hkc.exu()) {
            udVar.ljh();
            z10 = false;
        } else {
            udVar.bjy();
            z10 = true;
        }
        if (this.qdl.hkc.aaj() ? false : z10) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar4 = this.qdl;
            if (qdlVar4.kab == null || !qdlVar4.mml()) {
                return true;
            }
            this.qdl.kab.qdl(r6.jpc);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void qdl(boolean r11, boolean r12, boolean r13, com.bytedance.sdk.openadsdk.component.reward.ud.ud r14, int r15) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.qdl.mzz.qdl(boolean, boolean, boolean, com.bytedance.sdk.openadsdk.component.reward.ud.ud, int):void");
    }

    private boolean ud(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.view.mml mmlVarQdl;
        if (!aaj.lnr(this.qdl.f17090ud) || (mmlVarQdl = this.qdl.bqt.qdl()) == null || mmlVarQdl.mml != 0 || z10) {
            return true;
        }
        this.qdl.fco.lnr(false);
        return false;
    }

    private void qdl(boolean z10, boolean z11, boolean z12, int i10) {
        int i11;
        HashMap map = new HashMap();
        if (this.qdl.hkc.koa()) {
            i11 = 1;
        } else {
            i11 = !this.qdl.hkc.rdp() ? -1 : 2;
        }
        map.put("webview_state", Integer.valueOf(i11));
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(qdlVar.f17090ud, qdlVar.mzz, z10, z11, z12, qdlVar.f17086ag.isFinishing(), i10, map);
    }

    public void qdl(boolean z10, com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar) {
        exu exuVar;
        this.qdl.jl.set(z10);
        udVar.rdp();
        this.qdl.f17090ud.uj();
        this.qdl.fco.mml(false);
        this.qdl.fco.lnr(false);
        this.qdl.hkc.ljh();
        aaj aajVar = this.qdl.gy.bjy;
        if (aajVar != null) {
            aajVar.mzz();
        }
        this.qdl.gy.lnr();
        com.bytedance.sdk.openadsdk.component.reward.view.to toVar = this.qdl.bqt;
        if (toVar != null) {
            toVar.mo();
        }
        jpc jpcVar = this.qdl.xmv;
        if (jpcVar != null) {
            jpcVar.lnr(jpc.f17066ud);
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        if (!TextUtils.isEmpty(ljh.qdl(qdlVar.om, qdlVar.f17090ud))) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.qdl;
            oth.qdl(qdlVar2.f17086ag, vu.fs(qdlVar2.f17090ud), this.qdl.f17090ud, ud.qdl.lnr);
            return;
        }
        if (ljh.lnr(this.qdl.f17090ud) && (exuVar = this.qdl.hzv) != null) {
            exuVar.mo();
        }
        if (!ljh.qdl(this.qdl.f17090ud) && (ljh.lnr(this.qdl.f17090ud) || !this.qdl.hkc.rc())) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = this.qdl;
            if (ljh.qdl(qdlVar3.f17090ud, qdlVar3.hkc.exu(), this.qdl.hkc.hkc(), this.qdl.hzv.fs(), this.qdl.hkc.bch())) {
                if (!ljh.mml(this.qdl.f17090ud) && !ljh.lnr(this.qdl.f17090ud)) {
                    this.qdl.hkc.qdl(true, 0, (String) null);
                }
                ud(udVar);
                qdl(udVar);
                return;
            }
        }
        mml();
    }

    void qdl(com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar) {
        if (!ljh.lnr(this.qdl.f17090ud)) {
            this.qdl.hzv.qdl(8);
            this.qdl.hkc.qdl(0);
            this.qdl.hkc.kdv();
        } else {
            this.qdl.hkc.qdl(8);
            this.qdl.hzv.qdl(0);
            this.qdl.hzv.wd();
        }
        if (this.qdl.f17092wd) {
            ax.qdl((View) udVar.rdp, 0);
            this.qdl.gy.mo(8);
        }
        this.qdl.gy.mml(8);
        this.qdl.gy.wd();
        if (ljh.lnr(this.qdl.f17090ud)) {
            this.qdl.cx.sendEmptyMessageDelayed(800, 100L);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        qdlVar.hkc.qdl(qdlVar.gt, true);
        this.qdl.hkc.lnr(true);
        this.qdl.hkc.ud(true);
        hkc hkcVarTvp = this.qdl.hkc.tvp();
        if (hkcVarTvp != null) {
            hkcVarTvp.qdl("prerender_page_show", (JSONObject) null);
        }
        if (!vu.ud(this.qdl.f17090ud)) {
            this.qdl.fco.lnr(false);
        }
        com.bytedance.sdk.component.tvp.mo moVarJpc = this.qdl.hkc.jpc();
        if (moVarJpc == null || moVarJpc.getWebView() == null) {
            return;
        }
        moVarJpc.exu();
        moVarJpc.getWebView().resumeTimers();
    }

    public void qdl(boolean z10) {
        if (!ljh.mml(this.qdl.f17090ud)) {
            this.qdl.hkc.qdl(false, 408, "end_card_timeout");
        }
        this.qdl.hkc.uw();
        this.qdl.hkc.qdl(8);
        this.qdl.hzv.qdl(8);
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.qdl;
        if (qdlVar.f17092wd) {
            ax.qdl((View) qdlVar.en.rdp, 8);
            this.qdl.gy.mo(0);
        }
        this.qdl.gy.mml(8);
        if (this.qdl.f17090ud.uj()) {
            if (!this.f17085ud.qdl(this.qdl.bch)) {
                this.qdl.f17086ag.finish();
            }
        } else {
            com.bytedance.sdk.openadsdk.activity.jpc jpcVar = this.qdl.lq;
            if (jpcVar != null) {
                this.f17085ud.qdl(jpcVar.cx().tvp());
            }
            this.f17085ud.ud();
        }
        this.qdl.gy.wd();
        if (z10) {
            ud(this.qdl.en);
        }
        this.qdl.fco.lnr(false);
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.qdl;
        qdlVar2.vu.qdl(qdlVar2.f17090ud.mq());
    }

    public void qdl(qdl qdlVar) {
        this.lnr = qdlVar;
    }
}
