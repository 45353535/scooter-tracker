package com.appsflyer.internal;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFf1eSDK;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class AFf1cSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copy = 0;
    private static int copydefault = 1;
    private long AFAdRevenueData;

    @Nullable
    private volatile String areAllFieldsValid;
    private volatile String component1;
    Map<String, Object> getCurrencyIso4217Code;

    @NonNull
    private final AFc1gSDK getMonetizationNetwork;

    @NonNull
    private final AFf1eSDK getRevenue;
    private static char[] component4 = {6849, 65232, 53971, 46742, 35473, 28323, 16961, 9801, 14948, 7687, 61969, 54818};
    private static long component3 = -3612185266591219208L;
    private boolean getMediationNetwork = false;
    private volatile boolean component2 = false;

    public AFf1cSDK(@NonNull AFc1gSDK aFc1gSDK, @NonNull AFf1eSDK aFf1eSDK) {
        this.getMonetizationNetwork = aFc1gSDK;
        this.getRevenue = aFf1eSDK;
    }

    private static void a(int i10, int i11, char c10, Object[] objArr) {
        int i12;
        AFk1hSDK aFk1hSDK = new AFk1hSDK();
        long[] jArr = new long[i10];
        aFk1hSDK.getCurrencyIso4217Code = 0;
        while (true) {
            int i13 = aFk1hSDK.getCurrencyIso4217Code;
            if (i13 >= i10) {
                break;
            }
            $11 = ($10 + 7) % 128;
            jArr[i13] = (((long) ((char) (((long) component4[i11 + i13]) ^ 8195019394385815022L))) ^ (((long) i13) * (8195019394385815022L ^ component3))) ^ ((long) c10);
            aFk1hSDK.getCurrencyIso4217Code = i13 + 1;
        }
        char[] cArr = new char[i10];
        aFk1hSDK.getCurrencyIso4217Code = 0;
        while (true) {
            int i14 = aFk1hSDK.getCurrencyIso4217Code;
            if (i14 >= i10) {
                objArr[0] = new String(cArr);
                return;
            }
            int i15 = $10 + 67;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                cArr[i14] = (char) jArr[i14];
                i12 = i14 >>> 1;
            } else {
                cArr[i14] = (char) jArr[i14];
                i12 = i14 + 1;
            }
            aFk1hSDK.getCurrencyIso4217Code = i12;
        }
    }

    @VisibleForTesting
    private long areAllFieldsValid() {
        int i10 = copydefault + 25;
        copy = i10 % 128;
        if (i10 % 2 == 0) {
            return this.AFAdRevenueData;
        }
        int i11 = 66 / 0;
        return this.AFAdRevenueData;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean component1() {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFf1cSDK.copy
            int r0 = r0 + 25
            int r1 = r0 % 128
            com.appsflyer.internal.AFf1cSDK.copydefault = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L15
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.getCurrencyIso4217Code
            r2 = 16
            int r2 = r2 / r1
            if (r0 == 0) goto L2b
            goto L19
        L15:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.getCurrencyIso4217Code
            if (r0 == 0) goto L2b
        L19:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.getCurrencyIso4217Code
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2b
            int r0 = com.appsflyer.internal.AFf1cSDK.copy
            int r0 = r0 + 47
            int r0 = r0 % 128
            com.appsflyer.internal.AFf1cSDK.copydefault = r0
            r0 = 1
            return r0
        L2b:
            int r0 = com.appsflyer.internal.AFf1cSDK.copydefault
            int r0 = r0 + 43
            int r2 = r0 % 128
            com.appsflyer.internal.AFf1cSDK.copy = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L38
            return r1
        L38:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1cSDK.component1():boolean");
    }

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = (i10 * (-1965)) + (i11 * 984) + ((i10 | i13) * 983);
        int i15 = ~i10;
        int i16 = ~i12;
        int i17 = i14 + (((~(i13 | i16)) | i15) * (-983)) + (((~(i15 | i11)) | (~(i16 | i15))) * 983);
        return i17 != 1 ? i17 != 2 ? getMediationNetwork(objArr) : getMonetizationNetwork(objArr) : getRevenue(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean AFAdRevenueData() {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFf1cSDK.copydefault
            int r0 = r0 + 57
            int r1 = r0 % 128
            com.appsflyer.internal.AFf1cSDK.copy = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L15
            boolean r0 = r3.getMediationNetwork
            r2 = 32
            int r2 = r2 / r1
            if (r0 == 0) goto L23
            goto L19
        L15:
            boolean r0 = r3.getMediationNetwork
            if (r0 == 0) goto L23
        L19:
            boolean r0 = r3.component1()
            r2 = 1
            r0 = r0 ^ r2
            if (r0 == r2) goto L22
            goto L23
        L22:
            return r2
        L23:
            int r0 = com.appsflyer.internal.AFf1cSDK.copydefault
            int r0 = r0 + 109
            int r0 = r0 % 128
            com.appsflyer.internal.AFf1cSDK.copy = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1cSDK.AFAdRevenueData():boolean");
    }

    final void component2() {
        copydefault = (copy + 75) % 128;
        this.getCurrencyIso4217Code.put("ttr", Long.valueOf(System.currentTimeMillis() - this.AFAdRevenueData));
        this.getCurrencyIso4217Code.put("lvl_timestamp", Long.valueOf(areAllFieldsValid()));
        copydefault = (copy + 11) % 128;
    }

    public final void getCurrencyIso4217Code(@NonNull String str) {
        copydefault = (copy + 67) % 128;
        this.areAllFieldsValid = str;
        copydefault = (copy + 15) % 128;
    }

    @Nullable
    public final String getMediationNetwork() {
        copy = (copydefault + 65) % 128;
        String str = this.component1;
        copy = (copydefault + 119) % 128;
        return str;
    }

    public final void getMonetizationNetwork(String str) {
        int i10 = copy + 77;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            this.component1 = str;
            int i11 = 49 / 0;
        } else {
            this.component1 = str;
        }
        copy = (copydefault + 47) % 128;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFf1cSDK aFf1cSDK = (AFf1cSDK) objArr[0];
        copydefault = (copy + 115) % 128;
        boolean z10 = aFf1cSDK.component2;
        int i10 = copydefault + 75;
        copy = i10 % 128;
        if (i10 % 2 == 0) {
            return Boolean.valueOf(z10);
        }
        throw null;
    }

    public final void getRevenue(boolean z10) {
        int i10 = copydefault + 63;
        copy = i10 % 128;
        if (i10 % 2 != 0) {
            this.component2 = z10;
            throw null;
        }
        this.component2 = z10;
        copydefault = (copy + 117) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getMediationNetwork(com.appsflyer.internal.AFc1oSDK r9) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1cSDK.getMediationNetwork(com.appsflyer.internal.AFc1oSDK):java.lang.String");
    }

    @Nullable
    public final String getCurrencyIso4217Code() {
        int i10 = copy + 111;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            return this.areAllFieldsValid;
        }
        throw null;
    }

    public static void getCurrencyIso4217Code(AFh1jSDK aFh1jSDK) throws Throwable {
        try {
            new AFb1sSDK(aFh1jSDK).afInfoLog();
            int i10 = copydefault + 15;
            copy = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } catch (Exception e10) {
            AFLogger.afErrorLogForExcManagerOnly("native: reflection init failed", e10);
        }
    }

    @VisibleForTesting
    public static void getMonetizationNetwork(Map<String, Object> map, AFc1pSDK aFc1pSDK) {
        copydefault = (copy + 75) % 128;
        if (AFk1xSDK.getRevenue(aFc1pSDK.getMediationNetwork)) {
            copy = (copydefault + 59) % 128;
            String monetizationNetwork = aFc1pSDK.getMonetizationNetwork("com.appsflyer.security.uuid");
            if (!(!AFk1xSDK.getRevenue(monetizationNetwork))) {
                monetizationNetwork = AFc1pSDK.getMonetizationNetwork();
            }
            aFc1pSDK.getMediationNetwork = monetizationNetwork.substring(0, 8);
            copy = (copydefault + 19) % 128;
        }
        String str = aFc1pSDK.getMediationNetwork;
        try {
            Object[] objArr = new Object[1];
            a((Process.myPid() >> 22) + 12, View.MeasureSpec.makeMeasureSpec(0, 0), (char) (48974 - TextUtils.indexOf("", "", 0, 0)), objArr);
            long j10 = Long.parseLong(String.valueOf(map.get(((String) objArr[0]).intern())));
            char[] charArray = str.toCharArray();
            int i10 = ((int) (j10 % 94)) + 33;
            for (int i11 = 0; i11 < charArray.length; i11++) {
                charArray[i11] = (char) (charArray[i11] ^ i10);
            }
            map.put("sbid", new String(charArray));
        } catch (Exception e10) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception occurred while generating sbid ", e10);
        }
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        try {
            try {
                Object[] objArr2 = {(Map) objArr[1], ((AFf1cSDK) objArr[0]).getMonetizationNetwork.getRevenue};
                Map map = AFa1jSDK.unregisterClient;
                Object declaredConstructor = map.get(-1144864810);
                if (declaredConstructor == null) {
                    declaredConstructor = ((Class) AFa1jSDK.AFAdRevenueData(125 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 36 - View.MeasureSpec.getSize(0))).getDeclaredConstructor(Map.class, Context.class);
                    map.put(-1144864810, declaredConstructor);
                }
                Object objNewInstance = ((Constructor) declaredConstructor).newInstance(objArr2);
                copydefault = (copy + 125) % 128;
                return objNewInstance;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            AFLogger.afErrorLogForExcManagerOnly("AFCksmV3: reflection init failed", th3);
            return new HashMap();
        }
    }

    @NonNull
    public final Map<String, Object> getRevenue() {
        HashMap map = new HashMap();
        if (component1()) {
            int i10 = copy + 37;
            copydefault = i10 % 128;
            if (i10 % 2 == 0) {
                map.put("lvl", this.getCurrencyIso4217Code);
                throw null;
            }
            map.put("lvl", this.getCurrencyIso4217Code);
        } else if (this.getMediationNetwork) {
            this.getCurrencyIso4217Code = new HashMap();
            component2();
            this.getCurrencyIso4217Code.put("error", "pending LVL response");
            map.put("lvl", this.getCurrencyIso4217Code);
        }
        copydefault = (copy + 113) % 128;
        return map;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFf1cSDK aFf1cSDK = (AFf1cSDK) objArr[0];
        AFc1pSDK aFc1pSDK = (AFc1pSDK) objArr[1];
        aFf1cSDK.AFAdRevenueData = System.currentTimeMillis();
        aFf1cSDK.getMediationNetwork = aFf1cSDK.getRevenue.AFAdRevenueData(aFf1cSDK.getMonetizationNetwork(aFc1pSDK), aFf1cSDK.getMonetizationNetwork.getRevenue, new AFf1eSDK.AFa1tSDK() { // from class: com.appsflyer.internal.AFf1cSDK.3
            @Override // com.appsflyer.internal.AFf1eSDK.AFa1tSDK
            public final void AFAdRevenueData(@NonNull String str, @NonNull String str2) {
                AFf1cSDK.this.getCurrencyIso4217Code = new ConcurrentHashMap();
                AFf1cSDK.this.getCurrencyIso4217Code.put("signedData", str);
                AFf1cSDK.this.getCurrencyIso4217Code.put(InAppPurchaseMetaData.KEY_SIGNATURE, str2);
                AFf1cSDK.this.component2();
                AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
            }

            @Override // com.appsflyer.internal.AFf1eSDK.AFa1tSDK
            public final void AFAdRevenueData(String str, Exception exc) {
                AFf1cSDK.this.getCurrencyIso4217Code = new ConcurrentHashMap();
                String message = exc.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                AFf1cSDK.this.component2();
                AFf1cSDK.this.getCurrencyIso4217Code.put("error", message);
                AFLogger.afErrorLog(str, exc, true, true, false);
            }
        });
        int i10 = copy + 107;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final void getRevenue(AFc1pSDK aFc1pSDK) {
        getRevenue(new Object[]{this, aFc1pSDK}, 826598914, -826598912, System.identityHashCode(this));
    }

    @VisibleForTesting
    private long getMonetizationNetwork(AFc1pSDK aFc1pSDK) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AFb1jSDK.getRevenue(aFc1pSDK.getMonetizationNetwork));
        sb2.append(areAllFieldsValid());
        long monetizationNetwork = AFj1bSDK.getMonetizationNetwork(AFj1bSDK.getMonetizationNetwork(sb2.toString()));
        copy = (copydefault + 41) % 128;
        return monetizationNetwork;
    }

    public final Map<String, Object> getMediationNetwork(Map<String, Object> map) {
        AFc1iSDK aFc1iSDK = new AFc1iSDK(map, this.getMonetizationNetwork.getRevenue);
        int i10 = copy + 83;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            return aFc1iSDK;
        }
        throw null;
    }

    private static boolean getMediationNetwork(Context context) {
        int i10 = copydefault + 83;
        copy = i10 % 128;
        if (i10 % 2 == 0 ? (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) : !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            copy = (copydefault + 87) % 128;
            if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                int i11 = copy + 11;
                copydefault = i11 % 128;
                int i12 = i11 % 2;
                AFa1uSDK.getMonetizationNetwork();
                if (i12 == 0) {
                    AFa1uSDK.getRevenue(context);
                    throw null;
                }
                if (AFa1uSDK.getRevenue(context)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final Map<String, Object> getMonetizationNetwork(Map<String, Object> map) {
        return (Map) getRevenue(new Object[]{this, map}, 855506449, -855506448, System.identityHashCode(this));
    }

    public final boolean getMonetizationNetwork() {
        return ((Boolean) getRevenue(new Object[]{this}, 680071429, -680071429, System.identityHashCode(this))).booleanValue();
    }
}
