package org.bidon.inmobi;

import android.content.Context;
import com.inmobi.compliance.InMobiPrivacyCompliance;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import eg.o0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import of.e;
import org.bidon.inmobi.impl.c;
import org.bidon.inmobi.impl.d;
import org.bidon.inmobi.impl.f;
import org.bidon.inmobi.impl.h;
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
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.regulation.Gdpr;
import org.bidon.sdk.regulation.Regulation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 :2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0012\u0004\u0012\u00020\n0\t2\b\u0012\u0004\u0012\u00020\n0\u000b:\u0001;B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0#H\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0&H\u0016¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0)H\u0016¢\u0006\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u001c\u00106\u001a\u0002058\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006<"}, d2 = {"Lorg/bidon/inmobi/InmobiAdapter;", "Lorg/bidon/sdk/adapter/Adapter$Bidding;", "Lorg/bidon/sdk/adapter/Adapter$Network;", "Lorg/bidon/sdk/adapter/Initializable;", "Lorg/bidon/inmobi/b;", "Lorg/bidon/sdk/adapter/SupportsRegulation;", "Lorg/bidon/sdk/adapter/SupportsTestMode;", "Lorg/bidon/sdk/adapter/AdProvider$Banner;", "Lorg/bidon/inmobi/impl/a;", "Lorg/bidon/sdk/adapter/AdProvider$Interstitial;", "Lorg/bidon/inmobi/impl/d;", "Lorg/bidon/sdk/adapter/AdProvider$Rewarded;", "<init>", "()V", "Lorg/bidon/sdk/regulation/Regulation;", "regulation", "Lorg/json/JSONObject;", "getConsentObject", "(Lorg/bidon/sdk/regulation/Regulation;)Lorg/json/JSONObject;", "Lorg/bidon/sdk/auction/AdTypeParam;", "adTypeParam", "", "getToken", "(Lorg/bidon/sdk/auction/AdTypeParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "configParams", "", "init", "(Landroid/content/Context;Lorg/bidon/inmobi/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "json", "parseConfigParam", "(Ljava/lang/String;)Lorg/bidon/inmobi/b;", "updateRegulation", "(Lorg/bidon/sdk/regulation/Regulation;)V", "Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "interstitial", "()Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "Lorg/bidon/sdk/adapter/AdSource$Banner;", "banner", "()Lorg/bidon/sdk/adapter/AdSource$Banner;", "Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "rewarded", "()Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "Lorg/bidon/sdk/adapter/DemandId;", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "Lorg/bidon/sdk/adapter/AdapterInfo;", "getAdapterInfo", "()Lorg/bidon/sdk/adapter/AdapterInfo;", "adapterInfo", "", "isTestMode", "()Z", "setTestMode", "(Z)V", y.f66058y, "a", "inmobi_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InmobiAdapter implements Adapter.Bidding, Adapter.Network, Initializable<org.bidon.inmobi.b>, SupportsRegulation, SupportsTestMode, AdProvider.Banner<org.bidon.inmobi.impl.a>, AdProvider.Interstitial<d>, AdProvider.Rewarded<d> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final /* synthetic */ SupportsTestModeImpl $$delegate_0 = new SupportsTestModeImpl();

    @NotNull
    private final DemandId demandId = a.a();

    /* JADX INFO: renamed from: org.bidon.inmobi.InmobiAdapter$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Map a() {
            return MapsKt.mapOf(TuplesKt.to("tp", "c_bidon"), TuplesKt.to("tp-ver", "0.13.0"));
        }

        private Companion() {
        }
    }

    static final class b extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f97279r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f97280s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f97281t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f97282u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ Context f97284w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ org.bidon.inmobi.b f97285x;

        public static final class a implements SdkInitializationListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Continuation f97286a;

            a(Continuation continuation) {
                this.f97286a = continuation;
            }

            @Override // com.inmobi.sdk.SdkInitializationListener
            public void onInitializationComplete(Error error) {
                if (error == null) {
                    Continuation continuation = this.f97286a;
                    Result.Companion companion = Result.f93230c;
                    continuation.resumeWith(Result.b(Unit.f93236a));
                } else {
                    LogExtKt.logError("InmobiAdapter", "InMobi Init Failed", error);
                    Continuation continuation2 = this.f97286a;
                    Result.Companion companion2 = Result.f93230c;
                    continuation2.resumeWith(Result.b(kotlin.d.a(BidonError.SdkNotInitialized.INSTANCE)));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, org.bidon.inmobi.b bVar, Continuation continuation) {
            super(2, continuation);
            this.f97284w = context;
            this.f97285x = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return InmobiAdapter.this.new b(this.f97284w, this.f97285x, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objG = pf.b.g();
            int i10 = this.f97282u;
            if (i10 == 0) {
                kotlin.d.b(obj);
                InmobiAdapter inmobiAdapter = InmobiAdapter.this;
                Context context = this.f97284w;
                org.bidon.inmobi.b bVar = this.f97285x;
                this.f97279r = inmobiAdapter;
                this.f97280s = context;
                this.f97281t = bVar;
                this.f97282u = 1;
                e eVar = new e(pf.b.d(this));
                if (inmobiAdapter.getIsTestMode()) {
                    InMobiSdk.setLogLevel(InMobiSdk.LogLevel.DEBUG);
                }
                InMobiSdk.init(context, bVar.a(), inmobiAdapter.getConsentObject(BidonSdk.getRegulation()), new a(eVar));
                Object objB = eVar.b();
                if (objB == pf.b.g()) {
                    g.c(this);
                }
                if (objB == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject getConsentObject(Regulation regulation) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (regulation.getGdpr() != Gdpr.Unknown) {
            jSONObject.put("gdpr", regulation.getGdpr().getCode());
        }
        if (regulation.getGdprApplies()) {
            jSONObject.put(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE, regulation.getHasGdprConsent());
            jSONObject.put(InMobiSdk.IM_GDPR_CONSENT_IAB, regulation.getGdprConsentString());
        }
        return jSONObject;
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Banner
    @NotNull
    public AdSource.Banner<org.bidon.inmobi.impl.a> banner() {
        return new c();
    }

    @Override // org.bidon.sdk.adapter.Adapter
    @NotNull
    public AdapterInfo getAdapterInfo() {
        return new AdapterInfo(org.bidon.inmobi.ext.a.b(), org.bidon.inmobi.ext.a.c());
    }

    @Override // org.bidon.sdk.adapter.Adapter
    @NotNull
    public DemandId getDemandId() {
        return this.demandId;
    }

    @Override // org.bidon.sdk.adapter.Adapter.Bidding
    @Nullable
    public Object getToken(@NotNull AdTypeParam adTypeParam, @NotNull Continuation continuation) {
        return InMobiSdk.getToken(INSTANCE.a(), null);
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Interstitial
    @NotNull
    public AdSource.Interstitial<d> interstitial() {
        return new f();
    }

    @Override // org.bidon.sdk.adapter.SupportsTestMode
    /* JADX INFO: renamed from: isTestMode */
    public boolean getIsTestMode() {
        return this.$$delegate_0.getIsTestMode();
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Rewarded
    @NotNull
    public AdSource.Rewarded<d> rewarded() {
        return new h();
    }

    @Override // org.bidon.sdk.adapter.SupportsTestMode
    public void setTestMode(boolean z10) {
        this.$$delegate_0.setTestMode(z10);
    }

    @Override // org.bidon.sdk.adapter.SupportsRegulation
    public void updateRegulation(@NotNull Regulation regulation) throws JSONException {
        Intrinsics.checkNotNullParameter(regulation, "regulation");
        if (regulation.getGdprApplies()) {
            InMobiSdk.updateGDPRConsent(getConsentObject(regulation));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("partner_gdpr_consent_available", regulation.getHasGdprConsent());
            InMobiSdk.setPartnerGDPRConsent(jSONObject);
        }
        if (regulation.getCcpaApplies()) {
            InMobiPrivacyCompliance.setDoNotSell(!regulation.getHasCcpaConsent());
            String usPrivacyString = regulation.getUsPrivacyString();
            if (usPrivacyString != null) {
                InMobiPrivacyCompliance.setUSPrivacyString(usPrivacyString);
            }
        }
        if (regulation.getCoppaApplies()) {
            InMobiSdk.setIsAgeRestricted(true);
        }
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @Nullable
    public Object init(@NotNull Context context, @NotNull org.bidon.inmobi.b bVar, @NotNull Continuation continuation) {
        Object objG = eg.g.g(o0.c().w(), new b(context, bVar, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @NotNull
    public org.bidon.inmobi.b parseConfigParam(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        String strOptString = new JSONObject(json).optString("account_id");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        return new org.bidon.inmobi.b(strOptString);
    }
}
