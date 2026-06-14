package b9;

import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f5938c = a.error;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f5940b = new CopyOnWriteArrayList();

    public enum a {
        debug(1),
        info(2),
        warning(3),
        error(4),
        none(5);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f5947b;

        a(int i10) {
            this.f5947b = i10;
        }

        public int g() {
            return this.f5947b;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5948a;

        static {
            int[] iArr = new int[a.values().length];
            f5948a = iArr;
            try {
                iArr[a.debug.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5948a[a.error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5948a[a.warning.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public r(String str) {
        this.f5939a = str;
    }

    private static String a(String str, String str2) {
        return String.format("[%s] %s", str, str2);
    }

    private static String b(String str, String str2, Object... objArr) {
        String strA = a(str, str2);
        if (objArr == null || objArr.length == 0) {
            return strA;
        }
        try {
            return String.format(strA, objArr);
        } catch (Throwable unused) {
            return strA;
        }
    }

    private void c(a aVar, String str) {
        int i10 = b.f5948a[aVar.ordinal()];
        if (i10 == 1) {
            Log.d(this.f5939a, str);
        } else if (i10 == 2) {
            Log.e(this.f5939a, str);
        } else {
            if (i10 != 3) {
                return;
            }
            Log.w(this.f5939a, str);
        }
    }

    private void d(a aVar, String str, String str2, Object... objArr) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zH = h(aVar);
        boolean zE = e();
        if (zH || zE) {
            String strB = b(str, str2, objArr);
            if (zH) {
                c(aVar, strB);
            }
            if (zE) {
                g(aVar, strB);
            }
        }
    }

    private boolean e() {
        return !this.f5940b.isEmpty();
    }

    private boolean f(a aVar) {
        return h(aVar) || e();
    }

    private void g(a aVar, String str) {
        Iterator it = this.f5940b.iterator();
        if (it.hasNext()) {
            androidx.privacysandbox.ads.adservices.topics.a.a(it.next());
            throw null;
        }
    }

    private boolean h(a aVar) {
        a aVar2 = f5938c;
        return aVar2 != null && aVar2.g() <= aVar.g();
    }

    public boolean i() {
        return f(a.debug);
    }

    public boolean j() {
        return f(a.error);
    }

    public void k(String str, String str2, Object... objArr) {
        d(a.debug, str, str2, objArr);
    }

    public void l(String str, String str2, Object... objArr) {
        d(a.error, str, str2, objArr);
    }

    public void m(String str, Throwable th2) {
        d(a.error, str, th2.toString(), new Object[0]);
    }

    public a n() {
        return f5938c;
    }

    public void o(a aVar) {
        Log.d(this.f5939a, String.format("Changing logging level. From: %s, To: %s", f5938c, aVar));
        f5938c = aVar;
    }

    public void p(String str, String str2, Object... objArr) {
        d(a.warning, str, str2, objArr);
    }
}
