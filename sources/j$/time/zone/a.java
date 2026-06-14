package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f84739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Serializable f84740b;

    public a() {
    }

    public a(byte b10, Serializable serializable) {
        this.f84739a = b10;
        this.f84740b = serializable;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b10 = this.f84739a;
        Serializable serializable = this.f84740b;
        objectOutput.writeByte(b10);
        if (b10 != 1) {
            if (b10 == 2) {
                b bVar = (b) serializable;
                c(bVar.f84741a, objectOutput);
                d(bVar.f84743c, objectOutput);
                d(bVar.f84744d, objectOutput);
                return;
            }
            if (b10 == 3) {
                ((e) serializable).writeExternal(objectOutput);
                return;
            } else {
                if (b10 != 100) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                objectOutput.writeUTF(((f) serializable).f84766g.getID());
                return;
            }
        }
        f fVar = (f) serializable;
        long[] jArr = fVar.f84760a;
        objectOutput.writeInt(jArr.length);
        for (long j10 : jArr) {
            c(j10, objectOutput);
        }
        for (ZoneOffset zoneOffset : fVar.f84761b) {
            d(zoneOffset, objectOutput);
        }
        long[] jArr2 = fVar.f84762c;
        objectOutput.writeInt(jArr2.length);
        for (long j11 : jArr2) {
            c(j11, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : fVar.f84764e) {
            d(zoneOffset2, objectOutput);
        }
        e[] eVarArr = fVar.f84765f;
        objectOutput.writeByte(eVarArr.length);
        for (e eVar : eVarArr) {
            eVar.writeExternal(objectOutput);
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Serializable fVar;
        byte b10 = objectInput.readByte();
        this.f84739a = b10;
        if (b10 == 1) {
            int i10 = objectInput.readInt();
            long[] jArr = f.f84756i;
            long[] jArr2 = i10 == 0 ? jArr : new long[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                jArr2[i11] = a(objectInput);
            }
            int i12 = i10 + 1;
            ZoneOffset[] zoneOffsetArr = new ZoneOffset[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                zoneOffsetArr[i13] = b(objectInput);
            }
            int i14 = objectInput.readInt();
            if (i14 != 0) {
                jArr = new long[i14];
            }
            long[] jArr3 = jArr;
            for (int i15 = 0; i15 < i14; i15++) {
                jArr3[i15] = a(objectInput);
            }
            int i16 = i14 + 1;
            ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i16];
            for (int i17 = 0; i17 < i16; i17++) {
                zoneOffsetArr2[i17] = b(objectInput);
            }
            int i18 = objectInput.readByte();
            e[] eVarArr = i18 == 0 ? f.f84757j : new e[i18];
            for (int i19 = 0; i19 < i18; i19++) {
                eVarArr[i19] = e.a(objectInput);
            }
            fVar = new f(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, eVarArr);
        } else if (b10 == 2) {
            long jA = a(objectInput);
            ZoneOffset zoneOffsetB = b(objectInput);
            ZoneOffset zoneOffsetB2 = b(objectInput);
            if (zoneOffsetB.equals(zoneOffsetB2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            fVar = new b(jA, zoneOffsetB, zoneOffsetB2);
        } else if (b10 == 3) {
            fVar = e.a(objectInput);
        } else {
            if (b10 != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            fVar = new f(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f84740b = fVar;
    }

    private Object readResolve() {
        return this.f84740b;
    }

    public static ZoneOffset b(ObjectInput objectInput) throws IOException {
        byte b10 = objectInput.readByte();
        return b10 == 127 ? ZoneOffset.I(objectInput.readInt()) : ZoneOffset.I(b10 * 900);
    }

    public static void c(long j10, ObjectOutput objectOutput) throws IOException {
        if (j10 >= -4575744000L && j10 < 10413792000L && j10 % 900 == 0) {
            int i10 = (int) ((j10 + 4575744000L) / 900);
            objectOutput.writeByte((i10 >>> 16) & 255);
            objectOutput.writeByte((i10 >>> 8) & 255);
            objectOutput.writeByte(i10 & 255);
            return;
        }
        objectOutput.writeByte(255);
        objectOutput.writeLong(j10);
    }

    public static long a(ObjectInput objectInput) {
        int i10 = objectInput.readByte() & 255;
        if (i10 == 255) {
            return objectInput.readLong();
        }
        return (((long) (((i10 << 16) + ((objectInput.readByte() & 255) << 8)) + (objectInput.readByte() & 255))) * 900) - 4575744000L;
    }

    public static void d(ZoneOffset zoneOffset, ObjectOutput objectOutput) throws IOException {
        int i10 = zoneOffset.f84540a;
        int i11 = i10 % 900 == 0 ? i10 / 900 : 127;
        objectOutput.writeByte(i11);
        if (i11 == 127) {
            objectOutput.writeInt(i10);
        }
    }
}
