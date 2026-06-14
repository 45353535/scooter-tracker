package sg.bigo.ads.ad.b;

import androidx.annotation.NonNull;
import com.vungle.ads.internal.signals.SignalManager;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class e {
    public static int a(@NonNull String str, int i10) {
        if (i10 <= 0) {
            return 0;
        }
        return Math.abs((str + new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis() / SignalManager.TWENTY_FOUR_HOURS_MILLIS))).hashCode()) % i10;
    }

    public static String b(@NonNull String str) {
        return (a(str, 901) + 100) + "K";
    }

    public static String c(@NonNull String str) {
        return "4." + (a(str, 7) + 3);
    }

    public static String a(@NonNull String str) {
        return (a(str, 100) + 1) + "M+";
    }
}
