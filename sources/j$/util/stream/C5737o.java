package j$.util.stream;

import j$.util.function.BiFunction$CC;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: j$.util.stream.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5737o implements BinaryOperator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BiConsumer f85322b;

    public /* synthetic */ C5737o(BiConsumer biConsumer, int i10) {
        this.f85321a = i10;
        this.f85322b = biConsumer;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f85321a) {
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f85321a) {
            case 0:
                this.f85322b.accept(obj, obj2);
                break;
            case 1:
                this.f85322b.accept(obj, obj2);
                break;
            default:
                this.f85322b.accept(obj, obj2);
                break;
        }
        return obj;
    }
}
