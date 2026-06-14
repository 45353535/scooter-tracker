package org.bidon.mintegral;

import android.app.Application;
import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.mbbid.out.BidManager;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.out.SDKInitStatusListener;
import com.mbridge.msdk.system.MBridgeSDKImpl;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import eg.o0;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import of.e;
import org.bidon.sdk.adapter.AdProvider;
import org.bidon.sdk.adapter.AdSource;
import org.bidon.sdk.adapter.Adapter;
import org.bidon.sdk.adapter.AdapterInfo;
import org.bidon.sdk.adapter.DemandId;
import org.bidon.sdk.adapter.Initializable;
import org.bidon.sdk.adapter.SupportsRegulation;
import org.bidon.sdk.auction.AdTypeParam;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.regulation.Regulation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0012\u0004\u0012\u00020\t0\b2\b\u0012\u0004\u0012\u00020\t0\nB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010.\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00105¨\u00066"}, d2 = {"Lorg/bidon/mintegral/MintegralAdapter;", "Lorg/bidon/sdk/adapter/Adapter$Bidding;", "Lorg/bidon/sdk/adapter/Adapter$Network;", "Lorg/bidon/sdk/adapter/SupportsRegulation;", "Lorg/bidon/sdk/adapter/Initializable;", "Lorg/bidon/mintegral/d;", "Lorg/bidon/sdk/adapter/AdProvider$Banner;", "Lorg/bidon/mintegral/c;", "Lorg/bidon/sdk/adapter/AdProvider$Interstitial;", "Lorg/bidon/mintegral/b;", "Lorg/bidon/sdk/adapter/AdProvider$Rewarded;", "<init>", "()V", "Lorg/bidon/sdk/auction/AdTypeParam;", "adTypeParam", "", "getToken", "(Lorg/bidon/sdk/auction/AdTypeParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "configParams", "", "init", "(Landroid/content/Context;Lorg/bidon/mintegral/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "json", "parseConfigParam", "(Ljava/lang/String;)Lorg/bidon/mintegral/d;", "Lorg/bidon/sdk/adapter/AdSource$Banner;", "banner", "()Lorg/bidon/sdk/adapter/AdSource$Banner;", "Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "interstitial", "()Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "rewarded", "()Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "Lorg/bidon/sdk/regulation/Regulation;", "regulation", "updateRegulation", "(Lorg/bidon/sdk/regulation/Regulation;)V", "Lorg/bidon/sdk/adapter/DemandId;", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "Lorg/bidon/sdk/adapter/AdapterInfo;", "adapterInfo", "Lorg/bidon/sdk/adapter/AdapterInfo;", "getAdapterInfo", "()Lorg/bidon/sdk/adapter/AdapterInfo;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroid/content/Context;", "mintegral_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MintegralAdapter implements Adapter.Bidding, Adapter.Network, SupportsRegulation, Initializable<d>, AdProvider.Banner<c>, AdProvider.Interstitial<b>, AdProvider.Rewarded<b> {

    @Nullable
    private Context context;

    @NotNull
    private final DemandId demandId = org.bidon.mintegral.a.a();

    @NotNull
    private final AdapterInfo adapterInfo = new AdapterInfo(org.bidon.mintegral.ext.a.b(), org.bidon.mintegral.ext.a.c());

    @NotNull
    private final AtomicBoolean isInitialized = new AtomicBoolean(false);

    static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f97414r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f97415s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f97416t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f97417u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ Context f97419w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ d f97420x;

        /* JADX INFO: renamed from: org.bidon.mintegral.MintegralAdapter$a$a, reason: collision with other inner class name */
        public static final class C1133a implements SDKInitStatusListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ MintegralAdapter f97421a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Continuation f97422b;

            C1133a(MintegralAdapter mintegralAdapter, Continuation continuation) {
                this.f97421a = mintegralAdapter;
                this.f97422b = continuation;
            }

            @Override // com.mbridge.msdk.out.SDKInitStatusListener
            public void onInitFail(String str) {
                if (this.f97421a.isInitialized.compareAndSet(false, true)) {
                    BidonError.Unspecified unspecified = new BidonError.Unspecified(this.f97421a.getDemandId(), new Throwable(str), null, 4, null);
                    LogExtKt.logError("MintegralAdapter", "Error while initialization: " + str, unspecified);
                    Continuation continuation = this.f97422b;
                    Result.Companion companion = Result.f93230c;
                    continuation.resumeWith(Result.b(kotlin.d.a(unspecified)));
                }
            }

            @Override // com.mbridge.msdk.out.SDKInitStatusListener
            public void onInitSuccess() {
                if (this.f97421a.isInitialized.compareAndSet(false, true)) {
                    Continuation continuation = this.f97422b;
                    Result.Companion companion = Result.f93230c;
                    continuation.resumeWith(Result.b(Unit.f93236a));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, d dVar, Continuation continuation) {
            super(2, continuation);
            this.f97419w = context;
            this.f97420x = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return MintegralAdapter.this.new a(this.f97419w, this.f97420x, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objG = pf.b.g();
            int i10 = this.f97417u;
            if (i10 == 0) {
                kotlin.d.b(obj);
                MintegralAdapter mintegralAdapter = MintegralAdapter.this;
                Context context = this.f97419w;
                d dVar = this.f97420x;
                this.f97414r = mintegralAdapter;
                this.f97415s = context;
                this.f97416t = dVar;
                this.f97417u = 1;
                e eVar = new e(pf.b.d(this));
                mintegralAdapter.context = context;
                MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
                Map<String, String> mBConfigurationMap = mBridgeSDK.getMBConfigurationMap(dVar.a(), dVar.b());
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                mBridgeSDK.init(mBConfigurationMap, (Application) applicationContext, (SDKInitStatusListener) new C1133a(mintegralAdapter, eVar));
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
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Banner
    @NotNull
    public AdSource.Banner<c> banner() {
        return new org.bidon.mintegral.impl.c();
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
        return BidManager.getBuyerUid(adTypeParam.getActivity().getApplicationContext());
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Interstitial
    @NotNull
    public AdSource.Interstitial<b> interstitial() {
        return new org.bidon.mintegral.impl.e();
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Rewarded
    @NotNull
    public AdSource.Rewarded<b> rewarded() {
        return new org.bidon.mintegral.impl.g();
    }

    @Override // org.bidon.sdk.adapter.SupportsRegulation
    public void updateRegulation(@NotNull Regulation regulation) {
        Intrinsics.checkNotNullParameter(regulation, "regulation");
        Context context = this.context;
        if (context != null) {
            MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
            if (regulation.getGdprApplies()) {
                mBridgeSDK.setUserPrivateInfoType(context, MBridgeConstans.AUTHORITY_ALL_INFO, regulation.getHasGdprConsent() ? 1 : 0);
            }
            if (regulation.getCcpaApplies()) {
                mBridgeSDK.setDoNotTrackStatus(context, !regulation.getHasCcpaConsent());
            }
            if (regulation.getCoppaApplies()) {
                mBridgeSDK.setCoppaStatus(context, true);
            }
        }
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @Nullable
    public Object init(@NotNull Context context, @NotNull d dVar, @NotNull Continuation continuation) {
        Object objG;
        return (!this.isInitialized.get() && (objG = eg.g.g(o0.c().w(), new a(context, dVar, null), continuation)) == pf.b.g()) ? objG : Unit.f93236a;
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @NotNull
    public d parseConfigParam(@NotNull String json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        JSONObject jSONObject = new JSONObject(json);
        String string = jSONObject.getString("app_id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = jSONObject.getString(MBridgeConstans.APP_KEY);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new d(string, string2);
    }
}
