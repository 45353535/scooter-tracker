package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.bqt;
import com.bytedance.sdk.openadsdk.core.koa;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.bjy;
import com.bytedance.sdk.openadsdk.utils.fco;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TTFullScreenVideoActivity extends TTBaseVideoActivity {
    private static com.bytedance.sdk.openadsdk.qdl.lnr.ud jtx;
    private com.bytedance.sdk.openadsdk.qdl.lnr.ud bjy;
    private boolean yt;

    private void rc() {
        if (com.bytedance.sdk.openadsdk.jyq.qdl.jpc() && isChangingConfigurations()) {
            aaj.qdl("BVA", "callback close is invoke by config change.");
            return;
        }
        if (this.f16813wd) {
            return;
        }
        this.f16813wd = true;
        aaj.qdl("BVA", "invoke callback onAdClose, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            qdl("onAdClose");
            return;
        }
        com.bytedance.sdk.openadsdk.qdl.lnr.ud udVar = this.bjy;
        if (udVar != null) {
            udVar.ud();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vu() {
        aaj.qdl("BVA", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            qdl("onAdVideoBarClick");
            return;
        }
        com.bytedance.sdk.openadsdk.qdl.lnr.ud udVar = this.bjy;
        if (udVar != null) {
            udVar.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean aaj() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void car() {
        vu();
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
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TTFullScreenVideoActivity.this.f16812ud.hkc.aaj() && TTFullScreenVideoActivity.this.f16812ud.to.get()) {
                        boolean zExu = TTFullScreenVideoActivity.this.f16812ud.hzv.exu();
                        TTFullScreenVideoActivity.this.f16812ud.hkc.mo(zExu);
                        TTFullScreenVideoActivity.this.f16812ud.gy.mo(8);
                        View view3 = view;
                        if (view3 instanceof com.bytedance.sdk.openadsdk.core.mo.mml) {
                            ((com.bytedance.sdk.openadsdk.core.mo.mml) view3).setImageResource(com.bytedance.sdk.component.utils.ljh.mml(TTFullScreenVideoActivity.this.f16812ud.om, "tt_close_btn"));
                        }
                        TTFullScreenVideoActivity.this.f16812ud.cx.sendEmptyMessageDelayed(600, 5000L);
                        if (!ljh.lnr(TTFullScreenVideoActivity.this.f16812ud.f17090ud)) {
                            return;
                        }
                        if (ljh.lnr(TTFullScreenVideoActivity.this.f16812ud.f17090ud) && zExu) {
                            return;
                        }
                    }
                    TTFullScreenVideoActivity.this.f16812ud.hkc.jyq();
                    TTFullScreenVideoActivity.this.f16812ud.hzv.rq();
                    TTFullScreenVideoActivity.this.f16812ud.vu.mo();
                    TTFullScreenVideoActivity.this.finish();
                }
            };
            view.setOnClickListener(onClickListener);
            view.setTag(view.getId(), onClickListener);
        }
        this.f16812ud.fco.qdl(new com.bytedance.sdk.openadsdk.component.reward.top.ud() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.4
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
                com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm;
                com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
                com.bytedance.sdk.openadsdk.component.reward.view.mml mmlVarQdl2;
                if (vu.mo(TTFullScreenVideoActivity.this.f16812ud.f17090ud) || (vu.mzz(TTFullScreenVideoActivity.this.f16812ud.f17090ud) && TTFullScreenVideoActivity.this.f16812ud.xmv.mml(com.bytedance.sdk.openadsdk.component.reward.qdl.jpc.f17066ud))) {
                    if (vu.jpc(TTFullScreenVideoActivity.this.f16812ud.f17090ud)) {
                        TTFullScreenVideoActivity.this.f16812ud.xmv.tvp();
                        return;
                    }
                    View view3 = view;
                    if (view3 != null) {
                        view3.performClick();
                        return;
                    } else {
                        TTFullScreenVideoActivity.this.finish();
                        return;
                    }
                }
                if (com.bytedance.sdk.openadsdk.core.model.aaj.qdl(TTFullScreenVideoActivity.this.f16812ud.f17090ud) && !TTFullScreenVideoActivity.this.f16812ud.jtx.get()) {
                    TTFullScreenVideoActivity.this.finish();
                    return;
                }
                bjy.qdl qdlVar = new bjy.qdl();
                qdlVar.ud(TTFullScreenVideoActivity.this.f16812ud.bch.fs());
                qdlVar.mml(TTFullScreenVideoActivity.this.f16812ud.bch.uw());
                qdlVar.lnr(TTFullScreenVideoActivity.this.f16812ud.bch.jtx());
                qdlVar.lnr(3);
                qdlVar.mml(TTFullScreenVideoActivity.this.f16812ud.bch.bch());
                qdlVar.qdl(TTFullScreenVideoActivity.this.f16812ud.bch.ud());
                com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.qdl(TTFullScreenVideoActivity.this.f16812ud.bch.jpc(), qdlVar, TTFullScreenVideoActivity.this.f16812ud.bch.mzz());
                bqt.lnr(TTFullScreenVideoActivity.this.f16812ud.mo);
                TTFullScreenVideoActivity.this.f16812ud.bch.qdl("skip", false);
                TTFullScreenVideoActivity.this.f16812ud.fco.mml(false);
                com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = TTFullScreenVideoActivity.this.f16812ud;
                if (!qdlVar2.lnr || (com.bytedance.sdk.openadsdk.core.model.aaj.lnr(qdlVar2.f17090ud) && (mmlVarQdl2 = TTFullScreenVideoActivity.this.f16812ud.bqt.qdl()) != null && mmlVarQdl2.mml == 0)) {
                    TTFullScreenVideoActivity.this.finish();
                } else {
                    TTFullScreenVideoActivity.this.qdl(true, 4);
                }
                ljh ljhVar = TTFullScreenVideoActivity.this.f16812ud.f17090ud;
                if (ljhVar != null && (mmlVarZm = ljhVar.zm()) != null && (mmlVarQdl = mmlVarZm.qdl()) != null) {
                    mmlVarQdl.mo(TTFullScreenVideoActivity.this.f16812ud.bch.fs());
                    mmlVarQdl.mzz(TTFullScreenVideoActivity.this.f16812ud.bch.fs());
                }
                com.bytedance.sdk.openadsdk.bch.ud.mzz.qdl(TTFullScreenVideoActivity.this.f16812ud.f17090ud, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void ud(View view2) {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.f16812ud.kdv.qdl(tTFullScreenVideoActivity.lnr);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void qdl(View view2, String str) {
                com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm;
                com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.f16812ud.gt = !r0.gt;
                com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = tTFullScreenVideoActivity.lnr;
                if (udVar != null && udVar.mml() != null) {
                    TTFullScreenVideoActivity.this.lnr.mml().qdl(TTFullScreenVideoActivity.this.f16812ud.gt);
                }
                com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = TTFullScreenVideoActivity.this.f16812ud;
                qdlVar.bch.qdl(qdlVar.gt, str);
                if (!vu.jtx(TTFullScreenVideoActivity.this.f16812ud.f17090ud) || TTFullScreenVideoActivity.this.f16812ud.to.get()) {
                    com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = TTFullScreenVideoActivity.this.f16812ud;
                    qdlVar2.hkc.mzz(qdlVar2.gt);
                    com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = TTFullScreenVideoActivity.this.f16812ud;
                    qdlVar3.xmv.ud(qdlVar3.gt);
                    ljh ljhVar = TTFullScreenVideoActivity.this.f16812ud.f17090ud;
                    if (ljhVar == null || (mmlVarZm = ljhVar.zm()) == null || (mmlVarQdl = mmlVarZm.qdl()) == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar4 = TTFullScreenVideoActivity.this.f16812ud;
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
        jtx = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.f16812ud != null) {
            com.bytedance.sdk.openadsdk.mo.ud.qdl().qdl("videoForceBreak", this.f16812ud.f17090ud);
        }
        try {
            rc();
        } catch (Exception unused) {
        }
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void gy() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void jpc() {
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            qdl("onAdShow");
        } else {
            com.bytedance.sdk.openadsdk.qdl.lnr.ud udVar = this.bjy;
            if (udVar != null) {
                udVar.qdl();
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

    public void lnr(int i10) {
        int iWs = this.f16812ud.f17090ud.ws();
        if (!yt.mml().mo(String.valueOf(this.f16812ud.mo)) || (!ljh.mzz(this.f16812ud.f17090ud) && !this.f16812ud.lnr)) {
            if (i10 >= iWs) {
                com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.f16812ud;
                if (!qdlVar.mlb) {
                    qdlVar.qdl(true);
                }
                mml();
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.f16812ud;
        if (!qdlVar2.mlb) {
            qdlVar2.qdl(true);
        }
        if (i10 > iWs) {
            mml();
        } else {
            mml(iWs - i10);
            this.f16812ud.fco.mzz(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mml() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl r0 = r3.f16812ud
            com.bytedance.sdk.openadsdk.core.model.ljh r0 = r0.f17090ud
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.ljh.mzz(r0)
            r1 = 0
            if (r0 != 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl r0 = r3.f16812ud
            boolean r2 = r0.lnr
            if (r2 != 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.qdl.fs r0 = r0.fco
            java.lang.String r2 = "X"
            r0.qdl(r1, r2)
            goto L24
        L19:
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl r0 = r3.f16812ud
            com.bytedance.sdk.openadsdk.component.reward.qdl.fs r0 = r0.fco
            java.lang.String r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getSkipText()
            r0.qdl(r1, r2)
        L24:
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl r0 = r3.f16812ud
            com.bytedance.sdk.openadsdk.component.reward.qdl.fs r0 = r0.fco
            r1 = 1
            r0.mzz(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.mml():void");
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void mrf() {
        if (this.f16812ud.f17090ud.nv() != 100.0f) {
            this.yt = true;
        }
        vu();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.f16812ud;
        if (qdlVar == null || ljh.mzz(qdlVar.f17090ud)) {
            return;
        }
        com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVarTdy = this.f16812ud.f17090ud.tdy();
        if (udVarTdy == null) {
            com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud udVar = new com.bykv.vk.openvk.qdl.qdl.qdl.lnr.ud();
            udVar.qdl(10.0d);
            this.f16812ud.f17090ud.qdl(udVar);
        } else if (udVarTdy.mo() <= 0.0d) {
            udVarTdy.qdl(10.0d);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        rc();
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            qdl("recycleRes");
        }
        qdl(isFinishing(), isChangingConfigurations());
        this.bjy = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!this.exu) {
            jtx = this.bjy;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.f16812ud;
        if (qdlVar == null || !ud(qdlVar.f17090ud) || qdl(this.f16812ud.f17090ud)) {
            return;
        }
        if (this.yt) {
            this.yt = false;
            finish();
        } else if (this.f16812ud.hkc.bqt()) {
            finish();
        }
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
        mmlVarQdl.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.mzz() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.mzz
            public void qdl() {
                TTFullScreenVideoActivity.this.vu();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void ud(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public FrameLayout xmv() {
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.lnr;
        return (udVar == null || !(udVar instanceof com.bytedance.sdk.openadsdk.component.reward.ud.jpc)) ? this.f16812ud.gy.mo() : ((com.bytedance.sdk.openadsdk.component.reward.ud.jpc) udVar).vu();
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void ud(boolean z10) {
    }

    private void qdl(final String str) {
        fco.lnr(new com.bytedance.sdk.component.jpc.jpc("FullScreen_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTFullScreenVideoActivity.this.qdl(1).executeFullVideoCallback(TTFullScreenVideoActivity.this.f16812ud.wak, str);
                } catch (Throwable th2) {
                    aaj.lnr("TTAD.FSVA", "fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", th2);
                }
            }
        }, 5);
    }

    private boolean ud(ljh ljhVar) {
        if (ljhVar == null) {
            return false;
        }
        return yt.mml().aaj(String.valueOf(this.f16812ud.mo));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void qdl(@NonNull Intent intent) {
        super.qdl(intent);
        this.f16812ud.lte = intent.getBooleanExtra("is_verity_playable", false);
    }

    private void mml(int i10) {
        this.f16812ud.fco.qdl(null, String.format(com.bytedance.sdk.component.utils.ljh.qdl(yt.qdl(), "tt_skip_ad_time_text"), Integer.valueOf(i10)));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.exu.mml.ud
    public void qdl(Bundle bundle) {
        if (this.exu) {
            super.qdl(bundle);
            this.bjy = (com.bytedance.sdk.openadsdk.qdl.lnr.ud) koa.qdl().qdl(this.tvp, com.bytedance.sdk.openadsdk.qdl.lnr.ud.class);
            return;
        }
        if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
            this.bjy = koa.qdl().lnr();
        }
        if (this.bjy != null || bundle == null) {
            return;
        }
        this.bjy = jtx;
        jtx = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void qdl(long j10, long j11) {
        lnr((int) (j10 / 1000));
        int i10 = this.mo;
        if (i10 >= 0) {
            this.f16812ud.fco.qdl(String.valueOf(i10), null);
        }
    }

    private boolean qdl(ljh ljhVar) {
        return ljhVar == null || ljhVar.nv() == 100.0f;
    }
}
