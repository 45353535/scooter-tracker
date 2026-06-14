package ib;

import java.nio.ByteBuffer;
import java.util.UUID;
import q9.d0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class p {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f74119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f74120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f74121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final UUID[] f74122d;

        a(UUID uuid, int i10, byte[] bArr, UUID[] uuidArr) {
            this.f74119a = uuid;
            this.f74120b = i10;
            this.f74121c = bArr;
            this.f74122d = uuidArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
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
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    public static a d(byte[] bArr) {
        UUID[] uuidArr;
        d0 d0Var = new d0(bArr);
        if (d0Var.g() < 32) {
            return null;
        }
        d0Var.W(0);
        int iA = d0Var.a();
        int iQ = d0Var.q();
        if (iQ != iA) {
            q9.u.h("PsshAtomUtil", "Advertised atom size (" + iQ + ") does not match buffer size: " + iA);
            return null;
        }
        int iQ2 = d0Var.q();
        if (iQ2 != 1886614376) {
            q9.u.h("PsshAtomUtil", "Atom type is not pssh: " + iQ2);
            return null;
        }
        int iP = b.p(d0Var.q());
        if (iP > 1) {
            q9.u.h("PsshAtomUtil", "Unsupported pssh version: " + iP);
            return null;
        }
        UUID uuid = new UUID(d0Var.A(), d0Var.A());
        if (iP == 1) {
            int iL = d0Var.L();
            uuidArr = new UUID[iL];
            for (int i10 = 0; i10 < iL; i10++) {
                uuidArr[i10] = new UUID(d0Var.A(), d0Var.A());
            }
        } else {
            uuidArr = null;
        }
        int iL2 = d0Var.L();
        int iA2 = d0Var.a();
        if (iL2 == iA2) {
            byte[] bArr2 = new byte[iL2];
            d0Var.l(bArr2, 0, iL2);
            return new a(uuid, iP, bArr2, uuidArr);
        }
        q9.u.h("PsshAtomUtil", "Atom data size (" + iL2 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        if (uuid.equals(aVarD.f74119a)) {
            return aVarD.f74121c;
        }
        q9.u.h("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + aVarD.f74119a + ".");
        return null;
    }

    public static UUID f(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        return aVarD.f74119a;
    }

    public static int g(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return -1;
        }
        return aVarD.f74120b;
    }
}
