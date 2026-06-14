package hg;

import ig.q;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class m {
    public static final Flow a(Flow flow, int i10, gg.a aVar) {
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i10).toString());
        }
        if (i10 == -1 && aVar != gg.a.f72765b) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == -1) {
            aVar = gg.a.f72766c;
            i10 = 0;
        }
        int i11 = i10;
        gg.a aVar2 = aVar;
        if (flow instanceof ig.q) {
            return q.a.a((ig.q) flow, null, i11, aVar2, 1, null);
        }
        return new ig.h(flow, null, i11, aVar2, 2, null);
    }

    public static /* synthetic */ Flow b(Flow flow, int i10, gg.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            aVar = gg.a.f72765b;
        }
        return i.d(flow, i10, aVar);
    }

    public static final Flow c(Flow flow) {
        return flow instanceof c ? flow : new d(flow);
    }

    private static final void d(CoroutineContext coroutineContext) {
        if (coroutineContext.get(Job.N8) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }

    public static final Flow e(Flow flow) {
        return b(flow, -1, null, 2, null);
    }

    public static final Flow f(Flow flow, CoroutineContext coroutineContext) {
        d(coroutineContext);
        if (Intrinsics.areEqual(coroutineContext, kotlin.coroutines.e.f93267b)) {
            return flow;
        }
        if (flow instanceof ig.q) {
            return q.a.a((ig.q) flow, coroutineContext, 0, null, 6, null);
        }
        return new ig.h(flow, coroutineContext, 0, null, 12, null);
    }
}
