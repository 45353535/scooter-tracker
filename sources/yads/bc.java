package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class bc implements ao0 {
    public bc(int i10) {
        this((Object) null);
    }

    public final bo0[] a(zn0[] zn0VarArr, am amVar) {
        bo0 ccVar;
        nk2 nk2VarA = cc.a(zn0VarArr);
        bo0[] bo0VarArr = new bo0[zn0VarArr.length];
        for (int i10 = 0; i10 < zn0VarArr.length; i10++) {
            zn0 zn0Var = zn0VarArr[i10];
            if (zn0Var != null) {
                int[] iArr = zn0Var.f118743b;
                if (iArr.length != 0) {
                    if (iArr.length == 1) {
                        ccVar = new cu0(iArr[0], zn0Var.f118744c, zn0Var.f118742a);
                    } else {
                        long j10 = 25000;
                        ccVar = new cc(zn0Var.f118742a, iArr, zn0Var.f118744c, amVar, 10000, j10, j10, 1279, 719, 0.7f, 0.75f, (y31) nk2VarA.get(i10), hv.f111778a);
                    }
                    bo0VarArr[i10] = ccVar;
                }
            }
        }
        return bo0VarArr;
    }

    public bc(Object obj) {
    }
}
