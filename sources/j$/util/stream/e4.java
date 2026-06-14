package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class e4 extends g4 implements LongConsumer, j$.util.Y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f85256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f85257f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e4(Spliterator spliterator, int i10) {
        super(spliterator);
        this.f85257f = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e4(Spliterator spliterator, g4 g4Var, int i10) {
        super(spliterator, g4Var);
        this.f85257f = i10;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.g4, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5650b.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5650b.h(this, consumer);
    }

    @Override // j$.util.b0
    public final void forEachRemaining(LongConsumer longConsumer) {
        while (tryAdvance(longConsumer)) {
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        this.f85271d = (this.f85271d + 1) & 63;
        this.f85256e = j10;
    }

    @Override // j$.util.stream.g4
    public final Spliterator c(Spliterator spliterator) {
        switch (this.f85257f) {
            case 0:
                return new e4((j$.util.Y) spliterator, this, 0);
            default:
                return new e4((j$.util.Y) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.g4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f85257f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.g4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.b0 trySplit() {
        switch (this.f85257f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.Y
    public final boolean tryAdvance(LongConsumer longConsumer) {
        switch (this.f85257f) {
            case 0:
                boolean z10 = this.f85270c;
                Spliterator spliterator = this.f85268a;
                if (z10) {
                    this.f85270c = false;
                    boolean zTryAdvance = ((j$.util.Y) spliterator).tryAdvance((LongConsumer) this);
                    if (zTryAdvance && b()) {
                        LongPredicate longPredicate = null;
                        longPredicate.test(this.f85256e);
                        throw null;
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    longConsumer.accept(this.f85256e);
                    return zTryAdvance;
                }
                return ((j$.util.Y) spliterator).tryAdvance(longConsumer);
            default:
                if (this.f85270c && b() && ((j$.util.Y) this.f85268a).tryAdvance((LongConsumer) this)) {
                    LongPredicate longPredicate2 = null;
                    longPredicate2.test(this.f85256e);
                    throw null;
                }
                this.f85270c = false;
                return false;
        }
    }

    @Override // j$.util.stream.g4, j$.util.Spliterator
    public j$.util.Y trySplit() {
        switch (this.f85257f) {
            case 1:
                if (this.f85269b.get()) {
                    return null;
                }
                return (j$.util.Y) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.b0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f85257f) {
            case 1:
                tryAdvance((LongConsumer) obj);
                return false;
            default:
                return tryAdvance((LongConsumer) obj);
        }
    }
}
