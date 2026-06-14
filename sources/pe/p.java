package pe;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements pe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f98299a = new p();

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f98300r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f98301s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f98302t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function5 f98303u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function5 function5, Continuation continuation) {
            super(3, continuation);
            this.f98303u = function5;
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ef.e eVar, se.d dVar, Continuation continuation) {
            a aVar = new a(this.f98303u, continuation);
            aVar.f98302t = eVar;
            return aVar.invokeSuspend(Unit.f93236a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
        
            if (r3.e(r4, r10) == r0) goto L30;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r10.f98301s
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L29
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                kotlin.d.b(r11)
                r9 = r10
                goto Lad
            L14:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1c:
                java.lang.Object r1 = r10.f98300r
                ff.a r1 = (ff.a) r1
                java.lang.Object r3 = r10.f98302t
                ef.e r3 = (ef.e) r3
                kotlin.d.b(r11)
                r9 = r10
                goto L67
            L29:
                kotlin.d.b(r11)
                java.lang.Object r11 = r10.f98302t
                ef.e r11 = (ef.e) r11
                java.lang.Object r1 = r11.c()
                se.d r1 = (se.d) r1
                ff.a r8 = r1.a()
                java.lang.Object r7 = r1.b()
                boolean r1 = r7 instanceof io.ktor.utils.io.e
                if (r1 != 0) goto L45
                kotlin.Unit r11 = kotlin.Unit.f93236a
                return r11
            L45:
                kotlin.jvm.functions.Function5 r4 = r10.f98303u
                pe.o r5 = new pe.o
                r5.<init>()
                java.lang.Object r1 = r11.b()
                je.b r1 = (je.b) r1
                se.c r6 = r1.e()
                r10.f98302t = r11
                r10.f98300r = r8
                r10.f98301s = r3
                r9 = r10
                java.lang.Object r1 = r4.invoke(r5, r6, r7, r8, r9)
                if (r1 != r0) goto L64
                goto Lac
            L64:
                r3 = r11
                r11 = r1
                r1 = r8
            L67:
                if (r11 != 0) goto L6c
                kotlin.Unit r11 = kotlin.Unit.f93236a
                return r11
            L6c:
                boolean r4 = r11 instanceof ye.b
                if (r4 != 0) goto L9a
                kotlin.reflect.KClass r4 = r1.a()
                boolean r4 = r4.isInstance(r11)
                if (r4 == 0) goto L7b
                goto L9a
            L7b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "transformResponseBody returned "
                r2.append(r3)
                r2.append(r11)
                java.lang.String r11 = " but expected value of type "
                r2.append(r11)
                r2.append(r1)
                java.lang.String r11 = r2.toString()
                r0.<init>(r11)
                throw r0
            L9a:
                se.d r4 = new se.d
                r4.<init>(r1, r11)
                r11 = 0
                r9.f98302t = r11
                r9.f98300r = r11
                r9.f98301s = r2
                java.lang.Object r11 = r3.e(r4, r10)
                if (r11 != r0) goto Lad
            Lac:
                return r0
            Lad:
                kotlin.Unit r11 = kotlin.Unit.f93236a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: pe.p.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private p() {
    }

    @Override // pe.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(ie.c client, Function5 handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        client.w().l(se.f.f100026g.c(), new a(handler, null));
    }
}
