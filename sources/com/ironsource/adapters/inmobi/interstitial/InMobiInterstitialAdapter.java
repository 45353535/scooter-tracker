package com.ironsource.adapters.inmobi.interstitial;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.InMobiInterstitial;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.N6;
import com.ironsource.adapters.inmobi.InMobiAdapter;
import com.ironsource.adapters.inmobi.interstitial.InMobiInterstitialAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0015\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010#J3\u0010&\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b&\u0010'R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+¨\u0006-"}, d2 = {"Lcom/ironsource/adapters/inmobi/interstitial/InMobiInterstitialAdapter;", "Lcom/ironsource/mediationsdk/adapter/AbstractInterstitialAdapter;", "Lcom/ironsource/adapters/inmobi/InMobiAdapter;", N6.G1, "<init>", "(Lcom/ironsource/adapters/inmobi/InMobiAdapter;)V", "", "placementId", "", "isValidPlacementId", "(Ljava/lang/String;)Z", "", "parseToLong", "(Ljava/lang/String;)Ljava/lang/Long;", "appKey", "userId", "Lorg/json/JSONObject;", "config", "Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "initInterstitialForBidding", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;)V", "onNetworkInitCallbackSuccess", "()V", "error", "onNetworkInitCallbackFailed", "(Ljava/lang/String;)V", "adData", C4424m2.f43620s, "loadInterstitialForBidding", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;)V", C4240b4.h.H, "(Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;)V", "isInterstitialReady", "(Lorg/json/JSONObject;)Z", "", "", "getInterstitialBiddingData", "(Lorg/json/JSONObject;Lorg/json/JSONObject;)Ljava/util/Map;", "j$/util/concurrent/ConcurrentHashMap", "Lcom/inmobi/ads/InMobiInterstitial;", "placementToInterstitialAd", "Lj$/util/concurrent/ConcurrentHashMap;", "interstitialPlacementToListenerMap", "inmobiadapter_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiInterstitialAdapter extends AbstractInterstitialAdapter<InMobiAdapter> {

    @NotNull
    private final ConcurrentHashMap<String, InterstitialSmashListener> interstitialPlacementToListenerMap;

    @NotNull
    private final ConcurrentHashMap<String, InMobiInterstitial> placementToInterstitialAd;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InMobiAdapter.InitState.values().length];
            try {
                iArr[InMobiAdapter.InitState.INIT_STATE_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InMobiAdapter.InitState.INIT_STATE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiInterstitialAdapter(@NotNull InMobiAdapter adapter) {
        super(adapter);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.placementToInterstitialAd = new ConcurrentHashMap<>();
        this.interstitialPlacementToListenerMap = new ConcurrentHashMap<>();
    }

    private final boolean isValidPlacementId(String placementId) {
        return parseToLong(placementId) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadInterstitialForBidding$lambda$6$lambda$5(long j10, InMobiInterstitialListener inMobiInterstitialListener, InMobiInterstitialAdapter inMobiInterstitialAdapter, String str, String str2, InterstitialSmashListener interstitialSmashListener) {
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        InMobiInterstitial inMobiInterstitial = new InMobiInterstitial(applicationContext, j10, inMobiInterstitialListener);
        inMobiInterstitialAdapter.placementToInterstitialAd.put(str, inMobiInterstitial);
        IronLog.ADAPTER_API.verbose("loadInterstitial InMobi ad with placement:<" + j10 + ">");
        if (str2 == null) {
            inMobiInterstitial.setExtras(inMobiInterstitialAdapter.getAdapter().getExtrasMap());
            inMobiInterstitial.load();
            return;
        }
        try {
            byte[] bytes = str2.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            inMobiInterstitial.load(bytes);
        } catch (UnsupportedEncodingException unused) {
            interstitialSmashListener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError("Interstitial", "InMobi", "Couldn't parse server data for placementId = " + j10));
        }
    }

    private final Long parseToLong(String placementId) {
        try {
            return Long.valueOf(Long.parseLong(placementId));
        } catch (Exception e10) {
            IronLog.INTERNAL.error("parseToLong threw error " + e10.getMessage());
            return null;
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    @Nullable
    public Map<String, Object> getInterstitialBiddingData(@NotNull JSONObject config, @Nullable JSONObject adData) {
        Intrinsics.checkNotNullParameter(config, "config");
        return getAdapter().getBiddingData();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitialForBidding(@Nullable String appKey, @Nullable String userId, @NotNull JSONObject config, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose();
        String strOptString = config.optString("placementId");
        String strOptString2 = config.optString(InMobiAdapter.ACCOUNT_ID);
        Intrinsics.checkNotNull(strOptString);
        if (!isValidPlacementId(strOptString)) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString("placementId"));
            listener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Invalid placementId", "Interstitial"));
            return;
        }
        Intrinsics.checkNotNull(strOptString2);
        if (strOptString2.length() == 0) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(InMobiAdapter.ACCOUNT_ID));
            listener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Empty accountId", "Interstitial"));
            return;
        }
        ironLog.verbose("placementId = <" + strOptString + ">");
        this.interstitialPlacementToListenerMap.put(strOptString, listener);
        int i10 = WhenMappings.$EnumSwitchMapping$0[InMobiAdapter.INSTANCE.getInitState$inmobiadapter_release().ordinal()];
        if (i10 == 1) {
            ironLog.verbose("onInterstitialInitSuccess with placementId: " + strOptString);
            listener.onInterstitialInitSuccess();
            return;
        }
        if (i10 != 2) {
            InMobiAdapter adapter = getAdapter();
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            adapter.initSDK(applicationContext, strOptString2);
            return;
        }
        ironLog.verbose("onInterstitialInitFailed with placementId: " + strOptString);
        listener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Init Failed", "Interstitial"));
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public boolean isInterstitialReady(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        String strOptString = config.optString("placementId");
        IronLog.ADAPTER_API.verbose("placementId = <" + strOptString + ">");
        InMobiInterstitial inMobiInterstitial = this.placementToInterstitialAd.get(strOptString);
        return inMobiInterstitial != null && inMobiInterstitial.isReady();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitialForBidding(@NotNull JSONObject config, @Nullable JSONObject adData, @Nullable final String serverData, @NotNull final InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose(" <" + config.optString("placementId") + ">");
        final String strOptString = config.optString("placementId");
        Intrinsics.checkNotNull(strOptString);
        Long toLong = parseToLong(strOptString);
        if (toLong != null) {
            final long jLongValue = toLong.longValue();
            ironLog.verbose("create InMobi ad with placementId: <" + strOptString + ">");
            final InMobiInterstitialListener inMobiInterstitialListener = new InMobiInterstitialListener(listener, strOptString);
            postOnUIThread(new Runnable() { // from class: b4.b
                @Override // java.lang.Runnable
                public final void run() {
                    InMobiInterstitialAdapter.loadInterstitialForBidding$lambda$6$lambda$5(jLongValue, inMobiInterstitialListener, this, strOptString, serverData, listener);
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(@Nullable String error) {
        String str = "init failed: " + error;
        Collection<InterstitialSmashListener> collectionValues = this.interstitialPlacementToListenerMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((InterstitialSmashListener) it.next()).onInterstitialInitFailed(new IronSourceError(508, str));
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        Boolean ageRestrictionCollectingUserData;
        if (getAdapter().shouldSetAgeRestrictedOnInitSuccess() && (ageRestrictionCollectingUserData = InMobiAdapter.INSTANCE.getAgeRestrictionCollectingUserData()) != null) {
            getAdapter().setAgeRestricted(ageRestrictionCollectingUserData.booleanValue());
        }
        Collection<InterstitialSmashListener> collectionValues = this.interstitialPlacementToListenerMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((InterstitialSmashListener) it.next()).onInterstitialInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractInterstitialAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void showInterstitial(@NotNull JSONObject config, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String strOptString = config.optString("placementId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = <" + strOptString + ">");
        if (!isInterstitialReady(config)) {
            IronLog.INTERNAL.error("failed: inMobiInterstitial isn't ready <" + strOptString + ">");
            listener.onInterstitialAdShowFailed(ErrorBuilder.buildGenericError("Interstitial"));
            return;
        }
        final InMobiInterstitial inMobiInterstitial = this.placementToInterstitialAd.get(strOptString);
        if (inMobiInterstitial != null) {
            ironLog.verbose("showInterstitial InMobi ad <" + strOptString);
            postOnUIThread(new Runnable() { // from class: b4.a
                @Override // java.lang.Runnable
                public final void run() {
                    inMobiInterstitial.show();
                }
            });
        }
    }
}
