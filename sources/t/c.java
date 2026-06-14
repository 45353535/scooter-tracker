package t;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import t.b;
import y.h;
import y.j;
import z.i;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f104790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f104791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f104792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f104793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f104794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o.c f104795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f104796g;

    static final class a extends d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f104797r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f104798s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f104799t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f104801v;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f104799t = obj;
            this.f104801v |= Integer.MIN_VALUE;
            return c.this.f(null, this);
        }
    }

    public c(h hVar, List list, int i10, h hVar2, i iVar, o.c cVar, boolean z10) {
        this.f104790a = hVar;
        this.f104791b = list;
        this.f104792c = i10;
        this.f104793d = hVar2;
        this.f104794e = iVar;
        this.f104795f = cVar;
        this.f104796g = z10;
    }

    private final void a(h hVar, b bVar) {
        if (hVar.l() != this.f104790a.l()) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's context.").toString());
        }
        if (hVar.m() == j.f108297a) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot set the request's data to null.").toString());
        }
        if (hVar.M() != this.f104790a.M()) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's target.").toString());
        }
        if (hVar.z() != this.f104790a.z()) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's lifecycle.").toString());
        }
        if (hVar.K() == this.f104790a.K()) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    private final c b(int i10, h hVar, i iVar) {
        return new c(this.f104790a, this.f104791b, i10, hVar, iVar, this.f104795f, this.f104796g);
    }

    static /* synthetic */ c c(c cVar, int i10, h hVar, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = cVar.f104792c;
        }
        if ((i11 & 2) != 0) {
            hVar = cVar.getRequest();
        }
        if ((i11 & 4) != 0) {
            iVar = cVar.getSize();
        }
        return cVar.b(i10, hVar, iVar);
    }

    public final o.c d() {
        return this.f104795f;
    }

    public final boolean e() {
        return this.f104796g;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(y.h r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof t.c.a
            if (r0 == 0) goto L13
            r0 = r12
            t.c$a r0 = (t.c.a) r0
            int r1 = r0.f104801v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f104801v = r1
            goto L18
        L13:
            t.c$a r0 = new t.c$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f104799t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f104801v
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r11 = r0.f104798s
            t.b r11 = (t.b) r11
            java.lang.Object r0 = r0.f104797r
            t.c r0 = (t.c) r0
            kotlin.d.b(r12)
            r4 = r10
            goto L75
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            kotlin.d.b(r12)
            int r12 = r10.f104792c
            if (r12 <= 0) goto L4d
            java.util.List r2 = r10.f104791b
            int r12 = r12 - r3
            java.lang.Object r12 = r2.get(r12)
            t.b r12 = (t.b) r12
            r10.a(r11, r12)
        L4d:
            java.util.List r12 = r10.f104791b
            int r2 = r10.f104792c
            java.lang.Object r12 = r12.get(r2)
            t.b r12 = (t.b) r12
            int r2 = r10.f104792c
            int r5 = r2 + 1
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r10
            r6 = r11
            t.c r11 = c(r4, r5, r6, r7, r8, r9)
            r0.f104797r = r4
            r0.f104798s = r12
            r0.f104801v = r3
            java.lang.Object r11 = r12.a(r11, r0)
            if (r11 != r1) goto L71
            return r1
        L71:
            r0 = r12
            r12 = r11
            r11 = r0
            r0 = r4
        L75:
            y.i r12 = (y.i) r12
            y.h r1 = r12.b()
            r0.a(r1, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: t.c.f(y.h, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // t.b.a
    public h getRequest() {
        return this.f104793d;
    }

    @Override // t.b.a
    public i getSize() {
        return this.f104794e;
    }
}
