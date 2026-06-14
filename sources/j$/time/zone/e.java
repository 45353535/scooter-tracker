package j$.time.zone;

import androidx.work.WorkInfo;
import com.google.common.base.Ascii;
import j$.time.ZoneOffset;
import j$.time.j;
import j$.time.l;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f84747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f84748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j$.time.d f84749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f84750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f84751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f84752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ZoneOffset f84753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ZoneOffset f84754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ZoneOffset f84755i;

    public e(l lVar, int i10, j$.time.d dVar, j jVar, boolean z10, d dVar2, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f84747a = lVar;
        this.f84748b = (byte) i10;
        this.f84749c = dVar;
        this.f84750d = jVar;
        this.f84751e = z10;
        this.f84752f = dVar2;
        this.f84753g = zoneOffset;
        this.f84754h = zoneOffset2;
        this.f84755i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        j jVar = this.f84750d;
        boolean z10 = this.f84751e;
        int iO = z10 ? 86400 : jVar.O();
        ZoneOffset zoneOffset = this.f84753g;
        int i10 = this.f84754h.f84540a;
        int i11 = zoneOffset.f84540a;
        int i12 = i10 - i11;
        int i13 = this.f84755i.f84540a;
        int i14 = i13 - i11;
        byte b10 = iO % 3600 == 0 ? z10 ? Ascii.CAN : jVar.f84671a : (byte) 31;
        int i15 = i11 % 900 == 0 ? (i11 / 900) + 128 : 255;
        int i16 = (i12 == 0 || i12 == 1800 || i12 == 3600) ? i12 / 1800 : 3;
        int i17 = (i14 == 0 || i14 == 1800 || i14 == 3600) ? i14 / 1800 : 3;
        j$.time.d dVar = this.f84749c;
        objectOutput.writeInt((this.f84747a.getValue() << 28) + ((this.f84748b + 32) << 22) + ((dVar == null ? 0 : dVar.getValue()) << 19) + (b10 << Ascii.SO) + (this.f84752f.ordinal() << 12) + (i15 << 4) + (i16 << 2) + i17);
        if (b10 == 31) {
            objectOutput.writeInt(iO);
        }
        if (i15 == 255) {
            objectOutput.writeInt(i11);
        }
        if (i16 == 3) {
            objectOutput.writeInt(i10);
        }
        if (i17 == 3) {
            objectOutput.writeInt(i13);
        }
    }

    public static e a(ObjectInput objectInput) {
        int i10;
        d dVar;
        int i11;
        j jVarD;
        int i12 = objectInput.readInt();
        l lVarF = l.F(i12 >>> 28);
        int i13 = ((264241152 & i12) >>> 22) - 32;
        int i14 = (3670016 & i12) >>> 19;
        j$.time.d dVarC = i14 == 0 ? null : j$.time.d.C(i14);
        int i15 = (507904 & i12) >>> 14;
        d dVar2 = d.values()[(i12 & 12288) >>> 12];
        int i16 = (i12 & 4080) >>> 4;
        int i17 = (i12 & 12) >>> 2;
        int i18 = i12 & 3;
        if (i15 == 31) {
            long j10 = objectInput.readInt();
            j jVar = j.f84667e;
            j$.time.temporal.a.SECOND_OF_DAY.w(j10);
            int i19 = (int) (j10 / 3600);
            i10 = i18;
            i11 = 24;
            long j11 = j10 - ((long) (i19 * 3600));
            int i20 = (int) (j11 / 60);
            dVar = dVar2;
            jVarD = j.D(i19, i20, (int) (j11 - ((long) (i20 * 60))), 0);
        } else {
            i10 = i18;
            dVar = dVar2;
            i11 = 24;
            int i21 = i15 % 24;
            j jVar2 = j.f84667e;
            j$.time.temporal.a.HOUR_OF_DAY.w(i21);
            jVarD = j.f84670h[i21];
        }
        ZoneOffset zoneOffsetI = i16 == 255 ? ZoneOffset.I(objectInput.readInt()) : ZoneOffset.I((i16 + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) * 900);
        int i22 = zoneOffsetI.f84540a;
        ZoneOffset zoneOffsetI2 = ZoneOffset.I(i17 == 3 ? objectInput.readInt() : (i17 * 1800) + i22);
        int i23 = i10;
        ZoneOffset zoneOffsetI3 = i23 == 3 ? ZoneOffset.I(objectInput.readInt()) : ZoneOffset.I((i23 * 1800) + i22);
        boolean z10 = i15 == i11;
        Objects.requireNonNull(lVarF, "month");
        Objects.requireNonNull(jVarD, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        Objects.requireNonNull(zoneOffsetI, "standardOffset");
        Objects.requireNonNull(zoneOffsetI2, "offsetBefore");
        Objects.requireNonNull(zoneOffsetI3, "offsetAfter");
        if (i13 < -28 || i13 > 31 || i13 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z10 && !jVarD.equals(j.f84669g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (jVarD.f84674d != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(lVarF, i13, dVarC, jVarD, z10, dVar, zoneOffsetI, zoneOffsetI2, zoneOffsetI3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f84747a == eVar.f84747a && this.f84748b == eVar.f84748b && this.f84749c == eVar.f84749c && this.f84752f == eVar.f84752f && this.f84750d.equals(eVar.f84750d) && this.f84751e == eVar.f84751e && this.f84753g.equals(eVar.f84753g) && this.f84754h.equals(eVar.f84754h) && this.f84755i.equals(eVar.f84755i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iO = ((this.f84750d.O() + (this.f84751e ? 1 : 0)) << 15) + (this.f84747a.ordinal() << 11) + ((this.f84748b + 32) << 5);
        j$.time.d dVar = this.f84749c;
        return ((this.f84753g.f84540a ^ (this.f84752f.ordinal() + (iO + ((dVar == null ? 7 : dVar.ordinal()) << 2)))) ^ this.f84754h.f84540a) ^ this.f84755i.f84540a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.f84754h;
        ZoneOffset zoneOffset2 = this.f84755i;
        sb2.append(zoneOffset2.f84540a - zoneOffset.f84540a > 0 ? "Gap " : "Overlap ");
        sb2.append(zoneOffset);
        sb2.append(" to ");
        sb2.append(zoneOffset2);
        sb2.append(", ");
        l lVar = this.f84747a;
        byte b10 = this.f84748b;
        j$.time.d dVar = this.f84749c;
        if (dVar == null) {
            sb2.append(lVar.name());
            sb2.append(' ');
            sb2.append((int) b10);
        } else if (b10 == -1) {
            sb2.append(dVar.name());
            sb2.append(" on or before last day of ");
            sb2.append(lVar.name());
        } else if (b10 < 0) {
            sb2.append(dVar.name());
            sb2.append(" on or before last day minus ");
            sb2.append((-b10) - 1);
            sb2.append(" of ");
            sb2.append(lVar.name());
        } else {
            sb2.append(dVar.name());
            sb2.append(" on or after ");
            sb2.append(lVar.name());
            sb2.append(' ');
            sb2.append((int) b10);
        }
        sb2.append(" at ");
        sb2.append(this.f84751e ? "24:00" : this.f84750d.toString());
        sb2.append(" ");
        sb2.append(this.f84752f);
        sb2.append(", standard offset ");
        sb2.append(this.f84753g);
        sb2.append(']');
        return sb2.toString();
    }
}
