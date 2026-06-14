package hg;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Flow, c {

    /* JADX INFO: renamed from: hg.a$a, reason: collision with other inner class name */
    static final class C0894a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f73167r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f73168s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f73170u;

        C0894a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f73168s = obj;
            this.f73170u |= Integer.MIN_VALUE;
            return a.this.collect(null, this);
        }
    }

    public abstract Object c(FlowCollector flowCollector, Continuation continuation);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof hg.a.C0894a
            if (r0 == 0) goto L13
            r0 = r7
            hg.a$a r0 = (hg.a.C0894a) r0
            int r1 = r0.f73170u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73170u = r1
            goto L18
        L13:
            hg.a$a r0 = new hg.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f73168s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f73170u
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f73167r
            ig.v r6 = (ig.v) r6
            kotlin.d.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.d.b(r7)
            ig.v r7 = new ig.v
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f73167r = r7     // Catch: java.lang.Throwable -> L55
            r0.f73170u = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.c(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.a.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
