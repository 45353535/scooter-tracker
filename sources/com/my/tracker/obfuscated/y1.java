package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.d1;
import com.my.tracker.obfuscated.x1;

/* JADX INFO: loaded from: classes11.dex */
final class y1 implements x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d1 f61910a;

    private static final class a implements x1.a, AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d1 f61911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d1.c f61912b;

        public a(d1 d1Var, d1.c cVar) {
            this.f61911a = d1Var;
            this.f61912b = cVar;
        }

        @Override // com.my.tracker.obfuscated.x1.a
        public boolean b() {
            return this.f61912b.b();
        }

        @Override // com.my.tracker.obfuscated.x1.a
        public long c() {
            return this.f61912b.c();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f61912b.close();
        }

        @Override // com.my.tracker.obfuscated.x1.a
        public x1.b d() {
            return new b(this.f61911a.e(this.f61912b.a()));
        }

        @Override // com.my.tracker.obfuscated.x1.a
        public long g() {
            return this.f61912b.g();
        }

        @Override // com.my.tracker.obfuscated.x1.a
        public byte[] l() {
            return this.f61912b.l();
        }
    }

    private static final class b implements x1.b, AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d1.d f61913a;

        public b(d1.d dVar) {
            this.f61913a = dVar;
        }

        @Override // com.my.tracker.obfuscated.x1.b
        public boolean b() {
            return this.f61913a.b();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f61913a.close();
        }

        @Override // com.my.tracker.obfuscated.x1.b
        public long e() {
            return this.f61913a.e();
        }
    }

    public y1(d1 d1Var) {
        this.f61910a = d1Var;
    }

    @Override // com.my.tracker.obfuscated.x1
    public x1.a a() {
        d1 d1Var = this.f61910a;
        return new a(d1Var, d1Var.i());
    }
}
