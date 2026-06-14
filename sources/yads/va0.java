package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class va0 implements ke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f116911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f116913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f116914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f116915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f116916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public je[] f116917g;

    public va0() {
        this(0);
    }

    public final synchronized je a() {
        je jeVar;
        try {
            int i10 = this.f116915e + 1;
            this.f116915e = i10;
            int i11 = this.f116916f;
            if (i11 > 0) {
                je[] jeVarArr = this.f116917g;
                int i12 = i11 - 1;
                this.f116916f = i12;
                jeVar = jeVarArr[i12];
                jeVar.getClass();
                this.f116917g[this.f116916f] = null;
            } else {
                je jeVar2 = new je(0, new byte[this.f116912b]);
                je[] jeVarArr2 = this.f116917g;
                if (i10 > jeVarArr2.length) {
                    this.f116917g = (je[]) Arrays.copyOf(jeVarArr2, jeVarArr2.length * 2);
                }
                jeVar = jeVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jeVar;
    }

    public final int b() {
        return this.f116912b;
    }

    public final synchronized void c() {
        try {
            int i10 = this.f116914d;
            int i11 = this.f116912b;
            int i12 = w83.f117341a;
            int i13 = (((i10 + i11) - 1) / i11) - this.f116915e;
            int i14 = 0;
            int iMax = Math.max(0, i13);
            int i15 = this.f116916f;
            if (iMax >= i15) {
                return;
            }
            if (this.f116913c != null) {
                int i16 = i15 - 1;
                while (i14 <= i16) {
                    je jeVar = this.f116917g[i14];
                    jeVar.getClass();
                    if (jeVar.f112328a == this.f116913c) {
                        i14++;
                    } else {
                        je jeVar2 = this.f116917g[i16];
                        jeVar2.getClass();
                        if (jeVar2.f112328a != this.f116913c) {
                            i16--;
                        } else {
                            je[] jeVarArr = this.f116917g;
                            jeVarArr[i14] = jeVar2;
                            jeVarArr[i16] = jeVar;
                            i16--;
                            i14++;
                        }
                    }
                }
                iMax = Math.max(iMax, i14);
                if (iMax >= this.f116916f) {
                    return;
                }
            }
            Arrays.fill(this.f116917g, iMax, this.f116916f, (Object) null);
            this.f116916f = iMax;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public va0(int i10) {
        this.f116911a = true;
        this.f116912b = 65536;
        this.f116916f = 0;
        this.f116917g = new je[100];
        this.f116913c = null;
    }

    public final synchronized void a(int i10) {
        boolean z10 = i10 < this.f116914d;
        this.f116914d = i10;
        if (z10) {
            c();
        }
    }
}
