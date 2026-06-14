package yads;

import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public abstract class aj2 {
    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static zi2 a(byte[] bArr) {
        w92 w92Var = new w92(bArr);
        if (w92Var.f117358c < 32) {
            return null;
        }
        w92Var.e(0);
        if (w92Var.b() != (w92Var.f117358c - w92Var.f117357b) + 4 || w92Var.b() != 1886614376) {
            return null;
        }
        int iB = (w92Var.b() >> 24) & 255;
        if (iB > 1) {
            vd1.a("Unsupported pssh version: ", iB, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(w92Var.i(), w92Var.i());
        if (iB == 1) {
            w92Var.e(w92Var.f117357b + (w92Var.p() * 16));
        }
        int iP = w92Var.p();
        if (iP != w92Var.f117358c - w92Var.f117357b) {
            return null;
        }
        byte[] bArr2 = new byte[iP];
        w92Var.a(bArr2, 0, iP);
        return new zi2(uuid, iB, bArr2);
    }
}
