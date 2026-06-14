package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import j$.util.stream.Collector;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ImmutableTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {

    @DoNotMock
    public static final class Builder<R, C, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f29704a = Lists.newArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Comparator f29705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Comparator f29706c;

        Builder a(Builder builder) {
            this.f29704a.addAll(builder.f29704a);
            return this;
        }

        public ImmutableTable<R, C, V> build() {
            return buildOrThrow();
        }

        public ImmutableTable<R, C, V> buildOrThrow() {
            int size = this.f29704a.size();
            return size != 0 ? size != 1 ? RegularImmutableTable.r(this.f29704a, this.f29705b, this.f29706c) : new SingletonImmutableTable((Table.Cell) Iterables.getOnlyElement(this.f29704a)) : ImmutableTable.of();
        }

        @CanIgnoreReturnValue
        public Builder<R, C, V> orderColumnsBy(Comparator<? super C> comparator) {
            this.f29706c = (Comparator) Preconditions.checkNotNull(comparator, "columnComparator");
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<R, C, V> orderRowsBy(Comparator<? super R> comparator) {
            this.f29705b = (Comparator) Preconditions.checkNotNull(comparator, "rowComparator");
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<R, C, V> put(R r10, C c10, V v10) {
            this.f29704a.add(ImmutableTable.k(r10, c10, v10));
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<R, C, V> putAll(Table<? extends R, ? extends C, ? extends V> table) {
            Iterator<Table.Cell<? extends R, ? extends C, ? extends V>> it = table.cellSet().iterator();
            while (it.hasNext()) {
                put(it.next());
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<R, C, V> put(Table.Cell<? extends R, ? extends C, ? extends V> cell) {
            if (!(cell instanceof Tables.ImmutableCell)) {
                put(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
                return this;
            }
            Preconditions.checkNotNull(cell.getRowKey(), "row");
            Preconditions.checkNotNull(cell.getColumnKey(), "column");
            Preconditions.checkNotNull(cell.getValue(), "value");
            this.f29704a.add(cell);
            return this;
        }
    }

    static final class SerializedForm implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object[] f29707b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object[] f29708c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object[] f29709d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f29710e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[] f29711f;

        private SerializedForm(Object[] objArr, Object[] objArr2, Object[] objArr3, int[] iArr, int[] iArr2) {
            this.f29707b = objArr;
            this.f29708c = objArr2;
            this.f29709d = objArr3;
            this.f29710e = iArr;
            this.f29711f = iArr2;
        }

        static SerializedForm a(ImmutableTable immutableTable, int[] iArr, int[] iArr2) {
            return new SerializedForm(immutableTable.rowKeySet().toArray(), immutableTable.columnKeySet().toArray(), immutableTable.values().toArray(), iArr, iArr2);
        }

        Object readResolve() {
            Object[] objArr = this.f29709d;
            if (objArr.length == 0) {
                return ImmutableTable.of();
            }
            int i10 = 0;
            if (objArr.length == 1) {
                return ImmutableTable.of(this.f29707b[0], this.f29708c[0], objArr[0]);
            }
            ImmutableList.Builder builder = new ImmutableList.Builder(objArr.length);
            while (true) {
                Object[] objArr2 = this.f29709d;
                if (i10 >= objArr2.length) {
                    return RegularImmutableTable.t(builder.build(), ImmutableSet.copyOf(this.f29707b), ImmutableSet.copyOf(this.f29708c));
                }
                builder.add(ImmutableTable.k(this.f29707b[this.f29710e[i10]], this.f29708c[this.f29711f[i10]], objArr2[i10]));
                i10++;
            }
        }
    }

    ImmutableTable() {
    }

    public static <R, C, V> Builder<R, C, V> builder() {
        return new Builder<>();
    }

    public static <R, C, V> ImmutableTable<R, C, V> copyOf(Table<? extends R, ? extends C, ? extends V> table) {
        return table instanceof ImmutableTable ? (ImmutableTable) table : l(table.cellSet());
    }

    static Table.Cell k(Object obj, Object obj2, Object obj3) {
        return Tables.immutableCell(Preconditions.checkNotNull(obj, "rowKey"), Preconditions.checkNotNull(obj2, "columnKey"), Preconditions.checkNotNull(obj3, "value"));
    }

    static ImmutableTable l(Iterable iterable) {
        Builder builder = builder();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            builder.put((Table.Cell) it.next());
        }
        return builder.build();
    }

    public static <R, C, V> ImmutableTable<R, C, V> of() {
        return SparseImmutableTable.f30231h;
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @IgnoreJRERequirement
    public static <T, R, C, V> Collector<T, ?, ImmutableTable<R, C, V>> toImmutableTable(Function<? super T, ? extends R> function, Function<? super T, ? extends C> function2, Function<? super T, ? extends V> function3) {
        return TableCollectors.j(function, function2, function3);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Table
    public abstract ImmutableMap<C, Map<R, V>> columnMap();

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean contains(Object obj, Object obj2) {
        return get(obj, obj2) != null;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsColumn(Object obj) {
        return super.containsColumn(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsRow(Object obj) {
        return super.containsRow(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Object get(Object obj, Object obj2) {
        return super.get(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractTable
    final Iterator i() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractTable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final UnmodifiableIterator d() {
        throw new AssertionError("should never be called");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractTable
    /* JADX INFO: renamed from: m */
    public abstract ImmutableSet g();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractTable
    /* JADX INFO: renamed from: n */
    public abstract ImmutableCollection h();

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final V put(R r10, C c10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(Table<? extends R, ? extends C, ? extends V> table) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final V remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Table
    public abstract ImmutableMap<R, Map<C, V>> rowMap();

    @Override // com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @J2ktIncompatible
    @GwtIncompatible
    abstract Object writeReplace();

    public static <R, C, V> ImmutableTable<R, C, V> of(R r10, C c10, V v10) {
        return new SingletonImmutableTable(r10, c10, v10);
    }

    @IgnoreJRERequirement
    public static <T, R, C, V> Collector<T, ?, ImmutableTable<R, C, V>> toImmutableTable(Function<? super T, ? extends R> function, Function<? super T, ? extends C> function2, Function<? super T, ? extends V> function3, BinaryOperator<V> binaryOperator) {
        return TableCollectors.k(function, function2, function3, binaryOperator);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public ImmutableSet<Table.Cell<R, C, V>> cellSet() {
        return (ImmutableSet) super.cellSet();
    }

    @Override // com.google.common.collect.Table
    public ImmutableMap<R, V> column(C c10) {
        Preconditions.checkNotNull(c10, "columnKey");
        return (ImmutableMap) MoreObjects.firstNonNull((ImmutableMap) columnMap().get(c10), ImmutableMap.of());
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public ImmutableSet<C> columnKeySet() {
        return columnMap().keySet();
    }

    @Override // com.google.common.collect.Table
    public ImmutableMap<C, V> row(R r10) {
        Preconditions.checkNotNull(r10, "rowKey");
        return (ImmutableMap) MoreObjects.firstNonNull((ImmutableMap) rowMap().get(r10), ImmutableMap.of());
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public ImmutableSet<R> rowKeySet() {
        return rowMap().keySet();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public ImmutableCollection<V> values() {
        return (ImmutableCollection) super.values();
    }
}
