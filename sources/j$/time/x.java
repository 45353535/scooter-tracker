package j$.time;

import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f84732c = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient j$.time.zone.f f84734b;

    public static x G(String str) {
        j$.time.zone.f fVarA;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i10 == 0) && ((cCharAt < '0' || cCharAt > '9' || i10 == 0) && ((cCharAt != '~' || i10 == 0) && ((cCharAt != '.' || i10 == 0) && ((cCharAt != '_' || i10 == 0) && ((cCharAt != '+' || i10 == 0) && (cCharAt != '-' || i10 == 0))))))))) {
                    throw new b("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                fVarA = j$.time.zone.i.a(str);
            } catch (j$.time.zone.g unused) {
                fVarA = null;
            }
            return new x(str, fVarA);
        }
        throw new b("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    public x(String str, j$.time.zone.f fVar) {
        this.f84733a = str;
        this.f84734b = fVar;
    }

    @Override // j$.time.w
    public final String i() {
        return this.f84733a;
    }

    @Override // j$.time.w
    public final j$.time.zone.f C() {
        j$.time.zone.f fVar = this.f84734b;
        return fVar != null ? fVar : j$.time.zone.i.a(this.f84733a);
    }

    private Object writeReplace() {
        return new r((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.w
    public final void F(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.f84733a);
    }
}
