package com.ironsource;

import com.ironsource.InterfaceC4243b7;
import com.ironsource.Lf;
import com.ironsource.Y6;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC4342h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f43225a = c.f43232a;

    /* JADX INFO: renamed from: com.ironsource.h4$a */
    public static final class a implements InterfaceC4342h4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final X6 f43226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final Lf f43227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final AtomicBoolean f43228d;

        /* JADX INFO: renamed from: com.ironsource.h4$a$a, reason: collision with other inner class name */
        public static final class C0463a implements Lf.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f43229a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f43230b;

            C0463a(d dVar, a aVar) {
                this.f43229a = dVar;
                this.f43230b = aVar;
            }

            @Override // com.ironsource.Lf.a
            public void a() {
                this.f43229a.a(new InterfaceC4243b7.a(new Y6.a(this.f43230b.f43226b.b())));
                this.f43230b.f43228d.set(false);
            }
        }

        public a(@NotNull X6 config, @NotNull Lf timer) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(timer, "timer");
            this.f43226b = config;
            this.f43227c = timer;
            this.f43228d = new AtomicBoolean(false);
        }

        @Override // com.ironsource.InterfaceC4342h4
        public synchronized void a(@NotNull d callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (this.f43228d.compareAndSet(false, true)) {
                this.f43227c.a(new C0463a(callback, this));
            }
        }

        @Override // com.ironsource.InterfaceC4342h4
        public synchronized void a() {
            this.f43227c.cancel();
            this.f43228d.set(false);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h4$b */
    public static final class b implements InterfaceC4342h4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f43231b = new b();

        private b() {
        }

        @Override // com.ironsource.InterfaceC4342h4
        public void a() {
        }

        @Override // com.ironsource.InterfaceC4342h4
        public void a(@NotNull d callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h4$d */
    public interface d {
        void a(@NotNull InterfaceC4243b7 interfaceC4243b7);
    }

    void a();

    void a(@NotNull d dVar);

    /* JADX INFO: renamed from: com.ironsource.h4$c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ c f43232a = new c();

        private c() {
        }

        @NotNull
        public final InterfaceC4342h4 a(@NotNull Z6 featureFlag) {
            Intrinsics.checkNotNullParameter(featureFlag, "featureFlag");
            if (!featureFlag.b()) {
                return b.f43231b;
            }
            W6 w62 = new W6(featureFlag);
            Lf.b bVar = new Lf.b();
            bVar.b(w62.a());
            bVar.a(w62.a());
            return new a(w62, new Lf.d().a(bVar));
        }

        @NotNull
        public final InterfaceC4342h4 a() {
            return b.f43231b;
        }
    }
}
