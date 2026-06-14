package org.bidon.vungle;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.vungle.ads.BidTokenCallback;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleError;
import com.vungle.ads.VunglePrivacySettings;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.d;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
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
import org.bidon.vungle.impl.e;
import org.bidon.vungle.impl.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\b\u0012\u0004\u0012\u00020\u00070\u00062\u00020\b2\b\u0012\u0004\u0012\u00020\n0\t2\b\u0012\u0004\u0012\u00020\n0\u000bB\u0007¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0 H\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070#H\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0&H\u0016¢\u0006\u0004\b'\u0010(R\u001a\u0010*\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010/\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u00104\u001a\u0002038\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u00068"}, d2 = {"Lorg/bidon/vungle/VungleAdapter;", "Lorg/bidon/sdk/adapter/Adapter$Bidding;", "Lorg/bidon/sdk/adapter/Adapter$Network;", "Lorg/bidon/sdk/adapter/Initializable;", "Lorg/bidon/vungle/b;", "Lorg/bidon/sdk/adapter/SupportsTestMode;", "Lorg/bidon/sdk/adapter/AdProvider$Banner;", "Lorg/bidon/vungle/impl/a;", "Lorg/bidon/sdk/adapter/SupportsRegulation;", "Lorg/bidon/sdk/adapter/AdProvider$Interstitial;", "Lorg/bidon/vungle/impl/e;", "Lorg/bidon/sdk/adapter/AdProvider$Rewarded;", "<init>", "()V", "Lorg/bidon/sdk/auction/AdTypeParam;", "adTypeParam", "", "getToken", "(Lorg/bidon/sdk/auction/AdTypeParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "configParams", "", "init", "(Landroid/content/Context;Lorg/bidon/vungle/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "json", "parseConfigParam", "(Ljava/lang/String;)Lorg/bidon/vungle/b;", "Lorg/bidon/sdk/regulation/Regulation;", "regulation", "updateRegulation", "(Lorg/bidon/sdk/regulation/Regulation;)V", "Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "interstitial", "()Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "Lorg/bidon/sdk/adapter/AdSource$Banner;", "banner", "()Lorg/bidon/sdk/adapter/AdSource$Banner;", "Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "rewarded", "()Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "Lorg/bidon/sdk/adapter/DemandId;", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "Lorg/bidon/sdk/adapter/AdapterInfo;", "adapterInfo", "Lorg/bidon/sdk/adapter/AdapterInfo;", "getAdapterInfo", "()Lorg/bidon/sdk/adapter/AdapterInfo;", "", "isTestMode", "()Z", "setTestMode", "(Z)V", "vungle_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VungleAdapter implements Adapter.Bidding, Adapter.Network, Initializable<org.bidon.vungle.b>, SupportsTestMode, AdProvider.Banner<org.bidon.vungle.impl.a>, SupportsRegulation, AdProvider.Interstitial<e>, AdProvider.Rewarded<e> {
    private final /* synthetic */ SupportsTestModeImpl $$delegate_0 = new SupportsTestModeImpl();

    @NotNull
    private final DemandId demandId = org.bidon.vungle.a.a();

    @NotNull
    private final AdapterInfo adapterInfo = new AdapterInfo(org.bidon.vungle.ext.a.b(), org.bidon.vungle.ext.a.c());

    public static final class a implements BidTokenCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation f97824a;

        a(CancellableContinuation cancellableContinuation) {
            this.f97824a = cancellableContinuation;
        }

        @Override // com.vungle.ads.BidTokenCallback
        public void onBidTokenCollected(String bidToken) {
            Intrinsics.checkNotNullParameter(bidToken, "bidToken");
            LogExtKt.logInfo("VungleAdapter", "Loaded bid token");
            this.f97824a.resumeWith(Result.b(bidToken));
        }

        @Override // com.vungle.ads.BidTokenCallback
        public void onBidTokenError(String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            LogExtKt.logError("VungleAdapter", "Error while bid token: " + errorMessage, BidonError.NoBid.INSTANCE);
            this.f97824a.resumeWith(Result.b(null));
        }
    }

    public static final class b implements InitializationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation f97825a;

        b(CancellableContinuation cancellableContinuation) {
            this.f97825a = cancellableContinuation;
        }

        @Override // com.vungle.ads.InitializationListener
        public void onError(VungleError vungleError) {
            Intrinsics.checkNotNullParameter(vungleError, "vungleError");
            LogExtKt.logError("VungleAdapter", "Error while initialization", vungleError);
            CancellableContinuation cancellableContinuation = this.f97825a;
            Result.Companion companion = Result.f93230c;
            cancellableContinuation.resumeWith(Result.b(d.a(vungleError)));
        }

        @Override // com.vungle.ads.InitializationListener
        public void onSuccess() {
            CancellableContinuation cancellableContinuation = this.f97825a;
            Result.Companion companion = Result.f93230c;
            cancellableContinuation.resumeWith(Result.b(Unit.f93236a));
        }
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Banner
    @NotNull
    public AdSource.Banner<org.bidon.vungle.impl.a> banner() {
        return new org.bidon.vungle.impl.d();
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
        VungleAds.Companion companion = VungleAds.INSTANCE;
        Context applicationContext = adTypeParam.getActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        companion.getBiddingToken(applicationContext, new a(eVar));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            g.c(continuation);
        }
        return objC;
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Interstitial
    @NotNull
    public AdSource.Interstitial<e> interstitial() {
        return new org.bidon.vungle.impl.g();
    }

    @Override // org.bidon.sdk.adapter.SupportsTestMode
    /* JADX INFO: renamed from: isTestMode */
    public boolean getIsTestMode() {
        return this.$$delegate_0.getIsTestMode();
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Rewarded
    @NotNull
    public AdSource.Rewarded<e> rewarded() {
        return new i();
    }

    @Override // org.bidon.sdk.adapter.SupportsTestMode
    public void setTestMode(boolean z10) {
        this.$$delegate_0.setTestMode(z10);
    }

    @Override // org.bidon.sdk.adapter.SupportsRegulation
    public void updateRegulation(@NotNull Regulation regulation) {
        Intrinsics.checkNotNullParameter(regulation, "regulation");
        if (regulation.getCcpaApplies()) {
            VunglePrivacySettings.setCCPAStatus(regulation.getHasCcpaConsent());
        }
        if (regulation.getGdprApplies()) {
            VunglePrivacySettings.setGDPRStatus(regulation.getHasGdprConsent(), null);
        }
        if (regulation.getCoppaApplies()) {
            VunglePrivacySettings.setCOPPAStatus(true);
        }
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @Nullable
    public Object init(@NotNull Context context, @NotNull org.bidon.vungle.b bVar, @NotNull Continuation continuation) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        VungleAds.INSTANCE.init(context, bVar.a(), new b(eVar));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            g.c(continuation);
        }
        return objC == pf.b.g() ? objC : Unit.f93236a;
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @NotNull
    public org.bidon.vungle.b parseConfigParam(@NotNull String json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        String string = new JSONObject(json).getString("app_id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new org.bidon.vungle.b(string);
    }
}
