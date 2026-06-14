package org.bidon.bigoads;

import android.content.Context;
import com.appsflyer.AppsFlyerProperties;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.bigoads.impl.d;
import org.bidon.bigoads.impl.e;
import org.bidon.bigoads.impl.g;
import org.bidon.bigoads.impl.i;
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
import org.bidon.sdk.regulation.Regulation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.ConsentOptions;
import sg.bigo.ads.api.AdConfig;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\b\u0012\u0004\u0012\u00020\u00070\u00062\u00020\b2\b\u0012\u0004\u0012\u00020\n0\t2\b\u0012\u0004\u0012\u00020\n0\u000bB\u0007¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010)R\u001a\u0010+\u001a\u00020*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00100\u001a\u00020/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u00105\u001a\u0002048\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u00069"}, d2 = {"Lorg/bidon/bigoads/BigoAdsAdapter;", "Lorg/bidon/sdk/adapter/Adapter$Bidding;", "Lorg/bidon/sdk/adapter/Adapter$Network;", "Lorg/bidon/sdk/adapter/Initializable;", "Lorg/bidon/bigoads/b;", "Lorg/bidon/sdk/adapter/SupportsTestMode;", "Lorg/bidon/sdk/adapter/AdProvider$Banner;", "Lorg/bidon/bigoads/impl/a;", "Lorg/bidon/sdk/adapter/SupportsRegulation;", "Lorg/bidon/sdk/adapter/AdProvider$Interstitial;", "Lorg/bidon/bigoads/impl/e;", "Lorg/bidon/sdk/adapter/AdProvider$Rewarded;", "<init>", "()V", "Lorg/bidon/sdk/auction/AdTypeParam;", "adTypeParam", "", "getToken", "(Lorg/bidon/sdk/auction/AdTypeParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "configParams", "", "init", "(Landroid/content/Context;Lorg/bidon/bigoads/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "json", "parseConfigParam", "(Ljava/lang/String;)Lorg/bidon/bigoads/b;", "Lorg/bidon/sdk/adapter/AdSource$Banner;", "banner", "()Lorg/bidon/sdk/adapter/AdSource$Banner;", "Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "interstitial", "()Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "rewarded", "()Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "Lorg/bidon/sdk/regulation/Regulation;", "regulation", "updateRegulation", "(Lorg/bidon/sdk/regulation/Regulation;)V", "Landroid/content/Context;", "Lorg/bidon/sdk/adapter/DemandId;", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "Lorg/bidon/sdk/adapter/AdapterInfo;", "adapterInfo", "Lorg/bidon/sdk/adapter/AdapterInfo;", "getAdapterInfo", "()Lorg/bidon/sdk/adapter/AdapterInfo;", "", "isTestMode", "()Z", "setTestMode", "(Z)V", "bigoads_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BigoAdsAdapter implements Adapter.Bidding, Adapter.Network, Initializable<b>, SupportsTestMode, AdProvider.Banner<org.bidon.bigoads.impl.a>, SupportsRegulation, AdProvider.Interstitial<e>, AdProvider.Rewarded<e> {

    @Nullable
    private Context context;
    private final /* synthetic */ SupportsTestModeImpl $$delegate_0 = new SupportsTestModeImpl();

    @NotNull
    private final DemandId demandId = org.bidon.bigoads.a.a();

    @NotNull
    private final AdapterInfo adapterInfo = new AdapterInfo(org.bidon.bigoads.ext.a.b(), org.bidon.bigoads.ext.a.c());

    static final class a implements BigoAdSdk.InitListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation f97172a;

        a(Continuation continuation) {
            this.f97172a = continuation;
        }

        @Override // sg.bigo.ads.BigoAdSdk.InitListener
        public final void onInitialized() {
            Continuation continuation = this.f97172a;
            Result.Companion companion = Result.f93230c;
            continuation.resumeWith(Result.b(Unit.f93236a));
        }
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Banner
    @NotNull
    public AdSource.Banner<org.bidon.bigoads.impl.a> banner() {
        return new d();
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
        return BigoAdSdk.getBidderToken();
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
        return new i();
    }

    @Override // org.bidon.sdk.adapter.SupportsTestMode
    public void setTestMode(boolean z10) {
        this.$$delegate_0.setTestMode(z10);
    }

    @Override // org.bidon.sdk.adapter.SupportsRegulation
    public void updateRegulation(@NotNull Regulation regulation) {
        Intrinsics.checkNotNullParameter(regulation, "regulation");
        Context context = this.context;
        if (context != null) {
            if (regulation.getGdprApplies()) {
                BigoAdSdk.setUserConsent(context, ConsentOptions.GDPR, regulation.getHasGdprConsent());
            }
            if (regulation.getCcpaApplies()) {
                BigoAdSdk.setUserConsent(context, ConsentOptions.CCPA, regulation.getHasCcpaConsent());
            }
            BigoAdSdk.setUserConsent(context, ConsentOptions.COPPA, !regulation.getCoppaApplies());
        }
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @Nullable
    public Object init(@NotNull Context context, @NotNull b bVar, @NotNull Continuation continuation) throws Throwable {
        of.e eVar = new of.e(pf.b.d(continuation));
        this.context = context;
        AdConfig.Builder debug = new AdConfig.Builder().setAppId(bVar.a()).setDebug(getIsTestMode());
        String strB = bVar.b();
        if (strB != null) {
            debug.setChannel(strB);
        }
        BigoAdSdk.initialize(context, debug.build(), new a(eVar));
        Object objB = eVar.b();
        if (objB == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objB == pf.b.g() ? objB : Unit.f93236a;
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @NotNull
    public b parseConfigParam(@NotNull String json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        String string = new JSONObject(json).getString("app_id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new b(string, new JSONObject(json).optString(AppsFlyerProperties.CHANNEL));
    }
}
