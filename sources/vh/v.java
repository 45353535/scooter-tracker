package vh;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class v extends l {
    private final List t(c0 c0Var, boolean z10) throws IOException {
        File fileO = c0Var.o();
        String[] list = fileO.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                Intrinsics.checkNotNull(str);
                arrayList.add(c0Var.l(str));
            }
            CollectionsKt.sort(arrayList);
            return arrayList;
        }
        if (!z10) {
            return null;
        }
        if (fileO.exists()) {
            throw new IOException("failed to list " + c0Var);
        }
        throw new FileNotFoundException("no such file: " + c0Var);
    }

    private final void u(c0 c0Var) throws IOException {
        if (j(c0Var)) {
            throw new IOException(c0Var + " already exists.");
        }
    }

    private final void v(c0 c0Var) throws IOException {
        if (j(c0Var)) {
            return;
        }
        throw new IOException(c0Var + " doesn't exist.");
    }

    @Override // vh.l
    public j0 b(c0 file, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (z10) {
            v(file);
        }
        return x.f(file.o(), true);
    }

    @Override // vh.l
    public void c(c0 source, c0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        if (source.o().renameTo(target.o())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // vh.l
    public void g(c0 dir, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        if (dir.o().mkdir()) {
            return;
        }
        k kVarM = m(dir);
        if (kVarM == null || !kVarM.f()) {
            throw new IOException("failed to create directory: " + dir);
        }
        if (z10) {
            throw new IOException(dir + " already exists.");
        }
    }

    @Override // vh.l
    public void i(c0 path, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File fileO = path.o();
        if (fileO.delete()) {
            return;
        }
        if (fileO.exists()) {
            throw new IOException("failed to delete " + path);
        }
        if (z10) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @Override // vh.l
    public List k(c0 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List listT = t(dir, true);
        Intrinsics.checkNotNull(listT);
        return listT;
    }

    @Override // vh.l
    public k m(c0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File fileO = path.o();
        boolean zIsFile = fileO.isFile();
        boolean zIsDirectory = fileO.isDirectory();
        long jLastModified = fileO.lastModified();
        long length = fileO.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || fileO.exists()) {
            return new k(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // vh.l
    public j n(c0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new u(false, new RandomAccessFile(file.o(), "r"));
    }

    @Override // vh.l
    public j p(c0 file, boolean z10, boolean z11) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (z10 && z11) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        if (z10) {
            u(file);
        }
        if (z11) {
            v(file);
        }
        return new u(true, new RandomAccessFile(file.o(), "rw"));
    }

    @Override // vh.l
    public j0 r(c0 file, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (z10) {
            u(file);
        }
        return y.g(file.o(), false, 1, null);
    }

    @Override // vh.l
    public l0 s(c0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return x.j(file.o());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
