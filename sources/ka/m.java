package ka;

import ga.b0;
import ga.y;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public interface m {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f93103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f93104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f93105c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f93106d;

        public a(int i10, int i11, int i12, int i13) {
            this.f93103a = i10;
            this.f93104b = i11;
            this.f93105c = i12;
            this.f93106d = i13;
        }

        public boolean a(int i10) {
            return i10 == 1 ? this.f93103a - this.f93104b > 1 : this.f93105c - this.f93106d > 1;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f93107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f93108b;

        public b(int i10, long j10) {
            q9.a.a(j10 >= 0);
            this.f93107a = i10;
            this.f93108b = j10;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y f93109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b0 f93110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IOException f93111c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f93112d;

        public c(y yVar, b0 b0Var, IOException iOException, int i10) {
            this.f93109a = yVar;
            this.f93110b = b0Var;
            this.f93111c = iOException;
            this.f93112d = i10;
        }
    }

    b a(a aVar, c cVar);

    long b(c cVar);

    int getMinimumLoadableRetryCount(int i10);

    void onLoadTaskConcluded(long j10);
}
