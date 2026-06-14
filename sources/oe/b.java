package oe;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements pe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f96711a = new b();

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f96712r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f96713s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f96714t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function3 f96715u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function3 function3, Continuation continuation) {
            super(3, continuation);
            this.f96715u = function3;
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ef.e eVar, Object obj, Continuation continuation) {
            a aVar = new a(this.f96715u, continuation);
            aVar.f96713s = eVar;
            aVar.f96714t = obj;
            return aVar.invokeSuspend(Unit.f93236a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        
            if (r1.e(r7, r6) == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r6.f96712r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.d.b(r7)
                goto L57
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f96713s
                ef.e r1 = (ef.e) r1
                kotlin.d.b(r7)
                goto L44
            L22:
                kotlin.d.b(r7)
                java.lang.Object r7 = r6.f96713s
                r1 = r7
                ef.e r1 = (ef.e) r1
                java.lang.Object r7 = r6.f96714t
                boolean r4 = r7 instanceof ye.c
                if (r4 != 0) goto L33
                kotlin.Unit r7 = kotlin.Unit.f93236a
                return r7
            L33:
                kotlin.jvm.functions.Function3 r4 = r6.f96715u
                java.lang.Object r5 = r1.b()
                r6.f96713s = r1
                r6.f96712r = r3
                java.lang.Object r7 = r4.invoke(r5, r7, r6)
                if (r7 != r0) goto L44
                goto L56
            L44:
                ye.c r7 = (ye.c) r7
                if (r7 != 0) goto L4b
                kotlin.Unit r7 = kotlin.Unit.f93236a
                return r7
            L4b:
                r3 = 0
                r6.f96713s = r3
                r6.f96712r = r2
                java.lang.Object r7 = r1.e(r7, r6)
                if (r7 != r0) goto L57
            L56:
                return r0
            L57:
                kotlin.Unit r7 = kotlin.Unit.f93236a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: oe.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private b() {
    }

    @Override // pe.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(ie.c client, Function3 handler) throws ef.b {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        ef.i iVar = new ef.i("ObservableContent");
        client.s().j(re.g.f99440g.b(), iVar);
        client.s().l(iVar, new a(handler, null));
    }
}
