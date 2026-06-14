package com.taurusx.tax.ui;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.iab.omid.library.taurusx.adsession.AdEvents;
import com.iab.omid.library.taurusx.adsession.AdSession;
import com.iab.omid.library.taurusx.adsession.CreativeType;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.R;
import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.g.e;
import com.taurusx.tax.g.f0;
import com.taurusx.tax.g.h0;
import com.taurusx.tax.g.j;
import com.taurusx.tax.g.j0;
import com.taurusx.tax.g.l;
import com.taurusx.tax.g.m;
import com.taurusx.tax.g.p;
import com.taurusx.tax.g.t;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.w.a.n;
import com.taurusx.tax.w.c.y;
import com.taurusx.tax.w.s.c;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AppOpenNativeAdActivity extends Activity implements View.OnClickListener {
    public static final String T = "AppOpenNativeAdActivity";
    public static final int U = 0;
    public static final int V = 1;
    public static final float W = 30.0f;
    public boolean A;
    public boolean B;
    public int C;
    public float D;
    public float E;
    public boolean I;
    public boolean J;
    public boolean K;
    public AdSession L;
    public AdEvents M;
    public int Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinearLayout f66663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f66664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f66665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f66666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.taurusx.tax.w.s.s f66667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinearLayout f66668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f66669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f66670h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f66671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f66672j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f66673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.taurusx.tax.w.a.c f66674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f66675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f66676n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f66677o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f66678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f66679q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Bitmap f66680r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f66681s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f66682t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public com.taurusx.tax.w.c.y f66683u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public y.z f66684v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ImageView f66685w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f66686x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ImageView f66687y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public RelativeLayout f66688z;
    public boolean F = true;
    public com.taurusx.tax.w.s.z G = new com.taurusx.tax.w.s.z();
    public com.taurusx.tax.w.s.a H = new com.taurusx.tax.w.s.a();
    public long N = 0;
    public com.taurusx.tax.w.w O = com.taurusx.tax.w.w.SUCCESS;
    public View.OnLayoutChangeListener P = new y();
    public Handler R = new a(this);
    public View.OnTouchListener S = new s();

    public static class a extends Handler {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public WeakReference<AppOpenNativeAdActivity> f66689z;

        public a(AppOpenNativeAdActivity appOpenNativeAdActivity) {
            this.f66689z = new WeakReference<>(appOpenNativeAdActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            AppOpenNativeAdActivity appOpenNativeAdActivity = this.f66689z.get();
            if (appOpenNativeAdActivity == null) {
                return;
            }
            int i10 = message.what;
            if (i10 != 0) {
                if (i10 != 1) {
                    return;
                }
                if (appOpenNativeAdActivity.f66679q) {
                    appOpenNativeAdActivity.f66663a.setVisibility(0);
                    appOpenNativeAdActivity.f66676n.setVisibility(0);
                    return;
                } else {
                    appOpenNativeAdActivity.f66682t.setVisibility(0);
                    appOpenNativeAdActivity.f66669g.setVisibility(0);
                    return;
                }
            }
            if (appOpenNativeAdActivity.Q <= 0) {
                appOpenNativeAdActivity.f66671i.setText("0s");
                if (appOpenNativeAdActivity.f66672j) {
                    appOpenNativeAdActivity.z(true);
                    return;
                }
                return;
            }
            if (!appOpenNativeAdActivity.A) {
                AppOpenNativeAdActivity.b(appOpenNativeAdActivity);
                appOpenNativeAdActivity.f66671i.setText(appOpenNativeAdActivity.Q + "s");
            }
            sendEmptyMessageDelayed(0, 1000L);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AppOpenNativeAdActivity.this.F) {
                if (AppOpenNativeAdActivity.this.A) {
                    AppOpenNativeAdActivity.this.z();
                    return;
                }
                AppOpenNativeAdActivity.g(AppOpenNativeAdActivity.this);
                LogUtil.v(AppOpenNativeAdActivity.T, "valid number  = " + j0.y(AppOpenNativeAdActivity.this.f66683u));
                if (AppOpenNativeAdActivity.this.C >= j0.y(AppOpenNativeAdActivity.this.f66683u)) {
                    AppOpenNativeAdActivity.this.o();
                } else {
                    AppOpenNativeAdActivity.this.z();
                }
            }
        }
    }

    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.taurusx.tax.s.z.z(AppOpenNativeAdActivity.this.M, AppOpenNativeAdActivity.this.f66667e);
        }
    }

    public class s implements View.OnTouchListener {
        public s() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                AppOpenNativeAdActivity.this.H.f67468z = System.currentTimeMillis();
                AppOpenNativeAdActivity.this.G.w(String.valueOf((int) motionEvent.getX()));
                AppOpenNativeAdActivity.this.G.y(String.valueOf((int) motionEvent.getY()));
            } else if (motionEvent.getAction() == 1) {
                AppOpenNativeAdActivity.this.H.f67466w = System.currentTimeMillis();
                AppOpenNativeAdActivity.this.H.f67467y = motionEvent.getDownTime();
                AppOpenNativeAdActivity.this.H.f67463c = motionEvent.getEventTime();
                AppOpenNativeAdActivity.this.H.z(motionEvent);
                AppOpenNativeAdActivity.this.G.o(String.valueOf((int) motionEvent.getX()));
                AppOpenNativeAdActivity.this.G.s(String.valueOf((int) motionEvent.getY()));
                AppOpenNativeAdActivity.this.G.c(String.valueOf(view.getHeight()));
                AppOpenNativeAdActivity.this.G.a(String.valueOf(view.getWidth()));
                AppOpenNativeAdActivity.this.G.z(String.valueOf(System.currentTimeMillis()));
                LogUtil.d("CoordinateInfo", "the coordinate info " + AppOpenNativeAdActivity.this.G.toString());
                if (j0.z(AppOpenNativeAdActivity.this.f66683u, AppOpenNativeAdActivity.this.G)) {
                    AppOpenNativeAdActivity appOpenNativeAdActivity = AppOpenNativeAdActivity.this;
                    appOpenNativeAdActivity.z(appOpenNativeAdActivity.G, AppOpenNativeAdActivity.this.H, AppOpenNativeAdActivity.this.f66686x);
                }
            }
            return true;
        }
    }

    public class w implements View.OnClickListener {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f66694z;

        public class z implements DialogInterface.OnDismissListener {
            public z() {
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                AppOpenNativeAdActivity appOpenNativeAdActivity = AppOpenNativeAdActivity.this;
                appOpenNativeAdActivity.z((Activity) appOpenNativeAdActivity);
            }
        }

        public w(String str) {
            this.f66694z = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.taurusx.tax.t.y.z zVarZ = new com.taurusx.tax.t.y.z(AppOpenNativeAdActivity.this).z(this.f66694z).z(AppOpenNativeAdActivity.this.f66667e);
            zVarZ.setOnDismissListener(new z());
            zVarZ.w();
        }
    }

    public class y implements View.OnLayoutChangeListener {
        public y() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (i10 == i14 && i11 == i15 && i12 == i16 && i13 == i17) {
                return;
            }
            AppOpenNativeAdActivity appOpenNativeAdActivity = AppOpenNativeAdActivity.this;
            appOpenNativeAdActivity.f66664b = appOpenNativeAdActivity.f66664b > 0.0f ? AppOpenNativeAdActivity.this.f66664b : 1.0f;
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(AppOpenNativeAdActivity.this.f66664b));
            int iDoubleValue = (int) new BigDecimal(String.valueOf(AppOpenNativeAdActivity.this.f66663a.getWidth())).multiply(bigDecimal).doubleValue();
            int iDoubleValue2 = (int) new BigDecimal(String.valueOf(AppOpenNativeAdActivity.this.f66663a.getHeight())).multiply(bigDecimal).doubleValue();
            ViewGroup.LayoutParams layoutParams = AppOpenNativeAdActivity.this.f66676n.getLayoutParams();
            layoutParams.width = iDoubleValue;
            layoutParams.height = iDoubleValue2;
            AppOpenNativeAdActivity.this.f66676n.setLayoutParams(layoutParams);
        }
    }

    public class z implements Runnable {
        public z() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AppOpenNativeAdActivity.this.L = com.taurusx.tax.s.z.z(TaurusXAds.getContext(), (String) null, CreativeType.NATIVE_DISPLAY, AppOpenNativeAdActivity.this.f66684v, AppOpenNativeAdActivity.this.f66667e);
                if (AppOpenNativeAdActivity.this.L != null) {
                    AppOpenNativeAdActivity appOpenNativeAdActivity = AppOpenNativeAdActivity.this;
                    appOpenNativeAdActivity.M = com.taurusx.tax.s.z.z(appOpenNativeAdActivity.L, AppOpenNativeAdActivity.this.f66667e);
                    com.taurusx.tax.s.z.z(AppOpenNativeAdActivity.this.L, (ViewGroup) AppOpenNativeAdActivity.this.f66688z, AppOpenNativeAdActivity.this.f66667e);
                    com.taurusx.tax.s.z.o(AppOpenNativeAdActivity.this.L, AppOpenNativeAdActivity.this.f66667e);
                    com.taurusx.tax.s.z.w(AppOpenNativeAdActivity.this.M, AppOpenNativeAdActivity.this.f66667e);
                }
            } catch (Throwable th2) {
                Log.d(AppOpenNativeAdActivity.T, "createSession failed", th2);
                if (AppOpenNativeAdActivity.this.f66667e != null) {
                    AppOpenNativeAdActivity.this.f66667e.w(th2.getMessage(), false);
                }
            }
        }
    }

    public static /* synthetic */ int b(AppOpenNativeAdActivity appOpenNativeAdActivity) {
        int i10 = appOpenNativeAdActivity.Q;
        appOpenNativeAdActivity.Q = i10 - 1;
        return i10;
    }

    public static /* synthetic */ int g(AppOpenNativeAdActivity appOpenNativeAdActivity) {
        int i10 = appOpenNativeAdActivity.C;
        appOpenNativeAdActivity.C = i10 + 1;
        return i10;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.D = motionEvent.getX();
        this.E = motionEvent.getY();
        LogUtil.v("taurusx", "dispatchTouchEvent at x = " + motionEvent.getX() + " and y = " + motionEvent.getY());
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.layout_ad) {
            y(view.getContext(), com.taurusx.tax.w.o.w.y());
        } else if (id2 == R.id.skip_click) {
            w(false);
        } else if (id2 == R.id.tax_imageview_close_click) {
            z(false);
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.taurusx_activity_appopen_native);
        z((Activity) this);
        this.N = System.currentTimeMillis();
        if (TaurusXAds.isInitialized()) {
            a();
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        com.taurusx.tax.w.s.s sVar;
        LogUtil.i("taurusx", "onDestroy hasCallClose: " + this.B);
        if (!this.B && this.f66674l != null && (sVar = this.f66667e) != null) {
            sVar.z((JSONArray) null, false);
            this.f66674l.onAdClosed();
            this.B = true;
        }
        this.F = false;
        n.y.z().w(this.f66673k);
        Handler handler = this.R;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        LinearLayout linearLayout = this.f66663a;
        if (linearLayout != null) {
            linearLayout.removeOnLayoutChangeListener(this.P);
        }
        y();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (4 == i10) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        this.A = true;
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        this.A = false;
        z((Activity) this);
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        LogUtil.i("taurusx", "onStop hasCallClose: " + this.B + ",isFinishing: " + isFinishing());
        if (this.B || !isFinishing() || this.f66674l == null) {
            return;
        }
        com.taurusx.tax.w.s.s sVar = this.f66667e;
        if (sVar != null) {
            sVar.z((JSONArray) null, false);
        }
        this.f66674l.onAdClosed();
        this.B = true;
    }

    private void c() {
        if (j0.c(this.f66683u)) {
            o();
        } else {
            z();
        }
    }

    private void g() {
        if (this.f66679q) {
            this.f66663a.addOnLayoutChangeListener(this.P);
            return;
        }
        float f10 = this.f66664b;
        if (f10 <= 0.0f) {
            f10 = 1.0f;
        }
        this.f66664b = f10;
        int iDoubleValue = (int) new BigDecimal(String.valueOf(30.0f)).multiply(new BigDecimal(String.valueOf(this.f66664b))).doubleValue();
        ViewGroup.LayoutParams layoutParams = this.f66669g.getLayoutParams();
        float f11 = iDoubleValue;
        layoutParams.width = j.z(getApplicationContext(), f11);
        layoutParams.height = j.z(getApplicationContext(), f11);
        this.f66669g.setLayoutParams(layoutParams);
    }

    private void n() {
        y.z zVar;
        if (this.J || (zVar = this.f66684v) == null) {
            return;
        }
        com.taurusx.tax.w.s.c.z(this, zVar.c(), "ad-bill");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.KEY_SHOW_TYPE, 1);
        } catch (Exception unused) {
        }
        com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), this.f66684v.k(), com.taurusx.tax.w.s.w.f67533m, 0L, this.f66683u, jSONObject, (c.a) null);
        this.J = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        t();
        n();
        com.taurusx.tax.w.a.c cVar = this.f66674l;
        if (cVar != null) {
            cVar.onAdImpression();
        }
        m.c(new o());
    }

    private void s() {
        y.z zVar = this.f66684v;
        String strZ = (zVar == null || zVar.f() == null) ? "" : this.f66684v.f().z();
        if (TextUtils.isEmpty(strZ)) {
            return;
        }
        int i10 = R.id.btn_ru_ado;
        findViewById(i10).setVisibility(0);
        findViewById(i10).setOnClickListener(new w(strZ));
    }

    private void t() {
        if (this.I) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        y.z zVar = this.f66684v;
        if (zVar != null) {
            arrayList.addAll(zVar.i());
        }
        com.taurusx.tax.w.s.c.z(this, arrayList, "ad-imp");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.KEY_SHOW_TYPE, 1);
        } catch (Exception unused) {
        }
        com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), com.taurusx.tax.w.s.c.z(this.f66684v), com.taurusx.tax.w.s.w.f67530c, 0L, this.f66683u, jSONObject, (c.a) null);
        this.I = true;
        com.taurusx.tax.w.z.t().a().z(com.taurusx.tax.w.s.w.f67530c, this.f66673k);
    }

    private void w() {
        m.c(new z());
    }

    private void y(Context context, String str) {
        Intent intent;
        if (l.z()) {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addCategory("android.intent.category.BROWSABLE");
        } else {
            intent = new Intent(context, (Class<?>) TaxWebViewActivity.class);
            intent.putExtra("url", str);
            String string = UUID.randomUUID().toString();
            com.taurusx.tax.g.n0.c.z().z(string, this.f66683u);
            intent.putExtra(TaxWebViewActivity.f66910a, string);
            intent.putExtra(TaxWebViewActivity.f66911n, this.f66673k);
        }
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public void a() {
        this.f66688z = (RelativeLayout) findViewById(R.id.inner_activity_main);
        this.f66668f = (LinearLayout) findViewById(R.id.app_layout);
        this.f66675m = (ImageView) findViewById(R.id.app_icon);
        this.f66678p = (TextView) findViewById(R.id.app_name);
        this.f66663a = (LinearLayout) findViewById(R.id.skip_ll);
        this.f66676n = (ImageView) findViewById(R.id.skip_click);
        this.f66671i = (TextView) findViewById(R.id.tax_textView_time);
        this.f66682t = (ImageView) findViewById(R.id.tax_imageview_close);
        ImageView imageView = (ImageView) findViewById(R.id.tax_imageview_close_click);
        this.f66669g = imageView;
        imageView.setOnClickListener(this);
        this.f66688z.setOnTouchListener(this.S);
        this.f66676n.setOnClickListener(this);
        this.f66685w = (ImageView) findViewById(R.id.native_img);
        this.f66687y = (ImageView) findViewById(R.id.blur_img);
        this.f66665c = (ImageView) findViewById(R.id.icon_img);
        this.f66677o = (TextView) findViewById(R.id.title);
        this.f66681s = (TextView) findViewById(R.id.cta);
        this.f66673k = getIntent().getStringExtra("placementId");
        com.taurusx.tax.w.c.z zVarZ = n.y.z().z(this.f66673k);
        if (zVarZ != null) {
            this.f66683u = zVarZ.k();
            this.f66684v = zVarZ.y();
            this.f66670h = zVarZ.o();
            this.f66672j = zVarZ.x();
            this.f66664b = zVarZ.s();
            this.f66666d = zVarZ.a();
            this.f66679q = zVarZ.r();
            this.f66667e = zVarZ.l();
            this.f66674l = zVarZ.e();
            try {
                JSONObject jSONObject = new JSONObject(this.f66684v.z());
                String strOptString = jSONObject.optString(com.taurusx.tax.w.o.z.f67418l);
                p.z(this.f66685w, strOptString);
                p.z(this.f66665c, jSONObject.optString(com.taurusx.tax.w.o.z.f67436r));
                this.f66677o.setText(jSONObject.optString(com.taurusx.tax.w.o.z.f67397e));
                this.f66681s.setText(jSONObject.optString(com.taurusx.tax.w.o.z.f67445u));
                this.f66686x = jSONObject.optString(com.taurusx.tax.w.o.z.f67448v);
                Bitmap bitmapZ = p.z(strOptString);
                if (bitmapZ != null) {
                    Bitmap bitmapZ2 = j0.z(TaurusXAds.getContext(), bitmapZ);
                    this.f66680r = bitmapZ2;
                    if (bitmapZ2 != null) {
                        this.f66687y.setImageBitmap(bitmapZ2);
                    }
                }
                if (com.taurusx.tax.w.z.t().z() != 0) {
                    this.f66668f.setVisibility(0);
                    this.f66675m.setImageResource(com.taurusx.tax.w.z.t().z());
                    this.f66678p.setText(com.taurusx.tax.g.w.z(this));
                }
                this.R.sendEmptyMessageDelayed(1, this.f66670h);
                this.Q = this.f66666d;
                this.f66671i.setText(this.Q + "s");
                this.R.sendEmptyMessageDelayed(0, 1000L);
                g();
                s();
                c();
                w();
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        } else {
            com.taurusx.tax.w.a.c cVar = this.f66674l;
            if (cVar != null) {
                cVar.onAdClosed();
                this.B = true;
            }
            this.O = com.taurusx.tax.w.w.AD_CONTENT_EMPTY;
            finish();
        }
        try {
            if (this.f66667e == null) {
                this.f66667e = com.taurusx.tax.w.s.s.z(this.f66673k);
            }
            long jCurrentTimeMillis = 0;
            long jCurrentTimeMillis2 = (zVarZ == null || zVarZ.w() == 0) ? 0L : System.currentTimeMillis() - zVarZ.w();
            if (zVarZ != null && zVarZ.z() != 0) {
                jCurrentTimeMillis = System.currentTimeMillis() - zVarZ.z();
            }
            this.f66667e.z(jCurrentTimeMillis2, jCurrentTimeMillis, false, this.O.getCode(), this.O.getMessageCompatibility());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    private void w(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    private void w(boolean z10) {
        z(z10);
    }

    public static void z(String str) {
        Intent intent = new Intent(TaurusXAds.getContext(), (Class<?>) AppOpenNativeAdActivity.class);
        intent.putExtra("placementId", str);
        intent.putExtra("orientation", t.a(TaurusXAds.getContext()));
        intent.addFlags(268435456);
        TaurusXAds.getContext().startActivity(intent);
    }

    public void z(Activity activity) {
        activity.getWindow().getDecorView().setSystemUiVisibility(4102);
        ActionBar actionBar = activity.getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        activity.getWindow().setFlags(1024, 1024);
    }

    private void y() {
        com.taurusx.tax.s.z.y(this.L, this.f66667e);
        this.L = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        LogUtil.v(T, "checkVisible:");
        m.z(new c(), 1000L);
    }

    public void z(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
        if (this.K || this.f66684v == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        y.z zVar2 = this.f66684v;
        if (zVar2 != null) {
            arrayList.addAll(zVar2.s());
        }
        com.taurusx.tax.w.s.c.z(this, e.z(arrayList, zVar), "ad-click");
        JSONObject jSONObjectZ = com.taurusx.tax.w.s.c.z(zVar);
        try {
            jSONObjectZ.put(CampaignEx.KEY_SHOW_TYPE, 1);
        } catch (Exception unused) {
        }
        com.taurusx.tax.w.s.c.z(this, this.f66684v.k(), com.taurusx.tax.w.s.w.f67535o, 0L, this.f66683u, jSONObjectZ, (c.a) null);
        this.K = true;
        com.taurusx.tax.w.z.t().a().z(com.taurusx.tax.w.s.w.f67535o, this.f66673k);
        this.f66667e.z(zVar, aVar, (String) null, false);
        this.f66667e.w(zVar, aVar, null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar, String str) {
        com.taurusx.tax.w.a.c cVar = this.f66674l;
        if (cVar != null) {
            cVar.onAdClicked();
        }
        z(this, str);
        z(zVar, aVar);
    }

    private boolean z(Context context, String str) {
        String strA = this.f66684v.a();
        String strM = this.f66684v.m();
        if (!TextUtils.isEmpty(strA)) {
            if (h0.z(context, strA)) {
                h0.z(context, strA, Constants.DEEPLINK);
                return true;
            }
            if (!TextUtils.isEmpty(strM)) {
                h0.z(context, strM, POBCoreNativeConstants.NATIVE_FALLBACK_URL);
                return true;
            }
        }
        try {
            if (!f0.z(context, null, str)) {
                if (str == null || !str.startsWith("http")) {
                    return false;
                }
                y(context, str);
            }
            return true;
        } catch (Throwable th2) {
            LogUtil.v(T, "onClickEvent:" + th2.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(boolean z10) {
        if (this.f66674l == null || this.B) {
            return;
        }
        com.taurusx.tax.w.s.s sVar = this.f66667e;
        if (sVar != null) {
            sVar.z(this.D, this.E, System.currentTimeMillis() - this.N, z10 ? 1 : 0, (JSONArray) null, false);
        }
        this.f66674l.onAdClosed();
        this.B = true;
        finish();
    }
}
