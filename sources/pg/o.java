package pg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {
    public static final int a(m mVar, byte b10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (i10 < 0 || i10 >= mVar.j()) {
            throw new IllegalArgumentException(String.valueOf(i10).toString());
        }
        if (i10 > i11 || i11 > mVar.j()) {
            throw new IllegalArgumentException(String.valueOf(i11).toString());
        }
        int iF = mVar.f();
        byte[] bArrB = mVar.b(true);
        while (i10 < i11) {
            if (bArrB[iF + i10] == b10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final boolean b(m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return mVar.j() == 0;
    }
}
