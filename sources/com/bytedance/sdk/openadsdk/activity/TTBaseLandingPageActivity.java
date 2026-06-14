package com.bytedance.sdk.openadsdk.activity;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes6.dex */
public class TTBaseLandingPageActivity extends TTBaseActivity {
    private long qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private long f16811ud;

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        long j10 = this.qdl;
        if (j10 > 0) {
            com.bytedance.sdk.openadsdk.utils.mzz.qdl(j10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        if (this.f16811ud > 0) {
            this.qdl += SystemClock.elapsedRealtime() - this.f16811ud;
            this.f16811ud = 0L;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (com.bytedance.sdk.openadsdk.utils.mzz.lnr()) {
            this.f16811ud = SystemClock.elapsedRealtime();
        }
    }
}
