package org.bidon.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import com.unity3d.ironsourceads.IronSourceAds;
import com.unity3d.ironsourceads.LogLevel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.d;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.e;
import org.bidon.ironsource.impl.h;
import org.bidon.ironsource.impl.j;
import org.bidon.ironsource.impl.l;
import org.bidon.ironsource.impl.q;
import org.bidon.sdk.adapter.AdProvider;
import org.bidon.sdk.adapter.AdSource;
import org.bidon.sdk.adapter.Adapter;
import org.bidon.sdk.adapter.AdapterInfo;
import org.bidon.sdk.adapter.DemandId;
import org.bidon.sdk.adapter.Initializable;
import org.bidon.sdk.adapter.SupportsRegulation;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.regulation.Regulation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00020\u00040\u00052\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0012\u0004\u0012\u00020\t0\bB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070 H\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lorg/bidon/ironsource/IronSourceAdapter;", "Lorg/bidon/sdk/adapter/Adapter$Network;", "Lorg/bidon/sdk/adapter/SupportsRegulation;", "Lorg/bidon/sdk/adapter/AdProvider$Interstitial;", "Lorg/bidon/ironsource/impl/h;", "Lorg/bidon/sdk/adapter/AdProvider$Rewarded;", "Lorg/bidon/sdk/adapter/AdProvider$Banner;", "Lorg/bidon/ironsource/impl/b;", "Lorg/bidon/sdk/adapter/Initializable;", "Lorg/bidon/ironsource/b;", "<init>", "()V", "", "json", "parseConfigParam", "(Ljava/lang/String;)Lorg/bidon/ironsource/b;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "configParams", "", "init", "(Landroid/content/Context;Lorg/bidon/ironsource/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lorg/bidon/sdk/regulation/Regulation;", "regulation", "updateRegulation", "(Lorg/bidon/sdk/regulation/Regulation;)V", "Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "interstitial", "()Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "rewarded", "()Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "Lorg/bidon/sdk/adapter/AdSource$Banner;", "banner", "()Lorg/bidon/sdk/adapter/AdSource$Banner;", "Lorg/bidon/sdk/adapter/DemandId;", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "Lorg/bidon/sdk/adapter/AdapterInfo;", "adapterInfo", "Lorg/bidon/sdk/adapter/AdapterInfo;", "getAdapterInfo", "()Lorg/bidon/sdk/adapter/AdapterInfo;", "ironsource_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IronSourceAdapter implements Adapter.Network, SupportsRegulation, AdProvider.Interstitial<h>, AdProvider.Rewarded<h>, AdProvider.Banner<org.bidon.ironsource.impl.b>, Initializable<b> {

    @NotNull
    private final DemandId demandId = org.bidon.ironsource.a.a();

    @NotNull
    private final AdapterInfo adapterInfo = new AdapterInfo(org.bidon.ironsource.ext.a.a(), org.bidon.ironsource.ext.a.b());

    public static final class a implements InitListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation f97317a;

        a(CancellableContinuation cancellableContinuation) {
            this.f97317a = cancellableContinuation;
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitFailed(IronSourceError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            LogExtKt.logInfo("IronSourceAdapter", "IronSource SDK initialization failed: " + error);
            CancellableContinuation cancellableContinuation = this.f97317a;
            Result.Companion companion = Result.f93230c;
            cancellableContinuation.resumeWith(Result.b(d.a(new Exception("IronSource SDK initialization failed: " + error))));
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitSuccess() {
            LogExtKt.logInfo("IronSourceAdapter", "IronSource SDK initialized successfully");
            CancellableContinuation cancellableContinuation = this.f97317a;
            Result.Companion companion = Result.f93230c;
            cancellableContinuation.resumeWith(Result.b(Unit.f93236a));
        }
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Banner
    @NotNull
    public AdSource.Banner<org.bidon.ironsource.impl.b> banner() {
        return new org.bidon.ironsource.impl.d();
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

    @Override // org.bidon.sdk.adapter.AdProvider.Interstitial
    @NotNull
    public AdSource.Interstitial<h> interstitial() {
        return new j();
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Rewarded
    @NotNull
    public AdSource.Rewarded<h> rewarded() {
        return new l();
    }

    @Override // org.bidon.sdk.adapter.SupportsRegulation
    public void updateRegulation(@NotNull Regulation regulation) {
        Intrinsics.checkNotNullParameter(regulation, "regulation");
        if (regulation.getGdprApplies()) {
            IronSourceAds.setConsent(regulation.getHasGdprConsent());
        }
        if (regulation.getCcpaApplies()) {
            IronSourceAds.setMetaData("do_not_sell", String.valueOf(!regulation.getHasCcpaConsent()));
        }
        boolean coppaApplies = regulation.getCoppaApplies();
        IronSourceAds.setMetaData(com.ironsource.mediationsdk.metadata.a.f44104c, String.valueOf(coppaApplies));
        IronSourceAds.setMetaData("is_child_directed", String.valueOf(coppaApplies));
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @Nullable
    public Object init(@NotNull Context context, @NotNull b bVar, @NotNull Continuation continuation) {
        e eVar = new e(pf.b.d(continuation), 1);
        eVar.I();
        IronSource.setISDemandOnlyInterstitialListener(q.b());
        IronSource.setISDemandOnlyRewardedVideoListener(q.b());
        InitRequest initRequestBuild = new InitRequest.Builder(bVar.a()).withLogLevel(LogLevel.VERBOSE).withLegacyAdFormats(CollectionsKt.listOf((Object[]) new IronSourceAds.AdFormat[]{IronSourceAds.AdFormat.INTERSTITIAL, IronSourceAds.AdFormat.REWARDED, IronSourceAds.AdFormat.BANNER})).build();
        Intrinsics.checkNotNullExpressionValue(initRequestBuild, "build(...)");
        IronSourceAds.init(context.getApplicationContext(), initRequestBuild, new a(eVar));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            g.c(continuation);
        }
        return objC == pf.b.g() ? objC : Unit.f93236a;
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @NotNull
    public b parseConfigParam(@NotNull String json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        String string = new JSONObject(json).getString(MBridgeConstans.APP_KEY);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new b(string);
    }
}
