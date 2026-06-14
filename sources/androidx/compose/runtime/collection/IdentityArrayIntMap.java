package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\fJ&\u0010\u001c\u001a\u00020\u001d2\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001d0\u001fH\u0086\bø\u0001\u0000J\u0012\u0010 \u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0006\u0010#\u001a\u00020\fH\u0002J&\u0010$\u001a\u00020%2\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020%0\u001fH\u0086\bø\u0001\u0000J\u0011\u0010'\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0001H\u0086\u0002J\u000e\u0010(\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0001J&\u0010)\u001a\u00020%2\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001d0\u001fH\u0086\bø\u0001\u0000R.\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0016\n\u0002\u0010\n\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006*"}, d2 = {"Landroidx/compose/runtime/collection/IdentityArrayIntMap;", "", "()V", UserMetadata.KEYDATA_FILENAME, "", "getKeys$annotations", "getKeys", "()[Ljava/lang/Object;", "setKeys", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "size", "", "getSize$annotations", "getSize", "()I", "setSize", "(I)V", "values", "", "getValues$annotations", "getValues", "()[I", "setValues", "([I)V", "add", C4240b4.i.W, "value", "any", "", "predicate", "Lkotlin/Function2;", "find", "findExactIndex", "midIndex", "valueHash", "forEach", "", "block", "get", "remove", "removeValueIf", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IdentityArrayIntMap {
    private int size;

    @NotNull
    private Object[] keys = new Object[4];

    @NotNull
    private int[] values = new int[4];

    private final int find(Object key) {
        int i10 = this.size - 1;
        int iIdentityHashCode = ActualJvm_jvmKt.identityHashCode(key);
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            Object obj = this.keys[i12];
            int iIdentityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj);
            if (iIdentityHashCode2 < iIdentityHashCode) {
                i11 = i12 + 1;
            } else {
                if (iIdentityHashCode2 <= iIdentityHashCode) {
                    return obj == key ? i12 : findExactIndex(i12, key, iIdentityHashCode);
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        return -(r3 + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int findExactIndex(int r3, java.lang.Object r4, int r5) {
        /*
            r2 = this;
            int r0 = r3 + (-1)
        L2:
            r1 = -1
            if (r1 >= r0) goto L16
            java.lang.Object[] r1 = r2.keys
            r1 = r1[r0]
            if (r1 != r4) goto Lc
            return r0
        Lc:
            int r1 = androidx.compose.runtime.ActualJvm_jvmKt.identityHashCode(r1)
            if (r1 == r5) goto L13
            goto L16
        L13:
            int r0 = r0 + (-1)
            goto L2
        L16:
            int r3 = r3 + 1
            int r0 = r2.size
        L1a:
            if (r3 >= r0) goto L30
            java.lang.Object[] r1 = r2.keys
            r1 = r1[r3]
            if (r1 != r4) goto L23
            return r3
        L23:
            int r1 = androidx.compose.runtime.ActualJvm_jvmKt.identityHashCode(r1)
            if (r1 == r5) goto L2d
        L29:
            int r3 = r3 + 1
            int r3 = -r3
            return r3
        L2d:
            int r3 = r3 + 1
            goto L1a
        L30:
            int r3 = r2.size
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.IdentityArrayIntMap.findExactIndex(int, java.lang.Object, int):int");
    }

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getSize$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    public final int add(@NotNull Object key, int value) {
        int iFind;
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.size > 0) {
            iFind = find(key);
            if (iFind >= 0) {
                int[] iArr = this.values;
                int i10 = iArr[iFind];
                iArr[iFind] = value;
                return i10;
            }
        } else {
            iFind = -1;
        }
        int i11 = -(iFind + 1);
        int i12 = this.size;
        Object[] objArr = this.keys;
        if (i12 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            int[] iArr2 = new int[objArr.length * 2];
            int i13 = i11 + 1;
            ArraysKt.copyInto(objArr, objArr2, i13, i11, i12);
            ArraysKt.copyInto(this.values, iArr2, i13, i11, this.size);
            ArraysKt.copyInto$default(this.keys, objArr2, 0, 0, i11, 6, (Object) null);
            ArraysKt.copyInto$default(this.values, iArr2, 0, 0, i11, 6, (Object) null);
            this.keys = objArr2;
            this.values = iArr2;
        } else {
            int i14 = i11 + 1;
            ArraysKt.copyInto(objArr, objArr, i14, i11, i12);
            int[] iArr3 = this.values;
            ArraysKt.copyInto(iArr3, iArr3, i14, i11, this.size);
        }
        this.keys[i11] = key;
        this.values[i11] = value;
        this.size++;
        return -1;
    }

    public final boolean any(@NotNull Function2<Object, ? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = getKeys()[i10];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
            if (predicate.invoke(obj, Integer.valueOf(getValues()[i10])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void forEach(@NotNull Function2<Object, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = getKeys()[i10];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
            block.invoke(obj, Integer.valueOf(getValues()[i10]));
        }
    }

    public final int get(@NotNull Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int iFind = find(key);
        if (iFind >= 0) {
            return this.values[iFind];
        }
        throw new IllegalStateException("Key not found");
    }

    @NotNull
    public final Object[] getKeys() {
        return this.keys;
    }

    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final int[] getValues() {
        return this.values;
    }

    public final boolean remove(@NotNull Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int iFind = find(key);
        if (iFind < 0) {
            return false;
        }
        int i10 = this.size;
        if (iFind < i10 - 1) {
            Object[] objArr = this.keys;
            int i11 = iFind + 1;
            ArraysKt.copyInto(objArr, objArr, iFind, i11, i10);
            int[] iArr = this.values;
            ArraysKt.copyInto(iArr, iArr, iFind, i11, this.size);
        }
        int i12 = this.size - 1;
        this.size = i12;
        this.keys[i12] = null;
        return true;
    }

    public final void removeValueIf(@NotNull Function2<Object, ? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = getKeys()[i11];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
            int i12 = getValues()[i11];
            if (!predicate.invoke(obj, Integer.valueOf(i12)).booleanValue()) {
                if (i10 != i11) {
                    getKeys()[i10] = obj;
                    getValues()[i10] = i12;
                }
                i10++;
            }
        }
        int size2 = getSize();
        for (int i13 = i10; i13 < size2; i13++) {
            getKeys()[i13] = null;
        }
        setSize(i10);
    }

    public final void setKeys(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.keys = objArr;
    }

    public final void setSize(int i10) {
        this.size = i10;
    }

    public final void setValues(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.values = iArr;
    }
}
