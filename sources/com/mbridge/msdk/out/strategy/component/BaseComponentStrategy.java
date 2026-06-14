package com.mbridge.msdk.out.strategy.component;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.strategy.component.BaseComponentStrategy;
import com.my.target.common.menu.MenuActionType;
import java.util.HashMap;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseComponentStrategy {
    protected static final long DEFAULT_TIMEOUT_MS = 3000;
    protected static final Handler MAIN_HANDLER = new Handler(Looper.getMainLooper());
    protected static final String TAG = "BaseComponentStrategy";
    protected int adType;
    protected String bidToken;
    protected String extraData;
    protected com.mbridge.msdk.config.manager.callback.b mComponentCallbackListener;
    protected NewInterstitialListener newInterstitialListener;
    protected String placementId;
    protected com.mbridge.msdk.video.bt.module.orglistener.g rewardVideoListener;
    protected String unitId;
    protected String userId;
    protected boolean isReady = true;
    protected boolean isRewardPlusOpen = false;
    protected int isSilent = 0;
    protected Map<String, Object> developerSettingMap = new HashMap();
    protected volatile boolean isQuerying = false;
    protected volatile Looper triggerThreadLooper = null;

    /* JADX INFO: renamed from: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$1, reason: invalid class name */
    class AnonymousClass1 implements com.mbridge.msdk.config.manager.callback.b {
        AnonymousClass1() {
        }

        public static /* synthetic */ void a(AnonymousClass1 anonymousClass1, MBridgeIds mBridgeIds) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onVideoLoadSuccess(mBridgeIds);
            }
        }

        public static /* synthetic */ void b(AnonymousClass1 anonymousClass1, MBridgeIds mBridgeIds) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onEndcardShow(mBridgeIds);
            }
        }

        public static /* synthetic */ void c(AnonymousClass1 anonymousClass1, MBridgeIds mBridgeIds) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onVideoComplete(mBridgeIds);
            }
        }

        public static /* synthetic */ void d(AnonymousClass1 anonymousClass1, MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onAdClose(mBridgeIds, rewardInfo);
            }
        }

        public static /* synthetic */ void e(AnonymousClass1 anonymousClass1, MBridgeIds mBridgeIds, String str) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onVideoLoadFail(mBridgeIds, str);
            }
        }

        public static /* synthetic */ void f(AnonymousClass1 anonymousClass1, MBridgeIds mBridgeIds) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onVideoAdClicked(mBridgeIds);
            }
        }

        public static /* synthetic */ void g(AnonymousClass1 anonymousClass1, MBridgeIds mBridgeIds, String str) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onShowFail(mBridgeIds, str);
            }
        }

        public static /* synthetic */ void h(AnonymousClass1 anonymousClass1, MBridgeIds mBridgeIds) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onAdShow(mBridgeIds);
            }
        }

        public static /* synthetic */ void i(AnonymousClass1 anonymousClass1, MBridgeIds mBridgeIds) {
            com.mbridge.msdk.video.bt.module.orglistener.g gVar = BaseComponentStrategy.this.rewardVideoListener;
            if (gVar != null) {
                gVar.onLoadSuccess(mBridgeIds);
            }
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onAdClose(final MBridgeIds mBridgeIds, final RewardInfo rewardInfo) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.c
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.d(this.f50017b, mBridgeIds, rewardInfo);
                }
            });
        }

        public void onAdCloseWithIVReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onAdShow(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.a
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.h(this.f50012b, mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onEndCardShow(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.d
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.b(this.f50020b, mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onLoadSuccess(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.h
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.i(this.f50029b, mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onShowFail(final MBridgeIds mBridgeIds, final String str) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.g
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.g(this.f50026b, mBridgeIds, str);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoAdClicked(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.f
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.f(this.f50024b, mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoComplete(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.e
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.c(this.f50022b, mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoLoadFail(final MBridgeIds mBridgeIds, final String str) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.b
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.e(this.f50014b, mBridgeIds, str);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoLoadSuccess(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.i
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass1.a(this.f50031b, mBridgeIds);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.out.strategy.component.BaseComponentStrategy$2, reason: invalid class name */
    class AnonymousClass2 implements com.mbridge.msdk.config.manager.callback.b {
        AnonymousClass2() {
        }

        public static /* synthetic */ void a(AnonymousClass2 anonymousClass2, MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onLoadCampaignSuccess(mBridgeIds);
            }
        }

        public static /* synthetic */ void b(AnonymousClass2 anonymousClass2, MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onResourceLoadSuccess(mBridgeIds);
            }
        }

        public static /* synthetic */ void c(AnonymousClass2 anonymousClass2, MBridgeIds mBridgeIds, String str) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onResourceLoadFail(mBridgeIds, str);
            }
        }

        public static /* synthetic */ void d(AnonymousClass2 anonymousClass2, MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onAdClose(mBridgeIds, rewardInfo);
            }
        }

        public static /* synthetic */ void e(AnonymousClass2 anonymousClass2, MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onAdShow(mBridgeIds);
            }
        }

        public static /* synthetic */ void f(AnonymousClass2 anonymousClass2, MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onAdClicked(mBridgeIds);
            }
        }

        public static /* synthetic */ void g(AnonymousClass2 anonymousClass2, MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onEndcardShow(mBridgeIds);
            }
        }

        public static /* synthetic */ void h(AnonymousClass2 anonymousClass2, MBridgeIds mBridgeIds, String str) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onShowFail(mBridgeIds, str);
            }
        }

        public static /* synthetic */ void i(AnonymousClass2 anonymousClass2, MBridgeIds mBridgeIds) {
            NewInterstitialListener newInterstitialListener = BaseComponentStrategy.this.newInterstitialListener;
            if (newInterstitialListener != null) {
                newInterstitialListener.onVideoComplete(mBridgeIds);
            }
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onAdClose(final MBridgeIds mBridgeIds, final RewardInfo rewardInfo) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.m
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.d(this.f50040b, mBridgeIds, rewardInfo);
                }
            });
        }

        public void onAdCloseWithIVReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onAdShow(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.n
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.e(this.f50043b, mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onEndCardShow(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.k
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.g(this.f50035b, mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onLoadSuccess(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.o
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.a(this.f50045b, mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onShowFail(final MBridgeIds mBridgeIds, final String str) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.l
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.h(this.f50037b, mBridgeIds, str);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoAdClicked(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.j
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.f(this.f50033b, mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoComplete(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.p
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.i(this.f50047b, mBridgeIds);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoLoadFail(final MBridgeIds mBridgeIds, final String str) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.q
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.c(this.f50049b, mBridgeIds, str);
                }
            });
        }

        @Override // com.mbridge.msdk.config.manager.callback.b
        public void onVideoLoadSuccess(final MBridgeIds mBridgeIds) {
            BaseComponentStrategy.this.threadConsistentCallback(new Runnable() { // from class: com.mbridge.msdk.out.strategy.component.r
                @Override // java.lang.Runnable
                public final void run() {
                    BaseComponentStrategy.AnonymousClass2.b(this.f50052b, mBridgeIds);
                }
            });
        }
    }

    public BaseComponentStrategy(String str, String str2, int i10) {
        this.placementId = str;
        this.unitId = str2;
        this.adType = i10;
        String str3 = i10 == 94 ? "rv_init" : i10 == 287 ? "iv_init" : "";
        if (!TextUtils.isEmpty(str3)) {
            sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), str3, null);
        }
        recordTriggerThread();
    }

    private com.mbridge.msdk.config.manager.callback.b createInterstitialVideoListener() {
        return new AnonymousClass2();
    }

    private com.mbridge.msdk.config.manager.callback.b createRewardVideoListener() {
        return new AnonymousClass1();
    }

    public void clearBitmapCache() {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a();
    }

    public void clearVideoCache() {
        o0.b();
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "clear_video_cache", null);
    }

    public String getCreativeIdWithUnitId() {
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "get_creative_id", null);
        if (com.mbridge.msdk.config.manager.a.b().a().b("creativeId") == null) {
            return "";
        }
        Object objB = com.mbridge.msdk.config.manager.a.b().a().b("creativeId");
        if (!(objB instanceof Map)) {
            return "";
        }
        Object obj = ((Map) objB).get(this.unitId);
        return obj instanceof String ? (String) obj : "";
    }

    public String getRequestId() {
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "get_request_id", null);
        if (com.mbridge.msdk.config.manager.a.b().a().b("requestId") == null) {
            return "";
        }
        Object objB = com.mbridge.msdk.config.manager.a.b().a().b("requestId");
        return objB instanceof String ? (String) objB : "";
    }

    protected synchronized boolean isReadyWithSyncWait(boolean z10) {
        if (this.isQuerying) {
            return false;
        }
        try {
            try {
                this.isQuerying = true;
                com.mbridge.msdk.config.component.common.util.a aVar = new com.mbridge.msdk.config.component.common.util.a();
                g5.a aVar2 = new g5.a(aVar);
                HashMap map = new HashMap();
                map.put("callback", aVar2);
                HashMap map2 = new HashMap();
                map2.put("sdk_context", map);
                sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "is_ready", map2);
                Map map3 = (Map) aVar.a(3000L);
                this.isQuerying = false;
                if (map3 != null) {
                    Object obj = map3.get("ready_state");
                    if (obj instanceof Boolean) {
                        return ((Boolean) obj).booleanValue();
                    }
                }
                return false;
            } catch (Exception e10) {
                q0.b(TAG, "isReadyWithSyncWait error: " + e10.getMessage(), e10);
                return false;
            }
        } catch (InterruptedException e11) {
            q0.b(TAG, "isReadyWithSyncWait interrupted: " + e11.getMessage(), e11);
            return false;
        }
    }

    public void playVideoMute(int i10) {
        this.isSilent = i10;
        this.developerSettingMap.put("mute_state", Integer.valueOf(i10));
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), Reporting.EventType.VIDEO_MUTE, null);
    }

    protected void recordTriggerThread() {
        this.triggerThreadLooper = Looper.myLooper();
    }

    protected void sendApiCallEvent(String str, String str2, Map<String, Object> map) {
        try {
            HashMap map2 = new HashMap();
            map2.put(Reporting.Key.PLACEMENT_ID, this.placementId);
            map2.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.unitId);
            map2.put("ad_type", Integer.valueOf(this.adType));
            map2.putAll(this.developerSettingMap);
            if (map != null && !map.isEmpty()) {
                map2.putAll(map);
            }
            if (!map2.containsKey("sdk_context")) {
                HashMap map3 = new HashMap();
                map3.put("callback", this.mComponentCallbackListener);
                map2.put("sdk_context", map3);
            }
            com.mbridge.msdk.config.manager.a.b().a(str, str2, map2);
        } catch (Exception e10) {
            q0.b(TAG, "sendComponentEvent error: " + e10.getMessage(), e10);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        try {
            HashMap map = new HashMap();
            map.put("title", str);
            map.put("content", str2);
            map.put("confirm", str3);
            map.put(MenuActionType.CANCEL, str4);
            this.developerSettingMap.put("dialog_config", map);
            sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "set_alert_text", map);
        } catch (Exception e10) {
            q0.b(TAG, "BaseComponentStrategy setAlertDialogText error: " + e10.getMessage(), e10);
        }
    }

    public void setExtraInfo(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        HashMap map = new HashMap();
        map.put("extra_info", jSONObject);
        this.developerSettingMap.put("extra_info", jSONObject);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "set_extra_info", map);
    }

    public void setIVRewardEnable(int i10, int i11) {
        int i12 = i10 == com.mbridge.msdk.foundation.same.a.H ? 2 : i10;
        if (i10 == com.mbridge.msdk.foundation.same.a.I) {
            i12 = 4;
        }
        HashMap map = new HashMap();
        map.put("ivReward_type", Integer.valueOf(i12));
        map.put("ivReward_value", Integer.valueOf(i11));
        this.developerSettingMap.put("iv_reward", map);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "iv_reward", map);
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.newInterstitialListener = newInterstitialListener;
        this.mComponentCallbackListener = createInterstitialVideoListener();
    }

    public void setRewardPlus(boolean z10) {
        this.isRewardPlusOpen = z10;
        this.developerSettingMap.put("reward_plus_open", Boolean.valueOf(z10));
        HashMap map = new HashMap();
        map.put("reward_plus_open", Boolean.valueOf(z10));
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "set_reward_plus", map);
    }

    @Deprecated
    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.newInterstitialListener = newInterstitialListener;
        this.mComponentCallbackListener = createInterstitialVideoListener();
    }

    protected void threadConsistentCallback(Runnable runnable) {
        if (this.triggerThreadLooper == Looper.getMainLooper()) {
            MAIN_HANDLER.post(runnable);
        } else {
            runnable.run();
        }
    }

    public void setRewardVideoListener(com.mbridge.msdk.video.bt.module.orglistener.g gVar) {
        this.rewardVideoListener = gVar;
        this.mComponentCallbackListener = createRewardVideoListener();
    }

    public void setIVRewardEnable(int i10, double d10) {
        int i11 = i10 == com.mbridge.msdk.foundation.same.a.H ? 1 : i10;
        if (i10 == com.mbridge.msdk.foundation.same.a.I) {
            i11 = 3;
        }
        HashMap map = new HashMap();
        map.put("ivReward_type", Integer.valueOf(i11));
        map.put("ivReward_value", Double.valueOf(d10));
        this.developerSettingMap.put("iv_reward", map);
        sendApiCallEvent(com.mbridge.msdk.config.component.common.util.c.a(), "iv_reward", map);
    }
}
