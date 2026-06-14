package net.pubnative.lite.sdk.utils;

/* JADX INFO: loaded from: classes3.dex */
public class CheckUtils {
    private static final String TAG = "CheckUtils";

    public static class NoThrow {
        private static boolean sStrictMode;

        public static boolean checkArgument(boolean z10, String str) {
            return CheckUtils.checkArgumentImpl(z10, sStrictMode, str);
        }

        public static boolean checkNotNull(Object obj, String str) {
            return CheckUtils.checkNotNullImpl(obj, sStrictMode, str);
        }

        public static void setStrictMode(boolean z10) {
            sStrictMode = z10;
        }
    }

    public static void checkArgument(boolean z10, String str) {
        checkArgumentImpl(z10, true, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean checkArgumentImpl(boolean z10, boolean z11, String str) {
        if (z10) {
            return true;
        }
        if (z11) {
            throw new IllegalArgumentException(str);
        }
        Logger.e(TAG, str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean checkNotNullImpl(Object obj, boolean z10, String str) {
        if (obj != null) {
            return true;
        }
        if (z10) {
            throw new NullPointerException(str);
        }
        Logger.e(TAG, str);
        return false;
    }
}
