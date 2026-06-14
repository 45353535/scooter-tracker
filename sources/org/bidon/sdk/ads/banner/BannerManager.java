package org.bidon.sdk.ads.banner;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.PointF;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.view.ViewGroupKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import com.taurusx.tax.y.z.w.s;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import eg.e1;
import eg.o0;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.CoroutineScope;
import org.bidon.sdk.BidonSdk;
import org.bidon.sdk.ads.Ad;
import org.bidon.sdk.ads.AuctionInfo;
import org.bidon.sdk.ads.InitAwaiter;
import org.bidon.sdk.ads.InitAwaiterImpl;
import org.bidon.sdk.ads.banner.BannerManager;
import org.bidon.sdk.ads.banner.refresh.BannersCache;
import org.bidon.sdk.ads.banner.refresh.BannersCacheImpl;
import org.bidon.sdk.ads.banner.render.AdRenderer;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.databinders.extras.Extras;
import org.bidon.sdk.databinders.extras.ExtrasImpl;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.utils.SdkDispatchers;
import org.bidon.sdk.utils.di.InstanceType;
import org.bidon.sdk.utils.di.SimpleDiStorage;
import org.bidon.sdk.utils.ext.TagKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB\u0015\b\u0017\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\u000bJ\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J \u0010;\u001a\u0002082\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010B\u001a\u0002082\u0006\u0010,\u001a\u00020+H\u0016J\u0018\u0010C\u001a\u0002082\u0006\u0010D\u001a\u00020\u00172\u0006\u0010E\u001a\u00020FH\u0016J\b\u0010G\u001a\u000204H\u0016J\u0010\u0010H\u001a\u0002082\u0006\u0010D\u001a\u00020\u0017H\u0016J\u0010\u0010I\u001a\u0002082\u0006\u0010D\u001a\u00020\u0017H\u0016J\u0010\u0010J\u001a\u0002082\u0006\u0010D\u001a\u00020\u0017H\u0016J\u0012\u0010K\u001a\u0002082\b\u0010L\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010M\u001a\u0002082\u0006\u0010N\u001a\u00020\b2\b\u00103\u001a\u0004\u0018\u00010OH\u0016J\u0014\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020O0QH\u0016J \u0010R\u001a\u0002082\u0006\u0010D\u001a\u00020\u00172\u0006\u0010S\u001a\u00020\b2\u0006\u0010T\u001a\u00020FH\u0016J\b\u0010U\u001a\u000208H\u0016JJ\u0010V\u001a\u0002082\u001c\u0010W\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002080Y\u0012\u0006\u0012\u0004\u0018\u00010O0X2\u001c\u0010Z\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002080Y\u0012\u0006\u0012\u0004\u0018\u00010O0XH\u0096A¢\u0006\u0002\u0010[R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0014\u001a\u0004\b'\u0010(R\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u0010/\u001a\u0004\u0018\u0001008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u001e\u00105\u001a\u0002042\u0006\u00103\u001a\u000204@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u00106¨\u0006\\"}, d2 = {"Lorg/bidon/sdk/ads/banner/BannerManager;", "Lorg/bidon/sdk/ads/InitAwaiter;", "Lorg/bidon/sdk/ads/banner/PositionedBanner;", "Lorg/bidon/sdk/databinders/extras/Extras;", "bannersCache", "Lorg/bidon/sdk/ads/banner/refresh/BannersCache;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "auctionKey", "", "<init>", "(Lorg/bidon/sdk/ads/banner/refresh/BannersCache;Lorg/bidon/sdk/databinders/extras/Extras;Ljava/lang/String;)V", "(Ljava/lang/String;)V", s.z.f67720z, "getTag", "()Ljava/lang/String;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope$delegate", "Lkotlin/Lazy;", "weakActivity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "nextBannerView", "Lorg/bidon/sdk/ads/banner/BannerView;", "nextAd", "Lorg/bidon/sdk/ads/Ad;", "nextAuctionInfo", "Lorg/bidon/sdk/ads/AuctionInfo;", "currentBannerView", "showAfterLoad", "Ljava/util/concurrent/atomic/AtomicBoolean;", "positionState", "Lorg/bidon/sdk/ads/banner/render/AdRenderer$PositionState;", "publisherListener", "Lorg/bidon/sdk/ads/banner/BannerListener;", "adRenderer", "Lorg/bidon/sdk/ads/banner/render/AdRenderer;", "getAdRenderer", "()Lorg/bidon/sdk/ads/banner/render/AdRenderer;", "adRenderer$delegate", "_bannerFormat", "Lorg/bidon/sdk/ads/banner/BannerFormat;", "bannerFormat", "getBannerFormat", "()Lorg/bidon/sdk/ads/banner/BannerFormat;", C4240b4.i.O, "Lorg/bidon/sdk/ads/banner/AdSize;", "getAdSize", "()Lorg/bidon/sdk/ads/banner/AdSize;", "value", "", "isDisplaying", "()Z", "setPosition", "", C4240b4.i.L, "Lorg/bidon/sdk/ads/banner/BannerPosition;", "setCustomPosition", "offset", "Landroid/graphics/Point;", Key.ROTATION, "", "anchor", "Landroid/graphics/PointF;", "setBannerFormat", "loadAd", "activity", "pricefloor", "", "isReady", "showAd", "hideAd", "destroyAd", "setBannerListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addExtra", C4240b4.i.W, "", "getExtras", "", "notifyLoss", "winnerDemandId", "winnerPrice", "notifyWin", "initWaitAndContinueIfRequired", "onSuccess", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "onFailure", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BannerManager implements InitAwaiter, PositionedBanner, Extras {
    private final /* synthetic */ InitAwaiterImpl $$delegate_0;

    @NotNull
    private BannerFormat _bannerFormat;

    /* JADX INFO: renamed from: adRenderer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adRenderer;

    @Nullable
    private final String auctionKey;

    @NotNull
    private final BannersCache bannersCache;

    @Nullable
    private BannerView currentBannerView;

    @NotNull
    private final Extras extras;
    private boolean isDisplaying;

    @Nullable
    private Ad nextAd;

    @Nullable
    private AuctionInfo nextAuctionInfo;

    @Nullable
    private BannerView nextBannerView;

    @NotNull
    private AdRenderer.PositionState positionState;

    @Nullable
    private BannerListener publisherListener;

    /* JADX INFO: renamed from: scope$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scope;

    @NotNull
    private final AtomicBoolean showAfterLoad;

    @NotNull
    private WeakReference<Activity> weakActivity;

    /* JADX INFO: renamed from: org.bidon.sdk.ads.banner.BannerManager$loadAd$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.ads.banner.BannerManager$loadAd$1", f = "BannerManager.kt", l = {114}, m = "invokeSuspend")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ double $pricefloor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: org.bidon.sdk.ads.banner.BannerManager$loadAd$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.ads.banner.BannerManager$loadAd$1$1", f = "BannerManager.kt", l = {120}, m = "invokeSuspend")
        static final class C11381 extends kotlin.coroutines.jvm.internal.k implements Function1<Continuation, Object> {
            final /* synthetic */ Activity $activity;
            final /* synthetic */ double $pricefloor;
            int label;
            final /* synthetic */ BannerManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11381(BannerManager bannerManager, Activity activity, double d10, Continuation continuation) {
                super(1, continuation);
                this.this$0 = bannerManager;
                this.$activity = activity;
                this.$pricefloor = d10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$2(BannerManager bannerManager, Ad ad2, AuctionInfo auctionInfo, BannerView bannerView) {
                Activity activity;
                bannerManager.nextBannerView = bannerView;
                bannerManager.nextAd = ad2;
                bannerManager.nextAuctionInfo = auctionInfo;
                BannerListener bannerListener = bannerManager.publisherListener;
                if (bannerListener != null) {
                    bannerListener.onAdLoaded(ad2, auctionInfo);
                }
                if ((bannerManager.showAfterLoad.getAndSet(false) || bannerManager.getIsDisplaying()) && (activity = (Activity) bannerManager.weakActivity.get()) != null) {
                    bannerManager.showAd(activity);
                }
                return Unit.f93236a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$3(BannerManager bannerManager, AuctionInfo auctionInfo, BidonError bidonError) {
                BannerListener bannerListener = bannerManager.publisherListener;
                if (bannerListener != null) {
                    bannerListener.onAdLoadFailed(auctionInfo, bidonError);
                }
                return Unit.f93236a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Continuation continuation) {
                return new C11381(this.this$0, this.$activity, this.$pricefloor, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    if (this.this$0.nextBannerView != null) {
                        LogExtKt.logInfo(this.this$0.getTag(), "Ad is already loaded");
                        Ad ad2 = this.this$0.nextAd;
                        if (ad2 != null) {
                            BannerManager bannerManager = this.this$0;
                            e1 e1VarC = o0.c();
                            BannerManager$loadAd$1$1$1$1 bannerManager$loadAd$1$1$1$1 = new BannerManager$loadAd$1$1$1$1(bannerManager, ad2, null);
                            this.label = 1;
                            obj = eg.g.g(e1VarC, bannerManager$loadAd$1$1$1$1, this);
                            if (obj == objG) {
                                return objG;
                            }
                        }
                        return Unit.f93236a;
                    }
                    BannersCache bannersCache = this.this$0.bannersCache;
                    Activity activity = this.$activity;
                    BannerFormat bannerFormat = this.this$0.get_bannerFormat();
                    double d10 = this.$pricefloor;
                    String str = this.this$0.auctionKey;
                    Extras extras = this.this$0.extras;
                    final BannerManager bannerManager2 = this.this$0;
                    Function3<? super Ad, ? super AuctionInfo, ? super BannerView, Unit> function3 = new Function3() { // from class: org.bidon.sdk.ads.banner.g
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            return BannerManager.AnonymousClass1.C11381.invokeSuspend$lambda$2(bannerManager2, (Ad) obj2, (AuctionInfo) obj3, (BannerView) obj4);
                        }
                    };
                    final BannerManager bannerManager3 = this.this$0;
                    bannersCache.get(activity, bannerFormat, d10, str, extras, function3, new Function2() { // from class: org.bidon.sdk.ads.banner.h
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return BannerManager.AnonymousClass1.C11381.invokeSuspend$lambda$3(bannerManager3, (AuctionInfo) obj2, (BidonError) obj3);
                        }
                    });
                    return Unit.f93236a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return Unit.f93236a;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation continuation) {
                return ((C11381) create(continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX INFO: renamed from: org.bidon.sdk.ads.banner.BannerManager$loadAd$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.ads.banner.BannerManager$loadAd$1$2", f = "BannerManager.kt", l = {158}, m = "invokeSuspend")
        static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.k implements Function1<Continuation, Object> {
            final /* synthetic */ CoroutineScope $$this$launch;
            int label;
            final /* synthetic */ BannerManager this$0;

            /* JADX INFO: renamed from: org.bidon.sdk.ads.banner.BannerManager$loadAd$1$2$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.ads.banner.BannerManager$loadAd$1$2$1", f = "BannerManager.kt", l = {}, m = "invokeSuspend")
            static final class C11391 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
                int label;
                final /* synthetic */ BannerManager this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C11391(BannerManager bannerManager, Continuation continuation) {
                    super(2, continuation);
                    this.this$0 = bannerManager;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C11391(this.this$0, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    pf.b.g();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    BannerListener bannerListener = this.this$0.publisherListener;
                    if (bannerListener != null) {
                        bannerListener.onAdLoadFailed(null, BidonError.SdkNotInitialized.INSTANCE);
                    }
                    return Unit.f93236a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C11391) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CoroutineScope coroutineScope, BannerManager bannerManager, Continuation continuation) {
                super(1, continuation);
                this.$$this$launch = coroutineScope;
                this.this$0 = bannerManager;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Continuation continuation) {
                return new AnonymousClass2(this.$$this$launch, this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    LogExtKt.logInfo(TagKt.getTAG(this.$$this$launch), "Sdk was initialized with error");
                    e1 e1VarC = o0.c();
                    C11391 c11391 = new C11391(this.this$0, null);
                    this.label = 1;
                    if (eg.g.g(e1VarC, c11391, this) == objG) {
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
        AnonymousClass1(Activity activity, double d10, Continuation continuation) {
            super(2, continuation);
            this.$activity = activity;
            this.$pricefloor = d10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = BannerManager.this.new AnonymousClass1(this.$activity, this.$pricefloor, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BannerManager bannerManager = BannerManager.this;
                C11381 c11381 = new C11381(bannerManager, this.$activity, this.$pricefloor, null);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(coroutineScope, BannerManager.this, null);
                this.label = 1;
                if (bannerManager.initWaitAndContinueIfRequired(c11381, anonymousClass2, this) == objG) {
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
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public BannerManager() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdRenderer adRenderer_delegate$lambda$1() {
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(v0.b(AdRenderer.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton != null) {
                return (AdRenderer) singleton;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.ads.banner.render.AdRenderer");
        }
        if (instanceType instanceof InstanceType.Factory) {
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild != null) {
                return (AdRenderer) objBuild;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.ads.banner.render.AdRenderer");
        }
        if (instanceType instanceof InstanceType.ParamFactory) {
            new InstanceType.ParamFactory.Params();
            throw new IllegalArgumentException("Required value was null.");
        }
        if (instanceType != null) {
            throw new lf.m();
        }
        throw new IllegalStateException(("No factory provided for class: " + AdRenderer.class).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroyAd$lambda$6(BannerManager bannerManager, Activity activity) {
        bannerManager.isDisplaying = false;
        bannerManager.showAfterLoad.set(false);
        bannerManager.getAdRenderer().destroy(activity);
        BannerView bannerView = bannerManager.currentBannerView;
        if (bannerView != null) {
            bannerView.destroyAd();
        }
        bannerManager.currentBannerView = null;
        BannerView bannerView2 = bannerManager.nextBannerView;
        if (bannerView2 != null) {
            bannerView2.destroyAd();
        }
        bannerManager.nextBannerView = null;
        bannerManager.nextAd = null;
        bannerManager.bannersCache.clear();
    }

    private final AdRenderer getAdRenderer() {
        return (AdRenderer) this.adRenderer.getValue();
    }

    private final CoroutineScope getScope() {
        return (CoroutineScope) this.scope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getTag() {
        return TagKt.getTAG(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideAd$lambda$5(BannerManager bannerManager, Activity activity) {
        bannerManager.isDisplaying = false;
        bannerManager.showAfterLoad.set(false);
        bannerManager.getAdRenderer().hide(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyLoss$lambda$7(BannerManager bannerManager, String str, double d10) {
        BannerView bannerView = bannerManager.nextBannerView;
        if (bannerView != null) {
            bannerView.notifyLoss(str, d10);
        }
        bannerManager.nextBannerView = null;
        bannerManager.nextAd = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope scope_delegate$lambda$0() {
        return kotlinx.coroutines.i.a(SdkDispatchers.INSTANCE.getDefault());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAd$lambda$4(BannerManager bannerManager, Activity activity) {
        bannerManager.weakActivity = new WeakReference<>(activity);
        if (!BidonSdk.isInitialized()) {
            BannerListener bannerListener = bannerManager.publisherListener;
            if (bannerListener != null) {
                bannerListener.onAdLoadFailed(null, BidonError.SdkNotInitialized.INSTANCE);
                return;
            }
            return;
        }
        BannerView bannerView = bannerManager.nextBannerView;
        if (bannerView == null) {
            bannerView = bannerManager.currentBannerView;
        }
        BannerView bannerView2 = bannerView;
        if (bannerView2 == null) {
            LogExtKt.logInfo(bannerManager.getTag(), "No loaded ad");
            bannerManager.showAfterLoad.set(true);
            BannerListener bannerListener2 = bannerManager.publisherListener;
            if (bannerListener2 != null) {
                bannerListener2.onAdShowFailed(BidonError.AdNotReady.INSTANCE);
                return;
            }
            return;
        }
        if (!bannerView2.isReady()) {
            LogExtKt.logInfo(bannerManager.getTag(), "Source network banner is not ready " + kotlin.sequences.k.I(ViewGroupKt.getChildren(bannerView2)));
        }
        bannerManager.nextBannerView = null;
        bannerManager.nextAd = null;
        bannerManager.currentBannerView = bannerView2;
        LogExtKt.logInfo(bannerManager.getTag(), "RenderAd at " + activity);
        bannerView2.setBannerListener(new BannerManager$showAd$1$1(activity, bannerManager));
        bannerManager.getAdRenderer().render(activity, bannerView2, bannerManager.positionState, true, false, new BannerManager$showAd$1$2(bannerManager, activity, bannerView2));
    }

    @Override // org.bidon.sdk.databinders.extras.Extras
    public void addExtra(@NotNull String key, @Nullable Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.extras.addExtra(key, value);
        BannerView bannerView = this.nextBannerView;
        if (bannerView != null) {
            bannerView.addExtra(key, value);
        }
        BannerView bannerView2 = this.currentBannerView;
        if (bannerView2 != null) {
            bannerView2.addExtra(key, value);
        }
    }

    @Override // org.bidon.sdk.ads.banner.PositionedBanner
    public void destroyAd(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!BidonSdk.isInitialized()) {
            LogExtKt.logInfo(TagKt.getTAG(this), "Sdk is not initialized");
        } else {
            LogExtKt.logInfo(getTag(), "Destroy ad.");
            activity.runOnUiThread(new Runnable() { // from class: org.bidon.sdk.ads.banner.f
                @Override // java.lang.Runnable
                public final void run() {
                    BannerManager.destroyAd$lambda$6(this.f97557b, activity);
                }
            });
        }
    }

    @Override // org.bidon.sdk.ads.banner.PositionedBanner
    @Nullable
    public AdSize getAdSize() {
        AdSize adSize;
        BannerView bannerView = this.nextBannerView;
        if (bannerView != null && (adSize = bannerView.getAdSize()) != null) {
            return adSize;
        }
        BannerView bannerView2 = this.currentBannerView;
        if (bannerView2 != null) {
            return bannerView2.getAdSize();
        }
        return null;
    }

    @Override // org.bidon.sdk.ads.banner.PositionedBanner
    @NotNull
    /* JADX INFO: renamed from: getBannerFormat, reason: from getter */
    public BannerFormat get_bannerFormat() {
        return this._bannerFormat;
    }

    @Override // org.bidon.sdk.databinders.extras.Extras
    @NotNull
    public Map<String, Object> getExtras() {
        return this.extras.getExtras();
    }

    @Override // org.bidon.sdk.ads.banner.PositionedBanner
    public void hideAd(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        LogExtKt.logInfo(getTag(), "Hide ad.");
        if (BidonSdk.isInitialized()) {
            activity.runOnUiThread(new Runnable() { // from class: org.bidon.sdk.ads.banner.a
                @Override // java.lang.Runnable
                public final void run() {
                    BannerManager.hideAd$lambda$5(this.f97550b, activity);
                }
            });
        } else {
            LogExtKt.logInfo(TagKt.getTAG(this), "Sdk is not initialized");
        }
    }

    @Override // org.bidon.sdk.ads.InitAwaiter
    @Nullable
    public Object initWaitAndContinueIfRequired(@NotNull Function1<? super Continuation, ? extends Object> function1, @NotNull Function1<? super Continuation, ? extends Object> function12, @NotNull Continuation continuation) {
        return this.$$delegate_0.initWaitAndContinueIfRequired(function1, function12, continuation);
    }

    @Override // org.bidon.sdk.ads.banner.PositionedBanner
    /* JADX INFO: renamed from: isDisplaying, reason: from getter */
    public boolean getIsDisplaying() {
        return this.isDisplaying;
    }

    @Override // org.bidon.sdk.ads.banner.PositionedBanner
    public boolean isReady() {
        BannerView bannerView = this.nextBannerView;
        return bannerView != null && bannerView.isReady();
    }

    @Override // org.bidon.sdk.ads.banner.PositionedBanner
    public void loadAd(@NotNull Activity activity, double pricefloor) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.weakActivity = new WeakReference<>(activity);
        eg.i.d(getScope(), null, null, new AnonymousClass1(activity, pricefloor, null), 3, null);
    }

    @Override // org.bidon.sdk.ads.banner.PositionedBanner
    public void notifyLoss(@NotNull Activity activity, @NotNull final String winnerDemandId, final double winnerPrice) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        activity.runOnUiThread(new Runnable() { // from class: org.bidon.sdk.ads.banner.e
            @Override // java.lang.Runnable
            public final void run() {
                BannerManager.notifyLoss$lambda$7(this.f97554b, winnerDemandId, winnerPrice);
            }
        });
    }

    @Override // org.bidon.sdk.ads.banner.PositionedBanner
    public void notifyWin() {
        BannerView bannerView = this.nextBannerView;
        if (bannerView != null) {
            bannerView.notifyWin();
        }
    }

    @Override // org.bidon.sdk.ads.banner.PositionedBanner
    public void setBannerFormat(@NotNull BannerFormat bannerFormat) {
        Intrinsics.checkNotNullParameter(bannerFormat, "bannerFormat");
        this._bannerFormat = bannerFormat;
    }

    @Override // org.bidon.sdk.ads.banner.PositionedBanner
    public void setBannerListener(@Nullable BannerListener listener) {
        this.publisherListener = listener;
    }

    @Override // org.bidon.sdk.ads.banner.PositionedBanner
    public void setCustomPosition(@NotNull Point offset, int rotation, @NotNull PointF anchor) {
        Activity activity;
        Intrinsics.checkNotNullParameter(offset, "offset");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        LogExtKt.logInfo(getTag(), "Set position by coordinates Offset(" + offset + "), Rotation(" + rotation + "), Anchor(" + anchor + ")");
        this.positionState = new AdRenderer.PositionState.Coordinate(new AdRenderer.AdContainerParams(offset, rotation, anchor));
        if (!BidonSdk.isInitialized()) {
            LogExtKt.logInfo(TagKt.getTAG(this), "Sdk is not initialized");
        } else {
            if (!getIsDisplaying() || (activity = this.weakActivity.get()) == null) {
                return;
            }
            showAd(activity);
        }
    }

    @Override // org.bidon.sdk.ads.banner.PositionedBanner
    public void setPosition(@NotNull BannerPosition position) {
        Activity activity;
        Intrinsics.checkNotNullParameter(position, "position");
        LogExtKt.logInfo(getTag(), "Set position " + position);
        this.positionState = new AdRenderer.PositionState.Place(position);
        if (!BidonSdk.isInitialized()) {
            LogExtKt.logInfo(TagKt.getTAG(this), "Sdk is not initialized");
        } else {
            if (!getIsDisplaying() || (activity = this.weakActivity.get()) == null) {
                return;
            }
            showAd(activity);
        }
    }

    @Override // org.bidon.sdk.ads.banner.PositionedBanner
    public void showAd(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        LogExtKt.logInfo(getTag(), "Show ad. " + Thread.currentThread());
        activity.runOnUiThread(new Runnable() { // from class: org.bidon.sdk.ads.banner.b
            @Override // java.lang.Runnable
            public final void run() {
                BannerManager.showAd$lambda$4(this.f97552b, activity);
            }
        });
    }

    private BannerManager(BannersCache bannersCache, Extras extras, String str) {
        this.$$delegate_0 = new InitAwaiterImpl();
        this.bannersCache = bannersCache;
        this.extras = extras;
        this.auctionKey = str;
        this.scope = lf.i.a(new Function0() { // from class: org.bidon.sdk.ads.banner.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BannerManager.scope_delegate$lambda$0();
            }
        });
        this.weakActivity = new WeakReference<>(null);
        this.showAfterLoad = new AtomicBoolean(false);
        this.positionState = AdRenderer.PositionState.INSTANCE.getDefault();
        this.adRenderer = lf.i.a(new Function0() { // from class: org.bidon.sdk.ads.banner.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BannerManager.adRenderer_delegate$lambda$1();
            }
        });
        this._bannerFormat = BannerFormat.Banner;
    }

    /* synthetic */ BannerManager(BannersCache bannersCache, Extras extras, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bannersCache, extras, (i10 & 4) != 0 ? null : str);
    }

    public /* synthetic */ BannerManager(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }

    public BannerManager(@Nullable String str) {
        this(new BannersCacheImpl(), new ExtrasImpl(), str);
        LogExtKt.logInfo(getTag(), "Created " + this);
    }
}
