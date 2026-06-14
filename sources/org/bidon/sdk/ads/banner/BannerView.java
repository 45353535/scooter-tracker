package org.bidon.sdk.ads.banner;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.A1;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import eg.e1;
import eg.o0;
import hg.l0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.bidon.sdk.BidonSdk;
import org.bidon.sdk.R;
import org.bidon.sdk.adapter.AdEvent;
import org.bidon.sdk.adapter.AdSource;
import org.bidon.sdk.adapter.AdViewHolder;
import org.bidon.sdk.adapter.DemandAd;
import org.bidon.sdk.adapter.ext.AdSourceExtKt;
import org.bidon.sdk.ads.Ad;
import org.bidon.sdk.ads.AdType;
import org.bidon.sdk.ads.AuctionInfo;
import org.bidon.sdk.ads.InitAwaiter;
import org.bidon.sdk.ads.InitAwaiterImpl;
import org.bidon.sdk.ads.banner.ext.BannerFormatExtKt;
import org.bidon.sdk.ads.banner.helper.AdLifecycle;
import org.bidon.sdk.ads.banner.helper.LogLifecycleAdStateUseCase;
import org.bidon.sdk.ads.banner.helper.UserBannerListenerWrapperKt;
import org.bidon.sdk.auction.AdTypeParam;
import org.bidon.sdk.auction.Auction;
import org.bidon.sdk.auction.models.AuctionResult;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.config.impl.BidonErrorExtKt;
import org.bidon.sdk.databinders.extras.Extras;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.utils.SdkDispatchers;
import org.bidon.sdk.utils.di.InstanceType;
import org.bidon.sdk.utils.di.SimpleDiStorage;
import org.bidon.sdk.utils.ext.DpToPxExtKt;
import org.bidon.sdk.utils.ext.TagKt;
import org.bidon.sdk.utils.visibilitytracker.VisibilityTracker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B=\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0003\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u0014H\u0016J\u0018\u0010G\u001a\u00020E2\u0006\u0010H\u001a\u00020I2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010J\u001a\u00020KH\u0016J\b\u0010L\u001a\u00020EH\u0016J\u0012\u0010M\u001a\u00020E2\b\u0010\"\u001a\u0004\u0018\u00010\u001bH\u0016J\u0018\u0010N\u001a\u00020E2\u0006\u0010O\u001a\u00020\f2\u0006\u0010P\u001a\u00020\u0019H\u0016J\b\u0010Q\u001a\u00020EH\u0016J\b\u0010R\u001a\u00020EH\u0016J\u0018\u0010S\u001a\u00020E*\u00020\u00012\n\u0010T\u001a\u0006\u0012\u0002\b\u00030UH\u0002J\u0018\u0010V\u001a\u00020E2\u0006\u0010H\u001a\u00020I2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0014\u0010W\u001a\u00020E2\n\u0010T\u001a\u0006\u0012\u0002\b\u00030XH\u0002J\b\u0010Y\u001a\u00020KH\u0002J\u001e\u0010Z\u001a\u00020E2\u0006\u0010[\u001a\u00020\\2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020E0^H\u0002J\u001b\u0010_\u001a\u00020E2\u0006\u0010`\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010aH\u0096\u0001J\u0015\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020a0cH\u0096\u0001JJ\u0010d\u001a\u00020E2\u001c\u0010e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0g\u0012\u0006\u0012\u0004\u0018\u00010a0f2\u001c\u0010h\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0g\u0012\u0006\u0012\u0004\u0018\u00010a0fH\u0096A¢\u0006\u0002\u0010iR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\"\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b#\u0010$R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010!\u001a\u0004\b-\u0010.R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010!\u001a\u0004\b2\u00103R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u00108\u001a\u0004\u0018\u0001072\b\u0010\u0013\u001a\u0004\u0018\u000107@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b9\u0010:R\u000e\u0010;\u001a\u00020<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u0004\u0018\u00010@X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010A\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006j"}, d2 = {"Lorg/bidon/sdk/ads/banner/BannerView;", "Landroid/widget/FrameLayout;", "Lorg/bidon/sdk/ads/InitAwaiter;", "Lorg/bidon/sdk/ads/banner/BannerAd;", "Lorg/bidon/sdk/databinders/extras/Extras;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAtt", "", "auctionKey", "", "demandAd", "Lorg/bidon/sdk/adapter/DemandAd;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;Lorg/bidon/sdk/adapter/DemandAd;)V", "getAuctionKey", "()Ljava/lang/String;", "value", "Lorg/bidon/sdk/ads/banner/BannerFormat;", "format", "getFormat", "()Lorg/bidon/sdk/ads/banner/BannerFormat;", "pricefloor", "", "userListener", "Lorg/bidon/sdk/ads/banner/BannerListener;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope$delegate", "Lkotlin/Lazy;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getListener", "()Lorg/bidon/sdk/ads/banner/BannerListener;", "listener$delegate", "loadingError", "Lorg/bidon/sdk/config/BidonError;", "adLifecycleFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/bidon/sdk/ads/banner/helper/AdLifecycle;", A1.f40171f, "Lorg/bidon/sdk/auction/Auction;", "getAuction", "()Lorg/bidon/sdk/auction/Auction;", "auction$delegate", "visibilityTracker", "Lorg/bidon/sdk/utils/visibilitytracker/VisibilityTracker;", "getVisibilityTracker", "()Lorg/bidon/sdk/utils/visibilitytracker/VisibilityTracker;", "visibilityTracker$delegate", "auctionInfo", "Lorg/bidon/sdk/ads/AuctionInfo;", "Lorg/bidon/sdk/auction/models/AuctionResult;", Reporting.EventType.WINNER, "setWinner", "(Lorg/bidon/sdk/auction/models/AuctionResult;)V", "wasNotified", "Ljava/util/concurrent/atomic/AtomicBoolean;", "winnerSubscriberJob", "Lkotlinx/coroutines/Job;", "internalAdSize", "Lorg/bidon/sdk/ads/banner/AdSize;", C4240b4.i.O, "getAdSize", "()Lorg/bidon/sdk/ads/banner/AdSize;", "setBannerFormat", "", "bannerFormat", "loadAd", "activity", "Landroid/app/Activity;", "isReady", "", "showAd", "setBannerListener", "notifyLoss", "winnerDemandId", "winnerPrice", "notifyWin", "destroyAd", "addViewOnScreen", "adSource", "Lorg/bidon/sdk/adapter/AdSource$Banner;", "conductAuction", "subscribeToWinner", "Lorg/bidon/sdk/adapter/AdSource;", "isVisibilityTrackingEnabled", "checkBannerShown", "networkAdview", "Landroid/view/View;", "onBannerShown", "Lkotlin/Function0;", "addExtra", C4240b4.i.W, "", "getExtras", "", "initWaitAndContinueIfRequired", "onSuccess", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "onFailure", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BannerView extends FrameLayout implements InitAwaiter, BannerAd, Extras {
    private final /* synthetic */ InitAwaiterImpl $$delegate_0;

    @NotNull
    private final MutableStateFlow adLifecycleFlow;

    /* JADX INFO: renamed from: auction$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy auction;

    @Nullable
    private AuctionInfo auctionInfo;

    @Nullable
    private final String auctionKey;

    @NotNull
    private final DemandAd demandAd;

    @NotNull
    private BannerFormat format;

    @Nullable
    private AdSize internalAdSize;

    /* JADX INFO: renamed from: listener$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy listener;

    @Nullable
    private BidonError loadingError;
    private double pricefloor;

    /* JADX INFO: renamed from: scope$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scope;

    @Nullable
    private BannerListener userListener;

    /* JADX INFO: renamed from: visibilityTracker$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy visibilityTracker;

    @NotNull
    private final AtomicBoolean wasNotified;

    @Nullable
    private AuctionResult winner;

    @Nullable
    private Job winnerSubscriberJob;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdLifecycle.values().length];
            try {
                iArr[AdLifecycle.Displaying.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdLifecycle.Created.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdLifecycle.Loading.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdLifecycle.Loaded.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdLifecycle.Displayed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdLifecycle.LoadingFailed.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AdLifecycle.DisplayingFailed.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AdLifecycle.Destroyed.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.ads.banner.BannerView$destroyAd$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.ads.banner.BannerView$destroyAd$1", f = "BannerView.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return BannerView.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AdSource<?> adSource;
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            BannerView.this.adLifecycleFlow.setValue(AdLifecycle.Destroyed);
            BannerView.this.getVisibilityTracker().stop();
            BannerView.this.getAuction().cancel();
            AuctionResult auctionResult = BannerView.this.winner;
            if (auctionResult != null && (adSource = auctionResult.getAdSource()) != null) {
                adSource.destroy();
            }
            BannerView.this.setWinner(null);
            Job job = BannerView.this.winnerSubscriberJob;
            if (job != null) {
                Job.a.a(job, null, 1, null);
            }
            BannerView.this.winnerSubscriberJob = null;
            BannerView.this.removeAllViews();
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.ads.banner.BannerView$loadAd$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.ads.banner.BannerView$loadAd$1", f = "BannerView.kt", l = {116}, m = "invokeSuspend")
    static final class C58051 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ double $pricefloor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: org.bidon.sdk.ads.banner.BannerView$loadAd$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.ads.banner.BannerView$loadAd$1$1", f = "BannerView.kt", l = {128, 136}, m = "invokeSuspend")
        static final class C11401 extends kotlin.coroutines.jvm.internal.k implements Function1<Continuation, Object> {
            final /* synthetic */ CoroutineScope $$this$launch;
            final /* synthetic */ Activity $activity;
            final /* synthetic */ double $pricefloor;
            int label;
            final /* synthetic */ BannerView this$0;

            /* JADX INFO: renamed from: org.bidon.sdk.ads.banner.BannerView$loadAd$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.ads.banner.BannerView$loadAd$1$1$1", f = "BannerView.kt", l = {}, m = "invokeSuspend")
            static final class C11411 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
                int label;
                final /* synthetic */ BannerView this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C11411(BannerView bannerView, Continuation continuation) {
                    super(2, continuation);
                    this.this$0 = bannerView;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C11411(this.this$0, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    pf.b.g();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    BannerListener bannerListener = this.this$0.userListener;
                    if (bannerListener != null) {
                        bannerListener.onAdLoadFailed(null, BidonError.AuctionInProgress.INSTANCE);
                    }
                    return Unit.f93236a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C11411) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }
            }

            /* JADX INFO: renamed from: org.bidon.sdk.ads.banner.BannerView$loadAd$1$1$WhenMappings */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[AdLifecycle.values().length];
                    try {
                        iArr[AdLifecycle.Loading.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AdLifecycle.Loaded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11401(BannerView bannerView, Activity activity, double d10, CoroutineScope coroutineScope, Continuation continuation) {
                super(1, continuation);
                this.this$0 = bannerView;
                this.$activity = activity;
                this.$pricefloor = d10;
                this.$$this$launch = coroutineScope;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Continuation continuation) {
                return new C11401(this.this$0, this.$activity, this.$pricefloor, this.$$this$launch, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
            
                if (eg.g.g(r3, r5, r6) == r0) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x00c6, code lost:
            
                if (eg.g.g(r7, r2, r6) == r0) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00c8, code lost:
            
                return r0;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    Method dump skipped, instruction units count: 204
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.ads.banner.BannerView.C58051.C11401.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation continuation) {
                return ((C11401) create(continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX INFO: renamed from: org.bidon.sdk.ads.banner.BannerView$loadAd$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.ads.banner.BannerView$loadAd$1$2", f = "BannerView.kt", l = {154}, m = "invokeSuspend")
        static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.k implements Function1<Continuation, Object> {
            int label;
            final /* synthetic */ BannerView this$0;

            /* JADX INFO: renamed from: org.bidon.sdk.ads.banner.BannerView$loadAd$1$2$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.ads.banner.BannerView$loadAd$1$2$1", f = "BannerView.kt", l = {}, m = "invokeSuspend")
            static final class C11421 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ BannerView this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C11421(BannerView bannerView, Continuation continuation) {
                    super(2, continuation);
                    this.this$0 = bannerView;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation create(Object obj, Continuation continuation) {
                    C11421 c11421 = new C11421(this.this$0, continuation);
                    c11421.L$0 = obj;
                    return c11421;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    pf.b.g();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    LogExtKt.logInfo(TagKt.getTAG((CoroutineScope) this.L$0), "Sdk was initialized with error");
                    this.this$0.getListener().onAdLoadFailed(null, BidonError.SdkNotInitialized.INSTANCE);
                    return Unit.f93236a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C11421) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(BannerView bannerView, Continuation continuation) {
                super(1, continuation);
                this.this$0 = bannerView;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Continuation continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    e1 e1VarC = o0.c();
                    C11421 c11421 = new C11421(this.this$0, null);
                    this.label = 1;
                    if (eg.g.g(e1VarC, c11421, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                }
                return Unit.f93236a;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation continuation) {
                return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C58051(Activity activity, double d10, Continuation continuation) {
            super(2, continuation);
            this.$activity = activity;
            this.$pricefloor = d10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            C58051 c58051 = BannerView.this.new C58051(this.$activity, this.$pricefloor, continuation);
            c58051.L$0 = obj;
            return c58051;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BannerView bannerView = BannerView.this;
                C11401 c11401 = new C11401(bannerView, this.$activity, this.$pricefloor, coroutineScope, null);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(BannerView.this, null);
                this.label = 1;
                if (bannerView.initWaitAndContinueIfRequired(c11401, anonymousClass2, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C58051) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.ads.banner.BannerView$subscribeToWinner$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "adEvent", "Lorg/bidon/sdk/adapter/AdEvent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.ads.banner.BannerView$subscribeToWinner$1", f = "BannerView.kt", l = {}, m = "invokeSuspend")
    static final class C58061 extends kotlin.coroutines.jvm.internal.k implements Function2<AdEvent, Continuation, Object> {
        final /* synthetic */ AdSource<?> $adSource;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C58061(AdSource<?> adSource, Continuation continuation) {
            super(2, continuation);
            this.$adSource = adSource;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            C58061 c58061 = BannerView.this.new C58061(this.$adSource, continuation);
            c58061.L$0 = obj;
            return c58061;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            AdEvent adEvent = (AdEvent) this.L$0;
            LogExtKt.logInfo(TagKt.getTAG(BannerView.this), String.valueOf(adEvent));
            if (!(adEvent instanceof AdEvent.OnReward) && !(adEvent instanceof AdEvent.Closed) && !(adEvent instanceof AdEvent.LoadFailed) && !(adEvent instanceof AdEvent.Fill)) {
                if (adEvent instanceof AdEvent.Clicked) {
                    BannerView.this.getListener().onAdClicked(((AdEvent.Clicked) adEvent).getAd());
                    this.$adSource.sendClickImpression();
                } else if (!(adEvent instanceof AdEvent.Shown)) {
                    if (adEvent instanceof AdEvent.PaidRevenue) {
                        AdEvent.PaidRevenue paidRevenue = (AdEvent.PaidRevenue) adEvent;
                        BannerView.this.getListener().onRevenuePaid(paidRevenue.getAd(), paidRevenue.getAdValue());
                    } else if (adEvent instanceof AdEvent.ShowFailed) {
                        BannerView.this.adLifecycleFlow.setValue(AdLifecycle.DisplayingFailed);
                        BannerView.this.getListener().onAdLoadFailed(null, ((AdEvent.ShowFailed) adEvent).getCause());
                    } else {
                        if (!(adEvent instanceof AdEvent.Expired)) {
                            throw new lf.m();
                        }
                        BannerView.this.getListener().onAdExpired(((AdEvent.Expired) adEvent).getAd());
                    }
                }
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdEvent adEvent, Continuation continuation) {
            return ((C58061) create(adEvent, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BannerView(@NotNull Context context) {
        this(context, null, 0, null, null, 30, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void addViewOnScreen(FrameLayout frameLayout, final AdSource.Banner<?> banner) {
        frameLayout.removeAllViews();
        AdViewHolder adView = banner.getAdView();
        if (adView == null) {
            LogExtKt.logError(TagKt.getTAG(frameLayout), "No AdView found.", new NullPointerException());
            this.adLifecycleFlow.setValue(AdLifecycle.DisplayingFailed);
            getListener().onAdShowFailed(BidonError.AdNotReady.INSTANCE);
            return;
        }
        frameLayout.addView(adView.getNetworkAdview(), new FrameLayout.LayoutParams(DpToPxExtKt.getDpToPx(Integer.valueOf(getAdSize().getWidthDp())), DpToPxExtKt.getDpToPx(Integer.valueOf(getAdSize().getHeightDp())), 17));
        frameLayout.setVisibility(0);
        adView.getNetworkAdview().setVisibility(0);
        LogExtKt.logInfo(TagKt.getTAG(frameLayout), "View added(" + banner.getDemandId().getDemandId() + "): " + adView.getNetworkAdview() + ". Size(" + getAdSize().getWidthDp() + ", " + getAdSize().getHeightDp() + ")");
        Function0<Unit> function0 = new Function0() { // from class: org.bidon.sdk.ads.banner.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BannerView.addViewOnScreen$lambda$11(this.f97602b, banner);
            }
        };
        if (isVisibilityTrackingEnabled()) {
            checkBannerShown(adView.getNetworkAdview(), function0);
        } else {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addViewOnScreen$lambda$11(BannerView bannerView, AdSource.Banner banner) {
        bannerView.adLifecycleFlow.setValue(AdLifecycle.Displayed);
        Ad ad2 = AdSourceExtKt.getAd(banner);
        if (ad2 != null) {
            bannerView.getListener().onAdShown(ad2);
        }
        banner.sendShowImpression();
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Auction auction_delegate$lambda$3() {
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(v0.b(Auction.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton != null) {
                return (Auction) singleton;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.auction.Auction");
        }
        if (instanceType instanceof InstanceType.Factory) {
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild != null) {
                return (Auction) objBuild;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.auction.Auction");
        }
        if (instanceType instanceof InstanceType.ParamFactory) {
            new InstanceType.ParamFactory.Params();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (instanceType != null) {
            throw new lf.m();
        }
        throw new IllegalStateException(("No factory provided for class: " + Auction.class).toString());
    }

    private final void checkBannerShown(View networkAdview, final Function0<Unit> onBannerShown) {
        getVisibilityTracker().start(networkAdview, new Function0() { // from class: org.bidon.sdk.ads.banner.w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BannerView.checkBannerShown$lambda$17(onBannerShown);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkBannerShown$lambda$17(Function0 function0) {
        function0.invoke();
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void conductAuction(Activity activity, double pricefloor) {
        this.pricefloor = pricefloor;
        LogExtKt.logInfo(TagKt.getTAG(this), "Load (pricefloor=" + pricefloor + ")");
        getAuction().start(this.demandAd, new AdTypeParam.Banner(activity, pricefloor, this.auctionKey, this.format, (float) getWidth()), new Function2() { // from class: org.bidon.sdk.ads.banner.u
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BannerView.conductAuction$lambda$15(this.f97604b, (List) obj, (AuctionInfo) obj2);
            }
        }, new Function2() { // from class: org.bidon.sdk.ads.banner.v
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BannerView.conductAuction$lambda$16(this.f97605b, (AuctionInfo) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit conductAuction$lambda$15(BannerView bannerView, List winners, AuctionInfo auctionInfo) {
        Intrinsics.checkNotNullParameter(winners, "winners");
        Intrinsics.checkNotNullParameter(auctionInfo, "auctionInfo");
        AuctionResult auctionResult = (AuctionResult) CollectionsKt.first(winners);
        bannerView.setWinner(auctionResult);
        Iterator it = CollectionsKt.drop(winners, 1).iterator();
        while (it.hasNext()) {
            ((AuctionResult) it.next()).getAdSource().destroy();
        }
        bannerView.auctionInfo = auctionInfo;
        bannerView.subscribeToWinner(auctionResult.getAdSource());
        bannerView.adLifecycleFlow.setValue(AdLifecycle.Loaded);
        BannerListener listener = bannerView.getListener();
        Ad ad2 = AdSourceExtKt.getAd(auctionResult.getAdSource());
        if (ad2 == null) {
            throw new IllegalArgumentException("[Ad] should exist when action succeeds");
        }
        listener.onAdLoaded(ad2, auctionInfo);
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit conductAuction$lambda$16(BannerView bannerView, AuctionInfo auctionInfo, Throwable cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        bannerView.adLifecycleFlow.setValue(AdLifecycle.LoadingFailed);
        bannerView.loadingError = BidonErrorExtKt.asBidonErrorOrUnspecified(cause);
        bannerView.getListener().onAdLoadFailed(auctionInfo, BidonErrorExtKt.asBidonErrorOrUnspecified(cause));
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Auction getAuction() {
        return (Auction) this.auction.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BannerListener getListener() {
        return (BannerListener) this.listener.getValue();
    }

    private final CoroutineScope getScope() {
        return (CoroutineScope) this.scope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VisibilityTracker getVisibilityTracker() {
        return (VisibilityTracker) this.visibilityTracker.getValue();
    }

    private final boolean isVisibilityTrackingEnabled() {
        Object obj = getExtras().get("ext");
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).optBoolean("use_visibility_tracker", true);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BannerListener listener_delegate$lambda$2(final BannerView bannerView) {
        return UserBannerListenerWrapperKt.wrapUserBannerListener(new Function0() { // from class: org.bidon.sdk.ads.banner.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f97601b.userListener;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope scope_delegate$lambda$0() {
        return kotlinx.coroutines.i.a(SdkDispatchers.INSTANCE.getMain());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setWinner(AuctionResult auctionResult) {
        this.wasNotified.set(false);
        this.winner = auctionResult;
    }

    private final void subscribeToWinner(AdSource<?> adSource) {
        this.winnerSubscriberJob = hg.i.F(hg.i.K(adSource.getAdEvent(), new C58061(adSource, null)), getScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VisibilityTracker visibilityTracker_delegate$lambda$4() {
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(v0.b(VisibilityTracker.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton != null) {
                return (VisibilityTracker) singleton;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.utils.visibilitytracker.VisibilityTracker");
        }
        if (instanceType instanceof InstanceType.Factory) {
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild != null) {
                return (VisibilityTracker) objBuild;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.utils.visibilitytracker.VisibilityTracker");
        }
        if (instanceType instanceof InstanceType.ParamFactory) {
            new InstanceType.ParamFactory.Params();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (instanceType != null) {
            throw new lf.m();
        }
        throw new IllegalStateException(("No factory provided for class: " + VisibilityTracker.class).toString());
    }

    @Override // org.bidon.sdk.databinders.extras.Extras
    public void addExtra(@NotNull String key, @Nullable Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.demandAd.addExtra(key, value);
    }

    @Override // org.bidon.sdk.ads.banner.BannerAd
    public void destroyAd() {
        if (!BidonSdk.isInitialized()) {
            LogExtKt.logInfo(TagKt.getTAG(this), "Sdk is not initialized");
        } else {
            LogExtKt.logInfo(TagKt.getTAG(this), "Destroy ad");
            eg.i.d(getScope(), o0.c().w(), null, new AnonymousClass1(null), 2, null);
        }
    }

    @Override // org.bidon.sdk.ads.banner.BannerAd
    @NotNull
    public AdSize getAdSize() {
        AdSize adSize = this.internalAdSize;
        if (adSize != null) {
            return adSize;
        }
        AdSize adSize2 = new AdSize(BannerFormatExtKt.getWidth(this.format), BannerFormatExtKt.getHeight(this.format));
        this.internalAdSize = adSize2;
        return adSize2;
    }

    @Nullable
    public final String getAuctionKey() {
        return this.auctionKey;
    }

    @Override // org.bidon.sdk.databinders.extras.Extras
    @NotNull
    public Map<String, Object> getExtras() {
        return this.demandAd.getExtras();
    }

    @NotNull
    public final BannerFormat getFormat() {
        return this.format;
    }

    @Override // org.bidon.sdk.ads.InitAwaiter
    @Nullable
    public Object initWaitAndContinueIfRequired(@NotNull Function1<? super Continuation, ? extends Object> function1, @NotNull Function1<? super Continuation, ? extends Object> function12, @NotNull Continuation continuation) {
        return this.$$delegate_0.initWaitAndContinueIfRequired(function1, function12, continuation);
    }

    @Override // org.bidon.sdk.ads.banner.BannerAd
    public boolean isReady() {
        AdSource<?> adSource;
        AuctionResult auctionResult = this.winner;
        return (auctionResult == null || (adSource = auctionResult.getAdSource()) == null || !adSource.isAdReadyToShow()) ? false : true;
    }

    @Override // org.bidon.sdk.ads.banner.BannerAd
    public void loadAd(@NotNull Activity activity, double pricefloor) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        LogExtKt.logInfo(TagKt.getTAG(this), "LoadAd. " + this + ". " + Thread.currentThread());
        eg.i.d(getScope(), o0.a(), null, new C58051(activity, pricefloor, null), 2, null);
    }

    @Override // org.bidon.sdk.stats.WinLossNotifier
    public void notifyLoss(@NotNull String winnerDemandId, double winnerPrice) {
        AdSource<?> adSource;
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        LogExtKt.logInfo(TagKt.getTAG(this), "Notify Loss invoked with Winner(" + winnerDemandId + ", " + winnerPrice + ")");
        if (!BidonSdk.isInitialized()) {
            LogExtKt.logInfo(TagKt.getTAG(this), "Sdk is not initialized");
            return;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[((AdLifecycle) this.adLifecycleFlow.getValue()).ordinal()];
        if (i10 == 3) {
            destroyAd();
            BannerListener bannerListener = this.userListener;
            if (bannerListener != null) {
                bannerListener.onAdLoadFailed(null, BidonError.AuctionCancelled.INSTANCE);
                return;
            }
            return;
        }
        if (i10 == 4 && !this.wasNotified.getAndSet(true)) {
            AuctionResult auctionResult = this.winner;
            if (auctionResult != null && (adSource = auctionResult.getAdSource()) != null) {
                AdSourceExtKt.notifyExternalLoss(adSource, winnerDemandId, winnerPrice);
            }
            destroyAd();
        }
    }

    @Override // org.bidon.sdk.stats.WinLossNotifier
    public void notifyWin() {
        LogExtKt.logInfo(TagKt.getTAG(this), "Notify Win was invoked");
        if (!BidonSdk.isInitialized()) {
            LogExtKt.logInfo(TagKt.getTAG(this), "Sdk is not initialized");
            return;
        }
        AuctionResult auctionResult = this.winner;
        AdSource<?> adSource = auctionResult != null ? auctionResult.getAdSource() : null;
        if (adSource == null || !adSource.canSendWinLoseNotifications() || this.wasNotified.getAndSet(true)) {
            return;
        }
        AdSourceExtKt.notifyExternalWin(adSource);
    }

    @Override // org.bidon.sdk.ads.banner.BannerAd
    public void setBannerFormat(@NotNull BannerFormat bannerFormat) {
        Intrinsics.checkNotNullParameter(bannerFormat, "bannerFormat");
        this.format = bannerFormat;
    }

    @Override // org.bidon.sdk.ads.banner.BannerAd
    public void setBannerListener(@Nullable BannerListener listener) {
        this.userListener = listener;
    }

    @Override // org.bidon.sdk.ads.banner.BannerAd
    public void showAd() {
        LogExtKt.logInfo(TagKt.getTAG(this), "ShowAd invoked. " + Thread.currentThread());
        if (!BidonSdk.isInitialized()) {
            LogExtKt.logInfo(TagKt.getTAG(this), "Sdk is not initialized");
            getListener().onAdShowFailed(BidonError.SdkNotInitialized.INSTANCE);
            return;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[((AdLifecycle) this.adLifecycleFlow.getValue()).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 5:
                return;
            case 4:
                if (!isReady() || !this.adLifecycleFlow.b(AdLifecycle.Loaded, AdLifecycle.Displaying)) {
                    LogExtKt.logInfo(TagKt.getTAG(this), "Not loaded. Current state: " + this.adLifecycleFlow.getValue());
                    LogLifecycleAdStateUseCase.INSTANCE.invoke((AdLifecycle) this.adLifecycleFlow.getValue());
                    BannerListener bannerListener = this.userListener;
                    if (bannerListener != null) {
                        BidonError bidonError = this.loadingError;
                        if (bidonError == null) {
                            bidonError = BidonError.AdNotReady.INSTANCE;
                        }
                        bannerListener.onAdShowFailed(bidonError);
                        return;
                    }
                    return;
                }
                AuctionResult auctionResult = this.winner;
                AdSource<?> adSource = auctionResult != null ? auctionResult.getAdSource() : null;
                AdSource.Banner<?> banner = adSource instanceof AdSource.Banner ? (AdSource.Banner) adSource : null;
                if (banner != null) {
                    addViewOnScreen(this, banner);
                    return;
                }
                String tag = TagKt.getTAG(this);
                AuctionResult auctionResult2 = this.winner;
                LogExtKt.logInfo(tag, "AdSource(" + (auctionResult2 != null ? auctionResult2.getAdSource() : null) + ": no ad view.");
                LogLifecycleAdStateUseCase.INSTANCE.invoke((AdLifecycle) this.adLifecycleFlow.getValue());
                BannerListener bannerListener2 = this.userListener;
                if (bannerListener2 != null) {
                    BidonError bidonError2 = this.loadingError;
                    if (bidonError2 == null) {
                        bidonError2 = BidonError.AdNotReady.INSTANCE;
                    }
                    bannerListener2.onAdShowFailed(bidonError2);
                    return;
                }
                return;
            case 6:
            case 7:
            case 8:
                BannerListener bannerListener3 = this.userListener;
                if (bannerListener3 != null) {
                    BidonError bidonError3 = this.loadingError;
                    if (bidonError3 == null) {
                        bidonError3 = BidonError.AdNotReady.INSTANCE;
                    }
                    bannerListener3.onAdShowFailed(bidonError3);
                    return;
                }
                return;
            default:
                throw new lf.m();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, null, 28, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10) {
        this(context, attributeSet, i10, null, null, 24, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10, @Nullable String str) {
        this(context, attributeSet, i10, str, null, 16, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BannerView(Context context, AttributeSet attributeSet, int i10, String str, DemandAd demandAd, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? new DemandAd(AdType.Banner) : demandAd);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10, @Nullable String str, @NotNull DemandAd demandAd) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.$$delegate_0 = new InitAwaiterImpl();
        this.auctionKey = str;
        this.demandAd = demandAd;
        BannerFormat bannerFormat = BannerFormat.Banner;
        this.format = bannerFormat;
        this.scope = lf.i.a(new Function0() { // from class: org.bidon.sdk.ads.banner.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BannerView.scope_delegate$lambda$0();
            }
        });
        this.listener = lf.i.a(new Function0() { // from class: org.bidon.sdk.ads.banner.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BannerView.listener_delegate$lambda$2(this.f97574b);
            }
        });
        this.adLifecycleFlow = l0.a(AdLifecycle.Created);
        this.auction = lf.i.a(new Function0() { // from class: org.bidon.sdk.ads.banner.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BannerView.auction_delegate$lambda$3();
            }
        });
        this.visibilityTracker = lf.i.a(new Function0() { // from class: org.bidon.sdk.ads.banner.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BannerView.visibilityTracker_delegate$lambda$4();
            }
        });
        this.wasNotified = new AtomicBoolean(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.BannerView, 0, 0);
        try {
            int integer = typedArrayObtainStyledAttributes.getInteger(R.styleable.BannerView_bannerSize, 0);
            if (integer == 1) {
                setBannerFormat(bannerFormat);
            } else if (integer == 3) {
                setBannerFormat(BannerFormat.LeaderBoard);
            } else if (integer == 4) {
                setBannerFormat(BannerFormat.MRec);
            } else if (integer == 5) {
                setBannerFormat(BannerFormat.Adaptive);
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
