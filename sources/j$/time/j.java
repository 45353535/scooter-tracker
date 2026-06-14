package j$.time;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.signals.SignalManager;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f84667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f84668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f84669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j[] f84670h = new j[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f84671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f84672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte f84673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f84674d;

    static {
        int i10 = 0;
        while (true) {
            j[] jVarArr = f84670h;
            if (i10 < jVarArr.length) {
                jVarArr[i10] = new j(i10, 0, 0, 0);
                i10++;
            } else {
                j jVar = jVarArr[0];
                f84669g = jVar;
                j jVar2 = jVarArr[12];
                f84667e = jVar;
                f84668f = new j(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static j G(long j10) {
        j$.time.temporal.a.NANO_OF_DAY.w(j10);
        int i10 = (int) (j10 / 3600000000000L);
        long j11 = j10 - (((long) i10) * 3600000000000L);
        int i11 = (int) (j11 / 60000000000L);
        long j12 = j11 - (((long) i11) * 60000000000L);
        int i12 = (int) (j12 / 1000000000);
        return D(i10, i11, i12, (int) (j12 - (((long) i12) * 1000000000)));
    }

    public static j E(j$.time.temporal.n nVar) {
        Objects.requireNonNull(nVar, "temporal");
        j jVar = (j) nVar.p(j$.time.temporal.r.f84722g);
        if (jVar != null) {
            return jVar;
        }
        throw new b("Unable to obtain LocalTime from TemporalAccessor: " + nVar + " of type " + nVar.getClass().getName());
    }

    public static j D(int i10, int i11, int i12, int i13) {
        if ((i11 | i12 | i13) == 0) {
            return f84670h[i10];
        }
        return new j(i10, i11, i12, i13);
    }

    public j(int i10, int i11, int i12, int i13) {
        this.f84671a = (byte) i10;
        this.f84672b = (byte) i11;
        this.f84673c = (byte) i12;
        this.f84674d = i13;
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).C();
        }
        return qVar != null && qVar.m(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u n(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.d(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final int k(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return F(qVar);
        }
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long t(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.NANO_OF_DAY) {
                return N();
            }
            if (qVar == j$.time.temporal.a.MICRO_OF_DAY) {
                return N() / 1000;
            }
            return F(qVar);
        }
        return qVar.k(this);
    }

    public final int F(j$.time.temporal.q qVar) {
        int i10 = i.f84665a[((j$.time.temporal.a) qVar).ordinal()];
        byte b10 = this.f84672b;
        int i11 = this.f84674d;
        byte b11 = this.f84671a;
        switch (i10) {
            case 1:
                return i11;
            case 2:
                throw new j$.time.temporal.t("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i11 / 1000;
            case 4:
                throw new j$.time.temporal.t("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i11 / 1000000;
            case 6:
                return (int) (N() / 1000000);
            case 7:
                return this.f84673c;
            case 8:
                return O();
            case 9:
                return b10;
            case 10:
                return (b11 * 60) + b10;
            case 11:
                return b11 % Ascii.FF;
            case 12:
                int i12 = b11 % Ascii.FF;
                if (i12 % 12 == 0) {
                    return 12;
                }
                return i12;
            case 14:
                if (b11 == 0) {
                    return 24;
                }
            case 13:
                return b11;
            case 15:
                return b11 / Ascii.FF;
            default:
                throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final j d(long j10, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (j) qVar.n(this, j10);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.w(j10);
        int i10 = i.f84665a[aVar.ordinal()];
        byte b10 = this.f84672b;
        byte b11 = this.f84673c;
        int i11 = this.f84674d;
        byte b12 = this.f84671a;
        switch (i10) {
            case 1:
                return Q((int) j10);
            case 2:
                return G(j10);
            case 3:
                return Q(((int) j10) * 1000);
            case 4:
                return G(j10 * 1000);
            case 5:
                return Q(((int) j10) * 1000000);
            case 6:
                return G(j10 * 1000000);
            case 7:
                int i12 = (int) j10;
                if (b11 != i12) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.w(i12);
                    return D(b12, b10, i12, i11);
                }
                return this;
            case 8:
                return L(j10 - ((long) O()));
            case 9:
                int i13 = (int) j10;
                if (b10 != i13) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.w(i13);
                    return D(b12, i13, b11, i11);
                }
                return this;
            case 10:
                return J(j10 - ((long) ((b12 * 60) + b10)));
            case 11:
                return I(j10 - ((long) (b12 % Ascii.FF)));
            case 12:
                if (j10 == 12) {
                    j10 = 0;
                }
                return I(j10 - ((long) (b12 % Ascii.FF)));
            case 13:
                int i14 = (int) j10;
                if (b12 != i14) {
                    j$.time.temporal.a.HOUR_OF_DAY.w(i14);
                    return D(i14, b10, b11, i11);
                }
                return this;
            case 14:
                if (j10 == 24) {
                    j10 = 0;
                }
                int i15 = (int) j10;
                if (b12 != i15) {
                    j$.time.temporal.a.HOUR_OF_DAY.w(i15);
                    return D(i15, b10, b11, i11);
                }
                return this;
            case 15:
                return I((j10 - ((long) (b12 / Ascii.FF))) * 12);
            default:
                throw new j$.time.temporal.t(c.a("Unsupported field: ", qVar));
        }
    }

    public final j Q(int i10) {
        if (this.f84674d == i10) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.w(i10);
        return D(this.f84671a, this.f84672b, this.f84673c, i10);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final j e(long j10, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            switch (i.f84666b[((j$.time.temporal.b) sVar).ordinal()]) {
                case 1:
                    return K(j10);
                case 2:
                    return K((j10 % 86400000000L) * 1000);
                case 3:
                    return K((j10 % SignalManager.TWENTY_FOUR_HOURS_MILLIS) * 1000000);
                case 4:
                    return L(j10);
                case 5:
                    return J(j10);
                case 6:
                    return I(j10);
                case 7:
                    return I((j10 % 2) * 12);
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
        }
        return (j) sVar.j(this, j10);
    }

    public final j I(long j10) {
        if (j10 == 0) {
            return this;
        }
        return D(((((int) (j10 % 24)) + this.f84671a) + 24) % 24, this.f84672b, this.f84673c, this.f84674d);
    }

    public final j J(long j10) {
        if (j10 != 0) {
            int i10 = (this.f84671a * 60) + this.f84672b;
            int i11 = ((((int) (j10 % 1440)) + i10) + 1440) % 1440;
            if (i10 != i11) {
                return D(i11 / 60, i11 % 60, this.f84673c, this.f84674d);
            }
        }
        return this;
    }

    public final j L(long j10) {
        if (j10 != 0) {
            int i10 = (this.f84672b * 60) + (this.f84671a * Ascii.DLE) + this.f84673c;
            int i11 = ((((int) (j10 % 86400)) + i10) + 86400) % 86400;
            if (i10 != i11) {
                return D(i11 / 3600, (i11 / 60) % 60, i11 % 60, this.f84674d);
            }
        }
        return this;
    }

    public final j K(long j10) {
        if (j10 != 0) {
            long jN = N();
            long j11 = (((j10 % 86400000000000L) + jN) + 86400000000000L) % 86400000000000L;
            if (jN != j11) {
                return D((int) (j11 / 3600000000000L), (int) ((j11 / 60000000000L) % 60), (int) ((j11 / 1000000000) % 60), (int) (j11 % 1000000000));
            }
        }
        return this;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(long j10, j$.time.temporal.b bVar) {
        return j10 == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j10, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object p(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f84717b || aVar == j$.time.temporal.r.f84716a || aVar == j$.time.temporal.r.f84720e || aVar == j$.time.temporal.r.f84719d) {
            return null;
        }
        if (aVar == j$.time.temporal.r.f84722g) {
            return this;
        }
        if (aVar == j$.time.temporal.r.f84721f) {
            return null;
        }
        if (aVar == j$.time.temporal.r.f84718c) {
            return j$.time.temporal.b.NANOS;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m w(j$.time.temporal.m mVar) {
        return mVar.d(N(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final int O() {
        return (this.f84672b * 60) + (this.f84671a * Ascii.DLE) + this.f84673c;
    }

    public final long N() {
        return (((long) this.f84673c) * 1000000000) + (((long) this.f84672b) * 60000000000L) + (((long) this.f84671a) * 3600000000000L) + ((long) this.f84674d);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j jVar) {
        int iCompare = Integer.compare(this.f84671a, jVar.f84671a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.f84672b, jVar.f84672b)) == 0 && (iCompare = Integer.compare(this.f84673c, jVar.f84673c)) == 0) ? Integer.compare(this.f84674d, jVar.f84674d) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f84671a == jVar.f84671a && this.f84672b == jVar.f84672b && this.f84673c == jVar.f84673c && this.f84674d == jVar.f84674d) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(g gVar) {
        return (j) j$.com.android.tools.r8.a.a(gVar, this);
    }

    public final int hashCode() {
        long jN = N();
        return (int) (jN ^ (jN >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(18);
        byte b10 = this.f84671a;
        sb2.append(b10 < 10 ? "0" : "");
        sb2.append((int) b10);
        String str = StringUtils.PROCESS_POSTFIX_DELIMITER;
        byte b11 = this.f84672b;
        sb2.append(b11 < 10 ? ":0" : StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb2.append((int) b11);
        byte b12 = this.f84673c;
        int i10 = this.f84674d;
        if (b12 > 0 || i10 > 0) {
            if (b12 < 10) {
                str = ":0";
            }
            sb2.append(str);
            sb2.append((int) b12);
            if (i10 > 0) {
                sb2.append('.');
                if (i10 % 1000000 == 0) {
                    sb2.append(Integer.toString((i10 / 1000000) + 1000).substring(1));
                } else if (i10 % 1000 == 0) {
                    sb2.append(Integer.toString((i10 / 1000) + 1000000).substring(1));
                } else {
                    sb2.append(Integer.toString(i10 + Http2Connection.DEGRADED_PONG_TIMEOUT_NS).substring(1));
                }
            }
        }
        return sb2.toString();
    }

    private Object writeReplace() {
        return new r((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final void R(DataOutput dataOutput) {
        byte b10 = this.f84673c;
        byte b11 = this.f84671a;
        byte b12 = this.f84672b;
        int i10 = this.f84674d;
        if (i10 != 0) {
            dataOutput.writeByte(b11);
            dataOutput.writeByte(b12);
            dataOutput.writeByte(b10);
            dataOutput.writeInt(i10);
            return;
        }
        if (b10 != 0) {
            dataOutput.writeByte(b11);
            dataOutput.writeByte(b12);
            dataOutput.writeByte(~b10);
        } else if (b12 == 0) {
            dataOutput.writeByte(~b11);
        } else {
            dataOutput.writeByte(b11);
            dataOutput.writeByte(~b12);
        }
    }

    public static j M(ObjectInput objectInput) throws IOException {
        int i10;
        int i11;
        int i12 = objectInput.readByte();
        int i13 = 0;
        if (i12 < 0) {
            i12 = ~i12;
            i11 = 0;
            i10 = 0;
        } else {
            byte b10 = objectInput.readByte();
            if (b10 < 0) {
                int i14 = ~b10;
                i10 = 0;
                i13 = i14;
                i11 = 0;
            } else {
                byte b11 = objectInput.readByte();
                if (b11 < 0) {
                    i11 = ~b11;
                    i10 = 0;
                    i13 = b10;
                } else {
                    i10 = objectInput.readInt();
                    i13 = b10;
                    i11 = b11;
                }
            }
        }
        j$.time.temporal.a.HOUR_OF_DAY.w(i12);
        j$.time.temporal.a.MINUTE_OF_HOUR.w(i13);
        j$.time.temporal.a.SECOND_OF_MINUTE.w(i11);
        j$.time.temporal.a.NANO_OF_SECOND.w(i10);
        return D(i12, i13, i11, i10);
    }
}
