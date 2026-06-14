package com.mbridge.msdk.video.dynview.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.video.bt.module.orglistener.f;
import com.mbridge.msdk.video.module.MBridgeBaseView;
import com.mbridge.msdk.widget.FeedBackButton;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class MBridgeOrderCampView extends MBridgeBaseView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MBridgeOrderCampView f52425m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<CampaignEx> f52426n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f52427o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f52428p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f52429q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f52430r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f52431s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private FeedBackButton f52432t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f52433u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f52434v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.c f52435w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.b f52436x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f52437y;

    class a implements com.mbridge.msdk.video.dynview.listener.c {
        a() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.c
        public void a(CampaignEx campaignEx, int i10) {
            if (campaignEx != null) {
                try {
                    MBridgeOrderCampView.this.setCampaign(campaignEx);
                    campaignEx.setClickTempSource(2);
                    campaignEx.setTriggerClickSource(2);
                    MBridgeOrderCampView.this.a(campaignEx, 0, i10);
                } catch (Exception e10) {
                    q0.b(MBridgeBaseView.TAG, e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.c
        public void close() {
            MBridgeOrderCampView.this.g();
        }
    }

    class c implements com.mbridge.msdk.foundation.feedback.a {
        c() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
        }
    }

    class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f52442a;

        d(String str) {
            this.f52442a = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.mbridge.msdk.click.c.e(((MBridgeBaseView) MBridgeOrderCampView.this).f52526a, this.f52442a);
        }
    }

    public MBridgeOrderCampView(Context context) {
        super(context);
        this.f52434v = false;
        this.f52435w = new a();
        this.f52437y = false;
    }

    private void f() {
        if (this.f52433u == null) {
            return;
        }
        g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD == null) {
            this.f52433u.setVisibility(8);
            return;
        }
        String strC = gVarD.c();
        if (TextUtils.isEmpty(strC)) {
            this.f52433u.setVisibility(8);
        }
        this.f52433u.setOnClickListener(new d(strC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            e eVar = new e();
            eVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000134", this.f52527b);
        } catch (Throwable th2) {
            q0.a(MBridgeBaseView.TAG, th2.getMessage());
        }
        try {
            com.mbridge.msdk.video.dynview.moffer.a.a().b();
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
        com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
        if (aVar != null) {
            aVar.a(104, "");
        }
    }

    public void createView(ViewGroup viewGroup) {
        if (this.f52426n == null) {
            com.mbridge.msdk.video.dynview.listener.b bVar = this.f52436x;
            if (bVar != null) {
                bVar.b();
                return;
            }
            return;
        }
        HashMap map = new HashMap();
        map.put("order_view_callback", this.f52435w);
        com.mbridge.msdk.video.dynview.b.a().a(new com.mbridge.msdk.video.dynview.wrapper.c().b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f52426n), new b(viewGroup), map);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        this.f52425m = this;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        JSONException e10;
        JSONObject jSONObject;
        super.onAttachedToWindow();
        if (this.f52426n == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f52426n.size(); i10++) {
            try {
                jSONObject = new JSONObject();
            } catch (JSONException e11) {
                e10 = e11;
                jSONObject = null;
            }
            try {
                jSONObject.put("camp_position", i10);
            } catch (JSONException e12) {
                e10 = e12;
                e10.printStackTrace();
            }
            com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
            if (aVar != null) {
                aVar.a(110, jSONObject);
            }
        }
    }

    public void setCampOrderViewBuildCallback(com.mbridge.msdk.video.dynview.listener.b bVar) {
        this.f52436x = bVar;
    }

    public void setCampaignExes(List<CampaignEx> list) {
        this.f52426n = list;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        this.f52427o = i10;
        this.f52428p = i11;
        this.f52429q = i12;
        this.f52430r = i13;
        setViewStatus();
    }

    public void setRewarded(boolean z10) {
        this.f52437y = z10;
    }

    public void setViewStatus() {
        MBridgeOrderCampView mBridgeOrderCampView = this.f52425m;
        if (mBridgeOrderCampView == null || !this.f52437y) {
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) mBridgeOrderCampView.findViewById(filterFindViewId(this.f52434v, "mbridge_native_order_camp_controller"));
        this.f52432t = (FeedBackButton) this.f52425m.findViewById(filterFindViewId(this.f52434v, "mbridge_native_order_camp_feed_btn"));
        this.f52433u = (ImageView) this.f52425m.findViewById(filterFindViewId(this.f52434v, "mbridge_iv_link"));
        if (relativeLayout != null) {
            relativeLayout.setPadding(this.f52427o, this.f52429q, this.f52428p, this.f52430r);
        }
        if (this.f52432t != null) {
            try {
                e();
            } catch (Exception e10) {
                q0.b(MBridgeBaseView.TAG, e10.getMessage());
            }
        }
        if (this.f52433u != null) {
            try {
                f();
            } catch (Exception e11) {
                q0.b(MBridgeBaseView.TAG, e11.getMessage());
            }
        }
    }

    public void startAlphaAnimation() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        this.f52425m.startAnimation(alphaAnimation);
    }

    public void startTranslateAnimation() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(500L);
        this.f52425m.startAnimation(translateAnimation);
    }

    private void e() {
        List<CampaignEx> list = this.f52426n;
        if (list == null || list.get(0) == null) {
            FeedBackButton feedBackButton = this.f52432t;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
                return;
            }
            return;
        }
        this.f52431s = this.f52426n.get(0).getCampaignUnitId();
        this.f52527b = this.f52426n.get(0);
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f52431s + "_2", this.f52527b);
        if (this.f52432t == null) {
            return;
        }
        if (!com.mbridge.msdk.foundation.feedback.b.b().a()) {
            this.f52432t.setVisibility(8);
            return;
        }
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f52431s + "_2", new c());
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f52431s + "_2", this.f52432t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, int i10, int i11) {
        JSONException jSONException;
        JSONObject jSONObject;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            try {
                CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.k() + "";
                }
                String str2 = str;
                j.a(com.mbridge.msdk.foundation.controller.c.n().d(), "order_view_click" + str2, campaignEx.getCampaignUnitId(), campaignEx.isBidCampaign(), campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str2);
            } catch (Exception e10) {
                q0.b(MBridgeBaseView.TAG, e10.getMessage());
            }
        }
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e11) {
            jSONException = e11;
            jSONObject = null;
        }
        try {
            jSONObject.put(com.mbridge.msdk.foundation.same.a.f48598j, a(i10));
            jSONObject.put("camp_position", i11);
        } catch (JSONException e12) {
            jSONException = e12;
            jSONException.printStackTrace();
        }
        com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
        if (aVar != null) {
            aVar.a(105, jSONObject);
        }
    }

    public MBridgeOrderCampView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52434v = false;
        this.f52435w = new a();
        this.f52437y = false;
    }

    class b implements com.mbridge.msdk.video.dynview.listener.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f52439a;

        b(ViewGroup viewGroup) {
            this.f52439a = viewGroup;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.a aVar) {
            if (aVar != null) {
                try {
                    MBridgeOrderCampView.this.f52425m.addView(aVar.b());
                    MBridgeOrderCampView.this.f52434v = aVar.c();
                    this.f52439a.removeAllViews();
                    this.f52439a.addView(MBridgeOrderCampView.this.f52425m);
                    f.a(com.mbridge.msdk.foundation.controller.c.n().d(), (List<CampaignEx>) MBridgeOrderCampView.this.f52426n, ((CampaignEx) MBridgeOrderCampView.this.f52426n.get(0)).getCampaignUnitId());
                    MBridgeOrderCampView.this.setViewStatus();
                    if (MBridgeOrderCampView.this.f52436x != null) {
                        MBridgeOrderCampView.this.f52436x.a();
                    }
                } catch (Exception e10) {
                    q0.b(MBridgeBaseView.TAG, e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.error.a aVar) {
            try {
                f.a(com.mbridge.msdk.foundation.controller.c.n().d(), (List<CampaignEx>) MBridgeOrderCampView.this.f52426n, ((CampaignEx) MBridgeOrderCampView.this.f52426n.get(0)).getCampaignUnitId(), aVar.g());
                if (MBridgeOrderCampView.this.f52436x != null) {
                    MBridgeOrderCampView.this.f52436x.b();
                }
            } catch (Exception e10) {
                q0.b(MBridgeBaseView.TAG, e10.getMessage());
            }
        }
    }
}
