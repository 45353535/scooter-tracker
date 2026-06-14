package j$.time;

/* JADX INFO: loaded from: classes2.dex */
public class TimeConversions {
    public static java.time.Instant convert(Instant instant) {
        if (instant == null) {
            return null;
        }
        return java.time.Instant.ofEpochSecond(instant.getEpochSecond(), instant.getNano());
    }

    public static Instant convert(java.time.Instant instant) {
        if (instant == null) {
            return null;
        }
        return Instant.ofEpochSecond(instant.getEpochSecond(), instant.getNano());
    }

    public static java.time.Duration convert(Duration duration) {
        if (duration == null) {
            return null;
        }
        return java.time.Duration.ofSeconds(duration.f84524a, duration.f84525b);
    }

    public static Duration convert(java.time.Duration duration) {
        if (duration == null) {
            return null;
        }
        long seconds = duration.getSeconds();
        long nano = duration.getNano();
        Duration duration2 = Duration.f84523c;
        return Duration.j(j$.com.android.tools.r8.a.u(seconds, j$.com.android.tools.r8.a.y(nano, 1000000000L)), (int) j$.com.android.tools.r8.a.x(nano, 1000000000L));
    }
}
