package com.applovin.impl;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenImmersiveActivity;
import com.applovin.impl.adview.a;
import com.applovin.impl.adview.e;
import com.applovin.impl.d6;
import com.applovin.impl.h0;
import com.applovin.impl.o0;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.i;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class w1 implements AppLovinBroadcastManager.Receiver, a.b {
    protected int A;
    protected boolean B;
    private ContentObserver C;
    private Float D;
    protected AppLovinAdClickListener E;
    protected AppLovinAdDisplayListener F;
    protected AppLovinAdVideoPlaybackListener G;
    protected g7 H;
    protected g7 I;
    protected boolean J;
    private final h0 K;
    private boolean L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.b f11156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f11157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.o f11158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Activity f11159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f11160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f11161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.b f11162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i.a f11163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AppLovinAdView f11164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected com.applovin.impl.adview.k f11165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final com.applovin.impl.adview.g f11166k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final com.applovin.impl.adview.g f11167l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final long f11168m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f11169n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f11170o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f11171p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected long f11172q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected long f11173r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f11174s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f11175t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected int f11176u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected boolean f11177v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f11178w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ArrayList f11179x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected int f11180y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected int f11181z;

    class a implements AppLovinAdDisplayListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.o oVar = w1.this.f11158c;
            if (com.applovin.impl.sdk.o.a()) {
                w1.this.f11158c.a("AppLovinFullscreenActivity", "Web content rendered");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.o oVar = w1.this.f11158c;
            if (com.applovin.impl.sdk.o.a()) {
                w1.this.f11158c.a("AppLovinFullscreenActivity", "Closing from WebView");
            }
            w1.this.a("web_view");
        }
    }

    class b implements i.a {
        b() {
        }

        @Override // com.applovin.impl.sdk.i.a
        public void a(int i10) {
            w1 w1Var = w1.this;
            if (w1Var.A != com.applovin.impl.sdk.i.f10667h) {
                w1Var.B = true;
            }
            com.applovin.impl.adview.b bVarF = w1Var.f11164i.getController().f();
            if (bVarF == null) {
                com.applovin.impl.sdk.o oVar = w1.this.f11158c;
                if (com.applovin.impl.sdk.o.a()) {
                    w1.this.f11158c.k("AppLovinFullscreenActivity", "Unable to handle ringer mode change: no valid web view.");
                }
            } else if (com.applovin.impl.sdk.i.a(i10) && !com.applovin.impl.sdk.i.a(w1.this.A)) {
                bVarF.a("javascript:al_muteSwitchOn();");
            } else if (i10 == 2) {
                bVarF.a("javascript:al_muteSwitchOff();");
            }
            w1.this.A = i10;
        }
    }

    class c extends com.applovin.impl.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f11184a;

        c(com.applovin.impl.sdk.k kVar) {
            this.f11184a = kVar;
        }

        private boolean a(Activity activity) {
            return activity.getClass().getName().equals(n7.a(activity.getApplicationContext(), "AppLovinFullscreenActivity", this.f11184a));
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (!w1.this.z() && a(activity)) {
                w1.this.d();
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (w1.this.z() && a(activity)) {
                w1.this.d();
            }
        }
    }

    class d extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f11186a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Handler handler, com.applovin.impl.sdk.k kVar) {
            super(handler);
            this.f11186a = kVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            Float fB = this.f11186a.p().b();
            if (fB == null || w1.this.D == null || fB.equals(w1.this.D)) {
                return;
            }
            String str = fB.floatValue() > w1.this.D.floatValue() ? "volume_up" : "volume_down";
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putDouble(jSONObject, "volume", fB.floatValue());
            w1.this.e("javascript:al_onVolumeChangedEvent('" + str + "'," + jSONObject + ");");
            w1.this.D = fB;
        }
    }

    class e extends com.applovin.impl.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s4 f11188a;

        e(s4 s4Var) {
            this.f11188a = s4Var;
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (activity instanceof AppLovinFullscreenActivity) {
                this.f11188a.b(null);
                w1.this.f11157b.e().b(this);
            }
        }
    }

    public interface g {
        void a(w1 w1Var);

        void a(String str, Throwable th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    class h implements AppLovinAdClickListener, View.OnClickListener {
        private h() {
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.o oVar = w1.this.f11158c;
            if (com.applovin.impl.sdk.o.a()) {
                w1.this.f11158c.a("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            t2.a(w1.this.E, appLovinAd);
            w1.this.f11181z++;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w1 w1Var = w1.this;
            if (view != w1Var.f11166k || !((Boolean) w1Var.f11157b.a(x4.X1)).booleanValue()) {
                com.applovin.impl.sdk.o oVar = w1.this.f11158c;
                if (com.applovin.impl.sdk.o.a()) {
                    w1.this.f11158c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                    return;
                }
                return;
            }
            w1.f(w1.this);
            if (w1.this.f11156a.O0()) {
                w1.this.e("javascript:al_onCloseButtonTapped(" + w1.this.f11178w + StringUtils.COMMA + w1.this.f11180y + StringUtils.COMMA + w1.this.f11181z + ");");
            }
            List listF = w1.this.f11156a.F();
            com.applovin.impl.sdk.o oVar2 = w1.this.f11158c;
            if (com.applovin.impl.sdk.o.a()) {
                w1.this.f11158c.a("AppLovinFullscreenActivity", "Handling close button tap " + w1.this.f11178w + " with multi close delay: " + listF);
            }
            if (listF == null || listF.size() <= w1.this.f11178w) {
                w1.this.a("native_close_button");
                return;
            }
            w1.this.f11179x.add(Long.valueOf(SystemClock.elapsedRealtime() - w1.this.f11172q));
            List listD = w1.this.f11156a.D();
            if (listD != null && listD.size() > w1.this.f11178w) {
                w1 w1Var2 = w1.this;
                w1Var2.f11166k.a((e.a) listD.get(w1Var2.f11178w));
            }
            com.applovin.impl.sdk.o oVar3 = w1.this.f11158c;
            if (com.applovin.impl.sdk.o.a()) {
                w1.this.f11158c.a("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + listF.get(w1.this.f11178w));
            }
            w1.this.f11166k.setVisibility(8);
            w1 w1Var3 = w1.this;
            w1Var3.a(w1Var3.f11166k, ((Integer) listF.get(w1Var3.f11178w)).intValue(), new Runnable() { // from class: com.applovin.impl.gg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8950b.a();
                }
            });
        }

        /* synthetic */ h(w1 w1Var, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            w1.this.f11172q = SystemClock.elapsedRealtime();
        }
    }

    w1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f11161f = handler;
        this.f11168m = SystemClock.elapsedRealtime();
        this.f11169n = new AtomicBoolean();
        this.f11170o = new AtomicBoolean();
        this.f11172q = -1L;
        this.f11178w = 0;
        this.f11179x = new ArrayList();
        this.f11180y = 0;
        this.f11181z = 0;
        this.A = com.applovin.impl.sdk.i.f10667h;
        this.L = false;
        this.f11156a = bVar;
        this.f11157b = kVar;
        this.f11158c = kVar.O();
        this.f11159d = activity;
        this.f11160e = bVar.R();
        this.E = appLovinAdClickListener;
        this.F = appLovinAdDisplayListener;
        this.G = appLovinAdVideoPlaybackListener;
        this.K = new h0(kVar);
        h hVar = new h(this, null);
        if (((Boolean) kVar.a(x4.f11378n2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
        }
        if (((Boolean) kVar.a(x4.f11426t2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.al_onPoststitialShow_evaluation_error"));
        }
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_shown"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_hidden"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_failure"));
        u1 u1Var = new u1(kVar.y0(), AppLovinAdSize.INTERSTITIAL, activity);
        this.f11164i = u1Var;
        u1Var.setAdClickListener(hVar);
        this.f11164i.setAdDisplayListener(new a());
        bVar.h().putString("ad_view_address", e8.a(this.f11164i));
        this.f11164i.getController().a(this);
        c2 c2Var = new c2(map, kVar);
        if (c2Var.c()) {
            this.f11165j = new com.applovin.impl.adview.k(c2Var, activity);
        }
        kVar.k().trackImpression(bVar);
        List listF = bVar.F();
        if (bVar.r() >= 0 || listF != null) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.p(), activity);
            this.f11166k = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(hVar);
        } else {
            this.f11166k = null;
        }
        com.applovin.impl.adview.g gVar2 = new com.applovin.impl.adview.g(e.a.WHITE_ON_TRANSPARENT, activity);
        this.f11167l = gVar2;
        gVar2.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.wf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11241b.a(view);
            }
        });
        if (bVar.V0()) {
            this.f11163h = new b();
        } else {
            this.f11163h = null;
        }
        this.f11162g = new c(kVar);
        if (bVar.R0()) {
            this.D = kVar.p().b();
            this.C = new d(handler, kVar);
            activity.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI.buildUpon().appendPath("volume_music_speaker").build(), false, this.C);
        }
    }

    private void B() {
        if (this.f11163h != null) {
            this.f11157b.p().a(this.f11163h);
        }
        if (this.f11162g != null) {
            this.f11157b.e().a(this.f11162g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z() {
        return a() >= 0;
    }

    protected abstract void A();

    public abstract void a(ViewGroup viewGroup);

    public abstract void b(long j10);

    protected void l() {
        if (!this.f11171p && this.f11170o.compareAndSet(false, true)) {
            t2.b(this.F, this.f11156a);
            this.f11157b.H().b(this.f11156a);
            HashMap map = new HashMap();
            com.applovin.impl.sdk.ad.b bVar = this.f11156a;
            if (bVar != null) {
                CollectionUtils.putStringIfValid("source", bVar.v(), map);
                CollectionUtils.putStringIfValid("details", f2.b(this.f11156a), map);
            }
            this.f11157b.g().a(d2.G, this.f11156a, map);
        }
    }

    protected abstract void m();

    protected void n() {
        g7 g7Var = this.H;
        if (g7Var != null) {
            g7Var.d();
        }
    }

    protected void o() {
        g7 g7Var = this.H;
        if (g7Var != null) {
            g7Var.e();
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        switch (action) {
            case "com.applovin.al_onPoststitialShow_evaluation_error":
                e();
                break;
            case "com.applovin.custom_intent_launch_failure":
            case "com.applovin.custom_intent_launch_success":
                a(action, map);
                break;
            case "com.applovin.external_redirect_success":
            case "com.applovin.external_redirect_failure":
                c(action, map);
                break;
            case "com.applovin.custom_tabs_failure":
            case "com.applovin.custom_tabs_hidden":
            case "com.applovin.custom_tabs_shown":
                b(action, map);
                break;
            case "com.applovin.render_process_gone":
                if (!this.f11175t) {
                    f();
                    break;
                }
                break;
            case "com.applovin.preload_success":
            case "com.applovin.preload_failure":
                d(action, map);
                break;
        }
    }

    protected void p() {
        com.applovin.impl.adview.b bVarF;
        if (this.f11164i == null || !this.f11156a.t0() || (bVarF = this.f11164i.getController().f()) == null) {
            return;
        }
        this.K.a(bVarF, new f());
    }

    public void q() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f11158c.d("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.L) {
            a("back_button");
        }
        if (this.f11156a.O0()) {
            e("javascript:onBackPressed();");
        }
    }

    public void r() {
        AppLovinAdView appLovinAdView = this.f11164i;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.f11164i.destroy();
            this.f11164i = null;
            if ((parent instanceof ViewGroup) && i()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        m();
        l();
        this.E = null;
        this.F = null;
        this.G = null;
        this.f11159d = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public void s() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f11158c.d("AppLovinFullscreenActivity", "onPause()");
        }
        d("javascript:al_onAppPaused();");
        n();
    }

    public void t() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f11158c.d("AppLovinFullscreenActivity", "onResume()");
        }
        d("javascript:al_onAppResumed();");
        o();
    }

    public void u() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f11158c.d("AppLovinFullscreenActivity", "onStop()");
        }
    }

    public abstract void v();

    public abstract void w();

    protected void x() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f11158c.d("AppLovinFullscreenActivity", "Setting ad fully watched");
        }
        this.J = true;
    }

    public boolean y() {
        return this.f11171p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        com.applovin.impl.sdk.o.h("AppLovinFullscreenActivity", "Dismissing on-screen ad due to " + str);
        try {
            a(str);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("AppLovinFullscreenActivity", "Failed to dismiss ad.", th2);
            try {
                l();
            } catch (Throwable unused) {
            }
        }
    }

    static /* synthetic */ int f(w1 w1Var) {
        int i10 = w1Var.f11178w;
        w1Var.f11178w = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        if (this.f11156a.R() <= this.f11160e && !com.applovin.impl.d.d(this.f11159d)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f11158c.d("AppLovinFullscreenActivity", "Ad reshow timed out. Will attempt to bring existing ad activity to front.");
            }
            this.f11171p = false;
            long jC = this.f11156a.c();
            if (jC > 0) {
                a(jC).a(s4.f10400i, new s4.b() { // from class: com.applovin.impl.yf
                    @Override // com.applovin.impl.s4.b
                    public final void a(boolean z10, Object obj, Object obj2) {
                        this.f11570a.a(z10, (Void) obj, (Void) obj2);
                    }
                });
            } else {
                f("app_relaunch_reshow_timed_out");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        if (this.f11156a.z0().getAndSet(true)) {
            return;
        }
        this.f11157b.q0().a((i5) new m6(this.f11156a, this.f11157b), d6.b.OTHER);
    }

    protected boolean h() {
        return AppLovinAdType.INCENTIVIZED == this.f11156a.getType();
    }

    protected boolean i() {
        return this.f11159d instanceof AppLovinFullscreenActivity;
    }

    private void f(final String str) {
        if (this.f11170o.get()) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ag
            @Override // java.lang.Runnable
            public final void run() {
                this.f8382b.c(str);
            }
        });
    }

    public AppLovinAdView b() {
        return this.f11164i;
    }

    public void d(boolean z10) {
        this.f11171p = z10;
    }

    public void e(String str) {
        a(str, 0L);
    }

    public boolean g() {
        return this.f11174s;
    }

    class f implements h0.c {
        f() {
        }

        @Override // com.applovin.impl.h0.c
        public void a(int i10, int i11) {
            Map mapA = f2.a((AppLovinAdImpl) w1.this.f11156a);
            mapA.putAll(f2.a(w1.this.f11156a));
            mapA.put("details", "detection_count=" + i10 + ",total_checks=" + i11);
            w1.this.f11157b.D().d(d2.K0, mapA);
        }

        @Override // com.applovin.impl.h0.c
        public void a(int i10, int i11, int i12) {
            Map mapA = f2.a((AppLovinAdImpl) w1.this.f11156a);
            mapA.putAll(f2.a(w1.this.f11156a));
            mapA.put("details", "detections_to_report=" + i10 + ",detection_count=" + i11 + ",total_checks=" + i12);
            w1.this.f11157b.D().d(d2.L0, mapA);
            if (((Boolean) w1.this.f11157b.a(x4.f11414r6)).booleanValue()) {
                w1.this.x();
            }
            if (((Boolean) w1.this.f11157b.a(x4.P0)).booleanValue()) {
                w1.this.f11157b.G().c(w1.this.f11156a, com.applovin.impl.sdk.k.o());
            }
            if (((Boolean) w1.this.f11157b.a(x4.f11382n6)).booleanValue()) {
                w1.this.a("black_view_auto_dismiss");
                return;
            }
            w1 w1Var = w1.this;
            w1Var.L = ((Boolean) w1Var.f11157b.a(x4.f11390o6)).booleanValue();
            if (((Boolean) w1.this.f11157b.a(x4.f11398p6)).booleanValue()) {
                w1.this.A();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (z()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f11158c.d("AppLovinFullscreenActivity", "App relaunch detected with launcher activity. Will attempt to re-show the ad");
            }
            this.f11171p = true;
            long jF = this.f11156a.f();
            if (jF < 0) {
                return;
            }
            a(new Runnable() { // from class: com.applovin.impl.eg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8817b.j();
                }
            }, jF);
            return;
        }
        f("app_relaunch");
    }

    public void b(boolean z10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f11158c.d("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z10);
        }
        d("javascript:al_onWindowFocusChanged( " + z10 + " );");
        g7 g7Var = this.I;
        if (g7Var != null) {
            if (z10) {
                g7Var.e();
            } else {
                g7Var.d();
            }
        }
    }

    public void e() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f11158c.d("AppLovinFullscreenActivity", "Handling al_onPoststitialShow evaluation error");
        }
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, Map map, com.applovin.impl.sdk.k kVar, Activity activity, g gVar) {
        w1 z1Var;
        if (bVar instanceof o7) {
            try {
                z1Var = new z1(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th2) {
                gVar.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + kVar + " and throwable: " + th2.getMessage(), th2);
                return;
            }
        } else if (bVar.hasVideoUrl()) {
            try {
                z1Var = new a2(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th3) {
                gVar.a("Failed to create FullscreenVideoAdPresenter with sdk: " + kVar + " and throwable: " + th3.getMessage(), th3);
                return;
            }
        } else {
            try {
                z1Var = new x1(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th4) {
                gVar.a("Failed to create FullscreenGraphicAdPresenter with sdk: " + kVar + " and throwable: " + th4.getMessage(), th4);
                return;
            }
        }
        z1Var.B();
        gVar.a(z1Var);
    }

    public void f() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f11158c.d("AppLovinFullscreenActivity", "Handling render process crash");
        }
        this.f11175t = true;
    }

    protected void c(boolean z10) {
        a(z10, ((Long) this.f11157b.a(x4.f11370m2)).longValue());
        if (!this.f11156a.s0()) {
            t2.a(this.F, this.f11156a);
        }
        this.f11157b.H().a(this.f11156a);
        if (!this.f11156a.s0() && (this.f11156a.hasVideoUrl() || h())) {
            t2.a(this.G, this.f11156a);
        }
        new n4(this.f11159d).a(this.f11156a);
        this.f11156a.setHasShown(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        com.applovin.impl.adview.b bVarF;
        AppLovinAdView appLovinAdView = this.f11164i;
        if (appLovinAdView == null || (bVarF = appLovinAdView.getController().f()) == null) {
            return;
        }
        bVarF.a(str);
    }

    protected void d(String str) {
        if (this.f11156a.v0()) {
            a(str, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(final com.applovin.impl.adview.g gVar, final Runnable runnable) {
        e8.a(gVar, 400L, new Runnable() { // from class: com.applovin.impl.cg
            @Override // java.lang.Runnable
            public final void run() {
                w1.a(gVar, runnable);
            }
        });
    }

    private void d(String str, Map map) {
        e(o8.d(str, map));
    }

    private void b(String str, Map map) {
        e(o8.b(str, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a("backup_close_button");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(final com.applovin.impl.adview.g gVar, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.zf
            @Override // java.lang.Runnable
            public final void run() {
                w1.b(gVar, runnable);
            }
        });
    }

    public long a() {
        com.applovin.impl.sdk.ad.b bVar = this.f11156a;
        if (bVar == null) {
            return -1L;
        }
        return bVar.g();
    }

    protected int c() {
        int iT = this.f11156a.t();
        return (iT <= 0 && ((Boolean) this.f11157b.a(x4.f11361l2)).booleanValue()) ? this.f11176u + 1 : iT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, Void r22, Void r32) {
        if (z10) {
            return;
        }
        f("app_relaunch_bring_to_front_failed");
    }

    private s4 a(long j10) {
        final s4 s4Var = new s4("bringAdActivityToFront");
        final e eVar = new e(s4Var);
        this.f11157b.e().a(eVar);
        Intent intent = new Intent(this.f11159d, (Class<?>) (this.f11156a.L0() ? AppLovinFullscreenImmersiveActivity.class : AppLovinFullscreenActivity.class));
        intent.setFlags(131072);
        this.f11159d.startActivity(intent);
        a(new Runnable() { // from class: com.applovin.impl.xf
            @Override // java.lang.Runnable
            public final void run() {
                this.f11496b.a(eVar, s4Var);
            }
        }, j10);
        return s4Var;
    }

    protected void c(long j10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f11158c.a("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j10) + " seconds...");
        }
        this.H = g7.a(j10, this.f11157b, new Runnable() { // from class: com.applovin.impl.bg
            @Override // java.lang.Runnable
            public final void run() {
                this.f8471b.k();
            }
        });
    }

    private void c(String str, Map map) {
        e(o8.c(str, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.b bVar, s4 s4Var) {
        this.f11157b.e().b(bVar);
        if (s4Var.d()) {
            return;
        }
        s4Var.a((Object) null);
    }

    protected boolean a(boolean z10) {
        List listA = n7.a(z10, this.f11156a, this.f11157b, this.f11159d);
        if (listA.isEmpty()) {
            return false;
        }
        if (((Boolean) this.f11157b.a(x4.W0)).booleanValue() && !n7.a(listA, this.f11156a)) {
            a(listA, (com.applovin.impl.sdk.ad.a) this.f11156a);
            return false;
        }
        String str = "Missing ad resources: " + listA;
        Map mapA = f2.a((AppLovinAdImpl) this.f11156a);
        if (((Boolean) this.f11157b.a(x4.T5)).booleanValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f11158c.b("AppLovinFullscreenActivity", "Dismissing ad due to missing resources: " + listA);
            }
            if (((Boolean) this.f11157b.a(x4.W5)).booleanValue()) {
                AppLovinAdDisplayListener appLovinAdDisplayListener = this.F;
                if (appLovinAdDisplayListener instanceof l2) {
                    t2.a(appLovinAdDisplayListener, "Missing ad resources");
                }
            } else {
                n2.a(this.f11156a, this.F, "Missing ad resources", (Throwable) null, (AppLovinFullscreenActivity) null);
            }
            a("missing_ad_resources");
            a(str, "Failing ad display", mapA);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "missingCachedAdResources");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            this.f11157b.g().a(d2.F, this.f11156a, mapHashMap);
            return ((Boolean) this.f11157b.a(x4.V5)).booleanValue();
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f11158c.b("AppLovinFullscreenActivity", "Streaming ad due to missing ad resources: " + listA);
        }
        this.f11156a.E0();
        a(str, "Streaming ad", mapA);
        return false;
    }

    private void a(List list, com.applovin.impl.sdk.ad.a aVar) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f11158c.a("AppLovinFullscreenActivity", "Restoring original URLs for missing non-required cached resources: " + list);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        aVar.a(list);
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        CollectionUtils.putStringIfValid("details", list.toString(), mapHashMap);
        this.f11157b.g().a(d2.K, aVar, mapHashMap);
    }

    public void a(o0.a aVar, o0.a aVar2, o0.a aVar3) {
        if (((Boolean) this.f11157b.a(x4.E4)).booleanValue()) {
            HashMap map = new HashMap();
            map.put("orientation", n7.b(this.f11159d));
            if (aVar != null) {
                map.put("display_cutout_insets", aVar.e());
            }
            if (aVar2 != null) {
                map.put("status_bar_insets", aVar2.e());
            }
            if (aVar3 != null) {
                map.put("nav_bar_insets", aVar3.e());
            }
            e(o8.a(map));
        }
    }

    public void a(String str) {
        this.f11174s = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f11168m;
        if (com.applovin.impl.sdk.o.a()) {
            this.f11158c.d("AppLovinFullscreenActivity", "Dismissing ad after " + TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime) + " seconds from source: " + str);
        }
        com.applovin.impl.sdk.ad.b bVar = this.f11156a;
        if (bVar != null) {
            bVar.getAdEventTracker().f();
        }
        this.f11161f.removeCallbacksAndMessages(null);
        a("javascript:al_onPoststitialDismiss();", this.f11156a != null ? r0.w() : 0L);
        if (((Boolean) this.f11157b.a(x4.P6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar2 = this.f11156a;
            if (bVar2 != null) {
                bVar2.a(str);
            }
            m();
        }
        l();
        this.K.b();
        if (this.f11163h != null) {
            this.f11157b.p().b(this.f11163h);
        }
        if (this.f11162g != null) {
            this.f11157b.e().b(this.f11162g);
        }
        if (this.C != null) {
            this.f11159d.getContentResolver().unregisterContentObserver(this.C);
            this.C = null;
        }
        if (i()) {
            this.f11159d.finish();
            return;
        }
        this.f11157b.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f11157b.O().a("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        r();
    }

    public void a(Configuration configuration) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f11158c.d("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    public void a(int i10, KeyEvent keyEvent) {
        if (this.f11158c == null || !com.applovin.impl.sdk.o.a()) {
            return;
        }
        this.f11158c.d("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i10 + ", " + keyEvent);
    }

    protected void a(final String str, long j10) {
        if (j10 < 0 || !com.applovin.impl.sdk.utils.StringUtils.isValidString(str)) {
            return;
        }
        a(new Runnable() { // from class: com.applovin.impl.fg
            @Override // java.lang.Runnable
            public final void run() {
                this.f8884b.b(str);
            }
        }, j10);
    }

    protected void a(final com.applovin.impl.adview.g gVar, long j10, final Runnable runnable) {
        if (j10 >= ((Long) this.f11157b.a(x4.W1)).longValue()) {
            return;
        }
        this.I = g7.a(TimeUnit.SECONDS.toMillis(j10), this.f11157b, new Runnable() { // from class: com.applovin.impl.dg
            @Override // java.lang.Runnable
            public final void run() {
                w1.c(gVar, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.adview.g gVar, Runnable runnable) {
        gVar.bringToFront();
        runnable.run();
    }

    protected void a(int i10, boolean z10, boolean z11, long j10) {
        if (!this.f11171p && this.f11169n.compareAndSet(false, true)) {
            if (this.f11156a.hasVideoUrl() || h()) {
                t2.a(this.G, this.f11156a, i10, z11);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f11168m;
            this.f11157b.k().trackVideoEnd(this.f11156a, TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime), i10, z10);
            long jElapsedRealtime2 = this.f11172q != -1 ? SystemClock.elapsedRealtime() - this.f11172q : -1L;
            this.f11157b.k().trackFullScreenAdClosed(this.f11156a, jElapsedRealtime2, this.f11179x, j10, this.B, this.A);
            if (com.applovin.impl.sdk.o.a()) {
                this.f11158c.a("AppLovinFullscreenActivity", "Video ad ended at percent: " + i10 + "%, elapsedTime: " + jElapsedRealtime + "ms, skipTimeMillis: " + j10 + "ms, closeTimeMillis: " + jElapsedRealtime2 + "ms");
            }
        }
    }

    private void a(String str, String str2, Map map) {
        HashMap map2 = new HashMap(map);
        CollectionUtils.putStringIfValid("error_message", str, map2);
        CollectionUtils.putStringIfValid("details", str2, map2);
        this.f11157b.D().a(d2.M0, "missingCachedAdResources", map2);
    }

    @Override // com.applovin.impl.adview.a.b
    public void a(com.applovin.impl.adview.a aVar) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f11158c.a("AppLovinFullscreenActivity", "Fully watched from ad web view...");
        }
        this.J = true;
    }

    protected void a(boolean z10, long j10) {
        if (this.f11156a.H0()) {
            a(z10 ? "javascript:al_mute();" : "javascript:al_unmute();", j10);
        }
    }

    private void a(String str, Map map) {
        e(o8.a(str, map));
    }

    protected void a(Runnable runnable, long j10) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j10, this.f11161f);
    }
}
