package j$.time.format;

import j$.util.C5654f;
import j$.util.C5664p;
import j$.util.Map;
import j$.util.Spliterator;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.IntPredicate$CC;
import j$.util.stream.A;
import j$.util.stream.AbstractC5667a;
import j$.util.stream.B;
import j$.util.stream.C5713j0;
import j$.util.stream.C5718k0;
import j$.util.stream.C5726l3;
import j$.util.stream.C5736n3;
import j$.util.stream.C5746p3;
import j$.util.stream.C5791z;
import j$.util.stream.Collectors;
import j$.util.stream.E3;
import j$.util.stream.IntStream;
import j$.util.stream.InterfaceC5723l0;
import j$.util.stream.InterfaceC5725l2;
import j$.util.stream.Stream;
import j$.util.stream.X2;
import j$.util.stream.Z2;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements Consumer, IntPredicate, Predicate, Supplier, BinaryOperator, DoubleFunction, Function, LongFunction, BooleanSupplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f84654b;

    public /* synthetic */ r(int i10) {
        this.f84653a = i10;
    }

    public /* synthetic */ r(int i10, Object obj) {
        this.f84653a = i10;
        this.f84654b = obj;
    }

    public /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return IntPredicate$CC.$default$and(this, intPredicate);
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return j$.com.android.tools.r8.a.b(this, predicate);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f84653a) {
            case 1:
                break;
            case 10:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen, reason: collision with other method in class */
    public /* synthetic */ Function mo7820andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ IntPredicate negate() {
        return IntPredicate$CC.$default$negate(this);
    }

    public /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return IntPredicate$CC.$default$or(this, intPredicate);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return j$.com.android.tools.r8.a.m(this, predicate);
    }

    /* JADX INFO: renamed from: negate, reason: collision with other method in class */
    public Predicate m7821negate() {
        return new r(3, this);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.f84654b).test(obj);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object objApply = ((Function) this.f84654b).apply(obj);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof Stream) {
            return Stream.Wrapper.convert((Stream) objApply);
        }
        if (objApply instanceof java.util.stream.Stream) {
            return X2.k((java.util.stream.Stream) objApply);
        }
        if (objApply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) objApply);
        }
        if (objApply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) objApply);
        }
        if (objApply instanceof B) {
            return A.k((B) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return C5791z.k((DoubleStream) objApply);
        }
        if (objApply instanceof InterfaceC5723l0) {
            return C5718k0.k((InterfaceC5723l0) objApply);
        }
        if (objApply instanceof LongStream) {
            return C5713j0.k((LongStream) objApply);
        }
        C5654f.a("java.util.stream.*Stream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.IntPredicate
    public boolean test(int i10) {
        return !((IntPredicate) this.f84654b).test(i10);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d10) {
        Object objApply = ((DoubleFunction) this.f84654b).apply(d10);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof B) {
            return A.k((B) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return C5791z.k((DoubleStream) objApply);
        }
        C5654f.a("java.util.stream.DoubleStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j10) {
        Object objApply = ((LongFunction) this.f84654b).apply(j10);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof InterfaceC5723l0) {
            return C5718k0.k((InterfaceC5723l0) objApply);
        }
        if (objApply instanceof LongStream) {
            return C5713j0.k((LongStream) objApply);
        }
        C5654f.a("java.util.stream.LongStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.f84653a) {
            case 13:
                C5726l3 c5726l3 = (C5726l3) this.f84654b;
                return c5726l3.f85234d.tryAdvance(c5726l3.f85235e);
            case 14:
                C5736n3 c5736n3 = (C5736n3) this.f84654b;
                return c5736n3.f85234d.tryAdvance(c5736n3.f85235e);
            case 15:
                C5746p3 c5746p3 = (C5746p3) this.f84654b;
                return c5746p3.f85234d.tryAdvance(c5746p3.f85235e);
            default:
                E3 e32 = (E3) this.f84654b;
                return e32.f85234d.tryAdvance(e32.f85235e);
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f84653a) {
            case 4:
                return ((AbstractC5667a) this.f84654b).L(0);
            default:
                return (Spliterator) this.f84654b;
        }
    }

    public void c(Z2 z22) {
        ((EnumMap) this.f84654b).put(z22, 1);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        Map map = (Map) obj;
        Set set = Collectors.f85010a;
        for (Map.Entry entry : ((Map) obj2).entrySet()) {
            Map.EL.merge(map, entry.getKey(), entry.getValue(), (BinaryOperator) this.f84654b);
        }
        return map;
    }

    public r(java.util.Map map) {
        this.f84653a = 0;
        this.f84654b = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry2 : ((java.util.Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l10 = (Long) entry2.getKey();
                q qVar = b.f84615b;
                map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l10));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, b.f84615b);
            map2.put((v) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, b.f84615b);
    }

    public String b(long j10, v vVar) {
        java.util.Map map = (java.util.Map) ((java.util.Map) this.f84654b).get(vVar);
        if (map != null) {
            return (String) map.get(Long.valueOf(j10));
        }
        return null;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f84653a) {
            case 1:
                ((Consumer) this.f84654b).accept(new C5664p((Map.Entry) obj));
                break;
            case 10:
                ((InterfaceC5725l2) this.f84654b).accept(obj);
                break;
            default:
                ((ArrayList) this.f84654b).add(obj);
                break;
        }
    }
}
