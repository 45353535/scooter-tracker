package com.appodeal.ads.adapters.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkInitializationListener;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.SupportsTargetingParams;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedRewarded;
import io.bidmachine.BidMachine;
import io.bidmachine.BidMachineExt;
import io.bidmachine.CustomParams;
import io.bidmachine.ExternalUserId;
import io.bidmachine.PriceFloorParams;
import io.bidmachine.TargetingParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class BidMachineNetwork extends AdNetwork<j, i> implements SupportsTargetingParams {

    public static class builder extends AdNetworkBuilder {
        public builder() {
            super("bidmachine", "0");
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NonNull
        public List<String> getAdActivities() {
            return new g();
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NonNull
        public BidMachineNetwork build() {
            return new BidMachineNetwork(this);
        }
    }

    public static LoadingError mapBidMachineError(@Nullable ae.a aVar) {
        if (aVar != null) {
            if (ae.a.f4235e.e() == aVar.e()) {
                return LoadingError.ConnectionError;
            }
            if (ae.a.f4236f.e() == aVar.e()) {
                return LoadingError.TimeoutError;
            }
            if (103 == aVar.e()) {
                return LoadingError.NoFill;
            }
            if (101 == aVar.e()) {
                return LoadingError.IncorrectAdunit;
            }
            if (108 == aVar.e()) {
                return LoadingError.InternalError;
            }
            if (ae.a.f4238h.e() == aVar.e()) {
                return LoadingError.ServerError;
            }
            if (ae.a.f4243m.e() == aVar.e()) {
                return LoadingError.ShowFailed;
            }
            if (ae.a.f4245o.e() == aVar.e()) {
                return LoadingError.ShowFailed;
            }
            if (ae.a.f4244n.e() == aVar.e()) {
                return LoadingError.ShowFailed;
            }
            if (110 == aVar.e()) {
                return LoadingError.RequestError;
            }
        }
        return LoadingError.InternalError;
    }

    public static void printError(@NonNull UnifiedAdCallback unifiedAdCallback, @Nullable ae.a aVar) {
        if (aVar != null) {
            unifiedAdCallback.printError(aVar.g(), Integer.valueOf(aVar.e()));
        }
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedBanner<i> createBanner() {
        return new com.appodeal.ads.adapters.bidmachine.banner.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedInterstitial<i> createInterstitial() {
        return new com.appodeal.ads.adapters.bidmachine.interstitial.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedMrec<i> createMrec() {
        return new com.appodeal.ads.adapters.bidmachine.mrec.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedNative<i> createNativeAd() {
        return new com.appodeal.ads.adapters.bidmachine.native_ad.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedRewarded<i> createRewarded() {
        return new com.appodeal.ads.adapters.bidmachine.rewarded_video.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NonNull
    public String getRecommendedVersion() {
        return "3.5.0";
    }

    @Override // com.appodeal.ads.AdNetwork
    @NonNull
    public String getVersion() {
        return "3.5.0";
    }

    @Override // com.appodeal.ads.AdNetwork
    public void initialize(@NonNull ContextProvider contextProvider, @NonNull j jVar, @NonNull AdNetworkMediationParams adNetworkMediationParams, @NonNull AdNetworkInitializationListener adNetworkInitializationListener) {
        JSONObject jSONObject = jVar.f12097a;
        f fVar = new f(adNetworkInitializationListener);
        Context applicationContext = contextProvider.getApplicationContext();
        e eVar = e.f12085d;
        RestrictedData restrictedData = adNetworkMediationParams.getRestrictedData();
        if (restrictedData.isUserInGdprScope()) {
            BidMachine.setSubjectToGDPR(Boolean.TRUE);
            BidMachine.setConsentConfig(restrictedData.isUserHasConsent(), restrictedData.getIabConsentString());
        }
        if (restrictedData.isUserInCcpaScope()) {
            String uSPrivacyString = restrictedData.getUSPrivacyString();
            if (!TextUtils.isEmpty(uSPrivacyString)) {
                BidMachine.setUSPrivacyString(uSPrivacyString);
            }
        }
        BidMachine.setCoppa(Boolean.valueOf(restrictedData.isUserAgeRestricted()));
        e.c(applicationContext, jSONObject, adNetworkMediationParams.getRestrictedData());
        BidMachine.setTestMode(adNetworkMediationParams.isTestMode());
        synchronized (e.class) {
            if (eVar.f12088c) {
                try {
                    adNetworkInitializationListener.onInitializationFinished();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    fVar.f12089a.onInitializationFailed(LoadingError.InternalError);
                }
            } else {
                if (eVar.f12086a == null) {
                    eVar.f12086a = new ArrayList();
                }
                eVar.f12086a.add(fVar);
            }
        }
        if (eVar.f12087b) {
            return;
        }
        eVar.f12087b = true;
        eVar.b(applicationContext, jSONObject);
    }

    @Override // com.appodeal.ads.AdNetwork
    public boolean isInitialized() {
        return BidMachine.isInitialized();
    }

    @Override // com.appodeal.ads.AdNetwork
    public void setLogging(boolean z10) {
        BidMachine.setLoggingEnabled(z10);
    }

    @Override // com.appodeal.ads.unified.SupportsTargetingParams
    public void updateTargetingParams(@NonNull JSONObject jSONObject) {
        if (jSONObject.length() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(jSONObject.length());
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next);
            if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(strOptString)) {
                arrayList.add(new ExternalUserId(next, strOptString));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        synchronized (h.f12090a) {
            TargetingParams targetingParams = BidMachineExt.getTargetingParams();
            targetingParams.setExternalUserIds((List<ExternalUserId>) arrayList);
            BidMachine.setTargetingParams(targetingParams);
        }
    }

    private BidMachineNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
    }

    @Override // com.appodeal.ads.AdNetwork
    @NonNull
    public i getAdUnitParams(@NonNull ContextProvider contextProvider, @NonNull AdUnit adUnit, @NonNull AdNetworkMediationParams adNetworkMediationParams) {
        JSONObject jsonData = adUnit.getJsonData();
        Context applicationContext = contextProvider.getApplicationContext();
        RestrictedData restrictedData = adNetworkMediationParams.getRestrictedData();
        if (restrictedData.isUserInGdprScope()) {
            BidMachine.setSubjectToGDPR(Boolean.TRUE);
            BidMachine.setConsentConfig(restrictedData.isUserHasConsent(), restrictedData.getIabConsentString());
        }
        if (restrictedData.isUserInCcpaScope()) {
            String uSPrivacyString = restrictedData.getUSPrivacyString();
            if (!TextUtils.isEmpty(uSPrivacyString)) {
                BidMachine.setUSPrivacyString(uSPrivacyString);
            }
        }
        BidMachine.setCoppa(Boolean.valueOf(restrictedData.isUserAgeRestricted()));
        e.c(applicationContext, jsonData, adNetworkMediationParams.getRestrictedData());
        BidMachine.setTestMode(adNetworkMediationParams.isTestMode());
        String strOptString = jsonData.optString("price_floors");
        PriceFloorParams priceFloorParams = new PriceFloorParams();
        if (!TextUtils.isEmpty(strOptString)) {
            try {
                JSONArray jSONArray = new JSONArray(strOptString);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    Object objOpt = jSONArray.opt(i10);
                    if (objOpt instanceof JSONObject) {
                        JSONObject jSONObject = (JSONObject) objOpt;
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            double dA = h.a(jSONObject.opt(next));
                            if (!TextUtils.isEmpty(next) && dA > -1.0d) {
                                priceFloorParams.m7757addPriceFloor(next, dA);
                            }
                        }
                    } else {
                        double dA2 = h.a(objOpt);
                        if (dA2 > -1.0d) {
                            priceFloorParams.m7756addPriceFloor(dA2);
                        }
                    }
                }
            } catch (Exception unused) {
                priceFloorParams = new PriceFloorParams();
            }
        }
        JSONObject jSONObjectOptJSONObject = jsonData.optJSONObject("custom_parameters");
        CustomParams customParams = new CustomParams();
        if (jSONObjectOptJSONObject != null) {
            try {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    customParams.m7753addParam(next2, jSONObjectOptJSONObject.optString(next2));
                }
            } catch (Throwable unused2) {
            }
        }
        JSONArray jSONArrayOptJSONArray = jsonData.optJSONArray("mediation_config");
        return new i(priceFloorParams, customParams, jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.toString() : null);
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public j getInitializeParams(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new j(jSONObject);
    }
}
