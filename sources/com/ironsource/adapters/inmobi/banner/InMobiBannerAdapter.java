package com.ironsource.adapters.inmobi.banner;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.InMobiBanner;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.N6;
import com.ironsource.adapters.inmobi.InMobiAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.adapter.AbstractBannerAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
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
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b \u0010!J=\u0010%\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010\u00162\b\u0010#\u001a\u0004\u0018\u00010\r2\b\u0010$\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b'\u0010(J3\u0010+\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010*\u0018\u00010)2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b+\u0010,R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u00101\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00180-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100¨\u00063"}, d2 = {"Lcom/ironsource/adapters/inmobi/banner/InMobiBannerAdapter;", "Lcom/ironsource/mediationsdk/adapter/AbstractBannerAdapter;", "Lcom/ironsource/adapters/inmobi/InMobiAdapter;", N6.G1, "<init>", "(Lcom/ironsource/adapters/inmobi/InMobiAdapter;)V", "Lcom/ironsource/mediationsdk/ISBannerSize;", "banner", "", "largeScreen", "Lcom/ironsource/adapters/inmobi/banner/InMobiBannerAdapter$Size;", "getDPSize", "(Lcom/ironsource/mediationsdk/ISBannerSize;Z)Lcom/ironsource/adapters/inmobi/banner/InMobiBannerAdapter$Size;", "", "placementId", "isValidPlacementId", "(Ljava/lang/String;)Z", "", "parseToLong", "(Ljava/lang/String;)Ljava/lang/Long;", "appKey", "userId", "Lorg/json/JSONObject;", "config", "Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "initBannerForBidding", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;)V", "onNetworkInitCallbackSuccess", "()V", "error", "onNetworkInitCallbackFailed", "(Ljava/lang/String;)V", "adData", C4424m2.f43620s, "bannerSize", "loadBannerForBidding", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Lcom/ironsource/mediationsdk/ISBannerSize;Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;)V", C4240b4.h.S, "(Lorg/json/JSONObject;)V", "", "", "getBannerBiddingData", "(Lorg/json/JSONObject;Lorg/json/JSONObject;)Ljava/util/Map;", "j$/util/concurrent/ConcurrentHashMap", "Lcom/inmobi/ads/InMobiBanner;", "placementToBannerAd", "Lj$/util/concurrent/ConcurrentHashMap;", "bannerPlacementToListenerMap", "Size", "inmobiadapter_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiBannerAdapter extends AbstractBannerAdapter<InMobiAdapter> {

    @NotNull
    private final ConcurrentHashMap<String, BannerSmashListener> bannerPlacementToListenerMap;

    @NotNull
    private final ConcurrentHashMap<String, InMobiBanner> placementToBannerAd;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/ironsource/adapters/inmobi/banner/InMobiBannerAdapter$Size;", "", "width", "", "height", "<init>", "(II)V", "getWidth", "()I", "getHeight", "inmobiadapter_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Size {
        private final int height;
        private final int width;

        public Size(int i10, int i11) {
            this.width = i10;
            this.height = i11;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }
    }

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
    public InMobiBannerAdapter(@NotNull InMobiAdapter adapter) {
        super(adapter);
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.placementToBannerAd = new ConcurrentHashMap<>();
        this.bannerPlacementToListenerMap = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r1.equals("BANNER") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        if (r1.equals(com.ironsource.mediationsdk.l.f44062b) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        return new com.ironsource.adapters.inmobi.banner.InMobiBannerAdapter.Size(320, 50);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.ironsource.adapters.inmobi.banner.InMobiBannerAdapter.Size getDPSize(com.ironsource.mediationsdk.ISBannerSize r6, boolean r7) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L8
            java.lang.String r1 = r6.getDescription()
            goto L9
        L8:
            r1 = r0
        L9:
            if (r1 == 0) goto L74
            int r2 = r1.hashCode()
            r3 = 50
            r4 = 320(0x140, float:4.48E-43)
            switch(r2) {
                case -387072689: goto L61;
                case 72205083: goto L52;
                case 79011241: goto L37;
                case 1951953708: goto L2e;
                case 1999208305: goto L17;
                default: goto L16;
            }
        L16:
            goto L74
        L17:
            java.lang.String r7 = "CUSTOM"
            boolean r7 = r1.equals(r7)
            if (r7 != 0) goto L20
            goto L74
        L20:
            com.ironsource.adapters.inmobi.banner.InMobiBannerAdapter$Size r7 = new com.ironsource.adapters.inmobi.banner.InMobiBannerAdapter$Size
            int r0 = r6.getWidth()
            int r6 = r6.getHeight()
            r7.<init>(r0, r6)
            return r7
        L2e:
            java.lang.String r6 = "BANNER"
            boolean r6 = r1.equals(r6)
            if (r6 != 0) goto L5b
            goto L74
        L37:
            java.lang.String r6 = "SMART"
            boolean r6 = r1.equals(r6)
            if (r6 != 0) goto L40
            goto L74
        L40:
            if (r7 == 0) goto L4c
            com.ironsource.adapters.inmobi.banner.InMobiBannerAdapter$Size r6 = new com.ironsource.adapters.inmobi.banner.InMobiBannerAdapter$Size
            r7 = 728(0x2d8, float:1.02E-42)
            r0 = 90
            r6.<init>(r7, r0)
            return r6
        L4c:
            com.ironsource.adapters.inmobi.banner.InMobiBannerAdapter$Size r6 = new com.ironsource.adapters.inmobi.banner.InMobiBannerAdapter$Size
            r6.<init>(r4, r3)
            return r6
        L52:
            java.lang.String r6 = "LARGE"
            boolean r6 = r1.equals(r6)
            if (r6 != 0) goto L5b
            goto L74
        L5b:
            com.ironsource.adapters.inmobi.banner.InMobiBannerAdapter$Size r6 = new com.ironsource.adapters.inmobi.banner.InMobiBannerAdapter$Size
            r6.<init>(r4, r3)
            return r6
        L61:
            java.lang.String r6 = "RECTANGLE"
            boolean r6 = r1.equals(r6)
            if (r6 != 0) goto L6a
            goto L74
        L6a:
            com.ironsource.adapters.inmobi.banner.InMobiBannerAdapter$Size r6 = new com.ironsource.adapters.inmobi.banner.InMobiBannerAdapter$Size
            r7 = 300(0x12c, float:4.2E-43)
            r0 = 250(0xfa, float:3.5E-43)
            r6.<init>(r7, r0)
            return r6
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adapters.inmobi.banner.InMobiBannerAdapter.getDPSize(com.ironsource.mediationsdk.ISBannerSize, boolean):com.ironsource.adapters.inmobi.banner.InMobiBannerAdapter$Size");
    }

    private final boolean isValidPlacementId(String placementId) {
        return parseToLong(placementId) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadBannerForBidding$lambda$6$lambda$5(ISBannerSize iSBannerSize, BannerSmashListener bannerSmashListener, long j10, String str, FrameLayout.LayoutParams layoutParams, Size size, InMobiBannerAdapter inMobiBannerAdapter, String str2) {
        if (iSBannerSize == null) {
            IronLog.INTERNAL.error("banner has been destroyed");
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("banner has been destroyed"));
            return;
        }
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        InMobiBanner inMobiBanner = new InMobiBanner(applicationContext, j10);
        Intrinsics.checkNotNull(str);
        inMobiBanner.setListener(new InMobiBannerAdListener(bannerSmashListener, str, layoutParams));
        inMobiBanner.setBannerSize(size.getWidth(), size.getHeight());
        inMobiBannerAdapter.placementToBannerAd.put(str, inMobiBanner);
        IronLog.ADAPTER_API.verbose("loadBanner InMobi ad");
        try {
            if (str2 == null) {
                inMobiBanner.setExtras(inMobiBannerAdapter.getAdapter().getExtrasMap());
                inMobiBanner.load();
                return;
            }
            try {
                byte[] bytes = str2.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                inMobiBanner.load(bytes);
            } catch (UnsupportedEncodingException unused) {
                bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Banner", "InMobi", "Couldn't parse server data for placementId = " + str));
            }
        } catch (Exception e10) {
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("InMobiAdapter loadBanner exception " + e10.getMessage()));
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

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        String strOptString = config.optString("placementId");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("placementId = <" + strOptString + ">");
        final InMobiBanner inMobiBanner = this.placementToBannerAd.get(strOptString);
        if (inMobiBanner != null) {
            ironLog.verbose("< destroyBanner InMobi ad, with placementId - " + strOptString + ">");
            postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.inmobi.banner.b
                @Override // java.lang.Runnable
                public final void run() {
                    inMobiBanner.destroy();
                }
            });
            this.placementToBannerAd.remove(strOptString);
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    @Nullable
    public Map<String, Object> getBannerBiddingData(@NotNull JSONObject config, @Nullable JSONObject adData) {
        Intrinsics.checkNotNullParameter(config, "config");
        return getAdapter().getBiddingData();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBannerForBidding(@Nullable String appKey, @Nullable String userId, @NotNull JSONObject config, @NotNull BannerSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("<" + config.optString("placementId") + ">");
        String strOptString = config.optString("placementId");
        String strOptString2 = config.optString(InMobiAdapter.ACCOUNT_ID);
        Intrinsics.checkNotNull(strOptString);
        if (!isValidPlacementId(strOptString)) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString("placementId"));
            listener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing placementId", "Banner"));
            return;
        }
        Intrinsics.checkNotNull(strOptString2);
        if (strOptString2.length() == 0) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(InMobiAdapter.ACCOUNT_ID));
            listener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Empty accountId", "Banner"));
            return;
        }
        this.bannerPlacementToListenerMap.put(strOptString, listener);
        int i10 = WhenMappings.$EnumSwitchMapping$0[InMobiAdapter.INSTANCE.getInitState$inmobiadapter_release().ordinal()];
        if (i10 == 1) {
            ironLog.verbose("initBanners: succeeded with placementId - " + strOptString);
            listener.onBannerInitSuccess();
            return;
        }
        if (i10 != 2) {
            InMobiAdapter adapter = getAdapter();
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            adapter.initSDK(applicationContext, strOptString2);
            return;
        }
        ironLog.verbose("initBanners: failed with placementId - " + strOptString);
        listener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Init Failed", "Banner"));
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(@NotNull JSONObject config, @Nullable JSONObject adData, @Nullable final String serverData, @Nullable final ISBannerSize bannerSize, @NotNull final BannerSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.ADAPTER_API.verbose();
        final String strOptString = config.optString("placementId");
        final Size dPSize = getDPSize(bannerSize, AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()));
        if (dPSize == null) {
            IronLog.INTERNAL.error("dpSize == null");
            listener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize("InMobi"));
            return;
        }
        final FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(ContextProvider.getInstance().getApplicationContext(), dPSize.getWidth()), AdapterUtils.dpToPixels(ContextProvider.getInstance().getApplicationContext(), dPSize.getHeight()));
        layoutParams.gravity = 17;
        Intrinsics.checkNotNull(strOptString);
        Long toLong = parseToLong(strOptString);
        if (toLong != null) {
            final long jLongValue = toLong.longValue();
            postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.inmobi.banner.a
                @Override // java.lang.Runnable
                public final void run() {
                    InMobiBannerAdapter.loadBannerForBidding$lambda$6$lambda$5(bannerSize, listener, jLongValue, strOptString, layoutParams, dPSize, this, serverData);
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(@Nullable String error) {
        String str = "init failed: " + error;
        Collection<BannerSmashListener> collectionValues = this.bannerPlacementToListenerMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((BannerSmashListener) it.next()).onBannerInitFailed(new IronSourceError(508, str));
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        Boolean ageRestrictionCollectingUserData;
        if (getAdapter().shouldSetAgeRestrictedOnInitSuccess() && (ageRestrictionCollectingUserData = InMobiAdapter.INSTANCE.getAgeRestrictionCollectingUserData()) != null) {
            getAdapter().setAgeRestricted(ageRestrictionCollectingUserData.booleanValue());
        }
        Collection<BannerSmashListener> collectionValues = this.bannerPlacementToListenerMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((BannerSmashListener) it.next()).onBannerInitSuccess();
        }
    }
}
