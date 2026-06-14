package org.bidon.applovin;

import android.content.Context;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import of.e;
import org.bidon.applovin.impl.g;
import org.bidon.applovin.impl.j;
import org.bidon.sdk.BidonSdk;
import org.bidon.sdk.adapter.AdProvider;
import org.bidon.sdk.adapter.AdSource;
import org.bidon.sdk.adapter.Adapter;
import org.bidon.sdk.adapter.AdapterInfo;
import org.bidon.sdk.adapter.DemandId;
import org.bidon.sdk.adapter.Initializable;
import org.bidon.sdk.adapter.SupportsRegulation;
import org.bidon.sdk.logs.logging.Logger;
import org.bidon.sdk.regulation.Regulation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0012\u0004\u0012\u00020\b0\tB\u0007¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060 H\u0016¢\u0006\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010&R\u001a\u0010(\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lorg/bidon/applovin/ApplovinAdapter;", "Lorg/bidon/sdk/adapter/Adapter$Network;", "Lorg/bidon/sdk/adapter/SupportsRegulation;", "Lorg/bidon/sdk/adapter/Initializable;", "Lorg/bidon/applovin/d;", "Lorg/bidon/sdk/adapter/AdProvider$Banner;", "Lorg/bidon/applovin/b;", "Lorg/bidon/sdk/adapter/AdProvider$Interstitial;", "Lorg/bidon/applovin/c;", "Lorg/bidon/sdk/adapter/AdProvider$Rewarded;", "<init>", "()V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "configParams", "", "init", "(Landroid/content/Context;Lorg/bidon/applovin/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "json", "parseConfigParam", "(Ljava/lang/String;)Lorg/bidon/applovin/d;", "Lorg/bidon/sdk/regulation/Regulation;", "regulation", "updateRegulation", "(Lorg/bidon/sdk/regulation/Regulation;)V", "Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "interstitial", "()Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "rewarded", "()Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "Lorg/bidon/sdk/adapter/AdSource$Banner;", "banner", "()Lorg/bidon/sdk/adapter/AdSource$Banner;", "Lcom/applovin/sdk/AppLovinSdk;", "applovinSdk", "Lcom/applovin/sdk/AppLovinSdk;", "Landroid/content/Context;", "Lorg/bidon/sdk/adapter/DemandId;", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "Lorg/bidon/sdk/adapter/AdapterInfo;", "adapterInfo", "Lorg/bidon/sdk/adapter/AdapterInfo;", "getAdapterInfo", "()Lorg/bidon/sdk/adapter/AdapterInfo;", "applovin_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ApplovinAdapter implements Adapter.Network, SupportsRegulation, Initializable<d>, AdProvider.Banner<b>, AdProvider.Interstitial<c>, AdProvider.Rewarded<c> {

    @NotNull
    private final AdapterInfo adapterInfo;

    @Nullable
    private AppLovinSdk applovinSdk;

    @Nullable
    private Context context;

    @NotNull
    private final DemandId demandId = org.bidon.applovin.a.a();

    static final class a implements AppLovinSdk.SdkInitializationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation f97069a;

        a(Continuation continuation) {
            this.f97069a = continuation;
        }

        @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
        public final void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
            Continuation continuation = this.f97069a;
            Result.Companion companion = Result.f93230c;
            continuation.resumeWith(Result.b(Unit.f93236a));
        }
    }

    public ApplovinAdapter() {
        String strB = org.bidon.applovin.ext.b.b();
        String strC = org.bidon.applovin.ext.b.c();
        Intrinsics.checkNotNullExpressionValue(strC, "<get-sdkVersion>(...)");
        this.adapterInfo = new AdapterInfo(strB, strC);
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Banner
    @NotNull
    public AdSource.Banner<b> banner() {
        return new org.bidon.applovin.impl.d();
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
    public AdSource.Interstitial<c> interstitial() {
        AppLovinSdk appLovinSdk = this.applovinSdk;
        if (appLovinSdk != null) {
            return new g(appLovinSdk);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Rewarded
    @NotNull
    public AdSource.Rewarded<c> rewarded() {
        return new j();
    }

    @Override // org.bidon.sdk.adapter.SupportsRegulation
    public void updateRegulation(@NotNull Regulation regulation) {
        Intrinsics.checkNotNullParameter(regulation, "regulation");
        if (regulation.getGdprApplies()) {
            AppLovinPrivacySettings.setHasUserConsent(regulation.getHasGdprConsent());
        }
        if (regulation.getCcpaApplies()) {
            AppLovinPrivacySettings.setDoNotSell(!regulation.getHasCcpaConsent());
        }
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @Nullable
    public Object init(@NotNull Context context, @NotNull d dVar, @NotNull Continuation continuation) throws Throwable {
        e eVar = new e(pf.b.d(continuation));
        this.context = context;
        AppLovinSdk appLovinSdk = AppLovinSdk.getInstance(context);
        this.applovinSdk = appLovinSdk;
        appLovinSdk.getSettings().setVerboseLogging(BidonSdk.getLoggerLevel() != Logger.Level.Off);
        if (appLovinSdk.isInitialized()) {
            Result.Companion companion = Result.f93230c;
            eVar.resumeWith(Result.b(Unit.f93236a));
        } else {
            AppLovinSdkInitializationConfiguration.Builder builder = AppLovinSdkInitializationConfiguration.builder(dVar.b());
            String strC = dVar.c();
            if (strC != null) {
                builder.setMediationProvider(strC);
            }
            List<String> listA = dVar.a();
            if (listA != null) {
                builder.setAdUnitIds(listA);
            }
            appLovinSdk.initialize(builder.build(), new a(eVar));
        }
        Object objB = eVar.b();
        if (objB == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objB == pf.b.g() ? objB : Unit.f93236a;
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @NotNull
    public d parseConfigParam(@NotNull String json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        JSONObject jSONObject = new JSONObject(json);
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ad_unit_ids");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    Result.Companion companion = Result.f93230c;
                    Result.b(Boolean.valueOf(listCreateListBuilder.add(jSONArrayOptJSONArray.optString(i10))));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.f93230c;
                    Result.b(kotlin.d.a(th2));
                }
            }
        }
        List listBuild = CollectionsKt.build(listCreateListBuilder);
        String string = jSONObject.getString(MBridgeConstans.APP_KEY);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String strOptString = jSONObject.optString("mediator");
        Intrinsics.checkNotNull(strOptString);
        if (strOptString.length() <= 0) {
            strOptString = null;
        }
        if (listBuild.isEmpty()) {
            listBuild = null;
        }
        return new d(string, strOptString, listBuild);
    }
}
