package org.bidon.meta;

import android.content.Context;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BidderTokenProvider;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.d;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.meta.impl.e;
import org.bidon.meta.impl.g;
import org.bidon.meta.impl.h;
import org.bidon.meta.impl.j;
import org.bidon.sdk.adapter.AdProvider;
import org.bidon.sdk.adapter.AdSource;
import org.bidon.sdk.adapter.Adapter;
import org.bidon.sdk.adapter.AdapterInfo;
import org.bidon.sdk.adapter.DemandId;
import org.bidon.sdk.adapter.Initializable;
import org.bidon.sdk.adapter.SupportsRegulation;
import org.bidon.sdk.adapter.SupportsTestMode;
import org.bidon.sdk.adapter.impl.SupportsTestModeImpl;
import org.bidon.sdk.auction.AdTypeParam;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.regulation.Regulation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import pf.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0012\u0004\u0012\u00020\u00050\u00062\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0012\u0004\u0012\u00020\n0\tB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\"H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050%H\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010.\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001c\u00103\u001a\u0002028\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00067"}, d2 = {"Lorg/bidon/meta/MetaAudienceAdapter;", "Lorg/bidon/sdk/adapter/Adapter$Bidding;", "Lorg/bidon/sdk/adapter/SupportsRegulation;", "Lorg/bidon/sdk/adapter/SupportsTestMode;", "Lorg/bidon/sdk/adapter/AdProvider$Interstitial;", "Lorg/bidon/meta/impl/e;", "Lorg/bidon/sdk/adapter/AdProvider$Rewarded;", "Lorg/bidon/sdk/adapter/AdProvider$Banner;", "Lorg/bidon/meta/impl/a;", "Lorg/bidon/sdk/adapter/Initializable;", "Lorg/bidon/meta/impl/h;", "<init>", "()V", "Lorg/bidon/sdk/auction/AdTypeParam;", "adTypeParam", "", "getToken", "(Lorg/bidon/sdk/auction/AdTypeParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "configParams", "", "init", "(Landroid/content/Context;Lorg/bidon/meta/impl/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "json", "parseConfigParam", "(Ljava/lang/String;)Lorg/bidon/meta/impl/h;", "Lorg/bidon/sdk/regulation/Regulation;", "regulation", "updateRegulation", "(Lorg/bidon/sdk/regulation/Regulation;)V", "Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "interstitial", "()Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "Lorg/bidon/sdk/adapter/AdSource$Banner;", "banner", "()Lorg/bidon/sdk/adapter/AdSource$Banner;", "Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "rewarded", "()Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "Lorg/bidon/sdk/adapter/DemandId;", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "Lorg/bidon/sdk/adapter/AdapterInfo;", "adapterInfo", "Lorg/bidon/sdk/adapter/AdapterInfo;", "getAdapterInfo", "()Lorg/bidon/sdk/adapter/AdapterInfo;", "", "isTestMode", "()Z", "setTestMode", "(Z)V", "meta_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MetaAudienceAdapter implements Adapter.Bidding, SupportsRegulation, SupportsTestMode, AdProvider.Interstitial<e>, AdProvider.Rewarded<e>, AdProvider.Banner<org.bidon.meta.impl.a>, Initializable<h> {
    private final /* synthetic */ SupportsTestModeImpl $$delegate_0 = new SupportsTestModeImpl();

    @NotNull
    private final DemandId demandId = org.bidon.meta.a.a();

    @NotNull
    private final AdapterInfo adapterInfo = new AdapterInfo(org.bidon.meta.ext.a.b(), org.bidon.meta.ext.a.c());

    static final class a implements AudienceNetworkAds.InitListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation f97381a;

        a(Continuation continuation) {
            this.f97381a = continuation;
        }

        @Override // com.facebook.ads.AudienceNetworkAds.InitListener
        public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
            if (initResult.isSuccess()) {
                Continuation continuation = this.f97381a;
                Result.Companion companion = Result.f93230c;
                continuation.resumeWith(Result.b(Unit.f93236a));
                return;
            }
            String str = "Meta SDK initialization failed: " + initResult.getMessage();
            BidonError.SdkNotInitialized sdkNotInitialized = BidonError.SdkNotInitialized.INSTANCE;
            LogExtKt.logError("MetaAudienceAdapter", str, sdkNotInitialized);
            Continuation continuation2 = this.f97381a;
            Result.Companion companion2 = Result.f93230c;
            continuation2.resumeWith(Result.b(d.a(sdkNotInitialized)));
        }
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Banner
    @NotNull
    public AdSource.Banner<org.bidon.meta.impl.a> banner() {
        return new org.bidon.meta.impl.d();
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
        return BidderTokenProvider.getBidderToken(adTypeParam.getActivity().getApplicationContext());
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Interstitial
    @NotNull
    public AdSource.Interstitial<e> interstitial() {
        return new g();
    }

    @Override // org.bidon.sdk.adapter.SupportsTestMode
    /* JADX INFO: renamed from: isTestMode */
    public boolean getIsTestMode() {
        return this.$$delegate_0.getIsTestMode();
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Rewarded
    @NotNull
    public AdSource.Rewarded<e> rewarded() {
        return new j();
    }

    @Override // org.bidon.sdk.adapter.SupportsTestMode
    public void setTestMode(boolean z10) {
        this.$$delegate_0.setTestMode(z10);
    }

    @Override // org.bidon.sdk.adapter.SupportsRegulation
    public void updateRegulation(@NotNull Regulation regulation) {
        Intrinsics.checkNotNullParameter(regulation, "regulation");
        if (regulation.getCoppaApplies()) {
            AdSettings.setMixedAudience(true);
        }
        if (regulation.getCcpaApplies()) {
            if (regulation.getHasCcpaConsent()) {
                AdSettings.setDataProcessingOptions(new String[0]);
            } else {
                AdSettings.setDataProcessingOptions(new String[]{"LDU"}, 0, 0);
            }
        }
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @Nullable
    public Object init(@NotNull Context context, @NotNull h hVar, @NotNull Continuation continuation) throws Throwable {
        of.e eVar = new of.e(b.d(continuation));
        if (getIsTestMode()) {
            AdSettings.setIntegrationErrorMode(AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE);
            AdSettings.setDebugBuild(true);
        }
        AdSettings.setTestMode(getIsTestMode());
        String strA = hVar.a();
        if (strA != null) {
            AdSettings.setMediationService(strA);
        }
        AudienceNetworkAds.buildInitSettings(context).withInitListener(new a(eVar)).initialize();
        Object objB = eVar.b();
        if (objB == b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objB == b.g() ? objB : Unit.f93236a;
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @NotNull
    public h parseConfigParam(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return new h(new JSONObject(json).optString("mediation_service"));
    }
}
