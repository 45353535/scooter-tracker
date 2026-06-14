package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.AbstractIterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class ArrayMapImpl<T> extends ArrayMap<T> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private Object[] data;
    private int size;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private ArrayMapImpl(Object[] objArr, int i10) {
        super(null);
        this.data = objArr;
        this.size = i10;
    }

    private final void ensureCapacity(int i10) {
        Object[] objArr = this.data;
        if (objArr.length > i10) {
            return;
        }
        int length = objArr.length;
        do {
            length *= 2;
        } while (length <= i10);
        Object[] objArrCopyOf = Arrays.copyOf(this.data, length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        this.data = objArrCopyOf;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    @Nullable
    public T get(int i10) {
        return (T) ArraysKt.getOrNull(this.data, i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new AbstractIterator<T>(this) { // from class: kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl.iterator.1
            private int index = -1;
            final /* synthetic */ ArrayMapImpl<T> this$0;

            {
                this.this$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.collections.AbstractIterator
            protected void computeNext() {
                do {
                    int i10 = this.index + 1;
                    this.index = i10;
                    if (i10 >= ((ArrayMapImpl) this.this$0).data.length) {
                        break;
                    }
                } while (((ArrayMapImpl) this.this$0).data[this.index] == null);
                if (this.index >= ((ArrayMapImpl) this.this$0).data.length) {
                    done();
                    return;
                }
                Object obj = ((ArrayMapImpl) this.this$0).data[this.index];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
                setNext(obj);
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void set(int i10, @NotNull T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ensureCapacity(i10);
        if (this.data[i10] == null) {
            this.size = getSize() + 1;
        }
        this.data[i10] = value;
    }

    public ArrayMapImpl() {
        this(new Object[20], 0);
    }
}
