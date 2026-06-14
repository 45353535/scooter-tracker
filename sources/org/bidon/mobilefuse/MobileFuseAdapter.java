package org.bidon.mobilefuse;

import android.content.Context;
import com.applovin.mediation.adapters.mobilefuse.BuildConfig;
import com.mobilefuse.sdk.MobileFuse;
import com.mobilefuse.sdk.MobileFuseSettings;
import com.mobilefuse.sdk.SdkInitListener;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.d;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.mobilefuse.impl.c;
import org.bidon.mobilefuse.impl.e;
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
import org.bidon.sdk.regulation.Regulation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u00052\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0012\u0004\u0012\u00020\t0\b2\b\u0012\u0004\u0012\u00020\t0\nB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\"H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0%H\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010.\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001c\u00103\u001a\u0002028\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00067"}, d2 = {"Lorg/bidon/mobilefuse/MobileFuseAdapter;", "Lorg/bidon/sdk/adapter/Adapter$Bidding;", "Lorg/bidon/sdk/adapter/Initializable;", "Lorg/bidon/mobilefuse/b;", "Lorg/bidon/sdk/adapter/SupportsRegulation;", "Lorg/bidon/sdk/adapter/SupportsTestMode;", "Lorg/bidon/sdk/adapter/AdProvider$Banner;", "Lorg/bidon/mobilefuse/impl/a;", "Lorg/bidon/sdk/adapter/AdProvider$Interstitial;", "Lorg/bidon/mobilefuse/impl/c;", "Lorg/bidon/sdk/adapter/AdProvider$Rewarded;", "<init>", "()V", "Lorg/bidon/sdk/auction/AdTypeParam;", "adTypeParam", "", "getToken", "(Lorg/bidon/sdk/auction/AdTypeParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "configParams", "", "init", "(Landroid/content/Context;Lorg/bidon/mobilefuse/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "json", "parseConfigParam", "(Ljava/lang/String;)Lorg/bidon/mobilefuse/b;", "Lorg/bidon/sdk/regulation/Regulation;", "regulation", "updateRegulation", "(Lorg/bidon/sdk/regulation/Regulation;)V", "Lorg/bidon/sdk/adapter/AdSource$Banner;", "banner", "()Lorg/bidon/sdk/adapter/AdSource$Banner;", "Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "interstitial", "()Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "rewarded", "()Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "Lorg/bidon/sdk/adapter/DemandId;", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "Lorg/bidon/sdk/adapter/AdapterInfo;", "adapterInfo", "Lorg/bidon/sdk/adapter/AdapterInfo;", "getAdapterInfo", "()Lorg/bidon/sdk/adapter/AdapterInfo;", "", "isTestMode", "()Z", "setTestMode", "(Z)V", "mobilefuse_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MobileFuseAdapter implements Adapter.Bidding, Initializable<b>, SupportsRegulation, SupportsTestMode, AdProvider.Banner<org.bidon.mobilefuse.impl.a>, AdProvider.Interstitial<c>, AdProvider.Rewarded<c> {

    @NotNull
    private final AdapterInfo adapterInfo;
    private final /* synthetic */ SupportsTestModeImpl $$delegate_0 = new SupportsTestModeImpl();

    @NotNull
    private final DemandId demandId = org.bidon.mobilefuse.a.a();

    public static final class a implements SdkInitListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation f97463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MobileFuseAdapter f97464b;

        a(Continuation continuation, MobileFuseAdapter mobileFuseAdapter) {
            this.f97463a = continuation;
            this.f97464b = mobileFuseAdapter;
        }

        @Override // com.mobilefuse.sdk.SdkInitListener
        public void onInitError() {
            Continuation continuation = this.f97463a;
            Result.Companion companion = Result.f93230c;
            continuation.resumeWith(Result.b(d.a(new BidonError.Unspecified(this.f97464b.getDemandId(), new Throwable("Error while initialization"), null, 4, null))));
        }

        @Override // com.mobilefuse.sdk.SdkInitListener
        public void onInitSuccess() {
            Continuation continuation = this.f97463a;
            Result.Companion companion = Result.f93230c;
            continuation.resumeWith(Result.b(Unit.f93236a));
        }
    }

    public MobileFuseAdapter() {
        String strA = org.bidon.mobilefuse.ext.a.a();
        Intrinsics.checkNotNullExpressionValue(strA, "<get-sdkVersion>(...)");
        this.adapterInfo = new AdapterInfo(BuildConfig.VERSION_NAME, strA);
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Banner
    @NotNull
    public AdSource.Banner<org.bidon.mobilefuse.impl.a> banner() {
        return new org.bidon.mobilefuse.impl.b();
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
        org.bidon.mobilefuse.ext.b bVar = org.bidon.mobilefuse.ext.b.f97467a;
        Context applicationContext = adTypeParam.getActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return bVar.a(applicationContext, getIsTestMode(), continuation);
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Interstitial
    @NotNull
    public AdSource.Interstitial<c> interstitial() {
        return new org.bidon.mobilefuse.impl.d();
    }

    @Override // org.bidon.sdk.adapter.SupportsTestMode
    /* JADX INFO: renamed from: isTestMode */
    public boolean getIsTestMode() {
        return this.$$delegate_0.getIsTestMode();
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Rewarded
    @NotNull
    public AdSource.Rewarded<c> rewarded() {
        return new e();
    }

    @Override // org.bidon.sdk.adapter.SupportsTestMode
    public void setTestMode(boolean z10) {
        this.$$delegate_0.setTestMode(z10);
    }

    @Override // org.bidon.sdk.adapter.SupportsRegulation
    public void updateRegulation(@NotNull Regulation regulation) {
        Intrinsics.checkNotNullParameter(regulation, "regulation");
        MobileFuse.setPrivacyPreferences(org.bidon.mobilefuse.ext.c.a(regulation));
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @Nullable
    public Object init(@NotNull Context context, @NotNull b bVar, @NotNull Continuation continuation) throws Throwable {
        of.e eVar = new of.e(pf.b.d(continuation));
        MobileFuseSettings.setTestMode(getIsTestMode());
        MobileFuse.init(new a(eVar, this));
        Object objB = eVar.b();
        if (objB == pf.b.g()) {
            g.c(continuation);
        }
        return objB == pf.b.g() ? objB : Unit.f93236a;
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @NotNull
    public b parseConfigParam(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return new b();
    }
}
