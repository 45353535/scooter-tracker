package org.bidon.sdk.stats.impl;

import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.CoroutineScope;
import lf.i;
import lf.m;
import org.bidon.sdk.adapter.DemandAd;
import org.bidon.sdk.adapter.DemandId;
import org.bidon.sdk.ads.Ad;
import org.bidon.sdk.ads.AdType;
import org.bidon.sdk.auction.models.AdUnit;
import org.bidon.sdk.auction.models.BannerRequest;
import org.bidon.sdk.auction.models.InterstitialRequest;
import org.bidon.sdk.auction.models.RewardedRequest;
import org.bidon.sdk.auction.models.TokenInfo;
import org.bidon.sdk.databinders.extras.Extras;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.stats.StatisticsCollector;
import org.bidon.sdk.stats.models.BidStat;
import org.bidon.sdk.stats.models.BidType;
import org.bidon.sdk.stats.models.ImpressionRequestBody;
import org.bidon.sdk.stats.models.RoundStatus;
import org.bidon.sdk.stats.usecases.SendImpressionRequestUseCase;
import org.bidon.sdk.stats.usecases.SendWinLossRequestUseCase;
import org.bidon.sdk.stats.usecases.WinLossRequestData;
import org.bidon.sdk.utils.SdkDispatchers;
import org.bidon.sdk.utils.di.InstanceType;
import org.bidon.sdk.utils.di.SimpleDiStorage;
import org.bidon.sdk.utils.ext.LocalDateTimeExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0010\u00101\u001a\u0002022\u0006\u0010(\u001a\u00020)H\u0016J \u00103\u001a\u0002022\u0006\u0010,\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\"2\u0006\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u000202H\u0016J\b\u00107\u001a\u000202H\u0016J\b\u00108\u001a\u000202H\u0016J\u0018\u00109\u001a\u0002022\u0006\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u000205H\u0016J\b\u0010<\u001a\u000202H\u0016J\u0010\u0010=\u001a\u0002022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010>\u001a\u0002022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010?\u001a\u0002022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010@\u001a\u0002022\u0006\u0010A\u001a\u00020\tH\u0016J\u001f\u0010B\u001a\u0002022\u0006\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0002\u0010FJ\u001f\u0010G\u001a\u0002022\u0006\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0002\u0010KJ\u0010\u0010L\u001a\u0002022\u0006\u0010J\u001a\u000205H\u0016J\u0012\u0010M\u001a\u0002022\b\u0010N\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010O\u001a\u0002022\u0006\u0010P\u001a\u00020QH\u0016J\b\u0010R\u001a\u000202H\u0016J\b\u0010S\u001a\u000202H\u0016J\b\u0010T\u001a\u000202H\u0016J\b\u0010U\u001a\u00020$H\u0016J\b\u0010V\u001a\u00020\tH\u0016J\b\u0010W\u001a\u000202H\u0016J\u0010\u0010X\u001a\u00020Y2\u0006\u0010\n\u001a\u00020\u000bH\u0002J(\u0010Z\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\\\u0012\u0006\u0012\u0004\u0018\u00010]\u0012\u0006\u0012\u0004\u0018\u00010^0[2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\f\u0010_\u001a\u00020`*\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b\u001e\u0010\u001fR\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u0006a"}, d2 = {"Lorg/bidon/sdk/stats/impl/StatisticsCollectorImpl;", "Lorg/bidon/sdk/stats/StatisticsCollector;", "<init>", "()V", "auctionConfigurationId", "", "auctionConfigurationUid", "", "externalWinNotificationsEnabled", "", "adType", "Lorg/bidon/sdk/stats/StatisticsCollector$AdType;", "sendImpression", "Lorg/bidon/sdk/stats/usecases/SendImpressionRequestUseCase;", "getSendImpression", "()Lorg/bidon/sdk/stats/usecases/SendImpressionRequestUseCase;", "sendImpression$delegate", "Lkotlin/Lazy;", "sendLossRequest", "Lorg/bidon/sdk/stats/usecases/SendWinLossRequestUseCase;", "getSendLossRequest", "()Lorg/bidon/sdk/stats/usecases/SendWinLossRequestUseCase;", "sendLossRequest$delegate", "isShowSent", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isWinLossSent", "isClickSent", "isRewardSent", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope$delegate", "_demandAd", "Lorg/bidon/sdk/adapter/DemandAd;", AndroidDynamicDeviceInfoDataSource.KEY_STAT_CONTENT, "Lorg/bidon/sdk/stats/models/BidStat;", "demandAd", "getDemandAd", "()Lorg/bidon/sdk/adapter/DemandAd;", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "auctionId", "getAuctionId", "()Ljava/lang/String;", "getAd", "Lorg/bidon/sdk/ads/Ad;", "addDemandId", "", "addRoundInfo", "auctionPricefloor", "", "sendShowImpression", "sendClickImpression", "sendRewardImpression", "sendLoss", "winnerDemandId", "winnerPrice", "sendWin", "setStatisticAdType", "addAuctionConfigurationId", "addAuctionConfigurationUid", "addExternalWinNotificationsEnabled", "enabled", "markFillStarted", "adUnit", "Lorg/bidon/sdk/auction/models/AdUnit;", "pricefloor", "(Lorg/bidon/sdk/auction/models/AdUnit;Ljava/lang/Double;)V", "markFillFinished", "roundStatus", "Lorg/bidon/sdk/stats/models/RoundStatus;", "price", "(Lorg/bidon/sdk/stats/models/RoundStatus;Ljava/lang/Double;)V", "setPrice", "setDsp", "dspSource", "setTokenInfo", "tokenInfo", "Lorg/bidon/sdk/auction/models/TokenInfo;", "markWin", "markLoss", "markBelowPricefloor", "getStats", "canSendWinLoseNotifications", "markWinLoseNotificationsSent", "createImpressionRequestBody", "Lorg/bidon/sdk/stats/models/ImpressionRequestBody;", "getData", "Lkotlin/Triple;", "Lorg/bidon/sdk/auction/models/BannerRequest;", "Lorg/bidon/sdk/auction/models/InterstitialRequest;", "Lorg/bidon/sdk/auction/models/RewardedRequest;", "asAdType", "Lorg/bidon/sdk/ads/AdType;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StatisticsCollectorImpl implements StatisticsCollector {

    @Nullable
    private DemandAd _demandAd;
    private StatisticsCollector.AdType adType;
    private long auctionConfigurationId;

    @NotNull
    private String auctionConfigurationUid = "";
    private boolean externalWinNotificationsEnabled = true;

    /* JADX INFO: renamed from: sendImpression$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sendImpression = i.a(new Function0() { // from class: org.bidon.sdk.stats.impl.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StatisticsCollectorImpl.sendImpression_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: sendLossRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sendLossRequest = i.a(new Function0() { // from class: org.bidon.sdk.stats.impl.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StatisticsCollectorImpl.sendLossRequest_delegate$lambda$1();
        }
    });

    @NotNull
    private final AtomicBoolean isShowSent = new AtomicBoolean(false);

    @NotNull
    private final AtomicBoolean isWinLossSent = new AtomicBoolean(false);

    @NotNull
    private final AtomicBoolean isClickSent = new AtomicBoolean(false);

    @NotNull
    private final AtomicBoolean isRewardSent = new AtomicBoolean(false);

    /* JADX INFO: renamed from: scope$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scope = i.a(new Function0() { // from class: org.bidon.sdk.stats.impl.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StatisticsCollectorImpl.scope_delegate$lambda$2();
        }
    });

    @NotNull
    private BidStat stat = new BidStat(null, new DemandId(""), null, 0.0d, 0.0d, null, null, null, null, null);

    /* JADX INFO: renamed from: org.bidon.sdk.stats.impl.StatisticsCollectorImpl$sendClickImpression$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "org.bidon.sdk.stats.impl.StatisticsCollectorImpl$sendClickImpression$1", f = "StatisticsCollectorImpl.kt", l = {Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return StatisticsCollectorImpl.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                String key = SendImpressionRequestUseCase.Type.Click.getKey();
                StatisticsCollectorImpl statisticsCollectorImpl = StatisticsCollectorImpl.this;
                StatisticsCollector.AdType adType = statisticsCollectorImpl.adType;
                if (adType == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adType");
                    adType = null;
                }
                String code = statisticsCollectorImpl.asAdType(adType).getCode();
                SendImpressionRequestUseCase sendImpression = StatisticsCollectorImpl.this.getSendImpression();
                String str = key + "/" + code;
                StatisticsCollectorImpl statisticsCollectorImpl2 = StatisticsCollectorImpl.this;
                StatisticsCollector.AdType adType2 = statisticsCollectorImpl2.adType;
                if (adType2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adType");
                    adType2 = null;
                }
                ImpressionRequestBody impressionRequestBodyCreateImpressionRequestBody = statisticsCollectorImpl2.createImpressionRequestBody(adType2);
                Extras extras = StatisticsCollectorImpl.this._demandAd;
                Map<String, Object> extras2 = extras != null ? extras.getExtras() : null;
                if (extras2 == null) {
                    extras2 = MapsKt.emptyMap();
                }
                this.label = 1;
                if (sendImpression.mo8676invokeyxL6bBk(str, "bid", impressionRequestBodyCreateImpressionRequestBody, extras2, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
                ((Result) obj).l();
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.stats.impl.StatisticsCollectorImpl$sendLoss$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "org.bidon.sdk.stats.impl.StatisticsCollectorImpl$sendLoss$1", f = "StatisticsCollectorImpl.kt", l = {158}, m = "invokeSuspend")
    static final class C58241 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $winnerDemandId;
        final /* synthetic */ double $winnerPrice;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C58241(String str, double d10, Continuation continuation) {
            super(2, continuation);
            this.$winnerDemandId = str;
            this.$winnerPrice = d10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return StatisticsCollectorImpl.this.new C58241(this.$winnerDemandId, this.$winnerPrice, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                SendWinLossRequestUseCase sendLossRequest = StatisticsCollectorImpl.this.getSendLossRequest();
                String str = this.$winnerDemandId;
                double d10 = this.$winnerPrice;
                DemandAd demandAd = StatisticsCollectorImpl.this.getDemandAd();
                StatisticsCollectorImpl statisticsCollectorImpl = StatisticsCollectorImpl.this;
                StatisticsCollector.AdType adType = statisticsCollectorImpl.adType;
                if (adType == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adType");
                    adType = null;
                }
                WinLossRequestData.Loss loss = new WinLossRequestData.Loss(str, d10, demandAd, statisticsCollectorImpl.createImpressionRequestBody(adType));
                this.label = 1;
                if (sendLossRequest.mo8677invokegIAlus(loss, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
                ((Result) obj).l();
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C58241) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.stats.impl.StatisticsCollectorImpl$sendRewardImpression$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "org.bidon.sdk.stats.impl.StatisticsCollectorImpl$sendRewardImpression$1", f = "StatisticsCollectorImpl.kt", l = {POBCoreNativeConstants.POB_NATIVE_MAIN_IMG_H}, m = "invokeSuspend")
    static final class C58251 extends k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        C58251(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return StatisticsCollectorImpl.this.new C58251(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                String key = SendImpressionRequestUseCase.Type.Reward.getKey();
                StatisticsCollectorImpl statisticsCollectorImpl = StatisticsCollectorImpl.this;
                StatisticsCollector.AdType.Rewarded rewarded = StatisticsCollector.AdType.Rewarded.INSTANCE;
                String code = statisticsCollectorImpl.asAdType(rewarded).getCode();
                SendImpressionRequestUseCase sendImpression = StatisticsCollectorImpl.this.getSendImpression();
                String str = key + "/" + code;
                ImpressionRequestBody impressionRequestBodyCreateImpressionRequestBody = StatisticsCollectorImpl.this.createImpressionRequestBody(rewarded);
                Map<String, Object> extras = StatisticsCollectorImpl.this.getDemandAd().getExtras();
                this.label = 1;
                if (sendImpression.mo8676invokeyxL6bBk(str, "bid", impressionRequestBodyCreateImpressionRequestBody, extras, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
                ((Result) obj).l();
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C58251) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.stats.impl.StatisticsCollectorImpl$sendShowImpression$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "org.bidon.sdk.stats.impl.StatisticsCollectorImpl$sendShowImpression$1", f = "StatisticsCollectorImpl.kt", l = {116}, m = "invokeSuspend")
    static final class C58261 extends k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        C58261(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return StatisticsCollectorImpl.this.new C58261(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                String key = SendImpressionRequestUseCase.Type.Show.getKey();
                StatisticsCollectorImpl statisticsCollectorImpl = StatisticsCollectorImpl.this;
                StatisticsCollector.AdType adType = statisticsCollectorImpl.adType;
                StatisticsCollector.AdType adType2 = null;
                if (adType == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adType");
                    adType = null;
                }
                String code = statisticsCollectorImpl.asAdType(adType).getCode();
                SendImpressionRequestUseCase sendImpression = StatisticsCollectorImpl.this.getSendImpression();
                String str = key + "/" + code;
                StatisticsCollectorImpl statisticsCollectorImpl2 = StatisticsCollectorImpl.this;
                StatisticsCollector.AdType adType3 = statisticsCollectorImpl2.adType;
                if (adType3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adType");
                } else {
                    adType2 = adType3;
                }
                ImpressionRequestBody impressionRequestBodyCreateImpressionRequestBody = statisticsCollectorImpl2.createImpressionRequestBody(adType2);
                Map<String, Object> extras = StatisticsCollectorImpl.this.getDemandAd().getExtras();
                this.label = 1;
                if (sendImpression.mo8676invokeyxL6bBk(str, "bid", impressionRequestBodyCreateImpressionRequestBody, extras, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
                ((Result) obj).l();
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C58261) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.stats.impl.StatisticsCollectorImpl$sendWin$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "org.bidon.sdk.stats.impl.StatisticsCollectorImpl$sendWin$1", f = "StatisticsCollectorImpl.kt", l = {171}, m = "invokeSuspend")
    static final class C58271 extends k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        C58271(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return StatisticsCollectorImpl.this.new C58271(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                SendWinLossRequestUseCase sendLossRequest = StatisticsCollectorImpl.this.getSendLossRequest();
                DemandAd demandAd = StatisticsCollectorImpl.this.getDemandAd();
                StatisticsCollectorImpl statisticsCollectorImpl = StatisticsCollectorImpl.this;
                StatisticsCollector.AdType adType = statisticsCollectorImpl.adType;
                if (adType == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adType");
                    adType = null;
                }
                WinLossRequestData.Win win = new WinLossRequestData.Win(demandAd, statisticsCollectorImpl.createImpressionRequestBody(adType));
                this.label = 1;
                if (sendLossRequest.mo8677invokegIAlus(win, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
                ((Result) obj).l();
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C58271) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdType asAdType(StatisticsCollector.AdType adType) {
        if (adType instanceof StatisticsCollector.AdType.Banner) {
            return AdType.Banner;
        }
        if (Intrinsics.areEqual(adType, StatisticsCollector.AdType.Interstitial.INSTANCE)) {
            return AdType.Interstitial;
        }
        if (Intrinsics.areEqual(adType, StatisticsCollector.AdType.Rewarded.INSTANCE)) {
            return AdType.Rewarded;
        }
        throw new m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImpressionRequestBody createImpressionRequestBody(StatisticsCollector.AdType adType) {
        Triple data = getData(adType);
        BannerRequest bannerRequest = (BannerRequest) data.d();
        InterstitialRequest interstitialRequest = (InterstitialRequest) data.g();
        RewardedRequest rewardedRequest = (RewardedRequest) data.h();
        String auctionId = getAuctionId();
        long j10 = this.auctionConfigurationId;
        String str = this.auctionConfigurationUid;
        String demandId = getDemandId().getDemandId();
        double price = this.stat.getPrice();
        BidType bidType = this.stat.getBidType();
        String code = bidType != null ? bidType.getCode() : null;
        AdUnit adUnit = this.stat.getAdUnit();
        String label = adUnit != null ? adUnit.getLabel() : null;
        AdUnit adUnit2 = this.stat.getAdUnit();
        return new ImpressionRequestBody(this.stat.getAuctionPricefloor(), auctionId, code, j10, str, demandId, adUnit2 != null ? adUnit2.getUid() : null, label, price, bannerRequest, interstitialRequest, rewardedRequest);
    }

    private final Triple getData(StatisticsCollector.AdType adType) {
        if (adType instanceof StatisticsCollector.AdType.Banner) {
            return new Triple(new BannerRequest(((StatisticsCollector.AdType.Banner) adType).getFormat().getCode()), null, null);
        }
        if (Intrinsics.areEqual(adType, StatisticsCollector.AdType.Interstitial.INSTANCE)) {
            return new Triple(null, InterstitialRequest.INSTANCE, null);
        }
        if (Intrinsics.areEqual(adType, StatisticsCollector.AdType.Rewarded.INSTANCE)) {
            return new Triple(null, null, RewardedRequest.INSTANCE);
        }
        throw new m();
    }

    private final CoroutineScope getScope() {
        return (CoroutineScope) this.scope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SendImpressionRequestUseCase getSendImpression() {
        return (SendImpressionRequestUseCase) this.sendImpression.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SendWinLossRequestUseCase getSendLossRequest() {
        return (SendWinLossRequestUseCase) this.sendLossRequest.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope scope_delegate$lambda$2() {
        return kotlinx.coroutines.i.a(SdkDispatchers.INSTANCE.getIO());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SendImpressionRequestUseCase sendImpression_delegate$lambda$0() {
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(v0.b(SendImpressionRequestUseCase.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton != null) {
                return (SendImpressionRequestUseCase) singleton;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.stats.usecases.SendImpressionRequestUseCase");
        }
        if (instanceType instanceof InstanceType.Factory) {
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild != null) {
                return (SendImpressionRequestUseCase) objBuild;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.stats.usecases.SendImpressionRequestUseCase");
        }
        if (instanceType instanceof InstanceType.ParamFactory) {
            new InstanceType.ParamFactory.Params();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (instanceType != null) {
            throw new m();
        }
        throw new IllegalStateException(("No factory provided for class: " + SendImpressionRequestUseCase.class).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SendWinLossRequestUseCase sendLossRequest_delegate$lambda$1() {
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(v0.b(SendWinLossRequestUseCase.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton != null) {
                return (SendWinLossRequestUseCase) singleton;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.stats.usecases.SendWinLossRequestUseCase");
        }
        if (instanceType instanceof InstanceType.Factory) {
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild != null) {
                return (SendWinLossRequestUseCase) objBuild;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.stats.usecases.SendWinLossRequestUseCase");
        }
        if (instanceType instanceof InstanceType.ParamFactory) {
            new InstanceType.ParamFactory.Params();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (instanceType != null) {
            throw new m();
        }
        throw new IllegalStateException(("No factory provided for class: " + SendWinLossRequestUseCase.class).toString());
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationId(long auctionConfigurationId) {
        this.auctionConfigurationId = auctionConfigurationId;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addAuctionConfigurationUid(@NotNull String auctionConfigurationUid) {
        Intrinsics.checkNotNullParameter(auctionConfigurationUid, "auctionConfigurationUid");
        this.auctionConfigurationUid = auctionConfigurationUid;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addDemandId(@NotNull DemandId demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.stat = BidStat.copy$default(this.stat, null, demandId, null, 0.0d, 0.0d, null, null, null, null, null, 1021, null);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addExternalWinNotificationsEnabled(boolean enabled) {
        this.externalWinNotificationsEnabled = enabled;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void addRoundInfo(@NotNull String auctionId, @NotNull DemandAd demandAd, double auctionPricefloor) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this._demandAd = demandAd;
        this.stat = BidStat.copy$default(this.stat, auctionId, null, null, 0.0d, auctionPricefloor, null, null, null, null, null, 1006, null);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public boolean canSendWinLoseNotifications() {
        return this.externalWinNotificationsEnabled && !this.isWinLossSent.get();
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    @Nullable
    public Ad getAd() {
        String auctionId = this.stat.getAuctionId();
        BidType bidType = this.stat.getBidType();
        AdUnit adUnit = this.stat.getAdUnit();
        if (adUnit != null && auctionId != null && bidType != null) {
            return new Ad(getDemandAd(), this.stat.getPrice(), auctionId, this.stat.getDspSource(), "USD", adUnit);
        }
        LogExtKt.logError("StatisticsCollector", "Ad is null", new NullPointerException());
        return null;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    @NotNull
    public String getAuctionId() {
        String auctionId = this.stat.getAuctionId();
        if (auctionId != null) {
            return auctionId;
        }
        throw new IllegalArgumentException("AuctionId is not set");
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    @NotNull
    public DemandAd getDemandAd() {
        DemandAd demandAd = this._demandAd;
        if (demandAd != null) {
            return demandAd;
        }
        throw new IllegalArgumentException("DemandAd is not set");
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    @NotNull
    public DemandId getDemandId() {
        DemandId demandId = this.stat.getDemandId();
        if (demandId != null) {
            return demandId;
        }
        throw new IllegalArgumentException("DemandId is not set");
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    @NotNull
    /* JADX INFO: renamed from: getStats, reason: from getter */
    public BidStat getStat() {
        return this.stat;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markBelowPricefloor() {
        BidStat bidStat = this.stat;
        AdUnit adUnit = bidStat.getAdUnit();
        this.stat = BidStat.copy$default(bidStat, null, null, (adUnit != null ? adUnit.getBidType() : null) == BidType.RTB ? RoundStatus.Lose.INSTANCE : RoundStatus.BelowPricefloor.INSTANCE, 0.0d, 0.0d, null, null, null, null, null, 1019, null);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillFinished(@NotNull RoundStatus roundStatus, @Nullable Double price) {
        Intrinsics.checkNotNullParameter(roundStatus, "roundStatus");
        this.stat = BidStat.copy$default(this.stat, null, null, roundStatus, price != null ? price.doubleValue() : 0.0d, 0.0d, null, Long.valueOf(LocalDateTimeExtKt.getSystemTimeNow()), null, null, null, 947, null);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markFillStarted(@NotNull AdUnit adUnit, @Nullable Double pricefloor) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.stat = BidStat.copy$default(this.stat, null, null, null, pricefloor != null ? pricefloor.doubleValue() : this.stat.getPrice(), 0.0d, Long.valueOf(LocalDateTimeExtKt.getSystemTimeNow()), null, null, adUnit, null, 727, null);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markLoss() {
        this.stat = BidStat.copy$default(this.stat, null, null, RoundStatus.Lose.INSTANCE, 0.0d, 0.0d, null, null, null, null, null, 1019, null);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWin() {
        this.stat = BidStat.copy$default(this.stat, null, null, RoundStatus.Win.INSTANCE, 0.0d, 0.0d, null, null, null, null, null, 1019, null);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void markWinLoseNotificationsSent() {
        this.isWinLossSent.set(true);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendClickImpression() {
        if (this.isClickSent.getAndSet(true)) {
            return;
        }
        eg.i.d(getScope(), null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendLoss(@NotNull String winnerDemandId, double winnerPrice) {
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        eg.i.d(getScope(), null, null, new C58241(winnerDemandId, winnerPrice, null), 3, null);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendRewardImpression() {
        if (this.isRewardSent.getAndSet(true)) {
            return;
        }
        eg.i.d(getScope(), null, null, new C58251(null), 3, null);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendShowImpression() {
        if (this.isShowSent.getAndSet(true)) {
            return;
        }
        eg.i.d(getScope(), null, null, new C58261(null), 3, null);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void sendWin() {
        eg.i.d(getScope(), null, null, new C58271(null), 3, null);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setDsp(@Nullable String dspSource) {
        this.stat = BidStat.copy$default(this.stat, null, null, null, 0.0d, 0.0d, null, null, dspSource, null, null, 895, null);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setPrice(double price) {
        this.stat = BidStat.copy$default(this.stat, null, null, null, price, 0.0d, null, null, null, null, null, 1015, null);
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setStatisticAdType(@NotNull StatisticsCollector.AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.adType = adType;
    }

    @Override // org.bidon.sdk.stats.StatisticsCollector
    public void setTokenInfo(@NotNull TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(tokenInfo, "tokenInfo");
        this.stat = BidStat.copy$default(this.stat, null, null, null, 0.0d, 0.0d, null, null, null, null, tokenInfo, 511, null);
    }
}
