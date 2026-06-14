package org.bidon.unityads;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.metadata.MetaData;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.adapter.AdProvider;
import org.bidon.sdk.adapter.AdSource;
import org.bidon.sdk.adapter.Adapter;
import org.bidon.sdk.adapter.AdapterInfo;
import org.bidon.sdk.adapter.DemandId;
import org.bidon.sdk.adapter.Initializable;
import org.bidon.sdk.adapter.SupportsRegulation;
import org.bidon.sdk.adapter.SupportsTestMode;
import org.bidon.sdk.adapter.impl.SupportsTestModeImpl;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.regulation.Regulation;
import org.bidon.unityads.impl.c;
import org.bidon.unityads.impl.d;
import org.bidon.unityads.impl.e;
import org.bidon.unityads.impl.g;
import org.bidon.unityads.impl.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0012\u0004\u0012\u00020\t0\b2\b\u0012\u0004\u0012\u00020\t0\nB\u0007¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070!H\u0016¢\u0006\u0004\b\"\u0010#R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u001a\u0010&\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u00100\u001a\u00020/8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00064"}, d2 = {"Lorg/bidon/unityads/UnityAdsAdapter;", "Lorg/bidon/sdk/adapter/Adapter$Network;", "Lorg/bidon/sdk/adapter/SupportsRegulation;", "Lorg/bidon/sdk/adapter/SupportsTestMode;", "Lorg/bidon/sdk/adapter/Initializable;", "Lorg/bidon/unityads/b;", "Lorg/bidon/sdk/adapter/AdProvider$Banner;", "Lorg/bidon/unityads/impl/d;", "Lorg/bidon/sdk/adapter/AdProvider$Interstitial;", "Lorg/bidon/unityads/impl/e;", "Lorg/bidon/sdk/adapter/AdProvider$Rewarded;", "<init>", "()V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "configParams", "", "init", "(Landroid/content/Context;Lorg/bidon/unityads/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "json", "parseConfigParam", "(Ljava/lang/String;)Lorg/bidon/unityads/b;", "Lorg/bidon/sdk/regulation/Regulation;", "regulation", "updateRegulation", "(Lorg/bidon/sdk/regulation/Regulation;)V", "Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "interstitial", "()Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "rewarded", "()Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "Lorg/bidon/sdk/adapter/AdSource$Banner;", "banner", "()Lorg/bidon/sdk/adapter/AdSource$Banner;", "Landroid/content/Context;", "Lorg/bidon/sdk/adapter/DemandId;", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "Lorg/bidon/sdk/adapter/AdapterInfo;", "adapterInfo", "Lorg/bidon/sdk/adapter/AdapterInfo;", "getAdapterInfo", "()Lorg/bidon/sdk/adapter/AdapterInfo;", "", "isTestMode", "()Z", "setTestMode", "(Z)V", "unityads_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnityAdsAdapter implements Adapter.Network, SupportsRegulation, SupportsTestMode, Initializable<b>, AdProvider.Banner<d>, AdProvider.Interstitial<e>, AdProvider.Rewarded<e> {

    @NotNull
    private final AdapterInfo adapterInfo;

    @Nullable
    private Context context;
    private final /* synthetic */ SupportsTestModeImpl $$delegate_0 = new SupportsTestModeImpl();

    @NotNull
    private final DemandId demandId = org.bidon.unityads.a.a();

    public static final class a implements IUnityAdsInitializationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation f97757a;

        a(Continuation continuation) {
            this.f97757a = continuation;
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationComplete() {
            Continuation continuation = this.f97757a;
            Result.Companion companion = Result.f93230c;
            continuation.resumeWith(Result.b(Unit.f93236a));
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            LogExtKt.logError("UnityAdsAdapter", "Error while initialization: " + str + ", " + unityAdsInitializationError, org.bidon.unityads.ext.b.a(unityAdsInitializationError));
            Continuation continuation = this.f97757a;
            Result.Companion companion = Result.f93230c;
            continuation.resumeWith(Result.b(kotlin.d.a(org.bidon.unityads.ext.b.a(unityAdsInitializationError))));
        }
    }

    public UnityAdsAdapter() {
        String strA = org.bidon.unityads.ext.a.a();
        String strB = org.bidon.unityads.ext.a.b();
        Intrinsics.checkNotNullExpressionValue(strB, "<get-sdkVersion>(...)");
        this.adapterInfo = new AdapterInfo(strA, strB);
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Banner
    @NotNull
    public AdSource.Banner<d> banner() {
        return new c();
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
        MetaData metaData = new MetaData(this.context);
        if (regulation.getGdprApplies()) {
            metaData.set("gdpr.consent", Boolean.valueOf(regulation.getHasGdprConsent()));
        }
        if (!regulation.getCcpaApplies()) {
            metaData.set("privacy.consent", Boolean.valueOf(regulation.getHasCcpaConsent()));
        }
        if (regulation.getCoppaApplies()) {
            metaData.set("privacy.useroveragelimit", Boolean.TRUE);
        }
        metaData.commit();
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @Nullable
    public Object init(@NotNull Context context, @NotNull b bVar, @NotNull Continuation continuation) throws Throwable {
        of.e eVar = new of.e(pf.b.d(continuation));
        this.context = context;
        UnityAds.initialize(context, bVar.a(), getIsTestMode(), new a(eVar));
        Object objB = eVar.b();
        if (objB == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objB == pf.b.g() ? objB : Unit.f93236a;
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @NotNull
    public b parseConfigParam(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        String strOptString = new JSONObject(json).optString("game_id");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        return new b(strOptString);
    }
}
