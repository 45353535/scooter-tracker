package com.mbridge.msdk.video.signal.factory;

import android.app.Activity;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.a;
import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.impl.i;
import com.mbridge.msdk.video.signal.impl.j;
import com.mbridge.msdk.video.signal.impl.k;
import com.mbridge.msdk.video.signal.impl.m;
import com.mbridge.msdk.video.signal.impl.n;
import com.mbridge.msdk.video.signal.impl.o;
import com.mbridge.msdk.video.signal.impl.q;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class b extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Activity f53105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WebView f53106i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MBridgeVideoView f53107j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MBridgeContainerView f53108k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CampaignEx f53109l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MBridgeBTContainer f53110m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a.InterfaceC0598a f53111n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f53112o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<CampaignEx> f53113p;

    public b(Activity activity) {
        this.f53105h = activity;
    }

    public void a(k kVar) {
        this.f53099b = kVar;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        WebView webView = this.f53106i;
        if (webView == null) {
            return super.getActivityProxy();
        }
        if (this.f53098a == null) {
            this.f53098a = new i(webView);
        }
        return this.f53098a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.i getIJSRewardVideoV1() {
        Activity activity;
        MBridgeContainerView mBridgeContainerView = this.f53108k;
        if (mBridgeContainerView == null || (activity = this.f53105h) == null) {
            return super.getIJSRewardVideoV1();
        }
        if (this.f53103f == null) {
            this.f53103f = new o(activity, mBridgeContainerView);
        }
        return this.f53103f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        if (this.f53105h == null || this.f53110m == null) {
            return super.getJSBTModule();
        }
        if (this.f53104g == null) {
            this.f53104g = new j(this.f53105h, this.f53110m);
        }
        return this.f53104g;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        CampaignEx campaignEx;
        List<CampaignEx> list;
        Activity activity = this.f53105h;
        if (activity == null || (campaignEx = this.f53109l) == null) {
            return super.getJSCommon();
        }
        if (this.f53099b == null) {
            this.f53099b = new k(activity, campaignEx);
        }
        if (this.f53109l.getDynamicTempCode() == 5 && (list = this.f53113p) != null) {
            d dVar = this.f53099b;
            if (dVar instanceof k) {
                ((k) dVar).a(list);
            }
        }
        this.f53099b.setActivity(this.f53105h);
        this.f53099b.setUnitId(this.f53112o);
        this.f53099b.a(this.f53111n);
        return this.f53099b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        MBridgeContainerView mBridgeContainerView = this.f53108k;
        if (mBridgeContainerView == null) {
            return super.getJSContainerModule();
        }
        if (this.f53102e == null) {
            this.f53102e = new m(mBridgeContainerView);
        }
        return this.f53102e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        WebView webView = this.f53106i;
        if (webView == null) {
            return super.getJSNotifyProxy();
        }
        if (this.f53101d == null) {
            this.f53101d = new n(webView);
        }
        return this.f53101d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.j getJSVideoModule() {
        MBridgeVideoView mBridgeVideoView = this.f53107j;
        if (mBridgeVideoView == null) {
            return super.getJSVideoModule();
        }
        if (this.f53100c == null) {
            this.f53100c = new q(mBridgeVideoView);
        }
        return this.f53100c;
    }

    public void a(List<CampaignEx> list) {
        this.f53113p = list;
    }

    public b(Activity activity, MBridgeBTContainer mBridgeBTContainer, WebView webView) {
        this.f53105h = activity;
        this.f53110m = mBridgeBTContainer;
        this.f53106i = webView;
    }

    public b(Activity activity, WebView webView, MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, a.InterfaceC0598a interfaceC0598a) {
        this.f53105h = activity;
        this.f53106i = webView;
        this.f53107j = mBridgeVideoView;
        this.f53108k = mBridgeContainerView;
        this.f53109l = campaignEx;
        this.f53111n = interfaceC0598a;
        this.f53112o = mBridgeVideoView.getUnitId();
    }
}
