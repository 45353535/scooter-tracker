package j$.time;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import j$.util.Objects;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f84690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f84691b;

    public r() {
    }

    public r(byte b10, Object obj) {
        this.f84690a = b10;
        this.f84691b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b10 = this.f84690a;
        Object obj = this.f84691b;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.f84524a);
                objectOutput.writeInt(duration.f84525b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.f84527a);
                objectOutput.writeInt(instant.f84528b);
                return;
            case 3:
                g gVar = (g) obj;
                objectOutput.writeInt(gVar.f84661a);
                objectOutput.writeByte(gVar.f84662b);
                objectOutput.writeByte(gVar.f84663c);
                return;
            case 4:
                ((j) obj).R(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                g gVar2 = localDateTime.f84531a;
                objectOutput.writeInt(gVar2.f84661a);
                objectOutput.writeByte(gVar2.f84662b);
                objectOutput.writeByte(gVar2.f84663c);
                localDateTime.f84532b.R(objectOutput);
                return;
            case 6:
                z zVar = (z) obj;
                LocalDateTime localDateTime2 = zVar.f84736a;
                g gVar3 = localDateTime2.f84531a;
                objectOutput.writeInt(gVar3.f84661a);
                objectOutput.writeByte(gVar3.f84662b);
                objectOutput.writeByte(gVar3.f84663c);
                localDateTime2.f84532b.R(objectOutput);
                zVar.f84737b.L(objectOutput);
                zVar.f84738c.F(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((x) obj).f84733a);
                return;
            case 8:
                ((ZoneOffset) obj).L(objectOutput);
                return;
            case 9:
                p pVar = (p) obj;
                pVar.f84684a.R(objectOutput);
                pVar.f84685b.L(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                LocalDateTime localDateTime3 = offsetDateTime.f84534a;
                g gVar4 = localDateTime3.f84531a;
                objectOutput.writeInt(gVar4.f84661a);
                objectOutput.writeByte(gVar4.f84662b);
                objectOutput.writeByte(gVar4.f84663c);
                localDateTime3.f84532b.R(objectOutput);
                offsetDateTime.f84535b.L(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((t) obj).f84695a);
                return;
            case 12:
                v vVar = (v) obj;
                objectOutput.writeInt(vVar.f84730a);
                objectOutput.writeByte(vVar.f84731b);
                return;
            case 13:
                n nVar = (n) obj;
                objectOutput.writeByte(nVar.f84680a);
                objectOutput.writeByte(nVar.f84681b);
                return;
            case 14:
                q qVar = (q) obj;
                objectOutput.writeInt(qVar.f84687a);
                objectOutput.writeInt(qVar.f84688b);
                objectOutput.writeInt(qVar.f84689c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b10 = objectInput.readByte();
        this.f84690a = b10;
        this.f84691b = a(b10, objectInput);
    }

    public static Serializable a(byte b10, ObjectInput objectInput) throws IOException {
        switch (b10) {
            case 1:
                Duration duration = Duration.f84523c;
                long j10 = objectInput.readLong();
                long j11 = objectInput.readInt();
                return Duration.j(j$.com.android.tools.r8.a.u(j10, j$.com.android.tools.r8.a.y(j11, 1000000000L)), (int) j$.com.android.tools.r8.a.x(j11, 1000000000L));
            case 2:
                Instant instant = Instant.f84526c;
                return Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                g gVar = g.f84659d;
                return g.K(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return j.M(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.f84529c;
                g gVar2 = g.f84659d;
                return LocalDateTime.F(g.K(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j.M(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.f84529c;
                g gVar3 = g.f84659d;
                LocalDateTime localDateTimeF = LocalDateTime.F(g.K(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j.M(objectInput));
                ZoneOffset zoneOffsetK = ZoneOffset.K(objectInput);
                w wVar = (w) a(objectInput.readByte(), objectInput);
                Objects.requireNonNull(localDateTimeF, "localDateTime");
                Objects.requireNonNull(zoneOffsetK, "offset");
                Objects.requireNonNull(wVar, "zone");
                if (!(wVar instanceof ZoneOffset) || zoneOffsetK.equals(wVar)) {
                    return new z(localDateTimeF, wVar, zoneOffsetK);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i10 = x.f84732c;
                String utf = objectInput.readUTF();
                Objects.requireNonNull(utf, "zoneId");
                return (utf.length() <= 1 || utf.startsWith("+") || utf.startsWith(TokenBuilder.TOKEN_DELIMITER)) ? ZoneOffset.G(utf) : (utf.startsWith("UTC") || utf.startsWith("GMT")) ? w.E(utf, 3) : utf.startsWith("UT") ? w.E(utf, 2) : x.G(utf);
            case 8:
                return ZoneOffset.K(objectInput);
            case 9:
                int i11 = p.f84683c;
                return new p(j.M(objectInput), ZoneOffset.K(objectInput));
            case 10:
                int i12 = OffsetDateTime.f84533c;
                g gVar4 = g.f84659d;
                return new OffsetDateTime(LocalDateTime.F(g.K(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j.M(objectInput)), ZoneOffset.K(objectInput));
            case 11:
                int i13 = t.f84694b;
                return t.C(objectInput.readInt());
            case 12:
                int i14 = v.f84729c;
                int i15 = objectInput.readInt();
                byte b11 = objectInput.readByte();
                j$.time.temporal.a.YEAR.w(i15);
                j$.time.temporal.a.MONTH_OF_YEAR.w(b11);
                return new v(i15, b11);
            case 13:
                int i16 = n.f84679c;
                byte b12 = objectInput.readByte();
                byte b13 = objectInput.readByte();
                l lVarF = l.F(b12);
                Objects.requireNonNull(lVarF, "month");
                j$.time.temporal.a.DAY_OF_MONTH.w(b13);
                if (b13 <= lVarF.E()) {
                    return new n(lVarF.getValue(), b13);
                }
                throw new b("Illegal value for DayOfMonth field, value " + ((int) b13) + " is not valid for month " + lVarF.name());
            case 14:
                q qVar = q.f84686d;
                int i17 = objectInput.readInt();
                int i18 = objectInput.readInt();
                int i19 = objectInput.readInt();
                return ((i17 | i18) | i19) == 0 ? q.f84686d : new q(i17, i18, i19);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f84691b;
    }
}
