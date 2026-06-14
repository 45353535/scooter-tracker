package hg;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jg.e0 f73196a = new jg.e0("NO_VALUE");

    public static final MutableSharedFlow a(int i10, int i11, gg.a aVar) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i10).toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i11).toString());
        }
        if (i10 > 0 || i11 > 0 || aVar == gg.a.f72765b) {
            int i12 = i11 + i10;
            if (i12 < 0) {
                i12 = Integer.MAX_VALUE;
            }
            return new b0(i10, i12, aVar);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
    }

    public static /* synthetic */ MutableSharedFlow b(int i10, int i11, gg.a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            aVar = gg.a.f72765b;
        }
        return a(i10, i11, aVar);
    }

    public static final Flow e(SharedFlow sharedFlow, CoroutineContext coroutineContext, int i10, gg.a aVar) {
        return ((i10 == 0 || i10 == -3) && aVar == gg.a.f72765b) ? sharedFlow : new ig.h(sharedFlow, coroutineContext, i10, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(Object[] objArr, long j10) {
        return objArr[((int) j10) & (objArr.length - 1)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }
}
