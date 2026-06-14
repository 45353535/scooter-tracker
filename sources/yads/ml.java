package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f113544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f113545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f113546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f113547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f113548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f113549f;

    public ml(ArrayList arrayList, int i10, int i11, int i12, float f10, String str) {
        this.f113544a = arrayList;
        this.f113545b = i10;
        this.f113546c = i11;
        this.f113547d = i12;
        this.f113548e = f10;
        this.f113549f = str;
    }

    public static ml a(w92 w92Var) throws ba2 {
        float f10;
        String str;
        int i10;
        int i11;
        try {
            w92Var.e(w92Var.f117357b + 4);
            int iM = (w92Var.m() & 3) + 1;
            if (iM == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM2 = w92Var.m() & 31;
            for (int i12 = 0; i12 < iM2; i12++) {
                int iR = w92Var.r();
                int i13 = w92Var.f117357b;
                w92Var.e(i13 + iR);
                byte[] bArr = w92Var.f117356a;
                byte[] bArr2 = new byte[iR + 4];
                System.arraycopy(tw.f116400a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i13, bArr2, 4, iR);
                arrayList.add(bArr2);
            }
            int iM3 = w92Var.m();
            for (int i14 = 0; i14 < iM3; i14++) {
                int iR2 = w92Var.r();
                int i15 = w92Var.f117357b;
                w92Var.e(i15 + iR2);
                byte[] bArr3 = w92Var.f117356a;
                byte[] bArr4 = new byte[iR2 + 4];
                System.arraycopy(tw.f116400a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i15, bArr4, 4, iR2);
                arrayList.add(bArr4);
            }
            if (iM2 > 0) {
                ow1 ow1VarB = pw1.b((byte[]) arrayList.get(0), iM, ((byte[]) arrayList.get(0)).length);
                int i16 = ow1VarB.f114429e;
                int i17 = ow1VarB.f114430f;
                f10 = ow1VarB.f114431g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(ow1VarB.f114425a), Integer.valueOf(ow1VarB.f114426b), Integer.valueOf(ow1VarB.f114427c));
                i10 = i16;
                i11 = i17;
            } else {
                f10 = 1.0f;
                str = null;
                i10 = -1;
                i11 = -1;
            }
            return new ml(arrayList, iM, i10, i11, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new ba2("Error parsing AVC config", e10, true, 1);
        }
    }
}
