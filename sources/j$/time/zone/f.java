package j$.time.zone;

import com.ironsource.C4240b4;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long[] f84756i = new long[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e[] f84757j = new e[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final LocalDateTime[] f84758k = new LocalDateTime[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b[] f84759l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f84760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset[] f84761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f84762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LocalDateTime[] f84763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ZoneOffset[] f84764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e[] f84765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeZone f84766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient ConcurrentHashMap f84767h = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(j$.time.LocalDateTime r5, j$.time.zone.b r6) {
        /*
            j$.time.LocalDateTime r0 = r6.f84742b
            j$.time.ZoneOffset r1 = r6.f84744d
            int r2 = r1.f84540a
            j$.time.ZoneOffset r3 = r6.f84743c
            int r4 = r3.f84540a
            if (r2 <= r4) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            j$.time.LocalDateTime r4 = r6.f84742b
            if (r2 == 0) goto L2b
            boolean r0 = r5.E(r0)
            if (r0 == 0) goto L1a
            goto L42
        L1a:
            int r0 = r1.f84540a
            int r2 = r3.f84540a
            int r0 = r0 - r2
            long r2 = (long) r0
            j$.time.LocalDateTime r0 = r4.I(r2)
            boolean r5 = r5.E(r0)
            if (r5 == 0) goto L31
            goto L43
        L2b:
            boolean r0 = r5.E(r0)
            if (r0 != 0) goto L32
        L31:
            return r1
        L32:
            int r0 = r1.f84540a
            int r1 = r3.f84540a
            int r0 = r0 - r1
            long r0 = (long) r0
            j$.time.LocalDateTime r0 = r4.I(r0)
            boolean r5 = r5.E(r0)
            if (r5 == 0) goto L43
        L42:
            return r3
        L43:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.f.a(j$.time.LocalDateTime, j$.time.zone.b):java.lang.Object");
    }

    public f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.f84760a = jArr;
        this.f84761b = zoneOffsetArr;
        this.f84762c = jArr2;
        this.f84764e = zoneOffsetArr2;
        this.f84765f = eVarArr;
        if (jArr2.length == 0) {
            this.f84763d = f84758k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 < jArr2.length) {
                ZoneOffset zoneOffset = zoneOffsetArr2[i10];
                int i11 = i10 + 1;
                ZoneOffset zoneOffset2 = zoneOffsetArr2[i11];
                LocalDateTime localDateTimeG = LocalDateTime.G(jArr2[i10], 0, zoneOffset);
                if (zoneOffset2.f84540a > zoneOffset.f84540a) {
                    arrayList.add(localDateTimeG);
                    arrayList.add(localDateTimeG.I(zoneOffset2.f84540a - r0));
                } else {
                    arrayList.add(localDateTimeG.I(r3 - r0));
                    arrayList.add(localDateTimeG);
                }
                i10 = i11;
            }
            this.f84763d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f84766g = null;
    }

    public f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f84761b = zoneOffsetArr;
        long[] jArr = f84756i;
        this.f84760a = jArr;
        this.f84762c = jArr;
        this.f84763d = f84758k;
        this.f84764e = zoneOffsetArr;
        this.f84765f = f84757j;
        this.f84766g = null;
    }

    public f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {g(timeZone.getRawOffset())};
        this.f84761b = zoneOffsetArr;
        long[] jArr = f84756i;
        this.f84760a = jArr;
        this.f84762c = jArr;
        this.f84763d = f84758k;
        this.f84764e = zoneOffsetArr;
        this.f84765f = f84757j;
        this.f84766g = timeZone;
    }

    public static ZoneOffset g(int i10) {
        return ZoneOffset.I(i10 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.f84766g != null ? (byte) 100 : (byte) 1, this);
    }

    public static int c(long j10, ZoneOffset zoneOffset) {
        return j$.time.g.L(j$.com.android.tools.r8.a.y(j10 + ((long) zoneOffset.f84540a), 86400)).f84661a;
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.f84766g;
        if (timeZone != null) {
            return g(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.f84762c;
        if (jArr.length == 0) {
            return this.f84761b[0];
        }
        long epochSecond = instant.getEpochSecond();
        int length = this.f84765f.length;
        ZoneOffset[] zoneOffsetArr = this.f84764e;
        if (length > 0 && epochSecond > jArr[jArr.length - 1]) {
            b[] bVarArrB = b(c(epochSecond, zoneOffsetArr[zoneOffsetArr.length - 1]));
            b bVar = null;
            for (int i10 = 0; i10 < bVarArrB.length; i10++) {
                bVar = bVarArrB[i10];
                if (epochSecond < bVar.f84741a) {
                    return bVar.f84743c;
                }
            }
            return bVar.f84744d;
        }
        int iBinarySearch = Arrays.binarySearch(jArr, epochSecond);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return zoneOffsetArr[iBinarySearch + 1];
    }

    public final List f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (!(objE instanceof b)) {
            return Collections.singletonList((ZoneOffset) objE);
        }
        b bVar = (b) objE;
        ZoneOffset zoneOffset = bVar.f84744d;
        int i10 = zoneOffset.f84540a;
        ZoneOffset zoneOffset2 = bVar.f84743c;
        if (i10 > zoneOffset2.f84540a) {
            return Collections.EMPTY_LIST;
        }
        Object[] objArr = {zoneOffset2, zoneOffset};
        ArrayList arrayList = new ArrayList(2);
        for (int i11 = 0; i11 < 2; i11++) {
            arrayList.add(Objects.requireNonNull(objArr[i11]));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        if (r10.C(r1) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        if (r10.f84532b.N() <= r1.f84532b.N()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(j$.time.LocalDateTime r10) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.f.e(j$.time.LocalDateTime):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.zone.b[] b(int r24) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.f.b(int):j$.time.zone.b[]");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(this.f84766g, fVar.f84766g) && Arrays.equals(this.f84760a, fVar.f84760a) && Arrays.equals(this.f84761b, fVar.f84761b) && Arrays.equals(this.f84762c, fVar.f84762c) && Arrays.equals(this.f84764e, fVar.f84764e) && Arrays.equals(this.f84765f, fVar.f84765f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f84766g) ^ Arrays.hashCode(this.f84760a)) ^ Arrays.hashCode(this.f84761b)) ^ Arrays.hashCode(this.f84762c)) ^ Arrays.hashCode(this.f84764e)) ^ Arrays.hashCode(this.f84765f);
    }

    public final String toString() {
        TimeZone timeZone = this.f84766g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + C4240b4.j.f42674e;
        }
        return "ZoneRules[currentStandardOffset=" + this.f84761b[r1.length - 1] + C4240b4.j.f42674e;
    }
}
