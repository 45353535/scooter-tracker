package vb;

import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f106453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f106454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f106455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f106456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f106457e;

    public w(int i10, int i11) {
        this.f106453a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f106456d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f106454b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f106456d;
            int length = bArr2.length;
            int i13 = this.f106457e;
            if (length < i13 + i12) {
                this.f106456d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f106456d, this.f106457e, i12);
            this.f106457e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f106454b) {
            return false;
        }
        this.f106457e -= i10;
        this.f106454b = false;
        this.f106455c = true;
        return true;
    }

    public boolean c() {
        return this.f106455c;
    }

    public void d() {
        this.f106454b = false;
        this.f106455c = false;
    }

    public void e(int i10) {
        q9.a.g(!this.f106454b);
        boolean z10 = i10 == this.f106453a;
        this.f106454b = z10;
        if (z10) {
            this.f106457e = 3;
            this.f106455c = false;
        }
    }
}
