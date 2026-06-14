package com.mbridge.msdk.advanced.manager;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;

/* JADX INFO: loaded from: classes10.dex */
public class c extends com.mbridge.msdk.advanced.manager.a {

    class a implements NativeListener.TrackingExListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f46341a;

        a(CampaignEx campaignEx) {
            this.f46341a = campaignEx;
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
            if (campaign == null) {
                return;
            }
            u0.a(campaign, c.this.f46246c);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            return false;
        }

        @Override // com.mbridge.msdk.out.NativeListener.TrackingExListener
        public void onLeaveApp() {
            c cVar = c.this;
            com.mbridge.msdk.advanced.middle.d dVar = cVar.f46247d;
            if (dVar != null) {
                dVar.d(cVar.f46255l);
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, c.this.f46246c);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            u0.b(this.f46341a, c.this.f46246c);
        }
    }

    public c(Context context, String str, String str2) {
        super(context, str, str2);
    }

    @Override // com.mbridge.msdk.advanced.manager.a
    public void a(CampaignEx campaignEx, boolean z10, String str) {
        if (this.f46248e == null) {
            this.f46248e = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f46253j);
        }
        this.f46248e.a(new a(campaignEx));
        if (z10 && !TextUtils.isEmpty(str)) {
            com.mbridge.msdk.advanced.report.a.a(campaignEx, this.f46253j, str);
        }
        campaignEx.setCampaignUnitId(this.f46253j);
        this.f46248e.a(campaignEx);
        if (!this.f46245b.isReportClick()) {
            this.f46245b.setReportClick(true);
            com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
        }
        com.mbridge.msdk.advanced.middle.d dVar = this.f46247d;
        if (dVar != null) {
            dVar.b(this.f46255l);
        }
    }
}
