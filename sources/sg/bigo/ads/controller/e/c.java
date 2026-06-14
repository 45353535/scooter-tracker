package sg.bigo.ads.controller.e;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f103591c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    Map<String, Long> f103592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f103593b = new AtomicInteger(0);

    private c() {
    }

    public static c a() {
        return f103591c;
    }

    public final void b() {
        Map<String, Long> map = this.f103592a;
        if (map != null) {
            map.clear();
        }
        this.f103593b.set(1);
    }

    public final boolean a(@Nullable String str) {
        return a(this.f103592a, str);
    }

    static boolean a(Map<String, Long> map, String str) {
        Long l10;
        return map == null || str == null || (l10 = map.get(str)) == null || SystemClock.elapsedRealtime() - l10.longValue() > 600000;
    }
}
