package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import c0.n;
import c0.q;
import c0.s;
import coil.memory.MemoryCache;
import eg.c0;
import eg.m1;
import eg.o0;
import hh.u;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.i;
import o.c;
import q.d;
import s.a;
import s.b;
import s.c;
import s.e;
import s.f;
import s.j;
import s.k;
import s.l;
import y.h;
import y.o;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements o.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f96205q = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f96206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y.b f96207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f96208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f96209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f96210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c.d f96211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o.b f96212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final n f96213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final CoroutineScope f96214i = i.a(m1.b(null, 1, null).plus(o0.c().w()).plus(new f(c0.J8, this)));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final s f96215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final o f96216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Lazy f96217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Lazy f96218m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final o.b f96219n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List f96220o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f96221p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f96222r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ h f96224t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h hVar, Continuation continuation) {
            super(2, continuation);
            this.f96224t = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return g.this.new b(this.f96224t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f96222r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                g gVar = g.this;
                h hVar = this.f96224t;
                this.f96222r = 1;
                obj = gVar.g(hVar, 0, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            g gVar2 = g.this;
            if (((y.i) obj) instanceof y.e) {
                gVar2.h();
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class c extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f96225r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f96226s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ h f96227t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ g f96228u;

        static final class a extends k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f96229r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ g f96230s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ h f96231t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar, h hVar, Continuation continuation) {
                super(2, continuation);
                this.f96230s = gVar;
                this.f96231t = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f96230s, this.f96231t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f96229r;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    return obj;
                }
                kotlin.d.b(obj);
                g gVar = this.f96230s;
                h hVar = this.f96231t;
                this.f96229r = 1;
                Object objG2 = gVar.g(hVar, 1, this);
                return objG2 == objG ? objG : objG2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h hVar, g gVar, Continuation continuation) {
            super(2, continuation);
            this.f96227t = hVar;
            this.f96228u = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = new c(this.f96227t, this.f96228u, continuation);
            cVar.f96226s = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f96225r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            Deferred deferredB = eg.i.b((CoroutineScope) this.f96226s, o0.c().w(), null, new a(this.f96228u, this.f96227t, null), 2, null);
            if (this.f96227t.M() instanceof a0.b) {
                c0.i.l(((a0.b) this.f96227t.M()).getView()).b(deferredB);
            }
            this.f96225r = 1;
            Object objAwait = deferredB.await(this);
            return objAwait == objG ? objG : objAwait;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f96232r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f96233s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f96234t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f96235u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f96236v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f96237w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f96239y;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f96237w = obj;
            this.f96239y |= Integer.MIN_VALUE;
            return g.this.g(null, 0, this);
        }
    }

    static final class e extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f96240r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ h f96241s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ g f96242t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ z.i f96243u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ o.c f96244v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ Bitmap f96245w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(h hVar, g gVar, z.i iVar, o.c cVar, Bitmap bitmap, Continuation continuation) {
            super(2, continuation);
            this.f96241s = hVar;
            this.f96242t = gVar;
            this.f96243u = iVar;
            this.f96244v = cVar;
            this.f96245w = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.f96241s, this.f96242t, this.f96243u, this.f96244v, this.f96245w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f96240r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            t.c cVar = new t.c(this.f96241s, this.f96242t.f96220o, 0, this.f96241s, this.f96243u, this.f96244v, this.f96245w != null);
            h hVar = this.f96241s;
            this.f96240r = 1;
            Object objF = cVar.f(hVar, this);
            return objF == objG ? objG : objF;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public static final class f extends kotlin.coroutines.a implements c0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f96246b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(c0.b bVar, g gVar) {
            super(bVar);
            this.f96246b = gVar;
        }

        @Override // eg.c0
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            this.f96246b.h();
        }
    }

    public g(Context context, y.b bVar, Lazy lazy, Lazy lazy2, Lazy lazy3, c.d dVar, o.b bVar2, n nVar, q qVar) {
        this.f96206a = context;
        this.f96207b = bVar;
        this.f96208c = lazy;
        this.f96209d = lazy2;
        this.f96210e = lazy3;
        this.f96211f = dVar;
        this.f96212g = bVar2;
        this.f96213h = nVar;
        s sVar = new s(this, context, nVar.d());
        this.f96215j = sVar;
        o oVar = new o(this, sVar, null);
        this.f96216k = oVar;
        this.f96217l = lazy;
        this.f96218m = lazy2;
        this.f96219n = bVar2.h().d(new v.c(), u.class).d(new v.g(), String.class).d(new v.b(), Uri.class).d(new v.f(), Uri.class).d(new v.e(), Integer.class).d(new v.a(), byte[].class).c(new u.c(), Uri.class).c(new u.a(nVar.a()), File.class).b(new k.b(lazy3, lazy2, nVar.e()), Uri.class).b(new j.a(), File.class).b(new a.C1187a(), Uri.class).b(new e.a(), Uri.class).b(new l.b(), Uri.class).b(new f.a(), Drawable.class).b(new b.a(), Bitmap.class).b(new c.a(), ByteBuffer.class).a(new d.c(nVar.c(), nVar.b())).e();
        this.f96220o = CollectionsKt.plus((Collection<? extends t.a>) getComponents().c(), new t.a(this, oVar, null));
        this.f96221p = new AtomicBoolean(false);
        sVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(18:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(4:(1:(7:13|111|14|76|(1:78)(2:79|(1:81))|82|83)(2:18|19))(13:20|104|21|22|23|112|69|70|107|71|72|(5:75|76|(0)(0)|82|83)|74)|106|90|(3:92|93|94)(2:97|98))(4:26|102|27|41))(4:32|101|33|(2:35|(3:37|(2:40|41)|74)(1:44))(2:88|89))|109|45|(11:47|(1:49)(1:52)|(1:54)|(1:57)(1:58)|59|(1:61)|62|(1:64)|65|(9:68|23|112|69|70|107|71|72|(0))|74)|55|(0)(0)|59|(0)|62|(0)|65|(0)|74|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010b, code lost:
    
        r6 = r2;
        r4 = r5;
        r5 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011a A[Catch: all -> 0x010a, TryCatch #5 {all -> 0x010a, blocks: (B:45:0x00f9, B:47:0x00ff, B:49:0x0105, B:54:0x0112, B:57:0x011a, B:59:0x012c, B:61:0x0132, B:62:0x0135, B:64:0x013e, B:65:0x0141, B:58:0x0128), top: B:109:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0128 A[Catch: all -> 0x010a, TryCatch #5 {all -> 0x010a, blocks: (B:45:0x00f9, B:47:0x00ff, B:49:0x0105, B:54:0x0112, B:57:0x011a, B:59:0x012c, B:61:0x0132, B:62:0x0135, B:64:0x013e, B:65:0x0141, B:58:0x0128), top: B:109:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0132 A[Catch: all -> 0x010a, TryCatch #5 {all -> 0x010a, blocks: (B:45:0x00f9, B:47:0x00ff, B:49:0x0105, B:54:0x0112, B:57:0x011a, B:59:0x012c, B:61:0x0132, B:62:0x0135, B:64:0x013e, B:65:0x0141, B:58:0x0128), top: B:109:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e A[Catch: all -> 0x010a, TryCatch #5 {all -> 0x010a, blocks: (B:45:0x00f9, B:47:0x00ff, B:49:0x0105, B:54:0x0112, B:57:0x011a, B:59:0x012c, B:61:0x0132, B:62:0x0135, B:64:0x013e, B:65:0x0141, B:58:0x0128), top: B:109:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0191 A[Catch: all -> 0x004b, TryCatch #6 {all -> 0x004b, blocks: (B:14:0x0046, B:76:0x018b, B:78:0x0191, B:79:0x019c, B:81:0x01a0), top: B:111:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019c A[Catch: all -> 0x004b, TryCatch #6 {all -> 0x004b, blocks: (B:14:0x0046, B:76:0x018b, B:78:0x0191, B:79:0x019c, B:81:0x01a0), top: B:111:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c2 A[Catch: all -> 0x01d3, TRY_LEAVE, TryCatch #3 {all -> 0x01d3, blocks: (B:90:0x01be, B:92:0x01c2, B:97:0x01d5, B:98:0x01d8), top: B:106:0x01be }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d5 A[Catch: all -> 0x01d3, TRY_ENTER, TryCatch #3 {all -> 0x01d3, blocks: (B:90:0x01be, B:92:0x01c2, B:97:0x01d5, B:98:0x01d8), top: B:106:0x01be }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(y.h r20, int r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.g.g(y.h, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void i(h hVar, o.c cVar) {
        cVar.d(hVar);
        h.b bVarA = hVar.A();
        if (bVarA != null) {
            bVarA.d(hVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void j(y.e r4, a0.a r5, o.c r6) {
        /*
            r3 = this;
            y.h r0 = r4.b()
            boolean r1 = r5 instanceof b0.c
            if (r1 != 0) goto Lb
            if (r5 == 0) goto L37
            goto L1e
        Lb:
            y.h r1 = r4.b()
            b0.b$a r1 = r1.P()
            r2 = r5
            b0.c r2 = (b0.c) r2
            b0.b r1 = r1.a(r2, r4)
            boolean r2 = r1 instanceof b0.a
            if (r2 == 0) goto L26
        L1e:
            android.graphics.drawable.Drawable r1 = r4.a()
            r5.c(r1)
            goto L37
        L26:
            y.h r5 = r4.b()
            r6.l(r5, r1)
            r1.a()
            y.h r5 = r4.b()
            r6.o(r5, r1)
        L37:
            r6.b(r0, r4)
            y.h$b r5 = r0.A()
            if (r5 == 0) goto L43
            r5.b(r0, r4)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.g.j(y.e, a0.a, o.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void k(y.p r4, a0.a r5, o.c r6) {
        /*
            r3 = this;
            y.h r0 = r4.b()
            r4.c()
            boolean r1 = r5 instanceof b0.c
            if (r1 != 0) goto Le
            if (r5 == 0) goto L3a
            goto L21
        Le:
            y.h r1 = r4.b()
            b0.b$a r1 = r1.P()
            r2 = r5
            b0.c r2 = (b0.c) r2
            b0.b r1 = r1.a(r2, r4)
            boolean r2 = r1 instanceof b0.a
            if (r2 == 0) goto L29
        L21:
            android.graphics.drawable.Drawable r1 = r4.a()
            r5.a(r1)
            goto L3a
        L29:
            y.h r5 = r4.b()
            r6.l(r5, r1)
            r1.a()
            y.h r5 = r4.b()
            r6.o(r5, r1)
        L3a:
            r6.a(r0, r4)
            y.h$b r5 = r0.A()
            if (r5 == 0) goto L46
            r5.a(r0, r4)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.g.k(y.p, a0.a, o.c):void");
    }

    @Override // o.e
    public Object a(h hVar, Continuation continuation) {
        return i.g(new c(hVar, this, null), continuation);
    }

    @Override // o.e
    public y.d b(h hVar) {
        Deferred deferredB = eg.i.b(this.f96214i, null, null, new b(hVar, null), 3, null);
        return hVar.M() instanceof a0.b ? c0.i.l(((a0.b) hVar.M()).getView()).b(deferredB) : new y.l(deferredB);
    }

    @Override // o.e
    public y.b c() {
        return this.f96207b;
    }

    @Override // o.e
    public MemoryCache d() {
        return (MemoryCache) this.f96217l.getValue();
    }

    @Override // o.e
    public o.b getComponents() {
        return this.f96219n;
    }

    public final q h() {
        return null;
    }

    public final void l(int i10) {
        MemoryCache memoryCache;
        Lazy lazy = this.f96208c;
        if (lazy == null || (memoryCache = (MemoryCache) lazy.getValue()) == null) {
            return;
        }
        memoryCache.a(i10);
    }
}
