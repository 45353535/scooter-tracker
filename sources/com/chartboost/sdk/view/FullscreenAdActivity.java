package com.chartboost.sdk.view;

import android.R;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.chartboost.sdk.view.FullscreenAdActivity;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4240b4;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import f1.eg;
import f1.g6;
import f1.h0;
import f1.l8;
import f1.nd;
import f1.x6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.b1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/chartboost/sdk/view/FullscreenAdActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", C4240b4.i.f42655u0, "onDestroy", "B", "", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Ljava/lang/String;", "auctionId", "Lf1/x6;", "d", "Lf1/x6;", "adContainerView", "Landroid/widget/FrameLayout;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Landroid/widget/FrameLayout;", "rootView", "", InneractiveMediationDefs.GENDER_FEMALE, "Z", "dismissable", "Landroidx/activity/OnBackPressedCallback;", "g", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0})
public final class FullscreenAdActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public String auctionId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public x6 adContainerView;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public FrameLayout rootView;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean dismissable;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final OnBackPressedCallback onBackPressedCallback = new a();

    public static final class a extends OnBackPressedCallback {
        public a() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            if (!FullscreenAdActivity.this.dismissable) {
                eg.e("Back pressed but disallowed. Ignoring.", null, 2, null);
                return;
            }
            x6 x6Var = FullscreenAdActivity.this.adContainerView;
            if (x6Var != null) {
                x6Var.j();
            }
        }
    }

    public static final class b implements g6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g6 f18000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FullscreenAdActivity f18001b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x6 f18002c;

        public b(g6 g6Var, FullscreenAdActivity fullscreenAdActivity, x6 x6Var) {
            this.f18000a = g6Var;
            this.f18001b = fullscreenAdActivity;
            this.f18002c = x6Var;
        }

        @Override // f1.g6
        public void a() {
            Unit unit;
            g6 g6Var = this.f18000a;
            if (g6Var != null) {
                g6Var.a();
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.p("AdContainerListener null when onAdClicked()", null, 2, null);
            }
        }

        @Override // f1.g6
        public void b() {
            Unit unit;
            this.f18001b.finish();
            g6 g6Var = this.f18000a;
            if (g6Var != null) {
                g6Var.b();
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.p("AdContainerListener null when onAdClosed()", null, 2, null);
            }
            this.f18002c.setAdContainerListener$ChartboostMonetization_9_10_2_productionRelease(null);
        }

        @Override // f1.g6
        public void c() {
            this.f18001b.dismissable = true;
        }

        @Override // f1.g6
        public void d() {
            Unit unit;
            g6 g6Var = this.f18000a;
            if (g6Var != null) {
                g6Var.d();
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.p("AdContainerListener null when onAdRewarded()", null, 2, null);
            }
        }

        @Override // f1.g6
        public void e() {
            Unit unit;
            g6 g6Var = this.f18000a;
            if (g6Var != null) {
                g6Var.e();
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                eg.p("AdContainerListener null when onAdShown()", null, 2, null);
            }
        }

        @Override // f1.g6
        public void a(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            ContextCompat.startActivity(this.f18001b, new Intent("android.intent.action.VIEW", Uri.parse(url)), null);
        }
    }

    public static final void D(g6 g6Var) {
        if (g6Var != null) {
            g6Var.e();
        }
    }

    public static final WindowInsetsCompat z(FullscreenAdActivity this$0, View view, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        eg.e("WindowInsets updated: " + insets, null, 2, null);
        x6 x6Var = this$0.adContainerView;
        if (x6Var == null) {
            return insets;
        }
        x6Var.setRenderingContainerCalculator(new h0(this$0));
        return insets;
    }

    public final void B() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        ViewCompat.setOnApplyWindowInsetsListener(decorView, new OnApplyWindowInsetsListener() { // from class: k1.b
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return FullscreenAdActivity.z(this.f85952b, view, windowInsetsCompat);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setWindowAnimations(0);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        if (Build.VERSION.SDK_INT >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        }
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(getWindow(), getWindow().getDecorView());
        windowInsetsControllerCompat.setSystemBarsBehavior(2);
        windowInsetsControllerCompat.hide(WindowInsetsCompat.Type.systemBars());
        this.rootView = (FrameLayout) findViewById(R.id.content);
        String stringExtra = getIntent().getStringExtra("com.chartboost.sdk.internal.AdController.AdContainerMap");
        this.auctionId = stringExtra;
        x6 x6Var = (x6) b1.d(l8.f70340n.a()).remove(stringExtra);
        this.adContainerView = x6Var;
        if (x6Var == null) {
            eg.p("No loaded ad found. Finishing ad activity.", null, 2, null);
            finish();
            return;
        }
        final g6 adContainerListener$ChartboostMonetization_9_10_2_productionRelease = x6Var.getAdContainerListener$ChartboostMonetization_9_10_2_productionRelease();
        x6Var.setAdContainerListener$ChartboostMonetization_9_10_2_productionRelease(new b(adContainerListener$ChartboostMonetization_9_10_2_productionRelease, this, x6Var));
        FrameLayout frameLayout = this.rootView;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        View viewA = nd.f70659r.a(this, x6Var);
        if (viewA == null) {
            viewA = x6Var.getRootView();
        }
        View view = viewA;
        Intrinsics.checkNotNull(view);
        nd ndVar = new nd(this, x6Var, view, 1, 0, 100L, 25, false, 128, null);
        ndVar.d(new nd.b() { // from class: k1.a
            @Override // f1.nd.b
            public final void a() {
                FullscreenAdActivity.D(adContainerListener$ChartboostMonetization_9_10_2_productionRelease);
            }
        });
        ndVar.w();
        FrameLayout frameLayout2 = this.rootView;
        if (frameLayout2 != null) {
            frameLayout2.addView(x6Var);
        }
        x6Var.r();
        getOnBackPressedDispatcher().addCallback(this.onBackPressedCallback);
        if (x6Var.l()) {
            this.dismissable = true;
        }
        x6Var.n();
        B();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        FrameLayout frameLayout = this.rootView;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        x6 x6Var = this.adContainerView;
        if (x6Var != null) {
            x6Var.k();
        }
        x6 x6Var2 = this.adContainerView;
        if (x6Var2 != null) {
            x6Var2.setAdContainerListener$ChartboostMonetization_9_10_2_productionRelease(null);
        }
        this.adContainerView = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
