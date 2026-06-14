package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f93392a;

    public a(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f93392a = new AtomicReference(sequence);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        Sequence sequence = (Sequence) this.f93392a.getAndSet(null);
        if (sequence != null) {
            return sequence.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
