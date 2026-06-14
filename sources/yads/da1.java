package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class da1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f109856a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f109857b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f109858c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f109859d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f109860e = 15;

    public final void a(int i10) {
        int i11 = this.f109858c;
        int[] iArr = this.f109859d;
        if (i11 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i12 = this.f109856a;
            int i13 = length2 - i12;
            System.arraycopy(iArr, i12, iArr2, 0, i13);
            System.arraycopy(this.f109859d, 0, iArr2, i13, i12);
            this.f109856a = 0;
            this.f109857b = this.f109858c - 1;
            this.f109859d = iArr2;
            this.f109860e = length - 1;
        }
        int i14 = (this.f109857b + 1) & this.f109860e;
        this.f109857b = i14;
        this.f109859d[i14] = i10;
        this.f109858c++;
    }
}
