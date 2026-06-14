package j$.time.chrono;

import j$.time.ZoneOffset;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes2.dex */
public final class F implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f84549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f84550b;

    public F() {
    }

    public F(byte b10, Object obj) {
        this.f84549a = b10;
        this.f84550b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b10 = this.f84549a;
        Object obj = this.f84550b;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                objectOutput.writeUTF(((AbstractC5638a) obj).i());
                return;
            case 2:
                C5644g c5644g = (C5644g) obj;
                objectOutput.writeObject(c5644g.f84560a);
                objectOutput.writeObject(c5644g.f84561b);
                return;
            case 3:
                l lVar = (l) obj;
                objectOutput.writeObject(lVar.f84569a);
                objectOutput.writeObject(lVar.f84570b);
                objectOutput.writeObject(lVar.f84571c);
                return;
            case 4:
                y yVar = (y) obj;
                yVar.getClass();
                objectOutput.writeInt(j$.time.temporal.r.a(yVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(yVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(yVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((z) obj).f84600a);
                return;
            case 6:
                r rVar = (r) obj;
                objectOutput.writeObject(rVar.f84584a);
                objectOutput.writeInt(j$.time.temporal.r.a(rVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(rVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(rVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 7:
                D d10 = (D) obj;
                d10.getClass();
                objectOutput.writeInt(j$.time.temporal.r.a(d10, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(d10, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(d10, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                J j10 = (J) obj;
                j10.getClass();
                objectOutput.writeInt(j$.time.temporal.r.a(j10, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(j10, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.r.a(j10, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                C5645h c5645h = (C5645h) obj;
                objectOutput.writeUTF(c5645h.f84563a.i());
                objectOutput.writeInt(c5645h.f84564b);
                objectOutput.writeInt(c5645h.f84565c);
                objectOutput.writeInt(c5645h.f84566d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objC;
        byte b10 = objectInput.readByte();
        this.f84549a = b10;
        switch (b10) {
            case 1:
                ConcurrentHashMap concurrentHashMap = AbstractC5638a.f84556a;
                objC = j$.com.android.tools.r8.a.C(objectInput.readUTF());
                break;
            case 2:
                objC = ((InterfaceC5639b) objectInput.readObject()).v((j$.time.j) objectInput.readObject());
                break;
            case 3:
                objC = ((InterfaceC5642e) objectInput.readObject()).q((ZoneOffset) objectInput.readObject()).h((j$.time.w) objectInput.readObject());
                break;
            case 4:
                j$.time.g gVar = y.f84594d;
                int i10 = objectInput.readInt();
                byte b11 = objectInput.readByte();
                byte b12 = objectInput.readByte();
                w.f84592c.getClass();
                objC = new y(j$.time.g.K(i10, b11, b12));
                break;
            case 5:
                z zVar = z.f84598d;
                objC = z.o(objectInput.readByte());
                break;
            case 6:
                p pVar = (p) objectInput.readObject();
                int i11 = objectInput.readInt();
                byte b13 = objectInput.readByte();
                byte b14 = objectInput.readByte();
                pVar.getClass();
                objC = new r(pVar, i11, b13, b14);
                break;
            case 7:
                int i12 = objectInput.readInt();
                byte b15 = objectInput.readByte();
                byte b16 = objectInput.readByte();
                B.f84545c.getClass();
                objC = new D(j$.time.g.K(i12 + 1911, b15, b16));
                break;
            case 8:
                int i13 = objectInput.readInt();
                byte b17 = objectInput.readByte();
                byte b18 = objectInput.readByte();
                H.f84552c.getClass();
                objC = new J(j$.time.g.K(i13 - 543, b17, b18));
                break;
            case 9:
                int i14 = C5645h.f84562e;
                objC = new C5645h(j$.com.android.tools.r8.a.C(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f84550b = objC;
    }

    private Object readResolve() {
        return this.f84550b;
    }
}
