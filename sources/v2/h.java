package v2;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.facebook.internal.z;
import com.facebook.s;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f105699a = new h();

    private h() {
    }

    public static final String c() {
        Context contextM = s.m();
        try {
            String str = contextM.getPackageManager().getPackageInfo(contextM.getPackageName(), 0).versionName;
            Intrinsics.checkNotNullExpressionValue(str, "{\n      val packageInfo …ageInfo.versionName\n    }");
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static final View d(Activity activity) {
        if (e3.a.d(h.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            e3.a.b(th2, h.class);
            return null;
        }
    }

    public static final boolean e() {
        String FINGERPRINT = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        if (StringsKt.a0(FINGERPRINT, "generic", false, 2, null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        if (StringsKt.a0(FINGERPRINT, "unknown", false, 2, null)) {
            return true;
        }
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        if (StringsKt.g0(MODEL, "google_sdk", false, 2, null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        if (StringsKt.g0(MODEL, "Emulator", false, 2, null)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        if (StringsKt.g0(MODEL, "Android SDK built for x86", false, 2, null)) {
            return true;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        if (StringsKt.g0(MANUFACTURER, "Genymotion", false, 2, null)) {
            return true;
        }
        String BRAND = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        if (StringsKt.a0(BRAND, "generic", false, 2, null)) {
            String DEVICE = Build.DEVICE;
            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            if (StringsKt.a0(DEVICE, "generic", false, 2, null)) {
                return true;
            }
        }
        return Intrinsics.areEqual("google_sdk", Build.PRODUCT);
    }

    public static final double f(String str) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(str);
            if (!matcher.find()) {
                return 0.0d;
            }
            return NumberFormat.getNumberInstance(z.y()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }

    public static final void a() {
    }

    public static final void b() {
    }
}
