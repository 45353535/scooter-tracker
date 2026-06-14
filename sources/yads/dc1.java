package yads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class dc1 extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f109875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f109877d;

    public dc1(int i10, int i11, int[] iArr) {
        this.f109875b = iArr;
        this.f109876c = i10;
        this.f109877d = i11;
    }

    public final int[] a() {
        return Arrays.copyOfRange(this.f109875b, this.f109876c, this.f109877d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int[] iArr = this.f109875b;
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f109876c;
        int i11 = this.f109877d;
        while (i10 < i11) {
            if (iArr[i10] == iIntValue) {
                return i10 != -1;
            }
            i10++;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dc1)) {
            return super.equals(obj);
        }
        dc1 dc1Var = (dc1) obj;
        int i10 = this.f109877d - this.f109876c;
        if (dc1Var.f109877d - dc1Var.f109876c != i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f109875b[this.f109876c + i11] != dc1Var.f109875b[dc1Var.f109876c + i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        ie2.a(i10, this.f109877d - this.f109876c);
        return Integer.valueOf(this.f109875b[this.f109876c + i10]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = this.f109876c; i11 < this.f109877d; i11++) {
            i10 = (i10 * 31) + this.f109875b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.f109875b;
            int iIntValue = ((Integer) obj).intValue();
            int i10 = this.f109876c;
            int i11 = this.f109877d;
            while (true) {
                if (i10 >= i11) {
                    i10 = -1;
                    break;
                }
                if (iArr[i10] == iIntValue) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                return i10 - this.f109876c;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.f109875b;
            int iIntValue = ((Integer) obj).intValue();
            int i10 = this.f109876c;
            int i11 = this.f109877d - 1;
            while (true) {
                if (i11 < i10) {
                    i11 = -1;
                    break;
                }
                if (iArr[i11] == iIntValue) {
                    break;
                }
                i11--;
            }
            if (i11 >= 0) {
                return i11 - this.f109876c;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        Integer num = (Integer) obj;
        ie2.a(i10, this.f109877d - this.f109876c);
        int[] iArr = this.f109875b;
        int i11 = this.f109876c + i10;
        int i12 = iArr[i11];
        num.getClass();
        iArr[i11] = num.intValue();
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f109877d - this.f109876c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        ie2.a(i10, i11, this.f109877d - this.f109876c);
        if (i10 == i11) {
            return Collections.EMPTY_LIST;
        }
        int[] iArr = this.f109875b;
        int i12 = this.f109876c;
        return new dc1(i10 + i12, i12 + i11, iArr);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f109877d - this.f109876c) * 5);
        sb2.append('[');
        sb2.append(this.f109875b[this.f109876c]);
        int i10 = this.f109876c;
        while (true) {
            i10++;
            if (i10 >= this.f109877d) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(this.f109875b[i10]);
        }
    }
}
