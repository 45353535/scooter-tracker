package org.bidon.bidmachine;

import android.content.Context;
import com.ironsource.C4418ld;
import com.ironsource.D5;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.bidmachine.BidMachine;
import io.bidmachine.InitializationCallback;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bidon.sdk.BidonSdk;
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
import org.bidon.sdk.logs.logging.Logger;
import org.bidon.sdk.regulation.Regulation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0012\u0004\u0012\u00020\n0\t2\b\u0012\u0004\u0012\u00020\n0\u000bB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0 H\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0#H\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0&H\u0016¢\u0006\u0004\b'\u0010(R\u001a\u0010*\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010/\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\"\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00107\u001a\u0002068\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lorg/bidon/bidmachine/BidMachineAdapter;", "Lorg/bidon/sdk/adapter/Adapter$Bidding;", "Lorg/bidon/sdk/adapter/Adapter$Network;", "Lorg/bidon/sdk/adapter/SupportsRegulation;", "Lorg/bidon/sdk/adapter/SupportsTestMode;", "Lorg/bidon/sdk/adapter/Initializable;", "Lorg/bidon/bidmachine/e;", "Lorg/bidon/sdk/adapter/AdProvider$Banner;", "Lorg/bidon/bidmachine/a;", "Lorg/bidon/sdk/adapter/AdProvider$Rewarded;", "Lorg/bidon/bidmachine/b;", "Lorg/bidon/sdk/adapter/AdProvider$Interstitial;", "<init>", "()V", "Lorg/bidon/sdk/auction/AdTypeParam;", "adTypeParam", "", "getToken", "(Lorg/bidon/sdk/auction/AdTypeParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "configParams", "", "init", "(Landroid/content/Context;Lorg/bidon/bidmachine/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "json", "parseConfigParam", "(Ljava/lang/String;)Lorg/bidon/bidmachine/e;", "Lorg/bidon/sdk/regulation/Regulation;", "regulation", "updateRegulation", "(Lorg/bidon/sdk/regulation/Regulation;)V", "Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "interstitial", "()Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "rewarded", "()Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "Lorg/bidon/sdk/adapter/AdSource$Banner;", "banner", "()Lorg/bidon/sdk/adapter/AdSource$Banner;", "Lorg/bidon/sdk/adapter/DemandId;", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "Lorg/bidon/sdk/adapter/AdapterInfo;", "adapterInfo", "Lorg/bidon/sdk/adapter/AdapterInfo;", "getAdapterInfo", "()Lorg/bidon/sdk/adapter/AdapterInfo;", "", C4418ld.f43559c, "Ljava/util/Map;", "", "isTestMode", "()Z", "setTestMode", "(Z)V", "bidmachine_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BidMachineAdapter implements Adapter.Bidding, Adapter.Network, SupportsRegulation, SupportsTestMode, Initializable<e>, AdProvider.Banner<org.bidon.bidmachine.a>, AdProvider.Rewarded<b>, AdProvider.Interstitial<b> {
    private final /* synthetic */ SupportsTestModeImpl $$delegate_0 = new SupportsTestModeImpl();

    @NotNull
    private final DemandId demandId = c.a();

    @NotNull
    private final AdapterInfo adapterInfo = new AdapterInfo(org.bidon.bidmachine.ext.b.a(), org.bidon.bidmachine.ext.b.b());

    @NotNull
    private Map<String, String> placements = MapsKt.emptyMap();

    static final class a implements InitializationCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation f97115a;

        a(Continuation continuation) {
            this.f97115a = continuation;
        }

        @Override // io.bidmachine.InitializationCallback
        public final void onInitialized() {
            Continuation continuation = this.f97115a;
            Result.Companion companion = Result.f93230c;
            continuation.resumeWith(Result.b(Unit.f93236a));
        }
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Banner
    @NotNull
    public AdSource.Banner<org.bidon.bidmachine.a> banner() {
        return new org.bidon.bidmachine.impl.b(null, 1, null);
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
        String auctionKey = adTypeParam.getAuctionKey();
        String bidToken = BidMachine.getBidToken(adTypeParam.getActivity().getApplicationContext(), org.bidon.bidmachine.ext.b.c(adTypeParam, auctionKey != null ? this.placements.get(auctionKey) : null));
        Intrinsics.checkNotNullExpressionValue(bidToken, "getBidToken(...)");
        return bidToken;
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Interstitial
    @NotNull
    public AdSource.Interstitial<b> interstitial() {
        return new org.bidon.bidmachine.impl.c(null, 1, null);
    }

    @Override // org.bidon.sdk.adapter.SupportsTestMode
    /* JADX INFO: renamed from: isTestMode */
    public boolean getIsTestMode() {
        return this.$$delegate_0.getIsTestMode();
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Rewarded
    @NotNull
    public AdSource.Rewarded<b> rewarded() {
        return new org.bidon.bidmachine.impl.d(null, 1, null);
    }

    @Override // org.bidon.sdk.adapter.SupportsTestMode
    public void setTestMode(boolean z10) {
        this.$$delegate_0.setTestMode(z10);
    }

    @Override // org.bidon.sdk.adapter.SupportsRegulation
    public void updateRegulation(@NotNull Regulation regulation) {
        Intrinsics.checkNotNullParameter(regulation, "regulation");
        String usPrivacyString = regulation.getUsPrivacyString();
        if (usPrivacyString != null) {
            BidMachine.setUSPrivacyString(usPrivacyString);
        }
        if (regulation.getCoppaApplies()) {
            BidMachine.setCoppa(Boolean.TRUE);
        }
        if (regulation.getGdprApplies()) {
            BidMachine.setSubjectToGDPR(Boolean.TRUE);
            String gdprConsentString = regulation.getGdprConsentString();
            if (gdprConsentString != null) {
                if (StringsKt.y0(gdprConsentString)) {
                    gdprConsentString = null;
                }
                if (gdprConsentString != null) {
                    BidMachine.setConsentConfig(regulation.getHasGdprConsent(), gdprConsentString);
                }
            }
        }
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @Nullable
    public Object init(@NotNull Context context, @NotNull e eVar, @NotNull Continuation continuation) throws Throwable {
        of.e eVar2 = new of.e(pf.b.d(continuation));
        Map<String, String> mapA = eVar.a();
        if (mapA == null) {
            mapA = MapsKt.emptyMap();
        }
        this.placements = mapA;
        String strB = eVar.b();
        BidMachine.setTestMode(getIsTestMode());
        BidMachine.setLoggingEnabled(BidonSdk.getLoggerLevel() != Logger.Level.Off);
        BidMachine.initialize(context, strB, new a(eVar2));
        Object objB = eVar2.b();
        if (objB == pf.b.g()) {
            g.c(continuation);
        }
        return objB == pf.b.g() ? objB : Unit.f93236a;
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @NotNull
    public e parseConfigParam(@NotNull String json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        JSONObject jSONObject = new JSONObject(json);
        String string = jSONObject.getString("seller_id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String strOptString = jSONObject.optString(D5.f40571r, "");
        Map mapBuild = null;
        if (strOptString == null || StringsKt.y0(strOptString)) {
            strOptString = null;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C4418ld.f43559c);
        if (jSONObjectOptJSONObject != null) {
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Intrinsics.checkNotNull(next);
                String strOptString2 = jSONObjectOptJSONObject.optString(next);
                Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
                mapCreateMapBuilder.put(next, strOptString2);
            }
            mapBuild = MapsKt.build(mapCreateMapBuilder);
        }
        return new e(string, strOptString, mapBuild);
    }
}
