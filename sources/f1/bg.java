package f1;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g7 f69486a;

    public bg(g7 fileCaching) {
        Intrinsics.checkNotNullParameter(fileCaching, "fileCaching");
        this.f69486a = fileCaching;
    }

    public final File a(n4 n4Var) {
        return c5.b(n4Var, this.f69486a.c());
    }

    public final File b(n4 n4Var) {
        return c5.b(n4Var, this.f69486a.a());
    }

    public final void c(n4 download) throws IOException {
        Intrinsics.checkNotNullParameter(download, "download");
        if (h8.f70006a.g()) {
            b(download).createNewFile();
        }
    }

    public final void d(n4 download) {
        Intrinsics.checkNotNullParameter(download, "download");
        if (h8.f70006a.g()) {
            a(download).delete();
            b(download).delete();
        }
    }

    public final void e(n4 download) throws IOException {
        Intrinsics.checkNotNullParameter(download, "download");
        if (h8.f70006a.g()) {
            b(download).delete();
            a(download).createNewFile();
        }
    }
}
