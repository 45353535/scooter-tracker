package j$.com.android.tools.r8;

import androidx.exifinterface.media.ExifInterface;
import com.ironsource.D5;
import j$.time.ZoneOffset;
import j$.time.c;
import j$.time.chrono.AbstractC5638a;
import j$.time.chrono.AbstractC5646i;
import j$.time.chrono.B;
import j$.time.chrono.H;
import j$.time.chrono.InterfaceC5639b;
import j$.time.chrono.InterfaceC5642e;
import j$.time.chrono.InterfaceC5647j;
import j$.time.chrono.m;
import j$.time.chrono.n;
import j$.time.chrono.p;
import j$.time.chrono.t;
import j$.time.chrono.w;
import j$.time.temporal.q;
import j$.time.temporal.r;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.k;
import j$.util.function.b;
import j$.util.function.f;
import j$.util.function.g;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.function.DoubleConsumer;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ long A(long j10, long j11) {
        long j12 = j10 - j11;
        if (((j11 ^ j10) >= 0) || ((j10 ^ j12) >= 0)) {
            return j12;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long u(long j10, long j11) {
        long j12 = j10 + j11;
        if (((j11 ^ j10) < 0) || ((j10 ^ j12) >= 0)) {
            return j12;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ AbstractMap.SimpleImmutableEntry v(String str, String str2) {
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(str), Objects.requireNonNull(str2));
    }

    public static /* synthetic */ boolean w(Unsafe unsafe, Object obj, long j10, k kVar) {
        while (true) {
            Unsafe unsafe2 = unsafe;
            Object obj2 = obj;
            long j11 = j10;
            k kVar2 = kVar;
            if (unsafe2.compareAndSwapObject(obj2, j11, (Object) null, kVar2)) {
                return true;
            }
            if (unsafe2.getObject(obj2, j11) != null) {
                return false;
            }
            unsafe = unsafe2;
            obj = obj2;
            j10 = j11;
            kVar = kVar2;
        }
    }

    public static /* synthetic */ long x(long j10, long j11) {
        long j12 = j10 % j11;
        if (j12 == 0) {
            return 0L;
        }
        return (((j10 ^ j11) >> 63) | 1) > 0 ? j12 : j12 + j11;
    }

    public static /* synthetic */ long y(long j10, long j11) {
        long j12 = j10 / j11;
        return (j10 - (j11 * j12) != 0 && (((j10 ^ j11) >> 63) | 1) < 0) ? j12 - 1 : j12;
    }

    public static /* synthetic */ long z(long j10, long j11) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j11) + Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10);
        if (iNumberOfLeadingZeros > 65) {
            return j10 * j11;
        }
        if (iNumberOfLeadingZeros >= 64) {
            if ((j11 != Long.MIN_VALUE) | (j10 >= 0)) {
                long j12 = j10 * j11;
                if (j10 == 0 || j12 / j10 == j11) {
                    return j12;
                }
            }
        }
        throw new ArithmeticException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.b] */
    public static b c(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        Objects.requireNonNull(doubleConsumer2);
        return new DoubleConsumer() { // from class: j$.util.function.b
            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return j$.com.android.tools.r8.a.c(this, doubleConsumer3);
            }

            @Override // java.util.function.DoubleConsumer
            public final void accept(double d10) {
                doubleConsumer.accept(d10);
                doubleConsumer2.accept(d10);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.f] */
    public static f d(final LongConsumer longConsumer, final LongConsumer longConsumer2) {
        Objects.requireNonNull(longConsumer2);
        return new LongConsumer() { // from class: j$.util.function.f
            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                return j$.com.android.tools.r8.a.d(this, longConsumer3);
            }

            @Override // java.util.function.LongConsumer
            public final void accept(long j10) {
                longConsumer.accept(j10);
                longConsumer2.accept(j10);
            }
        };
    }

    public static g b(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new g(predicate, predicate2, 0);
    }

    public static g m(Predicate predicate, Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new g(predicate, predicate2, 1);
    }

    public static String B(Object obj, Object obj2) {
        String string;
        String string2;
        String str = "null";
        if (obj == null || (string = obj.toString()) == null) {
            string = "null";
        }
        int length = string.length();
        if (obj2 != null && (string2 = obj2.toString()) != null) {
            str = string2;
        }
        int length2 = str.length();
        char[] cArr = new char[length + length2 + 1];
        string.getChars(0, length, cArr, 0);
        cArr[length] = D5.T;
        str.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }

    public static boolean l(n nVar, q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.ERA : qVar != null && qVar.m(nVar);
    }

    public static m t(j$.time.temporal.n nVar) {
        Objects.requireNonNull(nVar, "temporal");
        Object objRequireNonNull = (m) nVar.p(r.f84717b);
        t tVar = t.f84589c;
        if (objRequireNonNull == null) {
            objRequireNonNull = Objects.requireNonNull(tVar, "defaultObj");
        }
        return (m) objRequireNonNull;
    }

    public static int h(InterfaceC5647j interfaceC5647j, q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i10 = AbstractC5646i.f84567a[((j$.time.temporal.a) qVar).ordinal()];
            if (i10 == 1) {
                throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 != 2) {
                return interfaceC5647j.y().k(qVar);
            }
            return interfaceC5647j.g().f84540a;
        }
        return r.a(interfaceC5647j, qVar);
    }

    public static int i(n nVar, j$.time.temporal.a aVar) {
        if (aVar == j$.time.temporal.a.ERA) {
            return nVar.getValue();
        }
        return r.a(nVar, aVar);
    }

    public static long j(n nVar, q qVar) {
        if (qVar == j$.time.temporal.a.ERA) {
            return nVar.getValue();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
        return qVar.k(nVar);
    }

    public static m C(String str) {
        ConcurrentHashMap concurrentHashMap = AbstractC5638a.f84556a;
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = AbstractC5638a.f84556a;
            m mVar = (m) concurrentHashMap2.get(str);
            if (mVar == null) {
                mVar = (m) AbstractC5638a.f84557b.get(str);
            }
            if (mVar != null) {
                return mVar;
            }
            if (concurrentHashMap2.get(ExifInterface.TAG_RW2_ISO) != null) {
                for (m mVar2 : ServiceLoader.load(m.class)) {
                    if (str.equals(mVar2.i()) || str.equals(mVar2.s())) {
                        return mVar2;
                    }
                }
                throw new j$.time.b("Unknown chronology: " + str);
            }
            p pVar = p.f84573l;
            AbstractC5638a.j(pVar, pVar.i());
            w wVar = w.f84592c;
            AbstractC5638a.j(wVar, wVar.i());
            B b10 = B.f84545c;
            AbstractC5638a.j(b10, b10.i());
            H h10 = H.f84552c;
            AbstractC5638a.j(h10, h10.i());
            try {
                for (AbstractC5638a abstractC5638a : Arrays.asList(new AbstractC5638a[0])) {
                    if (!abstractC5638a.i().equals(ExifInterface.TAG_RW2_ISO)) {
                        AbstractC5638a.j(abstractC5638a, abstractC5638a.i());
                    }
                }
                t tVar = t.f84589c;
                AbstractC5638a.j(tVar, tVar.i());
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(th2.getMessage(), th2);
            }
        }
    }

    public static Object q(n nVar, j$.time.format.a aVar) {
        if (aVar == r.f84718c) {
            return j$.time.temporal.b.ERAS;
        }
        return r.c(nVar, aVar);
    }

    public static Object o(InterfaceC5642e interfaceC5642e, j$.time.format.a aVar) {
        if (aVar == r.f84716a || aVar == r.f84720e || aVar == r.f84719d) {
            return null;
        }
        if (aVar == r.f84722g) {
            return interfaceC5642e.b();
        }
        if (aVar == r.f84717b) {
            return interfaceC5642e.a();
        }
        if (aVar == r.f84718c) {
            return j$.time.temporal.b.NANOS;
        }
        return aVar.a(interfaceC5642e);
    }

    public static boolean k(InterfaceC5639b interfaceC5639b, q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).t();
        }
        return qVar != null && qVar.m(interfaceC5639b);
    }

    public static long r(InterfaceC5642e interfaceC5642e, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((interfaceC5642e.c().u() * 86400) + ((long) interfaceC5642e.b().O())) - ((long) zoneOffset.f84540a);
    }

    public static Object p(InterfaceC5647j interfaceC5647j, j$.time.format.a aVar) {
        if (aVar == r.f84720e || aVar == r.f84716a) {
            return interfaceC5647j.r();
        }
        if (aVar == r.f84719d) {
            return interfaceC5647j.g();
        }
        if (aVar == r.f84722g) {
            return interfaceC5647j.b();
        }
        if (aVar == r.f84717b) {
            return interfaceC5647j.a();
        }
        if (aVar == r.f84718c) {
            return j$.time.temporal.b.NANOS;
        }
        return aVar.a(interfaceC5647j);
    }

    public static int f(InterfaceC5642e interfaceC5642e, InterfaceC5642e interfaceC5642e2) {
        int iZ = interfaceC5642e.c().compareTo(interfaceC5642e2.c());
        return (iZ == 0 && (iZ = interfaceC5642e.b().compareTo(interfaceC5642e2.b())) == 0) ? ((AbstractC5638a) interfaceC5642e.a()).i().compareTo(interfaceC5642e2.a().i()) : iZ;
    }

    public static Object n(InterfaceC5639b interfaceC5639b, j$.time.format.a aVar) {
        if (aVar == r.f84716a || aVar == r.f84720e || aVar == r.f84719d || aVar == r.f84722g) {
            return null;
        }
        if (aVar == r.f84717b) {
            return interfaceC5639b.a();
        }
        if (aVar == r.f84718c) {
            return j$.time.temporal.b.DAYS;
        }
        return aVar.a(interfaceC5639b);
    }

    public static j$.time.temporal.m a(InterfaceC5639b interfaceC5639b, j$.time.temporal.m mVar) {
        return mVar.d(interfaceC5639b.u(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static long s(InterfaceC5647j interfaceC5647j) {
        return ((interfaceC5647j.c().u() * 86400) + ((long) interfaceC5647j.b().O())) - ((long) interfaceC5647j.g().f84540a);
    }

    public static int g(InterfaceC5647j interfaceC5647j, InterfaceC5647j interfaceC5647j2) {
        int iCompare = Long.compare(interfaceC5647j.B(), interfaceC5647j2.B());
        return (iCompare == 0 && (iCompare = interfaceC5647j.b().f84674d - interfaceC5647j2.b().f84674d) == 0 && (iCompare = interfaceC5647j.y().compareTo(interfaceC5647j2.y())) == 0 && (iCompare = interfaceC5647j.r().i().compareTo(interfaceC5647j2.r().i())) == 0) ? ((AbstractC5638a) interfaceC5647j.a()).i().compareTo(interfaceC5647j2.a().i()) : iCompare;
    }

    public static int e(InterfaceC5639b interfaceC5639b, InterfaceC5639b interfaceC5639b2) {
        int iCompare = Long.compare(interfaceC5639b.u(), interfaceC5639b2.u());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC5638a) interfaceC5639b.a()).i().compareTo(interfaceC5639b2.a().i());
    }
}
