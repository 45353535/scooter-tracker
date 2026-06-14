package com.appsflyer.internal;

import android.os.Build;
import android.view.ViewConfiguration;
import androidx.annotation.WorkerThread;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1xSDK;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class AFd1ySDK implements AFd1xSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long copy = -1417917781629150226L;
    private static int copydefault = 1;
    private static int equals;

    @NotNull
    private final Lazy AFAdRevenueData;

    @NotNull
    private final Lazy areAllFieldsValid;

    @NotNull
    private final String component1;

    @NotNull
    private final Lazy component2;

    @NotNull
    private final Lazy component3;

    @Nullable
    private AFd1xSDK.AFa1ySDK component4;

    @NotNull
    private final Lazy getCurrencyIso4217Code;

    @NotNull
    private final Lazy getMediationNetwork;

    @NotNull
    private final Lazy getMonetizationNetwork;

    @NotNull
    private AFc1bSDK getRevenue;

    public AFd1ySDK(@NotNull AFc1bSDK aFc1bSDK) {
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        this.getRevenue = aFc1bSDK;
        this.getCurrencyIso4217Code = lf.i.a(new Function0<AFf1lSDK>() { // from class: com.appsflyer.internal.AFd1ySDK.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AFf1lSDK invoke() {
                AFf1lSDK aFf1lSDKComponent1 = AFd1ySDK.getMonetizationNetwork(AFd1ySDK.this).component1();
                Intrinsics.checkNotNullExpressionValue(aFf1lSDKComponent1, "");
                return aFf1lSDKComponent1;
            }
        });
        this.getMediationNetwork = lf.i.a(new Function0<AFc1pSDK>() { // from class: com.appsflyer.internal.AFd1ySDK.5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
            public final AFc1pSDK invoke() {
                AFc1pSDK currencyIso4217Code = AFd1ySDK.getMonetizationNetwork(AFd1ySDK.this).getCurrencyIso4217Code();
                Intrinsics.checkNotNullExpressionValue(currencyIso4217Code, "");
                return currencyIso4217Code;
            }
        });
        this.getMonetizationNetwork = lf.i.a(new Function0<AFc1oSDK>() { // from class: com.appsflyer.internal.AFd1ySDK.3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
            public final AFc1oSDK invoke() {
                AFc1oSDK aFc1oSDKComponent2 = AFd1ySDK.getMonetizationNetwork(AFd1ySDK.this).component2();
                Intrinsics.checkNotNullExpressionValue(aFc1oSDKComponent2, "");
                return aFc1oSDKComponent2;
            }
        });
        this.AFAdRevenueData = lf.i.a(new Function0<AFf1cSDK>() { // from class: com.appsflyer.internal.AFd1ySDK.9
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final AFf1cSDK invoke() {
                AFf1cSDK aFf1cSDKAFKeystoreWrapper = AFd1ySDK.getMonetizationNetwork(AFd1ySDK.this).AFKeystoreWrapper();
                Intrinsics.checkNotNullExpressionValue(aFf1cSDKAFKeystoreWrapper, "");
                return aFf1cSDKAFKeystoreWrapper;
            }
        });
        this.component2 = lf.i.a(new Function0<ExecutorService>() { // from class: com.appsflyer.internal.AFd1ySDK.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final ExecutorService invoke() {
                ExecutorService mediationNetwork = AFd1ySDK.getMonetizationNetwork(AFd1ySDK.this).getMediationNetwork();
                Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
                return mediationNetwork;
            }
        });
        this.component1 = "6.17.3";
        this.areAllFieldsValid = lf.i.a(new Function0<AFd1uSDK>() { // from class: com.appsflyer.internal.AFd1ySDK.4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final AFd1uSDK invoke() {
                AFc1gSDK aFc1gSDKRegisterClient = AFd1ySDK.getMonetizationNetwork(AFd1ySDK.this).registerClient();
                Intrinsics.checkNotNullExpressionValue(aFc1gSDKRegisterClient, "");
                return new AFd1uSDK(aFc1gSDKRegisterClient);
            }
        });
        this.component3 = lf.i.a(new Function0<AFd1vSDK>() { // from class: com.appsflyer.internal.AFd1ySDK.6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final AFd1vSDK invoke() {
                return new AFd1vSDK(AFd1ySDK.this.AFAdRevenueData());
            }
        });
    }

    private final AFh1aSDK areAllFieldsValid() {
        AFi1zSDK aFi1zSDK;
        int i10 = copydefault + 53;
        equals = i10 % 128;
        if (i10 % 2 != 0) {
            AFi1wSDK aFi1wSDK = getMediationNetwork().AFAdRevenueData.AFAdRevenueData;
            throw null;
        }
        AFi1wSDK aFi1wSDK2 = getMediationNetwork().AFAdRevenueData.AFAdRevenueData;
        if (aFi1wSDK2 != null && (aFi1zSDK = aFi1wSDK2.getMonetizationNetwork) != null) {
            equals = (copydefault + 37) % 128;
            return aFi1zSDK.getCurrencyIso4217Code;
        }
        int i11 = copydefault + 79;
        equals = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private final AFf1cSDK component1() {
        equals = (copydefault + 17) % 128;
        AFf1cSDK aFf1cSDK = (AFf1cSDK) this.AFAdRevenueData.getValue();
        int i10 = copydefault + 113;
        equals = i10 % 128;
        if (i10 % 2 == 0) {
            return aFf1cSDK;
        }
        throw null;
    }

    @NotNull
    private AFd1wSDK component2() {
        int i10 = equals + 29;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            return (AFd1wSDK) this.component3.getValue();
        }
        throw null;
    }

    private final AFc1oSDK component3() {
        equals = (copydefault + 97) % 128;
        AFc1oSDK aFc1oSDK = (AFc1oSDK) this.getMonetizationNetwork.getValue();
        copydefault = (equals + 29) % 128;
        return aFc1oSDK;
    }

    private final ExecutorService component4() {
        return (ExecutorService) getRevenue(new Object[]{this}, -1221964614, 1221964616, System.identityHashCode(this));
    }

    private final void copy() {
        String mediationNetwork;
        int i10 = equals + 101;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            areAllFieldsValid();
            throw null;
        }
        AFh1aSDK aFh1aSDKAreAllFieldsValid = areAllFieldsValid();
        if (aFh1aSDKAreAllFieldsValid != null) {
            if (!AFAdRevenueData(aFh1aSDKAreAllFieldsValid)) {
                AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
                return;
            }
            int i11 = equals + 23;
            copydefault = i11 % 128;
            if (i11 % 2 == 0) {
                mediationNetwork = component1().getMediationNetwork();
                int i12 = 66 / 0;
                if (mediationNetwork == null) {
                    return;
                }
            } else {
                mediationNetwork = component1().getMediationNetwork();
                if (mediationNetwork == null) {
                    return;
                }
            }
            String string = new JSONObject((Map) getRevenue(new Object[]{getCurrencyIso4217Code(aFh1aSDKAreAllFieldsValid), AFAdRevenueData().getMediationNetwork()}, -1519321264, 1519321264, (int) System.currentTimeMillis())).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
            getRevenue(new Object[]{this, string, mediationNetwork}, -1047452469, 1047452473, System.identityHashCode(this));
        }
    }

    private final synchronized void copydefault() {
        boolean monetizationNetwork;
        try {
            AFh1aSDK aFh1aSDKAreAllFieldsValid = areAllFieldsValid();
            if (aFh1aSDKAreAllFieldsValid != null) {
                if (aFh1aSDKAreAllFieldsValid.getRevenue == -1) {
                    equals = (copydefault + 109) % 128;
                    component3().getCurrencyIso4217Code("af_send_exc_to_server_window");
                } else if (component3().getCurrencyIso4217Code("af_send_exc_to_server_window", -1L) == -1) {
                    getMediationNetwork(aFh1aSDKAreAllFieldsValid);
                }
                monetizationNetwork = getMonetizationNetwork(aFh1aSDKAreAllFieldsValid);
            } else {
                monetizationNetwork = false;
            }
            AFd1xSDK.AFa1ySDK aFa1ySDK = this.component4;
            if (aFa1ySDK != null) {
                int i10 = equals + 67;
                copydefault = i10 % 128;
                if (i10 % 2 != 0) {
                    aFa1ySDK.onConfigurationChanged(monetizationNetwork);
                } else {
                    aFa1ySDK.onConfigurationChanged(monetizationNetwork);
                    throw null;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #2 {all -> 0x0017, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0014, B:11:0x001c, B:13:0x002a, B:16:0x0048, B:18:0x004f, B:20:0x0056, B:22:0x0065, B:24:0x0069, B:26:0x007b, B:28:0x0086, B:33:0x009b, B:35:0x00a6, B:44:0x00b7, B:46:0x00bd, B:48:0x00c3, B:50:0x00d1, B:52:0x00d7, B:54:0x00dd, B:56:0x00eb, B:58:0x00f9, B:60:0x00ff, B:62:0x0105, B:64:0x010b, B:66:0x010e, B:68:0x0114, B:70:0x011a, B:72:0x011e, B:74:0x0124, B:76:0x012a, B:78:0x012e, B:80:0x0139, B:85:0x0142, B:86:0x0143, B:92:0x0152, B:99:0x01bd, B:101:0x01c1, B:103:0x01c7, B:104:0x01cb, B:94:0x0162, B:96:0x0180, B:97:0x019c, B:89:0x014a, B:41:0x00b0, B:42:0x00b1, B:31:0x0091, B:98:0x01ad, B:109:0x01d2, B:112:0x01d7, B:82:0x013f, B:110:0x01d5, B:37:0x00ab), top: B:119:0x0001, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1 A[Catch: all -> 0x0017, TryCatch #2 {all -> 0x0017, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0014, B:11:0x001c, B:13:0x002a, B:16:0x0048, B:18:0x004f, B:20:0x0056, B:22:0x0065, B:24:0x0069, B:26:0x007b, B:28:0x0086, B:33:0x009b, B:35:0x00a6, B:44:0x00b7, B:46:0x00bd, B:48:0x00c3, B:50:0x00d1, B:52:0x00d7, B:54:0x00dd, B:56:0x00eb, B:58:0x00f9, B:60:0x00ff, B:62:0x0105, B:64:0x010b, B:66:0x010e, B:68:0x0114, B:70:0x011a, B:72:0x011e, B:74:0x0124, B:76:0x012a, B:78:0x012e, B:80:0x0139, B:85:0x0142, B:86:0x0143, B:92:0x0152, B:99:0x01bd, B:101:0x01c1, B:103:0x01c7, B:104:0x01cb, B:94:0x0162, B:96:0x0180, B:97:0x019c, B:89:0x014a, B:41:0x00b0, B:42:0x00b1, B:31:0x0091, B:98:0x01ad, B:109:0x01d2, B:112:0x01d7, B:82:0x013f, B:110:0x01d5, B:37:0x00ab), top: B:119:0x0001, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7 A[Catch: all -> 0x0017, PHI: r4
  0x00b7: PHI (r4v16 java.lang.String) = (r4v15 java.lang.String), (r4v19 java.lang.String) binds: [B:43:0x00b5, B:38:0x00ac] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x0017, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0014, B:11:0x001c, B:13:0x002a, B:16:0x0048, B:18:0x004f, B:20:0x0056, B:22:0x0065, B:24:0x0069, B:26:0x007b, B:28:0x0086, B:33:0x009b, B:35:0x00a6, B:44:0x00b7, B:46:0x00bd, B:48:0x00c3, B:50:0x00d1, B:52:0x00d7, B:54:0x00dd, B:56:0x00eb, B:58:0x00f9, B:60:0x00ff, B:62:0x0105, B:64:0x010b, B:66:0x010e, B:68:0x0114, B:70:0x011a, B:72:0x011e, B:74:0x0124, B:76:0x012a, B:78:0x012e, B:80:0x0139, B:85:0x0142, B:86:0x0143, B:92:0x0152, B:99:0x01bd, B:101:0x01c1, B:103:0x01c7, B:104:0x01cb, B:94:0x0162, B:96:0x0180, B:97:0x019c, B:89:0x014a, B:41:0x00b0, B:42:0x00b1, B:31:0x0091, B:98:0x01ad, B:109:0x01d2, B:112:0x01d7, B:82:0x013f, B:110:0x01d5, B:37:0x00ab), top: B:119:0x0001, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1 A[Catch: all -> 0x0017, TryCatch #2 {all -> 0x0017, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0014, B:11:0x001c, B:13:0x002a, B:16:0x0048, B:18:0x004f, B:20:0x0056, B:22:0x0065, B:24:0x0069, B:26:0x007b, B:28:0x0086, B:33:0x009b, B:35:0x00a6, B:44:0x00b7, B:46:0x00bd, B:48:0x00c3, B:50:0x00d1, B:52:0x00d7, B:54:0x00dd, B:56:0x00eb, B:58:0x00f9, B:60:0x00ff, B:62:0x0105, B:64:0x010b, B:66:0x010e, B:68:0x0114, B:70:0x011a, B:72:0x011e, B:74:0x0124, B:76:0x012a, B:78:0x012e, B:80:0x0139, B:85:0x0142, B:86:0x0143, B:92:0x0152, B:99:0x01bd, B:101:0x01c1, B:103:0x01c7, B:104:0x01cb, B:94:0x0162, B:96:0x0180, B:97:0x019c, B:89:0x014a, B:41:0x00b0, B:42:0x00b1, B:31:0x0091, B:98:0x01ad, B:109:0x01d2, B:112:0x01d7, B:82:0x013f, B:110:0x01d5, B:37:0x00ab), top: B:119:0x0001, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void equals() {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1ySDK.equals():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFd1ySDK aFd1ySDK) {
        equals = (copydefault + 119) % 128;
        Intrinsics.checkNotNullParameter(aFd1ySDK, "");
        aFd1ySDK.copy();
        equals = (copydefault + 11) % 128;
    }

    private final AFf1lSDK getMediationNetwork() {
        AFf1lSDK aFf1lSDK;
        int i10 = copydefault + 121;
        equals = i10 % 128;
        if (i10 % 2 != 0) {
            aFf1lSDK = (AFf1lSDK) this.getCurrencyIso4217Code.getValue();
            int i11 = 71 / 0;
        } else {
            aFf1lSDK = (AFf1lSDK) this.getCurrencyIso4217Code.getValue();
        }
        equals = (copydefault + 31) % 128;
        return aFf1lSDK;
    }

    public static final /* synthetic */ AFc1bSDK getMonetizationNetwork(AFd1ySDK aFd1ySDK) {
        int i10 = copydefault;
        equals = (i10 + 19) % 128;
        AFc1bSDK aFc1bSDK = aFd1ySDK.getRevenue;
        equals = (i10 + 97) % 128;
        return aFc1bSDK;
    }

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i10 * (-464)) + (i11 * (-929));
        int i14 = ~i10;
        int i15 = i11 | i12;
        int i16 = i13 + (((~i15) | i14) * (-465)) + ((i11 | (~(i12 | i14))) * 930) + ((i14 | i15) * 465);
        if (i16 == 1) {
            final AFd1ySDK aFd1ySDK = (AFd1ySDK) objArr[0];
            AFd1xSDK.AFa1ySDK aFa1ySDK = (AFd1xSDK.AFa1ySDK) objArr[1];
            copydefault = (equals + 57) % 128;
            aFd1ySDK.component4 = aFa1ySDK;
            ((ExecutorService) getRevenue(new Object[]{aFd1ySDK}, -1221964614, 1221964616, System.identityHashCode(aFd1ySDK))).execute(new Runnable() { // from class: com.appsflyer.internal.r
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1ySDK.getMediationNetwork(this.f15656b);
                }
            });
            copydefault = (equals + 61) % 128;
            return null;
        }
        if (i16 == 2) {
            return getMediationNetwork(objArr);
        }
        if (i16 == 3) {
            return AFAdRevenueData(objArr);
        }
        if (i16 == 4) {
            return getCurrencyIso4217Code(objArr);
        }
        Map map = (Map) objArr[0];
        List list = (List) objArr[1];
        equals = (copydefault + 47) % 128;
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to("deviceInfo", map), TuplesKt.to("excs", AFd1tSDK.AFAdRevenueData(list)));
        copydefault = (equals + 11) % 128;
        return mapMapOf;
    }

    @NotNull
    public final AFd1zSDK AFAdRevenueData() {
        equals = (copydefault + 119) % 128;
        AFd1zSDK aFd1zSDK = (AFd1zSDK) this.areAllFieldsValid.getValue();
        int i10 = equals + 95;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            return aFd1zSDK;
        }
        throw null;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        final AFd1ySDK aFd1ySDK = (AFd1ySDK) objArr[0];
        final Throwable th2 = (Throwable) objArr[1];
        final String str = (String) objArr[2];
        int i10 = equals + 121;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(th2, "");
            Intrinsics.checkNotNullParameter(str, "");
            ((ExecutorService) getRevenue(new Object[]{aFd1ySDK}, -1221964614, 1221964616, System.identityHashCode(aFd1ySDK))).execute(new Runnable() { // from class: com.appsflyer.internal.s
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1ySDK.getMediationNetwork(this.f15657b, th2, str);
                }
            });
            return null;
        }
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) getRevenue(new Object[]{aFd1ySDK}, -1221964614, 1221964616, System.identityHashCode(aFd1ySDK))).execute(new Runnable() { // from class: com.appsflyer.internal.s
            @Override // java.lang.Runnable
            public final void run() {
                AFd1ySDK.getMediationNetwork(this.f15657b, th2, str);
            }
        });
        throw null;
    }

    private static void a(String str, int i10, Object[] objArr) {
        Object charArray = str;
        if (str != null) {
            $11 = ($10 + 37) % 128;
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1lSDK aFk1lSDK = new AFk1lSDK();
        aFk1lSDK.getMonetizationNetwork = i10;
        int length = cArr.length;
        long[] jArr = new long[length];
        aFk1lSDK.getRevenue = 0;
        while (true) {
            int i11 = aFk1lSDK.getRevenue;
            if (i11 >= cArr.length) {
                break;
            }
            $11 = ($10 + 29) % 128;
            jArr[i11] = (((long) cArr[i11]) ^ (((long) i11) * ((long) aFk1lSDK.getMonetizationNetwork))) ^ (copy ^ (-2523060390901184290L));
            aFk1lSDK.getRevenue = i11 + 1;
        }
        char[] cArr2 = new char[length];
        aFk1lSDK.getRevenue = 0;
        while (true) {
            int i12 = aFk1lSDK.getRevenue;
            if (i12 >= cArr.length) {
                break;
            }
            $11 = ($10 + 77) % 128;
            cArr2[i12] = (char) jArr[i12];
            aFk1lSDK.getRevenue = i12 + 1;
        }
        String str2 = new String(cArr2);
        int i13 = $11 + 87;
        $10 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFd1ySDK aFd1ySDK = (AFd1ySDK) objArr[0];
        equals = (copydefault + 39) % 128;
        ExecutorService executorService = (ExecutorService) aFd1ySDK.component2.getValue();
        int i10 = copydefault + 45;
        equals = i10 % 128;
        if (i10 % 2 == 0) {
            return executorService;
        }
        throw null;
    }

    private final AFc1pSDK getMonetizationNetwork() {
        AFc1pSDK aFc1pSDK;
        int i10 = copydefault + 49;
        equals = i10 % 128;
        if (i10 % 2 != 0) {
            aFc1pSDK = (AFc1pSDK) this.getMediationNetwork.getValue();
            int i11 = 51 / 0;
        } else {
            aFc1pSDK = (AFc1pSDK) this.getMediationNetwork.getValue();
        }
        int i12 = equals + 63;
        copydefault = i12 % 128;
        if (i12 % 2 != 0) {
            return aFc1pSDK;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1ySDK aFd1ySDK, Throwable th2, String str) {
        copydefault = (equals + 67) % 128;
        Intrinsics.checkNotNullParameter(aFd1ySDK, "");
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFh1aSDK aFh1aSDKAreAllFieldsValid = aFd1ySDK.areAllFieldsValid();
        boolean z10 = false;
        if (aFh1aSDKAreAllFieldsValid != null && aFd1ySDK.getMonetizationNetwork(aFh1aSDKAreAllFieldsValid)) {
            z10 = true;
        }
        if (z10) {
            copydefault = (equals + 33) % 128;
            aFd1ySDK.AFAdRevenueData().getRevenue(th2, str);
        }
    }

    private final boolean getMonetizationNetwork(AFh1aSDK aFh1aSDK) {
        int i10 = copydefault + 105;
        equals = i10 % 128;
        if (i10 % 2 == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long currencyIso4217Code = component3().getCurrencyIso4217Code("af_send_exc_to_server_window", -1L);
            if (aFh1aSDK.getMediationNetwork >= TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis)) {
                if (currencyIso4217Code == -1 || currencyIso4217Code < jCurrentTimeMillis) {
                    return false;
                }
                return getRevenue(aFh1aSDK);
            }
            int i11 = equals + 123;
            copydefault = i11 % 128;
            if (i11 % 2 != 0) {
                return false;
            }
            throw null;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        component3().getCurrencyIso4217Code("af_send_exc_to_server_window", -1L);
        long j10 = aFh1aSDK.getMediationNetwork;
        TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis2);
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getCurrencyIso4217Code() {
        int i10 = copydefault + 51;
        equals = i10 % 128;
        if (i10 % 2 == 0) {
            ((ExecutorService) getRevenue(new Object[]{this}, -1221964614, 1221964616, System.identityHashCode(this))).execute(new Runnable() { // from class: com.appsflyer.internal.t
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1ySDK.getCurrencyIso4217Code(this.f15660b);
                }
            });
            equals = (copydefault + 113) % 128;
        } else {
            ((ExecutorService) getRevenue(new Object[]{this}, -1221964614, 1221964616, System.identityHashCode(this))).execute(new Runnable() { // from class: com.appsflyer.internal.t
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1ySDK.getCurrencyIso4217Code(this.f15660b);
                }
            });
            throw null;
        }
    }

    private final boolean AFAdRevenueData(AFh1aSDK aFh1aSDK) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long currencyIso4217Code = component3().getCurrencyIso4217Code("af_send_exc_to_server_window", -1L);
        if (aFh1aSDK.getMediationNetwork >= TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis) && currencyIso4217Code != -1) {
            int i10 = copydefault + 51;
            equals = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            if (currencyIso4217Code >= jCurrentTimeMillis) {
                int mediationNetwork = component3().getMediationNetwork("af_send_exc_min", -1);
                if (mediationNetwork != -1 && AFAdRevenueData().AFAdRevenueData() >= mediationNetwork) {
                    return getRevenue(aFh1aSDK);
                }
                int i11 = copydefault + 103;
                equals = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 15 / 0;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1ySDK aFd1ySDK) {
        int i10 = copydefault + 121;
        equals = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFd1ySDK, "");
            aFd1ySDK.equals();
        } else {
            Intrinsics.checkNotNullParameter(aFd1ySDK, "");
            aFd1ySDK.equals();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFd1ySDK aFd1ySDK) {
        int i10 = equals + 85;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFd1ySDK, "");
            aFd1ySDK.copydefault();
        } else {
            Intrinsics.checkNotNullParameter(aFd1ySDK, "");
            aFd1ySDK.copydefault();
            throw null;
        }
    }

    private final Map<String, String> getCurrencyIso4217Code(AFh1aSDK aFh1aSDK) {
        Object[] objArr = new Object[1];
        a("퍒䪹\ue0a7ắ뒸", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 39419, objArr);
        Map<String, String> mapMapOf = MapsKt.mapOf(TuplesKt.to(((String) objArr[0]).intern(), Build.BRAND), TuplesKt.to("model", Build.MODEL), TuplesKt.to("app_id", getMonetizationNetwork().getRevenue.getRevenue.getPackageName()), TuplesKt.to("p_ex", new AFa1ySDK().getMediationNetwork()), TuplesKt.to("api", String.valueOf(Build.VERSION.SDK_INT)), TuplesKt.to("sdk", this.component1), TuplesKt.to(com.taurusx.tax.g.e0.f66120c, AFb1jSDK.getRevenue(getMonetizationNetwork().getMonetizationNetwork)), TuplesKt.to("exc_config", aFh1aSDK.getMonetizationNetwork()));
        copydefault = (equals + 109) % 128;
        return mapMapOf;
    }

    private final void getMediationNetwork(AFh1aSDK aFh1aSDK) {
        int i10;
        long jCurrentTimeMillis;
        int i11 = equals + 93;
        copydefault = i11 % 128;
        if (i11 % 2 == 0) {
            i10 = aFh1aSDK.getCurrencyIso4217Code;
            jCurrentTimeMillis = System.currentTimeMillis() ^ TimeUnit.DAYS.toMillis(aFh1aSDK.getRevenue);
        } else {
            i10 = aFh1aSDK.getCurrencyIso4217Code;
            jCurrentTimeMillis = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(aFh1aSDK.getRevenue);
        }
        AFc1oSDK aFc1oSDKComponent3 = component3();
        aFc1oSDKComponent3.getRevenue("af_send_exc_to_server_window", jCurrentTimeMillis);
        aFc1oSDKComponent3.getRevenue("af_send_exc_min", i10);
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getRevenue() {
        int i10 = equals + 41;
        copydefault = i10 % 128;
        if (i10 % 2 == 0) {
            ((ExecutorService) getRevenue(new Object[]{this}, -1221964614, 1221964616, System.identityHashCode(this))).execute(new Runnable() { // from class: com.appsflyer.internal.q
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1ySDK.getRevenue(this.f15655b);
                }
            });
            int i11 = 23 / 0;
        } else {
            ((ExecutorService) getRevenue(new Object[]{this}, -1221964614, 1221964616, System.identityHashCode(this))).execute(new Runnable() { // from class: com.appsflyer.internal.q
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1ySDK.getRevenue(this.f15655b);
                }
            });
        }
        equals = (copydefault + 121) % 128;
    }

    @WorkerThread
    private final void AFAdRevenueData(String str, String str2) {
        getRevenue(new Object[]{this, str, str2}, -1047452469, 1047452473, System.identityHashCode(this));
    }

    private final boolean getRevenue(AFh1aSDK aFh1aSDK) {
        new AFd1sSDK();
        String str = this.component1;
        String str2 = aFh1aSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        boolean currencyIso4217Code = AFd1sSDK.getCurrencyIso4217Code(str, str2);
        int i10 = equals + 23;
        copydefault = i10 % 128;
        if (i10 % 2 != 0) {
            return currencyIso4217Code;
        }
        throw null;
    }

    private static Map<String, Object> getRevenue(Map<String, ? extends Object> map, List<ExceptionInfo> list) {
        return (Map) getRevenue(new Object[]{map, list}, -1519321264, 1519321264, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getRevenue(@NotNull Throwable th2, @NotNull String str) {
        getRevenue(new Object[]{this, th2, str}, 1146782962, -1146782959, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMediationNetwork(@Nullable AFd1xSDK.AFa1ySDK aFa1ySDK) {
        getRevenue(new Object[]{this, aFa1ySDK}, -704073125, 704073126, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1ySDK aFd1ySDK = (AFd1ySDK) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        equals = (copydefault + 41) % 128;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        aFd1ySDK.component2().getRevenue(bytes, MapsKt.mapOf(TuplesKt.to("Authorization", AFj1bSDK.getRevenue(str, str2))), 2000);
        int i10 = copydefault + 37;
        equals = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        throw null;
    }
}
