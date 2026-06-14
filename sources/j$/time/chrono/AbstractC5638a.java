package j$.time.chrono;

import j$.time.LocalDateTime;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;

/* JADX INFO: renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5638a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f84556a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f84557b = new ConcurrentHashMap();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return i().compareTo(((m) obj).i());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    public static m j(AbstractC5638a abstractC5638a, String str) {
        String strS;
        m mVar = (m) f84556a.putIfAbsent(str, abstractC5638a);
        if (mVar == null && (strS = abstractC5638a.s()) != null) {
            f84557b.putIfAbsent(strS, abstractC5638a);
        }
        return mVar;
    }

    @Override // j$.time.chrono.m
    public InterfaceC5642e o(LocalDateTime localDateTime) {
        try {
            return l(localDateTime).v(j$.time.j.E(localDateTime));
        } catch (j$.time.b e10) {
            throw new j$.time.b("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e10);
        }
    }

    @Override // j$.time.chrono.m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC5638a) && i().compareTo(((AbstractC5638a) obj).i()) == 0;
    }

    @Override // j$.time.chrono.m
    public final int hashCode() {
        return getClass().hashCode() ^ i().hashCode();
    }

    @Override // j$.time.chrono.m
    public final String toString() {
        return i();
    }
}
