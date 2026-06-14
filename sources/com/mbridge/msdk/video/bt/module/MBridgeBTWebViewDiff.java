package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.mbridge.msdk.click.a;
import com.mbridge.msdk.click.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.mraid.b;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.signal.impl.k;

/* JADX INFO: loaded from: classes10.dex */
public abstract class MBridgeBTWebViewDiff extends BTBaseView implements b, j {
    public k jsCommon;
    public WindVaneWebView webView;

    public MBridgeBTWebViewDiff(Context context) {
        super(context);
    }

    public abstract /* synthetic */ void close();

    public abstract /* synthetic */ void expand(String str, boolean z10);

    public abstract /* synthetic */ CampaignEx getMraidCampaign();

    public void open(String str) {
        try {
            String clickURL = this.f52113b.getClickURL();
            if (!TextUtils.isEmpty(str)) {
                this.f52113b.setClickURL(str);
                reportOpen(str);
            }
            this.f52113b.setClickTempSource(2);
            this.f52113b.setClickType(2);
            this.f52113b.setTriggerClickSource(2);
            a aVar = new a(getContext(), this.f52114c);
            aVar.a(this);
            aVar.a(this.f52113b);
            this.f52113b.setClickURL(clickURL);
        } catch (Throwable th2) {
            q0.b(BTBaseView.TAG, th2.getMessage());
        }
    }

    public void reportOpen(String str) {
        try {
            CampaignEx mraidCampaign = getMraidCampaign();
            if (mraidCampaign != null) {
                new h(getContext()).a(mraidCampaign.getRequestId(), mraidCampaign.getRequestIdNotice(), mraidCampaign.getId(), this.f52114c, str, this.f52113b.isBidCampaign());
            }
        } catch (Throwable th2) {
            q0.a(BTBaseView.TAG, th2.getMessage());
        }
    }

    public void setChinaAlertInstallState(k kVar) {
    }

    public abstract /* synthetic */ void unload();

    public abstract /* synthetic */ void useCustomClose(boolean z10);

    public MBridgeBTWebViewDiff(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
