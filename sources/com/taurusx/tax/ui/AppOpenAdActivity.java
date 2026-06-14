package com.taurusx.tax.ui;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
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
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.adjust.sdk.Constants;
import com.iab.omid.library.taurusx.adsession.AdEvents;
import com.iab.omid.library.taurusx.adsession.AdSession;
import com.iab.omid.library.taurusx.adsession.CreativeType;
import com.iab.omid.library.taurusx.adsession.media.MediaEvents;
import com.iab.omid.library.taurusx.adsession.media.Position;
import com.iab.omid.library.taurusx.adsession.media.VastProperties;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.R;
import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.g.e;
import com.taurusx.tax.g.f0;
import com.taurusx.tax.g.h0;
import com.taurusx.tax.g.j;
import com.taurusx.tax.g.j0;
import com.taurusx.tax.g.k0;
import com.taurusx.tax.g.l;
import com.taurusx.tax.g.m;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.o.g0;
import com.taurusx.tax.t.z;
import com.taurusx.tax.ui.TaxMediaView;
import com.taurusx.tax.vast.VastCompanionAdConfig;
import com.taurusx.tax.vast.VastConfig;
import com.taurusx.tax.vast.VastManager;
import com.taurusx.tax.vast.VastTracker;
import com.taurusx.tax.w.a.n;
import com.taurusx.tax.w.c.y;
import com.taurusx.tax.w.s.c;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AppOpenAdActivity extends Activity implements View.OnClickListener {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final String f66598m0 = "AppOpenAdActivity";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f66599n0 = 0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final int f66600o0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final float f66601p0 = 30.0f;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final float f66602q0 = 28.0f;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final float f66603r0 = 12.0f;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final float f66604s0 = 24.0f;
    public boolean A;
    public boolean C;
    public boolean D;
    public com.taurusx.tax.w.c.y E;
    public y.w.C0823w F;
    public AdSession G;
    public AdEvents H;
    public MediaEvents I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public long Q;
    public boolean R;
    public int S;
    public int T;
    public float U;
    public float V;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinearLayout f66605a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f66606a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f66607b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f66608b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f66609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f66611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.taurusx.tax.w.s.s f66613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f66615f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f66616f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f66617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f66619h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f66621i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f66622i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f66623j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f66625k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VastConfig f66627l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f66628l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LinearLayout f66629m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f66630n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ViewGroup f66631o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageView f66632p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f66633q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f66634r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.taurusx.tax.t.z f66635s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f66636t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f66637u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public y.z f66638v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f66639w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public com.taurusx.tax.w.a.c f66640x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TaxMediaView f66641y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public RelativeLayout f66642z;
    public boolean B = true;
    public com.taurusx.tax.w.s.z O = new com.taurusx.tax.w.s.z();
    public com.taurusx.tax.w.s.a P = new com.taurusx.tax.w.s.a();
    public long W = 0;
    public com.taurusx.tax.w.w X = com.taurusx.tax.w.w.SUCCESS;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public long f66610c0 = 0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f66612d0 = false;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public View.OnLayoutChangeListener f66614e0 = new z();

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Handler f66618g0 = new g(this);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public View.OnTouchListener f66620h0 = new y();

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public AtomicBoolean f66624j0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public AtomicBoolean f66626k0 = new AtomicBoolean(false);

    public class a implements f0.z {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ View f66644z;

        public class z implements Runnable {

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Intent f66645w;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public final /* synthetic */ Context f66647z;

            public z(Context context, Intent intent) {
                this.f66647z = context;
                this.f66645w = intent;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f66647z.startActivity(this.f66645w);
            }
        }

        public a(View view) {
            this.f66644z = view;
        }

        @Override // com.taurusx.tax.g.f0.z
        public void z(Context context, Intent intent) {
            if (AppOpenAdActivity.this.f66622i0) {
                context.startActivity(intent);
            } else {
                k0.z(this.f66644z, new z(context, intent));
            }
        }
    }

    public class c implements TaxMediaView.g {
        public c() {
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void onPlayEnd() {
            Log.v(AppOpenAdActivity.f66598m0, "onPlayEnd");
            if (AppOpenAdActivity.this.f66640x != null) {
                AppOpenAdActivity.this.f66640x.onAdVideoEnd();
            }
            if (AppOpenAdActivity.this.f66641y != null) {
                AppOpenAdActivity.this.f66641y.p();
            }
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void onPlayFailed() {
            AppOpenAdActivity.this.z(com.taurusx.tax.g.n.f66166j);
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void onPlayProgress(int i10) {
            AppOpenAdActivity appOpenAdActivity = AppOpenAdActivity.this;
            appOpenAdActivity.z(i10, appOpenAdActivity.f66641y.getVideoLength());
            AppOpenAdActivity.this.z(i10);
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void onPlayStart() {
            int videoLength = AppOpenAdActivity.this.f66641y.getVideoLength() / 1000;
            AppOpenAdActivity appOpenAdActivity = AppOpenAdActivity.this;
            if (videoLength > appOpenAdActivity.f66633q) {
                videoLength = AppOpenAdActivity.this.f66633q;
            }
            appOpenAdActivity.f66616f0 = videoLength;
            AppOpenAdActivity.this.f66639w.setText(AppOpenAdActivity.this.f66616f0 + "s");
            AppOpenAdActivity.this.f66618g0.sendEmptyMessageDelayed(0, 1000L);
            if (AppOpenAdActivity.this.f66640x != null) {
                AppOpenAdActivity.this.f66640x.onAdVideoStart();
            }
            AppOpenAdActivity.this.f66642z.setVisibility(8);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("totalDuration", AppOpenAdActivity.this.f66641y.getVideoLength());
                if (AppOpenAdActivity.this.F != null && AppOpenAdActivity.this.F.R()) {
                    jSONObject.put("spendTime", System.currentTimeMillis() - AppOpenAdActivity.this.Q);
                }
                jSONObject.put(CampaignEx.KEY_SHOW_TYPE, 1);
            } catch (JSONException unused) {
            }
            AppOpenAdActivity appOpenAdActivity2 = AppOpenAdActivity.this;
            com.taurusx.tax.w.s.c.z(appOpenAdActivity2, appOpenAdActivity2.f66638v.k(), com.taurusx.tax.w.s.w.f67537s, 0L, AppOpenAdActivity.this.E, jSONObject, (c.a) null);
            if (AppOpenAdActivity.this.f66627l != null && AppOpenAdActivity.this.f66613e != null) {
                AppOpenAdActivity.this.f66613e.y(AppOpenAdActivity.this.f66627l.getDiskMediaFileUrl(), false);
            }
            AppOpenAdActivity.this.z(0);
            AppOpenAdActivity.this.e();
            com.taurusx.tax.s.z.w(AppOpenAdActivity.this.I, AppOpenAdActivity.this.f66613e);
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void onProgress(int i10, int i11) {
            AppOpenAdActivity.this.f66610c0 = i10;
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void w() {
            Log.v(AppOpenAdActivity.f66598m0, "onNoMute");
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void y() {
            Log.v(AppOpenAdActivity.f66598m0, "onMute");
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void z() {
            AppOpenAdActivity appOpenAdActivity = AppOpenAdActivity.this;
            appOpenAdActivity.z(100, appOpenAdActivity.f66641y.getVideoLength());
            AppOpenAdActivity.this.z(100);
            com.taurusx.tax.s.z.w(AppOpenAdActivity.this.I, AppOpenAdActivity.this.G, AppOpenAdActivity.this.f66613e);
            com.taurusx.tax.s.z.z(AppOpenAdActivity.this.I, AppOpenAdActivity.this.f66613e);
        }
    }

    public static class g extends Handler {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public WeakReference<AppOpenAdActivity> f66649z;

        public g(AppOpenAdActivity appOpenAdActivity) {
            this.f66649z = new WeakReference<>(appOpenAdActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            AppOpenAdActivity appOpenAdActivity = this.f66649z.get();
            if (appOpenAdActivity == null) {
                return;
            }
            int i10 = message.what;
            if (i10 != 0) {
                if (i10 != 1) {
                    return;
                }
                if (appOpenAdActivity.A) {
                    appOpenAdActivity.f66605a.setVisibility(0);
                    appOpenAdActivity.f66630n.setVisibility(0);
                    return;
                } else {
                    appOpenAdActivity.f66617g.setVisibility(0);
                    appOpenAdActivity.f66615f.setVisibility(0);
                    return;
                }
            }
            if (appOpenAdActivity.f66616f0 <= 0) {
                appOpenAdActivity.f66639w.setText("0s");
                if (appOpenAdActivity.f66619h) {
                    appOpenAdActivity.z(true);
                    return;
                }
                return;
            }
            if (!appOpenAdActivity.f66628l0) {
                AppOpenAdActivity.E(appOpenAdActivity);
                appOpenAdActivity.f66639w.setText(appOpenAdActivity.f66616f0 + "s");
            }
            sendEmptyMessageDelayed(0, 1000L);
        }
    }

    public class n implements z.InterfaceC0815z {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y.z f66650c;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ com.taurusx.tax.w.s.s f66653y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public com.taurusx.tax.w.s.z f66654z = null;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public com.taurusx.tax.w.s.a f66652w = null;

        public n(com.taurusx.tax.w.s.s sVar, y.z zVar) {
            this.f66653y = sVar;
            this.f66650c = zVar;
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void w() {
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public /* synthetic */ WebResourceResponse z(WebView webView, String str) {
            return z5.a.b(this, webView, str);
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void w(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
            Log.v(AppOpenAdActivity.f66598m0, "onClicked");
            this.f66654z = zVar;
            this.f66652w = aVar;
            if (j0.z(AppOpenAdActivity.this.E, zVar)) {
                if (AppOpenAdActivity.this.f66640x != null) {
                    AppOpenAdActivity.this.f66640x.onAdClicked();
                }
                AppOpenAdActivity.this.w(zVar, aVar);
                AppOpenAdActivity.this.y(zVar, aVar);
            }
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void z(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
            AppOpenAdActivity.this.f66622i0 = true;
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public boolean z(String str) {
            LogUtil.v(AppOpenAdActivity.f66598m0, "onJump :" + str);
            boolean z10 = false;
            boolean z11 = AppOpenAdActivity.this.F != null && AppOpenAdActivity.this.F.G() == 1;
            if (!TextUtils.isEmpty(str)) {
                if (AppOpenAdActivity.this.f66622i0) {
                    AppOpenAdActivity.this.c(this.f66654z, this.f66652w);
                }
                if (AppOpenAdActivity.this.f66622i0 || !z11) {
                    AppOpenAdActivity appOpenAdActivity = AppOpenAdActivity.this;
                    z10 = appOpenAdActivity.z(appOpenAdActivity, appOpenAdActivity.f66635s, str, this.f66653y.w());
                }
                if (!AppOpenAdActivity.this.f66622i0 && !AppOpenAdActivity.this.N) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("html", this.f66650c.z());
                        jSONObject.put(CampaignEx.KEY_SHOW_TYPE, 1);
                    } catch (Exception unused) {
                    }
                    com.taurusx.tax.w.s.c.z(AppOpenAdActivity.this.f66635s.getContext(), this.f66650c.k(), com.taurusx.tax.w.s.w.f67536p, 0L, AppOpenAdActivity.this.E, jSONObject, (c.a) null);
                    AppOpenAdActivity.this.N = true;
                }
            }
            return z10;
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void w(WebView webView, String str) {
            if (AppOpenAdActivity.this.f66612d0) {
                return;
            }
            AppOpenAdActivity.this.f66612d0 = j0.c(str);
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void z() {
            if (AppOpenAdActivity.this.f66638v != null && AppOpenAdActivity.this.f66638v.y() == 7 && "html".equalsIgnoreCase(AppOpenAdActivity.this.f66638v.w())) {
                try {
                    AppOpenAdActivity.this.G = com.taurusx.tax.s.z.z(TaurusXAds.getContext(), AppOpenAdActivity.this.f66635s, "", CreativeType.HTML_DISPLAY, AppOpenAdActivity.this.f66613e);
                    if (AppOpenAdActivity.this.G != null) {
                        com.taurusx.tax.s.z.z(AppOpenAdActivity.this.G, (ViewGroup) AppOpenAdActivity.this.f66635s, AppOpenAdActivity.this.f66613e);
                        com.taurusx.tax.s.z.o(AppOpenAdActivity.this.G, AppOpenAdActivity.this.f66613e);
                        AppOpenAdActivity appOpenAdActivity = AppOpenAdActivity.this;
                        appOpenAdActivity.H = com.taurusx.tax.s.z.z(appOpenAdActivity.G, AppOpenAdActivity.this.f66613e);
                        com.taurusx.tax.s.z.w(AppOpenAdActivity.this.H, AppOpenAdActivity.this.f66613e);
                        com.taurusx.tax.s.z.z(AppOpenAdActivity.this.H, AppOpenAdActivity.this.f66613e);
                    }
                } catch (Throwable th2) {
                    if (AppOpenAdActivity.this.f66613e != null) {
                        AppOpenAdActivity.this.f66613e.w(th2.getMessage(), false);
                    }
                }
            }
        }
    }

    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AppOpenAdActivity.this.B) {
                if (AppOpenAdActivity.this.f66628l0) {
                    AppOpenAdActivity.this.w();
                    return;
                }
                AppOpenAdActivity.b(AppOpenAdActivity.this);
                LogUtil.v(AppOpenAdActivity.f66598m0, "valid number  = " + j0.y(AppOpenAdActivity.this.E));
                if (AppOpenAdActivity.this.T >= j0.y(AppOpenAdActivity.this.E)) {
                    AppOpenAdActivity.this.s();
                } else {
                    AppOpenAdActivity.this.w();
                }
            }
        }
    }

    public class s implements Runnable {
        public s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if ("vast".equalsIgnoreCase(AppOpenAdActivity.this.f66634r)) {
                com.taurusx.tax.s.z.z(AppOpenAdActivity.this.H, AppOpenAdActivity.this.f66613e);
            }
        }
    }

    public class t implements Runnable {
        public t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if ("vast".equalsIgnoreCase(AppOpenAdActivity.this.f66634r)) {
                    boolean z10 = (AppOpenAdActivity.this.f66627l == null || TextUtils.isEmpty(AppOpenAdActivity.this.f66627l.getDiskMediaFileUrl())) ? false : true;
                    AppOpenAdActivity.this.G = com.taurusx.tax.s.z.z(TaurusXAds.getContext(), (String) null, z10 ? CreativeType.VIDEO : CreativeType.NATIVE_DISPLAY, AppOpenAdActivity.this.f66627l, AppOpenAdActivity.this.f66613e);
                    if (AppOpenAdActivity.this.G != null) {
                        AppOpenAdActivity appOpenAdActivity = AppOpenAdActivity.this;
                        appOpenAdActivity.H = com.taurusx.tax.s.z.z(appOpenAdActivity.G, AppOpenAdActivity.this.f66613e);
                        AppOpenAdActivity appOpenAdActivity2 = AppOpenAdActivity.this;
                        appOpenAdActivity2.I = com.taurusx.tax.s.z.w(appOpenAdActivity2.G, AppOpenAdActivity.this.f66613e);
                        if (z10 && AppOpenAdActivity.this.f66641y != null) {
                            AppOpenAdActivity.this.f66641y.z(AppOpenAdActivity.this.G, AppOpenAdActivity.this.I);
                        }
                        com.taurusx.tax.s.z.z(AppOpenAdActivity.this.G, AppOpenAdActivity.this.f66631o, AppOpenAdActivity.this.f66613e);
                        AppOpenAdActivity.this.i();
                        com.taurusx.tax.s.z.o(AppOpenAdActivity.this.G, AppOpenAdActivity.this.f66613e);
                        if (z10) {
                            com.taurusx.tax.s.z.z(AppOpenAdActivity.this.H, VastProperties.createVastPropertiesForSkippableMedia(AppOpenAdActivity.this.f66611d * 1000, true, Position.STANDALONE), AppOpenAdActivity.this.f66613e);
                        } else {
                            com.taurusx.tax.s.z.w(AppOpenAdActivity.this.H, AppOpenAdActivity.this.f66613e);
                        }
                    }
                }
            } catch (Throwable th2) {
                Log.d(AppOpenAdActivity.f66598m0, "createSession failed", th2);
                if (AppOpenAdActivity.this.f66613e != null) {
                    AppOpenAdActivity.this.f66613e.w(th2.getMessage(), false);
                }
            }
        }
    }

    public class w implements View.OnClickListener {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f66659z;

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
                AppOpenAdActivity appOpenAdActivity = AppOpenAdActivity.this;
                appOpenAdActivity.z((Activity) appOpenAdActivity);
            }
        }

        public w(String str) {
            this.f66659z = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.taurusx.tax.t.y.z zVarZ = new com.taurusx.tax.t.y.z(AppOpenAdActivity.this).z(this.f66659z).z(AppOpenAdActivity.this.f66613e);
            zVarZ.setOnDismissListener(new z());
            zVarZ.w();
        }
    }

    public class y implements View.OnTouchListener {
        public y() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                AppOpenAdActivity.this.P.f67468z = System.currentTimeMillis();
                AppOpenAdActivity.this.O.w(String.valueOf((int) motionEvent.getX()));
                AppOpenAdActivity.this.O.y(String.valueOf((int) motionEvent.getY()));
            } else if (motionEvent.getAction() == 1) {
                AppOpenAdActivity.this.P.f67466w = System.currentTimeMillis();
                AppOpenAdActivity.this.P.f67467y = motionEvent.getDownTime();
                AppOpenAdActivity.this.P.f67463c = motionEvent.getEventTime();
                AppOpenAdActivity.this.P.z(motionEvent);
                AppOpenAdActivity.this.O.o(String.valueOf((int) motionEvent.getX()));
                AppOpenAdActivity.this.O.s(String.valueOf((int) motionEvent.getY()));
                AppOpenAdActivity.this.O.c(String.valueOf(view.getHeight()));
                AppOpenAdActivity.this.O.a(String.valueOf(view.getWidth()));
                AppOpenAdActivity.this.O.z(String.valueOf(System.currentTimeMillis()));
                LogUtil.d("CoordinateInfo", "the coordinate info " + AppOpenAdActivity.this.O.toString());
                if (j0.z(AppOpenAdActivity.this.E, AppOpenAdActivity.this.O)) {
                    AppOpenAdActivity appOpenAdActivity = AppOpenAdActivity.this;
                    appOpenAdActivity.z(appOpenAdActivity.O, AppOpenAdActivity.this.P, view);
                }
            }
            return true;
        }
    }

    public class z implements View.OnLayoutChangeListener {
        public z() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (i10 == i14 && i11 == i15 && i12 == i16 && i13 == i17) {
                return;
            }
            AppOpenAdActivity appOpenAdActivity = AppOpenAdActivity.this;
            appOpenAdActivity.f66623j = appOpenAdActivity.f66623j > 0.0f ? AppOpenAdActivity.this.f66623j : 1.0f;
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(AppOpenAdActivity.this.f66623j));
            int iDoubleValue = (int) new BigDecimal(String.valueOf(AppOpenAdActivity.this.f66605a.getWidth())).multiply(bigDecimal).doubleValue();
            int iDoubleValue2 = (int) new BigDecimal(String.valueOf(AppOpenAdActivity.this.f66605a.getHeight())).multiply(bigDecimal).doubleValue();
            ViewGroup.LayoutParams layoutParams = AppOpenAdActivity.this.f66630n.getLayoutParams();
            layoutParams.width = iDoubleValue;
            layoutParams.height = iDoubleValue2;
            AppOpenAdActivity.this.f66630n.setLayoutParams(layoutParams);
        }
    }

    public static /* synthetic */ int E(AppOpenAdActivity appOpenAdActivity) {
        int i10 = appOpenAdActivity.f66616f0;
        appOpenAdActivity.f66616f0 = i10 - 1;
        return i10;
    }

    public static /* synthetic */ int b(AppOpenAdActivity appOpenAdActivity) {
        int i10 = appOpenAdActivity.T;
        appOpenAdActivity.T = i10 + 1;
        return i10;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.U = motionEvent.getX();
        this.V = motionEvent.getY();
        LogUtil.v("taurusx", "dispatchTouchEvent at x = " + motionEvent.getX() + " and y = " + motionEvent.getY());
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.layout_ad) {
            z(view.getContext(), com.taurusx.tax.w.o.w.y(), (f0.z) null);
        } else if (id2 == R.id.skip_click) {
            w(false);
        } else if (id2 == R.id.tax_imageview_close_click) {
            z(false);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.taurusx_activity_appopen);
        z((Activity) this);
        this.W = System.currentTimeMillis();
        if (TaurusXAds.isInitialized()) {
            a();
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        LogUtil.i("taurusx", "onDestroy hasCallClose: " + this.R);
        if (this.f66613e != null) {
            VastConfig vastConfig = this.f66627l;
            String diskMediaFileUrl = vastConfig != null ? vastConfig.getDiskMediaFileUrl() : null;
            if (!TextUtils.isEmpty(diskMediaFileUrl)) {
                this.f66613e.z(diskMediaFileUrl, this.f66610c0, false);
            }
        }
        if (!this.R && this.f66640x != null) {
            com.taurusx.tax.w.s.s sVar = this.f66613e;
            if (sVar != null) {
                sVar.z((JSONArray) null, false);
            }
            this.f66640x.onAdClosed();
            this.R = true;
        }
        this.B = false;
        c();
        n.y.z().w(this.f66625k);
        TaxMediaView taxMediaView = this.f66641y;
        if (taxMediaView != null) {
            taxMediaView.p();
        }
        Handler handler = this.f66618g0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        LinearLayout linearLayout = this.f66605a;
        if (linearLayout != null) {
            linearLayout.removeOnLayoutChangeListener(this.f66614e0);
        }
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
        this.f66628l0 = true;
        TaxMediaView taxMediaView = this.f66641y;
        if (taxMediaView != null && !this.C) {
            taxMediaView.m();
            com.taurusx.tax.n.y.z().w(this.f66627l);
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        this.f66628l0 = false;
        TaxMediaView taxMediaView = this.f66641y;
        if (taxMediaView != null && !taxMediaView.t() && !this.C) {
            this.f66641y.e();
            com.taurusx.tax.n.y.z().y(this.f66627l);
        }
        z((Activity) this);
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        LogUtil.i("taurusx", "onStop hasCallClose: " + this.R + ",isFinishing: " + isFinishing());
        if (this.R || !isFinishing() || this.f66640x == null) {
            return;
        }
        com.taurusx.tax.w.s.s sVar = this.f66613e;
        if (sVar != null) {
            sVar.z((JSONArray) null, false);
        }
        this.f66640x.onAdClosed();
        this.R = true;
    }

    private void a() {
        l();
        this.f66625k = getIntent().getStringExtra("placementId");
        com.taurusx.tax.w.c.z zVarZ = n.y.z().z(this.f66625k);
        com.taurusx.tax.w.w wVar = com.taurusx.tax.w.w.SUCCESS;
        if (zVarZ != null) {
            com.taurusx.tax.w.c.y yVarK = zVarZ.k();
            this.E = yVarK;
            if (yVarK != null && yVarK.c() != null) {
                this.F = this.E.c().w();
            }
            this.f66638v = zVarZ.y();
            this.f66627l = zVarZ.u();
            this.f66625k = zVarZ.i();
            boolean zB = zVarZ.b();
            this.f66637u = zB;
            if (!zB) {
                this.f66637u = j0.w(this);
            }
            this.f66634r = zVarZ.c();
            this.f66613e = zVarZ.l();
            this.f66640x = zVarZ.e();
            this.D = zVarZ.h();
            this.f66607b = zVarZ.o();
            this.f66619h = zVarZ.x();
            this.f66623j = zVarZ.s();
            this.f66611d = zVarZ.a();
            this.f66633q = zVarZ.n();
            this.A = zVarZ.r();
            f();
            y();
        } else {
            com.taurusx.tax.w.a.c cVar = this.f66640x;
            if (cVar != null) {
                cVar.onAdClosed();
                this.R = true;
            }
            z(com.taurusx.tax.g.n.f66164h);
            finish();
        }
        try {
            if (this.f66613e == null) {
                this.f66613e = com.taurusx.tax.w.s.s.z(this.f66625k);
            }
            TaxMediaView taxMediaView = this.f66641y;
            if (taxMediaView != null) {
                taxMediaView.setTaxCustomEvent(this.f66613e);
            }
            long jCurrentTimeMillis = 0;
            long jCurrentTimeMillis2 = (zVarZ == null || zVarZ.w() == 0) ? 0L : System.currentTimeMillis() - zVarZ.w();
            if (zVarZ != null && zVarZ.z() != 0) {
                jCurrentTimeMillis = System.currentTimeMillis() - zVarZ.z();
            }
            this.f66613e.z(jCurrentTimeMillis2, jCurrentTimeMillis, false, this.X.getCode(), this.X.getMessageCompatibility());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        o();
    }

    private void f() {
        this.f66629m = (LinearLayout) findViewById(R.id.app_layout);
        this.f66632p = (ImageView) findViewById(R.id.app_icon);
        this.f66621i = (TextView) findViewById(R.id.app_name);
        this.f66605a = (LinearLayout) findViewById(R.id.skip_ll);
        this.f66630n = (ImageView) findViewById(R.id.skip_click);
        this.f66639w = (TextView) findViewById(R.id.tax_textView_time);
        this.f66631o = (ViewGroup) findViewById(R.id.inner_activity_main);
        this.f66642z = (RelativeLayout) findViewById(R.id.progress_rl);
        findViewById(R.id.layout_ad).setOnClickListener(this);
        this.f66630n.setOnClickListener(this);
        this.f66617g = (ImageView) findViewById(R.id.tax_imageview_close);
        ImageView imageView = (ImageView) findViewById(R.id.tax_imageview_close_click);
        this.f66615f = imageView;
        imageView.setOnClickListener(this);
        this.f66618g0.sendEmptyMessageDelayed(1, this.f66607b);
        this.f66641y = (TaxMediaView) findViewById(R.id.tax_mediaview);
        y.w.C0823w c0823w = this.F;
        if (c0823w != null && c0823w.N()) {
            this.f66631o.setOnTouchListener(this.f66620h0);
        }
        this.f66641y.setOrientation(this.S);
        this.f66641y.setOnTouchListener(this.f66620h0);
        this.f66609c = (LinearLayout) findViewById(R.id.layout_webview);
        this.f66636t = (TextView) findViewById(R.id.cta);
        if (com.taurusx.tax.w.z.t().z() != 0) {
            this.f66629m.setVisibility(0);
            this.f66632p.setImageResource(com.taurusx.tax.w.z.t().z());
            this.f66621i.setText(com.taurusx.tax.g.w.z(this));
        }
        k();
        y.w.C0823w c0823w2 = this.F;
        if (c0823w2 != null && c0823w2.J()) {
            findViewById(R.id.ad_tv).setVisibility(0);
        }
        n();
        this.Q = System.currentTimeMillis();
        if (!"vast".equalsIgnoreCase(this.f66634r)) {
            t();
            this.f66616f0 = this.f66611d;
            this.f66639w.setText(this.f66616f0 + "s");
            this.f66618g0.sendEmptyMessageDelayed(0, 1000L);
            return;
        }
        VastConfig vastConfig = this.f66627l;
        if (vastConfig == null) {
            z("100");
            this.X = com.taurusx.tax.w.w.AD_CONTENT_PARSE_FAILED;
            finish();
        } else {
            if (!TextUtils.isEmpty(vastConfig.getDiskMediaFileUrl())) {
                g();
                return;
            }
            z("100");
            this.X = com.taurusx.tax.w.w.AD_VIDEO_WITH_NO_MEDIA;
            finish();
        }
    }

    private void g() {
        this.f66642z.setVisibility(0);
        this.f66641y.z(this.f66638v, this.f66627l);
        v();
        this.f66641y.setOnPlayerListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        ArrayList<View> arrayList = new ArrayList();
        arrayList.add(this.f66639w);
        arrayList.add(findViewById(R.id.tax_textView_time));
        arrayList.add(findViewById(R.id.layout_ad));
        arrayList.add(findViewById(R.id.tv_tips));
        arrayList.add(this.f66609c);
        for (View view : arrayList) {
            if (view != null) {
                com.taurusx.tax.s.z.z(this.G, view, this.f66613e);
            }
        }
    }

    private void k() {
        if (this.A) {
            this.f66605a.addOnLayoutChangeListener(this.f66614e0);
            return;
        }
        float f10 = this.f66623j;
        if (f10 <= 0.0f) {
            f10 = 1.0f;
        }
        this.f66623j = f10;
        int iDoubleValue = (int) new BigDecimal(String.valueOf(30.0f)).multiply(new BigDecimal(String.valueOf(this.f66623j))).doubleValue();
        ViewGroup.LayoutParams layoutParams = this.f66615f.getLayoutParams();
        float f11 = iDoubleValue;
        layoutParams.width = j.z(getApplicationContext(), f11);
        layoutParams.height = j.z(getApplicationContext(), f11);
        this.f66615f.setLayoutParams(layoutParams);
    }

    private void l() {
        int intExtra = getIntent().getIntExtra("orientation", 0);
        this.S = intExtra;
        if (intExtra == 0) {
            setRequestedOrientation(1);
        } else {
            setRequestedOrientation(6);
        }
    }

    private void m() {
        y.z zVar;
        if (this.K || (zVar = this.f66638v) == null) {
            return;
        }
        com.taurusx.tax.w.s.c.z(this, zVar.c(), "ad-bill");
        JSONObject jSONObject = new JSONObject();
        try {
            if ("html".equalsIgnoreCase(this.f66634r) || POBCoreNativeConstants.NATIVE_LINK.equalsIgnoreCase(this.f66634r)) {
                jSONObject.put("html_imp_load", this.f66612d0);
            }
            jSONObject.put(CampaignEx.KEY_SHOW_TYPE, 1);
        } catch (Exception unused) {
        }
        com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), this.f66638v.k(), com.taurusx.tax.w.s.w.f67533m, 0L, this.E, jSONObject, (c.a) null);
        this.K = true;
    }

    private void n() {
        y.z zVar = this.f66638v;
        String strZ = (zVar == null || zVar.f() == null) ? "" : this.f66638v.f().z();
        if (TextUtils.isEmpty(strZ)) {
            return;
        }
        int i10 = R.id.btn_ru_ado;
        findViewById(i10).setVisibility(0);
        findViewById(i10).setOnClickListener(new w(strZ));
    }

    private void o() {
        if (j0.c(this.E)) {
            s();
        } else {
            w();
        }
    }

    private void p() {
        if (this.J) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        y.z zVar = this.f66638v;
        if (zVar != null) {
            arrayList.addAll(zVar.i());
        }
        VastConfig vastConfig = this.f66627l;
        if (vastConfig != null) {
            Iterator<VastTracker> it = vastConfig.getImpressionTrackers().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getContent());
            }
        }
        com.taurusx.tax.w.s.c.z(this, arrayList, "ad-imp");
        JSONObject jSONObject = new JSONObject();
        try {
            if ("html".equalsIgnoreCase(this.f66634r) || POBCoreNativeConstants.NATIVE_LINK.equalsIgnoreCase(this.f66634r)) {
                jSONObject.put("html_imp_load", this.f66612d0);
            }
            jSONObject.put(CampaignEx.KEY_SHOW_TYPE, 1);
        } catch (Exception unused) {
        }
        com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), com.taurusx.tax.w.s.c.z(this.f66638v), com.taurusx.tax.w.s.w.f67530c, 0L, this.E, jSONObject, (c.a) null);
        this.J = true;
        com.taurusx.tax.w.z.t().a().z(com.taurusx.tax.w.s.w.f67530c, this.f66625k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        p();
        m();
        com.taurusx.tax.w.a.c cVar = this.f66640x;
        if (cVar != null) {
            cVar.onAdImpression();
        }
        m.c(new s());
    }

    private void t() {
        try {
            if ("html".equalsIgnoreCase(this.f66634r)) {
                if (this.f66638v.z().contains("mraid.js")) {
                    z(this.f66613e, this.f66638v);
                } else {
                    w(this.f66613e, this.f66638v);
                }
                this.f66635s.loadHtmlResponse(this.f66638v.z());
            } else if (POBCoreNativeConstants.NATIVE_LINK.equalsIgnoreCase(this.f66634r)) {
                z(this.f66613e, this.f66638v);
                this.f66635s.loadUrl(this.f66638v.z());
            }
            this.f66609c.setVisibility(0);
            o();
        } catch (Throwable unused) {
            com.taurusx.tax.w.a.c cVar = this.f66640x;
            if (cVar != null) {
                cVar.onAdClosed();
                this.R = true;
            }
            z(com.taurusx.tax.g.n.f66155b);
            this.X = com.taurusx.tax.w.w.AD_HTML_LOAD_ERROR;
            finish();
        }
    }

    private void v() {
        TaxMediaView taxMediaView = this.f66641y;
        if (taxMediaView != null) {
            taxMediaView.setMute(this.f66637u);
        }
    }

    private void c() {
        com.taurusx.tax.s.z.c(this.G, this.f66613e);
        com.taurusx.tax.s.z.y(this.G, this.f66613e);
        this.G = null;
    }

    private void y(com.taurusx.tax.w.s.s sVar, y.z zVar) {
        z();
        this.f66635s.setWebViewListener(new n(sVar, zVar));
    }

    public static void w(String str) {
        Intent intent = new Intent(TaurusXAds.getContext(), (Class<?>) AppOpenAdActivity.class);
        intent.putExtra("placementId", str);
        intent.putExtra("orientation", com.taurusx.tax.g.t.a(TaurusXAds.getContext()));
        intent.addFlags(268435456);
        TaurusXAds.getContext().startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
        if (this.f66624j0.getAndSet(true)) {
            return;
        }
        this.f66613e.z(zVar, aVar, (String) null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
        if (this.f66626k0.getAndSet(true)) {
            return;
        }
        this.f66613e.w(zVar, aVar, null, false);
    }

    private void y() {
        m.c(new t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        LogUtil.v(f66598m0, "checkVisible:");
        m.z(new o(), 1000L);
    }

    private void w(boolean z10) {
        this.C = true;
        com.taurusx.tax.s.z.y(this.I, this.f66613e);
        TaxMediaView taxMediaView = this.f66641y;
        if (taxMediaView != null && taxMediaView.t()) {
            com.taurusx.tax.n.y.z().c(this.f66627l);
        }
        z(z10);
    }

    public void z(Activity activity) {
        activity.getWindow().getDecorView().setSystemUiVisibility(4102);
        ActionBar actionBar = activity.getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        activity.getWindow().setFlags(1024, 1024);
    }

    private void w(com.taurusx.tax.w.s.s sVar, y.z zVar) {
        this.f66635s = new com.taurusx.tax.t.w(this, zVar != null && zVar.y() == 7);
        y(sVar, zVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(int i10, int i11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("totalDuration", i11);
            jSONObject.put(CampaignEx.KEY_SHOW_TYPE, 1);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        if (i10 == 25) {
            this.Y = true;
            com.taurusx.tax.w.s.c.z(this, this.f66638v.k(), com.taurusx.tax.w.s.w.f67529a, 0L, this.E, jSONObject, (c.a) null);
            return;
        }
        if (i10 == 50) {
            this.Z = true;
            com.taurusx.tax.w.s.c.z(this, this.f66638v.k(), com.taurusx.tax.w.s.w.f67534n, 0L, this.E, jSONObject, (c.a) null);
        } else if (i10 == 75) {
            this.f66606a0 = true;
            com.taurusx.tax.w.s.c.z(this, this.f66638v.k(), com.taurusx.tax.w.s.w.f67538t, 0L, this.E, jSONObject, (c.a) null);
        } else if (i10 == 100) {
            this.f66608b0 = true;
            com.taurusx.tax.w.s.c.z(this, this.f66638v.k(), com.taurusx.tax.w.s.w.f67532g, 0L, this.E, jSONObject, (c.a) null);
        }
    }

    public void w(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
        VastConfig vastConfig;
        if (!this.M && (vastConfig = this.f66627l) != null) {
            Set<VastCompanionAdConfig> vastCompanionAdConfigs = vastConfig.getVastCompanionAdConfigs();
            if (vastCompanionAdConfigs != null) {
                for (VastCompanionAdConfig vastCompanionAdConfig : vastCompanionAdConfigs) {
                    if (vastCompanionAdConfig != null) {
                        List<VastTracker> clickTrackers = vastCompanionAdConfig.getClickTrackers();
                        ArrayList arrayList = new ArrayList();
                        Iterator<VastTracker> it = clickTrackers.iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().getContent());
                        }
                        com.taurusx.tax.w.s.c.z(this, e.z(arrayList, zVar), "ad-companion-click");
                    }
                }
            }
            this.M = true;
        }
        z(zVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(String str) {
        if (this.f66627l != null) {
            HashSet hashSet = new HashSet();
            for (VastTracker vastTracker : this.f66627l.getErrorTrackers()) {
                if (!TextUtils.isEmpty(vastTracker.getContent())) {
                    hashSet.add(vastTracker.getContent());
                }
            }
            com.taurusx.tax.n.z.z((HashSet<String>) hashSet, str, VastManager.getVastNetworkMediaUrl(this.f66627l));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(int i10) {
        if (this.f66627l == null) {
            return;
        }
        com.taurusx.tax.n.y.z().z(i10, this.f66627l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(boolean z10) {
        TaxMediaView taxMediaView;
        if (this.f66640x == null || this.R) {
            return;
        }
        y.w.C0823w c0823w = this.F;
        if (c0823w != null && c0823w.E() == 1 && (taxMediaView = this.f66641y) != null) {
            if (!this.Y) {
                this.Y = true;
                z(25, taxMediaView.getVideoLength());
                z(25);
                com.taurusx.tax.s.z.y(this.I, this.G, this.f66613e);
            }
            if (!this.Z) {
                this.Z = true;
                z(50, this.f66641y.getVideoLength());
                z(50);
                com.taurusx.tax.s.z.c(this.I, this.G, this.f66613e);
            }
            if (!this.f66606a0) {
                this.f66606a0 = true;
                z(75, this.f66641y.getVideoLength());
                z(75);
                com.taurusx.tax.s.z.a(this.I, this.G, this.f66613e);
            }
            if (!this.f66608b0) {
                this.f66608b0 = true;
                z(100, this.f66641y.getVideoLength());
                z(100);
                com.taurusx.tax.s.z.w(this.I, this.G, this.f66613e);
                com.taurusx.tax.s.z.z(this.I, this.f66613e);
            }
        }
        com.taurusx.tax.w.s.s sVar = this.f66613e;
        if (sVar != null) {
            sVar.z(this.U, this.V, System.currentTimeMillis() - this.W, z10 ? 1 : 0, (JSONArray) null, false);
        }
        com.taurusx.tax.n.y.z().z(this.f66627l);
        this.f66640x.onAdClosed();
        this.R = true;
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar, View view) {
        VastConfig vastConfig = this.f66627l;
        if (vastConfig != null) {
            String clickThroughUrl = vastConfig.getClickThroughUrl();
            if (TextUtils.isEmpty(clickThroughUrl)) {
                return;
            }
            this.f66641y.z();
            com.taurusx.tax.w.a.c cVar = this.f66640x;
            if (cVar != null) {
                cVar.onAdClicked();
            }
            z(this, view, clickThroughUrl, this.f66625k);
            if (!(view instanceof TaxMediaView) && !(view instanceof LinearLayout) && !(view instanceof RelativeLayout)) {
                if (view instanceof ImageView) {
                    w(zVar, aVar);
                    y(zVar, aVar);
                    c(zVar, aVar);
                    return;
                }
                return;
            }
            z(zVar, aVar);
            y(zVar, aVar);
            c(zVar, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z(Context context, View view, String str, String str2) {
        String strA = this.f66638v.a();
        String strM = this.f66638v.m();
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
            a aVar = new a(view);
            if (!f0.z(context, null, str, aVar)) {
                if (str == null || !str.startsWith("http")) {
                    return false;
                }
                z(context, str, aVar);
            }
            return true;
        } catch (Throwable th2) {
            LogUtil.v(f66598m0, "onClickEvent:" + th2.getMessage());
            return false;
        }
    }

    private void z(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    private void z(Context context, String str, f0.z zVar) {
        Intent intent;
        if (l.z()) {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addCategory("android.intent.category.BROWSABLE");
        } else {
            intent = new Intent(context, (Class<?>) TaxWebViewActivity.class);
            intent.putExtra("url", str);
            String string = UUID.randomUUID().toString();
            com.taurusx.tax.g.n0.c.z().z(string, this.E);
            intent.putExtra(TaxWebViewActivity.f66910a, string);
            intent.putExtra(TaxWebViewActivity.f66911n, this.f66625k);
        }
        intent.setFlags(268435456);
        if (zVar != null) {
            zVar.z(context, intent);
        } else {
            context.startActivity(intent);
        }
    }

    private void z(com.taurusx.tax.w.s.s sVar, y.z zVar) {
        this.f66635s = new g0(this, zVar != null && zVar.y() == 7);
        y(sVar, zVar);
    }

    private void z() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 17;
        this.f66609c.addView(this.f66635s, layoutParams);
    }

    public void z(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
        if (this.L || this.f66638v == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        y.z zVar2 = this.f66638v;
        if (zVar2 != null) {
            arrayList.addAll(zVar2.s());
        }
        VastConfig vastConfig = this.f66627l;
        if (vastConfig != null) {
            Iterator<VastTracker> it = vastConfig.getClickTrackers().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getContent());
            }
        }
        com.taurusx.tax.w.s.c.z(this, e.z(arrayList, zVar), "ad-click");
        JSONObject jSONObjectZ = com.taurusx.tax.w.s.c.z(zVar);
        try {
            jSONObjectZ.put(CampaignEx.KEY_SHOW_TYPE, 1);
        } catch (Exception unused) {
        }
        com.taurusx.tax.w.s.c.z(this, this.f66638v.k(), com.taurusx.tax.w.s.w.f67535o, 0L, this.E, jSONObjectZ, (c.a) null);
        this.L = true;
        com.taurusx.tax.w.z.t().a().z(com.taurusx.tax.w.s.w.f67535o, this.f66625k);
    }
}
