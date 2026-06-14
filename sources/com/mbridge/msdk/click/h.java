package com.mbridge.msdk.click;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;

/* JADX INFO: loaded from: classes10.dex */
public class h extends AppletSchemeCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeListener.NativeTrackingListener f46514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CampaignEx f46515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AppletsModel f46516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f46517d;

    public h(NativeListener.NativeTrackingListener nativeTrackingListener, CampaignEx campaignEx, AppletsModel appletsModel, a aVar) {
        this.f46514a = nativeTrackingListener;
        this.f46515b = campaignEx;
        this.f46516c = appletsModel;
        this.f46517d = aVar;
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    protected void onRequestFailed(int i10, String str, String str2) {
        CampaignEx campaignEx = this.f46515b;
        if (campaignEx == null || this.f46516c == null) {
            return;
        }
        try {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f46514a;
            if (nativeTrackingListener != null) {
                try {
                    nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("DefaultAppletSchemeCallBack", e10.getMessage());
                    }
                }
            }
            this.f46516c.setUserClick(false);
            this.f46516c.setRequestingFinish();
            this.f46515b.setClickURL(str2);
            a aVar = this.f46517d;
            if (aVar != null) {
                try {
                    aVar.a(this.f46515b);
                } catch (Exception e11) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("DefaultAppletSchemeCallBack", e11.getMessage());
                    }
                }
            }
        } catch (Exception e12) {
            if (MBridgeConstans.DEBUG) {
                q0.b("DefaultAppletSchemeCallBack", e12.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    protected void onRequestStart() {
    }

    @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
    protected void onRequestSuccess(String str) {
        CampaignEx campaignEx = this.f46515b;
        if (campaignEx == null || this.f46516c == null) {
            return;
        }
        try {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f46514a;
            if (nativeTrackingListener != null) {
                try {
                    nativeTrackingListener.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("DefaultAppletSchemeCallBack", e10.getMessage());
                    }
                }
            }
            this.f46516c.setUserClick(false);
            this.f46516c.setRequestingFinish();
            this.f46515b.setDeepLinkUrl(str);
            a aVar = this.f46517d;
            if (aVar != null) {
                try {
                    aVar.a(this.f46515b);
                } catch (Exception e11) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("DefaultAppletSchemeCallBack", e11.getMessage());
                    }
                }
            }
        } catch (Exception e12) {
            if (MBridgeConstans.DEBUG) {
                q0.b("DefaultAppletSchemeCallBack", e12.getMessage());
            }
        }
    }
}
