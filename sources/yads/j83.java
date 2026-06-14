package yads;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class j83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f112265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f112266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f112267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f112268d;

    public j83(String[] strArr, int[] iArr, String[] strArr2, int i10) {
        this.f112265a = strArr;
        this.f112266b = iArr;
        this.f112267c = strArr2;
        this.f112268d = i10;
    }

    public final String a(String str, long j10, int i10, long j11) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            int i12 = this.f112268d;
            if (i11 >= i12) {
                sb2.append(this.f112265a[i12]);
                return sb2.toString();
            }
            sb2.append(this.f112265a[i11]);
            int i13 = this.f112266b[i11];
            if (i13 == 1) {
                sb2.append(str);
            } else if (i13 == 2) {
                sb2.append(String.format(Locale.US, this.f112267c[i11], Long.valueOf(j10)));
            } else if (i13 == 3) {
                sb2.append(String.format(Locale.US, this.f112267c[i11], Integer.valueOf(i10)));
            } else if (i13 == 4) {
                sb2.append(String.format(Locale.US, this.f112267c[i11], Long.valueOf(j11)));
            }
            i11++;
        }
    }
}
