package androidx.core.util;

import android.util.LongSparseArray;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.LongIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a(\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0005\u0010\u0006\u001a0\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\t\u0010\n\u001a4\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\b\f\u0010\r\u001a(\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u000e\u0010\u0006\u001a(\u0010\u000f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a0\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a6\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a \u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a \u0010\u0019\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\b¢\u0006\u0004\b\u0019\u0010\u0018\u001a-\u0010\u001a\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a+\u0010\u001c\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a:\u0010 \u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u001eH\u0086\b¢\u0006\u0004\b \u0010!\u001a\u001d\u0010#\u001a\u00020\"\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b#\u0010$\u001a#\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b&\u0010'\"\"\u0010+\u001a\u00020(\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"T", "Landroid/util/LongSparseArray;", "", C4240b4.i.W, "", "contains", "(Landroid/util/LongSparseArray;J)Z", "value", "", "set", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)V", "other", "plus", "(Landroid/util/LongSparseArray;Landroid/util/LongSparseArray;)Landroid/util/LongSparseArray;", "containsKey", "containsValue", "(Landroid/util/LongSparseArray;Ljava/lang/Object;)Z", "defaultValue", "getOrDefault", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "getOrElse", "(Landroid/util/LongSparseArray;JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isEmpty", "(Landroid/util/LongSparseArray;)Z", "isNotEmpty", "remove", "(Landroid/util/LongSparseArray;JLjava/lang/Object;)Z", "putAll", "(Landroid/util/LongSparseArray;Landroid/util/LongSparseArray;)V", "Lkotlin/Function2;", "action", "forEach", "(Landroid/util/LongSparseArray;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/collections/LongIterator;", "keyIterator", "(Landroid/util/LongSparseArray;)Lkotlin/collections/LongIterator;", "", "valueIterator", "(Landroid/util/LongSparseArray;)Ljava/util/Iterator;", "", "getSize", "(Landroid/util/LongSparseArray;)I", "size", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LongSparseArrayKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.core.util.LongSparseArrayKt$valueIterator$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\b\u001a\u00020\tH\u0096\u0002J\u0016\u0010\n\u001a\n \u000b*\u0004\u0018\u00018\u00008\u0000H\u0096\u0002¢\u0006\u0002\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"androidx/core/util/LongSparseArrayKt$valueIterator$1", "", FirebaseAnalytics.Param.INDEX, "", "getIndex", "()I", "setIndex", "(I)V", "hasNext", "", "next", "kotlin.jvm.PlatformType", "()Ljava/lang/Object;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C16201<T> implements Iterator<T>, yf.a {
        final /* synthetic */ LongSparseArray<T> $this_valueIterator;
        private int index;

        C16201(LongSparseArray<T> longSparseArray) {
            this.$this_valueIterator = longSparseArray;
        }

        public final int getIndex() {
            return this.index;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_valueIterator.size();
        }

        @Override // java.util.Iterator
        public T next() {
            LongSparseArray<T> longSparseArray = this.$this_valueIterator;
            int i10 = this.index;
            this.index = i10 + 1;
            return longSparseArray.valueAt(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i10) {
            this.index = i10;
        }
    }

    public static final <T> boolean contains(@NotNull LongSparseArray<T> longSparseArray, long j10) {
        return longSparseArray.indexOfKey(j10) >= 0;
    }

    public static final <T> boolean containsKey(@NotNull LongSparseArray<T> longSparseArray, long j10) {
        return longSparseArray.indexOfKey(j10) >= 0;
    }

    public static final <T> boolean containsValue(@NotNull LongSparseArray<T> longSparseArray, T t10) {
        return longSparseArray.indexOfValue(t10) >= 0;
    }

    public static final <T> void forEach(@NotNull LongSparseArray<T> longSparseArray, @NotNull Function2<? super Long, ? super T, Unit> function2) {
        int size = longSparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            function2.invoke(Long.valueOf(longSparseArray.keyAt(i10)), longSparseArray.valueAt(i10));
        }
    }

    public static final <T> T getOrDefault(@NotNull LongSparseArray<T> longSparseArray, long j10, T t10) {
        T t11 = longSparseArray.get(j10);
        return t11 == null ? t10 : t11;
    }

    public static final <T> T getOrElse(@NotNull LongSparseArray<T> longSparseArray, long j10, @NotNull Function0<? extends T> function0) {
        T t10 = longSparseArray.get(j10);
        return t10 == null ? function0.invoke() : t10;
    }

    public static final <T> int getSize(@NotNull LongSparseArray<T> longSparseArray) {
        return longSparseArray.size();
    }

    public static final <T> boolean isEmpty(@NotNull LongSparseArray<T> longSparseArray) {
        return longSparseArray.size() == 0;
    }

    public static final <T> boolean isNotEmpty(@NotNull LongSparseArray<T> longSparseArray) {
        return longSparseArray.size() != 0;
    }

    @NotNull
    public static final <T> LongIterator keyIterator(@NotNull final LongSparseArray<T> longSparseArray) {
        return new LongIterator() { // from class: androidx.core.util.LongSparseArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < longSparseArray.size();
            }

            @Override // kotlin.collections.LongIterator
            public long nextLong() {
                LongSparseArray<T> longSparseArray2 = longSparseArray;
                int i10 = this.index;
                this.index = i10 + 1;
                return longSparseArray2.keyAt(i10);
            }

            public final void setIndex(int i10) {
                this.index = i10;
            }
        };
    }

    @NotNull
    public static final <T> LongSparseArray<T> plus(@NotNull LongSparseArray<T> longSparseArray, @NotNull LongSparseArray<T> longSparseArray2) {
        LongSparseArray<T> longSparseArray3 = new LongSparseArray<>(longSparseArray.size() + longSparseArray2.size());
        putAll(longSparseArray3, longSparseArray);
        putAll(longSparseArray3, longSparseArray2);
        return longSparseArray3;
    }

    public static final <T> void putAll(@NotNull LongSparseArray<T> longSparseArray, @NotNull LongSparseArray<T> longSparseArray2) {
        int size = longSparseArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            longSparseArray.put(longSparseArray2.keyAt(i10), longSparseArray2.valueAt(i10));
        }
    }

    public static final <T> boolean remove(@NotNull LongSparseArray<T> longSparseArray, long j10, T t10) {
        int iIndexOfKey = longSparseArray.indexOfKey(j10);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(t10, longSparseArray.valueAt(iIndexOfKey))) {
            return false;
        }
        longSparseArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final <T> void set(@NotNull LongSparseArray<T> longSparseArray, long j10, T t10) {
        longSparseArray.put(j10, t10);
    }

    @NotNull
    public static final <T> Iterator<T> valueIterator(@NotNull LongSparseArray<T> longSparseArray) {
        return new C16201(longSparseArray);
    }
}
