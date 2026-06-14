package com.appsflyer.internal;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.adjust.sdk.Constants;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.ironsource.X1;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes6.dex */
public final class AFd1lSDK {
    private static int $10 = 0;
    private static int $11 = 1;

    @VisibleForTesting
    private static String AFAdRevenueData = null;
    private static boolean areAllFieldsValid = false;
    private static char[] component1 = null;
    private static int component3 = 0;
    private static int copy = 1;
    public static String getRevenue;
    private static int hashCode;
    private static boolean toString;
    private final AFj1eSDK component2;
    private final AFe1ySDK component4;
    private final AppsFlyerProperties getCurrencyIso4217Code;
    private final AFc1pSDK getMediationNetwork;
    private final AFd1kSDK getMonetizationNetwork;

    static {
        getMediationNetwork();
        getRevenue = "https://%sgcdsdk.%s/install_data/v5.0/";
        AFAdRevenueData = "https://%sonelink.%s/shortlink-sdk/v2";
        copy = (hashCode + 95) % 128;
    }

    public AFd1lSDK(AFd1kSDK aFd1kSDK, AFc1pSDK aFc1pSDK, AppsFlyerProperties appsFlyerProperties, AFe1ySDK aFe1ySDK, AFj1eSDK aFj1eSDK) {
        this.getMonetizationNetwork = aFd1kSDK;
        this.getMediationNetwork = aFc1pSDK;
        this.getCurrencyIso4217Code = appsFlyerProperties;
        this.component4 = aFe1ySDK;
        this.component2 = aFj1eSDK;
    }

    private static void a(String str, String str2, int[] iArr, int i10, Object[] objArr) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            $10 = ($11 + 93) % 128;
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            $11 = ($10 + 3) % 128;
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1iSDK aFk1iSDK = new AFk1iSDK();
        char[] cArr2 = component1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i11 = 0; i11 < length; i11++) {
                cArr3[i11] = (char) (((long) cArr2[i11]) ^ 1825820251896122634L);
            }
            cArr2 = cArr3;
        }
        int i12 = (int) (1825820251896122634L ^ ((long) component3));
        if (toString) {
            int length2 = bArr.length;
            aFk1iSDK.getCurrencyIso4217Code = length2;
            char[] cArr4 = new char[length2];
            aFk1iSDK.getMediationNetwork = 0;
            while (true) {
                int i13 = aFk1iSDK.getMediationNetwork;
                int i14 = aFk1iSDK.getCurrencyIso4217Code;
                if (i13 >= i14) {
                    String str3 = new String(cArr4);
                    $11 = ($10 + 13) % 128;
                    objArr[0] = str3;
                    return;
                }
                cArr4[i13] = (char) (cArr2[bArr[(i14 - 1) - i13] + i10] - i12);
                aFk1iSDK.getMediationNetwork = i13 + 1;
            }
        } else if (!areAllFieldsValid) {
            int length3 = iArr.length;
            aFk1iSDK.getCurrencyIso4217Code = length3;
            char[] cArr5 = new char[length3];
            aFk1iSDK.getMediationNetwork = 0;
            while (true) {
                int i15 = aFk1iSDK.getMediationNetwork;
                int i16 = aFk1iSDK.getCurrencyIso4217Code;
                if (i15 >= i16) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                int i17 = $11 + 67;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    cArr5[i15] = (char) (cArr2[iArr[i16 * i15] + i10] >>> i12);
                } else {
                    cArr5[i15] = (char) (cArr2[iArr[(i16 - 1) - i15] - i10] - i12);
                    i15++;
                }
                aFk1iSDK.getMediationNetwork = i15;
            }
        } else {
            $11 = ($10 + 37) % 128;
            int length4 = cArr.length;
            aFk1iSDK.getCurrencyIso4217Code = length4;
            char[] cArr6 = new char[length4];
            aFk1iSDK.getMediationNetwork = 0;
            while (true) {
                int i18 = aFk1iSDK.getMediationNetwork;
                int i19 = aFk1iSDK.getCurrencyIso4217Code;
                if (i18 >= i19) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i18] = (char) (cArr2[cArr[(i19 - 1) - i18] - i10] - i12);
                    aFk1iSDK.getMediationNetwork = i18 + 1;
                }
            }
        }
    }

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i10, int i11, int i12) throws UnsupportedEncodingException {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = (~(i13 | i14)) | (~(i14 | i12));
        int i16 = ~i12;
        int i17 = i16 | i10;
        int i18 = (i10 * 1773) + (i11 * (-885)) + ((i15 | (~(i17 | i11))) * 886) + ((i10 | (~(i11 | i16))) * (-1772)) + ((~i17) * 886);
        if (i18 == 1) {
            return getRevenue(objArr);
        }
        if (i18 == 2) {
            return getCurrencyIso4217Code(objArr);
        }
        AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        UUID uuid = (UUID) objArr[3];
        String str3 = (String) objArr[4];
        String string = uuid.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(AFAdRevenueData, AppsFlyerLib.getInstance().getHostPrefix(), AFa1uSDK.getMonetizationNetwork().getHostName()));
        sb2.append("/");
        sb2.append(str);
        sb2.append("?id=");
        sb2.append(str2);
        String string2 = sb2.toString();
        Map<String, Object> mapAFAdRevenueData = aFd1lSDK.AFAdRevenueData();
        String strValueOf = String.valueOf(mapAFAdRevenueData.get("build_number"));
        HashMap map = new HashMap();
        map.put("Af-UUID", uuid.toString());
        map.put("Af-Meta-Sdk-Ver", strValueOf);
        map.put("Af-Meta-Counter", String.valueOf(mapAFAdRevenueData.get("counter")));
        map.put("Af-Meta-Model", String.valueOf(mapAFAdRevenueData.get("model")));
        map.put("Af-Meta-Platform", String.valueOf(mapAFAdRevenueData.get("platformextension")));
        map.put("Af-Meta-System-Version", String.valueOf(mapAFAdRevenueData.get("sdk")));
        Object[] objArr2 = new Object[1];
        a(null, "\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, 126 - MotionEvent.axisFromString(""), objArr2);
        map.put(((String) objArr2[0]).intern(), getMediationNetwork(str3, string, "GET", string, str, str2, strValueOf));
        AFd1jSDK aFd1jSDK = (AFd1jSDK) getRevenue(new Object[]{aFd1lSDK, new AFd1dSDK(string2, null, "GET", map, false), new AFd1bSDK()}, 865808376, -865808374, System.identityHashCode(aFd1lSDK));
        hashCode = (copy + 57) % 128;
        return aFd1jSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070 A[PHI: r11
  0x0070: PHI (r11v9 com.appsflyer.internal.AFj1eSDK) = (r11v8 com.appsflyer.internal.AFj1eSDK), (r11v16 com.appsflyer.internal.AFj1eSDK) binds: [B:14:0x006e, B:11:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079 A[PHI: r11
  0x0079: PHI (r11v15 com.appsflyer.internal.AFj1eSDK) = 
  (r11v8 com.appsflyer.internal.AFj1eSDK)
  (r11v9 com.appsflyer.internal.AFj1eSDK)
  (r11v16 com.appsflyer.internal.AFj1eSDK)
 binds: [B:14:0x006e, B:16:0x0074, B:11:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.appsflyer.internal.AFd1jSDK<java.lang.String> AFAdRevenueData(java.util.Map<java.lang.String, java.lang.Object> r11, java.lang.String r12, @androidx.annotation.Nullable java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1lSDK.AFAdRevenueData(java.util.Map, java.lang.String, java.lang.String):com.appsflyer.internal.AFd1jSDK");
    }

    @Nullable
    public final AFd1jSDK<String> getCurrencyIso4217Code(Map<String, Object> map, String str) {
        int i10 = copy + 47;
        hashCode = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                try {
                    Object[] objArr = {map, str};
                    Map map2 = AFa1jSDK.unregisterClient;
                    Object method = map2.get(203186425);
                    if (method == null) {
                        method = ((Class) AFa1jSDK.AFAdRevenueData(196 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (TextUtils.indexOf("", "", 0) + 29636), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 36)).getMethod("getRevenue", Map.class, String.class);
                        map2.put(203186425, method);
                    }
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            try {
                Object[] objArr2 = {map, str};
                Map map3 = AFa1jSDK.unregisterClient;
                Object method2 = map3.get(203186425);
                if (method2 == null) {
                    method2 = ((Class) AFa1jSDK.AFAdRevenueData(Color.rgb(0, 0, 0) + 16777412, (char) (29636 - TextUtils.getOffsetAfter("", 0)), 38 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).getMethod("getRevenue", Map.class, String.class);
                    map3.put(203186425, method2);
                }
                byte[] bArr = (byte[]) ((Method) method2).invoke(null, objArr2);
                AFj1eSDK aFj1eSDK = this.component2;
                AFd1jSDK<String> aFd1jSDK = (AFd1jSDK) getRevenue(new Object[]{this, new AFd1dSDK(aFj1eSDK.getRevenue(aFj1eSDK.getMonetizationNetwork.getCurrencyIso4217Code("https://%svalidate-and-log.%s/api/v4.0/android/subscription/validateAndLog?app_id=")), bArr, "POST", Collections.EMPTY_MAP, true), new AFd1cSDK()}, 865808376, -865808374, System.identityHashCode(this));
                int i11 = hashCode + 25;
                copy = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 17 / 0;
                }
                return aFd1jSDK;
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th3;
            }
        } catch (Throwable th4) {
            AFLogger.INSTANCE.e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th4, false, false);
            return null;
        }
        AFLogger.INSTANCE.e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th4, false, false);
        return null;
    }

    public final AFd1jSDK<String> getMediationNetwork(@NonNull String str, @NonNull Map<String, String> map, @Nullable String str2, @NonNull UUID uuid, @NonNull String str3) throws UnsupportedEncodingException {
        String string = uuid.toString();
        HashMap map2 = new HashMap();
        map2.put("ttl", X1.f42014f);
        map2.put(CommonUrlParts.UUID, string);
        map2.put("data", map);
        map2.put(Constants.REFERRER_API_META, AFAdRevenueData());
        if (str2 != null) {
            int i10 = copy + 29;
            hashCode = i10 % 128;
            if (i10 % 2 != 0) {
                map2.put("brand_domain", str2);
                throw null;
            }
            map2.put("brand_domain", str2);
        }
        String string2 = AFg1hSDK.getCurrencyIso4217Code(map2).toString();
        HashMap map3 = new HashMap();
        Object[] objArr = new Object[1];
        a(null, "\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", null, 128 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        map3.put(((String) objArr[0]).intern(), getMediationNetwork(str3, string, "POST", string2));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(AFAdRevenueData, AppsFlyerLib.getInstance().getHostPrefix(), AFa1uSDK.getMonetizationNetwork().getHostName()));
        sb2.append("/");
        sb2.append(str);
        AFd1jSDK<String> mediationNetwork = getMediationNetwork(new AFd1dSDK(sb2.toString(), string2.getBytes(Charset.defaultCharset()), "POST", map3, false), (AFe1vSDK) new AFd1cSDK(), true);
        hashCode = (copy + 95) % 128;
        return mediationNetwork;
    }

    @NonNull
    public final AFd1jSDK<AFi1wSDK> getMonetizationNetwork(boolean z10, boolean z11, @NonNull String str, int i10) {
        String str2;
        String str3;
        int i11 = hashCode + 107;
        copy = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            throw null;
        }
        AFe1ySDK aFe1ySDK = this.component4;
        Intrinsics.checkNotNullParameter(str, "");
        String str4 = z10 ? AFe1ySDK.getMonetizationNetwork : AFe1ySDK.getRevenue;
        if (z11) {
            copy = (hashCode + 93) % 128;
            str2 = "stg";
        } else {
            str2 = "";
        }
        a1 a1Var = a1.f93282a;
        if (AFe1ySDK.getRevenue()) {
            copy = (hashCode + 53) % 128;
            str3 = (String) aFe1ySDK.getCurrencyIso4217Code.getValue();
        } else {
            str3 = "";
        }
        String str5 = String.format(str4, Arrays.copyOf(new Object[]{str3, str2, aFe1ySDK.getCurrencyIso4217Code(), str}, 4));
        Intrinsics.checkNotNullExpressionValue(str5, "");
        AFd1dSDK aFd1dSDK = new AFd1dSDK(str5, "GET");
        aFd1dSDK.component3 = 1500;
        return (AFd1jSDK) getRevenue(new Object[]{this, aFd1dSDK, new AFd1eSDK()}, 865808376, -865808374, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
        AFd1dSDK aFd1dSDK = (AFd1dSDK) objArr[1];
        AFe1vSDK aFe1vSDK = (AFe1vSDK) objArr[2];
        copy = (hashCode + 83) % 128;
        AFd1jSDK mediationNetwork = aFd1lSDK.getMediationNetwork(aFd1dSDK, aFe1vSDK, aFd1lSDK.getMonetizationNetwork());
        int i10 = hashCode + 123;
        copy = i10 % 128;
        if (i10 % 2 != 0) {
            return mediationNetwork;
        }
        throw null;
    }

    private boolean getMonetizationNetwork() {
        hashCode = (copy + 99) % 128;
        if (this.getCurrencyIso4217Code.getBoolean(AppsFlyerProperties.HTTP_CACHE, true)) {
            return false;
        }
        hashCode = (copy + 29) % 128;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.appsflyer.internal.AFd1jSDK<java.lang.String> AFAdRevenueData(com.appsflyer.internal.AFh1jSDK r20, java.lang.String r21, com.appsflyer.internal.AFc1gSDK r22) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1lSDK.AFAdRevenueData(com.appsflyer.internal.AFh1jSDK, java.lang.String, com.appsflyer.internal.AFc1gSDK):com.appsflyer.internal.AFd1jSDK");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c7, code lost:
    
        if (r1 == null) goto L27;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.appsflyer.internal.AFd1oSDK getMediationNetwork(java.util.Map<java.lang.String, java.lang.Object> r17, java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1lSDK.getMediationNetwork(java.util.Map, java.lang.String):com.appsflyer.internal.AFd1oSDK");
    }

    @NonNull
    public final AFd1jSDK<DdlResponse> getMonetizationNetwork(AFa1pSDK aFa1pSDK) {
        AFd1jSDK<DdlResponse> aFd1jSDK = (AFd1jSDK) getRevenue(new Object[]{this, new AFd1dSDK(aFa1pSDK.component3, AFg1hSDK.getCurrencyIso4217Code(aFa1pSDK.getCurrencyIso4217Code).toString().getBytes(Charset.defaultCharset()), "POST", Collections.EMPTY_MAP, aFa1pSDK.getRevenue()), new AFa1qSDK()}, 865808376, -865808374, System.identityHashCode(this));
        hashCode = (copy + 61) % 128;
        return aFd1jSDK;
    }

    private <T> AFd1jSDK<T> getCurrencyIso4217Code(AFd1dSDK aFd1dSDK, AFe1vSDK<T> aFe1vSDK) {
        return (AFd1jSDK) getRevenue(new Object[]{this, aFd1dSDK, aFe1vSDK}, 865808376, -865808374, System.identityHashCode(this));
    }

    @Nullable
    public final AFd1jSDK<String> getRevenue(Map<String, Object> map, String str, @Nullable String str2) {
        String currencyIso4217Code;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1jSDK.unregisterClient;
            Object method = map2.get(203186425);
            if (method == null) {
                method = ((Class) AFa1jSDK.AFAdRevenueData((Process.myPid() >> 22) + 196, (char) (KeyEvent.getDeadChar(0, 0) + 29636), 37 - Color.red(0))).getMethod("getRevenue", Map.class, String.class);
                map2.put(203186425, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
            copy = (hashCode + 75) % 128;
            AFj1eSDK aFj1eSDK = this.component2;
            if (!(str2 == null || str2.length() == 0 || new Regex("4.?(\\d+)?.?(\\d+)").g(str2) || new Regex("3.?(\\d+)?.?(\\d+)").g(str2))) {
                currencyIso4217Code = aFj1eSDK.getMonetizationNetwork.getCurrencyIso4217Code("https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=");
                hashCode = (copy + 37) % 128;
            } else {
                hashCode = (copy + 49) % 128;
                currencyIso4217Code = aFj1eSDK.getMonetizationNetwork.getCurrencyIso4217Code("https://%sviap.%s/api/v1/android/validate_purchase?app_id=");
            }
            return (AFd1jSDK) getRevenue(new Object[]{this, new AFd1dSDK(aFj1eSDK.getMonetizationNetwork(aFj1eSDK.getRevenue(currencyIso4217Code), false), bArr, "POST", Collections.EMPTY_MAP, true), new AFd1cSDK()}, 865808376, -865808374, System.identityHashCode(this));
        } catch (Throwable th2) {
            try {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            } catch (Throwable th3) {
                AFLogger.INSTANCE.e(AFg1cSDK.ENGAGEMENT, "AFFinalizer: reflection init failed.", th3, false, false);
                return null;
            }
        }
    }

    private static String getMediationNetwork(String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String strJoin = TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0]));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append("v2");
        String revenue = AFj1bSDK.getRevenue(strJoin, sb2.toString());
        int i10 = copy + 89;
        hashCode = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 72 / 0;
        }
        return revenue;
    }

    private <T> AFd1jSDK<T> getMediationNetwork(AFd1dSDK aFd1dSDK, AFe1vSDK<T> aFe1vSDK, boolean z10) {
        aFd1dSDK.getMediationNetwork = z10;
        AFd1kSDK aFd1kSDK = this.getMonetizationNetwork;
        AFd1jSDK<T> aFd1jSDK = new AFd1jSDK<>(aFd1dSDK, aFd1kSDK.getMediationNetwork, aFd1kSDK.getRevenue, aFe1vSDK);
        int i10 = hashCode + 57;
        copy = i10 % 128;
        if (i10 % 2 != 0) {
            return aFd1jSDK;
        }
        throw null;
    }

    @Nullable
    public final AFd1jSDK<String> getRevenue(Map<String, Object> map, String str) {
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1jSDK.unregisterClient;
            Object method = map2.get(203186425);
            if (method == null) {
                method = ((Class) AFa1jSDK.AFAdRevenueData((Process.myTid() >> 22) + 196, (char) (TextUtils.lastIndexOf("", '0', 0) + 29637), View.resolveSizeAndState(0, 0, 0) + 37)).getMethod("getRevenue", Map.class, String.class);
                map2.put(203186425, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
            hashCode = (copy + 35) % 128;
            AFj1eSDK aFj1eSDK = this.component2;
            AFd1jSDK<String> aFd1jSDK = (AFd1jSDK) getRevenue(new Object[]{this, new AFd1dSDK(aFj1eSDK.getRevenue(aFj1eSDK.getMonetizationNetwork.getCurrencyIso4217Code("https://%svalidate-and-log.%s/api/v4.0/android/one_time_purchase/validateAndLog?app_id=")), bArr, "POST", Collections.EMPTY_MAP, true), new AFd1cSDK()}, 865808376, -865808374, System.identityHashCode(this));
            copy = (hashCode + 69) % 128;
            return aFd1jSDK;
        } catch (Throwable th2) {
            try {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            } catch (Throwable th3) {
                AFLogger.INSTANCE.e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th3, false, false);
                return null;
            }
        }
    }

    static void getMediationNetwork() {
        component1 = new char[]{36301, 36326, 36281, 36307, 36325, 36327, 36350, 36333, 36336, 36337, 36338, 36321, 36322, 36320};
        component3 = 1912311180;
        areAllFieldsValid = true;
        toString = true;
    }

    public final AFd1jSDK<Map<String, String>> getMediationNetwork(@NonNull String str, @NonNull String str2, @NonNull UUID uuid, @NonNull String str3) {
        return (AFd1jSDK) getRevenue(new Object[]{this, str, str2, uuid, str3}, 1826287225, -1826287225, System.identityHashCode(this));
    }

    public final AFd1jSDK<Map<String, Object>> getMediationNetwork(String str, String str2) {
        return (AFd1jSDK) getRevenue(new Object[]{this, str, str2}, 2067226218, -2067226217, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFd1lSDK aFd1lSDK = (AFd1lSDK) objArr[0];
        AFd1jSDK aFd1jSDK = (AFd1jSDK) getRevenue(new Object[]{aFd1lSDK, AFd1hSDK.AFAdRevenueData(aFd1lSDK.getMediationNetwork.getRevenue.getRevenue.getPackageName(), AFb1jSDK.getRevenue(aFd1lSDK.getMediationNetwork.getMonetizationNetwork), (String) objArr[1], (String) objArr[2]), new AFd1iSDK()}, 865808376, -865808374, System.identityHashCode(aFd1lSDK));
        int i10 = hashCode + 85;
        copy = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 21 / 0;
        }
        return aFd1jSDK;
    }

    public final AFd1jSDK<String> getRevenue(AFh1gSDK aFh1gSDK) {
        AFd1jSDK<String> aFd1jSDK = (AFd1jSDK) getRevenue(new Object[]{this, new AFd1dSDK(aFh1gSDK.component3, aFh1gSDK.AFAdRevenueData(), "POST", Collections.EMPTY_MAP, true), new AFd1cSDK()}, 865808376, -865808374, System.identityHashCode(this));
        int i10 = copy + 117;
        hashCode = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 59 / 0;
        }
        return aFd1jSDK;
    }

    public final AFd1jSDK<String> AFAdRevenueData(@NonNull String str) {
        AFd1dSDK aFd1dSDK = new AFd1dSDK(str, null, "GET", Collections.EMPTY_MAP, false);
        aFd1dSDK.component3 = 10000;
        aFd1dSDK.getCurrencyIso4217Code = false;
        AFd1jSDK<String> aFd1jSDK = (AFd1jSDK) getRevenue(new Object[]{this, aFd1dSDK, new AFd1cSDK()}, 865808376, -865808374, System.identityHashCode(this));
        copy = (hashCode + 125) % 128;
        return aFd1jSDK;
    }

    @VisibleForTesting
    private Map<String, Object> AFAdRevenueData() throws UnsupportedEncodingException {
        HashMap map = new HashMap();
        map.put("build_number", "6.17.3");
        map.put("counter", Integer.valueOf(this.getMediationNetwork.getMonetizationNetwork.getMediationNetwork("appsFlyerCount", 0)));
        map.put("model", Build.MODEL);
        Object[] objArr = new Object[1];
        a(null, "\u008e\u0087\u0088\u008b\u008d", null, 126 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        map.put(CommonUrlParts.APP_VERSION, this.getMediationNetwork.n_().versionName);
        map.put("app_id", this.getMediationNetwork.getRevenue.getRevenue.getPackageName());
        map.put("platformextension", new AFa1ySDK().getMediationNetwork());
        copy = (hashCode + 13) % 128;
        return map;
    }
}
