package kotlin.sequences;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    public abstract Object b(Object obj, Continuation continuation);

    public abstract Object c(Iterator it, Continuation continuation);

    public final Object d(Sequence sequence, Continuation continuation) {
        Object objC = c(sequence.iterator(), continuation);
        return objC == pf.b.g() ? objC : Unit.f93236a;
    }
}
