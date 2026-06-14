package com.appsflyer.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes6.dex */
public final class AFf1pSDK extends AFf1uSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventParameterName = 1760829264;
    private static int AFInAppEventType = 2059786070;
    private static byte[] AFKeystoreWrapper = {-102, 97, -125, 124, 108};
    private static short[] AFLogger = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f15598d = 0;
    private static int registerClient = -1524191679;
    private static int unregisterClient = 1;
    private final AFc1pSDK copydefault;
    private final AFg1rSDK equals;
    private final String hashCode;
    private final AFc1gSDK toString;

    public AFf1pSDK(@NonNull String str, @NonNull AFc1bSDK aFc1bSDK) {
        super(new AFg1uSDK(), aFc1bSDK, str);
        this.copydefault = aFc1bSDK.getCurrencyIso4217Code();
        this.toString = aFc1bSDK.registerClient();
        this.hashCode = str;
        this.equals = aFc1bSDK.component4();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r13, byte r14, short r15, int r16, int r17, java.lang.Object[] r18) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1pSDK.a(int, byte, short, int, int, java.lang.Object[]):void");
    }

    private void equals() {
        unregisterClient = (f15598d + 41) % 128;
        ((AFf1uSDK) this).areAllFieldsValid.getCurrencyIso4217Code("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        unregisterClient = (f15598d + 9) % 128;
    }

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i10 * Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE) + (i11 * (-317));
        int i14 = ~i11;
        int i15 = i13 + (((~((~i10) | i12)) | i14) * (-318));
        int i16 = ~(i14 | i12);
        int i17 = ~i12;
        return (i15 + ((i16 | (~((i17 | i10) | i11))) * 318)) + (((~((i10 | i11) | i12)) | (~((i14 | i17) | i10))) * 318) != 1 ? getMonetizationNetwork(objArr) : getMediationNetwork(objArr);
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFf1pSDK aFf1pSDK = (AFf1pSDK) objArr[0];
        PackageManager packageManager = (PackageManager) objArr[1];
        ApplicationInfo applicationInfo = aFf1pSDK.copydefault.n_().applicationInfo;
        if (applicationInfo == null) {
            int i10 = unregisterClient + 103;
            f15598d = i10 % 128;
            if (i10 % 2 == 0) {
                return "";
            }
            throw null;
        }
        String string = packageManager.getApplicationLabel(applicationInfo).toString();
        int i11 = f15598d + 73;
        unregisterClient = i11 % 128;
        if (i11 % 2 != 0) {
            return string;
        }
        throw null;
    }

    @NonNull
    private String s_(PackageManager packageManager) {
        return (String) getMediationNetwork(new Object[]{this, packageManager}, -182789500, 182789500, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    protected final void AFAdRevenueData(AFh1jSDK aFh1jSDK) {
        int i10 = unregisterClient + 29;
        f15598d = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    protected final void areAllFieldsValid(AFh1jSDK aFh1jSDK) {
        int i10 = unregisterClient + 23;
        f15598d = i10 % 128;
        if (i10 % 2 != 0) {
            this.copydefault.component4();
            throw null;
        }
        String strComponent4 = this.copydefault.component4();
        if (strComponent4 != null) {
            aFh1jSDK.getMonetizationNetwork("advertiserId", strComponent4);
            unregisterClient = (f15598d + 35) % 128;
        }
    }

    @Override // com.appsflyer.internal.AFf1uSDK, com.appsflyer.internal.AFe1eSDK
    protected final boolean copydefault() {
        return ((Boolean) getMediationNetwork(new Object[]{this}, 222839034, -222839033, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    protected final void getCurrencyIso4217Code(AFh1jSDK aFh1jSDK) {
        f15598d = (unregisterClient + 53) % 128;
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1lSDK
    public final void getRevenue() {
        f15598d = (unregisterClient + 55) % 128;
        super.getRevenue();
        ResponseNetwork responseNetwork = ((AFe1eSDK) this).component3;
        if (responseNetwork != null && responseNetwork.isSuccessful()) {
            equals();
        }
        unregisterClient = (f15598d + 49) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (r12.getRevenue() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        r14.getMonetizationNetwork("app_version_code", java.lang.Integer.toString(r13.copydefault.n_().versionCode));
        r14.getMonetizationNetwork(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_VERSION, r13.copydefault.n_().versionName);
        r14.getMonetizationNetwork("app_name", (java.lang.String) getMediationNetwork(new java.lang.Object[]{r13, r4.getPackageManager()}, -182789500, 182789500, java.lang.System.identityHashCode(r13)));
        r14.getMonetizationNetwork("installDate", com.appsflyer.internal.AFa1uSDK.getMediationNetwork(new java.text.SimpleDateFormat("yyyy-MM-dd_HHmmssZ", java.util.Locale.US), r13.copydefault.n_().firstInstallTime));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008f, code lost:
    
        com.appsflyer.AFLogger.afErrorLog("Exception while collecting application version info.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0186, code lost:
    
        com.appsflyer.AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0192, code lost:
    
        throw new java.lang.IllegalStateException("CustomerUserId not set, register is not sent");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x019a, code lost:
    
        throw new java.lang.IllegalStateException("Context is not provided, can't send register request");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r0 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        r12 = r4;
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r0 != null) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // com.appsflyer.internal.AFf1uSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void getMediationNetwork(com.appsflyer.internal.AFh1jSDK r14) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1pSDK.getMediationNetwork(com.appsflyer.internal.AFh1jSDK):void");
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    protected final void getMonetizationNetwork(AFh1jSDK aFh1jSDK) {
        unregisterClient = (f15598d + 103) % 128;
    }

    @Override // com.appsflyer.internal.AFf1uSDK
    protected final void getRevenue(AFh1jSDK aFh1jSDK) {
        int i10 = unregisterClient + 7;
        f15598d = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        int i10 = (f15598d + 35) % 128;
        unregisterClient = i10;
        int i11 = i10 + 69;
        f15598d = i11 % 128;
        if (i11 % 2 == 0) {
            return Boolean.FALSE;
        }
        int i12 = 75 / 0;
        return Boolean.FALSE;
    }
}
