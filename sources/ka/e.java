package ka;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
import s9.y;

/* JADX INFO: loaded from: classes12.dex */
public interface e {

    public interface a {

        /* JADX INFO: renamed from: ka.e$a$a, reason: collision with other inner class name */
        public static final class C1060a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList f93061a = new CopyOnWriteArrayList();

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: ka.e$a$a$a, reason: collision with other inner class name */
            static final class C1061a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final Handler f93062a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final a f93063b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private boolean f93064c;

                public C1061a(Handler handler, a aVar) {
                    this.f93062a = handler;
                    this.f93063b = aVar;
                }

                public void d() {
                    this.f93064c = true;
                }
            }

            public void b(Handler handler, a aVar) {
                q9.a.e(handler);
                q9.a.e(aVar);
                d(aVar);
                this.f93061a.add(new C1061a(handler, aVar));
            }

            public void c(int i10, long j10, long j11) {
                final int i11;
                final long j12;
                final long j13;
                for (final C1061a c1061a : this.f93061a) {
                    if (c1061a.f93064c) {
                        i11 = i10;
                        j12 = j10;
                        j13 = j11;
                    } else {
                        i11 = i10;
                        j12 = j10;
                        j13 = j11;
                        c1061a.f93062a.post(new Runnable() { // from class: ka.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                c1061a.f93063b.onBandwidthSample(i11, j12, j13);
                            }
                        });
                    }
                    i10 = i11;
                    j10 = j12;
                    j11 = j13;
                }
            }

            public void d(a aVar) {
                for (C1061a c1061a : this.f93061a) {
                    if (c1061a.f93063b == aVar) {
                        c1061a.d();
                        this.f93061a.remove(c1061a);
                    }
                }
            }
        }

        void onBandwidthSample(int i10, long j10, long j11);
    }

    void b(Handler handler, a aVar);

    void c(a aVar);

    long getBitrateEstimate();

    long getTimeToFirstByteEstimateUs();

    y getTransferListener();
}
