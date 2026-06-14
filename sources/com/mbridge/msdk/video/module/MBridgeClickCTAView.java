package com.mbridge.msdk.video.module;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.video.dynview.listener.h;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class MBridgeClickCTAView extends MBridgeClickCTAViewDiff {
    public f ctaClickCallBack;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ViewGroup f52538m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ImageView f52539n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextView f52540o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TextView f52541p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f52542q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f52543r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f52544s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f52545t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ObjectAnimator f52546u;

    class b extends com.mbridge.msdk.widget.a {
        b() {
        }

        @Override // com.mbridge.msdk.widget.a
        protected void a(View view) {
            MBridgeClickCTAView.this.getClass();
            MBridgeClickCTAView.this.e();
        }
    }

    class c extends com.mbridge.msdk.widget.a {
        c() {
        }

        @Override // com.mbridge.msdk.widget.a
        protected void a(View view) {
            MBridgeClickCTAView.this.getClass();
            MBridgeClickCTAView.this.e();
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    class e extends com.mbridge.msdk.video.module.listener.impl.e {
        e(ImageView imageView, CampaignEx campaignEx, String str) {
            super(imageView, campaignEx, str);
        }

        @Override // com.mbridge.msdk.video.module.listener.impl.e, com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            super.onFailedLoad(str, str2);
            MBridgeClickCTAView.this.g();
        }
    }

    public interface f {
    }

    public MBridgeClickCTAView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        JSONObject jSONObject;
        CampaignEx campaignEx = this.f52527b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            try {
                CampaignEx.c rewardTemplateMode = this.f52527b.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.k() + "";
                }
                j.a(com.mbridge.msdk.foundation.controller.c.n().d(), "cta_click", this.f52527b.getCampaignUnitId(), this.f52527b.isBidCampaign(), this.f52527b.getRequestId(), this.f52527b.getRequestIdNotice(), this.f52527b.getId(), str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        try {
            jSONObject = new JSONObject();
        } catch (JSONException e11) {
            e = e11;
            jSONObject = null;
        }
        try {
            jSONObject.put(com.mbridge.msdk.foundation.same.a.f48598j, a(0));
        } catch (JSONException e12) {
            e = e12;
            e.printStackTrace();
        }
        this.f52527b.setTriggerClickSource(1);
        this.f52527b.setClickTempSource(1);
        this.notifyListener.a(105, jSONObject);
    }

    private void f() {
        int iFindLayout = findLayout("mbridge_reward_clickable_cta");
        if (i0.a(iFindLayout)) {
            this.f52528c.inflate(iFindLayout, this);
            this.f52530e = h();
            d();
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        ImageView imageView = this.f52539n;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        this.f52538m = (ViewGroup) findViewById(findID("mbridge_viewgroup_ctaroot"));
        this.f52539n = (ImageView) findViewById(findID("mbridge_iv_appicon"));
        this.f52540o = (TextView) findViewById(findID("mbridge_tv_title"));
        TextView textView = (TextView) findViewById(findID("mbridge_tv_install"));
        this.ctaTv = textView;
        return isNotNULL(this.f52538m, this.f52539n, this.f52540o, textView);
    }

    private void i() {
        setWrapContent();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    protected void d() {
        super.d();
        if (this.f52530e) {
            CampaignEx campaignEx = this.f52527b;
            if (campaignEx != null && campaignEx.isDynamicView()) {
                b1.a(this, this.f52527b.getLocalRequestId(), this.f52527b.getLocalAllowTrackClick());
                setOnClickListener(new b());
            }
            CampaignEx campaignEx2 = this.f52527b;
            if (campaignEx2 != null) {
                b1.a(this.ctaTv, campaignEx2.getLocalRequestId(), this.f52527b.getLocalAllowTrackClick());
            }
            this.ctaTv.setOnClickListener(new c());
            ImageView imageView = this.f52539n;
            if (imageView != null) {
                imageView.setOnClickListener(new d());
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeClickCTAViewDiff, com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.f52546u;
        if (objectAnimator != null) {
            try {
                objectAnimator.start();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f52546u;
        if (objectAnimator != null) {
            try {
                objectAnimator.cancel();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f52543r = motionEvent.getRawX();
        this.f52544s = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f52545t = configuration.orientation;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeClickCTAViewDiff
    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        CampaignEx campaignEx = this.f52527b;
        if (campaignEx != null) {
            if (campaignEx.isDynamicView()) {
                a(this, this.f52527b);
            } else {
                f();
            }
            if (this.f52530e) {
                if (com.mbridge.msdk.util.b.a()) {
                    setChinaCTAData();
                }
                this.ctaTv.setText(this.f52527b.getAdCall());
                if (TextUtils.isEmpty(this.f52527b.getIconUrl())) {
                    g();
                } else {
                    com.mbridge.msdk.foundation.same.image.b.a(this.f52526a.getApplicationContext()).a(this.f52527b.getIconUrl(), new e(this.f52539n, this.f52527b, this.f52542q));
                }
                if (this.f52540o != null && !TextUtils.isEmpty(this.f52527b.getAppName())) {
                    this.f52540o.setText(this.f52527b.getAppName());
                }
                if (this.f52541p == null || TextUtils.isEmpty(this.f52527b.getAppDesc())) {
                    return;
                }
                this.f52541p.setText(this.f52527b.getAppDesc());
            }
        }
    }

    public void setCtaClickCallBack(f fVar) {
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.f52546u = objectAnimator;
    }

    public void setUnitId(String str) {
        this.f52542q = str;
    }

    public MBridgeClickCTAView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void a(ViewGroup viewGroup, CampaignEx campaignEx) {
        com.mbridge.msdk.video.dynview.b.a().a(new com.mbridge.msdk.video.dynview.wrapper.c().a(viewGroup, campaignEx), new a(viewGroup));
    }

    class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f52547a;

        a(ViewGroup viewGroup) {
            this.f52547a = viewGroup;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.a aVar) {
            if (aVar != null) {
                this.f52547a.addView(aVar.b());
                MBridgeClickCTAView mBridgeClickCTAView = MBridgeClickCTAView.this;
                mBridgeClickCTAView.f52530e = mBridgeClickCTAView.h();
                MBridgeClickCTAView mBridgeClickCTAView2 = MBridgeClickCTAView.this;
                mBridgeClickCTAView2.f52541p = (TextView) mBridgeClickCTAView2.findViewById(mBridgeClickCTAView2.findID("mbridge_tv_desc"));
                MBridgeClickCTAView.this.d();
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.error.a aVar) {
            q0.b(MBridgeBaseView.TAG, "errorMsg:" + aVar.g());
        }
    }
}
