package org.bidon.chartboost;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import e1.k;
import j1.a;
import j1.e;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.d;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import org.bidon.chartboost.impl.c;
import org.bidon.chartboost.impl.e;
import org.bidon.chartboost.impl.f;
import org.bidon.chartboost.impl.h;
import org.bidon.chartboost.impl.j;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u00052\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0012\u0004\u0012\u00020\t0\b2\b\u0012\u0004\u0012\u00020\t0\nB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0!H\u0016¢\u0006\u0004\b\"\u0010#R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u001a\u0010&\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u00100\u001a\u00020/8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00064"}, d2 = {"Lorg/bidon/chartboost/ChartboostAdapter;", "Lorg/bidon/sdk/adapter/Adapter$Network;", "Lorg/bidon/sdk/adapter/Initializable;", "Lorg/bidon/chartboost/b;", "Lorg/bidon/sdk/adapter/SupportsRegulation;", "Lorg/bidon/sdk/adapter/SupportsTestMode;", "Lorg/bidon/sdk/adapter/AdProvider$Banner;", "Lorg/bidon/chartboost/impl/c;", "Lorg/bidon/sdk/adapter/AdProvider$Interstitial;", "Lorg/bidon/chartboost/impl/f;", "Lorg/bidon/sdk/adapter/AdProvider$Rewarded;", "<init>", "()V", "", "json", "parseConfigParam", "(Ljava/lang/String;)Lorg/bidon/chartboost/b;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "configParams", "", "init", "(Landroid/content/Context;Lorg/bidon/chartboost/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lorg/bidon/sdk/regulation/Regulation;", "regulation", "updateRegulation", "(Lorg/bidon/sdk/regulation/Regulation;)V", "Lorg/bidon/sdk/adapter/AdSource$Banner;", "banner", "()Lorg/bidon/sdk/adapter/AdSource$Banner;", "Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "interstitial", "()Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "rewarded", "()Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "Landroid/content/Context;", "Lorg/bidon/sdk/adapter/DemandId;", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "Lorg/bidon/sdk/adapter/AdapterInfo;", "adapterInfo", "Lorg/bidon/sdk/adapter/AdapterInfo;", "getAdapterInfo", "()Lorg/bidon/sdk/adapter/AdapterInfo;", "", "isTestMode", "()Z", "setTestMode", "(Z)V", "chartboost_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChartboostAdapter implements Adapter.Network, Initializable<b>, SupportsRegulation, SupportsTestMode, AdProvider.Banner<c>, AdProvider.Interstitial<f>, AdProvider.Rewarded<f> {

    @Nullable
    private Context context;
    private final /* synthetic */ SupportsTestModeImpl $$delegate_0 = new SupportsTestModeImpl();

    @NotNull
    private final DemandId demandId = org.bidon.chartboost.a.a();

    @NotNull
    private final AdapterInfo adapterInfo = new AdapterInfo(org.bidon.chartboost.ext.a.c(), org.bidon.chartboost.ext.a.d());

    static final class a implements d1.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation f97211a;

        a(CancellableContinuation cancellableContinuation) {
            this.f97211a = cancellableContinuation;
        }

        @Override // d1.f
        public final void a(k kVar) {
            if (kVar == null) {
                LogExtKt.logInfo("ChartboostAdapter", "Chartboost SDK initialized successfully");
                CancellableContinuation cancellableContinuation = this.f97211a;
                Result.Companion companion = Result.f93230c;
                cancellableContinuation.resumeWith(Result.b(Unit.f93236a));
                return;
            }
            LogExtKt.logInfo("ChartboostAdapter", "Chartboost SDK initialization failed " + kVar);
            CancellableContinuation cancellableContinuation2 = this.f97211a;
            Result.Companion companion2 = Result.f93230c;
            cancellableContinuation2.resumeWith(Result.b(d.a(new Exception("Chartboost SDK initialization failed: " + kVar))));
        }
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Banner
    @NotNull
    public AdSource.Banner<c> banner() {
        return new e();
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
    public AdSource.Interstitial<f> interstitial() {
        return new h();
    }

    @Override // org.bidon.sdk.adapter.SupportsTestMode
    /* JADX INFO: renamed from: isTestMode */
    public boolean getIsTestMode() {
        return this.$$delegate_0.getIsTestMode();
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Rewarded
    @NotNull
    public AdSource.Rewarded<f> rewarded() {
        return new j();
    }

    @Override // org.bidon.sdk.adapter.SupportsTestMode
    public void setTestMode(boolean z10) {
        this.$$delegate_0.setTestMode(z10);
    }

    @Override // org.bidon.sdk.adapter.SupportsRegulation
    public void updateRegulation(@NotNull Regulation regulation) {
        Intrinsics.checkNotNullParameter(regulation, "regulation");
        Context context = this.context;
        if (context != null) {
            if (regulation.getGdprApplies()) {
                b1.b.b(context, new j1.e(regulation.getHasGdprConsent() ? e.b.f85469e : e.b.f85468d));
            }
            if (regulation.getCcpaApplies()) {
                b1.b.b(context, new j1.a(regulation.getHasCcpaConsent() ? a.EnumC1018a.f85459e : a.EnumC1018a.f85458d));
            }
            if (regulation.getCoppaApplies()) {
                b1.b.b(context, new j1.b(regulation.getCoppaApplies()));
            }
        }
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @Nullable
    public Object init(@NotNull Context context, @NotNull b bVar, @NotNull Continuation continuation) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        this.context = context.getApplicationContext();
        if (getIsTestMode()) {
            b1.b.j(b1.d.f5791d);
        }
        b1.b.k(context, bVar.a(), bVar.b(), new a(eVar));
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
        JSONObject jSONObject = new JSONObject(json);
        String string = jSONObject.getString("app_id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = jSONObject.getString("app_signature");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return new b(string, string2);
    }
}
