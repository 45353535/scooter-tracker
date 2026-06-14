package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.shake.MBShakeView;
import com.mbridge.msdk.splash.view.nativeview.MBNoRecycledCrashImageView;
import com.mbridge.msdk.splash.view.nativeview.MBSplashClickView;
import com.mbridge.msdk.widget.FeedBackButton;

/* JADX INFO: loaded from: classes10.dex */
public class BaseMBSplashNativeView extends RelativeLayout {
    private int A;
    private int B;
    private int C;
    private float D;
    private float E;
    private boolean F;
    private boolean G;
    protected boolean H;
    protected boolean I;
    protected boolean J;
    protected String K;
    private String L;
    protected MBSplashView M;
    protected CampaignEx N;
    protected MBShakeView O;
    private String P;
    private String Q;
    private String R;
    protected com.mbridge.msdk.shake.b S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MBNoRecycledCrashImageView f50903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MBNoRecycledCrashImageView f50904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f50905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageView f50906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private FeedBackButton f50907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected TextView f50908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RelativeLayout f50909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MBNoRecycledCrashImageView f50910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TextView f50911i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MBNoRecycledCrashImageView f50912j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextView f50913k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TextView f50914l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected RelativeLayout f50915m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected TextView f50916n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected TextView f50917o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected TextView f50918p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected TextView f50919q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected MBSplashClickView f50920r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected int f50921s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f50922t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f50923u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f50924v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected int f50925w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected int f50926x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected int f50927y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected int f50928z;

    class a implements com.mbridge.msdk.foundation.same.image.c {
        a() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap != null) {
                try {
                } catch (Throwable th2) {
                    q0.b("MBSplashNativeView", th2.getMessage());
                }
                if (bitmap.isRecycled()) {
                    return;
                }
                if (bitmap.getWidth() < bitmap.getHeight()) {
                    BaseMBSplashNativeView.this.G = true;
                    BaseMBSplashNativeView.this.f50909g.setVisibility(4);
                    BaseMBSplashNativeView.this.f50904b.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    BaseMBSplashNativeView.this.f50904b.setImageBitmap(bitmap);
                } else if (BaseMBSplashNativeView.this.A == 1) {
                    BaseMBSplashNativeView.this.f50909g.setVisibility(0);
                    try {
                        Bitmap bitmapA = p0.a(bitmap, 1, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 10.0f));
                        if (bitmapA != null && !bitmapA.isRecycled()) {
                            BaseMBSplashNativeView.this.f50912j.setScaleType(ImageView.ScaleType.FIT_XY);
                            BaseMBSplashNativeView.this.f50912j.setImageBitmap(bitmapA);
                        }
                    } catch (Throwable th3) {
                        try {
                            q0.b("MBSplashNativeView", th3.getMessage());
                            BaseMBSplashNativeView.this.f50912j.setImageBitmap(bitmap);
                        } catch (Throwable th4) {
                            q0.b("MBSplashNativeView", th4.getMessage());
                        }
                    }
                    BaseMBSplashNativeView.this.f50911i.setText(BaseMBSplashNativeView.this.N.getAppName());
                    BaseMBSplashNativeView.this.f();
                    try {
                        try {
                            Bitmap bitmapA2 = p0.a(bitmap);
                            if (bitmapA2 != null && !bitmapA2.isRecycled()) {
                                BaseMBSplashNativeView.this.f50904b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                BaseMBSplashNativeView.this.f50904b.setImageBitmap(bitmapA2);
                            }
                        } catch (Throwable unused) {
                            BaseMBSplashNativeView.this.f50904b.setImageBitmap(bitmap);
                        }
                    } catch (Throwable th5) {
                        q0.b("MBSplashNativeView", th5.getMessage());
                    }
                } else {
                    BaseMBSplashNativeView.this.f50909g.setVisibility(4);
                    BaseMBSplashNativeView.this.f50904b.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    BaseMBSplashNativeView.this.f50904b.setImageBitmap(bitmap);
                }
                try {
                    Bitmap bitmapA3 = p0.a(bitmap);
                    if (bitmapA3 == null || bitmapA3.isRecycled()) {
                        return;
                    }
                    BaseMBSplashNativeView.this.f50903a.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    BaseMBSplashNativeView.this.f50903a.setImageBitmap(bitmapA3);
                    return;
                } catch (Throwable unused2) {
                    BaseMBSplashNativeView.this.f50904b.setImageBitmap(bitmap);
                    return;
                }
                q0.b("MBSplashNativeView", th2.getMessage());
            }
        }
    }

    class b implements com.mbridge.msdk.foundation.same.image.c {
        b() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            BaseMBSplashNativeView.this.f50910h.setVisibility(4);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            Bitmap bitmapA;
            if (bitmap != null) {
                try {
                } catch (Throwable th2) {
                    q0.b("MBSplashNativeView", th2.getMessage());
                }
                if (bitmap.isRecycled()) {
                    return;
                }
                try {
                    if (BaseMBSplashNativeView.this.f50910h == null || (bitmapA = p0.a(bitmap, 1, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 40.0f))) == null || bitmapA.isRecycled()) {
                        return;
                    }
                    BaseMBSplashNativeView.this.f50910h.setImageBitmap(bitmapA);
                    return;
                } catch (Throwable th3) {
                    q0.b("MBSplashNativeView", th3.getMessage());
                    BaseMBSplashNativeView.this.f50910h.setImageBitmap(bitmap);
                    return;
                }
                q0.b("MBSplashNativeView", th2.getMessage());
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBSplashNativeView.this.a(1);
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBSplashNativeView.this.a(0);
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            if (baseMBSplashNativeView.H) {
                if (baseMBSplashNativeView.M.getSplashSignalCommunicationImpl() != null && BaseMBSplashNativeView.this.M.getSplashSignalCommunicationImpl().a() != null) {
                    BaseMBSplashNativeView.this.M.getSplashSignalCommunicationImpl().a().close();
                }
                BaseMBSplashNativeView.this.f50908f.setVisibility(4);
                BaseMBSplashNativeView.this.f50908f.setEnabled(false);
            }
        }
    }

    public BaseMBSplashNativeView(Context context) {
        super(context);
        this.I = false;
        this.J = false;
    }

    private void i() {
        if (this.f50924v == 1) {
            this.f50920r.setVisibility(8);
        } else if (this.f50926x == 1) {
            this.f50920r.setVisibility(8);
        } else {
            this.f50920r.initView(this.N.getAdCall());
        }
    }

    private void j() {
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.N.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.N.getBidToken(), eVar, this.N, this.K);
        if (this.f50923u == 1) {
            b1.a(this, cVarA.t(), this.N.getLocalAllowTrackClick());
            setOnClickListener(new d());
        } else {
            b1.a(this.f50920r, cVarA.t(), this.N.getLocalAllowTrackClick());
            this.f50920r.setOnClickListener(new e());
        }
        this.f50908f.setOnClickListener(new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountDownStatus(boolean z10) {
        if (this.M.getSplashSignalCommunicationImpl() == null || this.M.getSplashSignalCommunicationImpl().a() == null) {
            return;
        }
        this.M.getSplashSignalCommunicationImpl().a().a(z10 ? 2 : 1, this.f50922t);
    }

    protected void b() {
    }

    protected void e() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (this.f50926x != 1 || this.O == null || this.S == null) {
                return;
            }
            com.mbridge.msdk.shake.a.a().a(this.S);
        } catch (Throwable th2) {
            q0.b("MBSplashNativeView", th2.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.D = motionEvent.getRawX();
        this.E = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void release() {
        try {
            if (this.S != null) {
                com.mbridge.msdk.shake.a.a().b(this.S);
                this.S = null;
            }
            com.mbridge.msdk.foundation.feedback.b.b().d(this.K);
            detachAllViewsFromParent();
        } catch (Exception e10) {
            q0.b("MBSplashNativeView", e10.getMessage());
        }
    }

    public void setIsPause(boolean z10) {
        this.I = z10;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        try {
            RelativeLayout relativeLayout = this.f50905c;
            if (relativeLayout == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            int i14 = this.C;
            layoutParams.leftMargin = i10 + i14;
            layoutParams.rightMargin = i11 + i14;
            layoutParams.topMargin = i12 + i14;
            layoutParams.bottomMargin = i14 + i13;
        } catch (Throwable th2) {
            q0.b("MBSplashNativeView", th2.getMessage());
        }
    }

    public void updateCountDown(int i10) {
        String str;
        if (this.f50908f != null) {
            this.f50922t = i10;
            if (this.H) {
                str = this.Q + " " + i10 + this.P;
            } else {
                str = i10 + this.P + " " + this.R;
            }
            this.f50908f.setText(str);
        }
    }

    class c implements com.mbridge.msdk.foundation.feedback.a {
        c() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = true;
            baseMBSplashNativeView.setCountDownStatus(false);
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = false;
            baseMBSplashNativeView.setCountDownStatus(true);
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = false;
            baseMBSplashNativeView.setCountDownStatus(true);
        }
    }

    class g implements com.mbridge.msdk.foundation.feedback.a {
        g() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = true;
            baseMBSplashNativeView.setCountDownStatus(false);
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = false;
            baseMBSplashNativeView.setCountDownStatus(true);
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = false;
            baseMBSplashNativeView.setCountDownStatus(true);
        }
    }

    private void c() {
        try {
            this.F = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable th2) {
            q0.b("MBSplashNativeView", th2.getMessage());
        }
        a();
        g();
        h();
        e();
        i();
        j();
        b();
        updateCountDown(this.f50921s);
    }

    private void d() {
        try {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.A == 1 ? i0.a(getContext().getApplicationContext(), "mbridge_splash_portrait", "layout") : i0.a(getContext().getApplicationContext(), "mbridge_splash_landscape", "layout"), (ViewGroup) null);
            addView(viewInflate);
            this.f50903a = (MBNoRecycledCrashImageView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_iv_image_bg", "id"));
            this.f50904b = (MBNoRecycledCrashImageView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_iv_image", "id"));
            this.f50905c = (RelativeLayout) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_topcontroller", "id"));
            this.f50906d = (ImageView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_iv_link", "id"));
            this.f50907e = (FeedBackButton) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_feedback", "id"));
            this.f50908f = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_skip", "id"));
            this.f50909g = (RelativeLayout) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_landscape_foreground", "id"));
            this.f50910h = (MBNoRecycledCrashImageView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_iv_icon", "id"));
            this.f50911i = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_title", "id"));
            this.f50912j = (MBNoRecycledCrashImageView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_iv_foregroundimage", "id"));
            this.f50913k = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_adrect", "id"));
            this.f50915m = (RelativeLayout) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_layout_appinfo", "id"));
            this.f50916n = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_appinfo", "id"));
            this.f50917o = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_privacy", "id"));
            this.f50918p = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_permission", "id"));
            this.f50919q = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_app_desc", "id"));
            this.f50920r = (MBSplashClickView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_click", "id"));
            this.f50914l = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_adcircle", "id"));
            int iA = i0.a(getContext().getApplicationContext(), "mbridge_splash_count_time_can_skip", TypedValues.Custom.S_STRING);
            int iA2 = i0.a(getContext().getApplicationContext(), "mbridge_splash_count_time_can_skip_not", TypedValues.Custom.S_STRING);
            int iA3 = i0.a(getContext().getApplicationContext(), "mbridge_splash_count_time_can_skip_s", TypedValues.Custom.S_STRING);
            this.Q = getContext().getResources().getString(iA);
            this.R = getContext().getResources().getString(iA2);
            this.P = getContext().getResources().getString(iA3);
            this.C = v0.a(getContext(), 9.0f);
        } catch (Throwable th2) {
            q0.b("MBSplashNativeView", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (TextUtils.isEmpty(this.N.getIconUrl())) {
            this.f50910h.setVisibility(4);
        } else {
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.N.getIconUrl(), new b());
        }
    }

    private void g() {
        if (TextUtils.isEmpty(this.N.getImageUrl())) {
            this.f50904b.setVisibility(4);
        } else {
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.N.getImageUrl(), new a());
        }
    }

    private void h() {
        Drawable drawable;
        v0.a(3, this.f50906d, this.N, getContext(), true, new c());
        try {
            drawable = getResources().getDrawable(i0.a(getContext().getApplicationContext(), "mbridge_splash_m_circle", "drawable"));
        } catch (Throwable th2) {
            th = th2;
            drawable = null;
        }
        try {
            drawable.setBounds(0, 0, v0.a(getContext(), 10.0f), v0.a(getContext(), 10.0f));
        } catch (Throwable th3) {
            th = th3;
            q0.b("MBSplashNativeView", th.getMessage());
        }
        if (this.A == 1 && this.G) {
            if (this.B != 0 && drawable != null) {
                this.f50914l.setCompoundDrawables(drawable, null, null, null);
            }
            this.f50914l.setText(this.F ? "广告" : "AD");
            this.f50913k.setVisibility(4);
            return;
        }
        if (this.B != 0 && drawable != null) {
            this.f50913k.setCompoundDrawables(drawable, null, null, null);
        }
        this.f50913k.setText(this.F ? "广告" : "AD");
        this.f50914l.setVisibility(4);
    }

    protected void a(int i10) {
        if (this.M.getSplashSignalCommunicationImpl() == null || this.M.getSplashSignalCommunicationImpl().a() == null) {
            return;
        }
        try {
            this.M.getSplashSignalCommunicationImpl().a().a(com.mbridge.msdk.splash.common.util.a.a(com.mbridge.msdk.splash.common.util.a.a(i10, this.D, this.E), this.N));
        } catch (Throwable th2) {
            q0.b("MBSplashNativeView", th2.getMessage());
            this.M.getSplashSignalCommunicationImpl().a().a(this.N);
        }
    }

    public BaseMBSplashNativeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseMBSplashNativeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.I = false;
        this.J = false;
    }

    public BaseMBSplashNativeView(Context context, MBSplashView mBSplashView, com.mbridge.msdk.splash.common.c cVar) {
        super(context);
        this.I = false;
        this.J = false;
        if (cVar != null) {
            this.K = cVar.l();
            this.L = cVar.h();
            this.N = cVar.b();
            this.M = mBSplashView;
            this.f50921s = cVar.d();
            this.f50924v = cVar.c();
            this.f50923u = cVar.f();
            this.f50925w = cVar.a();
            this.f50926x = cVar.i();
            this.f50927y = cVar.j();
            this.f50928z = cVar.k();
            this.A = cVar.g();
            this.H = cVar.m();
            this.B = cVar.e();
            d();
            c();
            return;
        }
        throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
    }

    private void a() {
        CampaignEx campaignEx = this.N;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.K);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, 3);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, this.N);
        }
        if (com.mbridge.msdk.foundation.feedback.b.b().a()) {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, new g());
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, this.f50907e);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, 3);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, this.N);
            return;
        }
        FeedBackButton feedBackButton = this.f50907e;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(8);
        }
    }
}
