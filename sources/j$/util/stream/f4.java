package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final class f4 extends g4 implements Consumer {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Predicate f85263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f85264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f85265g;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(Spliterator spliterator, Predicate predicate, int i10) {
        super(spliterator);
        this.f85265g = i10;
        this.f85263e = predicate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(Spliterator spliterator, f4 f4Var, int i10) {
        super(spliterator, f4Var);
        this.f85265g = i10;
        this.f85263e = f4Var.f85263e;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f85271d = (this.f85271d + 1) & 63;
        this.f85264f = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        boolean zTryAdvance;
        boolean zTest;
        switch (this.f85265g) {
            case 0:
                boolean z10 = this.f85270c;
                Spliterator spliterator = this.f85268a;
                if (z10) {
                    boolean z11 = false;
                    this.f85270c = false;
                    while (true) {
                        zTryAdvance = spliterator.tryAdvance(this);
                        if (zTryAdvance && b() && this.f85263e.test(this.f85264f)) {
                            z11 = true;
                        }
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    if (z11) {
                        this.f85269b.set(true);
                    }
                    consumer.accept(this.f85264f);
                    return zTryAdvance;
                }
                return spliterator.tryAdvance(consumer);
            default:
                if (this.f85270c && b() && this.f85268a.tryAdvance(this)) {
                    zTest = this.f85263e.test(this.f85264f);
                    if (zTest) {
                        consumer.accept(this.f85264f);
                        return true;
                    }
                } else {
                    zTest = true;
                }
                this.f85270c = false;
                if (!zTest) {
                    this.f85269b.set(true);
                }
                return false;
        }
    }

    @Override // j$.util.stream.g4, j$.util.Spliterator
    public Spliterator trySplit() {
        switch (this.f85265g) {
            case 1:
                if (!this.f85269b.get()) {
                    break;
                }
                break;
        }
        return super.trySplit();
    }

    @Override // j$.util.stream.g4
    public final Spliterator c(Spliterator spliterator) {
        switch (this.f85265g) {
            case 0:
                return new f4(spliterator, this, 0);
            default:
                return new f4(spliterator, this, 1);
        }
    }
}
