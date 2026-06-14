package e2;

import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f68830c = a.error;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f68831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f68832b = new CopyOnWriteArrayList();

    public enum a {
        debug(1),
        info(2),
        warning(3),
        error(4),
        none(5);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f68839b;

        a(int i10) {
            this.f68839b = i10;
        }

        public int g() {
            return this.f68839b;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f68840a;

        static {
            int[] iArr = new int[a.values().length];
            f68840a = iArr;
            try {
                iArr[a.debug.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68840a[a.error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68840a[a.warning.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(String str) {
        this.f68831a = str;
    }

    private static String a(String str, String str2) {
        return String.format("[%s] %s", str, str2);
    }

    private void b(a aVar, String str) {
        int i10 = b.f68840a[aVar.ordinal()];
        if (i10 == 1) {
            Log.d(this.f68831a, str);
        } else if (i10 == 2) {
            Log.e(this.f68831a, str);
        } else {
            if (i10 != 3) {
                return;
            }
            Log.w(this.f68831a, str);
        }
    }

    private void c(a aVar, String str, String str2, Object... objArr) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zK = k(aVar);
        boolean zP = p();
        if (zK || zP) {
            String strM = m(str, str2, objArr);
            if (zK) {
                b(aVar, strM);
            }
            if (zP) {
                h(aVar, strM);
            }
        }
    }

    private boolean g(a aVar) {
        return k(aVar) || p();
    }

    private void h(a aVar, String str) {
        Iterator it = this.f68832b.iterator();
        if (it.hasNext()) {
            androidx.privacysandbox.ads.adservices.topics.a.a(it.next());
            throw null;
        }
    }

    private boolean k(a aVar) {
        a aVar2 = f68830c;
        return aVar2 != null && aVar2.g() <= aVar.g();
    }

    private static String m(String str, String str2, Object... objArr) {
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

    private boolean p() {
        return !this.f68832b.isEmpty();
    }

    public void d(String str, String str2, Object... objArr) {
        c(a.debug, str, str2, objArr);
    }

    public void e(String str, Throwable th2) {
        c(a.error, str, th2.toString(), new Object[0]);
    }

    public boolean f() {
        return g(a.debug);
    }

    public void i(String str, String str2, Object... objArr) {
        c(a.error, str, str2, objArr);
    }

    public boolean j() {
        return g(a.error);
    }

    public a l() {
        return f68830c;
    }

    public void n(a aVar) {
        Log.d(this.f68831a, String.format("Changing logging level. From: %s, To: %s", f68830c, aVar));
        f68830c = aVar;
    }

    public void o(String str, String str2, Object... objArr) {
        c(a.warning, str, str2, objArr);
    }
}
