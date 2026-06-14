package f1;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f69894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileDescriptor f69895b;

    public g8(RandomAccessFile randomAccessFile) throws IOException {
        Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.f69894a = randomAccessFile;
        FileDescriptor fd2 = randomAccessFile.getFD();
        Intrinsics.checkNotNullExpressionValue(fd2, "getFD(...)");
        this.f69895b = fd2;
    }

    public final void a() throws IOException {
        this.f69894a.close();
    }

    public final FileDescriptor b() {
        return this.f69895b;
    }

    public final long c() {
        return this.f69894a.length();
    }
}
