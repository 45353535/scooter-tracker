package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.google.common.collect.TableCollectors;
import com.google.common.collect.Tables;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
@IgnoreJRERequirement
final class TableCollectors {

    /* JADX INFO: Access modifiers changed from: private */
    static final class ImmutableTableCollectorState<R, C, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List f30302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Table f30303b;

        private ImmutableTableCollectorState() {
            this.f30302a = new ArrayList();
            this.f30303b = HashBasedTable.create();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public ImmutableTableCollectorState a(ImmutableTableCollectorState immutableTableCollectorState, BinaryOperator binaryOperator) {
            for (MutableCell mutableCell : immutableTableCollectorState.f30302a) {
                b(mutableCell.getRowKey(), mutableCell.getColumnKey(), mutableCell.getValue(), binaryOperator);
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(Object obj, Object obj2, Object obj3, BinaryOperator binaryOperator) {
            MutableCell mutableCell = (MutableCell) this.f30303b.get(obj, obj2);
            if (mutableCell != null) {
                mutableCell.a(obj3, binaryOperator);
                return;
            }
            MutableCell mutableCell2 = new MutableCell(obj, obj2, obj3);
            this.f30302a.add(mutableCell2);
            this.f30303b.put(obj, obj2, mutableCell2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public ImmutableTable c() {
            return ImmutableTable.l(this.f30302a);
        }
    }

    @IgnoreJRERequirement
    private static final class MutableCell<R, C, V> extends Tables.AbstractCell<R, C, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f30304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f30305c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Object f30306d;

        MutableCell(Object obj, Object obj2, Object obj3) {
            this.f30304b = Preconditions.checkNotNull(obj, "row");
            this.f30305c = Preconditions.checkNotNull(obj2, "column");
            this.f30306d = Preconditions.checkNotNull(obj3, "value");
        }

        void a(Object obj, BinaryOperator binaryOperator) {
            Preconditions.checkNotNull(obj, "value");
            this.f30306d = Preconditions.checkNotNull(binaryOperator.apply(this.f30306d, obj), "mergeFunction.apply");
        }

        @Override // com.google.common.collect.Table.Cell
        public C getColumnKey() {
            return (C) this.f30305c;
        }

        @Override // com.google.common.collect.Table.Cell
        public R getRowKey() {
            return (R) this.f30304b;
        }

        @Override // com.google.common.collect.Table.Cell
        public V getValue() {
            return (V) this.f30306d;
        }
    }

    public static /* synthetic */ Object b(Object obj, Object obj2) {
        throw new IllegalStateException("Conflicting values " + obj + " and " + obj2);
    }

    public static /* synthetic */ ImmutableTableCollectorState f() {
        return new ImmutableTableCollectorState();
    }

    public static /* synthetic */ Table g(BinaryOperator binaryOperator, Table table, Table table2) {
        for (Table.Cell cell : table2.cellSet()) {
            i(table, cell.getRowKey(), cell.getColumnKey(), cell.getValue(), binaryOperator);
        }
        return table;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(Table table, Object obj, Object obj2, Object obj3, BinaryOperator binaryOperator) {
        Preconditions.checkNotNull(obj3);
        Object obj4 = table.get(obj, obj2);
        if (obj4 == null) {
            table.put(obj, obj2, obj3);
            return;
        }
        T tApply = binaryOperator.apply(obj4, obj3);
        if (tApply == 0) {
            table.remove(obj, obj2);
        } else {
            table.put(obj, obj2, tApply);
        }
    }

    static Collector j(final Function function, final Function function2, final Function function3) {
        Preconditions.checkNotNull(function, "rowFunction");
        Preconditions.checkNotNull(function2, "columnFunction");
        Preconditions.checkNotNull(function3, "valueFunction");
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.p3
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ImmutableTable.Builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.q3
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableTable.Builder) obj).put(function.apply(obj2), function2.apply(obj2), function3.apply(obj2));
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.r3
            public /* synthetic */ BiFunction andThen(Function function4) {
                return BiFunction$CC.$default$andThen(this, function4);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableTable.Builder) obj).a((ImmutableTable.Builder) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.i3
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo7820andThen(Function function4) {
                return Function$CC.$default$andThen(this, function4);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableTable.Builder) obj).build();
            }

            public /* synthetic */ Function compose(Function function4) {
                return Function$CC.$default$compose(this, function4);
            }
        }, new Collector.Characteristics[0]);
    }

    static Collector k(final Function function, final Function function2, final Function function3, final BinaryOperator binaryOperator) {
        Preconditions.checkNotNull(function, "rowFunction");
        Preconditions.checkNotNull(function2, "columnFunction");
        Preconditions.checkNotNull(function3, "valueFunction");
        Preconditions.checkNotNull(binaryOperator, "mergeFunction");
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.l3
            @Override // java.util.function.Supplier
            public final Object get() {
                return TableCollectors.f();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.m3
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                TableCollectors.ImmutableTableCollectorState immutableTableCollectorState = (TableCollectors.ImmutableTableCollectorState) obj;
                immutableTableCollectorState.b(function.apply(obj2), function2.apply(obj2), function3.apply(obj2), binaryOperator);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.n3
            public /* synthetic */ BiFunction andThen(Function function4) {
                return BiFunction$CC.$default$andThen(this, function4);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((TableCollectors.ImmutableTableCollectorState) obj).a((TableCollectors.ImmutableTableCollectorState) obj2, binaryOperator);
            }
        }, new Function() { // from class: com.google.common.collect.o3
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo7820andThen(Function function4) {
                return Function$CC.$default$andThen(this, function4);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((TableCollectors.ImmutableTableCollectorState) obj).c();
            }

            public /* synthetic */ Function compose(Function function4) {
                return Function$CC.$default$compose(this, function4);
            }
        }, new Collector.Characteristics[0]);
    }

    static Collector l(final Function function, final Function function2, final Function function3, final BinaryOperator binaryOperator, Supplier supplier) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(function3);
        Preconditions.checkNotNull(binaryOperator);
        Preconditions.checkNotNull(supplier);
        return Collector.CC.of(supplier, new BiConsumer() { // from class: com.google.common.collect.j3
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Table table = (Table) obj;
                TableCollectors.i(table, function.apply(obj2), function2.apply(obj2), function3.apply(obj2), binaryOperator);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.k3
            public /* synthetic */ BiFunction andThen(Function function4) {
                return BiFunction$CC.$default$andThen(this, function4);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return TableCollectors.g(binaryOperator, (Table) obj, (Table) obj2);
            }
        }, new Collector.Characteristics[0]);
    }

    static Collector m(Function function, Function function2, Function function3, Supplier supplier) {
        return l(function, function2, function3, new BinaryOperator() { // from class: com.google.common.collect.h3
            public /* synthetic */ BiFunction andThen(Function function4) {
                return BiFunction$CC.$default$andThen(this, function4);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return TableCollectors.b(obj, obj2);
            }
        }, supplier);
    }
}
