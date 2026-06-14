package gg;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public interface x {
    void cancel(CancellationException cancellationException);

    Object f();

    Object i(Continuation continuation);

    i iterator();

    Object k(Continuation continuation);
}
