package net.pubnative.lite.sdk.vpaid.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.utils.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class Utils {
    private static final String TAG = "Utils";
    private static boolean debugMode = true;

    /* JADX INFO: renamed from: net.pubnative.lite.sdk.vpaid.utils.Utils$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$pubnative$lite$sdk$vpaid$utils$Utils$StretchOption;

        static {
            int[] iArr = new int[StretchOption.values().length];
            $SwitchMap$net$pubnative$lite$sdk$vpaid$utils$Utils$StretchOption = iArr;
            try {
                iArr[StretchOption.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$vpaid$utils$Utils$StretchOption[StretchOption.STRETCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$pubnative$lite$sdk$vpaid$utils$Utils$StretchOption[StretchOption.NO_STRETCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum StretchOption {
        NONE,
        STRETCH,
        NO_STRETCH
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0067 A[PHI: r3 r4
  0x0067: PHI (r3v13 int) = (r3v5 int), (r3v10 int), (r3v21 int), (r3v25 int) binds: [B:24:0x0065, B:18:0x0049, B:11:0x002b, B:8:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0067: PHI (r4v11 int) = (r4v3 int), (r4v9 int), (r4v20 int), (r4v23 int) binds: [B:24:0x0065, B:18:0x0049, B:11:0x002b, B:8:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.widget.FrameLayout.LayoutParams calculateNewLayoutParams(android.widget.FrameLayout.LayoutParams r2, int r3, int r4, int r5, int r6, net.pubnative.lite.sdk.vpaid.utils.Utils.StretchOption r7) {
        /*
            r0 = 17
            r2.gravity = r0
            r0 = 0
            if (r3 != r4) goto L2e
            if (r5 != r6) goto Le
            r2.width = r5
            r2.height = r6
            goto L6e
        Le:
            if (r5 <= r6) goto L1f
            r2.height = r6
            float r3 = (float) r3
            float r4 = (float) r4
            float r3 = r3 / r4
            float r4 = (float) r6
            float r3 = r3 * r4
            int r3 = (int) r3
            r2.width = r3
            int r4 = r5 - r3
            if (r3 == 0) goto L6e
            goto L67
        L1f:
            r2.width = r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r4 = r4 / r3
            float r3 = (float) r5
            float r4 = r4 * r3
            int r3 = (int) r4
            r2.height = r3
            int r4 = r6 - r3
            if (r3 == 0) goto L6e
            goto L67
        L2e:
            if (r3 <= r4) goto L4c
            r2.width = r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r4 = r4 / r3
            float r3 = (float) r5
            float r4 = r4 * r3
            int r4 = (int) r4
            r2.height = r4
            if (r4 <= r6) goto L45
            float r1 = (float) r6
            float r4 = (float) r4
            float r1 = r1 / r4
            r2.height = r6
            float r3 = r3 * r1
            int r3 = (int) r3
            r2.width = r3
        L45:
            int r3 = r2.height
            int r4 = r6 - r3
            if (r3 == 0) goto L6e
            goto L67
        L4c:
            r2.height = r6
            float r3 = (float) r3
            float r4 = (float) r4
            float r3 = r3 / r4
            float r4 = (float) r6
            float r3 = r3 * r4
            int r3 = (int) r3
            r2.width = r3
            if (r3 <= r5) goto L61
            float r1 = (float) r5
            float r3 = (float) r3
            float r1 = r1 / r3
            r2.width = r5
            float r4 = r4 * r1
            int r3 = (int) r4
            r2.height = r3
        L61:
            int r3 = r2.width
            int r4 = r5 - r3
            if (r3 == 0) goto L6e
        L67:
            float r4 = (float) r4
            r0 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 * r0
            float r3 = (float) r3
            float r0 = r4 / r3
        L6e:
            int[] r3 = net.pubnative.lite.sdk.vpaid.utils.Utils.AnonymousClass1.$SwitchMap$net$pubnative$lite$sdk$vpaid$utils$Utils$StretchOption
            int r4 = r7.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L82
            r4 = 2
            if (r3 == r4) goto L7d
            goto L8c
        L7d:
            r2.width = r5
            r2.height = r6
            return r2
        L82:
            r3 = 1093664768(0x41300000, float:11.0)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L8c
            r2.width = r5
            r2.height = r6
        L8c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.vpaid.utils.Utils.calculateNewLayoutParams(android.widget.FrameLayout$LayoutParams, int, int, int, int, net.pubnative.lite.sdk.vpaid.utils.Utils$StretchOption):android.widget.FrameLayout$LayoutParams");
    }

    public static String getStringFromStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        byte[] bArr = new byte[4096];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return byteArrayOutputStream.toString("UTF-8");
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    public static float getSystemVolume(Context context) {
        AudioManager audioManager;
        if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
            return 1.0f;
        }
        return Math.round((audioManager.getStreamVolume(3) * 100.0f) / audioManager.getStreamMaxVolume(3)) / 100.0f;
    }

    public static boolean isDebug() {
        return debugMode;
    }

    public static boolean isEmulator() {
        String str = Build.MODEL;
        return str.contains("google_sdk") || str.contains("Emulator") || str.contains("Android SDK") || Build.MANUFACTURER.contains("Genymotion");
    }

    @SuppressLint({"MissingPermission"})
    public static boolean isOnline(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
                if (activeNetworkInfo.isAvailable()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            HyBid.reportException(e10);
            e10.printStackTrace();
            return false;
        }
    }

    public static boolean isPhoneMuted(Context context) {
        AudioManager audioManager;
        return (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null || audioManager.getRingerMode() != 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static net.pubnative.lite.sdk.models.ContentInfo parseContentInfo(net.pubnative.lite.sdk.vpaid.models.vast.Icon r13) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.vpaid.utils.Utils.parseContentInfo(net.pubnative.lite.sdk.vpaid.models.vast.Icon):net.pubnative.lite.sdk.models.ContentInfo");
    }

    public static Integer parseDuration(String str) {
        try {
            String[] strArrSplit = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
            int i10 = Integer.parseInt(strArrSplit[0]);
            return Integer.valueOf(Double.valueOf(strArrSplit[2]).intValue() + (Integer.parseInt(strArrSplit[1]) * 60) + (i10 * 3600));
        } catch (RuntimeException e10) {
            HyBid.reportException((Exception) e10);
            Logger.e(TAG, "Error while parsing ad duration");
            return null;
        }
    }

    public static int parsePercent(String str) {
        return Integer.parseInt(str.replace("%", "").trim());
    }

    public static String readAssets(AssetManager assetManager, String str) {
        return getStringFromStream(assetManager.open(str));
    }

    public static void setDebugMode(boolean z10) {
        debugMode = z10;
    }
}
