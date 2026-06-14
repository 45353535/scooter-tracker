package s;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.webkit.internal.AssetHelper;
import hh.b0;
import hh.c0;
import hh.d;
import hh.w;
import hh.z;
import java.io.IOException;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import q.p;
import q.q;
import r.a;
import s.i;
import vh.x;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f99514f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final hh.d f99515g = new d.a().d().e().a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final hh.d f99516h = new d.a().d().f().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f99517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y.m f99518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f99519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f99520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f99521e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Lazy f99522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Lazy f99523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f99524c;

        public b(Lazy lazy, Lazy lazy2, boolean z10) {
            this.f99522a = lazy;
            this.f99523b = lazy2;
            this.f99524c = z10;
        }

        private final boolean c(Uri uri) {
            return Intrinsics.areEqual(uri.getScheme(), "http") || Intrinsics.areEqual(uri.getScheme(), "https");
        }

        @Override // s.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Uri uri, y.m mVar, o.e eVar) {
            if (c(uri)) {
                return new k(uri.toString(), mVar, this.f99522a, this.f99523b, this.f99524c);
            }
            return null;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f99525r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f99527t;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f99525r = obj;
            this.f99527t |= Integer.MIN_VALUE;
            return k.this.c(null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f99528r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f99529s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f99530t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f99531u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f99533w;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f99531u = obj;
            this.f99533w |= Integer.MIN_VALUE;
            return k.this.a(this);
        }
    }

    public k(String str, y.m mVar, Lazy lazy, Lazy lazy2, boolean z10) {
        this.f99517a = str;
        this.f99518b = mVar;
        this.f99519c = lazy;
        this.f99520d = lazy2;
        this.f99521e = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(hh.z r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof s.k.c
            if (r0 == 0) goto L13
            r0 = r6
            s.k$c r0 = (s.k.c) r0
            int r1 = r0.f99527t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f99527t = r1
            goto L18
        L13:
            s.k$c r0 = new s.k$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f99525r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f99527t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r6)
            goto L72
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.d.b(r6)
            boolean r6 = c0.i.r()
            if (r6 == 0) goto L5d
            y.m r6 = r4.f99518b
            y.a r6 = r6.k()
            boolean r6 = r6.g()
            if (r6 != 0) goto L57
            kotlin.Lazy r6 = r4.f99519c
            java.lang.Object r6 = r6.getValue()
            hh.e$a r6 = (hh.e.a) r6
            hh.e r5 = r6.a(r5)
            hh.b0 r5 = r5.execute()
            goto L75
        L57:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L5d:
            kotlin.Lazy r6 = r4.f99519c
            java.lang.Object r6 = r6.getValue()
            hh.e$a r6 = (hh.e.a) r6
            hh.e r5 = r6.a(r5)
            r0.f99527t = r3
            java.lang.Object r6 = c0.b.a(r5, r0)
            if (r6 != r1) goto L72
            return r1
        L72:
            r5 = r6
            hh.b0 r5 = (hh.b0) r5
        L75:
            boolean r6 = r5.isSuccessful()
            if (r6 != 0) goto L92
            int r6 = r5.q()
            r0 = 304(0x130, float:4.26E-43)
            if (r6 == r0) goto L92
            hh.c0 r6 = r5.m()
            if (r6 == 0) goto L8c
            c0.i.d(r6)
        L8c:
            x.d r6 = new x.d
            r6.<init>(r5)
            throw r6
        L92:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s.k.c(hh.z, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final String d() {
        String strH = this.f99518b.h();
        return strH == null ? this.f99517a : strH;
    }

    private final vh.l e() {
        Object value = this.f99520d.getValue();
        Intrinsics.checkNotNull(value);
        return ((r.a) value).a();
    }

    private final boolean g(z zVar, b0 b0Var) {
        if (this.f99518b.i().h()) {
            return !this.f99521e || x.b.f108060c.b(zVar, b0Var);
        }
        return false;
    }

    private final z h() {
        z.a aVarG = new z.a().n(this.f99517a).g(this.f99518b.j());
        for (Map.Entry entry : this.f99518b.o().a().entrySet()) {
            Object key = entry.getKey();
            Intrinsics.checkNotNull(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            aVarG.k((Class) key, entry.getValue());
        }
        boolean zG = this.f99518b.i().g();
        boolean zG2 = this.f99518b.k().g();
        if (!zG2 && zG) {
            aVarG.c(hh.d.f73578p);
        } else if (!zG2 || zG) {
            if (!zG2 && !zG) {
                aVarG.c(f99516h);
            }
        } else if (this.f99518b.i().h()) {
            aVarG.c(hh.d.f73577o);
        } else {
            aVarG.c(f99515g);
        }
        return aVarG.b();
    }

    private final a.c i() {
        r.a aVar;
        if (!this.f99518b.i().g() || (aVar = (r.a) this.f99520d.getValue()) == null) {
            return null;
        }
        return aVar.get(d());
    }

    private final c0 j(b0 b0Var) {
        c0 c0VarM = b0Var.m();
        if (c0VarM != null) {
            return c0VarM;
        }
        throw new IllegalStateException("response body == null");
    }

    private final x.a k(a.c cVar) throws Throwable {
        x.a aVar;
        try {
            vh.g gVarD = x.d(e().s(cVar.getMetadata()));
            try {
                aVar = new x.a(gVarD);
                th = null;
            } catch (Throwable th2) {
                th = th2;
                aVar = null;
            }
            if (gVarD != null) {
                try {
                    gVarD.close();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    } else {
                        lf.c.a(th, th3);
                    }
                }
            }
            if (th != null) {
                throw th;
            }
            Intrinsics.checkNotNull(aVar);
            return aVar;
        } catch (IOException unused) {
            return null;
        }
    }

    private final q.f l(b0 b0Var) {
        return b0Var.W() != null ? q.f.NETWORK : q.f.DISK;
    }

    private final p m(c0 c0Var) {
        return q.a(c0Var.getDelegateSource(), this.f99518b.g());
    }

    private final p n(a.c cVar) {
        return q.c(cVar.getData(), e(), d(), cVar);
    }

    private final a.c o(a.c cVar, z zVar, b0 b0Var, x.a aVar) {
        a.b bVarB;
        Unit unit;
        Long lValueOf;
        Unit unit2;
        Throwable th2 = null;
        if (!g(zVar, b0Var)) {
            if (cVar != null) {
                c0.i.d(cVar);
            }
            return null;
        }
        if (cVar != null) {
            bVarB = cVar.J();
        } else {
            r.a aVar2 = (r.a) this.f99520d.getValue();
            bVarB = aVar2 != null ? aVar2.b(d()) : null;
        }
        try {
            if (bVarB == null) {
                return null;
            }
            try {
                if (b0Var.q() != 304 || aVar == null) {
                    vh.f fVarC = x.c(e().r(bVarB.getMetadata(), false));
                    try {
                        new x.a(b0Var).g(fVarC);
                        unit = Unit.f93236a;
                        th = null;
                    } catch (Throwable th3) {
                        th = th3;
                        unit = null;
                    }
                    if (fVarC != null) {
                        try {
                            fVarC.close();
                        } catch (Throwable th4) {
                            if (th == null) {
                                th = th4;
                            } else {
                                lf.c.a(th, th4);
                            }
                        }
                    }
                    if (th != null) {
                        throw th;
                    }
                    Intrinsics.checkNotNull(unit);
                    vh.f fVarC2 = x.c(e().r(bVarB.getData(), false));
                    try {
                        c0 c0VarM = b0Var.m();
                        Intrinsics.checkNotNull(c0VarM);
                        lValueOf = Long.valueOf(c0VarM.getDelegateSource().T(fVarC2));
                    } catch (Throwable th5) {
                        th2 = th5;
                        lValueOf = null;
                    }
                    if (fVarC2 != null) {
                        try {
                            fVarC2.close();
                        } catch (Throwable th6) {
                            if (th2 == null) {
                                th2 = th6;
                            } else {
                                lf.c.a(th2, th6);
                            }
                        }
                    }
                    if (th2 != null) {
                        throw th2;
                    }
                    Intrinsics.checkNotNull(lValueOf);
                } else {
                    b0 b0VarC = b0Var.b0().k(x.b.f108060c.a(aVar.d(), b0Var.R())).c();
                    vh.f fVarC3 = x.c(e().r(bVarB.getMetadata(), false));
                    try {
                        new x.a(b0VarC).g(fVarC3);
                        unit2 = Unit.f93236a;
                    } catch (Throwable th7) {
                        th2 = th7;
                        unit2 = null;
                    }
                    if (fVarC3 != null) {
                        try {
                            fVarC3.close();
                        } catch (Throwable th8) {
                            if (th2 == null) {
                                th2 = th8;
                            } else {
                                lf.c.a(th2, th8);
                            }
                        }
                    }
                    if (th2 != null) {
                        throw th2;
                    }
                    Intrinsics.checkNotNull(unit2);
                }
                a.c cVarA = bVarB.a();
                c0.i.d(b0Var);
                return cVarA;
            } catch (Exception e10) {
                c0.i.a(bVarB);
                throw e10;
            }
        } catch (Throwable th9) {
            c0.i.d(b0Var);
            throw th9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x012d A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:72:0x0189, B:54:0x011f, B:56:0x012d, B:58:0x013b, B:61:0x0144, B:63:0x014e, B:65:0x0156, B:67:0x016e), top: B:81:0x011f }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014e A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:72:0x0189, B:54:0x011f, B:56:0x012d, B:58:0x013b, B:61:0x0144, B:63:0x014e, B:65:0x0156, B:67:0x016e), top: B:81:0x011f }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // s.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(kotlin.coroutines.Continuation r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s.k.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String f(String str, w wVar) {
        String strJ;
        String string = wVar != null ? wVar.toString() : null;
        if ((string == null || StringsKt.a0(string, AssetHelper.DEFAULT_MIME_TYPE, false, 2, null)) && (strJ = c0.i.j(MimeTypeMap.getSingleton(), str)) != null) {
            return strJ;
        }
        if (string != null) {
            return StringsKt.o1(string, ';', null, 2, null);
        }
        return null;
    }
}
