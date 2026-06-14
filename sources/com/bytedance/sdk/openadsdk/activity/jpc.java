package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import com.adjust.sdk.purchase.ADJPConstants;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.ud;
import com.bytedance.sdk.openadsdk.component.reward.rq;
import com.bytedance.sdk.openadsdk.core.ljh;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.oth;
import com.bytedance.sdk.openadsdk.core.widget.jl;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.utils.uw;
import com.ironsource.N6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jpc implements com.bytedance.sdk.openadsdk.core.exu.mml.ud {
    public String bjy;
    protected boolean exc;
    public boolean exu;
    public boolean fs;
    protected IListenerManager jl;
    protected final AtomicBoolean jpc = new AtomicBoolean(false);
    public boolean jtx = false;
    private jl lnr;
    protected ljh mo;
    private boolean qdl;
    public String rdp;
    public int rq;
    public int to;
    protected com.bytedance.sdk.openadsdk.component.reward.qdl.qdl tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private boolean f16859ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    protected final ud f16860wd;
    public boolean yt;

    public jpc(ud udVar, ljh ljhVar, int i10, int i11, boolean z10) {
        this.f16860wd = udVar;
        this.mo = ljhVar;
        this.to = i10;
        this.rq = i11;
        this.yt = z10;
    }

    protected abstract boolean a_();

    public void aaj() {
        jl jlVar = this.lnr;
        if (jlVar != null) {
            jlVar.tvp();
            this.lnr = null;
        }
        this.qdl = false;
    }

    public boolean ag() {
        ud udVar = this.f16860wd;
        return udVar != null && udVar.qdl(this, this.to);
    }

    public void ax() {
    }

    public abstract String b_();

    protected abstract String bch();

    public boolean bqt() {
        return false;
    }

    public abstract void c_();

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public final void car() {
        ljh ljhVar;
        irn();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.tvp;
        if (qdlVar == null || (ljhVar = qdlVar.f17090ud) == null) {
            return;
        }
        ljhVar.cor();
        this.tvp.f17090ud.lnr(true);
        if (ljh.mzz(this.tvp.f17090ud)) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.tvp;
            ljh ljhVar2 = qdlVar2.f17090ud;
            com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVar2, qdlVar2.mzz, ljhVar2.wb());
        }
    }

    public ud cx() {
        return this.f16860wd;
    }

    public abstract boolean d_();

    public void exu() {
    }

    public boolean fco() {
        return false;
    }

    protected void gt() {
        ud udVar = this.f16860wd;
        if (udVar == null || udVar.yt()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            ud("onAdShow");
        } else {
            this.f16860wd.rdp();
        }
        this.f16860wd.exc();
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void gy() {
        mml(2);
    }

    public boolean hzv() {
        return false;
    }

    protected final void irn() {
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            ud("onAdVideoBarClick");
        } else {
            this.f16860wd.fs();
        }
    }

    public JSONObject jjk() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put(ADJPConstants.KEY_SDK_VERSION, BuildConfig.VERSION_NAME);
            jSONObject.put("media_extra", this.bjy);
            jSONObject.put("play_start_ts", 0);
            jSONObject.put("play_end_ts", 0);
            jSONObject.put("user_id", this.rdp);
            jSONObject.put("trans_id", uw.qdl().replace(TokenBuilder.TOKEN_DELIMITER, ""));
            if (xmv() != null) {
                com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVarXmv = xmv();
                jSONObject.put("duration", (int) qdlVarXmv.bch.xmv());
                jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, qdlVarXmv.f17090ud.mlb());
                jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, qdlVarXmv.f17090ud.lte());
                jSONObject.put("network", com.bytedance.sdk.component.utils.jl.lnr(qdlVarXmv.om));
                JSONObject jSONObjectUzn = qdlVarXmv.f17090ud.uzn();
                jSONObjectUzn.put(N6.V0, com.bytedance.sdk.openadsdk.exc.qdl.ud.qdl.qdl().ud());
                jSONObject.put("extra", jSONObjectUzn);
                jSONObject.put("video_duration", qdlVarXmv.f17090ud.tdy().mo());
                String strMml = "unKnow";
                int iJle = qdlVarXmv.f17090ud.jle();
                if (iJle == 2) {
                    strMml = gy.ud();
                } else if (iJle == 1) {
                    strMml = gy.mml();
                }
                jSONObject.put("user_agent", strMml);
            }
            return jSONObject;
        } catch (Throwable th2) {
            aaj.qdl("Scene", "", th2);
            return null;
        }
    }

    public void jyq() {
    }

    public abstract boolean ljh();

    public void lnr() {
    }

    public abstract void lnr(boolean z10);

    public void lte() {
        if (wc() || xmv() == null || xmv().ax == null || !xmv().f17090ud.vg()) {
            return;
        }
        jl jlVar = new jl(xmv(), new jl.qdl() { // from class: com.bytedance.sdk.openadsdk.activity.jpc.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.jl.qdl
            public void lnr() {
                ud udVar = jpc.this.f16860wd;
                if (udVar != null) {
                    udVar.vu();
                }
                jpc.this.mzz(2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.jl.qdl
            public int mml() {
                ud udVar = jpc.this.f16860wd;
                if (udVar != null) {
                    return udVar.rc();
                }
                return 0;
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.jl.qdl
            public void mo() {
                jpc.this.mzz(1);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.jl.qdl
            public void mzz() {
                jpc.this.mzz(2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.jl.qdl
            public void qdl() {
                jpc jpcVar = jpc.this;
                jpcVar.ud(jpcVar.xmv());
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.jl.qdl
            public void ud() {
                ud udVar = jpc.this.f16860wd;
                if (udVar != null) {
                    udVar.koa();
                }
                jpc.this.mzz(1);
            }
        });
        this.lnr = jlVar;
        jlVar.qdl(xmv().ax);
    }

    public boolean mlb() {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVarXmv;
        jl jlVar;
        if (wc() || (qdlVarXmv = xmv()) == null || !qdlVarXmv.f17090ud.vg() || (jlVar = this.lnr) == null) {
            return false;
        }
        return jlVar.qdl(qdlVarXmv.f17086ag);
    }

    public void mml() {
    }

    public void mo(boolean z10) {
        this.exc = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void mrf() {
        irn();
    }

    public void mzz(boolean z10) {
        this.f16859ud = z10;
    }

    public int om() {
        return this.rq;
    }

    public abstract com.bytedance.sdk.openadsdk.component.reward.view.tvp qdl();

    public void qdl(Activity activity) {
    }

    protected abstract void qdl(Activity activity, ud.mzz mzzVar);

    public abstract void qdl(String str);

    public void rc() {
    }

    public void rdp() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void rq() {
        if (this.jpc.compareAndSet(false, true)) {
            aaj.qdl("BVA", "invoke callback onShow, ".concat(String.valueOf(this)));
            gt();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void sy() {
        ud udVar = this.f16860wd;
        if (udVar != null) {
            udVar.qdl(this, true);
        }
    }

    public boolean taz() {
        return this.f16859ud;
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public List<ljh> tid() {
        return this.f16860wd.xmv();
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void ud(int i10) {
    }

    protected void wak() {
        if (this.mo != null) {
            com.bytedance.sdk.openadsdk.mo.ud.qdl().qdl("videoForceBreak", this.mo);
        }
        this.f16860wd.mo();
    }

    public boolean wc() {
        return this.yt;
    }

    public void xi() {
        mml(0);
    }

    public abstract com.bytedance.sdk.openadsdk.component.reward.qdl.qdl xmv();

    public Activity yh() {
        return this.f16860wd.wd();
    }

    public void zlt() {
        aaj.qdl("Scene", "tryPreloadVideo scene = " + this + ",index =" + this.to);
        com.bytedance.sdk.openadsdk.core.exu.qdl.ud udVarQdl = ljh.qdl(CacheDirFactory.getICacheDir(this.mo.lhl()).qdl(), this.mo);
        udVarQdl.qdl("material_meta", this.mo);
        udVarQdl.qdl("ad_slot", this.mo.ji());
        com.bytedance.sdk.openadsdk.core.exu.mzz.qdl.qdl(udVarQdl, new com.bykv.vk.openvk.qdl.qdl.qdl.mzz.ud() { // from class: com.bytedance.sdk.openadsdk.activity.jpc.4
            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0201qdl
            public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar, int i10) {
            }

            @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0201qdl
            public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar, int i10, String str) {
            }
        });
    }

    private void lnr(final String str) {
        fco.lnr(new com.bytedance.sdk.component.jpc.jpc("FullScreen_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.jpc.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    jpc.this.lnr(1).executeFullVideoCallback(jpc.this.bch(), str);
                } catch (Throwable th2) {
                    aaj.lnr("Scene", "fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", th2);
                }
            }
        }, 5);
    }

    public void mml(final int i10) {
        if (!this.f16860wd.rq().getBoolean("reward_verify", false) && !this.f16860wd.bjy() && !this.f16860wd.rq().getBoolean("user_has_give_up_reward", false)) {
            this.f16860wd.rq().putBoolean("reward_verify", true);
            if (xmv() != null) {
                com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVarXmv = xmv();
                if (yt.mml().jtx(String.valueOf(qdlVarXmv.mo))) {
                    qdl(true, qdlVarXmv.f17090ud.lte(), qdlVarXmv.f17090ud.mlb(), 0, "", i10);
                } else {
                    yt.lnr().qdl(jjk(), new oth.ud() { // from class: com.bytedance.sdk.openadsdk.activity.jpc.3
                        @Override // com.bytedance.sdk.openadsdk.core.oth.ud
                        public void qdl(int i11, String str) {
                            jpc.this.qdl(false, 0, "", i11, str, i10);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.oth.ud
                        public void qdl(ljh.ud udVar) {
                            jpc.this.qdl(udVar.f17292ud, udVar.lnr.qdl(), udVar.lnr.ud(), 0, "", i10);
                        }
                    });
                }
            }
        }
    }

    public void mzz(int i10) {
        ud udVar = this.f16860wd;
        if (udVar != null) {
            udVar.qdl(i10);
        }
    }

    public void qdl(Activity activity, Bundle bundle) {
    }

    public final void ud(Activity activity, ud.mzz mzzVar) {
        if (this.qdl) {
            return;
        }
        this.qdl = true;
        qdl(activity, mzzVar);
    }

    protected final IListenerManager lnr(int i10) {
        if (this.jl == null) {
            this.jl = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl().qdl(i10));
        }
        return this.jl;
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void qdl(Bundle bundle) {
    }

    public void qdl(jpc jpcVar, jpc jpcVar2, ud.mzz mzzVar) {
    }

    public void qdl(Map<String, Object> map, float f10, float f11) {
    }

    protected void ud(String str) {
        if (a_()) {
            qdl(str, false, 0, "", 0, "");
        } else {
            lnr(str);
        }
    }

    protected void qdl(boolean z10, boolean z11, boolean z12, int i10) {
        this.f16860wd.qdl(this, z10, z11, z12, i10);
    }

    private void qdl(final String str, final boolean z10, final int i10, final String str2, final int i11, final String str3) {
        fco.lnr(new com.bytedance.sdk.component.jpc.jpc("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.jpc.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    jpc.this.lnr(0).executeRewardVideoCallback(jpc.this.bch(), str, z10, i10, str2, i11, str3);
                } catch (Throwable th2) {
                    aaj.lnr("Scene", Constants.REWARDED_VIDEO, "executeRewardVideoCallback execute throw Exception : ", th2);
                }
            }
        }, 5);
    }

    protected final void qdl(boolean z10, int i10, String str, int i11, String str2, int i12) {
        if (this.f16860wd.bjy()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            qdl("onRewardVerify", z10, i10, str, i11, str2);
        } else {
            this.f16860wd.qdl(this, z10, i10, str, i11, str2);
        }
        rq.qdl(this.mo, z10, i12);
    }

    public void ud(Activity activity) {
        if (com.bytedance.sdk.openadsdk.jyq.qdl.jpc() && activity != null && activity.isChangingConfigurations()) {
            aaj.qdl("BVA", "callback close is invoke by config change.");
        } else if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            ud("onAdClose");
        } else {
            this.f16860wd.exu();
        }
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, int i10, int i11) {
        this.mo = ljhVar;
        this.to = i10;
        this.rq = i11;
    }

    public void ud(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        if (ag()) {
            return;
        }
        ud.mzz mzzVar = new ud.mzz(8, qdlVar);
        mzzVar.mml = qdlVar.gt;
        ud udVar = this.f16860wd;
        if (udVar != null) {
            udVar.ud(this, mzzVar);
        }
    }

    public void qdl(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        if (qdlVar == null) {
            return;
        }
        try {
            int iRc = this.f16860wd.rc();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_countdown_remaining", Math.max(iRc, 0));
            com.bytedance.sdk.openadsdk.mml.lnr.mzz(this.mo, qdlVar.mzz, jSONObject);
        } catch (Throwable unused) {
        }
        ud(qdlVar);
    }
}
