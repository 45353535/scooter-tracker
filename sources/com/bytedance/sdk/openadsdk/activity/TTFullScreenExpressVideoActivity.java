package com.bytedance.sdk.openadsdk.activity;

import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.component.reward.view.to;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void bqt() {
        if (ljh.mzz(this.f16812ud.f17090ud)) {
            finish();
            return;
        }
        to toVar = this.f16812ud.bqt;
        if (toVar == null || toVar.qdl() == null) {
            return;
        }
        this.f16812ud.bqt.qdl().setTime("0", 0, 0, false);
        if (this.f16812ud.bqt.tvp()) {
            this.f16812ud.fco.qdl("0", "X");
            this.f16812ud.fco.mzz(true);
            this.f16812ud.fco.lnr();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean jyq() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public Map<String, Object> koa() {
        return this.f16812ud.mo();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ljh();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean oth() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void qdl(long j10, long j11) {
        int i10 = (int) (j10 / 1000);
        to toVar = this.f16812ud.bqt;
        if (toVar != null && toVar.qdl() != null) {
            this.f16812ud.bqt.qdl().setTime(String.valueOf(this.mo), i10, 0, false);
            this.f16812ud.bqt.qdl().qdl(j10, j11);
        }
        to toVar2 = this.f16812ud.bqt;
        if ((toVar2 == null || !toVar2.tvp()) && !this.f16812ud.f17090ud.au()) {
            return;
        }
        lnr(i10);
        if (this.mo >= 0) {
            this.f16812ud.fco.mml(true);
            this.f16812ud.fco.qdl(String.valueOf(this.mo), null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void wd() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public FrameLayout xmv() {
        com.bytedance.sdk.openadsdk.component.reward.ud.ud udVar = this.lnr;
        return (udVar == null || !(udVar instanceof com.bytedance.sdk.openadsdk.component.reward.ud.jpc) || this.f16812ud.jjk) ? this.f16812ud.bqt.ud() : ((com.bytedance.sdk.openadsdk.component.reward.ud.jpc) udVar).vu();
    }
}
