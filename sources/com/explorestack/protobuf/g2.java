package com.explorestack.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class g2 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r1 f19037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f19038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f19039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b0[] f19040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MessageLite f19041e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f19042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private r1 f19043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f19044c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f19045d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f19046e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Object f19047f;

        public a(int i10) {
            this.f19042a = new ArrayList(i10);
        }

        public g2 a() {
            if (this.f19044c) {
                throw new IllegalStateException("Builder can only build once");
            }
            if (this.f19043b == null) {
                throw new IllegalStateException("Must specify a proto syntax");
            }
            this.f19044c = true;
            Collections.sort(this.f19042a);
            return new g2(this.f19043b, this.f19045d, this.f19046e, (b0[]) this.f19042a.toArray(new b0[0]), this.f19047f);
        }

        public void b(int[] iArr) {
            this.f19046e = iArr;
        }

        public void c(Object obj) {
            this.f19047f = obj;
        }

        public void d(b0 b0Var) {
            if (this.f19044c) {
                throw new IllegalStateException("Builder can only build once");
            }
            this.f19042a.add(b0Var);
        }

        public void e(boolean z10) {
            this.f19045d = z10;
        }

        public void f(r1 r1Var) {
            this.f19043b = (r1) j0.b(r1Var, "syntax");
        }
    }

    g2(r1 r1Var, boolean z10, int[] iArr, b0[] b0VarArr, Object obj) {
        this.f19037a = r1Var;
        this.f19038b = z10;
        this.f19039c = iArr;
        this.f19040d = b0VarArr;
        this.f19041e = (MessageLite) j0.b(obj, "defaultInstance");
    }

    public static a c(int i10) {
        return new a(i10);
    }

    public int[] a() {
        return this.f19039c;
    }

    public b0[] b() {
        return this.f19040d;
    }

    @Override // com.explorestack.protobuf.c1
    public MessageLite getDefaultInstance() {
        return this.f19041e;
    }

    @Override // com.explorestack.protobuf.c1
    public r1 getSyntax() {
        return this.f19037a;
    }

    @Override // com.explorestack.protobuf.c1
    public boolean isMessageSetWireFormat() {
        return this.f19038b;
    }
}
