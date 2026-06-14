package org.bidon.moloco;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.publisher.Initialization;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoBidTokenListener;
import com.moloco.sdk.publisher.MolocoInitStatus;
import com.moloco.sdk.publisher.MolocoInitializationListener;
import com.moloco.sdk.publisher.init.MolocoInitParams;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import lf.m;
import org.bidon.moloco.impl.e;
import org.bidon.moloco.impl.h;
import org.bidon.moloco.impl.k;
import org.bidon.sdk.adapter.AdProvider;
import org.bidon.sdk.adapter.Adapter;
import org.bidon.sdk.adapter.AdapterInfo;
import org.bidon.sdk.adapter.DemandId;
import org.bidon.sdk.adapter.Initializable;
import org.bidon.sdk.adapter.SupportsRegulation;
import org.bidon.sdk.adapter.SupportsTestMode;
import org.bidon.sdk.adapter.impl.SupportsTestModeImpl;
import org.bidon.sdk.auction.AdTypeParam;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.regulation.Regulation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u00052\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0012\u0004\u0012\u00020\t0\b2\b\u0012\u0004\u0012\u00020\t0\nB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010.\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001c\u00103\u001a\u0002028\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00067"}, d2 = {"Lorg/bidon/moloco/MolocoAdapter;", "Lorg/bidon/sdk/adapter/Adapter$Bidding;", "Lorg/bidon/sdk/adapter/Initializable;", "Lorg/bidon/moloco/b;", "Lorg/bidon/sdk/adapter/SupportsRegulation;", "Lorg/bidon/sdk/adapter/SupportsTestMode;", "Lorg/bidon/sdk/adapter/AdProvider$Banner;", "Lorg/bidon/moloco/impl/a;", "Lorg/bidon/sdk/adapter/AdProvider$Interstitial;", "Lorg/bidon/moloco/impl/e;", "Lorg/bidon/sdk/adapter/AdProvider$Rewarded;", "<init>", "()V", "Lorg/bidon/sdk/auction/AdTypeParam;", "adTypeParam", "", "getToken", "(Lorg/bidon/sdk/auction/AdTypeParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "configParams", "", "init", "(Landroid/content/Context;Lorg/bidon/moloco/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "json", "parseConfigParam", "(Ljava/lang/String;)Lorg/bidon/moloco/b;", "Lorg/bidon/sdk/regulation/Regulation;", "regulation", "updateRegulation", "(Lorg/bidon/sdk/regulation/Regulation;)V", "Lorg/bidon/moloco/impl/d;", "banner", "()Lorg/bidon/moloco/impl/d;", "Lorg/bidon/moloco/impl/h;", "interstitial", "()Lorg/bidon/moloco/impl/h;", "Lorg/bidon/moloco/impl/k;", "rewarded", "()Lorg/bidon/moloco/impl/k;", "Lorg/bidon/sdk/adapter/DemandId;", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "Lorg/bidon/sdk/adapter/AdapterInfo;", "adapterInfo", "Lorg/bidon/sdk/adapter/AdapterInfo;", "getAdapterInfo", "()Lorg/bidon/sdk/adapter/AdapterInfo;", "", "isTestMode", "()Z", "setTestMode", "(Z)V", "moloco_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MolocoAdapter implements Adapter.Bidding, Initializable<org.bidon.moloco.b>, SupportsRegulation, SupportsTestMode, AdProvider.Banner<org.bidon.moloco.impl.a>, AdProvider.Interstitial<e>, AdProvider.Rewarded<e> {
    private final /* synthetic */ SupportsTestModeImpl $$delegate_0 = new SupportsTestModeImpl();

    @NotNull
    private final DemandId demandId = org.bidon.moloco.a.a();

    @NotNull
    private final AdapterInfo adapterInfo = new AdapterInfo("4.3.1.0", BuildConfig.SDK_VERSION_NAME);

    static final class a implements MolocoBidTokenListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation f97498a;

        a(CancellableContinuation cancellableContinuation) {
            this.f97498a = cancellableContinuation;
        }

        @Override // com.moloco.sdk.publisher.MolocoBidTokenListener
        public final void onBidTokenResult(String bidToken, MolocoAdError.ErrorType errorType) {
            Intrinsics.checkNotNullParameter(bidToken, "bidToken");
            if (errorType != null) {
                LogExtKt.logError("MolocoAdapter", "Failed to get bid token: " + errorType.name() + " - " + errorType.getDescription() + " (code: " + errorType.getErrorCode() + ")", null);
            }
            this.f97498a.resumeWith(Result.b(bidToken));
        }
    }

    static final class b implements MolocoInitializationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation f97499a;

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Initialization.values().length];
                try {
                    iArr[Initialization.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Initialization.FAILURE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        b(Continuation continuation) {
            this.f97499a = continuation;
        }

        @Override // com.moloco.sdk.publisher.MolocoInitializationListener
        public final void onMolocoInitializationStatus(MolocoInitStatus status) {
            Intrinsics.checkNotNullParameter(status, "status");
            int i10 = a.$EnumSwitchMapping$0[status.getInitialization().ordinal()];
            if (i10 == 1) {
                Continuation continuation = this.f97499a;
                Result.Companion companion = Result.f93230c;
                continuation.resumeWith(Result.b(Unit.f93236a));
            } else {
                if (i10 != 2) {
                    throw new m();
                }
                String str = "Moloco SDK initialization failed: " + status.getDescription();
                Exception exc = new Exception(str);
                LogExtKt.logError("MolocoAdapter", str, exc);
                Continuation continuation2 = this.f97499a;
                Result.Companion companion2 = Result.f93230c;
                continuation2.resumeWith(Result.b(d.a(exc)));
            }
        }
    }

    @Override // org.bidon.sdk.adapter.Adapter
    @NotNull
    public AdapterInfo getAdapterInfo() {
        return this.adapterInfo;
    }

    @Override // org.bidon.sdk.adapter.Adapter
    @NotNull
    public DemandId getDemandId() {
        return this.demandId;
    }

    @Override // org.bidon.sdk.adapter.Adapter.Bidding
    @Nullable
    public Object getToken(@NotNull AdTypeParam adTypeParam, @NotNull Continuation continuation) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        LogExtKt.logInfo("MolocoAdapter", "Requesting bid token");
        MediationInfo mediationInfo = new MediationInfo("");
        Context applicationContext = adTypeParam.getActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Moloco.getBidToken(mediationInfo, applicationContext, new a(eVar));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            g.c(continuation);
        }
        return objC;
    }

    @Override // org.bidon.sdk.adapter.SupportsTestMode
    /* JADX INFO: renamed from: isTestMode */
    public boolean getIsTestMode() {
        return this.$$delegate_0.getIsTestMode();
    }

    @Override // org.bidon.sdk.adapter.SupportsTestMode
    public void setTestMode(boolean z10) {
        this.$$delegate_0.setTestMode(z10);
    }

    @Override // org.bidon.sdk.adapter.SupportsRegulation
    public void updateRegulation(@NotNull Regulation regulation) {
        Intrinsics.checkNotNullParameter(regulation, "regulation");
        if (regulation.getGdprApplies()) {
            MolocoPrivacy.setPrivacy(new MolocoPrivacy.PrivacySettings(Boolean.valueOf(regulation.getHasGdprConsent()), (Boolean) null, (Boolean) null, 6, (DefaultConstructorMarker) null));
        }
        if (regulation.getCcpaApplies()) {
            MolocoPrivacy.setPrivacy(new MolocoPrivacy.PrivacySettings((Boolean) null, (Boolean) null, Boolean.valueOf(!regulation.getHasCcpaConsent()), 3, (DefaultConstructorMarker) null));
        }
        MolocoPrivacy.setPrivacy(new MolocoPrivacy.PrivacySettings((Boolean) null, Boolean.valueOf(regulation.getCoppaApplies()), (Boolean) null, 5, (DefaultConstructorMarker) null));
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Banner
    @NotNull
    public org.bidon.moloco.impl.d banner() {
        return new org.bidon.moloco.impl.d();
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @Nullable
    public Object init(@NotNull Context context, @NotNull org.bidon.moloco.b bVar, @NotNull Continuation continuation) throws Throwable {
        of.e eVar = new of.e(pf.b.d(continuation));
        if (Moloco.isInitialized()) {
            LogExtKt.logInfo("MolocoAdapter", "Moloco SDK already initialized");
            Result.Companion companion = Result.f93230c;
            eVar.resumeWith(Result.b(Unit.f93236a));
        } else if (StringsKt.y0(bVar.a())) {
            String str = "Adapter(" + org.bidon.moloco.a.a().getDemandId() + ") app key is empty or blank";
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str);
            LogExtKt.logError("MolocoAdapter", str, illegalArgumentException);
            Result.Companion companion2 = Result.f93230c;
            eVar.resumeWith(Result.b(d.a(illegalArgumentException)));
        } else {
            Moloco.initialize(new MolocoInitParams(context, bVar.a(), new MediationInfo("")), new b(eVar));
        }
        Object objB = eVar.b();
        if (objB == pf.b.g()) {
            g.c(continuation);
        }
        return objB == pf.b.g() ? objB : Unit.f93236a;
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Interstitial
    @NotNull
    public h interstitial() {
        return new h();
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @NotNull
    public org.bidon.moloco.b parseConfigParam(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        String strOptString = new JSONObject(json).optString(MBridgeConstans.APP_KEY);
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        return new org.bidon.moloco.b(strOptString);
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Rewarded
    @NotNull
    public k rewarded() {
        return new k();
    }
}
