package androidx.core.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityServiceInfoCompat {
    public static final int CAPABILITY_CAN_FILTER_KEY_EVENTS = 8;
    public static final int CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 4;
    public static final int CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION = 2;
    public static final int CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT = 1;
    public static final int FEEDBACK_ALL_MASK = -1;
    public static final int FEEDBACK_BRAILLE = 32;
    public static final int FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = 2;
    public static final int FLAG_REPORT_VIEW_IDS = 16;
    public static final int FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 8;
    public static final int FLAG_REQUEST_FILTER_KEY_EVENTS = 32;
    public static final int FLAG_REQUEST_TOUCH_EXPLORATION_MODE = 4;

    private AccessibilityServiceInfoCompat() {
    }

    @NonNull
    public static String capabilityToString(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "UNKNOWN" : "CAPABILITY_CAN_FILTER_KEY_EVENTS" : "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY" : "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION" : "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
    }

    @NonNull
    public static String feedbackTypeToString(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C4240b4.j.f42672d);
        while (i10 > 0) {
            int iNumberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i10);
            i10 &= ~iNumberOfTrailingZeros;
            if (sb2.length() > 1) {
                sb2.append(", ");
            }
            if (iNumberOfTrailingZeros == 1) {
                sb2.append("FEEDBACK_SPOKEN");
            } else if (iNumberOfTrailingZeros == 2) {
                sb2.append("FEEDBACK_HAPTIC");
            } else if (iNumberOfTrailingZeros == 4) {
                sb2.append("FEEDBACK_AUDIBLE");
            } else if (iNumberOfTrailingZeros == 8) {
                sb2.append("FEEDBACK_VISUAL");
            } else if (iNumberOfTrailingZeros == 16) {
                sb2.append("FEEDBACK_GENERIC");
            }
        }
        sb2.append(C4240b4.j.f42674e);
        return sb2.toString();
    }

    @Nullable
    public static String flagToString(int i10) {
        if (i10 == 1) {
            return "DEFAULT";
        }
        if (i10 == 2) {
            return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
        }
        if (i10 == 4) {
            return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
        }
        if (i10 == 8) {
            return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }
        if (i10 == 16) {
            return "FLAG_REPORT_VIEW_IDS";
        }
        if (i10 != 32) {
            return null;
        }
        return "FLAG_REQUEST_FILTER_KEY_EVENTS";
    }

    public static int getCapabilities(@NonNull AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getCapabilities();
    }

    @Nullable
    public static String loadDescription(@NonNull AccessibilityServiceInfo accessibilityServiceInfo, @NonNull PackageManager packageManager) {
        return accessibilityServiceInfo.loadDescription(packageManager);
    }
}
