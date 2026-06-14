package org.bidon.taurusx;

import android.content.Context;
import com.appsflyer.AppsFlyerProperties;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.api.BidManager;
import com.taurusx.tax.api.OnTaurusXTokenListener;
import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.log.LogUtil;
import eg.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.bidon.sdk.adapter.AdProvider;
import org.bidon.sdk.adapter.Adapter;
import org.bidon.sdk.adapter.AdapterInfo;
import org.bidon.sdk.adapter.DemandId;
import org.bidon.sdk.adapter.Initializable;
import org.bidon.sdk.adapter.SupportsRegulation;
import org.bidon.sdk.adapter.SupportsTestMode;
import org.bidon.sdk.adapter.impl.SupportsTestModeImpl;
import org.bidon.sdk.auction.AdTypeParam;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.regulation.Coppa;
import org.bidon.sdk.regulation.Regulation;
import org.bidon.taurusx.impl.f;
import org.bidon.taurusx.impl.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0012\u0004\u0012\u00020\n0\t2\b\u0012\u0004\u0012\u00020\n0\u000bB\u0007¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00101\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00106\u001a\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001c\u0010;\u001a\u00020:8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lorg/bidon/taurusx/TaurusXAdapter;", "Lorg/bidon/sdk/adapter/Adapter$Bidding;", "Lorg/bidon/sdk/adapter/Adapter$Network;", "Lorg/bidon/sdk/adapter/Initializable;", "Lorg/bidon/taurusx/c;", "Lorg/bidon/sdk/adapter/SupportsRegulation;", "Lorg/bidon/sdk/adapter/SupportsTestMode;", "Lorg/bidon/sdk/adapter/AdProvider$Banner;", "Lorg/bidon/taurusx/impl/d;", "Lorg/bidon/sdk/adapter/AdProvider$Interstitial;", "Lorg/bidon/taurusx/impl/f;", "Lorg/bidon/sdk/adapter/AdProvider$Rewarded;", "<init>", "()V", "", "adUnitId", "getTokenAsync", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lorg/bidon/sdk/auction/AdTypeParam;", "adTypeParam", "getToken", "(Lorg/bidon/sdk/auction/AdTypeParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "configParams", "", "init", "(Landroid/content/Context;Lorg/bidon/taurusx/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "json", "parseConfigParam", "(Ljava/lang/String;)Lorg/bidon/taurusx/c;", "Lorg/bidon/sdk/regulation/Regulation;", "regulation", "updateRegulation", "(Lorg/bidon/sdk/regulation/Regulation;)V", "Lorg/bidon/taurusx/impl/e;", "banner", "()Lorg/bidon/taurusx/impl/e;", "Lorg/bidon/taurusx/impl/g;", "interstitial", "()Lorg/bidon/taurusx/impl/g;", "Lorg/bidon/taurusx/impl/h;", "rewarded", "()Lorg/bidon/taurusx/impl/h;", "", "Lorg/bidon/taurusx/d;", "placementIds", "Ljava/util/List;", "Lorg/bidon/sdk/adapter/DemandId;", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "Lorg/bidon/sdk/adapter/AdapterInfo;", "adapterInfo", "Lorg/bidon/sdk/adapter/AdapterInfo;", "getAdapterInfo", "()Lorg/bidon/sdk/adapter/AdapterInfo;", "", "isTestMode", "()Z", "setTestMode", "(Z)V", "taurusx_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TaurusXAdapter implements Adapter.Bidding, Adapter.Network, Initializable<c>, SupportsRegulation, SupportsTestMode, AdProvider.Banner<org.bidon.taurusx.impl.d>, AdProvider.Interstitial<f>, AdProvider.Rewarded<f> {

    @NotNull
    private final AdapterInfo adapterInfo;
    private final /* synthetic */ SupportsTestModeImpl $$delegate_0 = new SupportsTestModeImpl();

    @NotNull
    private List<d> placementIds = new ArrayList();

    @NotNull
    private final DemandId demandId = org.bidon.taurusx.b.a();

    static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f97706r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f97707s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f97708t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ AdTypeParam f97709u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ TaurusXAdapter f97710v;

        /* JADX INFO: renamed from: org.bidon.taurusx.TaurusXAdapter$a$a, reason: collision with other inner class name */
        static final class C1149a extends k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f97711r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f97712s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f97713t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ TaurusXAdapter f97714u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1149a(String str, TaurusXAdapter taurusXAdapter, Continuation continuation) {
                super(2, continuation);
                this.f97713t = str;
                this.f97714u = taurusXAdapter;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1149a(this.f97713t, this.f97714u, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                String str;
                Object objG = pf.b.g();
                int i10 = this.f97712s;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    String str2 = this.f97713t;
                    TaurusXAdapter taurusXAdapter = this.f97714u;
                    this.f97711r = str2;
                    this.f97712s = 1;
                    Object tokenAsync = taurusXAdapter.getTokenAsync(str2, this);
                    if (tokenAsync == objG) {
                        return objG;
                    }
                    str = str2;
                    obj = tokenAsync;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.f97711r;
                    kotlin.d.b(obj);
                }
                return TuplesKt.to(str, obj);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C1149a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AdTypeParam adTypeParam, TaurusXAdapter taurusXAdapter, Continuation continuation) {
            super(2, continuation);
            this.f97709u = adTypeParam;
            this.f97710v = taurusXAdapter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f97709u, this.f97710v, continuation);
            aVar.f97708t = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            Object objG = pf.b.g();
            int i10 = this.f97707s;
            if (i10 == 0) {
                kotlin.d.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f97708t;
                org.bidon.taurusx.a aVarB = org.bidon.taurusx.ext.a.b(this.f97709u);
                jSONObject = new JSONObject();
                TaurusXAdapter taurusXAdapter = this.f97710v;
                List list = taurusXAdapter.placementIds;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (aVarB == ((d) obj2).b()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(i.b(coroutineScope, null, null, new C1149a(((d) it.next()).a(), taurusXAdapter, null), 3, null));
                }
                this.f97708t = jSONObject;
                this.f97706r = jSONObject;
                this.f97707s = 1;
                obj = eg.d.a(arrayList2, this);
                if (obj == objG) {
                    return objG;
                }
                jSONObject2 = jSONObject;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jSONObject2 = (JSONObject) this.f97706r;
                jSONObject = (JSONObject) this.f97708t;
                kotlin.d.b(obj);
            }
            for (Pair pair : (Iterable) obj) {
                String str = (String) pair.component1();
                String str2 = (String) pair.component2();
                if (str2 == null) {
                    str2 = "";
                }
                jSONObject2.put(str, str2);
            }
            return jSONObject.toString();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class b implements OnTaurusXTokenListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation f97715a;

        b(CancellableContinuation cancellableContinuation) {
            this.f97715a = cancellableContinuation;
        }

        @Override // com.taurusx.tax.api.OnTaurusXTokenListener
        public final void getToken(String str) {
            if (this.f97715a.isActive()) {
                this.f97715a.resumeWith(Result.b(str));
            }
        }
    }

    public TaurusXAdapter() {
        String sdkVersion = TaurusXAds.getSdkVersion();
        Intrinsics.checkNotNullExpressionValue(sdkVersion, "getSdkVersion(...)");
        this.adapterInfo = new AdapterInfo("1.12.2.0", sdkVersion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getTokenAsync(String str, Continuation continuation) {
        e eVar = new e(pf.b.d(continuation), 1);
        eVar.I();
        BidManager.getInstance().getToken(str, new b(eVar));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            g.c(continuation);
        }
        return objC;
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
        return kotlinx.coroutines.i.g(new a(adTypeParam, this, null), continuation);
    }

    @Override // org.bidon.sdk.adapter.SupportsTestMode
    /* JADX INFO: renamed from: isTestMode */
    public boolean getIsTestMode() {
        return this.$$delegate_0.getIsTestMode();
    }

    @Override // org.bidon.sdk.adapter.SupportsTestMode
    public void setTestMode(boolean z10) {
        this.$$delegate_0.setTestMode(z10);
    }

    @Override // org.bidon.sdk.adapter.SupportsRegulation
    public void updateRegulation(@NotNull Regulation regulation) {
        Intrinsics.checkNotNullParameter(regulation, "regulation");
        if (regulation.getGdprApplies()) {
            TaurusXAds.setGDPRDataCollection(!regulation.getHasGdprConsent() ? 1 : 0);
        }
        if (regulation.getCcpaApplies()) {
            TaurusXAds.setCCPADoNotSell(!regulation.getHasCcpaConsent() ? 1 : 0);
        }
        if (regulation.getCoppa() != Coppa.INSTANCE.getDefault()) {
            TaurusXAds.setCOPPAIsAgeRestrictedUser(regulation.getCoppaApplies() ? 1 : 0);
        }
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Banner
    @NotNull
    public org.bidon.taurusx.impl.e banner() {
        return new org.bidon.taurusx.impl.e();
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @Nullable
    public Object init(@NotNull Context context, @NotNull c cVar, @NotNull Continuation continuation) throws Throwable {
        of.e eVar = new of.e(pf.b.d(continuation));
        if (TaurusXAds.isInitialized()) {
            LogExtKt.logInfo("TaurusXAdapter", "Moloco SDK already initialized");
            Result.Companion companion = Result.f93230c;
            eVar.resumeWith(Result.b(Unit.f93236a));
        } else if (StringsKt.y0(cVar.b())) {
            String str = "Adapter(" + org.bidon.taurusx.b.a().getDemandId() + ") channel is empty or blank";
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str);
            LogExtKt.logError("TaurusXAdapter", str, illegalArgumentException);
            Result.Companion companion2 = Result.f93230c;
            eVar.resumeWith(Result.b(kotlin.d.a(illegalArgumentException)));
        } else if (StringsKt.y0(cVar.a())) {
            String str2 = "Adapter(" + org.bidon.taurusx.b.a().getDemandId() + ") appId is empty or blank";
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(str2);
            LogExtKt.logError("TaurusXAdapter", str2, illegalArgumentException2);
            Result.Companion companion3 = Result.f93230c;
            eVar.resumeWith(Result.b(kotlin.d.a(illegalArgumentException2)));
        } else {
            if (getIsTestMode()) {
                TaurusXAds.setTestMode(getIsTestMode());
                LogUtil.setLogEnable(getIsTestMode());
            }
            TaurusXAds.setChannel(cVar.b());
            TaurusXAds.init(context, cVar.a());
            this.placementIds = cVar.c();
            Result.Companion companion4 = Result.f93230c;
            eVar.resumeWith(Result.b(Unit.f93236a));
        }
        Object objB = eVar.b();
        if (objB == pf.b.g()) {
            g.c(continuation);
        }
        return objB == pf.b.g() ? objB : Unit.f93236a;
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Interstitial
    @NotNull
    public org.bidon.taurusx.impl.g interstitial() {
        return new org.bidon.taurusx.impl.g();
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @NotNull
    public c parseConfigParam(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        JSONObject jSONObject = new JSONObject(json);
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("placement_ids");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    Result.Companion companion = Result.f93230c;
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                    String string = jSONObject2.getString(Reporting.Key.PLACEMENT_ID);
                    org.bidon.taurusx.a aVarA = org.bidon.taurusx.a.f97716c.a(jSONObject2.getString("format"));
                    Intrinsics.checkNotNull(string);
                    Result.b(Boolean.valueOf(listCreateListBuilder.add(new d(string, aVarA))));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.f93230c;
                    Result.b(kotlin.d.a(th2));
                }
            }
        }
        List listBuild = CollectionsKt.build(listCreateListBuilder);
        String strOptString = jSONObject.optString("app_id");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        String strOptString2 = jSONObject.optString(AppsFlyerProperties.CHANNEL);
        Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
        return new c(strOptString, strOptString2, listBuild);
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Rewarded
    @NotNull
    public h rewarded() {
        return new h();
    }
}
