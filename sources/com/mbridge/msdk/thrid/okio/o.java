package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final byte[] f51765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f51766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f51767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f51768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f51769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    o f51770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    o f51771g;

    o() {
        this.f51765a = new byte[8192];
        this.f51769e = true;
        this.f51768d = false;
    }

    public final o a(o oVar) {
        oVar.f51771g = this;
        oVar.f51770f = this.f51770f;
        this.f51770f.f51771g = oVar;
        this.f51770f = oVar;
        return oVar;
    }

    @Nullable
    public final o b() {
        o oVar = this.f51770f;
        o oVar2 = oVar != this ? oVar : null;
        o oVar3 = this.f51771g;
        oVar3.f51770f = oVar;
        this.f51770f.f51771g = oVar3;
        this.f51770f = null;
        this.f51771g = null;
        return oVar2;
    }

    final o c() {
        this.f51768d = true;
        return new o(this.f51765a, this.f51766b, this.f51767c, true, false);
    }

    o(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.f51765a = bArr;
        this.f51766b = i10;
        this.f51767c = i11;
        this.f51768d = z10;
        this.f51769e = z11;
    }

    public final o a(int i10) {
        o oVarA;
        if (i10 > 0 && i10 <= this.f51767c - this.f51766b) {
            if (i10 >= 1024) {
                oVarA = c();
            } else {
                oVarA = p.a();
                System.arraycopy(this.f51765a, this.f51766b, oVarA.f51765a, 0, i10);
            }
            oVarA.f51767c = oVarA.f51766b + i10;
            this.f51766b += i10;
            this.f51771g.a(oVarA);
            return oVarA;
        }
        throw new IllegalArgumentException();
    }

    public final void a() {
        o oVar = this.f51771g;
        if (oVar != this) {
            if (oVar.f51769e) {
                int i10 = this.f51767c - this.f51766b;
                if (i10 > (8192 - oVar.f51767c) + (oVar.f51768d ? 0 : oVar.f51766b)) {
                    return;
                }
                a(oVar, i10);
                b();
                p.a(this);
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(o oVar, int i10) {
        if (oVar.f51769e) {
            int i11 = oVar.f51767c;
            int i12 = i11 + i10;
            if (i12 > 8192) {
                if (!oVar.f51768d) {
                    int i13 = oVar.f51766b;
                    if (i12 - i13 <= 8192) {
                        byte[] bArr = oVar.f51765a;
                        System.arraycopy(bArr, i13, bArr, 0, i11 - i13);
                        oVar.f51767c -= oVar.f51766b;
                        oVar.f51766b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f51765a, this.f51766b, oVar.f51765a, oVar.f51767c, i10);
            oVar.f51767c += i10;
            this.f51766b += i10;
            return;
        }
        throw new IllegalArgumentException();
    }
}
