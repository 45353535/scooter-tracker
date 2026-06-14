package v2;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.appevents.m0;
import com.facebook.appevents.n0;
import com.facebook.appevents.o0;
import com.facebook.s;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t2.u;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f105709a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f105710b = k.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final m0 f105711c = new m0(s.m());

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BigDecimal f105712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Currency f105713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bundle f105714c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private n0 f105715d;

        public a(BigDecimal purchaseAmount, Currency currency, Bundle param, n0 operationalData) {
            Intrinsics.checkNotNullParameter(purchaseAmount, "purchaseAmount");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(param, "param");
            Intrinsics.checkNotNullParameter(operationalData, "operationalData");
            this.f105712a = purchaseAmount;
            this.f105713b = currency;
            this.f105714c = param;
            this.f105715d = operationalData;
        }

        public final Currency a() {
            return this.f105713b;
        }

        public final n0 b() {
            return this.f105715d;
        }

        public final Bundle c() {
            return this.f105714c;
        }

        public final BigDecimal d() {
            return this.f105712a;
        }
    }

    private k() {
    }

    public static final synchronized Bundle a(List purchaseLoggingParametersList) {
        a aVar;
        Intrinsics.checkNotNullParameter(purchaseLoggingParametersList, "purchaseLoggingParametersList");
        aVar = (a) purchaseLoggingParametersList.get(0);
        return t2.s.f(CollectionsKt.listOf(new t2.a("fb_mobile_purchase", aVar.d().doubleValue(), aVar.a())), System.currentTimeMillis(), true, CollectionsKt.listOf(new Pair(aVar.c(), aVar.b())));
    }

    private final List b(String str, String str2, Map map, u.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            n0 n0Var = new n0();
            if (aVar != null) {
                n0.f19693b.a(o0.IAPParameters, "fb_iap_sdk_supported_library_versions", aVar.g(), bundle, n0Var);
            }
            n0.a aVar2 = n0.f19693b;
            o0 o0Var = o0.IAPParameters;
            String string = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
            Intrinsics.checkNotNullExpressionValue(string, "purchaseJSON.getString(C…stants.GP_IAP_PRODUCT_ID)");
            aVar2.a(o0Var, "fb_iap_product_id", string, bundle, n0Var);
            String string2 = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
            Intrinsics.checkNotNullExpressionValue(string2, "purchaseJSON.getString(C…stants.GP_IAP_PRODUCT_ID)");
            aVar2.a(o0Var, "fb_content_id", string2, bundle, n0Var);
            aVar2.a(o0Var, "android_dynamic_ads_content_id", "client_implicit", bundle, n0Var);
            String string3 = jSONObject.getString("purchaseTime");
            Intrinsics.checkNotNullExpressionValue(string3, "purchaseJSON.getString(C…nts.GP_IAP_PURCHASE_TIME)");
            aVar2.a(o0Var, "fb_iap_purchase_time", string3, bundle, n0Var);
            String string4 = jSONObject.getString("purchaseToken");
            Intrinsics.checkNotNullExpressionValue(string4, "purchaseJSON.getString(C…ts.GP_IAP_PURCHASE_TOKEN)");
            aVar2.a(o0Var, "fb_iap_purchase_token", string4, bundle, n0Var);
            String strOptString = jSONObject.optString("packageName");
            Intrinsics.checkNotNullExpressionValue(strOptString, "purchaseJSON.optString(C…ants.GP_IAP_PACKAGE_NAME)");
            aVar2.a(o0Var, "fb_iap_package_name", strOptString, bundle, n0Var);
            String strOptString2 = jSONObject2.optString("title");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "skuDetailsJSON.optString(Constants.GP_IAP_TITLE)");
            aVar2.a(o0Var, "fb_iap_product_title", strOptString2, bundle, n0Var);
            String strOptString3 = jSONObject2.optString("description");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "skuDetailsJSON.optString…tants.GP_IAP_DESCRIPTION)");
            aVar2.a(o0Var, "fb_iap_product_description", strOptString3, bundle, n0Var);
            String type = jSONObject2.optString("type");
            Intrinsics.checkNotNullExpressionValue(type, "type");
            aVar2.a(o0Var, "fb_iap_product_type", type, bundle, n0Var);
            String strE = t2.s.e();
            if (strE != null) {
                aVar2.a(o0Var, "fb_iap_client_library_version", strE, bundle, n0Var);
            }
            for (Map.Entry entry : map.entrySet()) {
                n0.f19693b.a(o0.IAPParameters, (String) entry.getKey(), (String) entry.getValue(), bundle, n0Var);
            }
            if (jSONObject2.has("price_amount_micros")) {
                return CollectionsKt.mutableListOf(d(type, bundle, n0Var, jSONObject, jSONObject2));
            }
            if (!jSONObject2.has("subscriptionOfferDetails") && !jSONObject2.has("oneTimePurchaseOfferDetails")) {
                return null;
            }
            try {
                return e(type, bundle, n0Var, jSONObject2);
            } catch (JSONException e10) {
                e = e10;
                Log.e(f105710b, "Error parsing in-app purchase/subscription data.", e);
                return null;
            } catch (Exception e11) {
                e = e11;
                Log.e(f105710b, "Failed to get purchase logging parameters,", e);
                return null;
            }
        } catch (JSONException e12) {
            e = e12;
        } catch (Exception e13) {
            e = e13;
        }
    }

    private final List c(String str, String str2, u.a aVar) {
        return b(str, str2, new HashMap(), aVar);
    }

    private final a d(String str, Bundle bundle, n0 n0Var, JSONObject jSONObject, JSONObject jSONObject2) {
        Bundle bundle2;
        n0 n0Var2;
        if (Intrinsics.areEqual(str, u.b.SUBS.g())) {
            n0.a aVar = n0.f19693b;
            o0 o0Var = o0.IAPParameters;
            String string = Boolean.toString(jSONObject.optBoolean("autoRenewing", false));
            Intrinsics.checkNotNullExpressionValue(string, "toString(\n              …      )\n                )");
            bundle2 = bundle;
            n0Var2 = n0Var;
            aVar.a(o0Var, "fb_iap_subs_auto_renewing", string, bundle2, n0Var2);
            String strOptString = jSONObject2.optString("subscriptionPeriod");
            Intrinsics.checkNotNullExpressionValue(strOptString, "skuDetailsJSON.optString…_IAP_SUBSCRIPTION_PERIOD)");
            aVar.a(o0Var, "fb_iap_subs_period", strOptString, bundle2, n0Var2);
            String strOptString2 = jSONObject2.optString("freeTrialPeriod");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "skuDetailsJSON.optString…GP_IAP_FREE_TRIAL_PERIOD)");
            aVar.a(o0Var, "fb_free_trial_period", strOptString2, bundle2, n0Var2);
            String introductoryPriceCycles = jSONObject2.optString("introductoryPriceCycles");
            Intrinsics.checkNotNullExpressionValue(introductoryPriceCycles, "introductoryPriceCycles");
            if (introductoryPriceCycles.length() > 0) {
                aVar.a(o0Var, "fb_intro_price_cycles", introductoryPriceCycles, bundle2, n0Var2);
            }
            String introductoryPricePeriod = jSONObject2.optString("introductoryPricePeriod");
            Intrinsics.checkNotNullExpressionValue(introductoryPricePeriod, "introductoryPricePeriod");
            if (introductoryPricePeriod.length() > 0) {
                aVar.a(o0Var, "fb_intro_period", introductoryPricePeriod, bundle2, n0Var2);
            }
            String introductoryPriceAmountMicros = jSONObject2.optString("introductoryPriceAmountMicros");
            Intrinsics.checkNotNullExpressionValue(introductoryPriceAmountMicros, "introductoryPriceAmountMicros");
            if (introductoryPriceAmountMicros.length() > 0) {
                aVar.a(o0Var, "fb_intro_price_amount_micros", introductoryPriceAmountMicros, bundle2, n0Var2);
            }
        } else {
            bundle2 = bundle;
            n0Var2 = n0Var;
        }
        BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
        Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
        Intrinsics.checkNotNullExpressionValue(currency, "getInstance(skuDetailsJS…RICE_CURRENCY_CODE_V2V4))");
        return new a(bigDecimal, currency, bundle2, n0Var2);
    }

    private final List e(String str, Bundle bundle, n0 n0Var, JSONObject jSONObject) throws JSONException {
        int i10 = 0;
        List list = null;
        if (!Intrinsics.areEqual(str, u.b.SUBS.g())) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("oneTimePurchaseOfferDetails");
            if (jSONObject2 == null) {
                return null;
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("priceAmountMicros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("priceCurrencyCode"));
            Intrinsics.checkNotNullExpressionValue(currency, "getInstance(oneTimePurch…RICE_CURRENCY_CODE_V5V7))");
            return CollectionsKt.mutableListOf(new a(bigDecimal, currency, bundle, n0Var));
        }
        ArrayList arrayList = new ArrayList();
        String str2 = "subscriptionOfferDetails";
        JSONArray jSONArray = jSONObject.getJSONArray("subscriptionOfferDetails");
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        while (i10 < length) {
            JSONObject jSONObject3 = jSONObject.getJSONArray(str2).getJSONObject(i10);
            if (jSONObject3 == null) {
                return list;
            }
            Bundle bundle2 = new Bundle(bundle);
            n0 n0VarC = n0Var.c();
            String basePlanId = jSONObject3.getString("basePlanId");
            n0.a aVar = n0.f19693b;
            o0 o0Var = o0.IAPParameters;
            Intrinsics.checkNotNullExpressionValue(basePlanId, "basePlanId");
            aVar.a(o0Var, "fb_iap_base_plan", basePlanId, bundle2, n0VarC);
            JSONArray jSONArray2 = jSONObject3.getJSONArray("pricingPhases");
            JSONObject jSONObject4 = jSONArray2.getJSONObject(jSONArray2.length() - 1);
            if (jSONObject4 == null) {
                return list;
            }
            String strOptString = jSONObject4.optString("billingPeriod");
            Intrinsics.checkNotNullExpressionValue(strOptString, "subscriptionJSON.optStri…IOD\n                    )");
            aVar.a(o0Var, "fb_iap_subs_period", strOptString, bundle2, n0VarC);
            if (!jSONObject4.has("recurrenceMode") || jSONObject4.getInt("recurrenceMode") == 3) {
                aVar.a(o0Var, "fb_iap_subs_auto_renewing", "false", bundle2, n0VarC);
            } else {
                aVar.a(o0Var, "fb_iap_subs_auto_renewing", "true", bundle2, n0VarC);
            }
            List list2 = list;
            BigDecimal bigDecimal2 = new BigDecimal(jSONObject4.getLong("priceAmountMicros") / 1000000.0d);
            Currency currency2 = Currency.getInstance(jSONObject4.getString("priceCurrencyCode"));
            Intrinsics.checkNotNullExpressionValue(currency2, "getInstance(subscription…RICE_CURRENCY_CODE_V5V7))");
            arrayList.add(new a(bigDecimal2, currency2, bundle2, n0VarC));
            i10++;
            list = list2;
            str2 = str2;
        }
        return arrayList;
    }

    public static final synchronized Bundle f(List purchaseLoggingParametersList, String eventName) {
        ArrayList arrayList;
        long jCurrentTimeMillis;
        ArrayList arrayList2;
        try {
            Intrinsics.checkNotNullParameter(purchaseLoggingParametersList, "purchaseLoggingParametersList");
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            arrayList = new ArrayList();
            Iterator it = purchaseLoggingParametersList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                arrayList.add(new t2.a(eventName, aVar.d().doubleValue(), aVar.a()));
            }
            jCurrentTimeMillis = System.currentTimeMillis();
            List<a> list = purchaseLoggingParametersList;
            arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (a aVar2 : list) {
                arrayList2.add(new Pair(aVar2.c(), aVar2.b()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return t2.s.f(arrayList, jCurrentTimeMillis, true, arrayList2);
    }

    public static final boolean g() {
        com.facebook.internal.i iVarF = com.facebook.internal.m.f(s.n());
        return iVarF != null && s.q() && iVarF.i();
    }

    public static final void h() {
        Context contextM = s.m();
        String strN = s.n();
        if (s.q()) {
            if (contextM instanceof Application) {
                com.facebook.appevents.o.f19698b.a((Application) contextM, strN);
            } else {
                Log.w(f105710b, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
            }
        }
    }

    public static final void i(String str, long j10) {
        Context contextM = s.m();
        com.facebook.internal.i iVarU = com.facebook.internal.m.u(s.n(), false);
        if (iVarU == null || !iVarU.a() || j10 <= 0) {
            return;
        }
        m0 m0Var = new m0(contextM);
        Bundle bundle = new Bundle(1);
        bundle.putCharSequence("fb_aa_time_spent_view_name", str);
        m0Var.c("fb_aa_time_spent_on_view", j10, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j(java.lang.String r7, java.lang.String r8, boolean r9, t2.u.a r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.k.j(java.lang.String, java.lang.String, boolean, t2.u$a, boolean):void");
    }

    public static /* synthetic */ void k(String str, String str2, boolean z10, u.a aVar, boolean z11, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        j(str, str2, z10, aVar, z11);
    }
}
