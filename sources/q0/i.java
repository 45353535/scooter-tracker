package q0;

import androidx.core.os.TraceCompat;

/* JADX INFO: loaded from: classes5.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f98616a = new String[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f98617b = new long[5];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f98618c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f98619d = 0;

    public void a(String str) {
        int i10 = this.f98618c;
        if (i10 == 5) {
            this.f98619d++;
            return;
        }
        this.f98616a[i10] = str;
        this.f98617b[i10] = System.nanoTime();
        TraceCompat.beginSection(str);
        this.f98618c++;
    }

    public float b(String str) {
        int i10 = this.f98619d;
        if (i10 > 0) {
            this.f98619d = i10 - 1;
            return 0.0f;
        }
        int i11 = this.f98618c - 1;
        this.f98618c = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(this.f98616a[i11])) {
            TraceCompat.endSection();
            return (System.nanoTime() - this.f98617b[this.f98618c]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.f98616a[this.f98618c] + ".");
    }
}
