package j$.time.chrono;

import androidx.exifinterface.media.ExifInterface;
import j$.time.LocalDateTime;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends AbstractC5638a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f84589c = new t();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.m
    public final n A(int i10) {
        if (i10 == 0) {
            return u.BCE;
        }
        if (i10 == 1) {
            return u.CE;
        }
        throw new j$.time.b("Invalid era: " + i10);
    }

    @Override // j$.time.chrono.m
    public final String i() {
        return ExifInterface.TAG_RW2_ISO;
    }

    @Override // j$.time.chrono.m
    public final String s() {
        return "iso8601";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC5639b l(j$.time.temporal.n nVar) {
        return j$.time.g.E(nVar);
    }

    private t() {
    }

    @Override // j$.time.chrono.AbstractC5638a, j$.time.chrono.m
    public final InterfaceC5642e o(LocalDateTime localDateTime) {
        return LocalDateTime.D(localDateTime);
    }

    public static boolean k(long j10) {
        if ((3 & j10) == 0) {
            return j10 % 100 != 0 || j10 % 400 == 0;
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new F((byte) 1, this);
    }
}
