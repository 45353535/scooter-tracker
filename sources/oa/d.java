package oa;

import java.util.ArrayList;
import java.util.List;
import r9.f;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f96491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f96492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f96493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f96494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f96495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f96496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f96497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f96498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f96499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f96500j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f96501k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f96502l;

    private d(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, String str) {
        this.f96491a = list;
        this.f96492b = i10;
        this.f96493c = i11;
        this.f96494d = i12;
        this.f96495e = i13;
        this.f96496f = i14;
        this.f96497g = i15;
        this.f96498h = i16;
        this.f96499i = i17;
        this.f96500j = i18;
        this.f96501k = f10;
        this.f96502l = str;
    }

    private static byte[] a(q9.d0 d0Var) {
        int iP = d0Var.P();
        int iF = d0Var.f();
        d0Var.X(iP);
        return q9.i.g(d0Var.e(), iF, iP);
    }

    public static d b(q9.d0 d0Var) throws n9.x {
        String strD;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17;
        try {
            d0Var.X(4);
            int iH = (d0Var.H() & 3) + 1;
            if (iH == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iH2 = d0Var.H() & 31;
            for (int i18 = 0; i18 < iH2; i18++) {
                arrayList.add(a(d0Var));
            }
            int iH3 = d0Var.H();
            for (int i19 = 0; i19 < iH3; i19++) {
                arrayList.add(a(d0Var));
            }
            if (iH2 > 0) {
                f.m mVarC = r9.f.C((byte[]) arrayList.get(0), r9.f.f99242a.length, ((byte[]) arrayList.get(0)).length);
                int i20 = mVarC.f99307f;
                int i21 = mVarC.f99308g;
                int i22 = mVarC.f99310i + 8;
                int i23 = mVarC.f99311j + 8;
                int i24 = mVarC.f99318q;
                int i25 = mVarC.f99319r;
                int i26 = mVarC.f99320s;
                int i27 = mVarC.f99321t;
                float f11 = mVarC.f99309h;
                strD = q9.i.d(mVarC.f99302a, mVarC.f99303b, mVarC.f99304c);
                i14 = i26;
                i15 = i27;
                f10 = f11;
                i13 = i23;
                i16 = i24;
                i17 = i25;
                i10 = i20;
                i11 = i21;
                i12 = i22;
            } else {
                strD = null;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = 16;
                f10 = 1.0f;
                i16 = -1;
                i17 = -1;
            }
            return new d(arrayList, iH, i10, i11, i12, i13, i16, i17, i14, i15, f10, strD);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw n9.x.a("Error parsing AVC config", e10);
        }
    }
}
