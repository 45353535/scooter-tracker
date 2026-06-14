package sg.bigo.ads.api.b;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface h {

    public interface a {
        int a();

        long b();
    }

    int h();

    String i();

    int j();

    int k();

    @IntRange(from = 0, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis)
    int l();

    boolean m();

    int n();

    int o();

    @Nullable
    Map<String, String> p();
}
