package r;

import android.os.StatFs;
import eg.o0;
import java.io.Closeable;
import java.io.File;
import kotlin.ranges.g;
import kotlinx.coroutines.CoroutineDispatcher;
import vh.c0;
import vh.l;

/* JADX INFO: loaded from: classes5.dex */
public interface a {

    /* JADX INFO: renamed from: r.a$a, reason: collision with other inner class name */
    public static final class C1179a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c0 f99130a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f99135f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private l f99131b = l.f106875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private double f99132c = 0.02d;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f99133d = 10485760;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f99134e = 262144000;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private CoroutineDispatcher f99136g = o0.b();

        public final a a() {
            long jP;
            c0 c0Var = this.f99130a;
            if (c0Var == null) {
                throw new IllegalStateException("directory == null");
            }
            if (this.f99132c > 0.0d) {
                try {
                    StatFs statFs = new StatFs(c0Var.o().getAbsolutePath());
                    jP = g.p((long) (this.f99132c * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f99133d, this.f99134e);
                } catch (Exception unused) {
                    jP = this.f99133d;
                }
            } else {
                jP = this.f99135f;
            }
            return new d(jP, c0Var, this.f99131b, this.f99136g);
        }

        public final C1179a b(File file) {
            return c(c0.a.d(c0.f106805c, file, false, 1, null));
        }

        public final C1179a c(c0 c0Var) {
            this.f99130a = c0Var;
            return this;
        }
    }

    public interface b {
        c a();

        void abort();

        c0 getData();

        c0 getMetadata();
    }

    public interface c extends Closeable {
        b J();

        c0 getData();

        c0 getMetadata();
    }

    l a();

    b b(String str);

    c get(String str);
}
