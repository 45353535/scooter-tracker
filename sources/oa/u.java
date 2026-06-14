package oa;

import java.io.EOFException;

/* JADX INFO: loaded from: classes12.dex */
public abstract class u {
    public static void a(boolean z10, String str) throws n9.x {
        if (!z10) {
            throw n9.x.a(str, null);
        }
    }

    public static boolean b(s sVar, byte[] bArr, int i10, int i11, boolean z10) throws EOFException {
        try {
            return sVar.peekFully(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static int c(s sVar, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int iPeek = sVar.peek(bArr, i10 + i12, i11 - i12);
            if (iPeek == -1) {
                break;
            }
            i12 += iPeek;
        }
        return i12;
    }

    public static boolean d(s sVar, byte[] bArr, int i10, int i11) {
        try {
            sVar.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(s sVar, int i10) {
        try {
            sVar.skipFully(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
