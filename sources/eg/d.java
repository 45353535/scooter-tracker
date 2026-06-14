package eg;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f69137r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f69138s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f69139t;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f69138s = obj;
            this.f69139t |= Integer.MIN_VALUE;
            return d.c(null, this);
        }
    }

    public static final Object a(Collection collection, Continuation continuation) {
        return collection.isEmpty() ? CollectionsKt.emptyList() : new c((Deferred[]) collection.toArray(new Deferred[0])).c(continuation);
    }

    public static final Object b(Deferred[] deferredArr, Continuation continuation) {
        return deferredArr.length == 0 ? CollectionsKt.emptyList() : new c(deferredArr).c(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(java.util.Collection r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof eg.d.a
            if (r0 == 0) goto L13
            r0 = r5
            eg.d$a r0 = (eg.d.a) r0
            int r1 = r0.f69139t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f69139t = r1
            goto L18
        L13:
            eg.d$a r0 = new eg.d$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f69138s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f69139t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f69137r
            java.util.Iterator r4 = (java.util.Iterator) r4
            kotlin.d.b(r5)
            goto L3e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.d.b(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L55
            java.lang.Object r5 = r4.next()
            kotlinx.coroutines.Job r5 = (kotlinx.coroutines.Job) r5
            r0.f69137r = r4
            r0.f69139t = r3
            java.lang.Object r5 = r5.i0(r0)
            if (r5 != r1) goto L3e
            return r1
        L55:
            kotlin.Unit r4 = kotlin.Unit.f93236a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.d.c(java.util.Collection, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
