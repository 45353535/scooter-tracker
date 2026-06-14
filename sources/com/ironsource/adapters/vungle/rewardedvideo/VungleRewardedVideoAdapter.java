package com.ironsource.adapters.vungle.rewardedvideo;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.N6;
import com.ironsource.adapters.vungle.VungleAdapter;
import com.ironsource.adapters.vungle.rewardedvideo.VungleRewardedVideoAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vungle.ads.AdConfig;
import com.vungle.ads.FullscreenAd;
import com.vungle.ads.RewardedAd;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0012\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001a\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\"H\u0000¢\u0006\u0004\b&\u0010'J)\u0010+\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R \u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002000-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R \u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010/R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u0006038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010/¨\u00067"}, d2 = {"Lcom/ironsource/adapters/vungle/rewardedvideo/VungleRewardedVideoAdapter;", "Lcom/ironsource/mediationsdk/adapter/AbstractRewardedVideoAdapter;", "Lcom/ironsource/adapters/vungle/VungleAdapter;", N6.G1, "<init>", "(Lcom/ironsource/adapters/vungle/VungleAdapter;)V", "", "placementId", "Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, C4424m2.f43620s, "", "loadRewardedVideoInternal", "(Ljava/lang/String;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;Ljava/lang/String;)V", "appKey", "userId", "Lorg/json/JSONObject;", "config", "initRewardedVideoWithCallback", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V", "onNetworkInitCallbackSuccess", "()V", "error", "onNetworkInitCallbackFailed", "(Ljava/lang/String;)V", "adData", "initAndLoadRewardedVideo", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V", "loadRewardedVideoForBidding", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V", "loadRewardedVideo", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V", C4240b4.h.f42594i, "(Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V", "", "isRewardedVideoAvailable", "(Lorg/json/JSONObject;)Z", "isAvailable", "setRewardedVideoAdAvailability$vungleadapter_release", "(Ljava/lang/String;Z)V", "setRewardedVideoAdAvailability", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", "biddingDataCallback", "collectRewardedVideoBiddingData", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;)V", "j$/util/concurrent/ConcurrentHashMap", "mPlacementIdToListener", "Lj$/util/concurrent/ConcurrentHashMap;", "Lcom/vungle/ads/RewardedAd;", "mPlacementToRewardedVideoAd", "mRewardedVideoPlacementToListenerMap", "Ljava/util/concurrent/CopyOnWriteArraySet;", "mRewardedVideoPlacementIdsForInitCallbacks", "Ljava/util/concurrent/CopyOnWriteArraySet;", "mPlacementIdToAdAvailability", "vungleadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VungleRewardedVideoAdapter extends AbstractRewardedVideoAdapter<VungleAdapter> {

    @NotNull
    private final ConcurrentHashMap<String, Boolean> mPlacementIdToAdAvailability;

    @NotNull
    private final ConcurrentHashMap<String, RewardedVideoSmashListener> mPlacementIdToListener;

    @NotNull
    private final ConcurrentHashMap<String, RewardedAd> mPlacementToRewardedVideoAd;

    @NotNull
    private final CopyOnWriteArraySet<String> mRewardedVideoPlacementIdsForInitCallbacks;

    @NotNull
    private final ConcurrentHashMap<String, RewardedVideoSmashListener> mRewardedVideoPlacementToListenerMap;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VungleAdapter.Companion.InitState.values().length];
            try {
                iArr[VungleAdapter.Companion.InitState.INIT_STATE_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VungleAdapter.Companion.InitState.INIT_STATE_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleRewardedVideoAdapter(@NotNull VungleAdapter adapter) {
        super(adapter);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.mPlacementIdToListener = new ConcurrentHashMap<>();
        this.mPlacementToRewardedVideoAd = new ConcurrentHashMap<>();
        this.mRewardedVideoPlacementToListenerMap = new ConcurrentHashMap<>();
        this.mRewardedVideoPlacementIdsForInitCallbacks = new CopyOnWriteArraySet<>();
        this.mPlacementIdToAdAvailability = new ConcurrentHashMap<>();
    }

    private final void loadRewardedVideoInternal(String placementId, RewardedVideoSmashListener listener, String serverData) {
        IronLog.ADAPTER_API.verbose("loadRewardedVideo Vungle ad with placementId = " + placementId);
        setRewardedVideoAdAvailability$vungleadapter_release(placementId, false);
        VungleRewardedVideoAdListener vungleRewardedVideoAdListener = new VungleRewardedVideoAdListener(new WeakReference(this), listener, placementId);
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getInstance().applicationContext");
        RewardedAd rewardedAd = new RewardedAd(applicationContext, placementId, new AdConfig());
        rewardedAd.setAdListener(vungleRewardedVideoAdListener);
        this.mPlacementToRewardedVideoAd.put(placementId, rewardedAd);
        rewardedAd.load(serverData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRewardedVideo$lambda$4(RewardedAd rewardedAd) {
        if (rewardedAd != null) {
            FullscreenAd.DefaultImpls.play$default(rewardedAd, null, 1, null);
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void collectRewardedVideoBiddingData(@NotNull JSONObject config, @Nullable JSONObject adData, @NotNull BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        getAdapter().collectBiddingData(biddingDataCallback);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initAndLoadRewardedVideo(@Nullable String appKey, @Nullable String userId, @NotNull JSONObject config, @Nullable JSONObject adData, @NotNull RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String placementId = config.optString(VungleAdapter.PLACEMENT_ID);
        String appId = config.optString(VungleAdapter.APP_ID);
        if (placementId == null || placementId.length() == 0) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(VungleAdapter.PLACEMENT_ID));
            listener.onRewardedVideoAvailabilityChanged(false);
            return;
        }
        if (appId == null || appId.length() == 0) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(VungleAdapter.APP_ID));
            listener.onRewardedVideoAvailabilityChanged(false);
            return;
        }
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + placementId + ", appId = " + appId);
        ConcurrentHashMap<String, RewardedVideoSmashListener> concurrentHashMap = this.mRewardedVideoPlacementToListenerMap;
        Intrinsics.checkNotNullExpressionValue(placementId, "placementId");
        concurrentHashMap.put(placementId, listener);
        int i10 = WhenMappings.$EnumSwitchMapping$0[VungleAdapter.INSTANCE.getMInitState$vungleadapter_release().ordinal()];
        if (i10 == 1) {
            ironLog.verbose("initRewardedVideo: load rv " + placementId);
            loadRewardedVideoInternal(placementId, listener, null);
            return;
        }
        if (i10 == 2) {
            ironLog.verbose("initRewardedVideo - onRewardedVideoAvailabilityChanged(false)");
            listener.onRewardedVideoAvailabilityChanged(false);
            return;
        }
        VungleAdapter adapter = getAdapter();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getInstance().applicationContext");
        Intrinsics.checkNotNullExpressionValue(appId, "appId");
        adapter.initSDK(applicationContext, appId);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(@Nullable String appKey, @Nullable String userId, @NotNull JSONObject config, @NotNull RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String placementId = config.optString(VungleAdapter.PLACEMENT_ID);
        String appId = config.optString(VungleAdapter.APP_ID);
        if (placementId == null || placementId.length() == 0) {
            IronLog ironLog = IronLog.INTERNAL;
            Intrinsics.checkNotNullExpressionValue(placementId, "placementId");
            ironLog.error(getAdUnitIdMissingErrorString(placementId));
            listener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(placementId), IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        if (appId == null || appId.length() == 0) {
            IronLog ironLog2 = IronLog.INTERNAL;
            Intrinsics.checkNotNullExpressionValue(appId, "appId");
            ironLog2.error(getAdUnitIdMissingErrorString(appId));
            listener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(appId), IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        IronLog.ADAPTER_API.verbose("placementId = " + placementId + ", appId = " + appId);
        ConcurrentHashMap<String, RewardedVideoSmashListener> concurrentHashMap = this.mPlacementIdToListener;
        Intrinsics.checkNotNullExpressionValue(placementId, "placementId");
        concurrentHashMap.put(placementId, listener);
        this.mRewardedVideoPlacementIdsForInitCallbacks.add(placementId);
        int i10 = WhenMappings.$EnumSwitchMapping$0[getAdapter().getInitState().ordinal()];
        if (i10 == 1) {
            listener.onRewardedVideoInitSuccess();
            return;
        }
        if (i10 == 2) {
            listener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Vungle SDK Init Failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        VungleAdapter adapter = getAdapter();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getInstance().applicationContext");
        Intrinsics.checkNotNullExpressionValue(appId, "appId");
        adapter.initSDK(applicationContext, appId);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(@NotNull JSONObject config) {
        RewardedAd rewardedAd;
        Intrinsics.checkNotNullParameter(config, "config");
        String placementId = config.optString(VungleAdapter.PLACEMENT_ID);
        IronLog.ADAPTER_API.verbose("placementId = <" + placementId + ">");
        Intrinsics.checkNotNullExpressionValue(placementId, "placementId");
        if (placementId.length() == 0) {
            return false;
        }
        Boolean bool = this.mPlacementIdToAdAvailability.get(placementId);
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        if (bool.booleanValue() && (rewardedAd = this.mPlacementToRewardedVideoAd.get(placementId)) != null) {
            return rewardedAd.canPlayAd().booleanValue();
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideo(@NotNull JSONObject config, @Nullable JSONObject adData, @NotNull RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String placementId = config.optString(VungleAdapter.PLACEMENT_ID);
        IronLog.ADAPTER_API.verbose("placementId = " + placementId);
        Intrinsics.checkNotNullExpressionValue(placementId, "placementId");
        loadRewardedVideoInternal(placementId, listener, null);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(@NotNull JSONObject config, @Nullable JSONObject adData, @Nullable String serverData, @NotNull RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String placementId = config.optString(VungleAdapter.PLACEMENT_ID);
        IronLog.ADAPTER_API.verbose("placementId = " + placementId);
        Intrinsics.checkNotNullExpressionValue(placementId, "placementId");
        loadRewardedVideoInternal(placementId, listener, serverData);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(@Nullable String error) {
        for (Map.Entry<String, RewardedVideoSmashListener> entry : this.mRewardedVideoPlacementToListenerMap.entrySet()) {
            String key = entry.getKey();
            RewardedVideoSmashListener value = entry.getValue();
            if (this.mRewardedVideoPlacementIdsForInitCallbacks.contains(key)) {
                value.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError(error, IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                value.onRewardedVideoAvailabilityChanged(false);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        Set<Map.Entry<String, RewardedVideoSmashListener>> setEntrySet = this.mRewardedVideoPlacementToListenerMap.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "mRewardedVideoPlacementToListenerMap.entries");
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Intrinsics.checkNotNullExpressionValue(entry, "(rewardedVideoPlacement, rewardedVideoListener)");
            String rewardedVideoPlacement = (String) entry.getKey();
            RewardedVideoSmashListener rewardedVideoListener = (RewardedVideoSmashListener) entry.getValue();
            if (this.mRewardedVideoPlacementIdsForInitCallbacks.contains(rewardedVideoPlacement)) {
                rewardedVideoListener.onRewardedVideoInitSuccess();
            } else {
                Intrinsics.checkNotNullExpressionValue(rewardedVideoPlacement, "rewardedVideoPlacement");
                Intrinsics.checkNotNullExpressionValue(rewardedVideoListener, "rewardedVideoListener");
                loadRewardedVideoInternal(rewardedVideoPlacement, rewardedVideoListener, null);
            }
        }
    }

    public final void setRewardedVideoAdAvailability$vungleadapter_release(@NotNull String placementId, boolean isAvailable) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.mPlacementIdToAdAvailability.put(placementId, Boolean.valueOf(isAvailable));
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractRewardedVideoAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(@NotNull JSONObject config, @NotNull RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String placementId = config.optString(VungleAdapter.PLACEMENT_ID);
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = " + placementId);
        if (!isRewardedVideoAvailable(config)) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(VungleAdapter.PLACEMENT_ID));
            listener.onRewardedVideoAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        final RewardedAd rewardedAd = this.mPlacementToRewardedVideoAd.get(placementId);
        String dynamicUserId = getAdapter().getDynamicUserId();
        if (dynamicUserId != null && rewardedAd != null) {
            rewardedAd.setUserId(dynamicUserId);
        }
        ironLog.verbose("showRewardedVideo vungle ad " + placementId);
        postOnUIThread(new Runnable() { // from class: k4.a
            @Override // java.lang.Runnable
            public final void run() {
                VungleRewardedVideoAdapter.showRewardedVideo$lambda$4(rewardedAd);
            }
        });
        Intrinsics.checkNotNullExpressionValue(placementId, "placementId");
        setRewardedVideoAdAvailability$vungleadapter_release(placementId, false);
    }
}
