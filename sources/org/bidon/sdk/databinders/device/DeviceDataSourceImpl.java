package org.bidon.sdk.databinders.device;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.amazon.device.ads.DtbDeviceData;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import lf.i;
import org.bidon.sdk.ads.banner.helper.DeviceInfo;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001/B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016J\b\u0010\u001a\u001a\u00020\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u001cH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0007H\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016J\n\u0010#\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010$\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010%\u001a\u00020\u0007H\u0016J\b\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020,H\u0002J\u0012\u0010-\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\n\u0010.\u001a\u0004\u0018\u00010\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR#\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0011\u0010\u0012¨\u00060"}, d2 = {"Lorg/bidon/sdk/databinders/device/DeviceDataSourceImpl;", "Lorg/bidon/sdk/databinders/device/DeviceDataSource;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "cachedHttpAgentString", "", DtbDeviceData.DEVICE_DATA_SCREEN_SIZE_KEY, "Landroid/graphics/Point;", "getScreenSize", "()Landroid/graphics/Point;", "screenSize$delegate", "Lkotlin/Lazy;", "metrics", "Landroid/util/DisplayMetrics;", "kotlin.jvm.PlatformType", "getMetrics", "()Landroid/util/DisplayMetrics;", "metrics$delegate", "getUserAgent", "getManufacturer", "getDeviceModel", "getOs", "getOsVersion", "getApiLevel", "getHardwareVersion", "getScreenWidth", "", "getScreenHeight", "getPpi", "getPxRatio", "", "getLanguage", "getJavaScriptSupport", "getCarrier", "getPhoneMCCMNC", "getConnectionTypeCode", "isTablet", "", "getConnectionType", "Lorg/bidon/sdk/databinders/device/DeviceDataSourceImpl$ConnectionType;", "getMobileNetworkType", "networkInfo", "Landroid/net/NetworkInfo;", "generateHttpAgentString", "getSystemHttpAgentString", "ConnectionType", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeviceDataSourceImpl implements DeviceDataSource {

    @Nullable
    private String cachedHttpAgentString;

    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: metrics$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy metrics;

    /* JADX INFO: renamed from: screenSize$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy screenSize;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lorg/bidon/sdk/databinders/device/DeviceDataSourceImpl$ConnectionType;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "Invalid", "Ethernet", "WiFI", "CellularUnknown", "Cellular2G", "Cellular3G", "Cellular4G", "Cellular5G", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ConnectionType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ConnectionType[] $VALUES;

        @NotNull
        private final String code;
        public static final ConnectionType Invalid = new ConnectionType("Invalid", 0, "INVALID");
        public static final ConnectionType Ethernet = new ConnectionType("Ethernet", 1, "ETHERNET");
        public static final ConnectionType WiFI = new ConnectionType("WiFI", 2, "WIFI");
        public static final ConnectionType CellularUnknown = new ConnectionType("CellularUnknown", 3, "CELLULAR");
        public static final ConnectionType Cellular2G = new ConnectionType("Cellular2G", 4, "CELLULAR_2_G");
        public static final ConnectionType Cellular3G = new ConnectionType("Cellular3G", 5, "CELLULAR_3_G");
        public static final ConnectionType Cellular4G = new ConnectionType("Cellular4G", 6, "CELLULAR_4_G");
        public static final ConnectionType Cellular5G = new ConnectionType("Cellular5G", 7, "CELLULAR_5_G");

        private static final /* synthetic */ ConnectionType[] $values() {
            return new ConnectionType[]{Invalid, Ethernet, WiFI, CellularUnknown, Cellular2G, Cellular3G, Cellular4G, Cellular5G};
        }

        static {
            ConnectionType[] connectionTypeArr$values = $values();
            $VALUES = connectionTypeArr$values;
            $ENTRIES = qf.a.a(connectionTypeArr$values);
        }

        private ConnectionType(String str, int i10, String str2) {
            this.code = str2;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static ConnectionType valueOf(String str) {
            return (ConnectionType) Enum.valueOf(ConnectionType.class, str);
        }

        public static ConnectionType[] values() {
            return (ConnectionType[]) $VALUES.clone();
        }

        @NotNull
        public final String getCode() {
            return this.code;
        }
    }

    public DeviceDataSourceImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.screenSize = i.a(new Function0() { // from class: org.bidon.sdk.databinders.device.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceDataSourceImpl.screenSize_delegate$lambda$0(this.f97643b);
            }
        });
        this.metrics = i.a(new Function0() { // from class: org.bidon.sdk.databinders.device.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceDataSourceImpl.metrics_delegate$lambda$1(this.f97644b);
            }
        });
    }

    private final String generateHttpAgentString(Context context) {
        String string;
        try {
            StringBuilder sb2 = new StringBuilder("Mozilla/5.0");
            sb2.append(" (Linux; Android ");
            sb2.append(Build.VERSION.RELEASE);
            sb2.append("; ");
            sb2.append(Build.MODEL);
            sb2.append(" Build/");
            sb2.append(Build.ID);
            sb2.append("; wv)");
            sb2.append(" AppleWebKit/537.36 (KHTML, like Gecko)");
            sb2.append(" Version/4.0");
            PackageManager packageManager = context.getPackageManager();
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.webview", 0);
                sb2.append(" Chrome/");
                sb2.append(packageInfo.versionName);
            } catch (Throwable th2) {
                String message = th2.getMessage();
                if (message == null) {
                    message = "";
                }
                LogExtKt.logError("DeviceDataSource", message, th2);
            }
            sb2.append(" Mobile");
            try {
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                PackageInfo packageInfo2 = packageManager.getPackageInfo(context.getPackageName(), 0);
                sb2.append(" ");
                int i10 = applicationInfo.labelRes;
                if (i10 == 0) {
                    string = applicationInfo.nonLocalizedLabel.toString();
                } else {
                    string = context.getString(i10);
                    Intrinsics.checkNotNull(string);
                }
                sb2.append(string);
                sb2.append("/");
                sb2.append(packageInfo2.versionName);
            } catch (Throwable th3) {
                String message2 = th3.getMessage();
                if (message2 == null) {
                    message2 = "";
                }
                LogExtKt.logError("DeviceDataSource", message2, th3);
            }
            return sb2.toString();
        } catch (Throwable th4) {
            String message3 = th4.getMessage();
            LogExtKt.logError("DeviceDataSource", message3 != null ? message3 : "", th4);
            return null;
        }
    }

    private final ConnectionType getConnectionType(Context context) {
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return ConnectionType.Invalid;
        }
        int type = activeNetworkInfo.getType();
        return type != 0 ? type != 1 ? type != 9 ? ConnectionType.Invalid : ConnectionType.Ethernet : ConnectionType.WiFI : getMobileNetworkType(activeNetworkInfo);
    }

    private final DisplayMetrics getMetrics() {
        return (DisplayMetrics) this.metrics.getValue();
    }

    private final ConnectionType getMobileNetworkType(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 0:
                return ConnectionType.CellularUnknown;
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return ConnectionType.Cellular2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return ConnectionType.Cellular3G;
            case 13:
            case 18:
            case 19:
            default:
                return ConnectionType.Cellular4G;
            case 20:
                return ConnectionType.Cellular5G;
        }
    }

    private final Point getScreenSize() {
        return (Point) this.screenSize.getValue();
    }

    private final String getSystemHttpAgentString() {
        try {
            return System.getProperty("http.agent", "");
        } catch (Throwable th2) {
            String message = th2.getMessage();
            LogExtKt.logError("DeviceDataSource", message != null ? message : "", th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisplayMetrics metrics_delegate$lambda$1(DeviceDataSourceImpl deviceDataSourceImpl) {
        return deviceDataSourceImpl.context.getResources().getDisplayMetrics();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point screenSize_delegate$lambda$0(DeviceDataSourceImpl deviceDataSourceImpl) {
        return deviceDataSourceImpl.getScreenSize(deviceDataSourceImpl.context);
    }

    @Override // org.bidon.sdk.databinders.device.DeviceDataSource
    @NotNull
    public String getApiLevel() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    @Override // org.bidon.sdk.databinders.device.DeviceDataSource
    @Nullable
    public String getCarrier() {
        Object systemService = this.context.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String networkOperator = ((TelephonyManager) systemService).getNetworkOperator();
        if (networkOperator == null || networkOperator.length() < 3) {
            return null;
        }
        String strSubstring = networkOperator.substring(0, 3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = networkOperator.substring(3);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return strSubstring + TokenBuilder.TOKEN_DELIMITER + strSubstring2;
    }

    @Override // org.bidon.sdk.databinders.device.DeviceDataSource
    @NotNull
    public String getConnectionTypeCode() {
        return getConnectionType(this.context).getCode();
    }

    @Override // org.bidon.sdk.databinders.device.DeviceDataSource
    @NotNull
    public String getDeviceModel() {
        return getManufacturer() + " " + Build.MODEL;
    }

    @Override // org.bidon.sdk.databinders.device.DeviceDataSource
    @NotNull
    public String getHardwareVersion() {
        String HARDWARE = Build.HARDWARE;
        Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
        return HARDWARE;
    }

    @Override // org.bidon.sdk.databinders.device.DeviceDataSource
    public int getJavaScriptSupport() {
        return 1;
    }

    @Override // org.bidon.sdk.databinders.device.DeviceDataSource
    @NotNull
    public String getLanguage() {
        String string = Locale.getDefault().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // org.bidon.sdk.databinders.device.DeviceDataSource
    @NotNull
    public String getManufacturer() {
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        return MANUFACTURER;
    }

    @Override // org.bidon.sdk.databinders.device.DeviceDataSource
    @NotNull
    public String getOs() {
        return "android";
    }

    @Override // org.bidon.sdk.databinders.device.DeviceDataSource
    @NotNull
    public String getOsVersion() {
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        return RELEASE;
    }

    @Override // org.bidon.sdk.databinders.device.DeviceDataSource
    @Nullable
    public String getPhoneMCCMNC() {
        try {
            Object systemService = this.context.getSystemService("phone");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            String networkOperator = ((TelephonyManager) systemService).getNetworkOperator();
            if (networkOperator == null || networkOperator.length() < 3) {
                return null;
            }
            a1 a1Var = a1.f93282a;
            String strSubstring = networkOperator.substring(0, 3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = networkOperator.substring(3);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            String str = String.format("%s-%s", Arrays.copyOf(new Object[]{strSubstring, strSubstring2}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // org.bidon.sdk.databinders.device.DeviceDataSource
    public int getPpi() {
        return getMetrics().densityDpi;
    }

    @Override // org.bidon.sdk.databinders.device.DeviceDataSource
    public float getPxRatio() {
        return getMetrics().density;
    }

    @Override // org.bidon.sdk.databinders.device.DeviceDataSource
    public int getScreenHeight() {
        return getScreenSize().y;
    }

    @Override // org.bidon.sdk.databinders.device.DeviceDataSource
    public int getScreenWidth() {
        return getScreenSize().x;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d A[PHI: r1
  0x001d: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v5 java.lang.String), (r1v6 java.lang.String) binds: [B:5:0x000c, B:7:0x0014, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // org.bidon.sdk.databinders.device.DeviceDataSource
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getUserAgent() {
        /*
            r2 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = r2.cachedHttpAgentString
            if (r1 != 0) goto L21
            android.content.Context r1 = r2.context     // Catch: java.lang.Exception -> L1e
            java.lang.String r1 = android.webkit.WebSettings.getDefaultUserAgent(r1)     // Catch: java.lang.Exception -> L1e
            if (r1 != 0) goto L1d
            android.content.Context r1 = r2.context     // Catch: java.lang.Exception -> L1e
            java.lang.String r1 = r2.generateHttpAgentString(r1)     // Catch: java.lang.Exception -> L1e
            if (r1 != 0) goto L1d
            java.lang.String r1 = r2.getSystemHttpAgentString()     // Catch: java.lang.Exception -> L1e
            if (r1 != 0) goto L1d
            goto L1e
        L1d:
            r0 = r1
        L1e:
            r2.cachedHttpAgentString = r0
            return r0
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.databinders.device.DeviceDataSourceImpl.getUserAgent():java.lang.String");
    }

    @Override // org.bidon.sdk.databinders.device.DeviceDataSource
    public boolean isTablet() {
        return DeviceInfo.INSTANCE.isTablet();
    }

    private final Point getScreenSize(Context context) {
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Intrinsics.checkNotNullExpressionValue(defaultDisplay, "getDefaultDisplay(...)");
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }
}
