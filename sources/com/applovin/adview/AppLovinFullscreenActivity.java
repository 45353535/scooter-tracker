package com.applovin.adview;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
import android.webkit.WebView;
import android.window.OnBackInvokedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.d;
import com.applovin.impl.d2;
import com.applovin.impl.e;
import com.applovin.impl.e8;
import com.applovin.impl.f2;
import com.applovin.impl.g;
import com.applovin.impl.g0;
import com.applovin.impl.n1;
import com.applovin.impl.n2;
import com.applovin.impl.n7;
import com.applovin.impl.o0;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w1;
import com.applovin.impl.x4;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.C4240b4;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class AppLovinFullscreenActivity extends Activity implements n1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Set f8147h = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f8148i = new Object();

    @SuppressLint({"StaticFieldLeak"})
    public static n2 parentInterstitialWrapper;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f8149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w1 f8150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f8151c = new AtomicBoolean(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.applovin.impl.adview.activity.a f8152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f8153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g0 f8154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f8155g;

    class a implements View.OnApplyWindowInsetsListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Boolean f8156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f8157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.ad.b f8158c;

        a(Boolean bool, boolean z10, com.applovin.impl.sdk.ad.b bVar) {
            this.f8156a = bool;
            this.f8157b = z10;
            this.f8158c = bVar;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            if (this.f8156a.booleanValue()) {
                AppLovinFullscreenActivity.this.a(windowInsets);
            }
            if (!this.f8157b) {
                Insets insets = windowInsets.getInsets(((Integer) AppLovinFullscreenActivity.this.f8149a.a(x4.f11434u2)).intValue());
                view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
                return windowInsets;
            }
            int iIntValue = ((Integer) AppLovinFullscreenActivity.this.f8149a.a(x4.f11434u2)).intValue();
            Insets insets2 = windowInsets.getInsets(this.f8158c.F0() ? iIntValue & (~WindowInsets.Type.displayCutout()) : iIntValue | WindowInsets.Type.displayCutout());
            view.setPadding(insets2.left, insets2.top, insets2.right, insets2.bottom);
            return windowInsets;
        }
    }

    private static class c implements OnBackInvokedCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f8161a;

        protected c(Runnable runnable) {
            this.f8161a = runnable;
        }

        public void onBackInvoked() {
            this.f8161a.run();
        }
    }

    @Override // com.applovin.impl.n1
    public void dismiss(String str) {
        if (o0.j() && this.f8153e != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f8153e);
            this.f8153e = null;
        }
        w1 w1Var = this.f8150b;
        if (w1Var != null) {
            w1Var.a(str);
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w1 w1Var = this.f8150b;
        if (w1Var != null) {
            w1Var.a(configuration);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            o.j("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
            dismiss("activity_destroyed_while_in_background");
            return;
        }
        try {
            requestWindowFeature(1);
        } catch (Throwable th2) {
            o.c("AppLovinFullscreenActivity", "Failed to request window feature", th2);
        }
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        View viewFindViewById = findViewById(R.id.content);
        viewFindViewById.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        if (TextUtils.isEmpty(getIntent().getStringExtra("com.applovin.interstitial.sdk_key"))) {
            n2 n2Var = parentInterstitialWrapper;
            if (n2Var != null && n2Var.f() != null) {
                n2.a(parentInterstitialWrapper.f(), parentInterstitialWrapper.c(), "Empty SDK key", (Throwable) null, this);
            }
            finish();
            return;
        }
        this.f8149a = AppLovinSdk.getInstance(this).a();
        n2 n2Var2 = parentInterstitialWrapper;
        com.applovin.impl.sdk.ad.b bVarF = n2Var2 != null ? n2Var2.f() : null;
        Boolean bool = (Boolean) this.f8149a.a(x4.E4);
        boolean z10 = bVarF != null && bVarF.L0();
        if (o0.b() && (bool.booleanValue() || z10)) {
            getWindow().setDecorFitsSystemWindows(false);
            viewFindViewById.setOnApplyWindowInsetsListener(new a(bool, z10, bVarF));
            a(bVarF);
        } else {
            viewFindViewById.setFitsSystemWindows(true);
            if (o0.b()) {
                e8.a(viewFindViewById, this.f8149a);
            }
            a(bVarF);
        }
        if (bVarF != null && bVarF.r0()) {
            g.a(bVarF, this, this.f8149a);
        }
        if (o0.j() && ((Boolean) this.f8149a.a(x4.f11320g6)).booleanValue()) {
            this.f8153e = new c(new Runnable() { // from class: com.applovin.adview.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8167b.c();
                }
            });
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f8153e);
        }
        a();
        b();
        Integer num = (Integer) this.f8149a.a(x4.H6);
        if (num.intValue() > 0) {
            synchronized (f8148i) {
                Set set = f8147h;
                set.add(this);
                n7.a("AppLovinFullscreenActivity", set.size(), num.intValue(), this.f8149a.D());
            }
        }
        n2 n2Var3 = parentInterstitialWrapper;
        if (n2Var3 != null) {
            w1.a(n2Var3.f(), parentInterstitialWrapper.b(), parentInterstitialWrapper.c(), parentInterstitialWrapper.d(), parentInterstitialWrapper.h(), this.f8149a, this, new b());
            return;
        }
        Intent intent = new Intent(this, (Class<?>) FullscreenAdService.class);
        com.applovin.impl.adview.activity.a aVar = new com.applovin.impl.adview.activity.a(this, this.f8149a);
        this.f8152d = aVar;
        bindService(intent, aVar, 1);
        if (o0.h()) {
            String str = this.f8149a.n0().getExtraParameters().get("disable_set_data_dir_suffix");
            if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
                return;
            }
            try {
                WebView.setDataDirectorySuffix(String.valueOf(Process.myPid()));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        k kVar = this.f8149a;
        if (kVar != null && ((Boolean) kVar.a(x4.f11458x2)).booleanValue()) {
            this.f8149a.p0().b(z4.N);
            this.f8149a.p0().b(z4.P);
            this.f8149a.p0().b(z4.Q);
        }
        if (this.f8154f != null) {
            this.f8149a.p0().b(z4.O);
            this.f8154f.a();
            this.f8154f = null;
        }
        com.applovin.impl.adview.activity.a aVar = this.f8152d;
        if (aVar != null) {
            try {
                unbindService(aVar);
            } catch (Throwable unused) {
            }
        }
        w1 w1Var = this.f8150b;
        if (w1Var != null) {
            if (w1Var.g()) {
                this.f8150b.r();
            } else {
                long jA = this.f8150b.a();
                if (jA >= 0) {
                    if (jA == 0) {
                        this.f8150b.d(true);
                    }
                    final n2 n2Var = parentInterstitialWrapper;
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.adview.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f8170b.a(n2Var);
                        }
                    }, jA);
                } else {
                    a(this.f8150b, false, false);
                }
            }
        }
        parentInterstitialWrapper = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        w1 w1Var = this.f8150b;
        if (w1Var != null) {
            w1Var.a(i10, keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        w1 w1Var = this.f8150b;
        if (w1Var != null) {
            w1Var.s();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        w1 w1Var;
        try {
            super.onResume();
            if (this.f8151c.get() || (w1Var = this.f8150b) == null) {
                return;
            }
            w1Var.t();
        } catch (IllegalArgumentException e10) {
            this.f8149a.O();
            if (o.a()) {
                this.f8149a.O().a("AppLovinFullscreenActivity", "Error was encountered in onResume().", e10);
            }
            this.f8149a.D().a("AppLovinFullscreenActivity", C4240b4.i.f42655u0, e10);
            dismiss("activity_on_resume_error");
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        w1 w1Var = this.f8150b;
        if (w1Var != null) {
            w1Var.u();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        if (this.f8150b != null) {
            if (!this.f8151c.getAndSet(false)) {
                this.f8150b.b(z10);
            }
            if (z10) {
                n2 n2Var = parentInterstitialWrapper;
                a(n2Var != null ? n2Var.f() : null);
            }
        }
        super.onWindowFocusChanged(z10);
    }

    public void setPresenter(@Nullable w1 w1Var) {
        this.f8150b = w1Var;
    }

    class b implements w1.g {
        b() {
        }

        @Override // com.applovin.impl.w1.g
        public void a(w1 w1Var) {
            AppLovinFullscreenActivity.this.f8150b = w1Var;
            w1Var.w();
        }

        @Override // com.applovin.impl.w1.g
        public void a(String str, Throwable th2) {
            com.applovin.impl.sdk.ad.b bVarF = AppLovinFullscreenActivity.parentInterstitialWrapper.f();
            n2.a(bVarF, AppLovinFullscreenActivity.parentInterstitialWrapper.c(), str, th2, AppLovinFullscreenActivity.this);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "createAppLovinFullscreenActivity");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            CollectionUtils.putStringIfValid("top_main_method", th2.toString(), mapHashMap);
            AppLovinFullscreenActivity.this.f8149a.g().a(d2.F, bVarF, mapHashMap);
        }
    }

    private void b() {
        k kVar = this.f8149a;
        if (kVar == null || !((Boolean) kVar.a(x4.f11466y2)).booleanValue()) {
            return;
        }
        final Long l10 = (Long) this.f8149a.a(x4.f11474z2);
        this.f8154f = g0.a(l10.longValue(), true, this.f8149a, new Runnable() { // from class: com.applovin.adview.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f8168b.a(l10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        w1 w1Var = this.f8150b;
        if (w1Var != null) {
            w1Var.q();
        }
        if (n7.g(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WindowInsets windowInsets) {
        o0.a aVarA = o0.a(windowInsets, this.f8149a);
        o0.a aVarC = o0.c(windowInsets, this.f8149a);
        o0.a aVarB = o0.b(windowInsets, this.f8149a);
        String strB = n7.b(this);
        o0.a(aVarA, strB);
        o0.c(aVarC, strB);
        o0.b(aVarB, strB);
        w1 w1Var = this.f8150b;
        if (w1Var != null) {
            w1Var.a(aVarA, aVarC, aVarB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(n2 n2Var) {
        boolean zY = this.f8150b.y();
        boolean zI = (n2Var == null || !zY) ? false : n2Var.i();
        if (!zI) {
            this.f8150b.d(false);
        }
        a(this.f8150b, zY, zI);
    }

    private void a(w1 w1Var, boolean z10, boolean z11) {
        w1Var.a("activity_destroyed_by_app_relaunch");
        if (this.f8149a != null) {
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "onDestroyAppLovinFullScreenActivity");
            n2 n2Var = parentInterstitialWrapper;
            com.applovin.impl.sdk.ad.b bVarF = n2Var != null ? n2Var.f() : null;
            mapHashMap.putAll(f2.a((AppLovinAdImpl) bVarF));
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putBoolean(jSONObject, "reshow_attempted", z10);
            JsonUtils.putBoolean(jSONObject, "reshow_success", z11);
            if (bVarF != null) {
                JsonUtils.putInt(jSONObject, "reshow_count", bVarF.R());
            }
            mapHashMap.put("details", jSONObject.toString());
            this.f8149a.D().d(d2.C0, mapHashMap);
        }
        w1Var.r();
    }

    private void a() {
        n2 n2Var;
        k kVar = this.f8149a;
        if (kVar == null || !((Boolean) kVar.a(x4.f11458x2)).booleanValue() || (n2Var = parentInterstitialWrapper) == null || n2Var.f() == null) {
            return;
        }
        com.applovin.impl.sdk.ad.b bVarF = parentInterstitialWrapper.f();
        List listJ = bVarF.j();
        if (CollectionUtils.isEmpty(listJ)) {
            return;
        }
        e eVar = (e) listJ.get(0);
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_url", eVar.c());
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_backup_url", eVar.a());
        this.f8149a.p0().b(z4.P, jSONObject.toString());
        this.f8149a.p0().b(z4.N, Long.valueOf(System.currentTimeMillis()));
        this.f8149a.p0().b(z4.Q, CollectionUtils.toJsonString(f2.a((AppLovinAdImpl) bVarF), JsonUtils.EMPTY_JSON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10) {
        this.f8155g += l10.longValue();
        this.f8149a.p0().b(z4.O, Long.valueOf(this.f8155g));
    }

    private void a(com.applovin.impl.sdk.ad.b bVar) {
        if (o0.b() && bVar != null && bVar.L0()) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
            if (bVar.U0() && bVar.S0()) {
                d.c(this);
                return;
            } else if (bVar.U0()) {
                d.b((Activity) this);
                return;
            } else {
                if (bVar.S0()) {
                    d.a((Activity) this);
                    return;
                }
                return;
            }
        }
        getWindow().setFlags(1024, 1024);
        d.c(this);
    }
}
