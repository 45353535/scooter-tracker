package com.mbridge.msdk.advanced.view;

import android.content.Context;
import android.content.IntentFilter;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.advanced.common.NetWorkStateReceiver;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.pubmatic.sdk.omsdk.POBOMSDKUtil;

/* JADX INFO: loaded from: classes10.dex */
public class MBNativeAdvancedWebview extends WindVaneWebView {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f46438t = "MBNativeAdvancedWebview";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AdSession f46439r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private NetWorkStateReceiver f46440s;

    public MBNativeAdvancedWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public void finishAdSession() {
        try {
            AdSession adSession = this.f46439r;
            if (adSession != null) {
                adSession.finish();
                this.f46439r = null;
                q0.a(POBOMSDKUtil.TAG, "finish adSession");
            }
        } catch (Exception e10) {
            q0.a(POBOMSDKUtil.TAG, e10.getMessage());
        }
    }

    public AdSession getAdSession() {
        return this.f46439r;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        registerNetWorkReceiver();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        unregisterNetWorkReceiver();
    }

    public void registerNetWorkReceiver() {
        try {
            if (this.f46440s == null) {
                this.f46440s = new NetWorkStateReceiver(this);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            getContext().registerReceiver(this.f46440s, intentFilter);
        } catch (Throwable th2) {
            q0.a(f46438t, th2.getMessage());
        }
    }

    public void setAdSession(AdSession adSession) {
        this.f46439r = adSession;
    }

    public void unregisterNetWorkReceiver() {
        try {
            NetWorkStateReceiver netWorkStateReceiver = this.f46440s;
            if (netWorkStateReceiver != null) {
                netWorkStateReceiver.a();
                getContext().unregisterReceiver(this.f46440s);
            }
        } catch (Throwable th2) {
            q0.a(f46438t, th2.getMessage());
        }
    }
}
