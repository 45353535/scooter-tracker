package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class ry0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f115639f = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f115640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f115641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f115642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f115643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f115644e = new byte[128];

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f115640a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f115644e;
            int length = bArr2.length;
            int i13 = this.f115642c + i12;
            if (length < i13) {
                this.f115644e = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f115644e, this.f115642c, i12);
            this.f115642c += i12;
        }
    }
}
