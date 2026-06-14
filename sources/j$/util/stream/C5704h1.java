package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5704h1 extends AbstractC5709i1 {
    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        F0 f0A;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = this.f85282d.tryAdvance(consumer);
        if (!zTryAdvance) {
            if (this.f85281c == null && (f0A = AbstractC5709i1.a(this.f85283e)) != null) {
                Spliterator spliterator = f0A.spliterator();
                this.f85282d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
            this.f85279a = null;
        }
        return zTryAdvance;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f85279a == null) {
            return;
        }
        if (this.f85282d == null) {
            Spliterator spliterator = this.f85281c;
            if (spliterator == null) {
                ArrayDeque arrayDequeB = b();
                while (true) {
                    F0 f0A = AbstractC5709i1.a(arrayDequeB);
                    if (f0A != null) {
                        f0A.forEach(consumer);
                    } else {
                        this.f85279a = null;
                        return;
                    }
                }
            } else {
                spliterator.forEachRemaining(consumer);
            }
        } else {
            while (tryAdvance(consumer)) {
            }
        }
    }
}
