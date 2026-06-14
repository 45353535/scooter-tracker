package yads;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d41 extends s31 implements Set {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient y31 f109753c;

    public static d41 b(int i10, Object... objArr) {
        if (i10 == 0) {
            return tk2.f116278j;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new jx2(obj);
        }
        int iA = a(i10);
        Object[] objArr2 = new Object[iA];
        int i11 = iA - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                throw new NullPointerException(he2.a("at index ", i14));
            }
            int iHashCode = obj2.hashCode();
            int iA2 = az0.a(iHashCode);
            while (true) {
                int i15 = iA2 & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iA2++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new jx2(obj4);
        }
        if (a(i13) < iA / 2) {
            return b(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new tk2(objArr, i12, objArr2, i11, i13);
    }

    @Override // yads.s31
    public y31 a() {
        y31 y31Var = this.f109753c;
        if (y31Var != null) {
            return y31Var;
        }
        y31 y31VarF = f();
        this.f109753c = y31VarF;
        return y31VarF;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof d41) && (this instanceof tk2)) {
            d41 d41Var = (d41) obj;
            d41Var.getClass();
            if ((d41Var instanceof tk2) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return yv2.a(this, obj);
    }

    public y31 f() {
        Object[] array = toArray(s31.f115679b);
        v31 v31Var = y31.f118068c;
        return y31.b(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return yv2.a(this);
    }

    @Override // yads.s31
    public Object writeReplace() {
        return new c41(toArray(s31.f115679b));
    }

    public static int a(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static d41 a(Set set) {
        if ((set instanceof d41) && !(set instanceof SortedSet)) {
            d41 d41Var = (d41) set;
            if (!d41Var.e()) {
                return d41Var;
            }
        }
        Object[] array = set.toArray();
        return b(array.length, array);
    }
}
