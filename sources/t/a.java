package t;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c0.q;
import coil.memory.MemoryCache;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import s.m;
import t.b;
import y.o;
import y.p;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements t.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1303a f104725d = new C1303a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o.e f104726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f104727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w.c f104728c;

    /* JADX INFO: renamed from: t.a$a, reason: collision with other inner class name */
    public static final class C1303a {
        public /* synthetic */ C1303a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1303a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable f104729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f104730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final q.f f104731c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f104732d;

        public b(Drawable drawable, boolean z10, q.f fVar, String str) {
            this.f104729a = drawable;
            this.f104730b = z10;
            this.f104731c = fVar;
            this.f104732d = str;
        }

        public static /* synthetic */ b b(b bVar, Drawable drawable, boolean z10, q.f fVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                drawable = bVar.f104729a;
            }
            if ((i10 & 2) != 0) {
                z10 = bVar.f104730b;
            }
            if ((i10 & 4) != 0) {
                fVar = bVar.f104731c;
            }
            if ((i10 & 8) != 0) {
                str = bVar.f104732d;
            }
            return bVar.a(drawable, z10, fVar, str);
        }

        public final b a(Drawable drawable, boolean z10, q.f fVar, String str) {
            return new b(drawable, z10, fVar, str);
        }

        public final q.f c() {
            return this.f104731c;
        }

        public final String d() {
            return this.f104732d;
        }

        public final Drawable e() {
            return this.f104729a;
        }

        public final boolean f() {
            return this.f104730b;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {
        /* synthetic */ Object A;
        int C;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f104733r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f104734s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f104735t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f104736u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f104737v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f104738w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Object f104739x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        Object f104740y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f104741z;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return a.this.h(null, null, null, null, null, null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {
        int B;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f104742r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f104743s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f104744t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f104745u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f104746v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f104747w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Object f104748x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        Object f104749y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        /* synthetic */ Object f104750z;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f104750z = obj;
            this.B |= Integer.MIN_VALUE;
            return a.this.i(null, null, null, null, this);
        }
    }

    static final class e extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f104751r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f104753t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f104754u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ y.h f104755v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ Object f104756w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f104757x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ o.c f104758y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, y.h hVar, Object obj, Ref$ObjectRef ref$ObjectRef3, o.c cVar, Continuation continuation) {
            super(2, continuation);
            this.f104753t = ref$ObjectRef;
            this.f104754u = ref$ObjectRef2;
            this.f104755v = hVar;
            this.f104756w = obj;
            this.f104757x = ref$ObjectRef3;
            this.f104758y = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new e(this.f104753t, this.f104754u, this.f104755v, this.f104756w, this.f104757x, this.f104758y, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f104751r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            a aVar = a.this;
            m mVar = (m) this.f104753t.f93280b;
            o.b bVar = (o.b) this.f104754u.f93280b;
            y.h hVar = this.f104755v;
            Object obj2 = this.f104756w;
            y.m mVar2 = (y.m) this.f104757x.f93280b;
            o.c cVar = this.f104758y;
            this.f104751r = 1;
            Object objH = aVar.h(mVar, bVar, hVar, obj2, mVar2, cVar, this);
            return objH == objG ? objG : objH;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {
        int B;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f104759r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f104760s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f104761t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f104762u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f104763v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f104764w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Object f104765x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f104766y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        /* synthetic */ Object f104767z;

        f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f104767z = obj;
            this.B |= Integer.MIN_VALUE;
            return a.this.j(null, null, null, null, null, this);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f104768r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f104769s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f104770t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f104772v;

        g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f104770t = obj;
            this.f104772v |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    static final class h extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f104773r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ y.h f104775t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Object f104776u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ y.m f104777v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ o.c f104778w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ MemoryCache.Key f104779x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ b.a f104780y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(y.h hVar, Object obj, y.m mVar, o.c cVar, MemoryCache.Key key, b.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f104775t = hVar;
            this.f104776u = obj;
            this.f104777v = mVar;
            this.f104778w = cVar;
            this.f104779x = key;
            this.f104780y = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return a.this.new h(this.f104775t, this.f104776u, this.f104777v, this.f104778w, this.f104779x, this.f104780y, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objI;
            Object objG = pf.b.g();
            int i10 = this.f104773r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                a aVar = a.this;
                y.h hVar = this.f104775t;
                Object obj2 = this.f104776u;
                y.m mVar = this.f104777v;
                o.c cVar = this.f104778w;
                this.f104773r = 1;
                objI = aVar.i(hVar, obj2, mVar, cVar, this);
                if (objI == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                objI = obj;
            }
            b bVar = (b) objI;
            boolean zH = a.this.f104728c.h(this.f104779x, this.f104775t, bVar);
            Drawable drawableE = bVar.e();
            y.h hVar2 = this.f104775t;
            q.f fVarC = bVar.c();
            MemoryCache.Key key = this.f104779x;
            if (!zH) {
                key = null;
            }
            return new p(drawableE, hVar2, fVarC, key, bVar.d(), bVar.f(), c0.i.t(this.f104780y));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    static final class i extends k implements Function2 {
        final /* synthetic */ List A;
        final /* synthetic */ o.c B;
        final /* synthetic */ y.h C;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f104781r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f104782s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f104783t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f104784u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f104785v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private /* synthetic */ Object f104786w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ b f104788y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ y.m f104789z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(b bVar, y.m mVar, List list, o.c cVar, y.h hVar, Continuation continuation) {
            super(2, continuation);
            this.f104788y = bVar;
            this.f104789z = mVar;
            this.A = list;
            this.B = cVar;
            this.C = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            i iVar = a.this.new i(this.f104788y, this.f104789z, this.A, this.B, this.C, continuation);
            iVar.f104786w = obj;
            return iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Bitmap bitmapG;
            List list;
            y.m mVar;
            int size;
            int i10;
            pf.b.g();
            int i11 = this.f104785v;
            if (i11 == 0) {
                kotlin.d.b(obj);
                coroutineScope = (CoroutineScope) this.f104786w;
                bitmapG = a.this.g(this.f104788y.e(), this.f104789z, this.A);
                this.B.q(this.C, bitmapG);
                list = this.A;
                mVar = this.f104789z;
                size = list.size();
                i10 = 0;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                size = this.f104784u;
                int i12 = this.f104783t;
                mVar = (y.m) this.f104782s;
                list = (List) this.f104781r;
                coroutineScope = (CoroutineScope) this.f104786w;
                kotlin.d.b(obj);
                bitmapG = (Bitmap) obj;
                kotlinx.coroutines.i.h(coroutineScope);
                i10 = i12 + 1;
            }
            if (i10 >= size) {
                this.B.h(this.C, bitmapG);
                return b.b(this.f104788y, new BitmapDrawable(this.C.l().getResources(), bitmapG), false, null, null, 14, null);
            }
            androidx.privacysandbox.ads.adservices.topics.a.a(list.get(i10));
            mVar.n();
            this.f104786w = coroutineScope;
            this.f104781r = list;
            this.f104782s = mVar;
            this.f104783t = i10;
            this.f104784u = size;
            this.f104785v = 1;
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public a(o.e eVar, o oVar, q qVar) {
        this.f104726a = eVar;
        this.f104727b = oVar;
        this.f104728c = new w.c(eVar, oVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap g(Drawable drawable, y.m mVar, List list) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (ArraysKt.contains(c0.i.o(), c0.a.c(bitmap))) {
                return bitmap;
            }
        }
        return c0.k.f6441a.a(drawable, mVar.f(), mVar.n(), mVar.m(), mVar.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0097 -> B:21:0x009e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(s.m r8, o.b r9, y.h r10, java.lang.Object r11, y.m r12, o.c r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.a.h(s.m, o.b, y.h, java.lang.Object, y.m, o.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ff, code lost:
    
        if (r0 == r9) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022c  */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(y.h r33, java.lang.Object r34, y.m r35, o.c r36, kotlin.coroutines.Continuation r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.a.i(y.h, java.lang.Object, y.m, o.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0091 -> B:21:0x0095). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(o.b r8, y.h r9, java.lang.Object r10, y.m r11, o.c r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.a.j(o.b, y.h, java.lang.Object, y.m, o.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // t.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(t.b.a r14, kotlin.coroutines.Continuation r15) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r15 instanceof t.a.g
            if (r0 == 0) goto L13
            r0 = r15
            t.a$g r0 = (t.a.g) r0
            int r1 = r0.f104772v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f104772v = r1
            goto L18
        L13:
            t.a$g r0 = new t.a$g
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f104770t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f104772v
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r14 = r0.f104769s
            t.b$a r14 = (t.b.a) r14
            java.lang.Object r0 = r0.f104768r
            r1 = r0
            t.a r1 = (t.a) r1
            kotlin.d.b(r15)     // Catch: java.lang.Throwable -> L32
            return r15
        L32:
            r0 = move-exception
            r15 = r0
            r5 = r13
            goto Lae
        L37:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3f:
            kotlin.d.b(r15)
            y.h r6 = r14.getRequest()     // Catch: java.lang.Throwable -> La9
            java.lang.Object r15 = r6.m()     // Catch: java.lang.Throwable -> La9
            z.i r2 = r14.getSize()     // Catch: java.lang.Throwable -> La9
            o.c r9 = c0.i.g(r14)     // Catch: java.lang.Throwable -> La9
            y.o r4 = r13.f104727b     // Catch: java.lang.Throwable -> La9
            y.m r8 = r4.f(r6, r2)     // Catch: java.lang.Throwable -> La9
            z.h r4 = r8.m()     // Catch: java.lang.Throwable -> La9
            r9.g(r6, r15)     // Catch: java.lang.Throwable -> La9
            o.e r5 = r13.f104726a     // Catch: java.lang.Throwable -> La9
            o.b r5 = r5.getComponents()     // Catch: java.lang.Throwable -> La9
            java.lang.Object r7 = r5.g(r15, r8)     // Catch: java.lang.Throwable -> La9
            r9.m(r6, r7)     // Catch: java.lang.Throwable -> La9
            w.c r15 = r13.f104728c     // Catch: java.lang.Throwable -> La9
            coil.memory.MemoryCache$Key r10 = r15.f(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La9
            if (r10 == 0) goto L80
            w.c r15 = r13.f104728c     // Catch: java.lang.Throwable -> L7b
            coil.memory.MemoryCache$b r15 = r15.a(r6, r10, r2, r4)     // Catch: java.lang.Throwable -> L7b
            goto L81
        L7b:
            r0 = move-exception
            r15 = r0
            r1 = r13
            r5 = r1
            goto Lae
        L80:
            r15 = 0
        L81:
            if (r15 == 0) goto L8a
            w.c r0 = r13.f104728c     // Catch: java.lang.Throwable -> L7b
            y.p r14 = r0.g(r14, r6, r10, r15)     // Catch: java.lang.Throwable -> L7b
            return r14
        L8a:
            kotlinx.coroutines.CoroutineDispatcher r15 = r6.v()     // Catch: java.lang.Throwable -> La9
            t.a$h r4 = new t.a$h     // Catch: java.lang.Throwable -> La9
            r12 = 0
            r5 = r13
            r11 = r14
            r4.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> La4
            r0.f104768r = r5     // Catch: java.lang.Throwable -> La4
            r0.f104769s = r11     // Catch: java.lang.Throwable -> La4
            r0.f104772v = r3     // Catch: java.lang.Throwable -> La4
            java.lang.Object r14 = eg.g.g(r15, r4, r0)     // Catch: java.lang.Throwable -> La4
            if (r14 != r1) goto La3
            return r1
        La3:
            return r14
        La4:
            r0 = move-exception
            r15 = r0
            r1 = r5
            r14 = r11
            goto Lae
        La9:
            r0 = move-exception
            r5 = r13
            r11 = r14
            r15 = r0
            r1 = r5
        Lae:
            boolean r0 = r15 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto Lbd
            y.o r0 = r1.f104727b
            y.h r14 = r14.getRequest()
            y.e r14 = r0.b(r14, r15)
            return r14
        Lbd:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: t.a.a(t.b$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object k(b bVar, y.h hVar, y.m mVar, o.c cVar, Continuation continuation) {
        List listO = hVar.O();
        return listO.isEmpty() ? bVar : ((bVar.e() instanceof BitmapDrawable) || hVar.g()) ? eg.g.g(hVar.N(), new i(bVar, mVar, listO, cVar, hVar, null), continuation) : bVar;
    }
}
