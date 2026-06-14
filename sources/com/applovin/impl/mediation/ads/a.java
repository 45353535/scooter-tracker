package com.applovin.impl.mediation.ads;

import android.app.Activity;
import androidx.annotation.Nullable;
import com.amazon.aps.ads.ApsConstants;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.n7;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v2;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    protected final MaxAdFormat adFormat;
    protected MaxAdListener adListener;

    @Nullable
    protected MaxAdReviewListener adReviewListener;
    protected final String adUnitId;

    @Nullable
    protected MaxAdExpirationListener expirationListener;
    protected final com.applovin.impl.sdk.o logger;

    @Nullable
    protected MaxAdRequestListener requestListener;

    @Nullable
    protected MaxAdRevenueListener revenueListener;
    protected final com.applovin.impl.sdk.k sdk;
    protected final String tag;
    protected final Map<String, Object> localExtraParameters = DesugarCollections.synchronizedMap(new HashMap());
    protected final Map<String, Object> extraParameters = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: com.applovin.impl.mediation.ads.a$a, reason: collision with other inner class name */
    public interface InterfaceC0175a extends MaxAdListener, MaxAdRevenueListener, MaxAdRequestListener {
    }

    protected a(String str, MaxAdFormat maxAdFormat, String str2, com.applovin.impl.sdk.k kVar) {
        this.adUnitId = str;
        this.adFormat = maxAdFormat;
        this.sdk = kVar;
        this.tag = str2;
        this.logger = kVar.O();
    }

    private void a(final String str, final String str2, final String str3, final MaxAdFormat maxAdFormat, final String str4, final com.applovin.impl.sdk.k kVar) {
        kVar.q0().a((i5) new r6(kVar, "reportExtraParameter", new Runnable() { // from class: com.applovin.impl.mediation.ads.w
            @Override // java.lang.Runnable
            public final void run() {
                a.a(str, str2, maxAdFormat, str3, kVar, str4);
            }
        }), d6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void destroy() {
        this.localExtraParameters.clear();
        this.adListener = null;
        this.revenueListener = null;
        this.requestListener = null;
        this.expirationListener = null;
        this.adReviewListener = null;
    }

    public String getAdUnitId() {
        return this.adUnitId;
    }

    public void logApiCall(String str) {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, str);
        }
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Setting Ad Review creative id listener: " + maxAdReviewListener);
        }
        this.adReviewListener = maxAdReviewListener;
    }

    public void setExpirationListener(@Nullable MaxAdExpirationListener maxAdExpirationListener) {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Setting expiration listener: " + maxAdExpirationListener);
        }
        this.expirationListener = maxAdExpirationListener;
    }

    public void setExtraParameter(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        if (n7.c(this.sdk) && (ApsConstants.AMAZON_SUCCESS_RESPONSE.equals(str) || ApsConstants.AMAZON_ERROR_RESPONSE.equals(str))) {
            throw new IllegalArgumentException("`setExtraParameter()` is an incorrect method for passing `amazon_ad_response` or `amazon_ad_error`. Please use the following method: `setLocalExtraParameter()`. Also note that this exception occurs in development builds only.");
        }
        if (this.adFormat.isAdViewAd() && "ad_refresh_seconds".equals(str) && StringUtils.isValidString(str2)) {
            int i10 = Integer.parseInt(str2);
            if (i10 > TimeUnit.MINUTES.toSeconds(2L)) {
                com.applovin.impl.sdk.o.h(this.tag, "Attempting to set extra parameter \"ad_refresh_seconds\" to over 2 minutes (" + i10 + "s) - this will be ignored");
            }
        }
        a(str, str2, this.adUnitId, this.adFormat, "extraParameter", this.sdk);
        this.extraParameters.put(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Setting listener: " + maxAdListener);
        }
        this.adListener = maxAdListener;
    }

    public void setLocalExtraParameter(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        if (obj instanceof Activity) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.b(this.tag, "Ignoring setting local extra parameter to Activity instance - please pass a WeakReference of it instead!");
            }
        } else {
            if (ApsConstants.AMAZON_SUCCESS_RESPONSE.equals(str) || ApsConstants.AMAZON_ERROR_RESPONSE.equals(str)) {
                setExtraParameter("is_amazon_integration", Boolean.toString(true));
            }
            a(str, String.valueOf(obj), this.adUnitId, this.adFormat, "localExtraParameter", this.sdk);
            this.localExtraParameters.put(str, obj);
        }
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Setting request listener: " + maxAdRequestListener);
        }
        this.requestListener = maxAdRequestListener;
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Setting revenue listener: " + maxAdRevenueListener);
        }
        this.revenueListener = maxAdRevenueListener;
    }

    public static void logApiCall(String str, String str2) {
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.C0;
        if (kVar == null) {
            return;
        }
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.k.C0.O().a(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, String str2, MaxAdFormat maxAdFormat, String str3, com.applovin.impl.sdk.k kVar, String str4) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", str + io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER + str2);
        CollectionUtils.putStringIfValid("ad_format", maxAdFormat.getLabel(), mapHashMap);
        CollectionUtils.putStringIfValid("ad_unit_id", str3, mapHashMap);
        kVar.P().a(d2.f8606x0, str4, mapHashMap);
    }

    void a(y2 y2Var) {
        v2 v2Var = new v2();
        v2Var.a().a("MAX Ad").a(y2Var).a();
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, v2Var.toString());
        }
    }
}
