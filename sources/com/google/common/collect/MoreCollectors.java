package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.MoreCollectors;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
@IgnoreJRERequirement
public final class MoreCollectors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Collector f30006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f30007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Collector f30008c;

    /* JADX INFO: Access modifiers changed from: private */
    static final class ToOptionalState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f30009a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List f30010b = Collections.EMPTY_LIST;

        ToOptionalState() {
        }

        void a(Object obj) {
            Preconditions.checkNotNull(obj);
            if (this.f30009a == null) {
                this.f30009a = obj;
                return;
            }
            if (this.f30010b.isEmpty()) {
                ArrayList arrayList = new ArrayList(4);
                this.f30010b = arrayList;
                arrayList.add(obj);
            } else {
                if (this.f30010b.size() >= 4) {
                    throw e(true);
                }
                this.f30010b.add(obj);
            }
        }

        ToOptionalState b(ToOptionalState toOptionalState) {
            if (this.f30009a == null) {
                return toOptionalState;
            }
            if (toOptionalState.f30009a != null) {
                if (this.f30010b.isEmpty()) {
                    this.f30010b = new ArrayList();
                }
                this.f30010b.add(toOptionalState.f30009a);
                this.f30010b.addAll(toOptionalState.f30010b);
                if (this.f30010b.size() > 4) {
                    List list = this.f30010b;
                    list.subList(4, list.size()).clear();
                    throw e(true);
                }
            }
            return this;
        }

        Object c() {
            if (this.f30009a == null) {
                throw new NoSuchElementException();
            }
            if (this.f30010b.isEmpty()) {
                return this.f30009a;
            }
            throw e(false);
        }

        Optional d() {
            if (this.f30010b.isEmpty()) {
                return Optional.ofNullable(this.f30009a);
            }
            throw e(false);
        }

        IllegalArgumentException e(boolean z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("expected one element but was: <");
            sb2.append(this.f30009a);
            for (Object obj : this.f30010b) {
                sb2.append(", ");
                sb2.append(obj);
            }
            if (z10) {
                sb2.append(", ...");
            }
            sb2.append('>');
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    static {
        Supplier supplier = new Supplier() { // from class: com.google.common.collect.r2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new MoreCollectors.ToOptionalState();
            }
        };
        BiConsumer biConsumer = new BiConsumer() { // from class: com.google.common.collect.s2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((MoreCollectors.ToOptionalState) obj).a(obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer2) {
                return BiConsumer$CC.$default$andThen(this, biConsumer2);
            }
        };
        BinaryOperator binaryOperator = new BinaryOperator() { // from class: com.google.common.collect.t2
            public /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((MoreCollectors.ToOptionalState) obj).b((MoreCollectors.ToOptionalState) obj2);
            }
        };
        Function function = new Function() { // from class: com.google.common.collect.u2
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo7820andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((MoreCollectors.ToOptionalState) obj).d();
            }

            public /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        Collector.Characteristics characteristics = Collector.Characteristics.UNORDERED;
        f30006a = Collector.CC.of(supplier, biConsumer, binaryOperator, function, characteristics);
        f30007b = new Object();
        f30008c = Collector.CC.of(new Supplier() { // from class: com.google.common.collect.r2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new MoreCollectors.ToOptionalState();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.v2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                MoreCollectors.a((MoreCollectors.ToOptionalState) obj, obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer2) {
                return BiConsumer$CC.$default$andThen(this, biConsumer2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.t2
            public /* synthetic */ BiFunction andThen(Function function2) {
                return BiFunction$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((MoreCollectors.ToOptionalState) obj).b((MoreCollectors.ToOptionalState) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.w2
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo7820andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MoreCollectors.b((MoreCollectors.ToOptionalState) obj);
            }

            public /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, characteristics);
    }

    public static /* synthetic */ void a(ToOptionalState toOptionalState, Object obj) {
        if (obj == null) {
            obj = f30007b;
        }
        toOptionalState.a(obj);
    }

    public static /* synthetic */ Object b(ToOptionalState toOptionalState) {
        Object objC = toOptionalState.c();
        if (objC == f30007b) {
            return null;
        }
        return objC;
    }

    public static <T> Collector<T, ?, T> onlyElement() {
        return f30008c;
    }

    public static <T> Collector<T, ?, Optional<T>> toOptional() {
        return f30006a;
    }
}
