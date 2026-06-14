package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class Duration implements Comparable<Duration>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Duration f84523c = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f84524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84525b;

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        Duration duration2 = duration;
        int iCompare = Long.compare(this.f84524a, duration2.f84524a);
        return iCompare != 0 ? iCompare : this.f84525b - duration2.f84525b;
    }

    static {
        BigInteger.valueOf(1000000000L);
    }

    public static Duration ofMinutes(long j10) {
        return j(j$.com.android.tools.r8.a.z(j10, 60), 0);
    }

    public static Duration ofMillis(long j10) {
        long j11 = j10 / 1000;
        int i10 = (int) (j10 % 1000);
        if (i10 < 0) {
            i10 += 1000;
            j11--;
        }
        return j(j11, i10 * 1000000);
    }

    public static Duration j(long j10, int i10) {
        if ((((long) i10) | j10) == 0) {
            return f84523c;
        }
        return new Duration(j10, i10);
    }

    public Duration(long j10, int i10) {
        this.f84524a = j10;
        this.f84525b = i10;
    }

    public boolean isZero() {
        return (((long) this.f84525b) | this.f84524a) == 0;
    }

    public boolean isNegative() {
        return this.f84524a < 0;
    }

    public long toMillis() {
        long j10 = this.f84525b;
        long j11 = this.f84524a;
        if (j11 < 0) {
            j11++;
            j10 -= 1000000000;
        }
        return j$.com.android.tools.r8.a.u(j$.com.android.tools.r8.a.z(j11, 1000), j10 / 1000000);
    }

    public long toNanos() {
        long j10 = this.f84525b;
        long j11 = this.f84524a;
        if (j11 < 0) {
            j11++;
            j10 -= 1000000000;
        }
        return j$.com.android.tools.r8.a.u(j$.com.android.tools.r8.a.z(j11, 1000000000L), j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.f84524a == duration.f84524a && this.f84525b == duration.f84525b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f84524a;
        return (this.f84525b * 51) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        if (this == f84523c) {
            return "PT0S";
        }
        long j10 = this.f84524a;
        int i10 = this.f84525b;
        long j11 = (j10 >= 0 || i10 <= 0) ? j10 : 1 + j10;
        long j12 = j11 / 3600;
        int i11 = (int) ((j11 % 3600) / 60);
        int i12 = (int) (j11 % 60);
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("PT");
        if (j12 != 0) {
            sb2.append(j12);
            sb2.append('H');
        }
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        if (i12 == 0 && i10 == 0 && sb2.length() > 2) {
            return sb2.toString();
        }
        if (j10 < 0 && i10 > 0 && i12 == 0) {
            sb2.append("-0");
        } else {
            sb2.append(i12);
        }
        if (i10 > 0) {
            int length = sb2.length();
            if (j10 < 0) {
                sb2.append(2000000000 - ((long) i10));
            } else {
                sb2.append(((long) i10) + 1000000000);
            }
            while (sb2.charAt(sb2.length() - 1) == '0') {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.setCharAt(length, '.');
        }
        sb2.append('S');
        return sb2.toString();
    }

    private Object writeReplace() {
        return new r((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
