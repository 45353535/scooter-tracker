package com.bytedance.sdk.openadsdk.activity;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.view.to;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class TTRewardExpressVideoActivity extends TTRewardVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean jyq() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public Map<String, Object> koa() {
        return this.f16812ud.mo();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ljh();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean oth() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void qdl(long j10, long j11) {
        int iQg = this.f16812ud.f17090ud.qg();
        boolean z10 = this.f16812ud.bqt.tvp() && iQg >= 0;
        int i10 = (int) (j10 / 1000);
        lnr(j10, j11);
        to toVar = this.f16812ud.bqt;
        if (toVar != null && toVar.qdl() != null) {
            this.f16812ud.bqt.qdl().setTime(String.valueOf(this.mo), i10, 0, false);
            this.f16812ud.bqt.qdl().qdl(j10, j11);
        }
        int i11 = this.mo;
        if (i11 > 0) {
            if (!z10) {
                this.f16812ud.fco.qdl(String.valueOf(i11), null);
                return;
            }
            if (i10 < iQg) {
                this.f16812ud.fco.qdl(String.valueOf(i11), null);
                return;
            }
            if (this.f16812ud.f17090ud.taz() == 5 || this.f16812ud.f17090ud.taz() == 33) {
                this.f16812ud.fco.qdl(String.valueOf(this.mo), null);
                return;
            }
            this.f16812ud.qdl(true);
            this.f16812ud.fco.qdl(String.valueOf(this.mo), TTAdDislikeToast.getSkipText());
            this.f16812ud.fco.mzz(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void wd() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public FrameLayout xmv() {
        return this.f16812ud.bqt.ud();
    }
}
