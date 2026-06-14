package j$.util.concurrent;

import j$.util.Spliterator;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.stream.AbstractC5667a;
import j$.util.stream.AbstractC5752r0;
import j$.util.stream.C5716j3;
import j$.util.stream.C5733n0;
import j$.util.stream.C5738o0;
import j$.util.stream.C5762t0;
import j$.util.stream.EnumC5671a3;
import j$.util.stream.EnumC5676b3;
import j$.util.stream.EnumC5757s0;
import j$.util.stream.G3;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s implements BiConsumer, BiFunction, Consumer, Supplier, G3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f84890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f84891c;

    public /* synthetic */ s(int i10, Object obj, Object obj2) {
        this.f84889a = i10;
        this.f84890b = obj;
        this.f84891c = obj2;
    }

    public /* synthetic */ s(BiFunction biFunction, Function function) {
        this.f84889a = 2;
        this.f84891c = biFunction;
        this.f84890b = function;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f84889a) {
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f84889a) {
            case 3:
                break;
            case 4:
                break;
            case 8:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.f84890b).apply(((BiFunction) this.f84891c).apply(obj, obj2));
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f84889a) {
            case 0:
                break;
            default:
                ((BiConsumer) this.f84890b).accept(obj, obj2);
                ((BiConsumer) this.f84891c).accept(obj, obj2);
                return;
        }
        do {
            Object objApply = ((BiFunction) this.f84891c).apply(obj, obj2);
            java.util.concurrent.ConcurrentMap concurrentMap = (java.util.concurrent.ConcurrentMap) this.f84890b;
            if (concurrentMap.replace(obj, obj2, objApply)) {
                return;
            } else {
                obj2 = concurrentMap.get(obj);
            }
        } while (obj2 != null);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f84889a) {
            case 5:
                return new C5738o0((EnumC5757s0) this.f84890b, (IntPredicate) this.f84891c);
            default:
                return new C5733n0((EnumC5757s0) this.f84890b, (Predicate) this.f84891c);
        }
    }

    public s(EnumC5676b3 enumC5676b3, EnumC5757s0 enumC5757s0, Supplier supplier) {
        this.f84889a = 7;
        this.f84890b = enumC5757s0;
        this.f84891c = supplier;
    }

    @Override // j$.util.stream.G3
    public int d() {
        return EnumC5671a3.f85211u | EnumC5671a3.f85208r;
    }

    @Override // j$.util.stream.G3
    public Object b(AbstractC5667a abstractC5667a, Spliterator spliterator) {
        AbstractC5752r0 abstractC5752r0 = (AbstractC5752r0) ((Supplier) this.f84891c).get();
        abstractC5667a.O(spliterator, abstractC5752r0);
        return Boolean.valueOf(abstractC5752r0.f85350b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.G3
    public Object c(AbstractC5667a abstractC5667a, Spliterator spliterator) {
        return (Boolean) new C5762t0(this, abstractC5667a, spliterator).invoke();
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public void p(Object obj) {
        switch (this.f84889a) {
            case 3:
                ((Consumer) this.f84890b).p(obj);
                ((Consumer) this.f84891c).p(obj);
                break;
            case 4:
                if (obj == null) {
                    ((AtomicBoolean) this.f84890b).set(true);
                } else {
                    ((ConcurrentHashMap) this.f84891c).putIfAbsent(obj, Boolean.TRUE);
                }
                break;
            case 8:
                ((BiConsumer) this.f84890b).accept(this.f84891c, obj);
                break;
            default:
                C5716j3 c5716j3 = (C5716j3) this.f84890b;
                c5716j3.getClass();
                if (c5716j3.f85293b.putIfAbsent(obj != null ? obj : C5716j3.f85291d, Boolean.TRUE) == null) {
                    ((Consumer) this.f84891c).p(obj);
                }
                break;
        }
    }
}
