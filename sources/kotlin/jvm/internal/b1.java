package kotlin.jvm.internal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import yf.e;

/* JADX INFO: loaded from: classes3.dex */
public class b1 {
    public static Collection a(Object obj) {
        if ((obj instanceof yf.a) && !(obj instanceof yf.b)) {
            v(obj, "kotlin.collections.MutableCollection");
        }
        return h(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof yf.a) && !(obj instanceof yf.c)) {
            v(obj, "kotlin.collections.MutableIterable");
        }
        return i(obj);
    }

    public static List c(Object obj) {
        if ((obj instanceof yf.a) && !(obj instanceof yf.d)) {
            v(obj, "kotlin.collections.MutableList");
        }
        return j(obj);
    }

    public static Map d(Object obj) {
        if ((obj instanceof yf.a) && !(obj instanceof yf.e)) {
            v(obj, "kotlin.collections.MutableMap");
        }
        return k(obj);
    }

    public static Map.Entry e(Object obj) {
        if ((obj instanceof yf.a) && !(obj instanceof e.a)) {
            v(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return l(obj);
    }

    public static Set f(Object obj) {
        if ((obj instanceof yf.a) && !(obj instanceof yf.f)) {
            v(obj, "kotlin.collections.MutableSet");
        }
        return m(obj);
    }

    public static Object g(Object obj, int i10) {
        if (obj != null && !o(obj, i10)) {
            v(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Collection h(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw u(e10);
        }
    }

    public static Iterable i(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            throw u(e10);
        }
    }

    public static List j(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw u(e10);
        }
    }

    public static Map k(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw u(e10);
        }
    }

    public static Map.Entry l(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e10) {
            throw u(e10);
        }
    }

    public static Set m(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e10) {
            throw u(e10);
        }
    }

    public static int n(Object obj) {
        if (obj instanceof w) {
            return ((w) obj).getArity();
        }
        if (obj instanceof Function0) {
            return 0;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof Function2) {
            return 2;
        }
        if (obj instanceof Function3) {
            return 3;
        }
        if (obj instanceof Function4) {
            return 4;
        }
        if (obj instanceof Function5) {
            return 5;
        }
        if (obj instanceof Function6) {
            return 6;
        }
        if (obj instanceof Function7) {
            return 7;
        }
        if (obj instanceof Function8) {
            return 8;
        }
        if (obj instanceof Function9) {
            return 9;
        }
        if (obj instanceof Function10) {
            return 10;
        }
        if (obj instanceof Function11) {
            return 11;
        }
        if (obj instanceof Function12) {
            return 12;
        }
        if (obj instanceof Function13) {
            return 13;
        }
        if (obj instanceof Function14) {
            return 14;
        }
        if (obj instanceof Function15) {
            return 15;
        }
        if (obj instanceof Function16) {
            return 16;
        }
        if (obj instanceof Function17) {
            return 17;
        }
        if (obj instanceof Function18) {
            return 18;
        }
        if (obj instanceof Function19) {
            return 19;
        }
        if (obj instanceof Function20) {
            return 20;
        }
        if (obj instanceof Function21) {
            return 21;
        }
        return obj instanceof Function22 ? 22 : -1;
    }

    public static boolean o(Object obj, int i10) {
        return (obj instanceof lf.e) && n(obj) == i10;
    }

    public static boolean p(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof yf.a) || (obj instanceof yf.d);
        }
        return false;
    }

    public static boolean q(Object obj) {
        if (obj instanceof Map) {
            return !(obj instanceof yf.a) || (obj instanceof yf.e);
        }
        return false;
    }

    public static boolean r(Object obj) {
        if (obj instanceof Map.Entry) {
            return !(obj instanceof yf.a) || (obj instanceof e.a);
        }
        return false;
    }

    public static boolean s(Object obj) {
        if (obj instanceof Set) {
            return !(obj instanceof yf.a) || (obj instanceof yf.f);
        }
        return false;
    }

    private static Throwable t(Throwable th2) {
        return Intrinsics.sanitizeStackTrace(th2, b1.class.getName());
    }

    public static ClassCastException u(ClassCastException classCastException) {
        throw ((ClassCastException) t(classCastException));
    }

    public static void v(Object obj, String str) {
        w((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void w(String str) {
        throw u(new ClassCastException(str));
    }
}
