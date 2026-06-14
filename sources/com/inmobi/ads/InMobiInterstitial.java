package com.inmobi.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.media.AbstractC3755ha;
import com.inmobi.media.AbstractC3779i9;
import com.inmobi.media.AbstractC3845l1;
import com.inmobi.media.C3780ia;
import com.inmobi.media.C3803j9;
import com.inmobi.media.C3804ja;
import com.inmobi.media.C3829ka;
import com.inmobi.media.C3854la;
import com.inmobi.media.J5;
import com.inmobi.media.Jg;
import com.inmobi.media.Ji;
import com.inmobi.media.Kb;
import com.inmobi.media.Ki;
import com.inmobi.media.P9;
import com.inmobi.media.Pj;
import com.ironsource.C4424m2;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 F2\u00020\u0001:\u0002GHB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0015\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\u00020\n2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\r¢\u0006\u0004\b\"\u0010\u0010J\u0015\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\n¢\u0006\u0004\b'\u0010\u0012J\u0015\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u001d\u0010/\u001a\u00020\n2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020(¢\u0006\u0004\b/\u00100R\"\u00102\u001a\u0002018\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00109\u001a\u0002088\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R \u0010E\u001a\u00020?8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bD\u0010\u0012\u001a\u0004\bB\u0010C¨\u0006I"}, d2 = {"Lcom/inmobi/ads/InMobiInterstitial;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "", "placementId", "Lcom/inmobi/ads/listeners/InterstitialAdEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;JLcom/inmobi/ads/listeners/InterstitialAdEventListener;)V", "", "setListener", "(Lcom/inmobi/ads/listeners/InterstitialAdEventListener;)V", "", "keywords", "setKeywords", "(Ljava/lang/String;)V", "getSignals", "()V", "", "response", "load", "([B)V", "loadAdUnit", C4424m2.f43623v, "(Landroid/content/Context;)V", "", "isReady", "()Z", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "setExtras", "(Ljava/util/Map;)V", "contentUrl", "setContentUrl", "Lcom/inmobi/ads/WatermarkData;", "watermarkData", "setWatermarkData", "(Lcom/inmobi/ads/WatermarkData;)V", "disableHardwareAcceleration", "", "minBidToWin", "notifyWin", "(D)V", "", "lossReason", "auctionPrice", "notifyLoss", "(ID)V", "Lcom/inmobi/media/ha;", "mPubListener", "Lcom/inmobi/media/ha;", "getMPubListener$media_release", "()Lcom/inmobi/media/ha;", "setMPubListener$media_release", "(Lcom/inmobi/media/ha;)V", "Lcom/inmobi/media/la;", "mAdManager", "Lcom/inmobi/media/la;", "getMAdManager$media_release", "()Lcom/inmobi/media/la;", "setMAdManager$media_release", "(Lcom/inmobi/media/la;)V", "Lcom/inmobi/ads/PreloadManager;", InneractiveMediationDefs.GENDER_FEMALE, "Lcom/inmobi/ads/PreloadManager;", "getPreloadManager", "()Lcom/inmobi/ads/PreloadManager;", "getPreloadManager$annotations", "preloadManager", y.f66058y, "a", "com/inmobi/media/j9", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiInterstitial {

    @NotNull
    public static final C3803j9 Companion = new C3803j9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f36504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f36505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f36506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Jg f36507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f36508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f36509f;
    public C3854la mAdManager;
    public AbstractC3755ha mPubListener;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/inmobi/ads/InMobiInterstitial$a;", "Lcom/inmobi/media/ka;", "Lcom/inmobi/ads/InMobiInterstitial;", "interstitial", "<init>", "(Lcom/inmobi/ads/InMobiInterstitial;)V", "Lcom/inmobi/ads/AdMetaInfo;", "info", "", "onAdFetchSuccessful", "(Lcom/inmobi/ads/AdMetaInfo;)V", "Lcom/inmobi/ads/InMobiAdRequestStatus;", "status", "onAdFetchFailed", "(Lcom/inmobi/ads/InMobiAdRequestStatus;)V", "", "getType", "()B", "type", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends C3829ka {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull InMobiInterstitial interstitial) {
            super(interstitial);
            Intrinsics.checkNotNullParameter(interstitial, "interstitial");
        }

        @Override // com.inmobi.media.C3829ka, com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.media.C3829ka, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(@NotNull InMobiAdRequestStatus status) {
            AbstractC3755ha mPubListener$media_release;
            Intrinsics.checkNotNullParameter(status, "status");
            InMobiInterstitial inMobiInterstitial = this.f38871a.get();
            if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
                return;
            }
            mPubListener$media_release.a(inMobiInterstitial, status);
        }

        @Override // com.inmobi.media.C3829ka, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(@NotNull AdMetaInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            super.onAdFetchSuccessful(info);
            InMobiInterstitial inMobiInterstitial = this.f38871a.get();
            if (inMobiInterstitial != null) {
                try {
                    inMobiInterstitial.getMAdManager$media_release().i();
                } catch (IllegalStateException e10) {
                    String strAccess$getTAG$cp = InMobiInterstitial.access$getTAG$cp();
                    Intrinsics.checkNotNullExpressionValue(strAccess$getTAG$cp, "access$getTAG$cp(...)");
                    Kb.a((byte) 1, strAccess$getTAG$cp, e10.getMessage());
                    inMobiInterstitial.getMPubListener$media_release().a(inMobiInterstitial, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    }

    public InMobiInterstitial(@NotNull Context context, long j10, @NotNull InterstitialAdEventListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Jg jg2 = new Jg();
        this.f36507d = jg2;
        this.f36508e = new a(this);
        this.f36509f = new e(this);
        if (!Ji.d()) {
            Intrinsics.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
            throw new SdkNotInitializedException("InMobiInterstitial");
        }
        this.f36504a = context.getApplicationContext();
        jg2.f37141a = j10;
        this.f36506c = new WeakReference(context);
        setMPubListener$media_release(new C3780ia(listener));
        setMAdManager$media_release(new C3854la());
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        return "InMobiInterstitial";
    }

    public static /* synthetic */ void getPreloadManager$annotations() {
    }

    public final void a(Activity activity) {
        try {
            if (this.f36505b) {
                getMAdManager$media_release().a(activity);
            } else {
                Intrinsics.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
                Kb.a((byte) 1, "InMobiInterstitial", "load() must be called before trying to show the ad");
            }
        } catch (Exception e10) {
            Intrinsics.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
            Kb.a((byte) 1, "InMobiInterstitial", "Unable to show ad; SDK encountered an unexpected error");
            Intrinsics.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
            e10.getMessage();
            Lazy lazy = P9.f37527a;
            AbstractC3779i9.a(e10);
        }
    }

    public final void disableHardwareAcceleration() {
        this.f36507d.f37144d = true;
    }

    @NotNull
    public final C3854la getMAdManager$media_release() {
        C3854la c3854la = this.mAdManager;
        if (c3854la != null) {
            return c3854la;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAdManager");
        return null;
    }

    @NotNull
    public final AbstractC3755ha getMPubListener$media_release() {
        AbstractC3755ha abstractC3755ha = this.mPubListener;
        if (abstractC3755ha != null) {
            return abstractC3755ha;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mPubListener");
        return null;
    }

    @NotNull
    public final PreloadManager getPreloadManager() {
        return this.f36509f;
    }

    public final void getSignals() {
        Jg jg2 = this.f36507d;
        jg2.getClass();
        Intrinsics.checkNotNullParameter("AB", "<set-?>");
        jg2.f37147g = "AB";
        C3854la mAdManager$media_release = getMAdManager$media_release();
        Jg jg3 = this.f36507d;
        Context context = this.f36504a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        mAdManager$media_release.a(jg3, context, false, "getToken");
        getMAdManager$media_release().a(this.f36508e);
    }

    public final boolean isReady() {
        C3804ja c3804ja;
        Pj pj;
        C3854la mAdManager$media_release = getMAdManager$media_release();
        C3804ja c3804ja2 = mAdManager$media_release.f38964h;
        boolean z10 = c3804ja2 != null && 2 == mAdManager$media_release.f36743a && c3804ja2.f38916b == 4;
        if (!z10 && (((c3804ja = getMAdManager$media_release().f38964h) == null || (pj = c3804ja.H) == null || !pj.f37550b) && c3804ja != null)) {
            c3804ja.a0();
        }
        return z10;
    }

    public final void load(@Nullable byte[] response) {
        this.f36505b = true;
        Jg jg2 = this.f36507d;
        Intrinsics.checkNotNullParameter("AB", "<set-?>");
        jg2.f37147g = "AB";
        C3854la mAdManager$media_release = getMAdManager$media_release();
        Jg jg3 = this.f36507d;
        Context context = this.f36504a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        mAdManager$media_release.a(jg3, context, true, "intHtml");
        if (Build.VERSION.SDK_INT >= 29) {
            J5.c((Context) this.f36506c.get());
        }
        getMAdManager$media_release().a(response, this.f36508e);
    }

    @VisibleForTesting
    public final void loadAdUnit() {
        getMAdManager$media_release().b(this.f36508e);
    }

    public final void notifyLoss(int lossReason, double auctionPrice) {
        String strA = "loss notification failed to trigger";
        if (this.mAdManager == null) {
            Kb.a((byte) 1, "InMobi", "loss notification failed to trigger");
            return;
        }
        C3854la mAdManager$media_release = getMAdManager$media_release();
        if (mAdManager$media_release.f() != null) {
            AbstractC3845l1 abstractC3845l1F = mAdManager$media_release.f();
            strA = abstractC3845l1F != null ? abstractC3845l1F.a(lossReason, auctionPrice) : null;
        }
        if (strA != null) {
            Kb.a((byte) 1, "InMobi", strA);
        }
    }

    public final void notifyWin(double minBidToWin) {
        String strA = "win notification failed to trigger";
        if (this.mAdManager == null) {
            Kb.a((byte) 1, "InMobi", "win notification failed to trigger");
            return;
        }
        C3854la mAdManager$media_release = getMAdManager$media_release();
        if (mAdManager$media_release.f() != null) {
            AbstractC3845l1 abstractC3845l1F = mAdManager$media_release.f();
            strA = abstractC3845l1F != null ? abstractC3845l1F.a(minBidToWin) : null;
        }
        if (strA != null) {
            Kb.a((byte) 1, "InMobi", strA);
        }
    }

    public final void setContentUrl(@NotNull String contentUrl) {
        Intrinsics.checkNotNullParameter(contentUrl, "contentUrl");
        this.f36507d.f37145e = contentUrl;
    }

    public final void setExtras(@Nullable Map<String, String> extras) {
        if (extras != null) {
            String str = extras.get("tp");
            if (!TextUtils.isEmpty(str)) {
                Ki.f37226b = str;
            }
            String str2 = extras.get("tp-v");
            if (!TextUtils.isEmpty(str2)) {
                Ki.f37225a = str2;
            }
        }
        this.f36507d.f37143c = extras;
    }

    public final void setKeywords(@Nullable String keywords) {
        this.f36507d.f37142b = keywords;
    }

    public final void setListener(@NotNull InterstitialAdEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setMPubListener$media_release(new C3780ia(listener));
    }

    public final void setMAdManager$media_release(@NotNull C3854la c3854la) {
        Intrinsics.checkNotNullParameter(c3854la, "<set-?>");
        this.mAdManager = c3854la;
    }

    public final void setMPubListener$media_release(@NotNull AbstractC3755ha abstractC3755ha) {
        Intrinsics.checkNotNullParameter(abstractC3755ha, "<set-?>");
        this.mPubListener = abstractC3755ha;
    }

    public final void setWatermarkData(@NotNull WatermarkData watermarkData) {
        Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        getMAdManager$media_release().a(watermarkData);
    }

    @UiThread
    public final void show(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (context instanceof Activity) {
            a((Activity) context);
            return;
        }
        Intrinsics.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
        Kb.a((byte) 1, "InMobiInterstitial", "Activity context is required to show interstitial ad as expected");
        a(null);
    }

    @UiThread
    public final void show() {
        a(null);
    }

    @UiThread
    public final void load() {
        try {
            this.f36505b = true;
            Jg jg2 = this.f36507d;
            Intrinsics.checkNotNullParameter("NonAB", "<set-?>");
            jg2.f37147g = "NonAB";
            C3854la mAdManager$media_release = getMAdManager$media_release();
            Jg jg3 = this.f36507d;
            Context context = this.f36504a;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                context = null;
            }
            mAdManager$media_release.a(jg3, context, true, "intHtml");
            if (Build.VERSION.SDK_INT >= 29) {
                J5.c((Context) this.f36506c.get());
            }
            loadAdUnit();
        } catch (Exception e10) {
            Intrinsics.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
            Kb.a((byte) 1, "InMobiInterstitial", "Unable to load ad; SDK encountered an unexpected error");
            Intrinsics.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
            e10.getMessage();
            getMAdManager$media_release().a((short) 2000);
            getMAdManager$media_release().a(getMAdManager$media_release().f38964h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            Lazy lazy = P9.f37527a;
            AbstractC3779i9.a(e10);
        }
    }
}
