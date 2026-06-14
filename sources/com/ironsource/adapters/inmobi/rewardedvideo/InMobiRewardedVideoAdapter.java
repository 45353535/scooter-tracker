package com.ironsource.adapters.inmobi.rewardedvideo;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.InMobiInterstitial;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.N6;
import com.ironsource.adapters.inmobi.InMobiAdapter;
import com.ironsource.adapters.inmobi.rewardedvideo.InMobiRewardedVideoAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0015\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010#J3\u0010&\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b&\u0010'R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020+0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00060.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/ironsource/adapters/inmobi/rewardedvideo/InMobiRewardedVideoAdapter;", "Lcom/ironsource/mediationsdk/adapter/AbstractRewardedVideoAdapter;", "Lcom/ironsource/adapters/inmobi/InMobiAdapter;", N6.G1, "<init>", "(Lcom/ironsource/adapters/inmobi/InMobiAdapter;)V", "", "placementId", "", "isValidPlacementId", "(Ljava/lang/String;)Z", "", "parseToLong", "(Ljava/lang/String;)Ljava/lang/Long;", "appKey", "userId", "Lorg/json/JSONObject;", "config", "Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "initRewardedVideoWithCallback", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V", "onNetworkInitCallbackSuccess", "()V", "error", "onNetworkInitCallbackFailed", "(Ljava/lang/String;)V", "adData", C4424m2.f43620s, "loadRewardedVideoForBidding", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V", C4240b4.h.f42594i, "(Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V", "isRewardedVideoAvailable", "(Lorg/json/JSONObject;)Z", "", "", "getRewardedVideoBiddingData", "(Lorg/json/JSONObject;Lorg/json/JSONObject;)Ljava/util/Map;", "j$/util/concurrent/ConcurrentHashMap", "mPlacementIdToListener", "Lj$/util/concurrent/ConcurrentHashMap;", "Lcom/inmobi/ads/InMobiInterstitial;", "placementToRewardedVideoAd", "rewardedVideoPlacementToListenerMap", "Ljava/util/concurrent/CopyOnWriteArraySet;", "rewardedVideoPlacementsForInitCallbacks", "Ljava/util/concurrent/CopyOnWriteArraySet;", "inmobiadapter_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiRewardedVideoAdapter extends AbstractRewardedVideoAdapter<InMobiAdapter> {

    @NotNull
    private final ConcurrentHashMap<String, RewardedVideoSmashListener> mPlacementIdToListener;

    @NotNull
    private final ConcurrentHashMap<String, InMobiInterstitial> placementToRewardedVideoAd;

    @NotNull
    private final ConcurrentHashMap<String, RewardedVideoSmashListener> rewardedVideoPlacementToListenerMap;

    @NotNull
    private final CopyOnWriteArraySet<String> rewardedVideoPlacementsForInitCallbacks;

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
    public InMobiRewardedVideoAdapter(@NotNull InMobiAdapter adapter) {
        super(adapter);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.mPlacementIdToListener = new ConcurrentHashMap<>();
        this.placementToRewardedVideoAd = new ConcurrentHashMap<>();
        this.rewardedVideoPlacementToListenerMap = new ConcurrentHashMap<>();
        this.rewardedVideoPlacementsForInitCallbacks = new CopyOnWriteArraySet<>();
    }

    private final boolean isValidPlacementId(String placementId) {
        return parseToLong(placementId) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadRewardedVideoForBidding$lambda$6$lambda$5(long j10, InMobiRewardedVideoAdListener inMobiRewardedVideoAdListener, InMobiRewardedVideoAdapter inMobiRewardedVideoAdapter, String str, String str2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        InMobiInterstitial inMobiInterstitial = new InMobiInterstitial(applicationContext, j10, inMobiRewardedVideoAdListener);
        inMobiRewardedVideoAdapter.placementToRewardedVideoAd.put(str, inMobiInterstitial);
        IronLog.ADAPTER_API.verbose("loadRewardedVideo InMobi ad with placementId: " + str);
        if (str2 == null) {
            inMobiInterstitial.setExtras(inMobiRewardedVideoAdapter.getAdapter().getExtrasMap());
            inMobiInterstitial.load();
            return;
        }
        try {
            byte[] bytes = str2.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            inMobiInterstitial.load(bytes);
        } catch (UnsupportedEncodingException unused) {
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
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

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    @Nullable
    public Map<String, Object> getRewardedVideoBiddingData(@NotNull JSONObject config, @Nullable JSONObject adData) {
        Intrinsics.checkNotNullParameter(config, "config");
        return getAdapter().getBiddingData();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(@Nullable String appKey, @Nullable String userId, @NotNull JSONObject config, @NotNull RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String strOptString = config.optString("placementId");
        String strOptString2 = config.optString(InMobiAdapter.ACCOUNT_ID);
        Intrinsics.checkNotNull(strOptString);
        if (!isValidPlacementId(strOptString)) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString("placementId"));
            listener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing placementId", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        Intrinsics.checkNotNull(strOptString2);
        if (strOptString2.length() == 0) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(InMobiAdapter.ACCOUNT_ID));
            listener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("empty accountId for $placementId - " + strOptString, IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = <" + strOptString + ">");
        this.mPlacementIdToListener.put(strOptString, listener);
        this.rewardedVideoPlacementsForInitCallbacks.add(strOptString);
        int i10 = WhenMappings.$EnumSwitchMapping$0[InMobiAdapter.INSTANCE.getInitState$inmobiadapter_release().ordinal()];
        if (i10 == 1) {
            ironLog.verbose("initRewardedVideo: init rv " + strOptString);
            listener.onRewardedVideoInitSuccess();
            return;
        }
        if (i10 == 2) {
            ironLog.verbose("initRewardedVideo - onRewardedVideoInitFailed");
            listener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("InMobi Sdk failed to initiate", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        } else {
            InMobiAdapter adapter = getAdapter();
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            adapter.initSDK(applicationContext, strOptString2);
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        String strOptString = config.optString("placementId");
        IronLog.ADAPTER_API.verbose("placementId = <" + strOptString + ">");
        InMobiInterstitial inMobiInterstitial = this.placementToRewardedVideoAd.get(strOptString);
        return inMobiInterstitial != null && inMobiInterstitial.isReady();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(@NotNull JSONObject config, @Nullable JSONObject adData, @Nullable final String serverData, @NotNull final RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        final String strOptString = config.optString("placementId");
        IronLog.ADAPTER_API.verbose("placementId = <" + strOptString + ">");
        Intrinsics.checkNotNull(strOptString);
        Long toLong = parseToLong(strOptString);
        if (toLong != null) {
            final long jLongValue = toLong.longValue();
            final InMobiRewardedVideoAdListener inMobiRewardedVideoAdListener = new InMobiRewardedVideoAdListener(listener, strOptString);
            postOnUIThread(new Runnable() { // from class: c4.b
                @Override // java.lang.Runnable
                public final void run() {
                    InMobiRewardedVideoAdapter.loadRewardedVideoForBidding$lambda$6$lambda$5(jLongValue, inMobiRewardedVideoAdListener, this, strOptString, serverData, listener);
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(@Nullable String error) {
        String str = "init failed: " + error;
        Collection<RewardedVideoSmashListener> collectionValues = this.rewardedVideoPlacementToListenerMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((RewardedVideoSmashListener) it.next()).onRewardedVideoInitFailed(new IronSourceError(508, str));
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        Boolean ageRestrictionCollectingUserData;
        if (getAdapter().shouldSetAgeRestrictedOnInitSuccess() && (ageRestrictionCollectingUserData = InMobiAdapter.INSTANCE.getAgeRestrictionCollectingUserData()) != null) {
            getAdapter().setAgeRestricted(ageRestrictionCollectingUserData.booleanValue());
        }
        Collection<RewardedVideoSmashListener> collectionValues = this.rewardedVideoPlacementToListenerMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((RewardedVideoSmashListener) it.next()).onRewardedVideoInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(@NotNull JSONObject config, @NotNull RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String strOptString = config.optString("placementId");
        if (!isRewardedVideoAvailable(config)) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString("placementId"));
            listener.onRewardedVideoAdShowFailed(ErrorBuilder.buildGenericError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        final InMobiInterstitial inMobiInterstitial = this.placementToRewardedVideoAd.get(strOptString);
        if (inMobiInterstitial != null) {
            IronLog.ADAPTER_API.verbose("show InMobi ad with placementId: " + strOptString);
            postOnUIThread(new Runnable() { // from class: c4.a
                @Override // java.lang.Runnable
                public final void run() {
                    inMobiInterstitial.show();
                }
            });
        }
    }
}
