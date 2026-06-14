package com.mbridge.msdk.video.module;

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
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.module.listener.impl.j;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class MBridgeVideoEndCoverView extends MBridgeBaseView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f52647m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f52648n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ImageView f52649o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ImageView f52650p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextView f52651q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f52652r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private TextView f52653s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.mbridge.msdk.video.signal.factory.b f52654t;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVideoEndCoverView.this.notifyListener.a(104, "");
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVideoEndCoverView.this.g();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVideoEndCoverView.this.g();
        }
    }

    public MBridgeVideoEndCoverView(Context context) {
        super(context);
        this.f52647m = "MBridgeVideoEndCoverView";
    }

    private boolean a(View view) {
        if (view == null) {
            return true;
        }
        try {
            this.f52649o = (ImageView) view.findViewById(findID("mbridge_vec_iv_icon"));
            this.f52650p = (ImageView) view.findViewById(findID("mbridge_vec_iv_close"));
            this.f52651q = (TextView) view.findViewById(findID("mbridge_vec_tv_title"));
            this.f52652r = (TextView) view.findViewById(findID("mbridge_vec_tv_desc"));
            this.f52653s = (TextView) view.findViewById(findID("mbridge_vec_btn"));
            return true;
        } catch (Throwable th2) {
            q0.b("MBridgeVideoEndCoverView", th2.getMessage());
            return false;
        }
    }

    private void e() {
        ImageView imageView;
        CampaignEx campaignEx = this.f52527b;
        if (campaignEx != null) {
            if (!TextUtils.isEmpty(campaignEx.getIconUrl()) && (imageView = this.f52649o) != null) {
                b1.a(imageView, this.f52527b.getLocalRequestId(), this.f52527b.getLocalAllowTrackClick());
                com.mbridge.msdk.foundation.same.image.b.a(this.f52526a.getApplicationContext()).a(this.f52527b.getIconUrl(), new j(this.f52649o, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 8.0f)));
            }
            TextView textView = this.f52651q;
            if (textView != null) {
                textView.setText(this.f52527b.getAppName());
            }
            TextView textView2 = this.f52653s;
            if (textView2 != null) {
                b1.a(textView2, this.f52527b.getLocalRequestId(), this.f52527b.getLocalAllowTrackClick());
                this.f52653s.setText(this.f52527b.getAdCall());
            }
            TextView textView3 = this.f52652r;
            if (textView3 != null) {
                textView3.setText(this.f52527b.getAppDesc());
            }
        }
    }

    private void f() {
        View view = this.f52648n;
        if (view == null) {
            init(this.f52526a);
            preLoadData(this.f52654t);
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) this.f52648n.getParent()).removeView(this.f52648n);
        }
        addView(this.f52648n);
        a(this.f52648n);
        d();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    protected void d() {
        super.d();
        this.f52650p.setOnClickListener(new a());
        this.f52649o.setOnClickListener(new b());
        this.f52653s.setOnClickListener(new c());
    }

    protected void g() {
        JSONException e10;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONException e11;
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject2 = new JSONObject();
            } catch (JSONException e12) {
                jSONObject2 = jSONObject3;
                e11 = e12;
            }
            try {
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f48596h, v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f52531f));
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f48597i, v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f52532g));
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f48601m, 0);
                try {
                    this.f52529d = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f48599k, this.f52529d);
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f48600l, v0.d(getContext()));
            } catch (JSONException e14) {
                e11 = e14;
                q0.b("MBridgeVideoEndCoverView", e11.getMessage());
            }
            jSONObject = new JSONObject();
        } catch (JSONException e15) {
            e10 = e15;
            jSONObject = null;
        }
        try {
            jSONObject.put(com.mbridge.msdk.foundation.same.a.f48598j, jSONObject2);
        } catch (JSONException e16) {
            e10 = e16;
            e10.printStackTrace();
        }
        this.notifyListener.a(105, jSONObject);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_videoend_cover");
        if (i0.a(iFindLayout)) {
            View viewInflate = this.f52528c.inflate(iFindLayout, (ViewGroup) null);
            this.f52648n = viewInflate;
            if (viewInflate != null) {
                this.f52530e = a(viewInflate);
                addView(this.f52648n, -1, -1);
                d();
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f52531f = motionEvent.getRawX();
        this.f52532g = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f52529d = configuration.orientation;
        removeView(this.f52648n);
        f();
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.f52654t = bVar;
        try {
            if (this.f52527b == null || !this.f52530e) {
                return;
            }
            e();
        } catch (Throwable th2) {
            q0.a("MBridgeVideoEndCoverView", th2.getMessage());
        }
    }

    public MBridgeVideoEndCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52647m = "MBridgeVideoEndCoverView";
    }
}
