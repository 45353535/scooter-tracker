package com.google.protobuf.kotlin;

import androidx.exifinterface.media.ExifInterface;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Collection;
import java.util.Set;
import java.util.Spliterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yf.a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/kotlin/UnmodifiableSet;", ExifInterface.LONGITUDE_EAST, "Lcom/google/protobuf/kotlin/UnmodifiableCollection;", "", "delegate", "", "(Ljava/util/Collection;)V", "java_kotlin-shared_runtime"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UnmodifiableSet<E> extends UnmodifiableCollection<E> implements Set<E>, a, j$.util.Set {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnmodifiableSet(@NotNull Collection<? extends E> delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }

    @Override // com.google.protobuf.kotlin.UnmodifiableCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // com.google.protobuf.kotlin.UnmodifiableCollection, java.util.Collection, java.lang.Iterable, j$.util.Collection
    public /* synthetic */ j$.util.Spliterator spliterator() {
        return Spliterators.spliterator(this, 1);
    }
}
