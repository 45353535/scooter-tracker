package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.click.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a0;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public class BaseSplashPopView extends RelativeLayout {
    public static final int TYPE_POP_DEFAULT = 1;
    public static final int TYPE_POP_LARGE = 4;
    public static final int TYPE_POP_MEDIUM = 3;
    public static final int TYPE_POP_SMALL = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final AtomicInteger f50936v = new AtomicInteger(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f50937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f50938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f50939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CampaignEx f50940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.splash.middle.d f50941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ImageView f50942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f50943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f50944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageView f50945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f50946j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextView f50947k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TextView f50948l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f50949m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected Handler f50950n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f50951o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f50952p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private j f50953q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Runnable f50954r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Runnable f50955s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    View.OnClickListener f50956t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    View.OnClickListener f50957u;

    class a implements j {
        a() {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, BaseSplashPopView.this);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, BaseSplashPopView.this);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            int iA;
            int iA2;
            if (BaseSplashPopView.this.f50939c == 1) {
                int iMin = Math.min(BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight());
                int iA3 = (v0.a(BaseSplashPopView.this.getContext(), 60.0f) - Math.min(Math.max(iMin / 4, 70), iMin)) / 2;
                iA = v0.a(BaseSplashPopView.this.getContext(), 23.0f) + iA3;
                iA2 = v0.a(BaseSplashPopView.this.getContext(), 10.0f) + iA3;
            } else {
                iA = 0;
                iA2 = 0;
            }
            u0.a(campaign, BaseSplashPopView.this, iA, iA2);
        }
    }

    class b implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f50959a;

        b(boolean z10) {
            this.f50959a = z10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                Bitmap bitmapB = this.f50959a ? p0.b(bitmap) : p0.a(bitmap, 1, 16);
                ImageView imageView = BaseSplashPopView.this.f50942f;
                if (bitmapB != null) {
                    bitmap = bitmapB;
                }
                imageView.setImageBitmap(bitmap);
            } catch (Throwable th2) {
                q0.b("MBSplashPopView", th2.getMessage());
            }
        }
    }

    class c implements com.mbridge.msdk.foundation.same.image.c {
        c() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                BaseSplashPopView.this.f50944h.setImageBitmap(a0.a(bitmap, 10));
            } catch (Throwable th2) {
                q0.b("MBSplashPopView", th2.getMessage());
            }
        }
    }

    class d implements com.mbridge.msdk.foundation.same.image.c {
        d() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                BaseSplashPopView.this.f50943g.setImageBitmap(p0.a(bitmap, 1, 16));
            } catch (Throwable th2) {
                q0.b("MBSplashPopView", th2.getMessage());
            }
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (BaseSplashPopView.this.f50948l != null) {
                if (BaseSplashPopView.this.f50949m != 0) {
                    BaseSplashPopView.g(BaseSplashPopView.this);
                    BaseSplashPopView.this.f50948l.setText(String.valueOf(BaseSplashPopView.this.f50949m));
                    BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                    baseSplashPopView.f50950n.postDelayed(baseSplashPopView.f50954r, 1000L);
                    return;
                }
                BaseSplashPopView.this.f50949m = -1;
                BaseSplashPopView.this.g();
                BaseSplashPopView baseSplashPopView2 = BaseSplashPopView.this;
                baseSplashPopView2.f50950n.removeCallbacks(baseSplashPopView2.f50954r);
                BaseSplashPopView baseSplashPopView3 = BaseSplashPopView.this;
                com.mbridge.msdk.splash.middle.d dVar = baseSplashPopView3.f50941e;
                if (dVar != null) {
                    dVar.a(new MBridgeIds(baseSplashPopView3.f50937a, baseSplashPopView3.f50938b), 5);
                }
            }
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
            com.mbridge.msdk.splash.middle.d dVar = baseSplashPopView.f50941e;
            if (dVar != null) {
                dVar.a(new MBridgeIds(baseSplashPopView.f50937a, baseSplashPopView.f50938b), BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight(), BaseSplashPopView.this.f50939c);
            }
        }
    }

    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
            if (baseSplashPopView.f50941e != null) {
                baseSplashPopView.b(baseSplashPopView.f50940d);
            }
        }
    }

    class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseSplashPopView baseSplashPopView;
            com.mbridge.msdk.splash.middle.d dVar;
            if (BaseSplashPopView.this.f50949m <= 0 && (dVar = (baseSplashPopView = BaseSplashPopView.this).f50941e) != null) {
                dVar.a(new MBridgeIds(baseSplashPopView.f50937a, baseSplashPopView.f50938b), 4);
            }
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f50967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f50968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f50969c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CampaignEx f50970d;

        public i(String str, String str2, int i10, CampaignEx campaignEx) {
            this.f50967a = str;
            this.f50968b = str2;
            this.f50969c = i10;
            this.f50970d = campaignEx;
        }

        public CampaignEx a() {
            return this.f50970d;
        }

        public String b() {
            return this.f50967a;
        }

        public String c() {
            return this.f50968b;
        }

        public int d() {
            return this.f50969c;
        }
    }

    public BaseSplashPopView(Context context, i iVar, com.mbridge.msdk.splash.middle.d dVar) {
        super(context);
        this.f50939c = 1;
        this.f50949m = -1;
        this.f50950n = new Handler();
        this.f50951o = false;
        this.f50953q = new a();
        this.f50954r = new e();
        this.f50955s = new f();
        this.f50956t = new g();
        this.f50957u = new h();
        if (iVar == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f50938b = iVar.c();
        this.f50937a = iVar.b();
        this.f50939c = iVar.d();
        this.f50940d = iVar.a();
        this.f50941e = dVar;
        a();
    }

    static /* synthetic */ int g(BaseSplashPopView baseSplashPopView) {
        int i10 = baseSplashPopView.f50949m;
        baseSplashPopView.f50949m = i10 - 1;
        return i10;
    }

    public static int generateViewId() {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        do {
            atomicInteger = f50936v;
            i10 = atomicInteger.get();
            i11 = i10 + 1;
            if (i11 > 16777215) {
                i11 = 1;
            }
        } while (!atomicInteger.compareAndSet(i10, i11));
        return i10;
    }

    private void setBackgroundImage(String str) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str, new c());
    }

    private void setForegroundImage(String str) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str, new d());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f50941e != null) {
            postDelayed(this.f50955s, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    public void pauseCountDown() {
        this.f50951o = true;
        if (this.f50948l != null) {
            this.f50950n.removeCallbacks(this.f50954r);
        }
    }

    public void reStartCountDown() {
        if (this.f50951o) {
            this.f50951o = false;
            int i10 = this.f50949m;
            if (i10 == -1 || i10 == 0) {
                g();
                return;
            }
            TextView textView = this.f50948l;
            if (textView != null) {
                textView.setText(String.valueOf(i10));
                this.f50950n.postDelayed(this.f50954r, 1000L);
            }
        }
    }

    public void release() {
        try {
            this.f50950n.removeCallbacks(this.f50955s);
            this.f50950n.removeCallbacks(this.f50954r);
            this.f50954r = null;
            detachAllViewsFromParent();
            this.f50940d = null;
            this.f50941e = null;
        } catch (Exception e10) {
            q0.b("MBSplashPopView", e10.getMessage());
        }
    }

    public void setPopViewType(i iVar, com.mbridge.msdk.splash.middle.d dVar) {
        if (iVar == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f50938b = iVar.c();
        this.f50937a = iVar.b();
        this.f50939c = iVar.d();
        this.f50940d = iVar.a();
        this.f50941e = dVar;
        a();
    }

    public void startCountDown() {
        this.f50950n.removeCallbacks(this.f50954r);
        CampaignEx campaignEx = this.f50940d;
        if (campaignEx == null || this.f50939c != 1) {
            return;
        }
        int flbSkipTime = campaignEx.getFlbSkipTime();
        if (flbSkipTime <= 0) {
            g();
            return;
        }
        this.f50949m = flbSkipTime;
        TextView textView = this.f50948l;
        if (textView != null) {
            textView.setText(String.valueOf(flbSkipTime));
            this.f50950n.postDelayed(this.f50954r, 1000L);
        }
    }

    private void b() {
        String language;
        this.f50945i = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 32.0f), v0.a(getContext(), 13.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(8, this.f50942f.getId());
        this.f50945i.setLayoutParams(layoutParams);
        try {
            language = getResources().getConfiguration().locale.getLanguage();
        } catch (Throwable th2) {
            q0.b("MBSplashPopView", th2.getMessage());
            language = "ZH";
        }
        this.f50945i.setBackgroundResource((language.toUpperCase().equals("CN") || language.toUpperCase().equals("ZH")) ? getResources().getIdentifier("mbridge_splash_pop_ad", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()) : getResources().getIdentifier("mbridge_splash_pop_ad_en", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(this.f50945i);
    }

    private void c() {
        View imageView = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 80.0f), v0.a(getContext(), 80.0f));
        layoutParams.addRule(9);
        layoutParams.topMargin = v0.a(getContext(), 16.0f);
        imageView.setId(generateViewId());
        imageView.setLayoutParams(layoutParams);
        imageView.setBackgroundResource(getResources().getIdentifier("mbridge_splash_popview_default", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        this.f50942f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(v0.a(getContext(), 60.0f), v0.a(getContext(), 60.0f));
        layoutParams2.addRule(6, imageView.getId());
        layoutParams2.topMargin = v0.a(getContext(), 7.0f);
        layoutParams2.leftMargin = v0.a(getContext(), 10.0f);
        this.f50942f.setId(generateViewId());
        this.f50942f.setLayoutParams(layoutParams2);
        this.f50942f.setScaleType(ImageView.ScaleType.FIT_CENTER);
        CampaignEx campaignEx = this.f50940d;
        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getIconUrl())) {
            a(this.f50940d.getIconUrl(), true);
        }
        this.f50948l = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, imageView.getId());
        layoutParams3.addRule(8, imageView.getId());
        layoutParams3.leftMargin = v0.a(getContext(), 62.0f);
        layoutParams3.bottomMargin = v0.a(getContext(), 70.0f);
        this.f50948l.setId(generateViewId());
        this.f50948l.setTextSize(10.0f);
        this.f50948l.setTextColor(-1);
        this.f50948l.setGravity(17);
        this.f50948l.setMinWidth(v0.a(getContext(), 16.0f));
        this.f50948l.setMaxHeight(v0.a(getContext(), 16.0f));
        this.f50948l.setLayoutParams(layoutParams3);
        this.f50948l.setBackgroundResource(getResources().getIdentifier("mbridge_cm_circle_50black", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(imageView);
        addView(this.f50948l);
        addView(this.f50942f);
        CampaignEx campaignEx2 = this.f50940d;
        if (campaignEx2 != null && campaignEx2.getFlbSkipTime() <= 0) {
            g();
        }
        CampaignEx campaignEx3 = this.f50940d;
        if (campaignEx3 != null) {
            b1.a(this, campaignEx3.getLocalRequestId(), this.f50940d.getLocalAllowTrackClick());
        }
        setOnClickListener(this.f50956t);
        this.f50948l.setOnClickListener(this.f50957u);
    }

    private void d() {
        this.f50944h = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, v0.a(getContext(), 131.0f));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        this.f50944h.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f50944h.setId(generateViewId());
        this.f50944h.setLayoutParams(layoutParams);
        setBackgroundImage(this.f50940d.getImageUrl());
        this.f50943g = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, v0.a(getContext(), 131.0f));
        layoutParams2.addRule(10);
        layoutParams2.addRule(14);
        this.f50943g.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f50943g.setId(generateViewId());
        this.f50943g.setLayoutParams(layoutParams2);
        setForegroundImage(this.f50940d.getImageUrl());
        this.f50942f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(v0.a(getContext(), 50.0f), v0.a(getContext(), 50.0f));
        layoutParams3.addRule(9);
        layoutParams3.addRule(3, this.f50944h.getId());
        layoutParams3.topMargin = 20;
        this.f50942f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f50942f.setId(generateViewId());
        this.f50942f.setLayoutParams(layoutParams3);
        a(this.f50940d.getIconUrl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(1, this.f50942f.getId());
        layoutParams4.addRule(6, this.f50942f.getId());
        layoutParams4.addRule(8, this.f50942f.getId());
        layoutParams4.leftMargin = v0.a(getContext(), 8.0f);
        layoutParams4.rightMargin = v0.a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams4);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f50946j = textView;
        textView.setId(generateViewId());
        this.f50946j.setGravity(16);
        this.f50946j.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f50946j.setTextSize(12.0f);
        this.f50946j.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        TextView textView2 = this.f50946j;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
        textView2.setEllipsize(truncateAt);
        this.f50946j.setMarqueeRepeatLimit(-1);
        this.f50946j.setSelected(true);
        this.f50946j.setSingleLine(true);
        this.f50946j.setText(this.f50940d.getAppName());
        TextView textView3 = new TextView(getContext());
        this.f50947k = textView3;
        textView3.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(5, this.f50946j.getId());
        layoutParams5.addRule(3, this.f50946j.getId());
        layoutParams5.topMargin = v0.a(getContext(), 4.0f);
        layoutParams5.rightMargin = v0.a(getContext(), 36.0f);
        this.f50947k.setGravity(16);
        this.f50947k.setLayoutParams(layoutParams5);
        this.f50947k.setTextSize(8.0f);
        this.f50947k.setTextColor(-10066330);
        this.f50947k.setEllipsize(truncateAt);
        this.f50947k.setMarqueeRepeatLimit(-1);
        this.f50947k.setSelected(true);
        this.f50947k.setSingleLine(true);
        this.f50947k.setText(this.f50940d.getAppDesc());
        relativeLayout.addView(this.f50946j);
        relativeLayout.addView(this.f50947k);
        addView(this.f50944h);
        addView(this.f50943g);
        addView(this.f50942f);
        addView(relativeLayout);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.f50940d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        b1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.f50940d.getBidToken(), eVar, this.f50940d, this.f50938b).t(), this.f50940d.getLocalAllowTrackClick());
        setOnClickListener(this.f50956t);
    }

    private void e() {
        int iA = v0.a(getContext(), 4.0f);
        this.f50942f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 50.0f), v0.a(getContext(), 50.0f));
        layoutParams.addRule(9);
        this.f50942f.setId(generateViewId());
        this.f50942f.setLayoutParams(layoutParams);
        this.f50942f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f50942f.setPadding(iA, iA, iA, iA);
        a(this.f50940d.getIconUrl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(1, this.f50942f.getId());
        layoutParams2.addRule(6, this.f50942f.getId());
        layoutParams2.addRule(8, this.f50942f.getId());
        layoutParams2.leftMargin = v0.a(getContext(), 8.0f);
        layoutParams2.rightMargin = v0.a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams2);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f50946j = textView;
        textView.setId(generateViewId());
        this.f50946j.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f50946j.setGravity(16);
        this.f50946j.setTextSize(12.0f);
        this.f50946j.setSelected(true);
        TextView textView2 = this.f50946j;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
        textView2.setEllipsize(truncateAt);
        this.f50946j.setMarqueeRepeatLimit(-1);
        this.f50946j.setSingleLine(true);
        this.f50946j.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f50946j.setText(this.f50940d.getAppName());
        TextView textView3 = new TextView(getContext());
        this.f50947k = textView3;
        textView3.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, this.f50946j.getId());
        layoutParams3.addRule(3, this.f50946j.getId());
        layoutParams3.topMargin = v0.a(getContext(), 4.0f);
        layoutParams3.rightMargin = v0.a(getContext(), 36.0f);
        this.f50947k.setGravity(16);
        this.f50947k.setLayoutParams(layoutParams3);
        this.f50947k.setTextSize(8.0f);
        this.f50947k.setTextColor(-10066330);
        this.f50947k.setEllipsize(truncateAt);
        this.f50947k.setMarqueeRepeatLimit(-1);
        this.f50947k.setSelected(true);
        this.f50947k.setSingleLine(true);
        this.f50947k.setText(this.f50940d.getAppDesc());
        relativeLayout.addView(this.f50946j);
        relativeLayout.addView(this.f50947k);
        setBackgroundResource(getResources().getIdentifier("mbridge_shape_corners_bg", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(this.f50942f);
        addView(relativeLayout);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.f50940d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        b1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.f50940d.getBidToken(), eVar, this.f50940d, this.f50938b).t(), this.f50940d.getLocalAllowTrackClick());
        setOnClickListener(this.f50956t);
    }

    private void f() {
        int iA = v0.a(getContext(), 4.0f);
        this.f50942f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 28.0f), v0.a(getContext(), 28.0f));
        layoutParams.addRule(9);
        this.f50942f.setId(generateViewId());
        this.f50942f.setLayoutParams(layoutParams);
        this.f50942f.setPadding(iA, iA, iA, iA);
        this.f50942f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        a(this.f50940d.getIconUrl(), false);
        TextView textView = new TextView(getContext());
        this.f50946j = textView;
        textView.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, this.f50942f.getId());
        layoutParams2.addRule(6, this.f50942f.getId());
        layoutParams2.addRule(8, this.f50942f.getId());
        layoutParams2.leftMargin = v0.a(getContext(), 4.0f);
        layoutParams2.rightMargin = v0.a(getContext(), 40.0f);
        this.f50946j.setLayoutParams(layoutParams2);
        this.f50946j.setGravity(16);
        this.f50946j.setTextSize(10.0f);
        this.f50946j.setSelected(true);
        this.f50946j.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f50946j.setMarqueeRepeatLimit(-1);
        this.f50946j.setSingleLine(true);
        this.f50946j.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f50946j.setText(this.f50940d.getAppName());
        setBackgroundResource(getResources().getIdentifier("mbridge_shape_corners_bg", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(this.f50942f);
        addView(this.f50946j);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.f50940d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        b1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.f50940d.getBidToken(), eVar, this.f50940d, this.f50938b).t(), this.f50940d.getLocalAllowTrackClick());
        setOnClickListener(this.f50956t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        TextView textView = this.f50948l;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = v0.a(getContext(), 16.0f);
            layoutParams.height = v0.a(getContext(), 16.0f);
            this.f50948l.setLayoutParams(layoutParams);
            this.f50948l.setText("");
            this.f50948l.setSelected(true);
            this.f50948l.setBackgroundResource(getResources().getIdentifier("mbridge_splash_popview_close", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        }
    }

    private void a() {
        if (this.f50940d == null) {
            return;
        }
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int i10 = this.f50939c;
        if (i10 == 1) {
            c();
            return;
        }
        if (i10 == 2) {
            f();
        } else if (i10 == 3) {
            e();
        } else {
            if (i10 != 4) {
                return;
            }
            d();
        }
    }

    private void a(String str, boolean z10) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str, new b(z10));
    }

    protected void a(CampaignEx campaignEx) {
        if (this.f50952p == null) {
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f50938b);
            this.f50952p = aVar;
            aVar.a(this.f50953q);
        }
        campaignEx.setCampaignUnitId(this.f50938b);
        this.f50952p.a(campaignEx);
        if (!campaignEx.isReportClick()) {
            campaignEx.setReportClick(true);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
        }
        com.mbridge.msdk.splash.middle.d dVar = this.f50941e;
        if (dVar != null) {
            dVar.a(new MBridgeIds(this.f50937a, this.f50938b));
            this.f50941e.a(new MBridgeIds(this.f50937a, this.f50938b), 6);
        }
    }

    protected void b(CampaignEx campaignEx) {
        com.mbridge.msdk.splash.report.a.a(campaignEx, this.f50938b);
    }

    public BaseSplashPopView(Context context) {
        super(context);
        this.f50939c = 1;
        this.f50949m = -1;
        this.f50950n = new Handler();
        this.f50951o = false;
        this.f50953q = new a();
        this.f50954r = new e();
        this.f50955s = new f();
        this.f50956t = new g();
        this.f50957u = new h();
        this.f50939c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50939c = 1;
        this.f50949m = -1;
        this.f50950n = new Handler();
        this.f50951o = false;
        this.f50953q = new a();
        this.f50954r = new e();
        this.f50955s = new f();
        this.f50956t = new g();
        this.f50957u = new h();
        this.f50939c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f50939c = 1;
        this.f50949m = -1;
        this.f50950n = new Handler();
        this.f50951o = false;
        this.f50953q = new a();
        this.f50954r = new e();
        this.f50955s = new f();
        this.f50956t = new g();
        this.f50957u = new h();
        this.f50939c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    @RequiresApi(api = 21)
    public BaseSplashPopView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f50939c = 1;
        this.f50949m = -1;
        this.f50950n = new Handler();
        this.f50951o = false;
        this.f50953q = new a();
        this.f50954r = new e();
        this.f50955s = new f();
        this.f50956t = new g();
        this.f50957u = new h();
        this.f50939c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }
}
