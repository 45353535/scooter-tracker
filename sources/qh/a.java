package qh;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import vh.j0;
import vh.l0;
import vh.x;
import vh.y;

/* JADX INFO: loaded from: classes10.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1177a f99127a = C1177a.f99129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f99128b = new C1177a.C1178a();

    /* JADX INFO: renamed from: qh.a$a, reason: collision with other inner class name */
    public static final class C1177a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C1177a f99129a = new C1177a();

        /* JADX INFO: renamed from: qh.a$a$a, reason: collision with other inner class name */
        private static final class C1178a implements a {
            @Override // qh.a
            public j0 appendingSink(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    return x.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return x.a(file);
                }
            }

            @Override // qh.a
            public void delete(File file) throws IOException {
                Intrinsics.checkNotNullParameter(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            @Override // qh.a
            public void deleteContents(File directory) throws IOException {
                Intrinsics.checkNotNullParameter(directory, "directory");
                File[] fileArrListFiles = directory.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("not a readable directory: " + directory);
                }
                for (File file : fileArrListFiles) {
                    if (file.isDirectory()) {
                        Intrinsics.checkNotNullExpressionValue(file, "file");
                        deleteContents(file);
                    }
                    if (!file.delete()) {
                        throw new IOException("failed to delete " + file);
                    }
                }
            }

            @Override // qh.a
            public boolean exists(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.exists();
            }

            @Override // qh.a
            public void rename(File from, File to) throws IOException {
                Intrinsics.checkNotNullParameter(from, "from");
                Intrinsics.checkNotNullParameter(to, "to");
                delete(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // qh.a
            public j0 sink(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    return y.g(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return y.g(file, false, 1, null);
                }
            }

            @Override // qh.a
            public long size(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.length();
            }

            @Override // qh.a
            public l0 source(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return x.j(file);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private C1177a() {
        }
    }

    j0 appendingSink(File file);

    void delete(File file);

    void deleteContents(File file);

    boolean exists(File file);

    void rename(File file, File file2);

    j0 sink(File file);

    long size(File file);

    l0 source(File file);
}
