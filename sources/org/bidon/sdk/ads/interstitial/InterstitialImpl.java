package org.bidon.sdk.ads.interstitial;

import android.app.Activity;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import com.ironsource.Df;
import eg.e1;
import eg.o0;
import hg.i;
import java.util.Arrays;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import lf.m;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.bidon.sdk.BidonSdk;
import org.bidon.sdk.adapter.AdEvent;
import org.bidon.sdk.adapter.AdSource;
import org.bidon.sdk.adapter.DemandAd;
import org.bidon.sdk.adapter.ext.AdSourceExtKt;
import org.bidon.sdk.ads.Ad;
import org.bidon.sdk.ads.AdType;
import org.bidon.sdk.ads.AuctionInfo;
import org.bidon.sdk.ads.InitAwaiter;
import org.bidon.sdk.ads.InitAwaiterImpl;
import org.bidon.sdk.ads.cache.AdCache;
import org.bidon.sdk.ads.interstitial.InterstitialImpl;
import org.bidon.sdk.auction.AdTypeParam;
import org.bidon.sdk.auction.models.AuctionResult;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.config.impl.BidonErrorExtKt;
import org.bidon.sdk.databinders.extras.Extras;
import org.bidon.sdk.logs.analytic.AdValue;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.utils.SdkDispatchers;
import org.bidon.sdk.utils.di.InstanceType;
import org.bidon.sdk.utils.di.SimpleDiStorage;
import org.bidon.sdk.utils.ext.TagKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0091\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0019\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010+\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\rH\u0016J\u0018\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020)H\u0016J\b\u0010/\u001a\u00020%H\u0016J\b\u00100\u001a\u00020%H\u0016J\u001c\u00101\u001a\u00020%2\u0006\u00102\u001a\u0002032\n\u00104\u001a\u0006\u0012\u0002\b\u000305H\u0002J\r\u00106\u001a\u00020\u0019H\u0002¢\u0006\u0002\u0010\u001bJ\u001b\u00107\u001a\u00020%2\u0006\u00108\u001a\u00020\u00072\b\u00109\u001a\u0004\u0018\u00010:H\u0096\u0001J\u0015\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020:0<H\u0096\u0001JJ\u0010=\u001a\u00020%2\u001c\u0010>\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0@\u0012\u0006\u0012\u0004\u0018\u00010:0?2\u001c\u0010A\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0@\u0012\u0006\u0012\u0004\u0018\u00010:0?H\u0096A¢\u0006\u0002\u0010BR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\u001f\u0010 ¨\u0006C"}, d2 = {"Lorg/bidon/sdk/ads/interstitial/InterstitialImpl;", "Lorg/bidon/sdk/ads/InitAwaiter;", "Lorg/bidon/sdk/ads/interstitial/Interstitial;", "Lorg/bidon/sdk/databinders/extras/Extras;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "auctionKey", "", "demandAd", "Lorg/bidon/sdk/adapter/DemandAd;", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/String;Lorg/bidon/sdk/adapter/DemandAd;)V", "userListener", "Lorg/bidon/sdk/ads/interstitial/InterstitialListener;", Reporting.EventType.WINNER, "Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "observeCallbacksJob", "Lkotlinx/coroutines/Job;", "adCache", "Lorg/bidon/sdk/ads/cache/AdCache;", "getAdCache", "()Lorg/bidon/sdk/ads/cache/AdCache;", "adCache$delegate", "Lkotlin/Lazy;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "org/bidon/sdk/ads/interstitial/InterstitialImpl$getInterstitialListener$1", "getListener", "()Lorg/bidon/sdk/ads/interstitial/InterstitialImpl$getInterstitialListener$1;", "listener$delegate", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope$delegate", "isReady", "", "loadAd", "", "activity", "Landroid/app/Activity;", "pricefloor", "", "showAd", "setInterstitialListener", "notifyLoss", "winnerDemandId", "winnerPrice", "notifyWin", "destroyAd", "subscribeToWinner", "auctionInfo", "Lorg/bidon/sdk/ads/AuctionInfo;", "adSource", "Lorg/bidon/sdk/adapter/AdSource;", "getInterstitialListener", "addExtra", C4240b4.i.W, "value", "", "getExtras", "", "initWaitAndContinueIfRequired", "onSuccess", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "onFailure", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InterstitialImpl implements InitAwaiter, Interstitial, Extras {
    private final /* synthetic */ InitAwaiterImpl $$delegate_0;

    /* JADX INFO: renamed from: adCache$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adCache;

    @Nullable
    private final String auctionKey;

    @NotNull
    private final DemandAd demandAd;

    /* JADX INFO: renamed from: listener$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy listener;

    @Nullable
    private Job observeCallbacksJob;

    /* JADX INFO: renamed from: scope$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scope;

    @Nullable
    private InterstitialListener userListener;

    @Nullable
    private AdSource.Interstitial<?> winner;

    /* JADX INFO: renamed from: org.bidon.sdk.ads.interstitial.InterstitialImpl$destroyAd$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.ads.interstitial.InterstitialImpl$destroyAd$1", f = "InterstitialImpl.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return InterstitialImpl.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            AdSource.Interstitial interstitial = InterstitialImpl.this.winner;
            if (interstitial != null) {
                interstitial.destroy();
            }
            InterstitialImpl.this.winner = null;
            InterstitialImpl.this.getAdCache().clear();
            Job job = InterstitialImpl.this.observeCallbacksJob;
            if (job != null) {
                Job.a.a(job, null, 1, null);
            }
            InterstitialImpl.this.observeCallbacksJob = null;
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.ads.interstitial.InterstitialImpl$getInterstitialListener$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¨\u0006\u0013"}, d2 = {"org/bidon/sdk/ads/interstitial/InterstitialImpl$getInterstitialListener$1", "Lorg/bidon/sdk/ads/interstitial/InterstitialListener;", "onAdLoaded", "", "ad", "Lorg/bidon/sdk/ads/Ad;", "auctionInfo", "Lorg/bidon/sdk/ads/AuctionInfo;", Df.f40641b, "cause", "Lorg/bidon/sdk/config/BidonError;", Df.f40644e, "onAdShown", Df.f40645f, Df.f40646g, "onAdExpired", "onRevenuePaid", "adValue", "Lorg/bidon/sdk/logs/analytic/AdValue;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C58081 implements InterstitialListener {
        C58081() {
        }

        @Override // org.bidon.sdk.ads.AdListener
        public void onAdClicked(Ad ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            InterstitialListener interstitialListener = InterstitialImpl.this.userListener;
            if (interstitialListener != null) {
                interstitialListener.onAdClicked(ad2);
            }
        }

        @Override // org.bidon.sdk.ads.FullscreenAdListener
        public void onAdClosed(Ad ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            InterstitialListener interstitialListener = InterstitialImpl.this.userListener;
            if (interstitialListener != null) {
                interstitialListener.onAdClosed(ad2);
            }
        }

        @Override // org.bidon.sdk.ads.AdListener
        public void onAdExpired(Ad ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            InterstitialListener interstitialListener = InterstitialImpl.this.userListener;
            if (interstitialListener != null) {
                interstitialListener.onAdExpired(ad2);
            }
        }

        @Override // org.bidon.sdk.ads.AdListener
        public void onAdLoadFailed(AuctionInfo auctionInfo, BidonError cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            InterstitialListener interstitialListener = InterstitialImpl.this.userListener;
            if (interstitialListener != null) {
                interstitialListener.onAdLoadFailed(auctionInfo, cause);
            }
        }

        @Override // org.bidon.sdk.ads.AdListener
        public void onAdLoaded(Ad ad2, AuctionInfo auctionInfo) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            Intrinsics.checkNotNullParameter(auctionInfo, "auctionInfo");
            InterstitialListener interstitialListener = InterstitialImpl.this.userListener;
            if (interstitialListener != null) {
                interstitialListener.onAdLoaded(ad2, auctionInfo);
            }
        }

        @Override // org.bidon.sdk.ads.AdListener
        public void onAdShowFailed(BidonError cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            InterstitialListener interstitialListener = InterstitialImpl.this.userListener;
            if (interstitialListener != null) {
                interstitialListener.onAdShowFailed(cause);
            }
        }

        @Override // org.bidon.sdk.ads.AdListener
        public void onAdShown(Ad ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            InterstitialListener interstitialListener = InterstitialImpl.this.userListener;
            if (interstitialListener != null) {
                interstitialListener.onAdShown(ad2);
            }
        }

        @Override // org.bidon.sdk.logs.analytic.AdRevenueListener
        public void onRevenuePaid(Ad ad2, AdValue adValue) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            Intrinsics.checkNotNullParameter(adValue, "adValue");
            InterstitialListener interstitialListener = InterstitialImpl.this.userListener;
            if (interstitialListener != null) {
                interstitialListener.onRevenuePaid(ad2, adValue);
            }
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.ads.interstitial.InterstitialImpl$loadAd$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.ads.interstitial.InterstitialImpl$loadAd$1", f = "InterstitialImpl.kt", l = {68}, m = "invokeSuspend")
    static final class C58091 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ double $pricefloor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: org.bidon.sdk.ads.interstitial.InterstitialImpl$loadAd$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.ads.interstitial.InterstitialImpl$loadAd$1$1", f = "InterstitialImpl.kt", l = {}, m = "invokeSuspend")
        static final class C11431 extends k implements Function1<Continuation, Object> {
            final /* synthetic */ CoroutineScope $$this$launch;
            final /* synthetic */ Activity $activity;
            final /* synthetic */ double $pricefloor;
            int label;
            final /* synthetic */ InterstitialImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11431(CoroutineScope coroutineScope, double d10, InterstitialImpl interstitialImpl, Activity activity, Continuation continuation) {
                super(1, continuation);
                this.$$this$launch = coroutineScope;
                this.$pricefloor = d10;
                this.this$0 = interstitialImpl;
                this.$activity = activity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$1(InterstitialImpl interstitialImpl, AuctionResult auctionResult, AuctionInfo auctionInfo) {
                interstitialImpl.subscribeToWinner(auctionInfo, auctionResult.getAdSource());
                C58081 listener = interstitialImpl.getListener();
                Ad ad2 = AdSourceExtKt.getAd(auctionResult.getAdSource());
                if (ad2 == null) {
                    throw new IllegalArgumentException("[Ad] should exist when action succeeds");
                }
                listener.onAdLoaded(ad2, auctionInfo);
                return Unit.f93236a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$2(InterstitialImpl interstitialImpl, AuctionInfo auctionInfo, Throwable th2) {
                interstitialImpl.getListener().onAdLoadFailed(auctionInfo, BidonErrorExtKt.asBidonErrorOrUnspecified(th2));
                return Unit.f93236a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Continuation continuation) {
                return new C11431(this.$$this$launch, this.$pricefloor, this.this$0, this.$activity, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                LogExtKt.logInfo(TagKt.getTAG(this.$$this$launch), "Load (pricefloor=" + this.$pricefloor + ")");
                AdCache adCache = this.this$0.getAdCache();
                AdTypeParam.Interstitial interstitial = new AdTypeParam.Interstitial(this.$activity, this.$pricefloor, this.this$0.auctionKey);
                final InterstitialImpl interstitialImpl = this.this$0;
                Function2<? super AuctionResult, ? super AuctionInfo, Unit> function2 = new Function2() { // from class: org.bidon.sdk.ads.interstitial.f
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return InterstitialImpl.C58091.C11431.invokeSuspend$lambda$1(interstitialImpl, (AuctionResult) obj2, (AuctionInfo) obj3);
                    }
                };
                final InterstitialImpl interstitialImpl2 = this.this$0;
                adCache.cache(interstitial, function2, new Function2() { // from class: org.bidon.sdk.ads.interstitial.g
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return InterstitialImpl.C58091.C11431.invokeSuspend$lambda$2(interstitialImpl2, (AuctionInfo) obj2, (Throwable) obj3);
                    }
                });
                return Unit.f93236a;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation continuation) {
                return ((C11431) create(continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX INFO: renamed from: org.bidon.sdk.ads.interstitial.InterstitialImpl$loadAd$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.ads.interstitial.InterstitialImpl$loadAd$1$2", f = "InterstitialImpl.kt", l = {95}, m = "invokeSuspend")
        static final class AnonymousClass2 extends k implements Function1<Continuation, Object> {
            int label;
            final /* synthetic */ InterstitialImpl this$0;

            /* JADX INFO: renamed from: org.bidon.sdk.ads.interstitial.InterstitialImpl$loadAd$1$2$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.ads.interstitial.InterstitialImpl$loadAd$1$2$1", f = "InterstitialImpl.kt", l = {}, m = "invokeSuspend")
            static final class C11441 extends k implements Function2<CoroutineScope, Continuation, Object> {
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ InterstitialImpl this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C11441(InterstitialImpl interstitialImpl, Continuation continuation) {
                    super(2, continuation);
                    this.this$0 = interstitialImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation create(Object obj, Continuation continuation) {
                    C11441 c11441 = new C11441(this.this$0, continuation);
                    c11441.L$0 = obj;
                    return c11441;
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
                    return ((C11441) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(InterstitialImpl interstitialImpl, Continuation continuation) {
                super(1, continuation);
                this.this$0 = interstitialImpl;
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
                    C11441 c11441 = new C11441(this.this$0, null);
                    this.label = 1;
                    if (eg.g.g(e1VarC, c11441, this) == objG) {
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
        C58091(double d10, Activity activity, Continuation continuation) {
            super(2, continuation);
            this.$pricefloor = d10;
            this.$activity = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            C58091 c58091 = InterstitialImpl.this.new C58091(this.$pricefloor, this.$activity, continuation);
            c58091.L$0 = obj;
            return c58091;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                InterstitialImpl interstitialImpl = InterstitialImpl.this;
                C11431 c11431 = new C11431(coroutineScope, this.$pricefloor, interstitialImpl, this.$activity, null);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(InterstitialImpl.this, null);
                this.label = 1;
                if (interstitialImpl.initWaitAndContinueIfRequired(c11431, anonymousClass2, this) == objG) {
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
            return ((C58091) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.ads.interstitial.InterstitialImpl$subscribeToWinner$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "adEvent", "Lorg/bidon/sdk/adapter/AdEvent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "org.bidon.sdk.ads.interstitial.InterstitialImpl$subscribeToWinner$1", f = "InterstitialImpl.kt", l = {}, m = "invokeSuspend")
    static final class C58101 extends k implements Function2<AdEvent, Continuation, Object> {
        final /* synthetic */ AdSource<?> $adSource;
        final /* synthetic */ AuctionInfo $auctionInfo;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C58101(AdSource<?> adSource, AuctionInfo auctionInfo, Continuation continuation) {
            super(2, continuation);
            this.$adSource = adSource;
            this.$auctionInfo = auctionInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            C58101 c58101 = InterstitialImpl.this.new C58101(this.$adSource, this.$auctionInfo, continuation);
            c58101.L$0 = obj;
            return c58101;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            AdEvent adEvent = (AdEvent) this.L$0;
            if (!(adEvent instanceof AdEvent.OnReward) && !(adEvent instanceof AdEvent.Fill)) {
                if (adEvent instanceof AdEvent.Clicked) {
                    InterstitialImpl.this.getListener().onAdClicked(((AdEvent.Clicked) adEvent).getAd());
                    this.$adSource.sendClickImpression();
                } else if (adEvent instanceof AdEvent.Closed) {
                    InterstitialImpl.this.getListener().onAdClosed(((AdEvent.Closed) adEvent).getAd());
                    Job job = InterstitialImpl.this.observeCallbacksJob;
                    if (job != null) {
                        Job.a.a(job, null, 1, null);
                    }
                    InterstitialImpl.this.observeCallbacksJob = null;
                } else if (adEvent instanceof AdEvent.Shown) {
                    InterstitialImpl.this.getListener().onAdShown(((AdEvent.Shown) adEvent).getAd());
                    this.$adSource.sendShowImpression();
                } else if (adEvent instanceof AdEvent.PaidRevenue) {
                    AdEvent.PaidRevenue paidRevenue = (AdEvent.PaidRevenue) adEvent;
                    InterstitialImpl.this.getListener().onRevenuePaid(paidRevenue.getAd(), paidRevenue.getAdValue());
                } else if (adEvent instanceof AdEvent.ShowFailed) {
                    InterstitialImpl.this.getListener().onAdShowFailed(((AdEvent.ShowFailed) adEvent).getCause());
                } else if (adEvent instanceof AdEvent.LoadFailed) {
                    InterstitialImpl.this.getListener().onAdLoadFailed(this.$auctionInfo, ((AdEvent.LoadFailed) adEvent).getCause());
                } else {
                    if (!(adEvent instanceof AdEvent.Expired)) {
                        throw new m();
                    }
                    InterstitialImpl.this.getListener().onAdExpired(((AdEvent.Expired) adEvent).getAd());
                }
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AdEvent adEvent, Continuation continuation) {
            return ((C58101) create(adEvent, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public InterstitialImpl() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdCache adCache_delegate$lambda$1(final InterstitialImpl interstitialImpl) {
        Function1 function1 = new Function1() { // from class: org.bidon.sdk.ads.interstitial.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InterstitialImpl.adCache_delegate$lambda$1$lambda$0(this.f97613b, (InstanceType.ParamFactory.Params) obj);
            }
        };
        InstanceType<?> instanceType = SimpleDiStorage.INSTANCE.getInstances().get(v0.b(AdCache.class));
        if (instanceType instanceof InstanceType.Singleton) {
            Object singleton = ((InstanceType.Singleton) instanceType).getInstance();
            if (singleton != null) {
                return (AdCache) singleton;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.ads.cache.AdCache");
        }
        if (instanceType instanceof InstanceType.Factory) {
            Object objBuild = ((InstanceType.Factory) instanceType).build();
            if (objBuild != null) {
                return (AdCache) objBuild;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.ads.cache.AdCache");
        }
        if (!(instanceType instanceof InstanceType.ParamFactory)) {
            if (instanceType != null) {
                throw new m();
            }
            throw new IllegalStateException(("No factory provided for class: " + AdCache.class).toString());
        }
        InstanceType.ParamFactory.Params params = new InstanceType.ParamFactory.Params();
        function1.invoke(params);
        Object[] parameters = params.getParameters();
        Object objBuild2 = ((InstanceType.ParamFactory) instanceType).build(Arrays.copyOf(parameters, parameters.length));
        if (objBuild2 != null) {
            return (AdCache) objBuild2;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.bidon.sdk.ads.cache.AdCache");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adCache_delegate$lambda$1$lambda$0(InterstitialImpl interstitialImpl, InstanceType.ParamFactory.Params get) {
        Intrinsics.checkNotNullParameter(get, "$this$get");
        get.params(interstitialImpl.demandAd);
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdCache getAdCache() {
        return (AdCache) this.adCache.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C58081 getInterstitialListener() {
        return new C58081();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C58081 getListener() {
        return (C58081) this.listener.getValue();
    }

    private final CoroutineScope getScope() {
        return (CoroutineScope) this.scope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAd$lambda$4(InterstitialImpl interstitialImpl, Activity activity) {
        AuctionResult auctionResultPop = interstitialImpl.getAdCache().pop();
        AdSource<?> adSource = auctionResultPop != null ? auctionResultPop.getAdSource() : null;
        AdSource.Interstitial<?> interstitial = adSource instanceof AdSource.Interstitial ? (AdSource.Interstitial) adSource : null;
        if (interstitial == null) {
            LogExtKt.logInfo(TagKt.getTAG(interstitialImpl), "Show failed. No Auction results.");
            interstitialImpl.getListener().onAdShowFailed(BidonError.AdNotReady.INSTANCE);
        } else {
            interstitialImpl.winner = interstitial;
            interstitial.show(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void subscribeToWinner(AuctionInfo auctionInfo, AdSource<?> adSource) {
        if (!(adSource instanceof AdSource.Interstitial)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.observeCallbacksJob = i.F(i.K(adSource.getAdEvent(), new C58101(adSource, auctionInfo, null)), getScope());
    }

    @Override // org.bidon.sdk.databinders.extras.Extras
    public void addExtra(@NotNull String key, @Nullable Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.demandAd.addExtra(key, value);
    }

    @Override // org.bidon.sdk.ads.interstitial.Interstitial
    public void destroyAd() {
        if (!BidonSdk.isInitialized()) {
            LogExtKt.logInfo(TagKt.getTAG(this), "Sdk is not initialized");
        } else {
            LogExtKt.logInfo(TagKt.getTAG(this), "Destroy ad");
            eg.i.d(getScope(), o0.c().w(), null, new AnonymousClass1(null), 2, null);
        }
    }

    @Override // org.bidon.sdk.databinders.extras.Extras
    @NotNull
    public Map<String, Object> getExtras() {
        return this.demandAd.getExtras();
    }

    @Override // org.bidon.sdk.ads.InitAwaiter
    @Nullable
    public Object initWaitAndContinueIfRequired(@NotNull Function1<? super Continuation, ? extends Object> function1, @NotNull Function1<? super Continuation, ? extends Object> function12, @NotNull Continuation continuation) {
        return this.$$delegate_0.initWaitAndContinueIfRequired(function1, function12, continuation);
    }

    @Override // org.bidon.sdk.ads.interstitial.Interstitial
    public boolean isReady() {
        AdSource<?> adSource;
        if (BidonSdk.isInitialized()) {
            AuctionResult auctionResultPeek = getAdCache().peek();
            return (auctionResultPeek == null || (adSource = auctionResultPeek.getAdSource()) == null || !adSource.isAdReadyToShow()) ? false : true;
        }
        LogExtKt.logInfo(TagKt.getTAG(this), "Sdk is not initialized");
        return false;
    }

    @Override // org.bidon.sdk.ads.interstitial.Interstitial
    public void loadAd(@NotNull Activity activity, double pricefloor) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        eg.i.d(getScope(), o0.a(), null, new C58091(pricefloor, activity, null), 2, null);
    }

    @Override // org.bidon.sdk.stats.WinLossNotifier
    public void notifyLoss(@NotNull String winnerDemandId, double winnerPrice) {
        AdSource<?> adSource;
        Intrinsics.checkNotNullParameter(winnerDemandId, "winnerDemandId");
        if (!BidonSdk.isInitialized()) {
            LogExtKt.logInfo(TagKt.getTAG(this), "Sdk is not initialized");
            return;
        }
        AuctionResult auctionResultPop = getAdCache().pop();
        if (auctionResultPop != null && (adSource = auctionResultPop.getAdSource()) != null) {
            AdSourceExtKt.notifyExternalLoss(adSource, winnerDemandId, winnerPrice);
        }
        destroyAd();
    }

    @Override // org.bidon.sdk.stats.WinLossNotifier
    public void notifyWin() {
        if (!BidonSdk.isInitialized()) {
            LogExtKt.logInfo(TagKt.getTAG(this), "Sdk is not initialized");
            return;
        }
        AdSource.Interstitial<?> interstitial = this.winner;
        if (interstitial == null) {
            AuctionResult auctionResultPeek = getAdCache().peek();
            AdSource<?> adSource = auctionResultPeek != null ? auctionResultPeek.getAdSource() : null;
            interstitial = adSource instanceof AdSource.Interstitial ? (AdSource.Interstitial) adSource : null;
        }
        if (interstitial != null) {
            AdSourceExtKt.notifyExternalWin(interstitial);
        }
        this.winner = null;
    }

    @Override // org.bidon.sdk.ads.interstitial.Interstitial
    public void setInterstitialListener(@NotNull InterstitialListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        LogExtKt.logInfo(TagKt.getTAG(this), "Set interstitial listener");
        this.userListener = listener;
    }

    @Override // org.bidon.sdk.ads.interstitial.Interstitial
    public void showAd(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (BidonSdk.isInitialized()) {
            LogExtKt.logInfo(TagKt.getTAG(this), LogConstants.EVENT_SHOW);
            activity.runOnUiThread(new Runnable() { // from class: org.bidon.sdk.ads.interstitial.a
                @Override // java.lang.Runnable
                public final void run() {
                    InterstitialImpl.showAd$lambda$4(this.f97611b, activity);
                }
            });
        } else {
            LogExtKt.logInfo(TagKt.getTAG(this), "Sdk is not initialized");
            getListener().onAdShowFailed(BidonError.SdkNotInitialized.INSTANCE);
        }
    }

    public InterstitialImpl(@NotNull final CoroutineDispatcher dispatcher, @Nullable String str, @NotNull DemandAd demandAd) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(demandAd, "demandAd");
        this.$$delegate_0 = new InitAwaiterImpl();
        this.auctionKey = str;
        this.demandAd = demandAd;
        this.adCache = lf.i.a(new Function0() { // from class: org.bidon.sdk.ads.interstitial.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InterstitialImpl.adCache_delegate$lambda$1(this.f97614b);
            }
        });
        this.listener = lf.i.a(new Function0() { // from class: org.bidon.sdk.ads.interstitial.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f97615b.getInterstitialListener();
            }
        });
        this.scope = lf.i.a(new Function0() { // from class: org.bidon.sdk.ads.interstitial.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kotlinx.coroutines.i.a(dispatcher);
            }
        });
    }

    public /* synthetic */ InterstitialImpl(CoroutineDispatcher coroutineDispatcher, String str, DemandAd demandAd, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? SdkDispatchers.INSTANCE.getMain() : coroutineDispatcher, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? new DemandAd(AdType.Interstitial) : demandAd);
    }
}
