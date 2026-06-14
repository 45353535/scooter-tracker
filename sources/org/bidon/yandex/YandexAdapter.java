package org.bidon.yandex;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.mobile.ads.common.InitializationListener;
import com.yandex.mobile.ads.common.MobileAds;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.e;
import lf.i;
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
import org.bidon.yandex.impl.f;
import org.bidon.yandex.impl.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0012\u0004\u0012\u00020\n0\t2\b\u0012\u0004\u0012\u00020\n0\u000bB\u0007¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0 H\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0#H\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0&H\u0016¢\u0006\u0004\b'\u0010(R\u001a\u0010*\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u001c\u00109\u001a\u0002088\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006="}, d2 = {"Lorg/bidon/yandex/YandexAdapter;", "Lorg/bidon/sdk/adapter/Adapter$Network;", "Lorg/bidon/sdk/adapter/Adapter$Bidding;", "Lorg/bidon/sdk/adapter/Initializable;", "Lorg/bidon/yandex/d;", "Lorg/bidon/sdk/adapter/SupportsRegulation;", "Lorg/bidon/sdk/adapter/SupportsTestMode;", "Lorg/bidon/sdk/adapter/AdProvider$Banner;", "Lorg/bidon/yandex/impl/a;", "Lorg/bidon/sdk/adapter/AdProvider$Interstitial;", "Lorg/bidon/yandex/impl/d;", "Lorg/bidon/sdk/adapter/AdProvider$Rewarded;", "<init>", "()V", "Lorg/bidon/sdk/auction/AdTypeParam;", "adTypeParam", "", "getToken", "(Lorg/bidon/sdk/auction/AdTypeParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "configParams", "", "init", "(Landroid/content/Context;Lorg/bidon/yandex/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "json", "parseConfigParam", "(Ljava/lang/String;)Lorg/bidon/yandex/d;", "Lorg/bidon/sdk/regulation/Regulation;", "regulation", "updateRegulation", "(Lorg/bidon/sdk/regulation/Regulation;)V", "Lorg/bidon/sdk/adapter/AdSource$Banner;", "banner", "()Lorg/bidon/sdk/adapter/AdSource$Banner;", "Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "interstitial", "()Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "rewarded", "()Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "Lorg/bidon/sdk/adapter/AdapterInfo;", "adapterInfo", "Lorg/bidon/sdk/adapter/AdapterInfo;", "getAdapterInfo", "()Lorg/bidon/sdk/adapter/AdapterInfo;", "Lorg/bidon/yandex/a;", "getYandexToken$delegate", "Lkotlin/Lazy;", "getGetYandexToken", "()Lorg/bidon/yandex/a;", "getYandexToken", "Lorg/bidon/sdk/adapter/DemandId;", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "demandId", "", "isTestMode", "()Z", "setTestMode", "(Z)V", "yandex_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class YandexAdapter implements Adapter.Network, Adapter.Bidding, Initializable<d>, SupportsRegulation, SupportsTestMode, AdProvider.Banner<org.bidon.yandex.impl.a>, AdProvider.Interstitial<org.bidon.yandex.impl.d>, AdProvider.Rewarded<org.bidon.yandex.impl.d> {
    private final /* synthetic */ SupportsTestModeImpl $$delegate_0 = new SupportsTestModeImpl();

    @NotNull
    private final AdapterInfo adapterInfo = new AdapterInfo(org.bidon.yandex.ext.a.c(), org.bidon.yandex.ext.a.d());

    /* JADX INFO: renamed from: getYandexToken$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy getYandexToken = i.a(new Function0() { // from class: org.bidon.yandex.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return YandexAdapter.getYandexToken_delegate$lambda$0();
        }
    });

    static final class a implements InitializationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation f97860a;

        a(CancellableContinuation cancellableContinuation) {
            this.f97860a = cancellableContinuation;
        }

        @Override // com.yandex.mobile.ads.common.InitializationListener
        public final void onInitializationCompleted() {
            CancellableContinuation cancellableContinuation = this.f97860a;
            Result.Companion companion = Result.f93230c;
            cancellableContinuation.resumeWith(Result.b(Unit.f93236a));
        }
    }

    private final org.bidon.yandex.a getGetYandexToken() {
        return (org.bidon.yandex.a) this.getYandexToken.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final org.bidon.yandex.a getYandexToken_delegate$lambda$0() {
        return new org.bidon.yandex.a();
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Banner
    @NotNull
    public AdSource.Banner<org.bidon.yandex.impl.a> banner() {
        return new org.bidon.yandex.impl.c();
    }

    @Override // org.bidon.sdk.adapter.Adapter
    @NotNull
    public AdapterInfo getAdapterInfo() {
        return this.adapterInfo;
    }

    @Override // org.bidon.sdk.adapter.Adapter
    @NotNull
    public DemandId getDemandId() {
        return c.a();
    }

    @Override // org.bidon.sdk.adapter.Adapter.Bidding
    @Nullable
    public Object getToken(@NotNull AdTypeParam adTypeParam, @NotNull Continuation continuation) {
        return getGetYandexToken().a(adTypeParam, continuation);
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Interstitial
    @NotNull
    public AdSource.Interstitial<org.bidon.yandex.impl.d> interstitial() {
        return new f();
    }

    @Override // org.bidon.sdk.adapter.SupportsTestMode
    /* JADX INFO: renamed from: isTestMode */
    public boolean getIsTestMode() {
        return this.$$delegate_0.getIsTestMode();
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Rewarded
    @NotNull
    public AdSource.Rewarded<org.bidon.yandex.impl.d> rewarded() {
        return new l();
    }

    @Override // org.bidon.sdk.adapter.SupportsTestMode
    public void setTestMode(boolean z10) {
        this.$$delegate_0.setTestMode(z10);
    }

    @Override // org.bidon.sdk.adapter.SupportsRegulation
    public void updateRegulation(@NotNull Regulation regulation) {
        Intrinsics.checkNotNullParameter(regulation, "regulation");
        if (regulation.getGdprApplies()) {
            MobileAds.setUserConsent(regulation.getHasGdprConsent());
        }
        if (regulation.getCoppaApplies()) {
            MobileAds.setAgeRestrictedUser(true);
        }
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @Nullable
    public Object init(@NotNull Context context, @NotNull d dVar, @NotNull Continuation continuation) {
        e eVar = new e(pf.b.d(continuation), 1);
        eVar.I();
        MobileAds.enableLogging(getIsTestMode());
        MobileAds.initialize(context, new a(eVar));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            g.c(continuation);
        }
        return objC == pf.b.g() ? objC : Unit.f93236a;
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @NotNull
    public d parseConfigParam(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return new d();
    }
}
