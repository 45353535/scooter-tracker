package f1;

import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class eg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eg f69747a = new eg();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static b1.d f69748b = b1.d.f5790c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f69749c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f69750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f69751e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f69752b = new a("DEBUG", 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f69753c = new a("ERROR", 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f69754d = new a("WARNING", 2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f69755e = new a("INFO", 3);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f69756f = new a("VERBOSE", 4);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f69757g = new a("WTF", 5);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ a[] f69758h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f69759i;

        static {
            a[] aVarArrD = d();
            f69758h = aVarArrD;
            f69759i = qf.a.a(aVarArrD);
        }

        public a(String str, int i10) {
        }

        public static final /* synthetic */ a[] d() {
            return new a[]{f69752b, f69753c, f69754d, f69755e, f69756f, f69757g};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f69758h.clone();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69760a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f69752b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f69753c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f69754d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.f69755e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.f69756f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.f69757g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f69760a = iArr;
        }
    }

    public static /* synthetic */ String b(eg egVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8;
        }
        return egVar.a(i10);
    }

    public static final void d(String msg, Throwable th2) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        f69747a.c(a.f69752b, msg, th2);
    }

    public static /* synthetic */ void e(String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        d(str, th2);
    }

    public static /* synthetic */ String h(eg egVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8;
        }
        return egVar.g(i10);
    }

    public static final void i(String msg, Throwable th2) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        f69747a.c(a.f69753c, msg, th2);
    }

    public static /* synthetic */ void j(String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        i(str, th2);
    }

    public static final void l(String msg, Throwable th2) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        f69747a.c(a.f69755e, msg, th2);
    }

    public static /* synthetic */ void m(String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        l(str, th2);
    }

    public static final void n(String msg, Throwable th2) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        f69747a.c(a.f69756f, msg, th2);
    }

    public static final void o(String msg, Throwable th2) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        f69747a.c(a.f69754d, msg, th2);
    }

    public static /* synthetic */ void p(String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        o(str, th2);
    }

    public final String a(int i10) {
        StackTraceElement stackTraceElementK = k(i10);
        if (stackTraceElementK == null) {
            return "";
        }
        String str = stackTraceElementK.getClassName() + StringUtils.PROCESS_POSTFIX_DELIMITER + stackTraceElementK.getMethodName() + StringUtils.PROCESS_POSTFIX_DELIMITER + stackTraceElementK.getLineNumber();
        ConcurrentHashMap concurrentHashMap = f69749c;
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            if (concurrentHashMap.size() >= 1000) {
                Set setKeySet = concurrentHashMap.keySet();
                Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
                Iterator it = CollectionsKt.take(setKeySet, 250).iterator();
                while (it.hasNext()) {
                    f69749c.remove((String) it.next());
                }
            }
            String className = stackTraceElementK.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            obj = StringsKt.k1(className, '.', null, 2, null) + "." + stackTraceElementK.getMethodName() + "():";
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(str, obj);
            if (objPutIfAbsent != null) {
                obj = objPutIfAbsent;
            }
        }
        Intrinsics.checkNotNullExpressionValue(obj, "getOrPut(...)");
        return (String) obj;
    }

    public final void c(a aVar, String str, Throwable th2) {
        if (f69748b == b1.d.f5791d || f69748b == b1.d.f5790c) {
            String str2 = (f() ? b(this, 0, 1, null) : h(this, 0, 1, null)) + " " + str;
            switch (b.f69760a[aVar.ordinal()]) {
                case 1:
                    Log.d("[ChartboostMonetization]", str2, th2);
                    break;
                case 2:
                    Log.e("[ChartboostMonetization]", str2, th2);
                    break;
                case 3:
                    Log.w("[ChartboostMonetization]", str2, th2);
                    break;
                case 4:
                    Log.i("[ChartboostMonetization]", str2, th2);
                    break;
                case 5:
                    Log.v("[ChartboostMonetization]", str2, th2);
                    break;
                case 6:
                    Log.wtf("[ChartboostMonetization]", str2, th2);
                    break;
            }
        }
    }

    public final boolean f() {
        Boolean bool = f69750d;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (f69751e) {
            return false;
        }
        try {
            try {
                f69751e = true;
                ga gaVar = (ga) rd.f70996b.a().b().get();
                boolean z10 = gaVar != null ? gaVar.f69909m : false;
                f69750d = Boolean.valueOf(z10);
                f69751e = false;
                return z10;
            } catch (Exception unused) {
                f69750d = Boolean.FALSE;
                f69751e = false;
                return false;
            }
        } catch (Throwable th2) {
            f69751e = false;
            throw th2;
        }
    }

    public final String g(int i10) {
        StackTraceElement stackTraceElementK = k(i10);
        if (stackTraceElementK == null) {
            return "";
        }
        String className = stackTraceElementK.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
        String str = StringsKt.k1(className, '.', null, 2, null) + "." + stackTraceElementK.getMethodName() + "():";
        return str == null ? "" : str;
    }

    public final StackTraceElement k(int i10) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length > i10) {
            return stackTrace[i10];
        }
        return null;
    }
}
