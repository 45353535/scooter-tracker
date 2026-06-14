package com.moloco.sdk.publisher;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.device.ads.DtbConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.N6;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.h0;
import com.moloco.sdk.internal.publisher.o0;
import com.moloco.sdk.internal.publisher.p;
import com.moloco.sdk.internal.publisher.q0;
import com.moloco.sdk.internal.services.bidtoken.r;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.init.MolocoInitParams;
import com.moloco.sdk.service_locator.b;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\"\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013JM\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142 \u0010\u001b\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\b0\u0017j\u0002`\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJM\u0010\u001e\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142 \u0010\u001b\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\b0\u0017j\u0002`\u001aH\u0007¢\u0006\u0004\b\u001e\u0010\u001dJM\u0010\u001f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142 \u0010\u001b\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\b0\u0017j\u0002`\u001aH\u0007¢\u0006\u0004\b\u001f\u0010\u001dJM\u0010\"\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142 \u0010\u001b\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\b0\u0017j\u0002`!H\u0007¢\u0006\u0004\b\"\u0010\u001dJM\u0010%\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142 \u0010\u001b\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010#\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\b0\u0017j\u0002`$H\u0007¢\u0006\u0004\b%\u0010\u001dJM\u0010(\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142 \u0010\u001b\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\b0\u0017j\u0002`'H\u0007¢\u0006\u0004\b(\u0010\u001dJ\u0017\u0010+\u001a\u00020\b2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\bH\u0082@¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u0004H\u0002¢\u0006\u0004\b0\u0010\fJ\u000f\u00101\u001a\u00020\bH\u0002¢\u0006\u0004\b1\u0010\u0003J\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u00020\u0014H\u0002¢\u0006\u0004\b4\u00105J\u0010\u00107\u001a\u00020\bH\u0081@¢\u0006\u0004\b6\u0010.R2\u0010:\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000609088\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u0010\u0003\u001a\u0004\b<\u0010=R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00140?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010D\u001a\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010D\u001a\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010D\u001a\u0004\bT\u0010UR*\u0010X\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bX\u0010Y\u0012\u0004\b^\u0010\u0003\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R*\u0010/\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b/\u0010_\u0012\u0004\bc\u0010\u0003\u001a\u0004\b`\u0010a\"\u0004\bb\u0010\fR\u001a\u0010d\u001a\u0002038FX\u0087\u0004¢\u0006\f\u0012\u0004\bf\u0010\u0003\u001a\u0004\bd\u0010eR\u0016\u0010i\u001a\u0004\u0018\u00010\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00140j8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bk\u0010l¨\u0006n"}, d2 = {"Lcom/moloco/sdk/publisher/Moloco;", "", "<init>", "()V", "Lcom/moloco/sdk/publisher/init/MolocoInitParams;", "initParam", "Lcom/moloco/sdk/publisher/MolocoInitializationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", MobileAdsBridgeBase.initializeMethodName, "(Lcom/moloco/sdk/publisher/init/MolocoInitParams;Lcom/moloco/sdk/publisher/MolocoInitializationListener;)V", "logMolocoInfo", "(Lcom/moloco/sdk/publisher/init/MolocoInitParams;)V", "Lcom/moloco/sdk/publisher/MediationInfo;", "mediationInfo", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/moloco/sdk/publisher/MolocoBidTokenListener;", "getBidToken", "(Lcom/moloco/sdk/publisher/MediationInfo;Landroid/content/Context;Lcom/moloco/sdk/publisher/MolocoBidTokenListener;)V", "", "adUnitId", "watermarkString", "Lkotlin/Function2;", "Lcom/moloco/sdk/publisher/Banner;", "Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;", "Lcom/moloco/sdk/publisher/CreateBannerCallback;", "callback", "createBanner", "(Lcom/moloco/sdk/publisher/MediationInfo;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "createBannerTablet", "createMREC", "Lcom/moloco/sdk/publisher/NativeAd;", "Lcom/moloco/sdk/publisher/CreateNativeAdCallback;", "createNativeAd", "Lcom/moloco/sdk/publisher/InterstitialAd;", "Lcom/moloco/sdk/publisher/CreateInterstitialAdCallback;", "createInterstitial", "Lcom/moloco/sdk/publisher/RewardedInterstitialAd;", "Lcom/moloco/sdk/publisher/CreateRewardedInterstitialAdCallback;", "createRewardedInterstitial", "Lcom/moloco/sdk/Init$SDKInitResponse;", "sdkInitResponse", "processInitConfigs", "(Lcom/moloco/sdk/Init$SDKInitResponse;)V", "updateAndroidClientMetricsOnInitSuccess", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initParams", "initializeAndroidClientMetrics", "initializeILRD", DtbConstants.MEDIATION_NAME, "", "shouldInitializeILRD", "(Ljava/lang/String;)Z", "clearState$moloco_sdk_release", "clearState", "", "", "pendingInitByMediator", "Ljava/util/Map;", "getPendingInitByMediator$moloco_sdk_release", "()Ljava/util/Map;", "getPendingInitByMediator$moloco_sdk_release$annotations", "", "_failedMediations", "Ljava/util/Set;", "Lcom/moloco/sdk/internal/publisher/o0;", "initializationHandler$delegate", "Lkotlin/Lazy;", "getInitializationHandler", "()Lcom/moloco/sdk/internal/publisher/o0;", "initializationHandler", "Lcom/moloco/sdk/internal/services/bidtoken/k;", "bidTokenHandler$delegate", "getBidTokenHandler", "()Lcom/moloco/sdk/internal/services/bidtoken/k;", "bidTokenHandler", "Lcom/moloco/sdk/internal/publisher/o;", "adCreator$delegate", "getAdCreator", "()Lcom/moloco/sdk/internal/publisher/o;", "adCreator", "Lkotlinx/coroutines/CoroutineScope;", "scope$delegate", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/Job;", "initJob", "Lkotlinx/coroutines/Job;", "getInitJob", "()Lkotlinx/coroutines/Job;", "setInitJob", "(Lkotlinx/coroutines/Job;)V", "getInitJob$annotations", "Lcom/moloco/sdk/publisher/init/MolocoInitParams;", "getInitParams", "()Lcom/moloco/sdk/publisher/init/MolocoInitParams;", "setInitParams", "getInitParams$annotations", "isInitialized", "()Z", "isInitialized$annotations", "getAppKey$moloco_sdk_release", "()Ljava/lang/String;", "appKey", "", "getFailedMediations$moloco_sdk_release", "()Ljava/util/Set;", "failedMediations", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class Moloco {

    @Nullable
    private static Job initJob;

    @Nullable
    private static MolocoInitParams initParams;

    @NotNull
    public static final Moloco INSTANCE = new Moloco();

    @NotNull
    private static final Map<String, List<MolocoInitializationListener>> pendingInitByMediator = new LinkedHashMap();

    @NotNull
    private static final Set<String> _failedMediations = new LinkedHashSet();

    /* JADX INFO: renamed from: initializationHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy initializationHandler = lf.i.a(new Function0() { // from class: com.moloco.sdk.publisher.c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Moloco.initializationHandler_delegate$lambda$7();
        }
    });

    /* JADX INFO: renamed from: bidTokenHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy bidTokenHandler = lf.i.a(new Function0() { // from class: com.moloco.sdk.publisher.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Moloco.bidTokenHandler_delegate$lambda$8();
        }
    });

    /* JADX INFO: renamed from: adCreator$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy adCreator = lf.i.a(new Function0() { // from class: com.moloco.sdk.publisher.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Moloco.adCreator_delegate$lambda$9();
        }
    });

    /* JADX INFO: renamed from: scope$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy scope = lf.i.a(new Function0() { // from class: com.moloco.sdk.publisher.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Moloco.scope_delegate$lambda$10();
        }
    });
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Init$SDKInitResponse.e.values().length];
            try {
                iArr[Init$SDKInitResponse.e.LEVEL_PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.publisher.Moloco$createBanner$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "com.moloco.sdk.publisher.Moloco$createBanner$1", f = "Moloco.kt", l = {249}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $adUnitId;
        final /* synthetic */ Function2<Banner, MolocoAdError.AdCreateError, Unit> $callback;
        final /* synthetic */ MediationInfo $mediationInfo;
        final /* synthetic */ String $watermarkString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(MediationInfo mediationInfo, String str, String str2, Function2<? super Banner, ? super MolocoAdError.AdCreateError, Unit> function2, Continuation continuation) {
            super(2, continuation);
            this.$mediationInfo = mediationInfo;
            this.$adUnitId = str;
            this.$watermarkString = str2;
            this.$callback = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objD;
            Pair pair;
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                com.moloco.sdk.acm.recorder.a aVarA = com.moloco.sdk.acm.recorder.a.Companion.a(this.$mediationInfo.getName());
                com.moloco.sdk.internal.publisher.o adCreator = Moloco.INSTANCE.getAdCreator();
                String name = this.$mediationInfo.getName();
                String str = this.$adUnitId;
                String str2 = this.$watermarkString;
                this.label = 1;
                objD = adCreator.d(name, str, aVarA, str2, this);
                if (objD == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                objD = obj;
            }
            h0 h0Var = (h0) objD;
            if (h0Var instanceof h0.b) {
                pair = TuplesKt.to(((h0.b) h0Var).a(), null);
            } else {
                if (!(h0Var instanceof h0.a)) {
                    throw new lf.m();
                }
                pair = TuplesKt.to(null, ((h0.a) h0Var).a());
            }
            Banner banner = (Banner) pair.component1();
            MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) pair.component2();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Banner for adUnitId: ");
            sb2.append(this.$adUnitId);
            sb2.append(" has error: ");
            sb2.append(banner == null);
            MolocoLogger.info$default(molocoLogger, "Moloco", sb2.toString(), null, false, 12, null);
            this.$callback.invoke(banner, adCreateError);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.publisher.Moloco$createBannerTablet$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "com.moloco.sdk.publisher.Moloco$createBannerTablet$1", f = "Moloco.kt", l = {280}, m = "invokeSuspend")
    public static final class C47281 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $adUnitId;
        final /* synthetic */ Function2<Banner, MolocoAdError.AdCreateError, Unit> $callback;
        final /* synthetic */ MediationInfo $mediationInfo;
        final /* synthetic */ String $watermarkString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C47281(MediationInfo mediationInfo, String str, String str2, Function2<? super Banner, ? super MolocoAdError.AdCreateError, Unit> function2, Continuation continuation) {
            super(2, continuation);
            this.$mediationInfo = mediationInfo;
            this.$adUnitId = str;
            this.$watermarkString = str2;
            this.$callback = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new C47281(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objI;
            Pair pair;
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                com.moloco.sdk.acm.recorder.a aVarA = com.moloco.sdk.acm.recorder.a.Companion.a(this.$mediationInfo.getName());
                com.moloco.sdk.internal.publisher.o adCreator = Moloco.INSTANCE.getAdCreator();
                String name = this.$mediationInfo.getName();
                String str = this.$adUnitId;
                String str2 = this.$watermarkString;
                this.label = 1;
                objI = adCreator.i(name, str, aVarA, str2, this);
                if (objI == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                objI = obj;
            }
            h0 h0Var = (h0) objI;
            if (h0Var instanceof h0.b) {
                pair = TuplesKt.to(((h0.b) h0Var).a(), null);
            } else {
                if (!(h0Var instanceof h0.a)) {
                    throw new lf.m();
                }
                pair = TuplesKt.to(null, ((h0.a) h0Var).a());
            }
            Banner banner = (Banner) pair.component1();
            MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) pair.component2();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Banner for adUnitId: ");
            sb2.append(this.$adUnitId);
            sb2.append(" has error: ");
            sb2.append(banner == null);
            MolocoLogger.info$default(molocoLogger, "Moloco", sb2.toString(), null, false, 12, null);
            this.$callback.invoke(banner, adCreateError);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C47281) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.publisher.Moloco$createInterstitial$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "com.moloco.sdk.publisher.Moloco$createInterstitial$1", f = "Moloco.kt", l = {372}, m = "invokeSuspend")
    public static final class C47291 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $adUnitId;
        final /* synthetic */ Function2<InterstitialAd, MolocoAdError.AdCreateError, Unit> $callback;
        final /* synthetic */ MediationInfo $mediationInfo;
        final /* synthetic */ String $watermarkString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C47291(MediationInfo mediationInfo, String str, String str2, Function2<? super InterstitialAd, ? super MolocoAdError.AdCreateError, Unit> function2, Continuation continuation) {
            super(2, continuation);
            this.$mediationInfo = mediationInfo;
            this.$adUnitId = str;
            this.$watermarkString = str2;
            this.$callback = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new C47291(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objJ;
            Pair pair;
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                com.moloco.sdk.acm.recorder.a aVarA = com.moloco.sdk.acm.recorder.a.Companion.a(this.$mediationInfo.getName());
                com.moloco.sdk.internal.publisher.o adCreator = Moloco.INSTANCE.getAdCreator();
                String name = this.$mediationInfo.getName();
                String str = this.$adUnitId;
                String str2 = this.$watermarkString;
                this.label = 1;
                objJ = adCreator.j(name, str, aVarA, str2, this);
                if (objJ == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                objJ = obj;
            }
            h0 h0Var = (h0) objJ;
            if (h0Var instanceof h0.b) {
                pair = TuplesKt.to(((h0.b) h0Var).a(), null);
            } else {
                if (!(h0Var instanceof h0.a)) {
                    throw new lf.m();
                }
                pair = TuplesKt.to(null, ((h0.a) h0Var).a());
            }
            InterstitialAd interstitialAd = (InterstitialAd) pair.component1();
            MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) pair.component2();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Interstitial for adUnitId: ");
            sb2.append(this.$adUnitId);
            sb2.append(" has error: ");
            sb2.append(interstitialAd == null);
            MolocoLogger.info$default(molocoLogger, "Moloco", sb2.toString(), null, false, 12, null);
            this.$callback.invoke(interstitialAd, adCreateError);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C47291) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.publisher.Moloco$createMREC$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "com.moloco.sdk.publisher.Moloco$createMREC$1", f = "Moloco.kt", l = {311}, m = "invokeSuspend")
    public static final class C47301 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $adUnitId;
        final /* synthetic */ Function2<Banner, MolocoAdError.AdCreateError, Unit> $callback;
        final /* synthetic */ MediationInfo $mediationInfo;
        final /* synthetic */ String $watermarkString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C47301(MediationInfo mediationInfo, String str, String str2, Function2<? super Banner, ? super MolocoAdError.AdCreateError, Unit> function2, Continuation continuation) {
            super(2, continuation);
            this.$mediationInfo = mediationInfo;
            this.$adUnitId = str;
            this.$watermarkString = str2;
            this.$callback = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new C47301(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL;
            Pair pair;
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                com.moloco.sdk.acm.recorder.a aVarA = com.moloco.sdk.acm.recorder.a.Companion.a(this.$mediationInfo.getName());
                com.moloco.sdk.internal.publisher.o adCreator = Moloco.INSTANCE.getAdCreator();
                String name = this.$mediationInfo.getName();
                String str = this.$adUnitId;
                String str2 = this.$watermarkString;
                this.label = 1;
                objL = adCreator.l(name, str, aVarA, str2, this);
                if (objL == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                objL = obj;
            }
            h0 h0Var = (h0) objL;
            if (h0Var instanceof h0.b) {
                pair = TuplesKt.to(((h0.b) h0Var).a(), null);
            } else {
                if (!(h0Var instanceof h0.a)) {
                    throw new lf.m();
                }
                pair = TuplesKt.to(null, ((h0.a) h0Var).a());
            }
            Banner banner = (Banner) pair.component1();
            MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) pair.component2();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MREC for adUnitId: ");
            sb2.append(this.$adUnitId);
            sb2.append(" has error: ");
            sb2.append(banner == null);
            MolocoLogger.info$default(molocoLogger, "Moloco", sb2.toString(), null, false, 12, null);
            this.$callback.invoke(banner, adCreateError);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C47301) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.publisher.Moloco$createNativeAd$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "com.moloco.sdk.publisher.Moloco$createNativeAd$1", f = "Moloco.kt", l = {343}, m = "invokeSuspend")
    public static final class C47311 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $adUnitId;
        final /* synthetic */ Function2<NativeAd, MolocoAdError.AdCreateError, Unit> $callback;
        final /* synthetic */ MediationInfo $mediationInfo;
        final /* synthetic */ String $watermarkString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C47311(MediationInfo mediationInfo, String str, String str2, Function2<? super NativeAd, ? super MolocoAdError.AdCreateError, Unit> function2, Continuation continuation) {
            super(2, continuation);
            this.$mediationInfo = mediationInfo;
            this.$adUnitId = str;
            this.$watermarkString = str2;
            this.$callback = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new C47311(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objM;
            Pair pair;
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                com.moloco.sdk.acm.recorder.a aVarA = com.moloco.sdk.acm.recorder.a.Companion.a(this.$mediationInfo.getName());
                com.moloco.sdk.internal.publisher.o adCreator = Moloco.INSTANCE.getAdCreator();
                String name = this.$mediationInfo.getName();
                String str = this.$adUnitId;
                String str2 = this.$watermarkString;
                this.label = 1;
                objM = adCreator.m(name, str, aVarA, str2, this);
                if (objM == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                objM = obj;
            }
            h0 h0Var = (h0) objM;
            if (h0Var instanceof h0.b) {
                pair = TuplesKt.to(((h0.b) h0Var).a(), null);
            } else {
                if (!(h0Var instanceof h0.a)) {
                    throw new lf.m();
                }
                pair = TuplesKt.to(null, ((h0.a) h0Var).a());
            }
            NativeAd nativeAd = (NativeAd) pair.component1();
            MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) pair.component2();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Native Ad for adUnitId: ");
            sb2.append(this.$adUnitId);
            sb2.append(" has error: ");
            sb2.append(nativeAd == null);
            MolocoLogger.info$default(molocoLogger, "Moloco", sb2.toString(), null, false, 12, null);
            this.$callback.invoke(nativeAd, adCreateError);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C47311) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.publisher.Moloco$createRewardedInterstitial$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "com.moloco.sdk.publisher.Moloco$createRewardedInterstitial$1", f = "Moloco.kt", l = {402}, m = "invokeSuspend")
    public static final class C47321 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $adUnitId;
        final /* synthetic */ Function2<RewardedInterstitialAd, MolocoAdError.AdCreateError, Unit> $callback;
        final /* synthetic */ MediationInfo $mediationInfo;
        final /* synthetic */ String $watermarkString;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C47321(MediationInfo mediationInfo, String str, String str2, Function2<? super RewardedInterstitialAd, ? super MolocoAdError.AdCreateError, Unit> function2, Continuation continuation) {
            super(2, continuation);
            this.$mediationInfo = mediationInfo;
            this.$adUnitId = str;
            this.$watermarkString = str2;
            this.$callback = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new C47321(this.$mediationInfo, this.$adUnitId, this.$watermarkString, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objN;
            Pair pair;
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                com.moloco.sdk.acm.recorder.a aVarA = com.moloco.sdk.acm.recorder.a.Companion.a(this.$mediationInfo.getName());
                com.moloco.sdk.internal.publisher.o adCreator = Moloco.INSTANCE.getAdCreator();
                String name = this.$mediationInfo.getName();
                String str = this.$adUnitId;
                String str2 = this.$watermarkString;
                this.label = 1;
                objN = adCreator.n(name, str, aVarA, str2, this);
                if (objN == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                objN = obj;
            }
            h0 h0Var = (h0) objN;
            if (h0Var instanceof h0.b) {
                pair = TuplesKt.to(((h0.b) h0Var).a(), null);
            } else {
                if (!(h0Var instanceof h0.a)) {
                    throw new lf.m();
                }
                pair = TuplesKt.to(null, ((h0.a) h0Var).a());
            }
            RewardedInterstitialAd rewardedInterstitialAd = (RewardedInterstitialAd) pair.component1();
            MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) pair.component2();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Rewarded for adUnitId: ");
            sb2.append(this.$adUnitId);
            sb2.append(" has error: ");
            sb2.append(rewardedInterstitialAd == null);
            MolocoLogger.info$default(molocoLogger, "Moloco", sb2.toString(), null, false, 12, null);
            this.$callback.invoke(rewardedInterstitialAd, adCreateError);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C47321) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.publisher.Moloco$getBidToken$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "com.moloco.sdk.publisher.Moloco$getBidToken$1", f = "Moloco.kt", l = {224}, m = "invokeSuspend")
    public static final class C47331 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ MolocoBidTokenListener $listener;
        final /* synthetic */ MediationInfo $mediationInfo;
        final /* synthetic */ com.moloco.sdk.acm.recorder.a $metricsRecorder;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47331(com.moloco.sdk.acm.recorder.a aVar, MediationInfo mediationInfo, MolocoBidTokenListener molocoBidTokenListener, Continuation continuation) {
            super(2, continuation);
            this.$metricsRecorder = aVar;
            this.$mediationInfo = mediationInfo;
            this.$listener = molocoBidTokenListener;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new C47331(this.$metricsRecorder, this.$mediationInfo, this.$listener, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Handling bid token request", null, false, 12, null);
                com.moloco.sdk.internal.services.bidtoken.k bidTokenHandler = Moloco.INSTANCE.getBidTokenHandler();
                com.moloco.sdk.acm.recorder.a aVar = this.$metricsRecorder;
                MediationInfo mediationInfo = this.$mediationInfo;
                MolocoBidTokenListener molocoBidTokenListener = this.$listener;
                this.label = 1;
                if (bidTokenHandler.a(aVar, mediationInfo, molocoBidTokenListener, this) == objG) {
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
            return ((C47331) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.publisher.Moloco$initialize$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "com.moloco.sdk.publisher.Moloco$initialize$2", f = "Moloco.kt", l = {149, 151, 174}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ MolocoInitParams $initParam;
        final /* synthetic */ MolocoInitializationListener $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MolocoInitParams molocoInitParams, MolocoInitializationListener molocoInitializationListener, Continuation continuation) {
            super(2, continuation);
            this.$initParam = molocoInitParams;
            this.$listener = molocoInitializationListener;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$initParam, this.$listener, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x0134, code lost:
        
            if (r1.updateAndroidClientMetricsOnInitSuccess(r12) == r0) goto L39;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x010c  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 470
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.publisher.Moloco.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    private Moloco() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.moloco.sdk.internal.publisher.o adCreator_delegate$lambda$9() {
        return new com.moloco.sdk.internal.publisher.o(INSTANCE.getInitializationHandler().j(), b.h.f55827a.h(), new p(null, 0L, 3, null), new Moloco$adCreator$2$1(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.moloco.sdk.internal.services.bidtoken.l bidTokenHandler_delegate$lambda$8() {
        return new com.moloco.sdk.internal.services.bidtoken.l(r.a(), INSTANCE.getInitializationHandler(), b.h.f55827a.h());
    }

    public static final void createBanner(@NotNull MediationInfo mediationInfo, @NotNull String adUnitId, @Nullable String watermarkString, @NotNull Function2<? super Banner, ? super MolocoAdError.AdCreateError, Unit> callback) {
        Intrinsics.checkNotNullParameter(mediationInfo, "mediationInfo");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating banner async for adUnitId: " + adUnitId, null, false, 12, null);
        eg.i.d(INSTANCE.getScope(), null, null, new AnonymousClass1(mediationInfo, adUnitId, watermarkString, callback, null), 3, null);
    }

    public static /* synthetic */ void createBanner$default(MediationInfo mediationInfo, String str, String str2, Function2 function2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        createBanner(mediationInfo, str, str2, function2);
    }

    public static final void createBannerTablet(@NotNull MediationInfo mediationInfo, @NotNull String adUnitId, @Nullable String watermarkString, @NotNull Function2<? super Banner, ? super MolocoAdError.AdCreateError, Unit> callback) {
        Intrinsics.checkNotNullParameter(mediationInfo, "mediationInfo");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating banner tablet async for adUnitId: " + adUnitId, null, false, 12, null);
        eg.i.d(INSTANCE.getScope(), null, null, new C47281(mediationInfo, adUnitId, watermarkString, callback, null), 3, null);
    }

    public static /* synthetic */ void createBannerTablet$default(MediationInfo mediationInfo, String str, String str2, Function2 function2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        createBannerTablet(mediationInfo, str, str2, function2);
    }

    public static final void createInterstitial(@NotNull MediationInfo mediationInfo, @NotNull String adUnitId, @Nullable String watermarkString, @NotNull Function2<? super InterstitialAd, ? super MolocoAdError.AdCreateError, Unit> callback) {
        Intrinsics.checkNotNullParameter(mediationInfo, "mediationInfo");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating interstitial ad for mediation async for adUnitId: " + adUnitId, null, false, 12, null);
        eg.i.d(INSTANCE.getScope(), null, null, new C47291(mediationInfo, adUnitId, watermarkString, callback, null), 3, null);
    }

    public static /* synthetic */ void createInterstitial$default(MediationInfo mediationInfo, String str, String str2, Function2 function2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        createInterstitial(mediationInfo, str, str2, function2);
    }

    public static final void createMREC(@NotNull MediationInfo mediationInfo, @NotNull String adUnitId, @Nullable String watermarkString, @NotNull Function2<? super Banner, ? super MolocoAdError.AdCreateError, Unit> callback) {
        Intrinsics.checkNotNullParameter(mediationInfo, "mediationInfo");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating banner MREC async for adUnitId: " + adUnitId, null, false, 12, null);
        eg.i.d(INSTANCE.getScope(), null, null, new C47301(mediationInfo, adUnitId, watermarkString, callback, null), 3, null);
    }

    public static /* synthetic */ void createMREC$default(MediationInfo mediationInfo, String str, String str2, Function2 function2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        createMREC(mediationInfo, str, str2, function2);
    }

    public static final void createNativeAd(@NotNull MediationInfo mediationInfo, @NotNull String adUnitId, @Nullable String watermarkString, @NotNull Function2<? super NativeAd, ? super MolocoAdError.AdCreateError, Unit> callback) {
        Intrinsics.checkNotNullParameter(mediationInfo, "mediationInfo");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating native ad for mediation async for adUnitId: " + adUnitId, null, false, 12, null);
        eg.i.d(INSTANCE.getScope(), null, null, new C47311(mediationInfo, adUnitId, watermarkString, callback, null), 3, null);
    }

    public static /* synthetic */ void createNativeAd$default(MediationInfo mediationInfo, String str, String str2, Function2 function2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        createNativeAd(mediationInfo, str, str2, function2);
    }

    public static final void createRewardedInterstitial(@NotNull MediationInfo mediationInfo, @NotNull String adUnitId, @Nullable String watermarkString, @NotNull Function2<? super RewardedInterstitialAd, ? super MolocoAdError.AdCreateError, Unit> callback) {
        Intrinsics.checkNotNullParameter(mediationInfo, "mediationInfo");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating rewarded ad for mediation async for adUnitId: " + adUnitId, null, false, 12, null);
        eg.i.d(INSTANCE.getScope(), null, null, new C47321(mediationInfo, adUnitId, watermarkString, callback, null), 3, null);
    }

    public static /* synthetic */ void createRewardedInterstitial$default(MediationInfo mediationInfo, String str, String str2, Function2 function2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        createRewardedInterstitial(mediationInfo, str, str2, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.moloco.sdk.internal.publisher.o getAdCreator() {
        return (com.moloco.sdk.internal.publisher.o) adCreator.getValue();
    }

    public static final void getBidToken(@NotNull MediationInfo mediationInfo, @NotNull Context context, @NotNull MolocoBidTokenListener listener) {
        Intrinsics.checkNotNullParameter(mediationInfo, "mediationInfo");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.moloco.sdk.internal.android_context.b.a(context);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Fetching bid token", null, false, 12, null);
        eg.i.d(com.moloco.sdk.internal.scheduling.d.f55261a.a(), null, null, new C47331(com.moloco.sdk.acm.recorder.a.Companion.a(mediationInfo.getName()), mediationInfo, listener, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.moloco.sdk.internal.services.bidtoken.k getBidTokenHandler() {
        return (com.moloco.sdk.internal.services.bidtoken.k) bidTokenHandler.getValue();
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getInitJob$annotations() {
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getInitParams$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o0 getInitializationHandler() {
        return (o0) initializationHandler.getValue();
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getPendingInitByMediator$moloco_sdk_release$annotations() {
    }

    private final CoroutineScope getScope() {
        return (CoroutineScope) scope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o0 initializationHandler_delegate$lambda$7() {
        return new o0(b.h.f55827a.h());
    }

    public static final void initialize(@NotNull MolocoInitParams initParam) {
        Intrinsics.checkNotNullParameter(initParam, "initParam");
        initialize$default(initParam, null, 2, null);
    }

    public static /* synthetic */ void initialize$default(MolocoInitParams molocoInitParams, MolocoInitializationListener molocoInitializationListener, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            molocoInitializationListener = null;
        }
        initialize(molocoInitParams, molocoInitializationListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeAndroidClientMetrics(MolocoInitParams initParams2) {
        if (!getInitializationHandler().i()) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "Moloco", "ACM cannot be initialized as Moloco SDK cannot be initialized", null, false, 12, null);
            return;
        }
        com.moloco.sdk.internal.configs.a aVarA = com.moloco.sdk.internal.configs.b.a();
        com.moloco.sdk.acm.a aVar = com.moloco.sdk.acm.a.f53924a;
        String appKey = initParams2.getAppKey();
        String strB = aVarA.b();
        Context appContext = initParams2.getAppContext();
        long jA = aVarA.a();
        Pair pair = TuplesKt.to("AppKey", initParams2.getAppKey());
        b.e eVar = b.e.f55808a;
        com.moloco.sdk.acm.a.r(aVar, new com.moloco.sdk.acm.e(appKey, strB, appContext, jA, MapsKt.mapOf(pair, TuplesKt.to("AppBundle", eVar.h().invoke().a()), TuplesKt.to("AppVersion", eVar.h().invoke().b()), TuplesKt.to("SdkVersion", BuildConfig.SDK_VERSION_NAME), TuplesKt.to("OS", eVar.l().invoke().i()), TuplesKt.to(N6.G, eVar.l().invoke().j()))), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeILRD() {
        Init$SDKInitResponse init$SDKInitResponseK = getInitializationHandler().k();
        if (init$SDKInitResponseK == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "Moloco", "ILRD cannot be initialized as Moloco SDK is not initialized", null, false, 12, null);
            return;
        }
        Throwable thG = Result.g(b.C0685b.f55795a.g().e(init$SDKInitResponseK));
        if (thG != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "ILRD initialization failed. " + thG.getMessage(), null, false, 12, null);
        }
    }

    public static final boolean isInitialized() {
        return INSTANCE.getInitializationHandler().j().getValue() == Initialization.SUCCESS;
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    private final void logMolocoInfo(MolocoInitParams initParam) {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "Moloco", "=====================================", null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "Moloco SDK initializing", null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "SDK Version: 4.3.1", null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "Mediation: " + initParam.getMediationInfo().getName(), null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "isInitialized: " + isInitialized(), null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "=====================================", null, false, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processInitConfigs(Init$SDKInitResponse sdkInitResponse) {
        if (sdkInitResponse.hasEventCollectionConfig()) {
            Init$SDKInitResponse.EventCollectionConfig eventCollectionConfig = sdkInitResponse.getEventCollectionConfig();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.debug$default(molocoLogger, "Moloco", "Init response has eventCollectionConfig", false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "eventCollectionConfig:", false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "eventCollectionEnabled: " + eventCollectionConfig.getEventCollectionEnabled(), false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "mrefCollectionEnabled: " + eventCollectionConfig.getMrefCollectionEnabled(), false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "appFgUrl: " + eventCollectionConfig.getAppForegroundTrackingUrl(), false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "appBgUrl: " + eventCollectionConfig.getAppBackgroundTrackingUrl(), false, 4, null);
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVarC = b.k.f55843a.c();
            boolean eventCollectionEnabled = eventCollectionConfig.getEventCollectionEnabled();
            boolean mrefCollectionEnabled = eventCollectionConfig.getMrefCollectionEnabled();
            String appForegroundTrackingUrl = eventCollectionConfig.getAppForegroundTrackingUrl();
            Intrinsics.checkNotNullExpressionValue(appForegroundTrackingUrl, "getAppForegroundTrackingUrl(...)");
            String appBackgroundTrackingUrl = eventCollectionConfig.getAppBackgroundTrackingUrl();
            Intrinsics.checkNotNullExpressionValue(appBackgroundTrackingUrl, "getAppBackgroundTrackingUrl(...)");
            bVarC.a(eventCollectionEnabled, mrefCollectionEnabled, appForegroundTrackingUrl, appBackgroundTrackingUrl);
            if (eventCollectionConfig.getEventCollectionEnabled()) {
                b.C0685b.f55795a.e().a();
            }
        } else {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "Moloco", "Init response does not have eventCollectionConfig", false, 4, null);
        }
        b.c.f55802a.b().a(sdkInitResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineScope scope_delegate$lambda$10() {
        return kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldInitializeILRD(String mediationName) {
        Init$SDKInitResponse.ILRDConfig ilrdConfig;
        List<Init$SDKInitResponse.e> supportedNetworksList;
        Init$SDKInitResponse init$SDKInitResponseK = getInitializationHandler().k();
        if (init$SDKInitResponseK == null || (ilrdConfig = init$SDKInitResponseK.getIlrdConfig()) == null || (supportedNetworksList = ilrdConfig.getSupportedNetworksList()) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(supportedNetworksList, 10));
        for (Init$SDKInitResponse.e eVar : supportedNetworksList) {
            String lowerCase = ((eVar == null ? -1 : WhenMappings.$EnumSwitchMapping$0[eVar.ordinal()]) == 1 ? "LevelPlay" : eVar.name()).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        String lowerCase2 = mediationName.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return arrayList.contains(lowerCase2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateAndroidClientMetricsOnInitSuccess(Continuation continuation) {
        Object objX = com.moloco.sdk.acm.a.f53924a.x(new com.moloco.sdk.acm.g(((com.moloco.sdk.internal.configs.a) b.c.f55802a.b().b(com.moloco.sdk.internal.configs.a.class, com.moloco.sdk.internal.configs.b.a())).b(), kotlin.coroutines.jvm.internal.b.e(r0.a())), continuation);
        return objX == pf.b.g() ? objX : Unit.f93236a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (kotlinx.coroutines.z.g(r13, r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r13.h(r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.VisibleForTesting(otherwise = 5)
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object clearState$moloco_sdk_release(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.moloco.sdk.publisher.Moloco$clearState$1
            if (r0 == 0) goto L13
            r0 = r13
            com.moloco.sdk.publisher.Moloco$clearState$1 r0 = (com.moloco.sdk.publisher.Moloco$clearState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.moloco.sdk.publisher.Moloco$clearState$1 r0 = new com.moloco.sdk.publisher.Moloco$clearState$1
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.d.b(r13)
            goto L74
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L35:
            java.lang.Object r2 = r0.L$0
            com.moloco.sdk.publisher.Moloco r2 = (com.moloco.sdk.publisher.Moloco) r2
            kotlin.d.b(r13)
            goto L5e
        L3d:
            kotlin.d.b(r13)
            com.moloco.sdk.internal.MolocoLogger r6 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r10 = 4
            r11 = 0
            java.lang.String r7 = "Moloco"
            java.lang.String r8 = "clearState() unit testing function called"
            r9 = 0
            com.moloco.sdk.internal.MolocoLogger.debug$default(r6, r7, r8, r9, r10, r11)
            com.moloco.sdk.publisher.Moloco.initParams = r5
            kotlinx.coroutines.Job r13 = com.moloco.sdk.publisher.Moloco.initJob
            if (r13 == 0) goto L5d
            r0.L$0 = r12
            r0.label = r4
            java.lang.Object r13 = kotlinx.coroutines.z.g(r13, r0)
            if (r13 != r1) goto L5d
            goto L73
        L5d:
            r2 = r12
        L5e:
            com.moloco.sdk.publisher.Moloco.initJob = r5
            java.util.Map<java.lang.String, java.util.List<com.moloco.sdk.publisher.MolocoInitializationListener>> r13 = com.moloco.sdk.publisher.Moloco.pendingInitByMediator
            r13.clear()
            com.moloco.sdk.internal.publisher.o0 r13 = r2.getInitializationHandler()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r13 = r13.h(r0)
            if (r13 != r1) goto L74
        L73:
            return r1
        L74:
            kotlin.Unit r13 = kotlin.Unit.f93236a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.publisher.Moloco.clearState$moloco_sdk_release(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Nullable
    public final String getAppKey$moloco_sdk_release() {
        MolocoInitParams molocoInitParams = initParams;
        if (molocoInitParams != null) {
            return molocoInitParams.getAppKey();
        }
        return null;
    }

    @NotNull
    public final Set<String> getFailedMediations$moloco_sdk_release() {
        return CollectionsKt.toSet(_failedMediations);
    }

    @Nullable
    public final Job getInitJob() {
        return initJob;
    }

    @Nullable
    public final MolocoInitParams getInitParams() {
        return initParams;
    }

    @NotNull
    public final Map<String, List<MolocoInitializationListener>> getPendingInitByMediator$moloco_sdk_release() {
        return pendingInitByMediator;
    }

    public final void setInitJob(@Nullable Job job) {
        initJob = job;
    }

    public final void setInitParams(@Nullable MolocoInitParams molocoInitParams) {
        initParams = molocoInitParams;
    }

    public static final synchronized void initialize(@NotNull MolocoInitParams initParam, @Nullable MolocoInitializationListener listener) {
        try {
            Intrinsics.checkNotNullParameter(initParam, "initParam");
            Moloco moloco = INSTANCE;
            moloco.logMolocoInfo(initParam);
            if (initParam.getAppKey().length() == 0) {
                throw new IllegalArgumentException("Moloco SDK initialized with empty appKey");
            }
            if (isInitialized()) {
                if (Intrinsics.areEqual(initParam.getAppKey(), moloco.getAppKey$moloco_sdk_release())) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Already initialized. Returning and notifying listener", null, false, 12, null);
                    if (moloco.shouldInitializeILRD(initParam.getMediationInfo().getName())) {
                        moloco.initializeILRD();
                    }
                    if (listener != null) {
                        q0.a(listener, o0.f55127f.a());
                    }
                } else {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Already initialized but with different appKey. Returning error and notifying listener", null, false, 12, null);
                    _failedMediations.add(initParam.getMediationInfo().getName());
                    com.moloco.sdk.acm.recorder.a.Companion.a(initParam.getMediationInfo().getName()).b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.f54157k.g()));
                    if (listener != null) {
                        q0.a(listener, o0.f55127f.b("Moloco SDK failed to initialize due to unexpected app key"));
                    }
                }
                return;
            }
            synchronized (moloco) {
                try {
                    Job job = initJob;
                    if (job == null || !job.isActive()) {
                        Unit unit = Unit.f93236a;
                        initParams = initParam;
                        com.moloco.sdk.internal.android_context.b.a(initParam.getAppContext());
                        initJob = eg.i.d(kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getIo()), null, null, new AnonymousClass2(initParam, listener, null), 3, null);
                        return;
                    }
                    String appKey = initParam.getAppKey();
                    MolocoInitParams molocoInitParams = initParams;
                    if (!Intrinsics.areEqual(appKey, molocoInitParams != null ? molocoInitParams.getAppKey() : null)) {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Init Job active with different appKey. Notifying listener and avoiding init", null, false, 12, null);
                        _failedMediations.add(initParam.getMediationInfo().getName());
                        com.moloco.sdk.acm.recorder.a.Companion.a(initParam.getMediationInfo().getName()).b(new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.f54157k.g()));
                        if (listener != null) {
                            q0.a(listener, o0.f55127f.b("Moloco SDK failed to initialize due to unexpected app key during existing initialization"));
                        }
                        return;
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Init Job active with same appKey. Queuing listener and returning for mediator: " + initParam.getMediationInfo().getName(), null, false, 12, null);
                    String name = initParam.getMediationInfo().getName();
                    Map<String, List<MolocoInitializationListener>> map = pendingInitByMediator;
                    List<MolocoInitializationListener> arrayList = map.get(name);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        map.put(name, arrayList);
                    }
                    List<MolocoInitializationListener> list = arrayList;
                    if (listener != null) {
                        list.add(listener);
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
