package yads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zl3 implements d23 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f118736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f118737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f118738d;

    public zl3(ArrayList arrayList) {
        this.f118736b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.f118737c = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            rl3 rl3Var = (rl3) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f118737c;
            jArr[i11] = rl3Var.f115499b;
            jArr[i11 + 1] = rl3Var.f115500c;
        }
        long[] jArr2 = this.f118737c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f118738d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // yads.d23
    public final long a(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        long[] jArr = this.f118738d;
        if (i10 < jArr.length) {
            return jArr[i10];
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.d23
    public final List b(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f118736b.size(); i10++) {
            long[] jArr = this.f118737c;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                rl3 rl3Var = (rl3) this.f118736b.get(i10);
                a20 a20Var = rl3Var.f115498a;
                if (a20Var.f108524f == -3.4028235E38f) {
                    arrayList2.add(rl3Var);
                } else {
                    arrayList.add(a20Var);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: yads.u71
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((rl3) obj).f115499b, ((rl3) obj2).f115499b);
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            a20 a20Var2 = ((rl3) arrayList2.get(i12)).f115498a;
            a20Var2.getClass();
            arrayList.add(new a20(a20Var2.f108520b, a20Var2.f108521c, a20Var2.f108522d, a20Var2.f108523e, (-1) - i12, 1, a20Var2.f108526h, a20Var2.f108527i, a20Var2.f108528j, a20Var2.f108533o, a20Var2.f108534p, a20Var2.f108529k, a20Var2.f108530l, a20Var2.f108531m, a20Var2.f108532n, a20Var2.f108535q, a20Var2.f108536r));
        }
        return arrayList;
    }

    @Override // yads.d23
    public final int a() {
        return this.f118738d.length;
    }

    @Override // yads.d23
    public final int a(long j10) {
        int iA = w83.a(this.f118738d, j10, false);
        if (iA < this.f118738d.length) {
            return iA;
        }
        return -1;
    }
}
