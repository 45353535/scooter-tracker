package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.adjust.sdk.purchase.ADJPConstants;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.jl;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.rq;
import com.bytedance.sdk.openadsdk.core.koa;
import com.bytedance.sdk.openadsdk.core.ljh;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.oth;
import com.bytedance.sdk.openadsdk.core.widget.ud;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.utils.uw;
import com.ironsource.N6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TTRewardVideoActivity extends TTBaseVideoActivity {
    private static String aaj;
    private static String exc;
    private static String jl;
    private static String jyq;
    private static String oth;
    private static com.bytedance.sdk.openadsdk.qdl.mzz.qdl uw;
    private String bch;
    protected int bjy;
    protected int jtx;
    private boolean koa;
    private String ljh;
    protected com.bytedance.sdk.openadsdk.qdl.mzz.qdl yt;
    private final AtomicBoolean xmv = new AtomicBoolean(false);
    private int bqt = -1;

    private JSONObject ekw() {
        JSONObject jSONObject = new JSONObject();
        int iXmv = (int) this.f16812ud.bch.xmv();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, this.f16812ud.f17090ud.mlb());
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, this.f16812ud.f17090ud.lte());
            jSONObject.put("network", jl.lnr(getApplicationContext()));
            jSONObject.put(ADJPConstants.KEY_SDK_VERSION, BuildConfig.VERSION_NAME);
            int iJle = this.f16812ud.f17090ud.jle();
            String strMml = "unKnow";
            if (iJle == 2) {
                strMml = gy.ud();
            } else if (iJle == 1) {
                strMml = gy.mml();
            }
            jSONObject.put("user_agent", strMml);
            JSONObject jSONObjectUzn = this.f16812ud.f17090ud.uzn();
            jSONObjectUzn.put(N6.V0, com.bytedance.sdk.openadsdk.exc.qdl.ud.qdl.qdl().ud());
            jSONObject.put("extra", jSONObjectUzn);
            jSONObject.put("media_extra", this.ljh);
            jSONObject.put("video_duration", this.f16812ud.f17090ud.tdy().mo());
            jSONObject.put("play_start_ts", this.bjy);
            jSONObject.put("play_end_ts", this.jtx);
            jSONObject.put("duration", iXmv);
            jSONObject.put("user_id", this.bch);
            jSONObject.put("trans_id", uw.qdl().replace(TokenBuilder.TOKEN_DELIMITER, ""));
            return jSONObject;
        } catch (Throwable th2) {
            aaj.qdl("TTAD.RVA", "", th2);
            return null;
        }
    }

    private void hzv() {
        rq rqVar;
        if (com.bytedance.sdk.openadsdk.jyq.qdl.jpc() && isChangingConfigurations()) {
            aaj.qdl("BVA", "reward callback close is invoke by config change.");
            return;
        }
        if (this.f16813wd) {
            aaj.qdl("BVA", "invoke callback onAdClose has already been called ");
            return;
        }
        this.f16813wd = true;
        aaj.qdl("BVA", "invoke callback onAdClose, ");
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.f16812ud;
        if (qdlVar != null && (rqVar = qdlVar.f17087gg) != null) {
            rqVar.mml();
        }
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            qdl("onAdClose");
            return;
        }
        com.bytedance.sdk.openadsdk.qdl.mzz.qdl qdlVar2 = this.yt;
        if (qdlVar2 != null) {
            qdlVar2.ud();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kdv() {
        aaj.qdl("BVA", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            qdl("onAdVideoBarClick");
            return;
        }
        com.bytedance.sdk.openadsdk.qdl.mzz.qdl qdlVar = this.yt;
        if (qdlVar != null) {
            qdlVar.onAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void rc() {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.rc():void");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean aaj() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void bch() {
        vu();
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void car() {
        kdv();
        this.f16812ud.f17090ud.cor();
        this.f16812ud.f17090ud.lnr(true);
        if (ljh.mzz(this.f16812ud.f17090ud)) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.f16812ud;
            ljh ljhVar = qdlVar.f17090ud;
            com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVar, qdlVar.mzz, ljhVar.wb());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void exc() {
        final View view = this.f16812ud.gy.to();
        if (view != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TTRewardVideoActivity.this.f16812ud.hkc.aaj() && TTRewardVideoActivity.this.f16812ud.to.get()) {
                        boolean zExu = TTRewardVideoActivity.this.f16812ud.hzv.exu();
                        TTRewardVideoActivity.this.f16812ud.hkc.mo(zExu);
                        TTRewardVideoActivity.this.f16812ud.gy.mo(8);
                        View view3 = view;
                        if (view3 instanceof com.bytedance.sdk.openadsdk.core.mo.mml) {
                            ((com.bytedance.sdk.openadsdk.core.mo.mml) view3).setImageResource(com.bytedance.sdk.component.utils.ljh.mml(TTRewardVideoActivity.this.f16812ud.om, "tt_close_btn"));
                        }
                        TTRewardVideoActivity.this.f16812ud.cx.sendEmptyMessageDelayed(600, 5000L);
                        if (!ljh.lnr(TTRewardVideoActivity.this.f16812ud.f17090ud)) {
                            return;
                        }
                        if (ljh.lnr(TTRewardVideoActivity.this.f16812ud.f17090ud) && zExu) {
                            return;
                        }
                    }
                    TTRewardVideoActivity.this.f16812ud.hkc.jyq();
                    TTRewardVideoActivity.this.f16812ud.hzv.rq();
                    TTRewardVideoActivity.this.f16812ud.vu.mo();
                    if (vu.mml(TTRewardVideoActivity.this.f16812ud.f17090ud)) {
                        TTRewardVideoActivity.this.lnr(true, true);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                }
            };
            view.setOnClickListener(onClickListener);
            view.setTag(view.getId(), onClickListener);
        }
        this.f16812ud.fco.qdl(new com.bytedance.sdk.openadsdk.component.reward.top.ud() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.5
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void lnr(View view2) {
                View view3 = view;
                if (view3 != null) {
                    view3.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void mml(View view2) {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void qdl(View view2) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.lnr(vu.lnr(tTRewardVideoActivity.f16812ud.f17090ud), false);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void ud(View view2) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.f16812ud.kdv.qdl(tTRewardVideoActivity.lnr);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void qdl(View view2, String str) {
                com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm;
                com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
                com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = TTRewardVideoActivity.this.lnr;
                if (udVar != null && udVar.mml() != null) {
                    TTRewardVideoActivity.this.lnr.mml().qdl(TTRewardVideoActivity.this.f16812ud.gt);
                }
                TTRewardVideoActivity.this.f16812ud.gt = !r3.gt;
                StringBuilder sb2 = new StringBuilder("will set is Mute ");
                sb2.append(TTRewardVideoActivity.this.f16812ud.gt);
                sb2.append(" mLastVolume=");
                sb2.append(TTRewardVideoActivity.this.f16812ud.ekw.qdl());
                com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = TTRewardVideoActivity.this.f16812ud;
                qdlVar.bch.qdl(qdlVar.gt, str);
                if (!vu.jtx(TTRewardVideoActivity.this.f16812ud.f17090ud) || TTRewardVideoActivity.this.f16812ud.to.get()) {
                    com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = TTRewardVideoActivity.this.f16812ud;
                    qdlVar2.hkc.mzz(qdlVar2.gt);
                    com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = TTRewardVideoActivity.this.f16812ud;
                    qdlVar3.xmv.ud(qdlVar3.gt);
                    ljh ljhVar = TTRewardVideoActivity.this.f16812ud.f17090ud;
                    if (ljhVar == null || (mmlVarZm = ljhVar.zm()) == null || (mmlVarQdl = mmlVarZm.qdl()) == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar4 = TTRewardVideoActivity.this.f16812ud;
                    if (qdlVar4.gt) {
                        mmlVarQdl.jpc(qdlVar4.bch.fs());
                    } else {
                        mmlVarQdl.tvp(qdlVar4.bch.fs());
                    }
                }
            }
        });
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.exu) {
            return;
        }
        uw = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.f16812ud != null) {
            com.bytedance.sdk.openadsdk.mo.ud.qdl().qdl("videoForceBreak", this.f16812ud.f17090ud);
        }
        hzv();
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void gy() {
        lnr(2);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void jl() {
        vu();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void jpc() {
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            qdl("onAdShow");
        } else {
            com.bytedance.sdk.openadsdk.qdl.mzz.qdl qdlVar = this.yt;
            if (qdlVar != null) {
                qdlVar.qdl();
            }
        }
        if (oth()) {
            this.f16812ud.bqt.exu();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean jyq() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void mrf() {
        kdv();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar;
        ljh ljhVar;
        super.onCreate(bundle);
        try {
            if (jl == null) {
                jl = com.bytedance.sdk.component.utils.ljh.qdl(this, "tt_reward_msg");
                exc = com.bytedance.sdk.component.utils.ljh.qdl(this, "tt_msgPlayable");
                aaj = com.bytedance.sdk.component.utils.ljh.qdl(this, "tt_negtiveBtnBtnText");
                jyq = com.bytedance.sdk.component.utils.ljh.qdl(this, "tt_postiveBtnText");
                oth = com.bytedance.sdk.component.utils.ljh.qdl(this, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th2) {
            aaj.lnr("TTAD.RVA", th2.getMessage());
        }
        if (bundle == null || (qdlVar = this.f16812ud) == null || (ljhVar = qdlVar.f17090ud) == null || !ljhVar.fco()) {
            return;
        }
        this.xmv.set(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        hzv();
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            qdl("recycleRes");
        }
        qdl(isFinishing(), isChangingConfigurations());
        this.yt = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onPause() {
        rq rqVar;
        super.onPause();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.f16812ud;
        if (qdlVar == null || (rqVar = qdlVar.f17087gg) == null) {
            return;
        }
        rqVar.qdl();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() {
        rq rqVar;
        super.onResume();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.f16812ud;
        if (qdlVar == null || (rqVar = qdlVar.f17087gg) == null) {
            return;
        }
        rqVar.ud();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar;
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!this.exu) {
            uw = this.yt;
        }
        if (this.xmv.get() && (qdlVar = this.f16812ud) != null) {
            qdlVar.f17090ud.hzv();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void qdl(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void to() {
        com.bytedance.sdk.openadsdk.component.reward.view.mml mmlVarQdl;
        super.to();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.f16812ud;
        if (qdlVar == null || (mmlVarQdl = qdlVar.bqt.qdl()) == null) {
            return;
        }
        mmlVarQdl.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.mzz() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.2
            @Override // com.bytedance.sdk.openadsdk.core.widget.mzz
            public void qdl() {
                TTRewardVideoActivity.this.kdv();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void uw() {
        this.jtx = (int) (System.currentTimeMillis() / 1000);
    }

    protected void vu() {
        lnr(0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public FrameLayout xmv() {
        return this.f16812ud.gy.mo();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void lnr() {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar;
        super.lnr();
        if (this.xmv.get() || (qdlVar = this.f16812ud) == null) {
            return;
        }
        qdlVar.f17087gg = new rq(new rq.qdl() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.rq.qdl
            public void qdl() {
                if (TTRewardVideoActivity.this.xmv.get() || TTRewardVideoActivity.this.koa) {
                    return;
                }
                TTRewardVideoActivity.this.lnr(1);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void mml() {
        this.f16812ud.fco.qdl(null, TTAdDislikeToast.getSkipText());
        this.f16812ud.fco.mzz(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void ud(boolean z10, boolean z11) {
        this.bjy = (int) (System.currentTimeMillis() / 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void ud(int i10) {
        if (i10 == 10000) {
            vu();
        }
    }

    protected void ud(long j10, long j11) {
        if (j11 <= 0) {
            return;
        }
        if (this.bqt == -1) {
            this.bqt = Math.min(100, this.f16812ud.f17090ud.ijp());
        }
        if (((j10 / 1000.0f) / j11) * 100.0f >= this.bqt) {
            vu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lnr(final boolean z10, boolean z11) {
        if (!z11 && this.koa && this.f16812ud.to.get() && vu.jpc(this.f16812ud.f17090ud)) {
            this.f16812ud.xmv.tvp();
            return;
        }
        if (!yt.mml().jpc(String.valueOf(this.f16812ud.mo))) {
            if (!z11 && this.f16812ud.to.get() && vu.jpc(this.f16812ud.f17090ud)) {
                this.f16812ud.xmv.tvp();
                return;
            } else if (z10) {
                finish();
                return;
            } else {
                rc();
                return;
            }
        }
        if (this.xmv.get()) {
            if (this.f16812ud.to.get() && vu.jpc(this.f16812ud.f17090ud)) {
                this.f16812ud.xmv.tvp();
                return;
            } else if (z10) {
                finish();
                return;
            } else {
                rc();
                return;
            }
        }
        if (vu.jpc(this.f16812ud.f17090ud) && this.f16812ud.hkc.jpc().getVisibility() == 0) {
            this.f16812ud.xmv.tvp();
            return;
        }
        this.f16812ud.aaj.set(true);
        this.f16812ud.bch.jyq();
        if (z10) {
            this.f16812ud.xmv.mo();
        }
        final com.bytedance.sdk.openadsdk.core.widget.ud udVar = new com.bytedance.sdk.openadsdk.core.widget.ud(this);
        this.lnr.exu = udVar;
        if (z10) {
            udVar.qdl(exc).ud(oth).lnr(aaj);
        } else {
            udVar.qdl(jl).ud(jyq).lnr(aaj);
        }
        this.lnr.exu.qdl(new ud.InterfaceC0284ud() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.ud.InterfaceC0284ud
            public void qdl() {
                TTRewardVideoActivity.this.f16812ud.bch.aaj();
                if (z10) {
                    TTRewardVideoActivity.this.f16812ud.xmv.qdl(1000);
                }
                udVar.dismiss();
                TTRewardVideoActivity.this.f16812ud.aaj.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ud.InterfaceC0284ud
            public void ud() {
                udVar.dismiss();
                TTRewardVideoActivity.this.koa = true;
                TTRewardVideoActivity.this.f16812ud.aaj.set(false);
                TTRewardVideoActivity.this.f16812ud.xmv.ud(Integer.MAX_VALUE);
                if (!z10 || !vu.mo(TTRewardVideoActivity.this.f16812ud.f17090ud)) {
                    TTRewardVideoActivity.this.rc();
                } else if (vu.jpc(TTRewardVideoActivity.this.f16812ud.f17090ud)) {
                    TTRewardVideoActivity.this.f16812ud.xmv.tvp();
                } else {
                    TTRewardVideoActivity.this.f16812ud.vu.mo();
                    TTRewardVideoActivity.this.finish();
                }
            }
        }).show();
    }

    protected void qdl(String str) {
        qdl(str, false, 0, "", 0, "");
    }

    private void qdl(final String str, final boolean z10, final int i10, final String str2, final int i11, final String str3) {
        fco.lnr(new com.bytedance.sdk.component.jpc.jpc("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTRewardVideoActivity.this.qdl(0).executeRewardVideoCallback(TTRewardVideoActivity.this.f16812ud.wak, str, z10, i10, str2, i11, str3);
                } catch (Throwable th2) {
                    aaj.lnr("TTAD.RVA", Constants.REWARDED_VIDEO, "executeRewardVideoCallback execute throw Exception : ", th2);
                }
            }
        }, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void qdl(Bundle bundle) {
        if (this.exu) {
            super.qdl(bundle);
            this.yt = (com.bytedance.sdk.openadsdk.qdl.mzz.qdl) koa.qdl().qdl(this.tvp, com.bytedance.sdk.openadsdk.qdl.mzz.qdl.class);
        } else {
            if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                this.yt = koa.qdl().ud();
            }
            if (this.yt == null && bundle != null) {
                this.yt = uw;
                uw = null;
            }
        }
        Log.e("TTAD.RVA", "initListener: listenerKey = " + this.tvp + ",mRewardAdInteractionListener = " + this.yt + ",savedInstanceState = " + bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void ud(boolean z10) {
        if (z10) {
            vu();
            return;
        }
        if ((1.0d - (((double) this.mo) / this.f16812ud.bch.fco())) * 100.0d >= yt.mml().xmv(String.valueOf(this.f16812ud.mo)).mo) {
            vu();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void qdl(@NonNull Intent intent) {
        super.qdl(intent);
        this.ljh = intent.getStringExtra("media_extra");
        this.bch = intent.getStringExtra("user_id");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void qdl(long j10, long j11) {
        int i10 = (int) (j10 / 1000);
        int iQg = this.f16812ud.f17090ud.qg();
        boolean z10 = iQg >= 0;
        lnr(j10, j11);
        if (this.mo > 0) {
            this.f16812ud.fco.mml(true);
            if (z10 && i10 >= iQg) {
                this.f16812ud.qdl(true);
                this.f16812ud.fco.qdl(String.valueOf(this.mo), TTAdDislikeToast.getSkipText());
                this.f16812ud.fco.mzz(true);
                return;
            }
            this.f16812ud.fco.qdl(String.valueOf(this.mo), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(final boolean z10, final int i10, final String str, final int i11, final String str2, final int i12) {
        aaj.qdl("BVA", "invoke callback onRewardVerify: " + z10 + ", " + i10 + ", " + str + ", " + i11 + ", " + str2 + "; " + this);
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            qdl("onRewardVerify", z10, i10, str, i11, str2);
            rq.qdl(this.f16812ud.f17090ud, z10, i12);
        } else {
            fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.7
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.qdl.mzz.qdl qdlVar = TTRewardVideoActivity.this.yt;
                    if (qdlVar != null) {
                        qdlVar.qdl(z10, i10, str, i11, str2);
                        rq.qdl(TTRewardVideoActivity.this.f16812ud.f17090ud, z10, i12);
                    }
                }
            });
        }
    }

    protected void lnr(final int i10) {
        if (this.xmv.get() || this.koa) {
            return;
        }
        this.xmv.set(true);
        rq rqVar = this.f16812ud.f17087gg;
        if (rqVar != null) {
            rqVar.lnr();
        }
        if (yt.mml().jtx(String.valueOf(this.f16812ud.mo))) {
            qdl(true, this.f16812ud.f17090ud.lte(), this.f16812ud.f17090ud.mlb(), 0, "", i10);
        } else {
            yt.lnr().qdl(ekw(), new oth.ud() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.8
                @Override // com.bytedance.sdk.openadsdk.core.oth.ud
                public void qdl(int i11, String str) {
                    TTRewardVideoActivity.this.qdl(false, 0, "", i11, str, i10);
                }

                @Override // com.bytedance.sdk.openadsdk.core.oth.ud
                public void qdl(ljh.ud udVar) {
                    boolean z10 = udVar.f17292ud;
                    TTRewardVideoActivity.this.qdl(udVar.f17292ud, udVar.lnr.qdl(), udVar.lnr.ud(), 0, "", i10);
                }
            });
        }
    }

    public void lnr(long j10, long j11) {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.f16812ud;
        boolean z10 = false;
        if (qdlVar != null) {
            if (qdlVar.f17090ud.ijp() >= 0 && this.f16812ud.f17090ud.up() >= 0) {
                z10 = true;
            }
            if (z10) {
                j11 = this.f16812ud.f17090ud.up();
            }
        }
        long j12 = j10 + (((long) this.f16812ud.xi) * 1000);
        if (z10) {
            ud(j12, j11);
            return;
        }
        if (this.bqt == -1) {
            this.bqt = yt.mml().xmv(String.valueOf(this.f16812ud.mo)).mo;
        }
        if (j11 <= 0) {
            return;
        }
        if (j11 >= 30000 && j12 >= 27000) {
            vu();
        } else if ((j12 * 100) / j11 >= this.bqt) {
            vu();
        }
    }
}
