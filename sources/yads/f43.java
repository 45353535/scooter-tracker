package yads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f43 implements oq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b43 f110599b = new b43();

    static {
        new nq() { // from class: yads.p6
            @Override // yads.nq
            public final oq fromBundle(Bundle bundle) {
                return f43.a(bundle);
            }
        };
    }

    public static f43 a(Bundle bundle) {
        nk2 nk2VarA = a(e43.f110186v, mq.a(bundle, Integer.toString(0, 36)));
        nk2 nk2VarA2 = a(c43.f109213i, mq.a(bundle, Integer.toString(1, 36)));
        int[] intArray = bundle.getIntArray(Integer.toString(2, 36));
        if (intArray == null) {
            int i10 = nk2VarA.f113954e;
            int[] iArr = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                iArr[i11] = i11;
            }
            intArray = iArr;
        }
        return new d43(nk2VarA, nk2VarA2, intArray);
    }

    public abstract int a();

    public abstract int a(Object obj);

    public abstract Object a(int i10);

    public abstract c43 a(int i10, c43 c43Var, boolean z10);

    public abstract e43 a(int i10, e43 e43Var, long j10);

    public abstract int b();

    public int b(boolean z10) {
        if (c()) {
            return -1;
        }
        return b() - 1;
    }

    public final boolean c() {
        return b() == 0;
    }

    public final boolean equals(Object obj) {
        int iB;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f43)) {
            return false;
        }
        f43 f43Var = (f43) obj;
        if (f43Var.b() != b() || f43Var.a() != a()) {
            return false;
        }
        e43 e43Var = new e43();
        c43 c43Var = new c43();
        e43 e43Var2 = new e43();
        c43 c43Var2 = new c43();
        for (int i10 = 0; i10 < b(); i10++) {
            if (!a(i10, e43Var, 0L).equals(f43Var.a(i10, e43Var2, 0L))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < a(); i11++) {
            if (!a(i11, c43Var, true).equals(f43Var.a(i11, c43Var2, true))) {
                return false;
            }
        }
        int iA = a(true);
        if (iA != f43Var.a(true) || (iB = b(true)) != f43Var.b(true)) {
            return false;
        }
        while (iA != iB) {
            int iA2 = a(iA, 0, true);
            if (iA2 != f43Var.a(iA, 0, true)) {
                return false;
            }
            iA = iA2;
        }
        return true;
    }

    public final int hashCode() {
        e43 e43Var = new e43();
        c43 c43Var = new c43();
        int iB = b() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE;
        for (int i10 = 0; i10 < b(); i10++) {
            iB = (iB * 31) + a(i10, e43Var, 0L).hashCode();
        }
        int iA = a() + (iB * 31);
        for (int i11 = 0; i11 < a(); i11++) {
            iA = (iA * 31) + a(i11, c43Var, true).hashCode();
        }
        int iA2 = a(true);
        while (iA2 != -1) {
            iA = (iA * 31) + iA2;
            iA2 = a(iA2, 0, true);
        }
        return iA;
    }

    public int b(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == a(z10) ? b(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public static nk2 a(nq nqVar, IBinder iBinder) {
        int i10;
        if (iBinder == null) {
            v31 v31Var = y31.f118068c;
            return nk2.f113952f;
        }
        uw.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i11 = lq.f113186b;
        v31 v31Var2 = y31.f118068c;
        uw.a(4, "initialCapacity");
        Object[] objArrCopyOf2 = new Object[4];
        int i12 = 0;
        int i13 = 1;
        int i14 = 0;
        int i15 = 0;
        while (i13 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i15);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i10 = parcelObtain2.readInt();
                        if (i10 == 1) {
                            Bundle bundle = parcelObtain2.readBundle();
                            bundle.getClass();
                            int i16 = i14 + 1;
                            if (objArrCopyOf2.length < i16) {
                                objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, r31.a(objArrCopyOf2.length, i16));
                            }
                            objArrCopyOf2[i14] = bundle;
                            i15++;
                            i14 = i16;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i13 = i10;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th2;
            }
        }
        nk2 nk2VarB = y31.b(i14, objArrCopyOf2);
        int i17 = 0;
        while (i12 < nk2VarB.f113954e) {
            oq oqVarFromBundle = nqVar.fromBundle((Bundle) nk2VarB.get(i12));
            oqVarFromBundle.getClass();
            int i18 = i17 + 1;
            if (objArrCopyOf.length < i18) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, r31.a(objArrCopyOf.length, i18));
            }
            objArrCopyOf[i17] = oqVarFromBundle;
            i12++;
            i17 = i18;
        }
        return y31.b(i17, objArrCopyOf);
    }

    public int a(boolean z10) {
        return c() ? -1 : 0;
    }

    public final int a(int i10, c43 c43Var, e43 e43Var, int i11, boolean z10) {
        int i12 = a(i10, c43Var, false).f109216d;
        if (a(i12, e43Var, 0L).f110202q != i10) {
            return i10 + 1;
        }
        int iA = a(i12, i11, z10);
        if (iA == -1) {
            return -1;
        }
        return a(iA, e43Var, 0L).f110201p;
    }

    public int a(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == b(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == b(z10) ? a(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public final c43 a(int i10, c43 c43Var) {
        return a(i10, c43Var, false);
    }

    public c43 a(Object obj, c43 c43Var) {
        return a(a(obj), c43Var, true);
    }

    public final Pair a(e43 e43Var, c43 c43Var, int i10, long j10) {
        Pair pairA = a(e43Var, c43Var, i10, j10, 0L);
        pairA.getClass();
        return pairA;
    }

    public final Pair a(e43 e43Var, c43 c43Var, int i10, long j10, long j11) {
        fi.a(i10, b());
        a(i10, e43Var, j11);
        if (j10 == -9223372036854775807L) {
            j10 = e43Var.f110199n;
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = e43Var.f110201p;
        a(i11, c43Var, false);
        while (i11 < e43Var.f110202q && c43Var.f109218f != j10) {
            int i12 = i11 + 1;
            if (a(i12, c43Var, false).f109218f > j10) {
                break;
            }
            i11 = i12;
        }
        a(i11, c43Var, true);
        long jMin = j10 - c43Var.f109218f;
        long j12 = c43Var.f109217e;
        if (j12 != -9223372036854775807L) {
            jMin = Math.min(jMin, j12 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = c43Var.f109215c;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public final e43 a(int i10, e43 e43Var) {
        return a(i10, e43Var, 0L);
    }
}
