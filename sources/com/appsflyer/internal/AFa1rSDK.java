package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFe1nSDK.AnonymousClass3;
import com.appsflyer.internal.AFf1vSDK;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class AFa1rSDK {

    @Nullable
    public String[] areAllFieldsValid;
    public final AFc1bSDK component1;
    public long component2;
    public Intent getCurrencyIso4217Code;
    public Map<String, String> getMediationNetwork;
    public String getMonetizationNetwork;

    @Nullable
    public DeepLinkListener getRevenue;

    @NonNull
    public List<List<String>> AFAdRevenueData = new ArrayList();

    @NonNull
    public final List<String> component4 = new ArrayList();

    public AFa1rSDK(@NonNull AFc1bSDK aFc1bSDK) {
        this.component1 = aFc1bSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[LOOP:0: B:21:0x0047->B:66:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean h_(android.content.Intent r10, com.appsflyer.internal.AFa1gSDK r11) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1rSDK.h_(android.content.Intent, com.appsflyer.internal.AFa1gSDK):boolean");
    }

    @Nullable
    private Uri i_(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri uri = Uri.parse(obj.toString());
                if (uri == null || uri.getScheme() == null || uri.getHost() == null) {
                    return null;
                }
                return uri;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException e10) {
                AFLogger.afErrorLogForExcManagerOnly("recursiveSearch error", e10);
                return null;
            }
        }
        return null;
    }

    public final void f_(AFa1gSDK aFa1gSDK, Intent intent, Context context) {
        AFc1dSDK aFc1dSDK = (AFc1dSDK) this.component1;
        if (context != null) {
            aFc1dSDK.getMonetizationNetwork.getRevenue = context.getApplicationContext();
        }
        if (!h_(intent, aFa1gSDK) && this.getRevenue != null && this.component1.getCurrencyIso4217Code().getMonetizationNetwork.getMediationNetwork("appsFlyerCount", 0) == 0 && !this.component1.component2().getMediationNetwork("ddl_sent", false)) {
            AFa1pSDK aFa1pSDK = new AFa1pSDK();
            AFe1nSDK aFe1nSDKCopydefault = this.component1.copydefault();
            aFe1nSDKCopydefault.AFAdRevenueData.execute(aFe1nSDKCopydefault.new AnonymousClass3(new AFf1wSDK(aFa1pSDK, this.component1)));
        }
        this.component1.component2().getCurrencyIso4217Code("ddl_sent", true);
    }

    public final void g_(AFa1gSDK aFa1gSDK, Uri uri) {
        AFf1xSDK aFf1xSDK = new AFf1xSDK(this, aFa1gSDK, uri, this.component4);
        AFe1nSDK aFe1nSDKCopydefault = this.component1.copydefault();
        aFe1nSDKCopydefault.AFAdRevenueData.execute(aFe1nSDKCopydefault.new AnonymousClass3(aFf1xSDK));
        this.getCurrencyIso4217Code = null;
    }

    public final void getMediationNetwork(String str, DeepLinkResult.Error error) {
        if (this.getRevenue == null) {
            getMediationNetwork(str);
        } else {
            AFLogger.INSTANCE.d(AFg1cSDK.DDL, "Error occurred: ".concat(String.valueOf(str)));
            getMonetizationNetwork(new DeepLinkResult(null, error));
        }
    }

    public final void getMonetizationNetwork(DeepLinkResult deepLinkResult) {
        if (this.getRevenue == null) {
            AFLogger.INSTANCE.d(AFg1cSDK.DDL, "skipping, no callback registered");
            return;
        }
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.DDL;
        StringBuilder sb2 = new StringBuilder("Calling onDeepLinking with:\n");
        sb2.append(deepLinkResult.toString());
        aFLogger.d(aFg1cSDK, sb2.toString());
        try {
            this.getRevenue.onDeepLinking(deepLinkResult);
        } catch (Throwable th2) {
            AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
        }
    }

    public final void j_(AFa1gSDK aFa1gSDK, Uri uri, @Nullable Uri uri2) {
        if (!aFa1gSDK.getCurrencyIso4217Code("af_deeplink")) {
            String string = uri.toString();
            if (string == null) {
                string = null;
            } else if (string.matches("fb\\d*?://authorize.*") && string.contains("access_token")) {
                int iIndexOf = string.indexOf(63);
                String strSubstring = iIndexOf == -1 ? "" : string.substring(iIndexOf);
                if (strSubstring.length() != 0) {
                    ArrayList arrayList = new ArrayList();
                    if (strSubstring.contains(C4240b4.j.f42670c)) {
                        arrayList = new ArrayList(Arrays.asList(strSubstring.split(C4240b4.j.f42670c)));
                    } else {
                        arrayList.add(strSubstring);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (str.contains("access_token")) {
                            it.remove();
                        } else {
                            if (sb2.length() != 0) {
                                sb2.append(C4240b4.j.f42670c);
                            } else if (!str.startsWith("?")) {
                                sb2.append("?");
                            }
                            sb2.append(str);
                        }
                    }
                    string = string.replace(strSubstring, sb2.toString());
                }
            }
            String str2 = this.getMonetizationNetwork;
            if (str2 != null && this.getMediationNetwork != null && string.contains(str2)) {
                Uri.Builder builderBuildUpon = Uri.parse(string).buildUpon();
                Uri.Builder builderBuildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry<String, String> entry : this.getMediationNetwork.entrySet()) {
                    builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    builderBuildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                string = builderBuildUpon.build().toString();
                String encodedQuery = builderBuildUpon2.build().getEncodedQuery();
                Intrinsics.checkNotNullParameter("appended_query_params", "");
                aFa1gSDK.getMediationNetwork.put("appended_query_params", encodedQuery);
                AFa1hSDK aFa1hSDK = aFa1gSDK.getMonetizationNetwork;
                if (aFa1hSDK != null) {
                    aFa1hSDK.getMonetizationNetwork(aFa1gSDK.getMediationNetwork);
                }
            }
            Intrinsics.checkNotNullParameter("af_deeplink", "");
            aFa1gSDK.getMediationNetwork.put("af_deeplink", string);
            AFa1hSDK aFa1hSDK2 = aFa1gSDK.getMonetizationNetwork;
            if (aFa1hSDK2 != null) {
                aFa1hSDK2.getMonetizationNetwork(aFa1gSDK.getMediationNetwork);
            }
        }
        final HashMap map = new HashMap();
        map.put(POBCoreNativeConstants.NATIVE_LINK, uri.toString());
        if (uri2 != null) {
            map.put("original_link", uri2.toString());
        }
        AFj1iSDK.M_(this.component1.getCurrencyIso4217Code().n_(), map, uri);
        AFf1vSDK aFf1vSDK = new AFf1vSDK(this.component1, UUID.randomUUID(), uri);
        if (aFf1vSDK.copy()) {
            Boolean bool = Boolean.TRUE;
            Intrinsics.checkNotNullParameter("isBrandedDomain", "");
            aFa1gSDK.getMediationNetwork.put("isBrandedDomain", bool);
            AFa1hSDK aFa1hSDK3 = aFa1gSDK.getMonetizationNetwork;
            if (aFa1hSDK3 != null) {
                aFa1hSDK3.getMonetizationNetwork(aFa1gSDK.getMediationNetwork);
            }
        }
        if (!aFf1vSDK.equals()) {
            this.component1.i().getMediationNetwork(map);
            return;
        }
        aFf1vSDK.areAllFieldsValid = new AFf1vSDK.AFa1vSDK() { // from class: com.appsflyer.internal.AFa1rSDK.4
            @Override // com.appsflyer.internal.AFf1vSDK.AFa1vSDK
            public final void getCurrencyIso4217Code(Map<String, String> map2) {
                for (String str3 : map2.keySet()) {
                    map.put(str3, map2.get(str3));
                }
                AFa1rSDK.this.getMediationNetwork(map);
            }

            @Override // com.appsflyer.internal.AFf1vSDK.AFa1vSDK
            public final void getMediationNetwork(String str3) {
                AFa1rSDK.this.getMediationNetwork(str3, DeepLinkResult.Error.NETWORK);
            }
        };
        AFe1nSDK aFe1nSDKCopydefault = this.component1.copydefault();
        aFe1nSDKCopydefault.AFAdRevenueData.execute(aFe1nSDKCopydefault.new AnonymousClass3(aFf1vSDK));
    }

    public final void getMediationNetwork(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (this.getRevenue != null) {
            try {
                try {
                    DeepLink mediationNetwork = DeepLink.getMediationNetwork(map);
                    mediationNetwork.getCurrencyIso4217Code.put("is_deferred", false);
                    deepLinkResult = new DeepLinkResult(mediationNetwork, null);
                } catch (JSONException e10) {
                    AFLogger.INSTANCE.e(AFg1cSDK.DDL, "Error occurred", e10, true);
                    deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                }
                getMonetizationNetwork(deepLinkResult);
                return;
            } catch (Throwable th2) {
                getMonetizationNetwork(new DeepLinkResult(null, null));
                throw th2;
            }
        }
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1uSDK.getMonetizationNetwork().getMediationNetwork;
        if (appsFlyerConversionListener != null) {
            try {
                StringBuilder sb2 = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb2.append(map.toString());
                AFLogger.afDebugLog(sb2.toString());
                appsFlyerConversionListener.onAppOpenAttribution(map);
            } catch (Throwable th3) {
                AFLogger.afErrorLog(th3.getLocalizedMessage(), th3);
            }
        }
    }

    private static void getMediationNetwork(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1uSDK.getMonetizationNetwork().getMediationNetwork;
        if (appsFlyerConversionListener != null) {
            try {
                AFLogger.afDebugLog("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                appsFlyerConversionListener.onAttributionFailure(str);
            } catch (Throwable th2) {
                AFLogger.afErrorLog(th2.getLocalizedMessage(), th2);
            }
        }
    }
}
