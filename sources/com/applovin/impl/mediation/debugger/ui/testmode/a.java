package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.amazon.aps.ads.ApsConstants;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.e3;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.n3;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w;
import com.applovin.impl.x;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.ironsource.Df;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends n3 implements MaxRewardedAdListener, MaxAdViewAdListener, AdControlButton.a, MaxAdRevenueListener, w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e3 f9611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f9612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MaxAdView f9613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MaxAdView f9614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MaxInterstitialAd f9615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MaxAppOpenAd f9616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MaxRewardedAd f9617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MaxAd f9618h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MaxNativeAdLoader f9619i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List f9620j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f9621k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AdControlButton f9622l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private AdControlButton f9623m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AdControlButton f9624n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private AdControlButton f9625o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AdControlButton f9626p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AdControlButton f9627q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Button f9628r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Button f9629s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private FrameLayout f9630t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private FrameLayout f9631u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Switch f9632v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Switch f9633w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Map f9634x;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a$a, reason: collision with other inner class name */
    class C0176a extends MaxNativeAdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaxNativeAdView f9635a;

        C0176a(MaxNativeAdView maxNativeAdView) {
            this.f9635a = maxNativeAdView;
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            a.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            a.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (a.this.f9618h != null) {
                a.this.f9619i.destroy(a.this.f9618h);
            }
            a.this.f9618h = maxAd;
            a.this.f9619i.render(this.f9635a, maxAd);
            a.this.f9631u.removeAllViews();
            a.this.f9631u.addView(this.f9635a);
            a.this.onAdLoaded(maxAd);
        }
    }

    private void e() {
        List listR = this.f9611a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (!listR.contains(maxAdFormat)) {
            findViewById(R.id.rewarded_control_view).setVisibility(8);
            return;
        }
        String str = "test_mode_rewarded_" + this.f9611a.m();
        this.f9621k = str;
        MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.f9612b.y0(), this);
        this.f9617g = maxRewardedAd;
        maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
        this.f9617g.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.rewarded_control_button);
        this.f9626p = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f9626p.setFormat(maxAdFormat);
    }

    @Override // com.applovin.impl.n3
    protected k getSdk() {
        return this.f9612b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        return (this.f9611a.x() == null || !this.f9611a.x().containsKey(maxAdFormat)) ? this.f9611a.m() : (String) this.f9611a.x().get(maxAdFormat);
    }

    public void initialize(e3 e3Var) {
        this.f9611a = e3Var;
        this.f9612b = e3Var.o();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(@NonNull MaxAd maxAd) {
        n7.a(Df.f40645f, maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(@NonNull MaxAd maxAd) {
        n7.a("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(@NonNull MaxAd maxAd, @NonNull MaxError maxError) {
        a(maxAd.getAdUnitId()).setControlState(AdControlButton.b.LOAD);
        n7.a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(@NonNull MaxAd maxAd) {
        n7.a("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(@NonNull MaxAd maxAd) {
        n7.a("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(@NonNull MaxAd maxAd) {
        n7.a("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(@NonNull String str, @NonNull MaxError maxError) {
        AdControlButton adControlButtonA = a(str);
        adControlButtonA.setControlState(AdControlButton.b.LOAD);
        n7.a(maxError, adControlButtonA.getFormat().getLabel(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(@NonNull MaxAd maxAd) {
        AdControlButton adControlButtonA = a(maxAd.getAdUnitId());
        if (maxAd.getFormat().isAdViewAd() || maxAd.getFormat().equals(MaxAdFormat.NATIVE)) {
            adControlButtonA.setControlState(AdControlButton.b.LOAD);
        } else {
            adControlButtonA.setControlState(AdControlButton.b.SHOW);
        }
    }

    @Override // com.applovin.impl.w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f9613c.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            this.f9614d.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f9615e.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f9616f.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f9617g.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f9619i.setLocalExtraParameter(ApsConstants.AMAZON_SUCCESS_RESPONSE, dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(@NonNull MaxAd maxAd) {
        n7.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar != adControlButton.getControlState()) {
            if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
                adControlButton.setControlState(bVar);
                b(format);
                return;
            }
            return;
        }
        adControlButton.setControlState(AdControlButton.b.LOADING);
        Map map = this.f9634x;
        if (map == null || map.get(format) == null) {
            a(format);
        } else {
            ((w) this.f9634x.get(format)).a();
        }
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f9611a == null) {
            o.h("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f9611a.g() + " Test Ads");
        this.f9620j = this.f9612b.s0().b();
        a();
        c();
        b();
        e();
        d();
        findViewById(R.id.app_open_ad_control_view).setVisibility(8);
        this.f9628r = (Button) findViewById(R.id.show_mrec_button);
        this.f9629s = (Button) findViewById(R.id.show_native_button);
        if (this.f9611a.I() && this.f9611a.r().contains(MaxAdFormat.MREC)) {
            this.f9631u.setVisibility(8);
            this.f9628r.setBackgroundColor(-1);
            this.f9629s.setBackgroundColor(-3355444);
            this.f9628r.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9637b.a(view);
                }
            });
            this.f9629s.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9638b.b(view);
                }
            });
        } else {
            this.f9628r.setVisibility(8);
            this.f9629s.setVisibility(8);
        }
        this.f9632v = (Switch) findViewById(R.id.native_banner_switch);
        this.f9633w = (Switch) findViewById(R.id.native_mrec_switch);
        if (this.f9611a.J()) {
            this.f9632v.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9639b.c(view);
                }
            });
            this.f9633w.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9640b.d(view);
                }
            });
        } else {
            this.f9632v.setVisibility(8);
            this.f9633w.setVisibility(8);
        }
        if (!StringUtils.isValidString(this.f9611a.e()) || this.f9611a.d() == null || this.f9611a.d().size() <= 0) {
            return;
        }
        AdRegistration.getInstance(this.f9611a.e(), this);
        AdRegistration.enableTesting(true);
        AdRegistration.enableLogging(true);
        HashMap map = new HashMap(this.f9611a.d().size());
        for (MaxAdFormat maxAdFormat : this.f9611a.d().keySet()) {
            map.put(maxAdFormat, new w((x) this.f9611a.d().get(maxAdFormat), maxAdFormat, getApplicationContext(), this));
        }
        this.f9634x = map;
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f9612b.s0().a(this.f9620j);
        MaxAdView maxAdView = this.f9613c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.f9614d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f9615e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f9617g;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f9619i;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f9618h;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.f9619i.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(@NonNull MaxAd maxAd, @NonNull MaxReward maxReward) {
        n7.a("onUserRewarded", maxAd, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.f9614d.removeAllViews();
        this.f9623m.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.f9631u.setVisibility(0);
        this.f9630t.setVisibility(8);
        this.f9629s.setBackgroundColor(-1);
        this.f9628r.setBackgroundColor(-3355444);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.f9613c.removeAllViews();
        this.f9622l.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f9630t.setVisibility(0);
        this.f9631u.setVisibility(8);
        this.f9628r.setBackgroundColor(-1);
        this.f9629s.setBackgroundColor(-3355444);
    }

    private void d() {
        this.f9631u = (FrameLayout) findViewById(R.id.native_ad_view_container);
        if (this.f9611a.I()) {
            MaxNativeAdView maxNativeAdView = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(R.layout.max_native_ad_template_1).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).build(), this);
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native");
            this.f9619i = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.f9619i.setNativeAdListener(new C0176a(maxNativeAdView));
            this.f9619i.setRevenueListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.native_control_button);
            this.f9627q = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f9627q.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(R.id.native_control_view).setVisibility(8);
        this.f9631u.setVisibility(8);
    }

    @Override // com.applovin.impl.w.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.f9614d.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f9615e.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f9616f.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f9617g.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f9619i.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
            }
        } else {
            this.f9613c.setLocalExtraParameter(ApsConstants.AMAZON_ERROR_RESPONSE, adError);
        }
        a(maxAdFormat);
    }

    private void c() {
        this.f9630t = (FrameLayout) findViewById(R.id.mrec_ad_view_container);
        List listR = this.f9611a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (listR.contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.f9612b.y0(), this);
            this.f9614d = maxAdView;
            maxAdView.setExtraParameter("disable_auto_retries", "true");
            this.f9614d.setExtraParameter("disable_precache", "true");
            this.f9614d.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f9614d.stopAutoRefresh();
            this.f9614d.setListener(this);
            this.f9630t.addView(this.f9614d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.mrec_control_button);
            this.f9623m = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f9623m.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.mrec_control_view).setVisibility(8);
        this.f9630t.setVisibility(8);
    }

    private void b() {
        List listR = this.f9611a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (listR.contains(maxAdFormat)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f9612b.y0(), this);
            this.f9615e = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f9615e.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.interstitial_control_button);
            this.f9624n = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f9624n.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.interstitial_control_view).setVisibility(8);
    }

    private void a() {
        MaxAdFormat maxAdFormat;
        String str;
        boolean zIsTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.banner_ad_view_container);
        if (zIsTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(R.id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (this.f9611a.r().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f9612b.y0(), this);
            this.f9613c = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f9613c.setExtraParameter("disable_auto_retries", "true");
            this.f9613c.setExtraParameter("disable_precache", "true");
            this.f9613c.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f9613c.stopAutoRefresh();
            this.f9613c.setListener(this);
            frameLayout.addView(this.f9613c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.banner_control_button);
            this.f9622l = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f9622l.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    private void b(MaxAdFormat maxAdFormat) {
        o.g("MaxDebuggerMultiAdActivity", "Showing test " + maxAdFormat.getDisplayName() + " Ad from " + this.f9611a.g());
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f9615e.showAd();
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f9616f.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f9617g.showAd();
        }
    }

    private void a(MaxAdFormat maxAdFormat) {
        o.g("MaxDebuggerMultiAdActivity", "Loading test " + maxAdFormat.getDisplayName() + " Ad from " + this.f9611a.g());
        MaxAdFormat maxAdFormat2 = MaxAdFormat.BANNER;
        boolean z10 = false;
        boolean z11 = (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) && this.f9632v.isChecked();
        MaxAdFormat maxAdFormat3 = MaxAdFormat.MREC;
        if (maxAdFormat3 == maxAdFormat && this.f9633w.isChecked()) {
            z10 = true;
        }
        if (!z11 && !z10) {
            this.f9612b.s0().a(getTestModeNetwork(maxAdFormat));
        } else {
            this.f9612b.s0().a(this.f9611a.w());
        }
        if (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f9613c.loadAd();
            return;
        }
        if (maxAdFormat3 == maxAdFormat) {
            this.f9614d.loadAd();
            this.f9628r.callOnClick();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f9615e.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f9616f.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f9617g.loadAd();
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f9619i.loadAd();
            this.f9629s.callOnClick();
        }
    }

    private AdControlButton a(String str) {
        if (!str.equals("test_mode_banner") && !str.equals("test_mode_leader")) {
            if (str.equals("test_mode_mrec")) {
                return this.f9623m;
            }
            if (str.equals("test_mode_interstitial")) {
                return this.f9624n;
            }
            if (str.equals("test_mode_app_open")) {
                return this.f9625o;
            }
            if (str.equals(this.f9621k)) {
                return this.f9626p;
            }
            if (str.equals("test_mode_native")) {
                return this.f9627q;
            }
            throw new IllegalArgumentException("Invalid test mode ad unit identifier provided " + str);
        }
        return this.f9622l;
    }
}
