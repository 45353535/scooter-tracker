package oe;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements pe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f96691a = new a();

    /* JADX INFO: renamed from: oe.a$a, reason: collision with other inner class name */
    static final class C1114a extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f96692r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f96693s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f96694t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function2 f96695u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1114a(Function2 function2, Continuation continuation) {
            super(3, continuation);
            this.f96695u = function2;
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ef.e eVar, se.c cVar, Continuation continuation) {
            C1114a c1114a = new C1114a(this.f96695u, continuation);
            c1114a.f96693s = eVar;
            c1114a.f96694t = cVar;
            return c1114a.invokeSuspend(Unit.f93236a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        
            if (r1.e(r6, r5) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r5.f96692r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.d.b(r6)
                goto L4b
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f96693s
                ef.e r1 = (ef.e) r1
                kotlin.d.b(r6)
                goto L3b
            L22:
                kotlin.d.b(r6)
                java.lang.Object r6 = r5.f96693s
                r1 = r6
                ef.e r1 = (ef.e) r1
                java.lang.Object r6 = r5.f96694t
                se.c r6 = (se.c) r6
                kotlin.jvm.functions.Function2 r4 = r5.f96695u
                r5.f96693s = r1
                r5.f96692r = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L3b
                goto L4a
            L3b:
                se.c r6 = (se.c) r6
                if (r6 == 0) goto L4b
                r3 = 0
                r5.f96693s = r3
                r5.f96692r = r2
                java.lang.Object r6 = r1.e(r6, r5)
                if (r6 != r0) goto L4b
            L4a:
                return r0
            L4b:
                kotlin.Unit r6 = kotlin.Unit.f93236a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: oe.a.C1114a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private a() {
    }

    @Override // pe.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(ie.c client, Function2 handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        client.q().l(se.b.f100014g.a(), new C1114a(handler, null));
    }
}
