package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.d1;
import com.my.tracker.obfuscated.z1;

/* JADX INFO: loaded from: classes11.dex */
final class a2 implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d1 f61265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f61266b;

    private static final class a implements z1.a, AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d1 f61267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d1.f f61268b;

        public a(d1 d1Var, d1.f fVar) {
            this.f61267a = d1Var;
            this.f61268b = fVar;
        }

        @Override // com.my.tracker.obfuscated.z1.a
        public long a() {
            return this.f61268b.a();
        }

        @Override // com.my.tracker.obfuscated.z1.a
        public boolean b() {
            return this.f61268b.b();
        }

        @Override // com.my.tracker.obfuscated.z1.a
        public long c() {
            return this.f61268b.c();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f61268b.close();
        }

        @Override // com.my.tracker.obfuscated.z1.a
        public z1.b d() {
            return new b(this.f61267a.h(this.f61268b.a()));
        }

        @Override // com.my.tracker.obfuscated.z1.a
        public String k() {
            return this.f61268b.k();
        }
    }

    private static final class b implements z1.b, AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d1.g f61269a;

        public b(d1.g gVar) {
            this.f61269a = gVar;
        }

        @Override // com.my.tracker.obfuscated.z1.b
        public boolean b() {
            return this.f61269a.b();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f61269a.close();
        }

        @Override // com.my.tracker.obfuscated.z1.b
        public boolean f() {
            return this.f61269a.o();
        }

        @Override // com.my.tracker.obfuscated.z1.b
        public long h() {
            return this.f61269a.n();
        }

        @Override // com.my.tracker.obfuscated.z1.b
        public long j() {
            return this.f61269a.m();
        }
    }

    a2(d1 d1Var, String str) {
        this.f61265a = d1Var;
        this.f61266b = str;
    }

    @Override // com.my.tracker.obfuscated.z1
    public z1.a a() {
        d1 d1Var = this.f61265a;
        return new a(d1Var, d1Var.a(this.f61266b));
    }
}
