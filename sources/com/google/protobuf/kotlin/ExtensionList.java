package com.google.protobuf.kotlin;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.ExtensionLite;
import com.google.protobuf.MessageLite;
import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yf.a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B/\b\u0007\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\bJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0002\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0096\u0001J\u0013\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\u0016\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\fH\u0096\u0003¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\fH\u0016J\u0016\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0002\u0010\u001eJ\t\u0010\u001f\u001a\u00020\u0010H\u0096\u0001J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0096\u0002J\u0016\u0010\"\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0002\u0010\u001eJ\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0016J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$2\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\fH\u0096\u0001J\b\u0010(\u001a\u00020)H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006*"}, d2 = {"Lcom/google/protobuf/kotlin/ExtensionList;", ExifInterface.LONGITUDE_EAST, "M", "Lcom/google/protobuf/MessageLite;", "", "extension", "Lcom/google/protobuf/ExtensionLite;", "delegate", "(Lcom/google/protobuf/ExtensionLite;Ljava/util/List;)V", "getExtension", "()Lcom/google/protobuf/ExtensionLite;", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "", "equals", "other", "", "get", FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Object;", "hashCode", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "toString", "", "java_kotlin-shared_runtime"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExtensionList<E, M extends MessageLite> implements List<E>, a, j$.util.List {

    @NotNull
    private final List<E> delegate;

    @NotNull
    private final ExtensionLite<M, List<E>> extension;

    /* JADX WARN: Multi-variable type inference failed */
    @OnlyForUseByGeneratedProtoCode
    public ExtensionList(@NotNull ExtensionLite<M, List<E>> extension, @NotNull List<? extends E> delegate) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.extension = extension;
        this.delegate = delegate;
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return this.delegate.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.delegate.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(@Nullable Object other) {
        return Intrinsics.areEqual(this.delegate, other);
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public E get(int index) {
        return this.delegate.get(index);
    }

    @NotNull
    public final ExtensionLite<M, List<E>> getExtension() {
        return this.extension;
    }

    public int getSize() {
        return this.delegate.size();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.delegate.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        return this.delegate.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<E> iterator() {
        return new UnmodifiableIterator(this.delegate.iterator());
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        return this.delegate.lastIndexOf(element);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return new UnmodifiableListIterator(this.delegate.listIterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.List
    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public void replaceAll(UnaryOperator<E> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List, j$.util.List
    public void sort(Comparator<? super E> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(stream());
    }

    @Override // java.util.List
    @NotNull
    public List<E> subList(int fromIndex, int toIndex) {
        return this.delegate.subList(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return s.a(this);
    }

    @NotNull
    public String toString() {
        return this.delegate.toString();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<E> listIterator(int index) {
        return new UnmodifiableListIterator(this.delegate.listIterator(index));
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
    public /* synthetic */ j$.util.Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) s.b(this, array);
    }
}
