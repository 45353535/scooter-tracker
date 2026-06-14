package com.inmobi.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.AbstractC3681ed;
import com.inmobi.media.AbstractC3779i9;
import com.inmobi.media.Ac;
import com.inmobi.media.C3605be;
import com.inmobi.media.C3656dd;
import com.inmobi.media.C3903n9;
import com.inmobi.media.C3957pd;
import com.inmobi.media.C4032se;
import com.inmobi.media.InterfaceC3636cj;
import com.inmobi.media.InterfaceC3878m9;
import com.inmobi.media.Jg;
import com.inmobi.media.Ji;
import com.inmobi.media.Kb;
import com.inmobi.media.Ki;
import com.inmobi.media.P9;
import com.inmobi.media.Rg;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\f\u0018\u0000 K2\u00020\u0001:\u0002LKB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u0018J\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u0018J\u000f\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010!J\u000f\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b&\u0010!J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b*\u0010!J\u000f\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b/\u00100J\r\u00102\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\n2\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u001d\u0010;\u001a\u00020\n2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u000204¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u000201¢\u0006\u0004\b@\u00103J#\u0010C\u001a\u00020\n2\u0014\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f\u0018\u00010A¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\n2\b\u0010E\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\n2\b\u0010H\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\bI\u0010GJ\r\u0010J\u001a\u00020\n¢\u0006\u0004\bJ\u0010\u0018¨\u0006M"}, d2 = {"Lcom/inmobi/ads/InMobiNative;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "", "placementId", "Lcom/inmobi/ads/listeners/NativeAdEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;JLcom/inmobi/ads/listeners/NativeAdEventListener;)V", "", "setListener", "(Lcom/inmobi/ads/listeners/NativeAdEventListener;)V", "Lcom/inmobi/ads/listeners/VideoEventListener;", "setVideoEventListener", "(Lcom/inmobi/ads/listeners/VideoEventListener;)V", "Lcom/inmobi/ads/InMobiNative$LockScreenListener;", "lockScreenListener", "showOnLockScreen", "(Lcom/inmobi/ads/InMobiNative$LockScreenListener;)V", "", "response", "load", "([B)V", "()V", "Lcom/inmobi/media/ads/nativeAd/InMobiNativeViewData;", "inMobiNativeViewData", "registerViewForTracking", "(Lcom/inmobi/media/ads/nativeAd/InMobiNativeViewData;)V", "unTrackViews", "takeAction", "", "getAdTitle", "()Ljava/lang/String;", "getAdDescription", "Lcom/inmobi/media/ads/nativeAd/InMobiNativeImage;", "getAdIcon", "()Lcom/inmobi/media/ads/nativeAd/InMobiNativeImage;", "getCtaText", "", "getAdRating", "()F", "getAdvertiserName", "Lcom/inmobi/media/ads/nativeAd/MediaView;", "getMediaView", "()Lcom/inmobi/media/ads/nativeAd/MediaView;", "Landroid/view/View;", "getAdChoiceIcon", "()Landroid/view/View;", "", "isVideo", "()Z", "", "minBidToWin", "notifyWin", "(D)V", "", "lossReason", "auctionPrice", "notifyLoss", "(ID)V", "Lorg/json/JSONObject;", "getAdContent", "()Lorg/json/JSONObject;", "isReady", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "setExtras", "(Ljava/util/Map;)V", "keywords", "setKeywords", "(Ljava/lang/String;)V", "contentUrl", "setContentUrl", "destroy", y.f66058y, "LockScreenListener", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiNative {

    @NotNull
    public static final String APP_INSTALLS = "AppInstalls";

    @NotNull
    public static final String LIKES = "Likes";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3656dd f36516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f36515b = "InMobiNative";

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/inmobi/ads/InMobiNative$LockScreenListener;", "", "onActionRequired", "", "nativeAd", "Lcom/inmobi/ads/InMobiNative;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface LockScreenListener {
        void onActionRequired(@NotNull InMobiNative nativeAd);
    }

    public InMobiNative(@NotNull Context context, long j10, @NotNull NativeAdEventListener adEventListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adEventListener, "listener");
        C3656dd c3656dd = new C3656dd(this, context, j10);
        this.f36516a = c3656dd;
        if (Ji.d()) {
            Intrinsics.checkNotNullParameter(adEventListener, "adEventListener");
            c3656dd.f38441b.f37669a = adEventListener;
        } else {
            String TAG = f36515b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            throw new SdkNotInitializedException(TAG);
        }
    }

    public final void destroy() {
        C3656dd c3656dd = this.f36516a;
        c3656dd.getClass();
        try {
            c3656dd.f38444e = null;
            Rg rg2 = c3656dd.f38441b;
            rg2.f37669a = null;
            rg2.f37670b = null;
            rg2.f37671c = null;
            c3656dd.f38442c.f37013c.clear();
            c3656dd.f38443d.f36938b.j();
        } catch (Exception e10) {
            String str = AbstractC3681ed.f38515a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            Kb.a((byte) 1, str, "Failed to destroy ad; SDK encountered an unexpected error");
            Lazy lazy = P9.f37527a;
            AbstractC3779i9.a(e10);
        }
    }

    @Nullable
    public final View getAdChoiceIcon() {
        C3605be c3605be = this.f36516a.f38444e;
        if (c3605be != null) {
            return c3605be.f38276j;
        }
        return null;
    }

    @Nullable
    public final JSONObject getAdContent() {
        C3605be c3605be = this.f36516a.f38444e;
        if (c3605be != null) {
            return c3605be.f38271e;
        }
        return null;
    }

    @Nullable
    public final String getAdDescription() {
        C3605be c3605be = this.f36516a.f38444e;
        if (c3605be != null) {
            return c3605be.f38268b;
        }
        return null;
    }

    @Nullable
    public final InMobiNativeImage getAdIcon() {
        C3605be c3605be = this.f36516a.f38444e;
        if (c3605be != null) {
            return c3605be.f38269c;
        }
        return null;
    }

    public final float getAdRating() {
        Float f10;
        C3605be c3605be = this.f36516a.f38444e;
        if (c3605be == null || (f10 = c3605be.f38273g) == null) {
            return 0.0f;
        }
        return f10.floatValue();
    }

    @Nullable
    public final String getAdTitle() {
        C3605be c3605be = this.f36516a.f38444e;
        if (c3605be != null) {
            return c3605be.f38267a;
        }
        return null;
    }

    @Nullable
    public final String getAdvertiserName() {
        C3605be c3605be = this.f36516a.f38444e;
        if (c3605be != null) {
            return c3605be.f38272f;
        }
        return null;
    }

    @Nullable
    public final String getCtaText() {
        C3605be c3605be = this.f36516a.f38444e;
        if (c3605be != null) {
            return c3605be.f38270d;
        }
        return null;
    }

    @Nullable
    public final MediaView getMediaView() {
        C3605be c3605be = this.f36516a.f38444e;
        if (c3605be != null) {
            return c3605be.f38275i;
        }
        return null;
    }

    public final boolean isReady() {
        return this.f36516a.f38444e != null;
    }

    public final boolean isVideo() {
        C3605be c3605be = this.f36516a.f38444e;
        if (c3605be != null) {
            return c3605be.f38274h;
        }
        return false;
    }

    public final void load(@Nullable byte[] response) {
        C3656dd c3656dd = this.f36516a;
        Jg jg2 = c3656dd.f38440a;
        Intrinsics.checkNotNullParameter("AB", "<set-?>");
        jg2.f37147g = "AB";
        c3656dd.f38443d.f36938b.a(response);
    }

    public final void notifyLoss(int lossReason, double auctionPrice) {
        String strA = this.f36516a.f38443d.f36938b.a(lossReason, auctionPrice);
        if (strA.length() > 0) {
            Kb.a((byte) 1, "InMobiNative", strA);
        }
    }

    public final void notifyWin(double minBidToWin) {
        String strA = this.f36516a.f38443d.f36938b.a(minBidToWin);
        if (strA.length() > 0) {
            Kb.a((byte) 1, "InMobiNative", strA);
        }
    }

    public final void registerViewForTracking(@NotNull InMobiNativeViewData inMobiNativeViewData) {
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        C3656dd c3656dd = this.f36516a;
        c3656dd.getClass();
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        c3656dd.f38443d.a(inMobiNativeViewData);
    }

    public final void setContentUrl(@Nullable String contentUrl) {
        this.f36516a.f38440a.f37145e = contentUrl;
    }

    public final void setExtras(@Nullable Map<String, String> extras) {
        C3656dd c3656dd = this.f36516a;
        if (extras != null) {
            c3656dd.getClass();
            String str = extras.get("tp");
            if (!TextUtils.isEmpty(str)) {
                Ki.f37226b = str;
            }
            String str2 = extras.get("tp-v");
            if (!TextUtils.isEmpty(str2)) {
                Ki.f37225a = str2;
            }
        }
        c3656dd.f38440a.f37143c = extras;
    }

    public final void setKeywords(@Nullable String keywords) {
        this.f36516a.f38440a.f37142b = keywords;
    }

    public final void setListener(@NotNull NativeAdEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C3656dd c3656dd = this.f36516a;
        c3656dd.getClass();
        Intrinsics.checkNotNullParameter(listener, "adEventListener");
        c3656dd.f38441b.f37669a = listener;
    }

    public final void setVideoEventListener(@NotNull VideoEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C3656dd c3656dd = this.f36516a;
        c3656dd.getClass();
        Intrinsics.checkNotNullParameter(listener, "videoEventListener");
        c3656dd.f38441b.f37670b = listener;
    }

    public final void showOnLockScreen(@NotNull LockScreenListener lockScreenListener) {
        Intrinsics.checkNotNullParameter(lockScreenListener, "lockScreenListener");
        C3656dd c3656dd = this.f36516a;
        c3656dd.getClass();
        Intrinsics.checkNotNullParameter(lockScreenListener, "lockScreenListener");
        c3656dd.f38440a.f37146f = true;
        c3656dd.f38441b.f37671c = lockScreenListener;
    }

    public final void takeAction() {
        Ac ac2 = this.f36516a.f38443d.f36938b;
        InterfaceC3636cj interfaceC3636cj = ac2.f36566c;
        C3957pd c3957pd = interfaceC3636cj instanceof C3957pd ? (C3957pd) interfaceC3636cj : null;
        if (c3957pd != null) {
            InterfaceC3878m9 interfaceC3878m9L = c3957pd.l();
            if (interfaceC3878m9L != null) {
                ((C3903n9) interfaceC3878m9L).a("AUM-NativeLoadedState", "takeAction - delegating to ad unit");
            }
            c3957pd.f39279h.a();
        }
        InterfaceC3636cj interfaceC3636cj2 = ac2.f36566c;
        C4032se c4032se = interfaceC3636cj2 instanceof C4032se ? (C4032se) interfaceC3636cj2 : null;
        if (c4032se != null) {
            InterfaceC3878m9 interfaceC3878m9L2 = c4032se.l();
            if (interfaceC3878m9L2 != null) {
                ((C3903n9) interfaceC3878m9L2).a("AUM-NativeRenderedState", "takeAction - delegating to ad unit");
            }
            c4032se.f39527f.a();
        }
    }

    public final void unTrackViews() {
        this.f36516a.f38443d.f36938b.d();
    }

    public final void load() {
        C3656dd c3656dd = this.f36516a;
        Jg jg2 = c3656dd.f38440a;
        Intrinsics.checkNotNullParameter("NonAB", "<set-?>");
        jg2.f37147g = "NonAB";
        c3656dd.f38443d.f36938b.c();
    }
}
