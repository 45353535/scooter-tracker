package q9;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes12.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f98883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f98884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f98885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f98886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f98887e;

    public w() {
        this(16);
    }

    private void c() {
        long[] jArr = this.f98886d;
        int length = jArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        long[] jArr2 = new long[length];
        int length2 = jArr.length;
        int i10 = this.f98883a;
        int i11 = length2 - i10;
        System.arraycopy(jArr, i10, jArr2, 0, i11);
        System.arraycopy(this.f98886d, 0, jArr2, i11, i10);
        this.f98883a = 0;
        this.f98884b = this.f98885c - 1;
        this.f98886d = jArr2;
        this.f98887e = jArr2.length - 1;
    }

    public void a(long j10) {
        if (this.f98885c == this.f98886d.length) {
            c();
        }
        int i10 = (this.f98884b + 1) & this.f98887e;
        this.f98884b = i10;
        this.f98886d[i10] = j10;
        this.f98885c++;
    }

    public void b() {
        this.f98883a = 0;
        this.f98884b = -1;
        this.f98885c = 0;
    }

    public long d() {
        if (this.f98885c != 0) {
            return this.f98886d[this.f98883a];
        }
        throw new NoSuchElementException();
    }

    public boolean e() {
        return this.f98885c == 0;
    }

    public long f() {
        int i10 = this.f98885c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f98886d;
        int i11 = this.f98883a;
        long j10 = jArr[i11];
        this.f98883a = this.f98887e & (i11 + 1);
        this.f98885c = i10 - 1;
        return j10;
    }

    public w(int i10) {
        a.a(i10 >= 0 && i10 <= 1073741824);
        i10 = i10 == 0 ? 1 : i10;
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f98883a = 0;
        this.f98884b = -1;
        this.f98885c = 0;
        long[] jArr = new long[i10];
        this.f98886d = jArr;
        this.f98887e = jArr.length - 1;
    }
}
