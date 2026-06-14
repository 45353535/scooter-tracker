package io.bidmachine.media3.exoplayer;

import j$.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f81195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f81196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f81197c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f81198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f81199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f81200c;

        public l1 d() {
            return new l1(this);
        }

        public b e(long j10) {
            q9.a.a(j10 >= 0 || j10 == -9223372036854775807L);
            this.f81200c = j10;
            return this;
        }

        public b f(long j10) {
            this.f81198a = j10;
            return this;
        }

        public b g(float f10) {
            q9.a.a(f10 > 0.0f || f10 == -3.4028235E38f);
            this.f81199b = f10;
            return this;
        }

        public b() {
            this.f81198a = -9223372036854775807L;
            this.f81199b = -3.4028235E38f;
            this.f81200c = -9223372036854775807L;
        }

        private b(l1 l1Var) {
            this.f81198a = l1Var.f81195a;
            this.f81199b = l1Var.f81196b;
            this.f81200c = l1Var.f81197c;
        }
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return this.f81195a == l1Var.f81195a && this.f81196b == l1Var.f81196b && this.f81197c == l1Var.f81197c;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.f81195a), Float.valueOf(this.f81196b), Long.valueOf(this.f81197c));
    }

    private l1(b bVar) {
        this.f81195a = bVar.f81198a;
        this.f81196b = bVar.f81199b;
        this.f81197c = bVar.f81200c;
    }
}
