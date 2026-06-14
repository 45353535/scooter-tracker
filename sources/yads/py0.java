package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class py0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f114808e = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f114809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f114810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f114811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f114812d = new byte[128];

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f114809a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f114812d;
            int length = bArr2.length;
            int i13 = this.f114810b + i12;
            if (length < i13) {
                this.f114812d = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f114812d, this.f114810b, i12);
            this.f114810b += i12;
        }
    }
}
