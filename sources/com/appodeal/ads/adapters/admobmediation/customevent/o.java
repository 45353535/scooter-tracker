package com.appodeal.ads.adapters.admobmediation.customevent;

import android.os.Bundle;
import com.appodeal.ads.adapters.bidonmediation.usecases.GetAdRequestUseCaseKt;
import com.appodeal.ads.ext.LogExtKt;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o {
    public static boolean b(MediationAdConfiguration mediationAdConfiguration) {
        Bundle serverParameters = mediationAdConfiguration.getServerParameters();
        Intrinsics.checkNotNullExpressionValue(serverParameters, "getServerParameters(...)");
        Intrinsics.checkNotNullParameter(serverParameters, "<this>");
        String string = serverParameters.getString(MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
        n kVar = null;
        Double dA = string == null ? null : c.a(new JSONObject(string).opt("appodeal_pf"));
        if (dA == null) {
            return false;
        }
        Bundle mediationExtras = mediationAdConfiguration.getMediationExtras();
        Intrinsics.checkNotNullExpressionValue(mediationExtras, "getMediationExtras(...)");
        Intrinsics.checkNotNullParameter(mediationExtras, "<this>");
        Double dA2 = c.a(mediationExtras.get("appodeal_pf"));
        if (dA2 != null) {
            double dDoubleValue = dA2.doubleValue();
            String string2 = mediationExtras.getString("appodeal_pf_compare");
            if (string2 != null) {
                int iHashCode = string2.hashCode();
                if (iHashCode != 60) {
                    if (iHashCode != 62) {
                        if (iHashCode != 1921) {
                            if (iHashCode != 1952) {
                                if (iHashCode == 1983 && string2.equals(GetAdRequestUseCaseKt.DEFAULT_COMPARATOR)) {
                                    kVar = new i(dDoubleValue);
                                }
                            } else if (string2.equals("==")) {
                                kVar = new e(dDoubleValue);
                            }
                        } else if (string2.equals("<=")) {
                            kVar = new m(dDoubleValue);
                        }
                    } else if (string2.equals(">")) {
                        kVar = new g(dDoubleValue);
                    }
                } else if (string2.equals("<")) {
                    kVar = new k(dDoubleValue);
                }
            }
        }
        if (kVar == null) {
            return false;
        }
        return ((Boolean) kVar.f11929a.invoke(dA)).booleanValue();
    }

    public final void a(MediationAdConfiguration adConfiguration, MediationAdLoadCallback callback) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            if (b(adConfiguration)) {
                LogExtKt.logInternal$default("CustomEventLoader", "onSuccess --> Is price matched. Return fill Admob mediation.", null, 4, null);
                Intrinsics.checkNotNull(callback.onSuccess(c(adConfiguration)));
            } else {
                LogExtKt.logInternal$default("CustomEventLoader", "onFailed --> Isn`t price matched. Return no fill Admob mediation.", null, 4, null);
                callback.onFailure(new AdError(3, "Appodeal custom event no fill error", "com.google.ads.mediation.appodeal"));
            }
        } catch (Exception e10) {
            LogExtKt.logInternal("CustomEventLoader", "onFailure --> exception: " + e10, e10);
            String localizedMessage = e10.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "Appodeal parsing custom event internal error";
            }
            callback.onFailure(new AdError(0, localizedMessage, "com.google.ads.mediation.appodeal"));
        }
    }

    public abstract Object c(MediationAdConfiguration mediationAdConfiguration);
}
