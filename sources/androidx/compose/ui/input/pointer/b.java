package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Size;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static long a(AwaitPointerEventScope awaitPointerEventScope) {
        return Size.INSTANCE.m1449getZeroNHjbRc();
    }

    public static Object b(AwaitPointerEventScope awaitPointerEventScope, long j10, Function2 function2, Continuation continuation) {
        return u(awaitPointerEventScope, j10, function2, continuation);
    }

    public static Object c(AwaitPointerEventScope awaitPointerEventScope, long j10, Function2 function2, Continuation continuation) {
        return v(awaitPointerEventScope, j10, function2, continuation);
    }

    public static /* synthetic */ Object t(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i10 & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
    }

    public static /* synthetic */ Object u(AwaitPointerEventScope awaitPointerEventScope, long j10, Function2 function2, Continuation continuation) {
        return function2.invoke(awaitPointerEventScope, continuation);
    }

    public static /* synthetic */ Object v(AwaitPointerEventScope awaitPointerEventScope, long j10, Function2 function2, Continuation continuation) {
        return function2.invoke(awaitPointerEventScope, continuation);
    }
}
