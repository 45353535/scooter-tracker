package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u000f\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u0016J\r\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010 \u001a\u00020\u00182\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000f0\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b \u0010!J'\u0010#\u001a\u00020\u00182\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000f0\"H\u0086\bø\u0001\u0000¢\u0006\u0004\b#\u0010$J-\u0010%\u001a\u00020\u00182\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00180\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b%\u0010!R*\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R*\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\"\u00100\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00065"}, d2 = {"Landroidx/compose/runtime/collection/IdentityArrayMap;", "", "Key", "Value", "", "capacity", "<init>", "(I)V", C4240b4.i.W, "find", "(Ljava/lang/Object;)I", "midIndex", "keyHash", "findExactIndex", "(ILjava/lang/Object;I)I", "", "isEmpty", "()Z", "isNotEmpty", "contains", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "remove", "clear", "()V", "Lkotlin/Function2;", "block", "removeIf", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "removeValueIf", "(Lkotlin/jvm/functions/Function1;)V", "forEach", "", UserMetadata.KEYDATA_FILENAME, "[Ljava/lang/Object;", "getKeys$runtime_release", "()[Ljava/lang/Object;", "setKeys$runtime_release", "([Ljava/lang/Object;)V", "values", "getValues$runtime_release", "setValues$runtime_release", "size", "I", "getSize$runtime_release", "()I", "setSize$runtime_release", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IdentityArrayMap<Key, Value> {

    @NotNull
    private Object[] keys;
    private int size;

    @NotNull
    private Object[] values;

    public IdentityArrayMap() {
        this(0, 1, null);
    }

    private final int find(Object key) {
        int iIdentityHashCode = ActualJvm_jvmKt.identityHashCode(key);
        int i10 = this.size - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            Object obj = this.keys[i12];
            int iIdentityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj);
            if (iIdentityHashCode2 < iIdentityHashCode) {
                i11 = i12 + 1;
            } else {
                if (iIdentityHashCode2 <= iIdentityHashCode) {
                    return key == obj ? i12 : findExactIndex(i12, key, iIdentityHashCode);
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.IdentityArrayMap.findExactIndex(int, java.lang.Object, int):int");
    }

    public final void clear() {
        this.size = 0;
        ArraysKt.fill$default(this.keys, (Object) null, 0, 0, 6, (Object) null);
        ArraysKt.fill$default(this.values, (Object) null, 0, 0, 6, (Object) null);
    }

    public final boolean contains(@NotNull Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return find(key) >= 0;
    }

    public final void forEach(@NotNull Function2<? super Key, ? super Value, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = getKeys()[i10];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            block.invoke(obj, getValues()[i10]);
        }
    }

    @Nullable
    public final Value get(@NotNull Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int iFind = find(key);
        if (iFind >= 0) {
            return (Value) this.values[iFind];
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: getKeys$runtime_release, reason: from getter */
    public final Object[] getKeys() {
        return this.keys;
    }

    /* JADX INFO: renamed from: getSize$runtime_release, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @NotNull
    /* JADX INFO: renamed from: getValues$runtime_release, reason: from getter */
    public final Object[] getValues() {
        return this.values;
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final boolean isNotEmpty() {
        return this.size > 0;
    }

    @Nullable
    public final Value remove(@NotNull Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int iFind = find(key);
        if (iFind < 0) {
            return null;
        }
        Object[] objArr = this.values;
        Value value = (Value) objArr[iFind];
        int i10 = this.size;
        Object[] objArr2 = this.keys;
        int i11 = iFind + 1;
        ArraysKt.copyInto(objArr2, objArr2, iFind, i11, i10);
        ArraysKt.copyInto(objArr, objArr, iFind, i11, i10);
        int i12 = i10 - 1;
        objArr2[i12] = null;
        objArr[i12] = null;
        this.size = i12;
        return value;
    }

    public final void removeIf(@NotNull Function2<? super Key, ? super Value, Boolean> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int size = getSize();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = getKeys()[i11];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            if (!block.invoke(obj, getValues()[i11]).booleanValue()) {
                if (i10 != i11) {
                    getKeys()[i10] = obj;
                    getValues()[i10] = getValues()[i11];
                }
                i10++;
            }
        }
        if (getSize() > i10) {
            int size2 = getSize();
            for (int i12 = i10; i12 < size2; i12++) {
                getKeys()[i12] = null;
                getValues()[i12] = null;
            }
            setSize$runtime_release(i10);
        }
    }

    public final void removeValueIf(@NotNull Function1<? super Value, Boolean> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int size = getSize();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = getKeys()[i11];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            if (!block.invoke(getValues()[i11]).booleanValue()) {
                if (i10 != i11) {
                    getKeys()[i10] = obj;
                    getValues()[i10] = getValues()[i11];
                }
                i10++;
            }
        }
        if (getSize() > i10) {
            int size2 = getSize();
            for (int i12 = i10; i12 < size2; i12++) {
                getKeys()[i12] = null;
                getValues()[i12] = null;
            }
            setSize$runtime_release(i10);
        }
    }

    public final void set(@NotNull Key key, Value value) {
        Intrinsics.checkNotNullParameter(key, "key");
        int iFind = find(key);
        if (iFind >= 0) {
            this.values[iFind] = value;
            return;
        }
        int i10 = -(iFind + 1);
        int i11 = this.size;
        Object[] objArr = this.keys;
        boolean z10 = i11 == objArr.length;
        Object[] objArr2 = z10 ? new Object[i11 * 2] : objArr;
        int i12 = i10 + 1;
        ArraysKt.copyInto(objArr, objArr2, i12, i10, i11);
        if (z10) {
            ArraysKt.copyInto$default(this.keys, objArr2, 0, 0, i10, 6, (Object) null);
        }
        objArr2[i10] = key;
        this.keys = objArr2;
        Object[] objArr3 = z10 ? new Object[this.size * 2] : this.values;
        ArraysKt.copyInto(this.values, objArr3, i12, i10, this.size);
        if (z10) {
            ArraysKt.copyInto$default(this.values, objArr3, 0, 0, i10, 6, (Object) null);
        }
        objArr3[i10] = value;
        this.values = objArr3;
        this.size++;
    }

    public final void setKeys$runtime_release(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.keys = objArr;
    }

    public final void setSize$runtime_release(int i10) {
        this.size = i10;
    }

    public final void setValues$runtime_release(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.values = objArr;
    }

    public IdentityArrayMap(int i10) {
        this.keys = new Object[i10];
        this.values = new Object[i10];
    }

    public /* synthetic */ IdentityArrayMap(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 16 : i10);
    }
}
