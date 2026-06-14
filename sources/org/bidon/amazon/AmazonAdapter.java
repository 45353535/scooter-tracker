package org.bidon.amazon;

import android.content.Context;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.MRAIDPolicy;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.bidmachine.ads.networks.nast.NastAdapter;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.amazon.impl.g;
import org.bidon.amazon.impl.h;
import org.bidon.amazon.impl.i;
import org.bidon.sdk.BidonSdk;
import org.bidon.sdk.adapter.AdProvider;
import org.bidon.sdk.adapter.AdSource;
import org.bidon.sdk.adapter.Adapter;
import org.bidon.sdk.adapter.AdapterInfo;
import org.bidon.sdk.adapter.DemandId;
import org.bidon.sdk.adapter.Initializable;
import org.bidon.sdk.adapter.SupportsTestMode;
import org.bidon.sdk.adapter.impl.SupportsTestModeImpl;
import org.bidon.sdk.auction.AdTypeParam;
import org.bidon.sdk.logs.logging.Logger;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0012\u0004\u0012\u00020\b0\tB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0 H\u0016¢\u0006\u0004\b!\u0010\"R(\u0010&\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0%0#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010.\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u00105\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u001c\u00107\u001a\u0002068\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lorg/bidon/amazon/AmazonAdapter;", "Lorg/bidon/sdk/adapter/Adapter$Bidding;", "Lorg/bidon/sdk/adapter/Initializable;", "Lorg/bidon/amazon/e;", "Lorg/bidon/sdk/adapter/SupportsTestMode;", "Lorg/bidon/sdk/adapter/AdProvider$Banner;", "Lorg/bidon/amazon/impl/g;", "Lorg/bidon/sdk/adapter/AdProvider$Interstitial;", "Lorg/bidon/amazon/impl/h;", "Lorg/bidon/sdk/adapter/AdProvider$Rewarded;", "<init>", "()V", "Lorg/bidon/sdk/auction/AdTypeParam;", "adTypeParam", "", "getToken", "(Lorg/bidon/sdk/auction/AdTypeParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "json", "parseConfigParam", "(Ljava/lang/String;)Lorg/bidon/amazon/e;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "configParams", "", "init", "(Landroid/content/Context;Lorg/bidon/amazon/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lorg/bidon/sdk/adapter/AdSource$Banner;", "banner", "()Lorg/bidon/sdk/adapter/AdSource$Banner;", "Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "interstitial", "()Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "rewarded", "()Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "", "Lorg/bidon/amazon/f;", "", "slots", "Ljava/util/Map;", "Lorg/bidon/sdk/adapter/DemandId;", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "Lorg/bidon/sdk/adapter/AdapterInfo;", "adapterInfo", "Lorg/bidon/sdk/adapter/AdapterInfo;", "getAdapterInfo", "()Lorg/bidon/sdk/adapter/AdapterInfo;", "Lorg/bidon/amazon/b;", "getBidManager", "()Lorg/bidon/amazon/b;", "bidManager", "", "isTestMode", "()Z", "setTestMode", "(Z)V", "amazon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AmazonAdapter implements Adapter.Bidding, Initializable<e>, SupportsTestMode, AdProvider.Banner<g>, AdProvider.Interstitial<h>, AdProvider.Rewarded<h> {
    private final /* synthetic */ SupportsTestModeImpl $$delegate_0 = new SupportsTestModeImpl();

    @NotNull
    private Map<f, ? extends List<String>> slots = MapsKt.emptyMap();

    @NotNull
    private final DemandId demandId = a.a();

    @NotNull
    private final AdapterInfo adapterInfo = new AdapterInfo(org.bidon.amazon.ext.a.a(), org.bidon.amazon.ext.a.b());

    private final b getBidManager() {
        return d.c();
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Banner
    @NotNull
    public AdSource.Banner<g> banner() {
        return new org.bidon.amazon.impl.b(getBidManager());
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
        return getBidManager().l(this.slots, adTypeParam, continuation);
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Interstitial
    @NotNull
    public AdSource.Interstitial<h> interstitial() {
        return new org.bidon.amazon.impl.d(getBidManager());
    }

    @Override // org.bidon.sdk.adapter.SupportsTestMode
    /* JADX INFO: renamed from: isTestMode */
    public boolean getIsTestMode() {
        return this.$$delegate_0.getIsTestMode();
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Rewarded
    @NotNull
    public AdSource.Rewarded<h> rewarded() {
        return new org.bidon.amazon.impl.f(getBidManager());
    }

    @Override // org.bidon.sdk.adapter.SupportsTestMode
    public void setTestMode(boolean z10) {
        this.$$delegate_0.setTestMode(z10);
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @Nullable
    public Object init(@NotNull Context context, @NotNull e eVar, @NotNull Continuation continuation) throws Throwable {
        of.e eVar2 = new of.e(pf.b.d(continuation));
        this.slots = eVar.b();
        AdRegistration.enableTesting(getIsTestMode());
        AdRegistration.enableLogging(ArraysKt.contains(new Logger.Level[]{Logger.Level.Verbose, Logger.Level.Error}, BidonSdk.getLoggerLevel()));
        if (AdRegistration.isInitialized()) {
            LogExtKt.logInfo("AmazonAdapter", "Amazon SDK is already initialized");
            Result.Companion companion = Result.f93230c;
            eVar2.resumeWith(Result.b(Unit.f93236a));
        } else {
            LogExtKt.logInfo("AmazonAdapter", "Initializing Amazon SDK");
            AdRegistration.getInstance(eVar.a(), context);
            AdRegistration.setMRAIDSupportedVersions(new String[]{NastAdapter.ADAPTER_SDK_VERSION_NAME, "2.0", "3.0"});
            AdRegistration.setMRAIDPolicy(MRAIDPolicy.CUSTOM);
            Result.Companion companion2 = Result.f93230c;
            eVar2.resumeWith(Result.b(Unit.f93236a));
        }
        Object objB = eVar2.b();
        if (objB == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objB == pf.b.g() ? objB : Unit.f93236a;
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @NotNull
    public e parseConfigParam(@NotNull String json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        JSONObject jSONObject = new JSONObject(json);
        String string = jSONObject.getString(MBridgeConstans.APP_KEY);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Map mapA = new i().a(jSONObject);
        LogExtKt.logInfo("AmazonAdapter", "Parsed slots: " + mapA);
        return new e(string, mapA);
    }
}
