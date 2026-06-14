package j$.time.format;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f84640f = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f84641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f84642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f84643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f84644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f84645e;

    static {
        HashMap map = new HashMap();
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.h hVar = j$.time.temporal.j.f84706a;
        map.put('Q', hVar);
        map.put('q', hVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
        map.put('g', j$.time.temporal.l.f84713a);
    }

    public n() {
        this.f84641a = this;
        this.f84643c = new ArrayList();
        this.f84645e = -1;
        this.f84642b = null;
        this.f84644d = false;
    }

    public n(n nVar) {
        this.f84641a = this;
        this.f84643c = new ArrayList();
        this.f84645e = -1;
        this.f84642b = nVar;
        this.f84644d = true;
    }

    public final void g(j$.time.temporal.q qVar, int i10) {
        Objects.requireNonNull(qVar, "field");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i10);
        }
        f(new i(qVar, i10, i10, u.NOT_NEGATIVE));
    }

    public final void h(j$.time.temporal.q qVar, int i10, int i11, u uVar) {
        if (i10 == i11 && uVar == u.NOT_NEGATIVE) {
            g(qVar, i11);
            return;
        }
        Objects.requireNonNull(qVar, "field");
        Objects.requireNonNull(uVar, "signStyle");
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i10);
        }
        if (i11 < 1 || i11 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i11);
        }
        if (i11 < i10) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
        }
        f(new i(qVar, i10, i11, uVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(j$.time.format.i r6) {
        /*
            r5 = this;
            j$.time.format.n r0 = r5.f84641a
            int r1 = r0.f84645e
            if (r1 < 0) goto L3e
            java.util.ArrayList r0 = r0.f84643c
            java.lang.Object r0 = r0.get(r1)
            j$.time.format.i r0 = (j$.time.format.i) r0
            int r2 = r6.f84625b
            int r3 = r6.f84626c
            if (r2 != r3) goto L2a
            j$.time.format.u r2 = j$.time.format.u.NOT_NEGATIVE
            j$.time.format.u r4 = r6.f84627d
            if (r4 != r2) goto L2a
            j$.time.format.i r0 = r0.b(r3)
            j$.time.format.i r6 = r6.a()
            r5.b(r6)
            j$.time.format.n r6 = r5.f84641a
            r6.f84645e = r1
            goto L36
        L2a:
            j$.time.format.i r0 = r0.a()
            j$.time.format.n r2 = r5.f84641a
            int r6 = r5.b(r6)
            r2.f84645e = r6
        L36:
            j$.time.format.n r6 = r5.f84641a
            java.util.ArrayList r6 = r6.f84643c
            r6.set(r1, r0)
            return
        L3e:
            int r6 = r5.b(r6)
            r0.f84645e = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.n.f(j$.time.format.i):void");
    }

    public final void e(j$.time.temporal.a aVar, HashMap map) {
        Objects.requireNonNull(aVar, "field");
        Objects.requireNonNull(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        v vVar = v.FULL;
        b(new m(aVar, vVar, new b(new r(Collections.singletonMap(vVar, linkedHashMap)))));
    }

    public final void c(char c10) {
        b(new d(c10));
    }

    public final void d(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            b(new d(str.charAt(0)));
        } else {
            b(new l(str));
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        e eVar = dateTimeFormatter.f84610a;
        if (eVar.f84620b) {
            eVar = new e(eVar.f84619a, false);
        }
        b(eVar);
    }

    public final void j() {
        n nVar = this.f84641a;
        nVar.f84645e = -1;
        this.f84641a = new n(nVar);
    }

    public final void i() {
        n nVar = this.f84641a;
        if (nVar.f84642b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (nVar.f84643c.size() > 0) {
            n nVar2 = this.f84641a;
            e eVar = new e(nVar2.f84643c, nVar2.f84644d);
            this.f84641a = this.f84641a.f84642b;
            b(eVar);
            return;
        }
        this.f84641a = this.f84641a.f84642b;
    }

    public final int b(f fVar) {
        Objects.requireNonNull(fVar, "pp");
        n nVar = this.f84641a;
        nVar.getClass();
        nVar.f84643c.add(fVar);
        this.f84641a.f84645e = -1;
        return r2.f84643c.size() - 1;
    }

    public final DateTimeFormatter k(t tVar, j$.time.chrono.t tVar2) {
        return l(Locale.getDefault(), tVar, tVar2);
    }

    public final DateTimeFormatter l(Locale locale, t tVar, j$.time.chrono.t tVar2) {
        Objects.requireNonNull(locale, CommonUrlParts.LOCALE);
        while (this.f84641a.f84642b != null) {
            i();
        }
        e eVar = new e(this.f84643c, false);
        s sVar = s.f84655a;
        return new DateTimeFormatter(eVar, locale, tVar, tVar2);
    }
}
