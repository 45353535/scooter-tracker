package com.applovin.mediation.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.e8;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.s;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.sdk.AppLovinSdk;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes6.dex */
public class MaxAdView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MaxAdViewImpl f11712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f11713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11714c;

    public MaxAdView(String str) {
        this(str, (MaxAdViewConfiguration) null);
    }

    private void a(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration, int i10, Context context) {
        View view = new View(context.getApplicationContext());
        this.f11713b = view;
        view.setBackgroundColor(0);
        addView(this.f11713b);
        this.f11713b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f11714c = getVisibility();
        this.f11712a = new MaxAdViewImpl(str.trim(), maxAdFormat, maxAdViewConfiguration, this, this.f11713b, context);
        setGravity(i10);
        if (getBackground() instanceof ColorDrawable) {
            setBackgroundColor(((ColorDrawable) getBackground()).getColor());
        }
        super.setBackgroundColor(0);
    }

    public void destroy() {
        this.f11712a.logApiCall("destroy()");
        this.f11712a.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.f11712a.getAdFormat();
    }

    public String getAdUnitId() {
        return this.f11712a.getAdUnitId();
    }

    public String getPlacement() {
        this.f11712a.logApiCall("getPlacement()");
        return this.f11712a.getPlacement();
    }

    public void loadAd() {
        this.f11712a.logApiCall("loadAd()");
        this.f11712a.loadAd();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (isInEditMode()) {
            return;
        }
        this.f11712a.logApiCall("onWindowVisibilityChanged(visibility=" + i10 + ")");
        if (this.f11712a != null && e8.a(this.f11714c, i10)) {
            this.f11712a.onWindowVisibilityChanged(i10);
        }
        this.f11714c = i10;
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f11712a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f11712a.setAdReviewListener(maxAdReviewListener);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        this.f11712a.logApiCall("setAlpha(alpha=" + f10 + ")");
        View view = this.f11713b;
        if (view != null) {
            view.setAlpha(f10);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f11712a.logApiCall("setBackgroundColor(color=" + i10 + ")");
        MaxAdViewImpl maxAdViewImpl = this.f11712a;
        if (maxAdViewImpl != null) {
            maxAdViewImpl.setPublisherBackgroundColor(i10);
        }
        View view = this.f11713b;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setCustomData(String str) {
        this.f11712a.logApiCall("setCustomData(value=" + str + ")");
        this.f11712a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f11712a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f11712a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        this.f11712a.logApiCall("setListener(listener=" + maxAdViewAdListener + ")");
        this.f11712a.setListener(maxAdViewAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f11712a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f11712a.setLocalExtraParameter(str, obj);
    }

    public void setPlacement(String str) {
        this.f11712a.logApiCall("setPlacement(placement=" + str + ")");
        this.f11712a.setPlacement(str);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f11712a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f11712a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f11712a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f11712a.setRevenueListener(maxAdRevenueListener);
    }

    public void startAutoRefresh() {
        this.f11712a.logApiCall("startAutoRefresh()");
        this.f11712a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.f11712a.logApiCall("stopAutoRefresh()");
        this.f11712a.stopAutoRefresh();
    }

    @Override // android.view.View
    @NonNull
    public String toString() {
        MaxAdViewImpl maxAdViewImpl = this.f11712a;
        return maxAdViewImpl != null ? maxAdViewImpl.toString() : "MaxAdView";
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat) {
        this(str, maxAdFormat, (MaxAdViewConfiguration) null);
    }

    public MaxAdView(String str, @Nullable MaxAdViewConfiguration maxAdViewConfiguration) {
        this(str, s.a(k.o()), maxAdViewConfiguration);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, @Nullable MaxAdViewConfiguration maxAdViewConfiguration) {
        super(k.o());
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ", configuration=" + maxAdViewConfiguration + ")");
        a(str, maxAdFormat, maxAdViewConfiguration, 49, k.o());
    }

    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxAdView(Context context, AttributeSet attributeSet, int i10) {
        MaxAdFormat maxAdFormatA;
        super(context, attributeSet, i10);
        String strA = s.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adUnitId");
        String strA2 = s.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adFormat");
        if (StringUtils.isValidString(strA2)) {
            maxAdFormatA = MaxAdFormat.formatFromString(strA2);
        } else {
            maxAdFormatA = s.a(context);
        }
        MaxAdFormat maxAdFormat = maxAdFormatA;
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 49);
        if (strA != null) {
            if (!TextUtils.isEmpty(strA)) {
                if (isInEditMode()) {
                    a(context);
                    return;
                } else {
                    a(strA, maxAdFormat, null, attributeIntValue, context);
                    return;
                }
            }
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    private void a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE));
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, i10, i11);
    }

    @Deprecated
    public MaxAdView(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    @Deprecated
    public MaxAdView(String str, AppLovinSdk appLovinSdk, Context context) {
        this(str, s.a(context), context);
    }

    @Deprecated
    public MaxAdView(String str, MaxAdFormat maxAdFormat, Context context) {
        this(str, maxAdFormat, AppLovinSdk.getInstance(context), context);
    }

    @Deprecated
    public MaxAdView(String str, MaxAdFormat maxAdFormat, AppLovinSdk appLovinSdk, Context context) {
        super(context);
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ")");
        a(str, maxAdFormat, null, 49, context);
    }
}
