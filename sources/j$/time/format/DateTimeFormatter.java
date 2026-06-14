package j$.time.format;

import com.ironsource.C4240b4;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DateTimeFormatter f84609e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f84610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Locale f84611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f84612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j$.time.chrono.t f84613d;

    static {
        n nVar = new n();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        u uVar = u.EXCEEDS_PAD;
        nVar.h(aVar, 4, 10, uVar);
        nVar.c('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        nVar.g(aVar2, 2);
        nVar.c('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        nVar.g(aVar3, 2);
        t tVar = t.STRICT;
        j$.time.chrono.t tVar2 = j$.time.chrono.t.f84589c;
        DateTimeFormatter dateTimeFormatterK = nVar.k(tVar, tVar2);
        ISO_LOCAL_DATE = dateTimeFormatterK;
        n nVar2 = new n();
        k kVar = k.INSENSITIVE;
        nVar2.b(kVar);
        nVar2.a(dateTimeFormatterK);
        j jVar = j.f84630e;
        nVar2.b(jVar);
        nVar2.k(tVar, tVar2);
        n nVar3 = new n();
        nVar3.b(kVar);
        nVar3.a(dateTimeFormatterK);
        nVar3.j();
        nVar3.b(jVar);
        nVar3.k(tVar, tVar2);
        n nVar4 = new n();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        nVar4.g(aVar4, 2);
        nVar4.c(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        nVar4.g(aVar5, 2);
        nVar4.j();
        nVar4.c(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        nVar4.g(aVar6, 2);
        nVar4.j();
        j$.time.temporal.a aVar7 = j$.time.temporal.a.NANO_OF_SECOND;
        g gVar = new g(aVar7, 0, 9, true, 0);
        Objects.requireNonNull(aVar7, "field");
        j$.time.temporal.u uVar2 = aVar7.f84698b;
        if (uVar2.f84723a != uVar2.f84724b || uVar2.f84725c != uVar2.f84726d) {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar7);
        }
        nVar4.b(gVar);
        DateTimeFormatter dateTimeFormatterK2 = nVar4.k(tVar, null);
        n nVar5 = new n();
        nVar5.b(kVar);
        nVar5.a(dateTimeFormatterK2);
        nVar5.b(jVar);
        nVar5.k(tVar, null);
        n nVar6 = new n();
        nVar6.b(kVar);
        nVar6.a(dateTimeFormatterK2);
        nVar6.j();
        nVar6.b(jVar);
        nVar6.k(tVar, null);
        n nVar7 = new n();
        nVar7.b(kVar);
        nVar7.a(dateTimeFormatterK);
        nVar7.c('T');
        nVar7.a(dateTimeFormatterK2);
        DateTimeFormatter dateTimeFormatterK3 = nVar7.k(tVar, tVar2);
        n nVar8 = new n();
        nVar8.b(kVar);
        nVar8.a(dateTimeFormatterK3);
        k kVar2 = k.LENIENT;
        nVar8.b(kVar2);
        nVar8.b(jVar);
        k kVar3 = k.STRICT;
        nVar8.b(kVar3);
        DateTimeFormatter dateTimeFormatterK4 = nVar8.k(tVar, tVar2);
        n nVar9 = new n();
        nVar9.a(dateTimeFormatterK4);
        nVar9.j();
        nVar9.c('[');
        k kVar4 = k.SENSITIVE;
        nVar9.b(kVar4);
        nVar9.b(new h(1));
        nVar9.c(']');
        nVar9.k(tVar, tVar2);
        n nVar10 = new n();
        nVar10.a(dateTimeFormatterK3);
        nVar10.j();
        nVar10.b(jVar);
        nVar10.j();
        nVar10.c('[');
        nVar10.b(kVar4);
        nVar10.b(new h(1));
        nVar10.c(']');
        nVar10.k(tVar, tVar2);
        n nVar11 = new n();
        nVar11.b(kVar);
        nVar11.h(aVar, 4, 10, uVar);
        nVar11.c('-');
        nVar11.g(j$.time.temporal.a.DAY_OF_YEAR, 3);
        nVar11.j();
        nVar11.b(jVar);
        nVar11.k(tVar, tVar2);
        n nVar12 = new n();
        nVar12.b(kVar);
        nVar12.h(j$.time.temporal.j.f84708c, 4, 10, uVar);
        nVar12.d("-W");
        nVar12.g(j$.time.temporal.j.f84707b, 2);
        nVar12.c('-');
        j$.time.temporal.a aVar8 = j$.time.temporal.a.DAY_OF_WEEK;
        nVar12.g(aVar8, 1);
        nVar12.j();
        nVar12.b(jVar);
        nVar12.k(tVar, tVar2);
        n nVar13 = new n();
        nVar13.b(kVar);
        nVar13.b(new h(0));
        f84609e = nVar13.k(tVar, null);
        n nVar14 = new n();
        nVar14.b(kVar);
        nVar14.g(aVar, 4);
        nVar14.g(aVar2, 2);
        nVar14.g(aVar3, 2);
        nVar14.j();
        nVar14.b(kVar2);
        nVar14.b(new j("+HHMMss", "Z"));
        nVar14.b(kVar3);
        nVar14.k(tVar, tVar2);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        n nVar15 = new n();
        nVar15.b(kVar);
        nVar15.b(kVar2);
        nVar15.j();
        nVar15.e(aVar8, map);
        nVar15.d(", ");
        nVar15.i();
        nVar15.h(aVar3, 1, 2, u.NOT_NEGATIVE);
        nVar15.c(' ');
        nVar15.e(aVar2, map2);
        nVar15.c(' ');
        nVar15.g(aVar, 4);
        nVar15.c(' ');
        nVar15.g(aVar4, 2);
        nVar15.c(':');
        nVar15.g(aVar5, 2);
        nVar15.j();
        nVar15.c(':');
        nVar15.g(aVar6, 2);
        nVar15.i();
        nVar15.c(' ');
        nVar15.b(new j("+HHMM", "GMT"));
        nVar15.k(t.SMART, tVar2);
    }

    public DateTimeFormatter(e eVar, Locale locale, t tVar, j$.time.chrono.t tVar2) {
        s sVar = s.f84655a;
        this.f84610a = (e) Objects.requireNonNull(eVar, "printerParser");
        this.f84611b = (Locale) Objects.requireNonNull(locale, CommonUrlParts.LOCALE);
        this.f84612c = (s) Objects.requireNonNull(sVar, "decimalStyle");
        this.f84613d = tVar2;
    }

    public final String a(j$.time.temporal.n nVar) {
        StringBuilder sb2 = new StringBuilder(32);
        Objects.requireNonNull(nVar, "temporal");
        Objects.requireNonNull(sb2, "appendable");
        try {
            this.f84610a.j(new p(nVar, this), sb2);
            return sb2.toString();
        } catch (IOException e10) {
            throw new j$.time.b(e10.getMessage(), e10);
        }
    }

    public final String toString() {
        String string = this.f84610a.toString();
        return string.startsWith(C4240b4.j.f42672d) ? string : string.substring(1, string.length() - 1);
    }
}
