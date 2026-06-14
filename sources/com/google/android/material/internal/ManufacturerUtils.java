package com.google.android.material.internal;

import android.os.Build;
import androidx.annotation.RestrictTo;
import com.adjust.sdk.Constants;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ManufacturerUtils {
    private static String a() {
        String str = Build.MANUFACTURER;
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static boolean isDateInputKeyboardMissingSeparatorCharacters() {
        return isLGEDevice() || isSamsungDevice();
    }

    public static boolean isLGEDevice() {
        return a().equals("lge");
    }

    public static boolean isMeizuDevice() {
        return a().equals("meizu");
    }

    public static boolean isSamsungDevice() {
        return a().equals(Constants.REFERRER_API_SAMSUNG);
    }
}
