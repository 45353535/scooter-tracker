package ja;

import android.os.SystemClock;
import com.google.common.collect.ImmutableList;
import ga.m1;
import ja.t;
import java.util.Arrays;
import java.util.List;
import ka.m;
import n9.f0;
import n9.i0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class v {
    public static i0 a(t.a aVar, u[] uVarArr) {
        List[] listArr = new List[uVarArr.length];
        for (int i10 = 0; i10 < uVarArr.length; i10++) {
            u uVar = uVarArr[i10];
            listArr[i10] = uVar != null ? ImmutableList.of(uVar) : ImmutableList.of();
        }
        return b(aVar, listArr);
    }

    public static i0 b(t.a aVar, List[] listArr) {
        boolean z10;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            m1 m1VarF = aVar.f(i10);
            List list = listArr[i10];
            for (int i11 = 0; i11 < m1VarF.f72380a; i11++) {
                f0 f0VarB = m1VarF.b(i11);
                boolean z11 = aVar.a(i10, i11, false) != 0;
                int i12 = f0VarB.f95294a;
                int[] iArr = new int[i12];
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 < f0VarB.f95294a; i13++) {
                    iArr[i13] = aVar.g(i10, i11, i13);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        u uVar = (u) list.get(i14);
                        if (uVar.getTrackGroup().equals(f0VarB) && uVar.indexOf(i13) != -1) {
                            z10 = true;
                            break;
                        }
                        i14++;
                    }
                    zArr[i13] = z10;
                }
                builder.add(new i0.a(f0VarB, z11, iArr, zArr));
            }
        }
        m1 m1VarH = aVar.h();
        for (int i15 = 0; i15 < m1VarH.f72380a; i15++) {
            f0 f0VarB2 = m1VarH.b(i15);
            int[] iArr2 = new int[f0VarB2.f95294a];
            Arrays.fill(iArr2, 0);
            builder.add(new i0.a(f0VarB2, false, iArr2, new boolean[f0VarB2.f95294a]));
        }
        return new i0(builder.build());
    }

    public static m.a c(r rVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = rVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (rVar.isTrackExcluded(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        return new m.a(1, 0, length, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Point d(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto Lf
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L8
            r1 = r0
            goto L9
        L8:
            r1 = r3
        L9:
            if (r4 <= r5) goto Lc
            r3 = r0
        Lc:
            if (r1 == r3) goto Lf
            goto L12
        Lf:
            r2 = r5
            r5 = r4
            r4 = r2
        L12:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L22
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = q9.o0.k(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = q9.o0.k(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.v.d(boolean, int, int, int, int):android.graphics.Point");
    }
}
