package com.mbridge.msdk.scheme.applet;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AppletSchemeCallBack implements IAppletSchemeCallBack {
    private static final String TAG = "AppletSchemeCallBack";

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onAppletSchemeRequestFailed(int i10, String str, String str2) {
        try {
            onRequestFailed(i10, str, str2);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, e10.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onAppletSchemeRequestStart() {
        try {
            onRequestStart();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, e10.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onAppletSchemeRequestSuccess(String str) {
        try {
            onRequestSuccess(str);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, e10.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.IAppletSchemeCallBack
    public void onNetworkError(int i10, String str, String str2) {
        try {
            onRequestFailed(i10, str, str2);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, e10.getMessage());
            }
        }
    }

    protected abstract void onRequestFailed(int i10, String str, String str2);

    protected abstract void onRequestStart();

    protected abstract void onRequestSuccess(String str);
}
