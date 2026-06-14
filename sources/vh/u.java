package vh;

import java.io.RandomAccessFile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class u extends j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RandomAccessFile f106908f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(boolean z10, RandomAccessFile randomAccessFile) {
        super(z10);
        Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.f106908f = randomAccessFile;
    }

    @Override // vh.j
    protected synchronized void n() {
        this.f106908f.close();
    }

    @Override // vh.j
    protected synchronized void o() {
        this.f106908f.getFD().sync();
    }

    @Override // vh.j
    protected synchronized int p(long j10, byte[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f106908f.seek(j10);
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int i13 = this.f106908f.read(array, i10, i11 - i12);
            if (i13 != -1) {
                i12 += i13;
            } else if (i12 == 0) {
                return -1;
            }
        }
        return i12;
    }

    @Override // vh.j
    protected synchronized long q() {
        return this.f106908f.length();
    }

    @Override // vh.j
    protected synchronized void s(long j10, byte[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f106908f.seek(j10);
        this.f106908f.write(array, i10, i11);
    }
}
