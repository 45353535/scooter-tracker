package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.core.net.MailTo;
import androidx.webkit.internal.AssetHelper;
import com.applovin.creative.MaxCreativeDebuggerActivity;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.d;
import com.applovin.impl.m1;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class e1 implements m1.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static WeakReference f8704m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final AtomicBoolean f8705n = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f8707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f8708c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d1 f8710e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private m1 f8712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private g7 f8713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8714i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f8715j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f8716k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f8717l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f8709d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference f8711f = new WeakReference(null);

    class a extends LinkedHashMap {
        a(int i10) {
            super(i10);
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            return size() > 10;
        }
    }

    class b extends com.applovin.impl.b {
        b() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Started Creative Debugger");
                if (!e1.this.h() || e1.f8704m.get() != activity) {
                    MaxCreativeDebuggerActivity maxCreativeDebuggerActivity = (MaxCreativeDebuggerActivity) activity;
                    WeakReference unused = e1.f8704m = new WeakReference(maxCreativeDebuggerActivity);
                    maxCreativeDebuggerActivity.a(e1.this.f8710e, e1.this.f8706a.e());
                }
                e1.f8705n.set(false);
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Creative Debugger destroyed");
                WeakReference unused = e1.f8704m = null;
            }
        }
    }

    class c implements d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f8720a;

        c(Object obj) {
            this.f8720a = obj;
        }

        @Override // com.applovin.impl.d.b
        public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
            maxCreativeDebuggerDisplayedAdActivity.a(new q1(this.f8720a, e1.this.f8706a.H().b()), e1.this.f8706a);
            e1.f8705n.set(false);
        }
    }

    public e1(com.applovin.impl.sdk.k kVar) {
        this.f8706a = kVar;
        Context contextO = com.applovin.impl.sdk.k.o();
        this.f8707b = contextO;
        this.f8708c = new a(10);
        this.f8710e = new d1(contextO);
    }

    private void m() {
        this.f8706a.e().a(new b());
    }

    public void k() {
        m1 m1Var = this.f8712g;
        if (m1Var != null) {
            m1Var.b();
        }
    }

    public void l() {
        if (g()) {
            this.f8715j = ((Boolean) this.f8706a.a(x4.f11360l1)).booleanValue();
            if (this.f8712g == null) {
                this.f8712g = new m1(this.f8706a, this);
            }
            this.f8712g.a();
        }
    }

    public void n() {
        ArrayList arrayList;
        if (h() || !f8705n.compareAndSet(false, true)) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Creative Debugger is already showing");
            return;
        }
        Object objA = this.f8706a.H().a();
        if (objA != null) {
            e(objA);
            return;
        }
        synchronized (this.f8709d) {
            arrayList = new ArrayList(this.f8708c.values());
        }
        Collections.reverse(arrayList);
        this.f8710e.a(arrayList, this.f8706a);
        if (!this.f8717l) {
            m();
            this.f8717l = true;
        }
        com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting Creative Debugger...");
        d.a(this.f8707b, MaxCreativeDebuggerActivity.class);
    }

    private void e(Object obj) {
        com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting Creative Debugger for current fullscreen ad...");
        d.a(this.f8707b, MaxCreativeDebuggerDisplayedAdActivity.class, this.f8706a.e(), new c(obj));
    }

    private Drawable f() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 170));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        WeakReference weakReference = f8704m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.f8716k);
        if (this.f8716k == 0 || seconds < 10) {
            return;
        }
        this.f8706a.D().a(d2.f8565d, "showingMediationDebuggerFromHoldingCreativeDebuggerButton");
        this.f8706a.W0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.f8714i = 0;
    }

    @Override // com.applovin.impl.m1.a
    public void b() {
        if (this.f8714i == 0) {
            this.f8713h = g7.a(TimeUnit.SECONDS.toMillis(3L), this.f8706a, new Runnable() { // from class: com.applovin.impl.s9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10424b.j();
                }
            });
        }
        int i10 = this.f8714i;
        if (i10 % 2 == 0) {
            this.f8714i = i10 + 1;
        }
    }

    public boolean g() {
        return ((Boolean) this.f8706a.a(x4.f11351k1)).booleanValue() && this.f8706a.n0().isCreativeDebuggerEnabled();
    }

    private boolean c(Object obj) {
        MaxAdFormat format;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            format = ((com.applovin.impl.sdk.ad.b) obj).getAdZone().d();
        } else {
            format = obj instanceof y2 ? ((y2) obj).getFormat() : null;
        }
        return format != null && format.isFullscreenAd();
    }

    @Override // com.applovin.impl.m1.a
    public void a() {
        int i10 = this.f8714i;
        if (i10 % 2 == 1) {
            this.f8714i = i10 + 1;
        }
        if (this.f8714i / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.v9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11143b.e();
                }
            });
            this.f8714i = 0;
            this.f8713h.a();
        }
    }

    public void d(Object obj) {
        if (g() && obj != null) {
            if (!w3.a(obj) || c(obj)) {
                String strB = b(obj);
                synchronized (this.f8709d) {
                    try {
                        q1 q1Var = (q1) this.f8708c.get(strB);
                        if (q1Var != null) {
                            q1Var.a(obj);
                        } else {
                            this.f8708c.put(strB, new q1(obj, System.currentTimeMillis()));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (g() && this.f8711f.get() == null && !h()) {
            Activity activityB = this.f8706a.e().b();
            if (activityB == null) {
                this.f8706a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8706a.O().b("AppLovinSdk", "Failed to display Creative Debugger button");
                }
            } else {
                View viewFindViewById = activityB.findViewById(R.id.content);
                if (viewFindViewById instanceof FrameLayout) {
                    final FrameLayout frameLayout = (FrameLayout) viewFindViewById;
                    final View viewA = a(frameLayout, activityB);
                    frameLayout.addView(viewA);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(150L);
                    viewA.startAnimation(alphaAnimation);
                    final ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
                    final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.applovin.impl.t9
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            this.f11022b.a(viewA, frameLayout);
                        }
                    };
                    viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.u9
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f11080b.a(viewA, frameLayout, viewTreeObserver, onGlobalLayoutListener);
                        }
                    }, TimeUnit.SECONDS.toMillis(5L));
                    this.f8711f = new WeakReference(viewA);
                }
            }
        }
    }

    private void b(View view, FrameLayout frameLayout) {
        if (this.f8715j) {
            view.setOnTouchListener(null);
            this.f8716k = 0L;
        }
        frameLayout.removeView(view);
        this.f8711f = new WeakReference(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout) {
        if (view.getParent() != null || this.f8711f.get() == null) {
            return;
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view, FrameLayout frameLayout, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (this.f8716k > 0 && this.f8715j) {
            view.setVisibility(4);
        } else {
            b(view, frameLayout);
        }
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public String b(q1 q1Var) {
        com.applovin.impl.sdk.ad.b bVarC = q1Var.c();
        y2 y2VarE = q1Var.e();
        if (bVarC == null) {
            if (y2VarE != null) {
                return y2VarE.D();
            }
            return null;
        }
        return "json_v3!" + Base64.encodeToString(bVarC.getOriginalFullResponse().toString().getBytes(), 2);
    }

    private View a(final FrameLayout frameLayout, Activity activity) {
        View view;
        int iDpToPx = AppLovinSdkUtils.dpToPx(activity, 40);
        int i10 = iDpToPx / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPx, iDpToPx, 8388629);
        layoutParams.setMargins(i10, i10, i10, i10);
        try {
            ImageButton imageButton = new ImageButton(activity);
            imageButton.setImageDrawable(activity.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_white_small));
            imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageButton.setPadding(i10, i10, i10, i10 * 2);
            view = imageButton;
        } catch (Throwable unused) {
            Button button = new Button(activity);
            button.setText("ⓘ");
            button.setTextColor(-1);
            button.setAllCaps(false);
            button.setTextSize(2, 20.0f);
            button.setPadding(0, 0, 0, 0);
            view = button;
        }
        view.setLayoutParams(layoutParams);
        view.setBackground(f());
        if (this.f8715j) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: com.applovin.impl.w9
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return this.f11232b.a(frameLayout, view2, motionEvent);
                }
            });
        } else {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.x9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f11485b.a(view2);
                }
            });
        }
        if (o0.d()) {
            view.setElevation(AppLovinSdkUtils.dpToPx(activity, 5));
        }
        return view;
    }

    private String b(Object obj) {
        String strQ;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            strQ = ((com.applovin.impl.sdk.ad.b) obj).getMediationServeId();
        } else {
            strQ = obj instanceof y2 ? ((y2) obj).Q() : null;
        }
        return StringUtils.isValidString(strQ) ? strQ : UUID.randomUUID().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(FrameLayout frameLayout, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f8716k = SystemClock.elapsedRealtime();
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.y9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11562b.i();
                }
            }, TimeUnit.SECONDS.toMillis(10L));
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (view.getVisibility() == 0) {
                this.f8716k = 0L;
                n();
            } else {
                b(view, frameLayout);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.Serializable, java.lang.Object[]] */
    public void a(q1 q1Var, Context context, boolean z10) {
        String strA = a(q1Var);
        v2 v2Var = new v2();
        if (z10) {
            v2Var.b("Please describe the issue you had with this ad:\n\n\n\n");
        }
        v2Var.b(strA);
        String strB = b(q1Var);
        if (strB != null) {
            v2Var.a("\nBid Response:\n");
            v2Var.a(strB);
        }
        String str = q1Var.c() != null ? "AppLovin Ad Report" : "MAX Ad Report";
        Intent intentCreateChooser = Intent.createChooser(new Intent("android.intent.action.SEND").setType(AssetHelper.DEFAULT_MIME_TYPE).putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", v2Var.toString()).setPackage(null), "Share Ad Report");
        if (z10) {
            try {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(MailTo.MAILTO_SCHEME)).putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", v2Var.toString()).setPackage("com.google.android.gm");
                String str2 = this.f8706a.n0().getExtraParameters().get("creative_debugger_email_recipients");
                if (StringUtils.isValidString(str2)) {
                    intent.putExtra("android.intent.extra.EMAIL", (Serializable) CollectionUtils.explode(str2).toArray());
                }
                context.startActivity(intent);
                return;
            } catch (ActivityNotFoundException unused) {
                context.startActivity(intentCreateChooser);
                return;
            }
        }
        context.startActivity(intentCreateChooser);
    }

    public String a(q1 q1Var) {
        v2 v2Var = new v2();
        v2Var.b("Ad Info:\n");
        y2 y2VarE = q1Var.e();
        com.applovin.impl.sdk.ad.b bVarC = q1Var.c();
        if (y2VarE != null) {
            v2Var.a(y2VarE);
        } else if (bVarC != null) {
            v2Var.a("Network", "APPLOVIN").a(bVarC).b(bVarC);
        }
        v2Var.a(this.f8706a);
        v2Var.a("Epoch Timestamp (ms)", Long.valueOf(q1Var.b()));
        v2 v2Var2 = new v2();
        v2Var2.a("Platform", "fireos".equals(this.f8706a.A().A()) ? "Fire OS" : "Android").a("AppLovin SDK Version", AppLovinSdk.VERSION).a("Plugin Version", this.f8706a.a(x4.L3)).a("App Package Name", this.f8707b.getPackageName()).a("Device", String.format("%s %s (%s)", Build.BRAND, Build.MODEL, Build.DEVICE)).a("OS Version", Build.VERSION.RELEASE).a("AppLovin Random Token", this.f8706a.h0()).a("Ad Review Version", j.b()).a(a(q1Var.a())).a("User ID", this.f8706a.w0().e() != null ? this.f8706a.w0().e() : "None").a("MD", this.f8706a.a(x4.f11423t));
        v2Var.a("\nDebug Info:\n").a(u4.b(v2Var2.toString(), n7.a(this.f8706a), u4.a.V2, this.f8706a.i0(), this.f8706a));
        return v2Var.toString();
    }

    private Bundle a(Object obj) {
        this.f8706a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8706a.O().a("CreativeDebuggerService", "Retrieving Ad Review info for ad: " + obj);
        }
        String strA = n7.a(obj);
        Bundle bundleA = this.f8706a.j().a(strA);
        this.f8706a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8706a.O().a("CreativeDebuggerService", "Serve id: " + strA);
        }
        this.f8706a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8706a.O().a("CreativeDebuggerService", "Public data: " + bundleA);
        }
        if (bundleA == null) {
            return null;
        }
        for (String str : bundleA.keySet()) {
            Object obj2 = bundleA.get(str);
            bundleA.remove(str);
            BundleUtils.put(StringUtils.toHumanReadableString(str), obj2, bundleA);
        }
        return bundleA;
    }
}
