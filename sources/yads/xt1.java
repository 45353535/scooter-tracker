package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class xt1 extends rw2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w92 f117960m = new w92();

    @Override // yads.rw2
    public final d23 a(byte[] bArr, int i10, boolean z10) throws f23 {
        a20 a20VarA;
        w92 w92Var = this.f117960m;
        w92Var.f117356a = bArr;
        w92Var.f117358c = i10;
        w92Var.f117357b = 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            w92 w92Var2 = this.f117960m;
            int i11 = w92Var2.f117358c - w92Var2.f117357b;
            if (i11 <= 0) {
                return new yt1(arrayList);
            }
            if (i11 < 8) {
                throw new f23("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iB = w92Var2.b();
            if (this.f117960m.b() == 1987343459) {
                w92 w92Var3 = this.f117960m;
                int i12 = iB - 8;
                CharSequence charSequenceA = null;
                z10 z10VarA = null;
                while (i12 > 0) {
                    if (i12 < 8) {
                        throw new f23("Incomplete vtt cue box header found.");
                    }
                    int iB2 = w92Var3.b();
                    int iB3 = w92Var3.b();
                    int i13 = iB2 - 8;
                    String strA = w83.a(w92Var3.f117356a, w92Var3.f117357b, i13);
                    w92Var3.e(w92Var3.f117357b + i13);
                    i12 = (i12 - 8) - i13;
                    if (iB3 == 1937011815) {
                        vl3 vl3Var = new vl3();
                        wl3.a(strA, vl3Var);
                        z10VarA = vl3Var.a();
                    } else if (iB3 == 1885436268) {
                        charSequenceA = wl3.a(null, strA.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceA == null) {
                    charSequenceA = "";
                }
                if (z10VarA != null) {
                    z10VarA.f118490a = charSequenceA;
                    a20VarA = z10VarA.a();
                } else {
                    Pattern pattern = wl3.f117512a;
                    vl3 vl3Var2 = new vl3();
                    vl3Var2.f117083c = charSequenceA;
                    a20VarA = vl3Var2.a().a();
                }
                arrayList.add(a20VarA);
            } else {
                w92 w92Var4 = this.f117960m;
                w92Var4.e(w92Var4.f117357b + (iB - 8));
            }
        }
    }
}
