package com.appsflyer.internal;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.Map;
import java.util.Set;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class AFf1uSDK extends AFe1eSDK<String> {
    private static final AFe1mSDK[] AFLogger = {AFe1mSDK.DLSDK, AFe1mSDK.ONELINK, AFe1mSDK.REGISTER};
    private final AFf1gSDK AFInAppEventType;
    protected final AFc1oSDK areAllFieldsValid;
    protected final AFg1rSDK copy;
    private final AFe1ySDK copydefault;
    private final AFf1lSDK equals;

    @NonNull
    private final AFc1pSDK hashCode;
    private final AFc1gSDK registerClient;
    private final AFh1jSDK toString;

    public AFf1uSDK(@NonNull AFh1jSDK aFh1jSDK, @NonNull AFc1bSDK aFc1bSDK) {
        this(aFh1jSDK, aFc1bSDK, null);
    }

    protected void AFAdRevenueData(AFh1jSDK aFh1jSDK) {
        this.copy.getMediationNetwork(aFh1jSDK);
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    @Nullable
    protected final AppsFlyerRequestListener areAllFieldsValid() {
        return this.toString.getMonetizationNetwork;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    protected boolean copydefault() {
        return true;
    }

    protected void getCurrencyIso4217Code(AFh1jSDK aFh1jSDK) {
        this.copy.getCurrencyIso4217Code(aFh1jSDK);
    }

    @CallSuper
    protected void getMediationNetwork(AFh1jSDK aFh1jSDK) {
        boolean z10 = true;
        try {
            try {
                AFAdRevenueData(aFh1jSDK);
                getRevenue(aFh1jSDK);
                getMonetizationNetwork(aFh1jSDK);
                getCurrencyIso4217Code(aFh1jSDK);
                areAllFieldsValid(aFh1jSDK);
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(AFg1cSDK.QUEUE, "Error while collecting payload params", th2, true, true, false);
            }
            if (aFh1jSDK.getMonetizationNetwork()) {
                aFh1jSDK.getMonetizationNetwork((Map<String, ?>) ((AFe1eSDK) this).component2.getMediationNetwork(aFh1jSDK.getCurrencyIso4217Code));
                AFf1cSDK aFf1cSDK = ((AFe1eSDK) this).component2;
                aFh1jSDK.getMonetizationNetwork((Map<String, ?>) AFf1cSDK.getRevenue(new Object[]{aFf1cSDK, aFh1jSDK.getCurrencyIso4217Code}, 855506449, -855506448, System.identityHashCode(aFf1cSDK)));
                if (this.hashCode.getRevenue("com.appsflyer.security.enable")) {
                    AFf1cSDK.getCurrencyIso4217Code(aFh1jSDK);
                }
            }
            if (aFh1jSDK.areAllFieldsValid()) {
                aFh1jSDK.getMonetizationNetwork((Map<String, ?>) ((AFe1eSDK) this).component2.getRevenue());
            }
            Set<AFe1mSDK> set = this.getMediationNetwork;
            if (!set.contains(AFe1mSDK.LAUNCH) && !set.contains(AFe1mSDK.CONVERSION)) {
                z10 = false;
            }
            if (component4() && z10) {
                aFh1jSDK.getMonetizationNetwork(this.areAllFieldsValid.getMediationNetwork("appsFlyerCount", 0));
            }
            if (aFh1jSDK.component3()) {
                Map<String, Object> mapAFAdRevenueData = AFj1aSDK.AFAdRevenueData(aFh1jSDK.getCurrencyIso4217Code);
                AFe1ySDK aFe1ySDK = this.copydefault;
                HostMeta hostMeta = new HostMeta(aFe1ySDK.getCurrencyIso4217Code(), aFe1ySDK.getMonetizationNetwork(), AFe1ySDK.getRevenue() ? AFe1tSDK.DEFAULT : AFe1tSDK.API);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", hostMeta.name);
                AFe1tSDK aFe1tSDK = hostMeta.method;
                if (aFe1tSDK != AFe1tSDK.DEFAULT) {
                    jSONObject.put("method", aFe1tSDK.getMediationNetwork);
                }
                String str = hostMeta.prefix;
                if (str != null && !StringsKt.y0(str)) {
                    jSONObject.put("prefix", hostMeta.prefix);
                }
                mapAFAdRevenueData.put("host", jSONObject);
            }
            if (this.hashCode.getRevenue("AF_PREINSTALL_DISABLED")) {
                AFj1aSDK.AFAdRevenueData(aFh1jSDK.getCurrencyIso4217Code).put("preinstall_disabled", Boolean.TRUE);
            }
            this.AFInAppEventType.getMediationNetwork(aFh1jSDK.getCurrencyIso4217Code, aFh1jSDK.getCurrencyIso4217Code());
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(AFg1cSDK.QUEUE, "Error while preparing to send event", th3, true, true, false);
        }
    }

    protected void getMonetizationNetwork(AFh1jSDK aFh1jSDK) {
        this.copy.getMonetizationNetwork(aFh1jSDK);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a A[Catch: all -> 0x00f2, TryCatch #7 {all -> 0x00f2, blocks: (B:32:0x0086, B:36:0x00cc, B:35:0x009a), top: B:88:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8 A[Catch: all -> 0x00df, Exception -> 0x00e2, NullPointerException -> 0x00e7, TRY_ENTER, TryCatch #10 {NullPointerException -> 0x00e7, Exception -> 0x00e2, all -> 0x00df, blocks: (B:40:0x00d8, B:47:0x00ea, B:48:0x00ef), top: B:98:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea A[Catch: all -> 0x00df, Exception -> 0x00e2, NullPointerException -> 0x00e7, TryCatch #10 {NullPointerException -> 0x00e7, Exception -> 0x00e2, all -> 0x00df, blocks: (B:40:0x00d8, B:47:0x00ea, B:48:0x00ef), top: B:98:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    @Override // com.appsflyer.internal.AFe1eSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.appsflyer.internal.AFd1jSDK<java.lang.String> getRevenue(@androidx.annotation.NonNull java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1uSDK.getRevenue(java.lang.String):com.appsflyer.internal.AFd1jSDK");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1uSDK(@NonNull AFh1jSDK aFh1jSDK, @NonNull AFc1bSDK aFc1bSDK, String str) {
        super(aFh1jSDK.getCurrencyIso4217Code(), new AFe1mSDK[]{AFe1mSDK.RC_CDN, AFe1mSDK.FETCH_ADVERTISING_ID}, aFc1bSDK, str);
        this.toString = aFh1jSDK;
        this.copydefault = aFc1bSDK.AFInAppEventParameterName();
        this.areAllFieldsValid = aFc1bSDK.component2();
        this.equals = aFc1bSDK.component1();
        this.registerClient = aFc1bSDK.registerClient();
        this.hashCode = aFc1bSDK.getCurrencyIso4217Code();
        this.copy = aFc1bSDK.component4();
        this.AFInAppEventType = aFc1bSDK.force();
        for (AFe1mSDK aFe1mSDK : AFLogger) {
            if (this.getCurrencyIso4217Code == aFe1mSDK) {
                return;
            }
        }
        int i10 = this.toString.component1;
        AFe1mSDK aFe1mSDK2 = this.getCurrencyIso4217Code;
        if (i10 > 0) {
            this.getRevenue.add(AFe1mSDK.CONVERSION);
            return;
        }
        AFe1mSDK aFe1mSDK3 = AFe1mSDK.CONVERSION;
        if (aFe1mSDK2 != aFe1mSDK3) {
            this.getMediationNetwork.add(aFe1mSDK3);
        }
    }

    protected void areAllFieldsValid(AFh1jSDK aFh1jSDK) {
        this.copy.AFAdRevenueData(aFh1jSDK);
    }

    protected void getRevenue(AFh1jSDK aFh1jSDK) {
        this.copy.getCurrencyIso4217Code(aFh1jSDK.getCurrencyIso4217Code);
    }
}
