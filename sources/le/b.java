package le;

import java.io.Closeable;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public interface b extends CoroutineScope, Closeable {

    public static final class a {

        /* JADX INFO: renamed from: le.b$a$a, reason: collision with other inner class name */
        static final class C1080a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f94169r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            Object f94170s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f94171t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            int f94172u;

            C1080a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f94171t = obj;
                this.f94172u |= Integer.MIN_VALUE;
                return a.e(null, null, this);
            }
        }

        /* JADX INFO: renamed from: le.b$a$b, reason: collision with other inner class name */
        static final class C1081b extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f94173r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ b f94174s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ re.e f94175t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1081b(b bVar, re.e eVar, Continuation continuation) {
                super(2, continuation);
                this.f94174s = bVar;
                this.f94175t = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1081b(this.f94174s, this.f94175t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f94173r;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    return obj;
                }
                kotlin.d.b(obj);
                if (a.f(this.f94174s)) {
                    throw new le.a(null, 1, null);
                }
                b bVar = this.f94174s;
                re.e eVar = this.f94175t;
                this.f94173r = 1;
                Object objG2 = bVar.g(eVar, this);
                return objG2 == objG ? objG : objG2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C1081b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        static final class c extends kotlin.coroutines.jvm.internal.k implements Function3 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f94176r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private /* synthetic */ Object f94177s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f94178t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ ie.c f94179u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ b f94180v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(ie.c cVar, b bVar, Continuation continuation) {
                super(3, continuation);
                this.f94179u = cVar;
                this.f94180v = bVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit j(ie.c cVar, se.c cVar2, Throwable th2) {
                if (th2 != null) {
                    cVar.o().a(te.a.c(), cVar2);
                }
                return Unit.f93236a;
            }

            @Override // kotlin.jvm.functions.Function3
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ef.e eVar, Object obj, Continuation continuation) {
                c cVar = new c(this.f94179u, this.f94180v, continuation);
                cVar.f94177s = eVar;
                cVar.f94178t = obj;
                return cVar.invokeSuspend(Unit.f93236a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x00ee, code lost:
            
                if (r3.e(r5, r9) == r0) goto L31;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    Method dump skipped, instruction units count: 244
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: le.b.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void d(b bVar, re.e eVar) {
            for (h hVar : eVar.g()) {
                if (!bVar.D().contains(hVar)) {
                    throw new IllegalArgumentException(("Engine doesn't support " + hVar).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object e(le.b r10, re.e r11, kotlin.coroutines.Continuation r12) {
            /*
                boolean r0 = r12 instanceof le.b.a.C1080a
                if (r0 == 0) goto L13
                r0 = r12
                le.b$a$a r0 = (le.b.a.C1080a) r0
                int r1 = r0.f94172u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f94172u = r1
                goto L18
            L13:
                le.b$a$a r0 = new le.b$a$a
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.f94171t
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.f94172u
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L42
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.d.b(r12)
                return r12
            L2c:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L34:
                java.lang.Object r10 = r0.f94170s
                r11 = r10
                re.e r11 = (re.e) r11
                java.lang.Object r10 = r0.f94169r
                le.b r10 = (le.b) r10
                kotlin.d.b(r12)
            L40:
                r4 = r10
                goto L56
            L42:
                kotlin.d.b(r12)
                kotlinx.coroutines.Job r12 = r11.d()
                r0.f94169r = r10
                r0.f94170s = r11
                r0.f94172u = r4
                java.lang.Object r12 = le.l.b(r10, r12, r0)
                if (r12 != r1) goto L40
                goto L7a
            L56:
                kotlin.coroutines.CoroutineContext r12 = (kotlin.coroutines.CoroutineContext) r12
                le.m r10 = new le.m
                r10.<init>(r12)
                kotlin.coroutines.CoroutineContext r5 = r12.plus(r10)
                le.b$a$b r7 = new le.b$a$b
                r10 = 0
                r7.<init>(r4, r11, r10)
                r8 = 2
                r9 = 0
                r6 = 0
                kotlinx.coroutines.Deferred r11 = eg.g.b(r4, r5, r6, r7, r8, r9)
                r0.f94169r = r10
                r0.f94170s = r10
                r0.f94172u = r3
                java.lang.Object r10 = r11.await(r0)
                if (r10 != r1) goto L7b
            L7a:
                return r1
            L7b:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: le.b.a.e(le.b, re.e, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean f(b bVar) {
            return !(((Job) bVar.getCoroutineContext().get(Job.N8)) != null ? r1.isActive() : false);
        }

        public static Set g(b bVar) {
            return SetsKt.emptySet();
        }

        public static void h(b bVar, ie.c client) {
            Intrinsics.checkNotNullParameter(client, "client");
            client.y().l(re.i.f99454g.a(), new c(client, bVar, null));
        }
    }

    Set D();

    Object g(re.e eVar, Continuation continuation);

    j getConfig();

    void q0(ie.c cVar);
}
