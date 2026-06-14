package com.mbridge.msdk.mbbanner.common.manager;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.setting.l;

/* JADX INFO: loaded from: classes10.dex */
public class c extends d {

    class a implements NativeListener.TrackingExListener {
        a() {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            u0.a(campaign, c.this.f49371d);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            return false;
        }

        @Override // com.mbridge.msdk.out.NativeListener.TrackingExListener
        public void onLeaveApp() {
            com.mbridge.msdk.mbbanner.common.listener.c cVar = c.this.f49368a;
            if (cVar != null) {
                cVar.onLeaveApp();
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            u0.a(campaign, c.this.f49371d);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            u0.b(campaign, c.this.f49371d);
        }
    }

    public c(MBBannerView mBBannerView, com.mbridge.msdk.mbbanner.common.listener.c cVar, String str, String str2, boolean z10, l lVar) {
        super(mBBannerView, cVar, str, str2, z10, lVar);
    }

    @Override // com.mbridge.msdk.mbbanner.common.manager.d
    public void a(CampaignEx campaignEx, boolean z10, String str) {
        if (this.f49382o) {
            if (this.f49387t == null) {
                this.f49387t = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f49383p);
            }
            this.f49387t.a(new a());
            campaignEx.setCampaignUnitId(this.f49383p);
            this.f49387t.a(campaignEx);
            if (!this.f49370c.isReportClick()) {
                this.f49370c.setReportClick(true);
                com.mbridge.msdk.mbbanner.common.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
            }
            com.mbridge.msdk.mbbanner.common.listener.c cVar = this.f49368a;
            if (cVar != null) {
                cVar.c();
            }
            if (!z10 || TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.mbbanner.common.report.a.a(campaignEx, this.f49383p, str);
        }
    }
}
