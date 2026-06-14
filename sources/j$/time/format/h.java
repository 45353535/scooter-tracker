package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.w;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84622a;

    public /* synthetic */ h(int i10) {
        this.f84622a = i10;
    }

    @Override // j$.time.format.f
    public final boolean j(p pVar, StringBuilder sb2) {
        switch (this.f84622a) {
            case 0:
                Long lA = pVar.a(j$.time.temporal.a.INSTANT_SECONDS);
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
                j$.time.temporal.n nVar = pVar.f84650a;
                Long lValueOf = nVar.f(aVar) ? Long.valueOf(nVar.t(aVar)) : null;
                int i10 = 0;
                if (lA == null) {
                    return false;
                }
                long jLongValue = lA.longValue();
                int iA = aVar.f84698b.a(lValueOf != null ? lValueOf.longValue() : 0L, aVar);
                if (jLongValue >= -62167219200L) {
                    long j10 = jLongValue - 253402300800L;
                    long jY = j$.com.android.tools.r8.a.y(j10, 315569520000L) + 1;
                    LocalDateTime localDateTimeG = LocalDateTime.G(j$.com.android.tools.r8.a.x(j10, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
                    if (jY > 0) {
                        sb2.append('+');
                        sb2.append(jY);
                    }
                    sb2.append(localDateTimeG);
                    if (localDateTimeG.f84532b.f84673c == 0) {
                        sb2.append(":00");
                    }
                } else {
                    long j11 = jLongValue + 62167219200L;
                    long j12 = j11 / 315569520000L;
                    long j13 = j11 % 315569520000L;
                    LocalDateTime localDateTimeG2 = LocalDateTime.G(j13 - 62167219200L, 0, ZoneOffset.UTC);
                    int length = sb2.length();
                    sb2.append(localDateTimeG2);
                    if (localDateTimeG2.f84532b.f84673c == 0) {
                        sb2.append(":00");
                    }
                    if (j12 < 0) {
                        if (localDateTimeG2.f84531a.f84661a == -10000) {
                            sb2.replace(length, length + 2, Long.toString(j12 - 1));
                        } else if (j13 == 0) {
                            sb2.insert(length, j12);
                        } else {
                            sb2.insert(length + 1, Math.abs(j12));
                        }
                    }
                }
                if (iA > 0) {
                    sb2.append('.');
                    int i11 = 100000000;
                    while (true) {
                        if (iA > 0 || i10 % 3 != 0 || i10 < -2) {
                            int i12 = iA / i11;
                            sb2.append((char) (i12 + 48));
                            iA -= i12 * i11;
                            i11 /= 10;
                            i10++;
                        }
                    }
                }
                sb2.append('Z');
                return true;
            default:
                a aVar2 = n.f84640f;
                j$.time.temporal.n nVar2 = pVar.f84650a;
                Object objP = nVar2.p(aVar2);
                if (objP == null && pVar.f84652c == 0) {
                    throw new j$.time.b("Unable to extract " + aVar2 + " from temporal " + nVar2);
                }
                w wVar = (w) objP;
                if (wVar == null) {
                    return false;
                }
                sb2.append(wVar.i());
                return true;
        }
    }

    public final String toString() {
        switch (this.f84622a) {
            case 0:
                return "Instant()";
            default:
                return "ZoneRegionId()";
        }
    }
}
