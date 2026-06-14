package org.bidon.startio;

import android.content.Context;
import com.mobilefuse.sdk.privacy.IabString;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.startapp.sdk.adsbase.StartAppSDK;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.regulation.Regulation;
import org.bidon.startio.impl.d;
import org.bidon.startio.impl.e;
import org.bidon.startio.impl.f;
import org.bidon.startio.impl.g;
import org.bidon.startio.impl.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u00052\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0012\u0004\u0012\u00020\t0\b2\b\u0012\u0004\u0012\u00020\t0\nB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\"H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0%H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010+R\u001a\u0010-\u001a\u00020,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00102\u001a\u0002018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u00107\u001a\u0002068\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lorg/bidon/startio/StartIoAdapter;", "Lorg/bidon/sdk/adapter/Adapter$Bidding;", "Lorg/bidon/sdk/adapter/Initializable;", "Lorg/bidon/startio/b;", "Lorg/bidon/sdk/adapter/SupportsRegulation;", "Lorg/bidon/sdk/adapter/SupportsTestMode;", "Lorg/bidon/sdk/adapter/AdProvider$Banner;", "Lorg/bidon/startio/impl/d;", "Lorg/bidon/sdk/adapter/AdProvider$Interstitial;", "Lorg/bidon/startio/impl/f;", "Lorg/bidon/sdk/adapter/AdProvider$Rewarded;", "<init>", "()V", "Lorg/bidon/sdk/auction/AdTypeParam;", "adTypeParam", "", "getToken", "(Lorg/bidon/sdk/auction/AdTypeParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "configParams", "", "init", "(Landroid/content/Context;Lorg/bidon/startio/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "json", "parseConfigParam", "(Ljava/lang/String;)Lorg/bidon/startio/b;", "Lorg/bidon/sdk/regulation/Regulation;", "regulation", "updateRegulation", "(Lorg/bidon/sdk/regulation/Regulation;)V", "Lorg/bidon/sdk/adapter/AdSource$Banner;", "banner", "()Lorg/bidon/sdk/adapter/AdSource$Banner;", "Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "interstitial", "()Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "rewarded", "()Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroid/content/Context;", "Lorg/bidon/sdk/adapter/DemandId;", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "Lorg/bidon/sdk/adapter/AdapterInfo;", "adapterInfo", "Lorg/bidon/sdk/adapter/AdapterInfo;", "getAdapterInfo", "()Lorg/bidon/sdk/adapter/AdapterInfo;", "", "isTestMode", "()Z", "setTestMode", "(Z)V", "startio_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StartIoAdapter implements Adapter.Bidding, Initializable<b>, SupportsRegulation, SupportsTestMode, AdProvider.Banner<d>, AdProvider.Interstitial<f>, AdProvider.Rewarded<f> {

    @NotNull
    private final AdapterInfo adapterInfo;

    @Nullable
    private Context context;
    private final /* synthetic */ SupportsTestModeImpl $$delegate_0 = new SupportsTestModeImpl();

    @NotNull
    private final AtomicBoolean isInitialized = new AtomicBoolean(false);

    @NotNull
    private final DemandId demandId = org.bidon.startio.a.a();

    static final class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Continuation f97666c;

        a(Continuation continuation) {
            this.f97666c = continuation;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StartIoAdapter.this.isInitialized.set(true);
            Continuation continuation = this.f97666c;
            Result.Companion companion = Result.f93230c;
            continuation.resumeWith(Result.b(Unit.f93236a));
        }
    }

    public StartIoAdapter() {
        String version = StartAppSDK.getVersion();
        Intrinsics.checkNotNullExpressionValue(version, "getVersion(...)");
        this.adapterInfo = new AdapterInfo("5.2.4.1", version);
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Banner
    @NotNull
    public AdSource.Banner<d> banner() {
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

    @Override // org.bidon.sdk.adapter.Adapter.Bidding
    @Nullable
    public Object getToken(@NotNull AdTypeParam adTypeParam, @NotNull Continuation continuation) {
        String bidToken = StartAppSDK.getBidToken();
        Intrinsics.checkNotNullExpressionValue(bidToken, "getBidToken(...)");
        return bidToken;
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Interstitial
    @NotNull
    public AdSource.Interstitial<f> interstitial() {
        return new g();
    }

    @Override // org.bidon.sdk.adapter.SupportsTestMode
    /* JADX INFO: renamed from: isTestMode */
    public boolean getIsTestMode() {
        return this.$$delegate_0.getIsTestMode();
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Rewarded
    @NotNull
    public AdSource.Rewarded<f> rewarded() {
        return new i();
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
                StartAppSDK.setUserConsent(context, "pas", System.currentTimeMillis(), regulation.getHasGdprConsent());
            }
            if (regulation.getCcpaApplies()) {
                StartAppSDK.getExtras(context).edit().putString(IabString.IAB_US_PRIVACY_STRING, regulation.getUsPrivacyString()).apply();
            }
        }
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @Nullable
    public Object init(@NotNull Context context, @NotNull b bVar, @NotNull Continuation continuation) throws Throwable {
        of.e eVar = new of.e(pf.b.d(continuation));
        this.context = context;
        if (this.isInitialized.get()) {
            LogExtKt.logInfo("StartIoAdapter", "StartIo SDK already initialized");
            Result.Companion companion = Result.f93230c;
            eVar.resumeWith(Result.b(Unit.f93236a));
        } else if (StringsKt.y0(bVar.a())) {
            String str = "Adapter(" + org.bidon.startio.a.a().getDemandId() + ") app id is empty or blank";
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str);
            LogExtKt.logError("StartIoAdapter", str, illegalArgumentException);
            Result.Companion companion2 = Result.f93230c;
            eVar.resumeWith(Result.b(kotlin.d.a(illegalArgumentException)));
        } else {
            if (getIsTestMode()) {
                StartAppSDK.setTestAdsEnabled(true);
            }
            StartAppSDK.initParams(context, bVar.a()).setCallback(new a(eVar)).init();
        }
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
        String strOptString = new JSONObject(json).optString("app_id");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        return new b(strOptString);
    }
}
