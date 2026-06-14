package com.ironsource;

import com.ironsource.Nf;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface Lf {

    public interface a {
        void a();
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f41297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f41298b;

        public final long a() {
            return this.f41298b;
        }

        public final long b() {
            return this.f41297a;
        }

        public final void a(long j10) {
            this.f41298b = j10;
        }

        public final void b(long j10) {
            this.f41297a = j10;
        }
    }

    public interface c {
        @NotNull
        Lf a(@NotNull b bVar);
    }

    public static final class d implements c {
        @Override // com.ironsource.Lf.c
        @NotNull
        public Lf a(@NotNull b timerConfig) {
            Intrinsics.checkNotNullParameter(timerConfig, "timerConfig");
            return new e(new Nf(timerConfig.b()));
        }
    }

    private static final class e implements Lf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Nf f41299a;

        public static final class a implements Nf.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f41300a;

            a(a aVar) {
                this.f41300a = aVar;
            }

            @Override // com.ironsource.Nf.a
            public void a() {
                this.f41300a.a();
            }
        }

        public e(@NotNull Nf timer) {
            Intrinsics.checkNotNullParameter(timer, "timer");
            this.f41299a = timer;
        }

        @Override // com.ironsource.Lf
        public void a(@NotNull a callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f41299a.a((Nf.a) new a(callback));
        }

        @Override // com.ironsource.Lf
        public void cancel() {
            this.f41299a.e();
        }
    }

    void a(@NotNull a aVar);

    void cancel();
}
