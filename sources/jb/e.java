package jb;

import java.util.Arrays;
import oa.s;
import oa.u;
import q9.d0;

/* JADX INFO: loaded from: classes12.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f85723a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f85724b = new d0(new byte[65025], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f85725c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f85726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f85727e;

    e() {
    }

    private int a(int i10) {
        int i11;
        int i12 = 0;
        this.f85726d = 0;
        do {
            int i13 = this.f85726d;
            int i14 = i10 + i13;
            f fVar = this.f85723a;
            if (i14 >= fVar.f85734g) {
                break;
            }
            int[] iArr = fVar.f85737j;
            this.f85726d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public f b() {
        return this.f85723a;
    }

    public d0 c() {
        return this.f85724b;
    }

    public boolean d(s sVar) {
        int i10;
        q9.a.g(sVar != null);
        if (this.f85727e) {
            this.f85727e = false;
            this.f85724b.S(0);
        }
        while (!this.f85727e) {
            if (this.f85725c < 0) {
                if (!this.f85723a.c(sVar) || !this.f85723a.a(sVar, true)) {
                    return false;
                }
                f fVar = this.f85723a;
                int iA = fVar.f85735h;
                if ((fVar.f85729b & 1) == 1 && this.f85724b.g() == 0) {
                    iA += a(0);
                    i10 = this.f85726d;
                } else {
                    i10 = 0;
                }
                if (!u.e(sVar, iA)) {
                    return false;
                }
                this.f85725c = i10;
            }
            int iA2 = a(this.f85725c);
            int i11 = this.f85725c + this.f85726d;
            if (iA2 > 0) {
                d0 d0Var = this.f85724b;
                d0Var.c(d0Var.g() + iA2);
                if (!u.d(sVar, this.f85724b.e(), this.f85724b.g(), iA2)) {
                    return false;
                }
                d0 d0Var2 = this.f85724b;
                d0Var2.V(d0Var2.g() + iA2);
                this.f85727e = this.f85723a.f85737j[i11 + (-1)] != 255;
            }
            if (i11 == this.f85723a.f85734g) {
                i11 = -1;
            }
            this.f85725c = i11;
        }
        return true;
    }

    public void e() {
        this.f85723a.b();
        this.f85724b.S(0);
        this.f85725c = -1;
        this.f85727e = false;
    }

    public void f() {
        if (this.f85724b.e().length == 65025) {
            return;
        }
        d0 d0Var = this.f85724b;
        d0Var.U(Arrays.copyOf(d0Var.e(), Math.max(65025, this.f85724b.g())), this.f85724b.g());
    }
}
