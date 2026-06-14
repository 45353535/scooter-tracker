package j$.util.stream;

import j$.util.AbstractC5650b;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class a4 extends g4 implements DoubleConsumer, j$.util.T {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f85218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f85219f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a4(Spliterator spliterator, int i10) {
        super(spliterator);
        this.f85219f = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a4(Spliterator spliterator, g4 g4Var, int i10) {
        super(spliterator, g4Var);
        this.f85219f = i10;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.g4, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC5650b.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC5650b.f(this, consumer);
    }

    @Override // j$.util.b0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        while (tryAdvance(doubleConsumer)) {
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f85271d = (this.f85271d + 1) & 63;
        this.f85218e = d10;
    }

    @Override // j$.util.stream.g4
    public final Spliterator c(Spliterator spliterator) {
        switch (this.f85219f) {
            case 0:
                return new a4((j$.util.T) spliterator, this, 0);
            default:
                return new a4((j$.util.T) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.g4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f85219f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.g4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.b0 trySplit() {
        switch (this.f85219f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.T
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        switch (this.f85219f) {
            case 0:
                boolean z10 = this.f85270c;
                Spliterator spliterator = this.f85268a;
                if (z10) {
                    this.f85270c = false;
                    boolean zTryAdvance = ((j$.util.T) spliterator).tryAdvance((DoubleConsumer) this);
                    if (zTryAdvance && b()) {
                        DoublePredicate doublePredicate = null;
                        doublePredicate.test(this.f85218e);
                        throw null;
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    doubleConsumer.accept(this.f85218e);
                    return zTryAdvance;
                }
                return ((j$.util.T) spliterator).tryAdvance(doubleConsumer);
            default:
                if (this.f85270c && b() && ((j$.util.T) this.f85268a).tryAdvance((DoubleConsumer) this)) {
                    DoublePredicate doublePredicate2 = null;
                    doublePredicate2.test(this.f85218e);
                    throw null;
                }
                this.f85270c = false;
                return false;
        }
    }

    @Override // j$.util.stream.g4, j$.util.Spliterator
    public j$.util.T trySplit() {
        switch (this.f85219f) {
            case 1:
                if (this.f85269b.get()) {
                    return null;
                }
                return (j$.util.T) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.b0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f85219f) {
            case 1:
                tryAdvance((DoubleConsumer) obj);
                return false;
            default:
                return tryAdvance((DoubleConsumer) obj);
        }
    }
}
