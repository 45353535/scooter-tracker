package sg.bigo.ads.common.t;

import android.util.Log;
import com.ironsource.C4240b4;
import sg.bigo.ads.common.utils.t;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static void a(int i10, int i11, String str, String str2) {
        if (a(i10)) {
            if (i10 == 0) {
                str2 = C4240b4.j.f42672d + str + "] " + str2;
            }
            Log.println(i11, "BigoAds", str2);
        }
    }

    public static void b(String str, String str2) {
        a(0, 5, str, str2);
    }

    public static void a(int i10, String str, String str2) {
        a(i10, 6, str, str2);
    }

    public static void a(String str, String str2) {
        a(0, 4, str, str2);
    }

    private static boolean a(int i10) {
        t.a();
        return t.b() ? i10 == 2 || i10 == 1 : i10 == 2;
    }
}
