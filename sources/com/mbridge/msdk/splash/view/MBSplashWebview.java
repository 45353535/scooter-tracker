package com.mbridge.msdk.splash.view;

import android.content.Context;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.pubmatic.sdk.omsdk.POBOMSDKUtil;

/* JADX INFO: loaded from: classes10.dex */
public class MBSplashWebview extends WindVaneWebView {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f50998r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private AdSession f50999s;

    public MBSplashWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public void finishAdSession() {
        try {
            AdSession adSession = this.f50999s;
            if (adSession != null) {
                adSession.finish();
                this.f50999s = null;
                q0.a(POBOMSDKUtil.TAG, "finish adSession");
            }
        } catch (Exception e10) {
            q0.a(POBOMSDKUtil.TAG, e10.getMessage());
        }
    }

    public AdSession getAdSession() {
        return this.f50999s;
    }

    public String getRequestId() {
        return this.f50998r;
    }

    public void setAdSession(AdSession adSession) {
        this.f50999s = adSession;
    }

    public void setRequestId(String str) {
        this.f50998r = str;
    }
}
