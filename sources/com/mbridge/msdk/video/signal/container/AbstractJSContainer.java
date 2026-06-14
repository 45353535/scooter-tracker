package com.mbridge.msdk.video.signal.container;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.video.signal.b;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.video.signal.factory.a;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.impl.k;
import com.mbridge.msdk.video.signal.j;
import com.mbridge.msdk.videocommon.a;
import com.mbridge.msdk.videocommon.setting.c;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractJSContainer extends FrameLayout implements IJSFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Activity f53083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f53084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f53085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected c f53086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f53087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected com.mbridge.msdk.videocommon.entity.c f53088h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected String f53089i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f53090j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f53091k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected boolean f53092l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected int f53093m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f53094n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f53095o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected boolean f53096p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected IJSFactory f53097q;

    public AbstractJSContainer(Context context) {
        super(context);
        this.f53081a = 0;
        this.f53082b = 1;
        this.f53090j = 2;
        this.f53091k = false;
        this.f53092l = false;
        this.f53096p = false;
        this.f53097q = new a();
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private boolean i(int i10) {
        try {
            if (i10 == 1) {
                this.f53083c.setRequestedOrientation(12);
            } else {
                if (i10 != 2) {
                    return false;
                }
                this.f53083c.setRequestedOrientation(11);
            }
            return true;
        } catch (Throwable th2) {
            q0.b("AbstractJSContainer", th2.getMessage(), th2);
            return false;
        }
    }

    protected void a(Object obj) {
        f.a().b(obj, h(this.f53081a));
    }

    protected void b(Object obj, String str) {
        f.a().b(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public b getActivityProxy() {
        return this.f53097q.getActivityProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        return this.f53097q.getIJSRewardVideoV1();
    }

    protected String getInnerPlacementId() {
        c cVar;
        return (!TextUtils.isEmpty(this.f53085e) || (cVar = this.f53086f) == null || TextUtils.isEmpty(cVar.t())) ? this.f53085e : this.f53086f.t();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.c getJSBTModule() {
        return this.f53097q.getJSBTModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        return this.f53097q.getJSCommon();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.f getJSContainerModule() {
        return this.f53097q.getJSContainerModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        return this.f53097q.getJSNotifyProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        return this.f53097q.getJSVideoModule();
    }

    public String getPlacementId() {
        return this.f53085e;
    }

    public String getUnitId() {
        return this.f53084d;
    }

    protected String h(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            q0.b("AbstractJSContainer", "code to string is error");
            return "";
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (getJSCommon().a()) {
            getActivityProxy().a(configuration);
        }
    }

    public void onDestroy() {
        if (getJSCommon().a()) {
            getActivityProxy().b();
        }
    }

    public void onPause() {
        if (getJSCommon().a()) {
            getActivityProxy().g();
        }
        getActivityProxy().a(1);
    }

    public void onRestart() {
        if (getJSCommon().a()) {
            getActivityProxy().f();
        }
        getActivityProxy().a(4);
    }

    public void onResume() {
        if (com.mbridge.msdk.foundation.feedback.b.f48549f) {
            return;
        }
        if (getJSCommon().a()) {
            getActivityProxy().d();
        }
        getActivityProxy().a(0);
    }

    public void onStart() {
        if (getJSCommon().a()) {
            getActivityProxy().h();
        }
        getActivityProxy().a(2);
    }

    public void onStop() {
        if (getJSCommon().a()) {
            getActivityProxy().c();
        }
        getActivityProxy().a(3);
    }

    public void registerJsFactory(IJSFactory iJSFactory) {
        this.f53097q = iJSFactory;
    }

    public void setActivity(Activity activity) {
        this.f53083c = activity;
    }

    public void setBidCampaign(boolean z10) {
        this.f53092l = z10;
    }

    public void setBigOffer(boolean z10) {
        this.f53096p = z10;
    }

    public void setIV(boolean z10) {
        this.f53091k = z10;
    }

    public void setIVRewardEnable(int i10, int i11, int i12) {
        this.f53093m = i10;
        this.f53094n = i11;
        this.f53095o = i12;
    }

    public void setMute(int i10) {
        this.f53090j = i10;
    }

    public void setPlacementId(String str) {
        this.f53085e = str;
    }

    public void setReward(com.mbridge.msdk.videocommon.entity.c cVar) {
        this.f53088h = cVar;
    }

    public void setRewardId(String str) {
        this.f53089i = str;
    }

    public void setRewardUnitSetting(c cVar) {
        this.f53086f = cVar;
    }

    public void setUnitId(String str) {
        this.f53084d = str;
    }

    public void setUserId(String str) {
        this.f53087g = str;
    }

    protected void a(Object obj, String str) {
        f.a().a(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    protected void b(String str) {
        q0.b("AbstractJSContainer", str);
        Activity activity = this.f53083c;
        if (activity != null) {
            activity.finish();
        }
    }

    protected int a(CampaignEx campaignEx) {
        k kVarB = b(campaignEx);
        if (kVarB != null) {
            return kVarB.n();
        }
        return 0;
    }

    protected void a(c cVar, CampaignEx campaignEx) {
        CampaignEx.c rewardTemplateMode;
        if (a(campaignEx) == 1) {
            return;
        }
        if (((campaignEx == null || (rewardTemplateMode = campaignEx.getRewardTemplateMode()) == null) ? false : i(rewardTemplateMode.g())) || cVar == null) {
            return;
        }
        i(this.f53086f.y());
    }

    protected k b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        a.C0600a c0600aA = com.mbridge.msdk.videocommon.a.a(this.f53091k ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, campaignEx);
        if (c0600aA != null && c0600aA.c()) {
            WindVaneWebView windVaneWebViewB = c0600aA.b();
            if (windVaneWebViewB.getObject() instanceof k) {
                return (k) windVaneWebViewB.getObject();
            }
        }
        return null;
    }

    public AbstractJSContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53081a = 0;
        this.f53082b = 1;
        this.f53090j = 2;
        this.f53091k = false;
        this.f53092l = false;
        this.f53096p = false;
        this.f53097q = new com.mbridge.msdk.video.signal.factory.a();
    }
}
