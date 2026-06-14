package sg.bigo.ads.ad.banner;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import java.util.Map;
import java.util.WeakHashMap;
import sg.bigo.ads.api.Ad;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<InterfaceC1211b, a> f100253a = new WeakHashMap();

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long[] f100254a;

        private a() {
            this.f100254a = new long[9];
        }

        /* synthetic */ a(byte b10) {
            this();
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.ad.banner.b$b, reason: collision with other inner class name */
    public interface InterfaceC1211b {
    }

    public static <T extends Ad> long a(InterfaceC1211b interfaceC1211b, long j10) {
        if (j10 == -1) {
            return -1L;
        }
        return j10 - j(interfaceC1211b).f100254a[4];
    }

    public static <T extends Ad> void b(InterfaceC1211b interfaceC1211b) {
        a(interfaceC1211b, 1);
    }

    public static <T extends Ad> void c(InterfaceC1211b interfaceC1211b) {
        a(interfaceC1211b, 2);
    }

    public static <T extends Ad> void d(InterfaceC1211b interfaceC1211b) {
        a(interfaceC1211b, 3);
    }

    public static <T extends Ad> void e(InterfaceC1211b interfaceC1211b) {
        a(interfaceC1211b, 4);
    }

    public static <T extends Ad> void f(InterfaceC1211b interfaceC1211b) {
        a(interfaceC1211b, 5);
    }

    public static <T extends Ad> void g(InterfaceC1211b interfaceC1211b) {
        a(interfaceC1211b, 6);
    }

    public static <T extends Ad> void h(InterfaceC1211b interfaceC1211b) {
        f100253a.remove(interfaceC1211b);
    }

    public static <T extends Ad> long i(InterfaceC1211b interfaceC1211b) {
        long[] jArr = j(interfaceC1211b).f100254a;
        return jArr[6] - jArr[4];
    }

    @NonNull
    private static <T extends Ad> a j(InterfaceC1211b interfaceC1211b) {
        Map<InterfaceC1211b, a> map = f100253a;
        a aVar = map.get(interfaceC1211b);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a((byte) 0);
        map.put(interfaceC1211b, aVar2);
        return aVar2;
    }

    public static <T extends Ad> void a(InterfaceC1211b interfaceC1211b) {
        a(interfaceC1211b, 0);
    }

    private static <T extends Ad> void a(InterfaceC1211b interfaceC1211b, int i10) {
        j(interfaceC1211b).f100254a[i10] = SystemClock.elapsedRealtime();
    }
}
