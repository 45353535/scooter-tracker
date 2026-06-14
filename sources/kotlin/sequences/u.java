package kotlin.sequences;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class u extends s {
    public static Sequence w(Sequence sequence, final Class klass) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        Intrinsics.checkNotNullParameter(klass, "klass");
        Sequence sequenceE = x.E(sequence, new Function1() { // from class: kotlin.sequences.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(u.x(klass, obj));
            }
        });
        Intrinsics.checkNotNull(sequenceE, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        return sequenceE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x(Class cls, Object obj) {
        return cls.isInstance(obj);
    }
}
