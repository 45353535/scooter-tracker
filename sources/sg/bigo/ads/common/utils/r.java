package sg.bigo.ads.common.utils;

import android.os.SystemClock;
import com.vungle.ads.internal.signals.SignalManager;

/* JADX INFO: loaded from: classes4.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f102828a = new r() { // from class: sg.bigo.ads.common.utils.r.1
        @Override // sg.bigo.ads.common.utils.r
        public final long a(int i10) {
            return ((long) i10) * 1000;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f102829b = new r() { // from class: sg.bigo.ads.common.utils.r.2
        @Override // sg.bigo.ads.common.utils.r
        public final long a(int i10) {
            return ((long) i10) * 60000;
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f102830c = new r() { // from class: sg.bigo.ads.common.utils.r.3
        @Override // sg.bigo.ads.common.utils.r
        public final long a(int i10) {
            return ((long) i10) * 3600000;
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f102831d = new r() { // from class: sg.bigo.ads.common.utils.r.4
        @Override // sg.bigo.ads.common.utils.r
        public final long a(int i10) {
            return ((long) i10) * SignalManager.TWENTY_FOUR_HOURS_MILLIS;
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f102832e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static long f102833f = 1619452800;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f102834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f102835b = SystemClock.elapsedRealtime();

        public a(long j10) {
            this.f102834a = j10;
        }

        public final long a() {
            return this.f102834a + (SystemClock.elapsedRealtime() - this.f102835b);
        }
    }

    private r() {
    }

    public static long a() {
        long jCurrentTimeMillis = System.currentTimeMillis() - sg.bigo.ads.common.x.a.e();
        if (jCurrentTimeMillis > 0) {
            return jCurrentTimeMillis;
        }
        sg.bigo.ads.common.x.a.f();
        return System.currentTimeMillis();
    }

    public static long b() {
        a aVar = f102832e;
        return aVar == null ? System.currentTimeMillis() : aVar.a();
    }

    /* synthetic */ r(byte b10) {
        this();
    }

    public long a(int i10) {
        return i10;
    }

    public static void a(long j10) {
        if (j10 < f102833f) {
            return;
        }
        a aVar = new a(j10 * 1000);
        if (f102832e == null) {
            f102832e = aVar;
        } else if (aVar.a() > f102832e.a()) {
            f102832e = aVar;
        }
    }
}
