package oe;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f96923c = new d(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ze.a f96924d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f96925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f96926b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f96927a = 20;

        public final int a() {
            return this.f96927a;
        }
    }

    private static final class b implements i1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f96928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ie.c f96929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f96930c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private je.b f96931d;

        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f96932r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f96934t;

            a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f96932r = obj;
                this.f96934t |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        public b(int i10, ie.c client) {
            Intrinsics.checkNotNullParameter(client, "client");
            this.f96928a = i10;
            this.f96929b = client;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oe.i1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a(re.d r6, kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof oe.v0.b.a
                if (r0 == 0) goto L13
                r0 = r7
                oe.v0$b$a r0 = (oe.v0.b.a) r0
                int r1 = r0.f96934t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f96934t = r1
                goto L18
            L13:
                oe.v0$b$a r0 = new oe.v0$b$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f96932r
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.f96934t
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L32
                if (r2 != r4) goto L2a
                kotlin.d.b(r7)
                goto L58
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L32:
                kotlin.d.b(r7)
                je.b r7 = r5.f96931d
                if (r7 == 0) goto L3c
                kotlinx.coroutines.i.f(r7, r3, r4, r3)
            L3c:
                int r7 = r5.f96930c
                int r2 = r5.f96928a
                if (r7 >= r2) goto L7f
                int r7 = r7 + r4
                r5.f96930c = r7
                ie.c r7 = r5.f96929b
                re.i r7 = r7.y()
                java.lang.Object r2 = r6.d()
                r0.f96934t = r4
                java.lang.Object r7 = r7.d(r6, r2, r0)
                if (r7 != r1) goto L58
                return r1
            L58:
                boolean r6 = r7 instanceof je.b
                if (r6 == 0) goto L5f
                r3 = r7
                je.b r3 = (je.b) r3
            L5f:
                if (r3 == 0) goto L64
                r5.f96931d = r3
                return r3
            L64:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to execute send pipeline. Expected [HttpClientCall], but received "
                r0.append(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                throw r6
            L7f:
                oe.h1 r6 = new oe.h1
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r0 = "Max send count "
                r7.append(r0)
                int r0 = r5.f96928a
                r7.append(r0)
                java.lang.String r0 = " exceeded. Consider increasing the property maxSendCount if more is required."
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: oe.v0.b.a(re.d, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    private static final class c implements i1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Function3 f96935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i1 f96936b;

        public c(Function3 interceptor, i1 nextSender) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            Intrinsics.checkNotNullParameter(nextSender, "nextSender");
            this.f96935a = interceptor;
            this.f96936b = nextSender;
        }

        @Override // oe.i1
        public Object a(re.d dVar, Continuation continuation) {
            return this.f96935a.invoke(this.f96936b, dVar, continuation);
        }
    }

    public static final class d implements v {

        static final class a extends kotlin.coroutines.jvm.internal.k implements Function3 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f96937r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private /* synthetic */ Object f96938s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f96939t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ v0 f96940u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ ie.c f96941v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v0 v0Var, ie.c cVar, Continuation continuation) {
                super(3, continuation);
                this.f96940u = v0Var;
                this.f96941v = cVar;
            }

            @Override // kotlin.jvm.functions.Function3
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ef.e eVar, Object obj, Continuation continuation) {
                a aVar = new a(this.f96940u, this.f96941v, continuation);
                aVar.f96938s = eVar;
                aVar.f96939t = obj;
                return aVar.invokeSuspend(Unit.f93236a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
            
                if (r1.e((je.b) r9, r8) == r0) goto L36;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    Method dump skipped, instruction units count: 262
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: oe.v0.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // oe.v
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(v0 plugin, ie.c scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.s().l(re.g.f99440g.c(), new a(plugin, scope, null));
        }

        @Override // oe.v
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public v0 a(Function1 block) {
            Intrinsics.checkNotNullParameter(block, "block");
            a aVar = new a();
            block.invoke(aVar);
            return new v0(aVar.a(), null);
        }

        @Override // oe.v
        public ze.a getKey() {
            return v0.f96924d;
        }

        private d() {
        }
    }

    static {
        KType kTypeO = null;
        KClass kClassB = kotlin.jvm.internal.v0.b(v0.class);
        try {
            kTypeO = kotlin.jvm.internal.v0.o(v0.class);
        } catch (Throwable unused) {
        }
        f96924d = new ze.a("HttpSend", new ff.a(kClassB, kTypeO));
    }

    public /* synthetic */ v0(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public final void d(Function3 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f96926b.add(block);
    }

    private v0(int i10) {
        this.f96925a = i10;
        this.f96926b = new ArrayList();
    }
}
