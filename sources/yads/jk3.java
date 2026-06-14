package yads;

import android.util.Base64;
import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jk3 {
    public static gk3 a(w92 w92Var, boolean z10, boolean z11) throws ba2 {
        if (z10) {
            a(3, w92Var, false);
        }
        w92Var.a((int) w92Var.g(), st.f115925c);
        long jG = w92Var.g();
        String[] strArr = new String[(int) jG];
        for (int i10 = 0; i10 < jG; i10++) {
            strArr[i10] = w92Var.a((int) w92Var.g(), st.f115925c);
        }
        if (z11 && (w92Var.m() & 1) == 0) {
            throw new ba2("framing bit expected to be set", null, true, 1);
        }
        return new gk3(strArr);
    }

    public static ik3 a(w92 w92Var) throws ba2 {
        a(1, w92Var, false);
        int iD = w92Var.d();
        if (iD >= 0) {
            int iM = w92Var.m();
            int iD2 = w92Var.d();
            if (iD2 >= 0) {
                int iD3 = w92Var.d();
                int i10 = iD3 <= 0 ? -1 : iD3;
                int iD4 = w92Var.d();
                int i11 = iD4 <= 0 ? -1 : iD4;
                w92Var.d();
                int iM2 = w92Var.m();
                int iPow = (int) Math.pow(2.0d, iM2 & 15);
                int iPow2 = (int) Math.pow(2.0d, (iM2 & 240) >> 4);
                w92Var.m();
                return new ik3(iM, iD2, i10, i11, iPow, iPow2, Arrays.copyOf(w92Var.f117356a, w92Var.f117358c));
            }
            throw new IllegalStateException(he2.a("Top bit not zero: ", iD2));
        }
        throw new IllegalStateException(he2.a("Top bit not zero: ", iD));
    }

    public static boolean a(int i10, w92 w92Var, boolean z10) throws ba2 {
        if (w92Var.f117358c - w92Var.f117357b < 7) {
            if (z10) {
                return false;
            }
            throw new ba2("too short header: " + (w92Var.f117358c - w92Var.f117357b), null, true, 1);
        }
        if (w92Var.m() != i10) {
            if (z10) {
                return false;
            }
            throw new ba2("expected header type " + Integer.toHexString(i10), null, true, 1);
        }
        if (w92Var.m() == 118 && w92Var.m() == 111 && w92Var.m() == 114 && w92Var.m() == 98 && w92Var.m() == 105 && w92Var.m() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw new ba2("expected characters 'vorbis'", null, true, 1);
    }

    public static fr1 a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            int i11 = w83.f117341a;
            String[] strArrSplit = str.split(C4240b4.j.f42668b, 2);
            if (strArrSplit.length != 2) {
                uf1.d("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    w92 w92Var = new w92(Base64.decode(strArrSplit[1], 0));
                    int iB = w92Var.b();
                    String strA = w92Var.a(w92Var.b(), st.f115923a);
                    String strA2 = w92Var.a(w92Var.b(), st.f115925c);
                    int iB2 = w92Var.b();
                    int iB3 = w92Var.b();
                    int iB4 = w92Var.b();
                    int iB5 = w92Var.b();
                    int iB6 = w92Var.b();
                    byte[] bArr = new byte[iB6];
                    w92Var.a(bArr, 0, iB6);
                    arrayList.add(new nb2(iB, strA, strA2, iB2, iB3, iB4, iB5, bArr));
                } catch (RuntimeException e10) {
                    uf1.d("VorbisUtil", uf1.a("Failed to parse vorbis picture", e10));
                }
            } else {
                arrayList.add(new ck3(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new fr1(arrayList);
    }
}
