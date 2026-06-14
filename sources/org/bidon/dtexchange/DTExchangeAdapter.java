package org.bidon.dtexchange;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lf.m;
import org.bidon.dtexchange.impl.c;
import org.bidon.dtexchange.impl.e;
import org.bidon.dtexchange.impl.g;
import org.bidon.dtexchange.impl.j;
import org.bidon.sdk.BidonSdk;
import org.bidon.sdk.adapter.AdProvider;
import org.bidon.sdk.adapter.AdSource;
import org.bidon.sdk.adapter.Adapter;
import org.bidon.sdk.adapter.AdapterInfo;
import org.bidon.sdk.adapter.DemandId;
import org.bidon.sdk.adapter.Initializable;
import org.bidon.sdk.adapter.SupportsRegulation;
import org.bidon.sdk.logs.logging.Logger;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.regulation.Regulation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0012\u0004\u0012\u00020\u00060\u00072\b\u0012\u0004\u0012\u00020\t0\bB\u0007¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0 H\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lorg/bidon/dtexchange/DTExchangeAdapter;", "Lorg/bidon/sdk/adapter/Adapter$Network;", "Lorg/bidon/sdk/adapter/SupportsRegulation;", "Lorg/bidon/sdk/adapter/Initializable;", "Lorg/bidon/dtexchange/b;", "Lorg/bidon/sdk/adapter/AdProvider$Rewarded;", "Lorg/bidon/dtexchange/impl/a;", "Lorg/bidon/sdk/adapter/AdProvider$Interstitial;", "Lorg/bidon/sdk/adapter/AdProvider$Banner;", "Lorg/bidon/dtexchange/impl/e;", "<init>", "()V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "configParams", "", "init", "(Landroid/content/Context;Lorg/bidon/dtexchange/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "json", "parseConfigParam", "(Ljava/lang/String;)Lorg/bidon/dtexchange/b;", "Lorg/bidon/sdk/regulation/Regulation;", "regulation", "updateRegulation", "(Lorg/bidon/sdk/regulation/Regulation;)V", "Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "rewarded", "()Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "interstitial", "()Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "Lorg/bidon/sdk/adapter/AdSource$Banner;", "banner", "()Lorg/bidon/sdk/adapter/AdSource$Banner;", "Lorg/bidon/sdk/adapter/DemandId;", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "Lorg/bidon/sdk/adapter/AdapterInfo;", "adapterInfo", "Lorg/bidon/sdk/adapter/AdapterInfo;", "getAdapterInfo", "()Lorg/bidon/sdk/adapter/AdapterInfo;", "dtexchange_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DTExchangeAdapter implements Adapter.Network, SupportsRegulation, Initializable<org.bidon.dtexchange.b>, AdProvider.Rewarded<org.bidon.dtexchange.impl.a>, AdProvider.Interstitial<org.bidon.dtexchange.impl.a>, AdProvider.Banner<e> {

    @NotNull
    private final AdapterInfo adapterInfo;

    @NotNull
    private final DemandId demandId = org.bidon.dtexchange.a.a();

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Logger.Level.values().length];
            try {
                iArr[Logger.Level.Verbose.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Logger.Level.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Logger.Level.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final class b implements OnFyberMarketplaceInitializedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation f97241a;

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OnFyberMarketplaceInitializedListener.FyberInitStatus.values().length];
                try {
                    iArr[OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED_NO_KITS_DETECTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        b(Continuation continuation) {
            this.f97241a = continuation;
        }

        @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
        public final void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
            int i10 = fyberInitStatus == null ? -1 : a.$EnumSwitchMapping$0[fyberInitStatus.ordinal()];
            if (i10 != -1) {
                if (i10 == 1) {
                    Continuation continuation = this.f97241a;
                    Result.Companion companion = Result.f93230c;
                    continuation.resumeWith(Result.b(Unit.f93236a));
                    return;
                } else if (i10 != 2 && i10 != 3 && i10 != 4) {
                    throw new m();
                }
            }
            Throwable th2 = new Throwable("Adapter(" + org.bidon.dtexchange.a.a().getDemandId() + ") not initialized (" + fyberInitStatus + ")");
            LogExtKt.logError("DTExchangeAdapter", "Error while initialization", th2);
            Continuation continuation2 = this.f97241a;
            Result.Companion companion2 = Result.f93230c;
            continuation2.resumeWith(Result.b(d.a(th2)));
        }
    }

    public DTExchangeAdapter() {
        String strA = org.bidon.dtexchange.ext.b.a();
        String strB = org.bidon.dtexchange.ext.b.b();
        Intrinsics.checkNotNullExpressionValue(strB, "<get-sdkVersion>(...)");
        this.adapterInfo = new AdapterInfo(strA, strB);
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Banner
    @NotNull
    public AdSource.Banner<e> banner() {
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
    public AdSource.Interstitial<org.bidon.dtexchange.impl.a> interstitial() {
        return new g();
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Rewarded
    @NotNull
    public AdSource.Rewarded<org.bidon.dtexchange.impl.a> rewarded() {
        return new j();
    }

    @Override // org.bidon.sdk.adapter.SupportsRegulation
    public void updateRegulation(@NotNull Regulation regulation) {
        Intrinsics.checkNotNullParameter(regulation, "regulation");
        if (regulation.getCcpaApplies()) {
            String usPrivacyString = regulation.getUsPrivacyString();
            if (usPrivacyString != null && !StringsKt.y0(usPrivacyString)) {
                InneractiveAdManager.setUSPrivacyString(regulation.getUsPrivacyString());
            }
        } else {
            InneractiveAdManager.clearUSPrivacyString();
        }
        if (regulation.getGdprApplies()) {
            InneractiveAdManager.setGdprConsent(regulation.getHasGdprConsent());
            String gdprConsentString = regulation.getGdprConsentString();
            if (gdprConsentString != null && !StringsKt.y0(gdprConsentString)) {
                InneractiveAdManager.setGdprConsentString(regulation.getGdprConsentString());
            }
        } else {
            InneractiveAdManager.clearGdprConsentData();
        }
        if (regulation.getCoppaApplies()) {
            InneractiveAdManager.currentAudienceAppliesToCoppa();
        }
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @Nullable
    public Object init(@NotNull Context context, @NotNull org.bidon.dtexchange.b bVar, @NotNull Continuation continuation) throws Throwable {
        of.e eVar = new of.e(pf.b.d(continuation));
        String strA = bVar.a();
        if (strA == null || strA.length() == 0) {
            Throwable th2 = new Throwable("Adapter(" + org.bidon.dtexchange.a.a().getDemandId() + ") appId is null or empty");
            Result.Companion companion = Result.f93230c;
            eVar.resumeWith(Result.b(d.a(th2)));
        }
        int i10 = a.$EnumSwitchMapping$0[BidonSdk.getLoggerLevel().ordinal()];
        if (i10 == 1) {
            InneractiveAdManager.setLogLevel(2);
        } else if (i10 == 2) {
            InneractiveAdManager.setLogLevel(6);
        } else if (i10 != 3) {
            throw new m();
        }
        InneractiveAdManager.initialize(context, bVar.a(), new b(eVar));
        Object objB = eVar.b();
        if (objB == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objB == pf.b.g() ? objB : Unit.f93236a;
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @NotNull
    public org.bidon.dtexchange.b parseConfigParam(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return new org.bidon.dtexchange.b(new JSONObject(json).optString("app_id"));
    }
}
