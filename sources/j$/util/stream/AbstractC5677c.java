package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5677c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f85224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f85227d;

    public abstract void clear();

    public AbstractC5677c() {
        this.f85224a = 4;
    }

    public AbstractC5677c(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + i10);
        }
        this.f85224a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i10 - 1));
    }

    public final long count() {
        int i10 = this.f85226c;
        if (i10 == 0) {
            return this.f85225b;
        }
        return this.f85227d[i10] + ((long) this.f85225b);
    }
}
