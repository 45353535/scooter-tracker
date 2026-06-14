package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class K0 extends L0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f85070k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K0(AbstractC5667a abstractC5667a, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator, int i10) {
        super(abstractC5667a, spliterator, longFunction, binaryOperator);
        this.f85070k = i10;
    }

    @Override // j$.util.stream.L0, j$.util.stream.AbstractC5682d
    public final AbstractC5682d c(Spliterator spliterator) {
        switch (this.f85070k) {
        }
        return new L0(this, spliterator);
    }

    @Override // j$.util.stream.L0, j$.util.stream.AbstractC5682d
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f85070k) {
        }
        return a();
    }
}
