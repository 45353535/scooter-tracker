package io.ktor.utils.io;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public interface e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f82096a = a.f82097a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f82097a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final e f82098b = new C0990a();

        /* JADX INFO: renamed from: io.ktor.utils.io.e$a$a, reason: collision with other inner class name */
        public static final class C0990a implements e {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Throwable f82099b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final pg.s f82100c = new pg.a();

            C0990a() {
            }

            @Override // io.ktor.utils.io.e
            public void a(Throwable th2) {
            }

            @Override // io.ktor.utils.io.e
            public Throwable b() {
                return this.f82099b;
            }

            @Override // io.ktor.utils.io.e
            public Object d(int i10, Continuation continuation) {
                return kotlin.coroutines.jvm.internal.b.a(false);
            }

            @Override // io.ktor.utils.io.e
            public pg.s g() {
                return this.f82100c;
            }

            @Override // io.ktor.utils.io.e
            public boolean h() {
                return true;
            }
        }

        private a() {
        }

        public final e a() {
            return f82098b;
        }
    }

    public static final class b {
        public static /* synthetic */ Object a(e eVar, int i10, Continuation continuation, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitContent");
            }
            if ((i11 & 1) != 0) {
                i10 = 1;
            }
            return eVar.d(i10, continuation);
        }
    }

    void a(Throwable th2);

    Throwable b();

    Object d(int i10, Continuation continuation);

    pg.s g();

    boolean h();
}
