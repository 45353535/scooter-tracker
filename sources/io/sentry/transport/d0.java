package io.sentry.transport;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d0 {

    private static final class b extends d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f84213a;

        b(int i10) {
            super();
            this.f84213a = i10;
        }

        @Override // io.sentry.transport.d0
        public int c() {
            return this.f84213a;
        }

        @Override // io.sentry.transport.d0
        public boolean d() {
            return false;
        }
    }

    private static final class c extends d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f84214a = new c();

        private c() {
            super();
        }

        @Override // io.sentry.transport.d0
        public int c() {
            return -1;
        }

        @Override // io.sentry.transport.d0
        public boolean d() {
            return true;
        }
    }

    public static d0 a() {
        return b(-1);
    }

    public static d0 b(int i10) {
        return new b(i10);
    }

    public static d0 e() {
        return c.f84214a;
    }

    public abstract int c();

    public abstract boolean d();

    private d0() {
    }
}
