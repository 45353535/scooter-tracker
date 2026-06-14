package com.ironsource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface E5<T> {

    public static final class a<T> implements E5<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayList<T> f40672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final ArrayList<T> f40673b;

        public a(@NotNull ArrayList<T> a10, @NotNull ArrayList<T> b10) {
            Intrinsics.checkNotNullParameter(a10, "a");
            Intrinsics.checkNotNullParameter(b10, "b");
            this.f40672a = a10;
            this.f40673b = b10;
        }

        @Override // com.ironsource.E5
        public boolean contains(T t10) {
            return this.f40672a.contains(t10) || this.f40673b.contains(t10);
        }

        @Override // com.ironsource.E5
        public int size() {
            return this.f40672a.size() + this.f40673b.size();
        }

        @Override // com.ironsource.E5
        @NotNull
        public List<T> value() {
            return CollectionsKt.plus((Collection) this.f40672a, (Iterable) this.f40673b);
        }
    }

    public static final class b<T> implements E5<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final E5<T> f40674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Comparator<T> f40675b;

        public b(@NotNull E5<T> collection, @NotNull Comparator<T> comparator) {
            Intrinsics.checkNotNullParameter(collection, "collection");
            Intrinsics.checkNotNullParameter(comparator, "comparator");
            this.f40674a = collection;
            this.f40675b = comparator;
        }

        @Override // com.ironsource.E5
        public boolean contains(T t10) {
            return this.f40674a.contains(t10);
        }

        @Override // com.ironsource.E5
        public int size() {
            return this.f40674a.size();
        }

        @Override // com.ironsource.E5
        @NotNull
        public List<T> value() {
            return CollectionsKt.sortedWith(this.f40674a.value(), this.f40675b);
        }
    }

    public static final class c<T> implements E5<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f40676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<T> f40677b;

        public c(@NotNull E5<T> collection, int i10) {
            Intrinsics.checkNotNullParameter(collection, "collection");
            this.f40676a = i10;
            this.f40677b = collection.value();
        }

        @NotNull
        public final List<T> a() {
            int size = this.f40677b.size();
            int i10 = this.f40676a;
            if (size <= i10) {
                return CollectionsKt.emptyList();
            }
            List<T> list = this.f40677b;
            return list.subList(i10, list.size());
        }

        @NotNull
        public final List<T> b() {
            List<T> list = this.f40677b;
            return list.subList(0, kotlin.ranges.g.j(list.size(), this.f40676a));
        }

        @Override // com.ironsource.E5
        public boolean contains(T t10) {
            return this.f40677b.contains(t10);
        }

        @Override // com.ironsource.E5
        public int size() {
            return this.f40677b.size();
        }

        @Override // com.ironsource.E5
        @NotNull
        public List<T> value() {
            return this.f40677b;
        }
    }

    boolean contains(T t10);

    int size();

    @NotNull
    List<T> value();
}
