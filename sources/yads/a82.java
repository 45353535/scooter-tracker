package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class a82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b82 f108598a = new b82();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w92 f108599b = new w92(0, new byte[65025]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f108600c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f108601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f108602e;

    public final boolean a(yc0 yc0Var) throws InterruptedIOException {
        int i10;
        int i11;
        int i12;
        if (this.f108602e) {
            this.f108602e = false;
            this.f108599b.c(0);
        }
        while (true) {
            if (this.f108602e) {
                return true;
            }
            if (this.f108600c < 0) {
                if (!this.f108598a.a(yc0Var, -1L) || !this.f108598a.a(yc0Var, true)) {
                    break;
                }
                b82 b82Var = this.f108598a;
                int i13 = b82Var.f108936d;
                if ((b82Var.f108933a & 1) == 1 && this.f108599b.f117358c == 0) {
                    this.f108601d = 0;
                    int i14 = 0;
                    do {
                        int i15 = this.f108601d;
                        b82 b82Var2 = this.f108598a;
                        if (i15 >= b82Var2.f108935c) {
                            break;
                        }
                        int[] iArr = b82Var2.f108938f;
                        this.f108601d = i15 + 1;
                        i12 = iArr[i15];
                        i14 += i12;
                    } while (i12 == 255);
                    i13 += i14;
                    i11 = this.f108601d;
                } else {
                    i11 = 0;
                }
                try {
                    yc0Var.a(i13);
                    this.f108600c = i11;
                } catch (EOFException unused) {
                }
            }
            int i16 = this.f108600c;
            this.f108601d = 0;
            int i17 = 0;
            do {
                int i18 = this.f108601d;
                int i19 = i16 + i18;
                b82 b82Var3 = this.f108598a;
                if (i19 >= b82Var3.f108935c) {
                    break;
                }
                int[] iArr2 = b82Var3.f108938f;
                this.f108601d = i18 + 1;
                i10 = iArr2[i19];
                i17 += i10;
            } while (i10 == 255);
            int i20 = this.f108600c + this.f108601d;
            if (i17 > 0) {
                w92 w92Var = this.f108599b;
                w92Var.a(w92Var.f117358c + i17);
                w92 w92Var2 = this.f108599b;
                try {
                    yc0Var.a(w92Var2.f117356a, w92Var2.f117358c, i17, false);
                    w92 w92Var3 = this.f108599b;
                    w92Var3.d(w92Var3.f117358c + i17);
                    this.f108602e = this.f108598a.f108938f[i20 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i20 == this.f108598a.f108935c) {
                i20 = -1;
            }
            this.f108600c = i20;
        }
        return false;
    }

    public final void a() {
        w92 w92Var = this.f108599b;
        byte[] bArr = w92Var.f117356a;
        if (bArr.length == 65025) {
            return;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, Math.max(65025, w92Var.f117358c));
        int i10 = this.f108599b.f117358c;
        w92Var.f117356a = bArrCopyOf;
        w92Var.f117358c = i10;
        w92Var.f117357b = 0;
    }
}
