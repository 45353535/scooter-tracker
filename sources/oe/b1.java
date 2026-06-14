package oe;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 implements pe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f96716a = new b1();

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f96717r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f96718s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function3 f96719t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function3 function3, Continuation continuation) {
            super(3, continuation);
            this.f96719t = function3;
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ef.e eVar, se.d dVar, Continuation continuation) {
            a aVar = new a(this.f96719t, continuation);
            aVar.f96718s = eVar;
            return aVar.invokeSuspend(Unit.f93236a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        
            if (r6 == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
        
            if (r6 != r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
        
            return r0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [ef.e] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r5.f96717r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.d.b(r6)
                goto L4f
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f96718s
                ef.e r1 = (ef.e) r1
                kotlin.d.b(r6)     // Catch: java.lang.Throwable -> L22
                goto L53
            L22:
                r6 = move-exception
                goto L37
            L24:
                kotlin.d.b(r6)
                java.lang.Object r6 = r5.f96718s
                r1 = r6
                ef.e r1 = (ef.e) r1
                r5.f96718s = r1     // Catch: java.lang.Throwable -> L22
                r5.f96717r = r3     // Catch: java.lang.Throwable -> L22
                java.lang.Object r6 = r1.d(r5)     // Catch: java.lang.Throwable -> L22
                if (r6 != r0) goto L53
                goto L4e
            L37:
                kotlin.jvm.functions.Function3 r3 = r5.f96719t
                java.lang.Object r1 = r1.b()
                je.b r1 = (je.b) r1
                re.b r1 = r1.d()
                r4 = 0
                r5.f96718s = r4
                r5.f96717r = r2
                java.lang.Object r6 = r3.invoke(r1, r6, r5)
                if (r6 != r0) goto L4f
            L4e:
                return r0
            L4f:
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                if (r6 != 0) goto L56
            L53:
                kotlin.Unit r6 = kotlin.Unit.f93236a
                return r6
            L56:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: oe.b1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private b1() {
    }

    @Override // pe.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(ie.c client, Function3 handler) throws ef.b {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        ef.i iVar = new ef.i("BeforeReceive");
        client.w().k(se.f.f100026g.b(), iVar);
        client.w().l(iVar, new a(handler, null));
    }
}
