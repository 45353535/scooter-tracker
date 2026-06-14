package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0016\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0082\b¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\u00020\u00102\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\u00100\u000fH\u0082\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u001f\u0010 J/\u0010\"\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0010¢\u0006\u0004\b$\u0010\u0004J\u001d\u0010%\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b%\u0010\u001dJ'\u0010'\u001a\u00020\u00102\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b0\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b'\u0010\u0013J\u0015\u0010(\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b(\u0010)R(\u0010+\u001a\u00020*8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b+\u0010,\u0012\u0004\b1\u0010\u0004\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R0\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001028\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b3\u00104\u0012\u0004\b9\u0010\u0004\u001a\u0004\b5\u00106\"\u0004\b7\u00108R6\u0010:\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t028\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b:\u0010;\u0012\u0004\b@\u0010\u0004\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R(\u0010A\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bA\u0010B\u0012\u0004\bG\u0010\u0004\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006H"}, d2 = {"Landroidx/compose/runtime/collection/IdentityScopeMap;", "", "T", "<init>", "()V", "", FirebaseAnalytics.Param.INDEX, "valueAt", "(I)Ljava/lang/Object;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "scopeSetAt", "(I)Landroidx/compose/runtime/collection/IdentityArraySet;", "value", "getOrCreateIdentitySet", "(Ljava/lang/Object;)Landroidx/compose/runtime/collection/IdentityArraySet;", "Lkotlin/Function1;", "", "removalOperation", "removingScopes", "(Lkotlin/jvm/functions/Function1;)V", "find", "(Ljava/lang/Object;)I", "midIndex", "valueHash", "findExactIndex", "(ILjava/lang/Object;I)I", "scope", "", "add", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "element", "contains", "(Ljava/lang/Object;)Z", "block", "forEachScopeOf", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "clear", "remove", "predicate", "removeValueIf", "removeScope", "(Ljava/lang/Object;)V", "", "valueOrder", "[I", "getValueOrder", "()[I", "setValueOrder", "([I)V", "getValueOrder$annotations", "", "values", "[Ljava/lang/Object;", "getValues", "()[Ljava/lang/Object;", "setValues", "([Ljava/lang/Object;)V", "getValues$annotations", "scopeSets", "[Landroidx/compose/runtime/collection/IdentityArraySet;", "getScopeSets", "()[Landroidx/compose/runtime/collection/IdentityArraySet;", "setScopeSets", "([Landroidx/compose/runtime/collection/IdentityArraySet;)V", "getScopeSets$annotations", "size", "I", "getSize", "()I", "setSize", "(I)V", "getSize$annotations", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IdentityScopeMap<T> {

    @NotNull
    private IdentityArraySet<T>[] scopeSets;
    private int size;

    @NotNull
    private int[] valueOrder;

    @NotNull
    private Object[] values;

    public IdentityScopeMap() {
        int[] iArr = new int[50];
        for (int i10 = 0; i10 < 50; i10++) {
            iArr[i10] = i10;
        }
        this.valueOrder = iArr;
        this.values = new Object[50];
        this.scopeSets = new IdentityArraySet[50];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int find(Object value) {
        int iIdentityHashCode = ActualJvm_jvmKt.identityHashCode(value);
        int i10 = this.size - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            Object obj = this.values[this.valueOrder[i12]];
            Intrinsics.checkNotNull(obj);
            int iIdentityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj);
            if (iIdentityHashCode2 < iIdentityHashCode) {
                i11 = i12 + 1;
            } else {
                if (iIdentityHashCode2 <= iIdentityHashCode) {
                    return value == obj ? i12 : findExactIndex(i12, value, iIdentityHashCode);
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        return -(r4 + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int findExactIndex(int r4, java.lang.Object r5, int r6) {
        /*
            r3 = this;
            int r0 = r4 + (-1)
        L2:
            r1 = -1
            if (r1 >= r0) goto L1d
            java.lang.Object[] r1 = r3.values
            int[] r2 = r3.valueOrder
            r2 = r2[r0]
            r1 = r1[r2]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            if (r1 != r5) goto L13
            return r0
        L13:
            int r1 = androidx.compose.runtime.ActualJvm_jvmKt.identityHashCode(r1)
            if (r1 == r6) goto L1a
            goto L1d
        L1a:
            int r0 = r0 + (-1)
            goto L2
        L1d:
            int r4 = r4 + 1
            int r0 = r3.size
        L21:
            if (r4 >= r0) goto L3e
            java.lang.Object[] r1 = r3.values
            int[] r2 = r3.valueOrder
            r2 = r2[r4]
            r1 = r1[r2]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            if (r1 != r5) goto L31
            return r4
        L31:
            int r1 = androidx.compose.runtime.ActualJvm_jvmKt.identityHashCode(r1)
            if (r1 == r6) goto L3b
        L37:
            int r4 = r4 + 1
            int r4 = -r4
            return r4
        L3b:
            int r4 = r4 + 1
            goto L21
        L3e:
            int r4 = r3.size
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.IdentityScopeMap.findExactIndex(int, java.lang.Object, int):int");
    }

    private final IdentityArraySet<T> getOrCreateIdentitySet(Object value) {
        int iFind;
        if (this.size > 0) {
            iFind = find(value);
            if (iFind >= 0) {
                return scopeSetAt(iFind);
            }
        } else {
            iFind = -1;
        }
        int i10 = -(iFind + 1);
        int i11 = this.size;
        int[] iArr = this.valueOrder;
        if (i11 < iArr.length) {
            int i12 = iArr[i11];
            this.values[i12] = value;
            IdentityArraySet<T> identityArraySet = this.scopeSets[i12];
            if (identityArraySet == null) {
                identityArraySet = new IdentityArraySet<>();
                this.scopeSets[i12] = identityArraySet;
            }
            int i13 = this.size;
            if (i10 < i13) {
                int[] iArr2 = this.valueOrder;
                ArraysKt.copyInto(iArr2, iArr2, i10 + 1, i10, i13);
            }
            this.valueOrder[i10] = i12;
            this.size++;
            return identityArraySet;
        }
        int length = iArr.length * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.scopeSets, length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        this.scopeSets = (IdentityArraySet[]) objArrCopyOf;
        IdentityArraySet<T> identityArraySet2 = new IdentityArraySet<>();
        this.scopeSets[i11] = identityArraySet2;
        Object[] objArrCopyOf2 = Arrays.copyOf(this.values, length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(this, newSize)");
        this.values = objArrCopyOf2;
        objArrCopyOf2[i11] = value;
        int[] iArr3 = new int[length];
        int i14 = this.size;
        while (true) {
            i14++;
            if (i14 >= length) {
                break;
            }
            iArr3[i14] = i14;
        }
        int i15 = this.size;
        if (i10 < i15) {
            ArraysKt.copyInto(this.valueOrder, iArr3, i10 + 1, i10, i15);
        }
        iArr3[i10] = i11;
        if (i10 > 0) {
            ArraysKt.copyInto$default(this.valueOrder, iArr3, 0, 0, i10, 6, (Object) null);
        }
        this.valueOrder = iArr3;
        this.size++;
        return identityArraySet2;
    }

    public static /* synthetic */ void getScopeSets$annotations() {
    }

    public static /* synthetic */ void getSize$annotations() {
    }

    public static /* synthetic */ void getValueOrder$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    private final void removingScopes(Function1<? super IdentityArraySet<T>, Unit> removalOperation) {
        int size = getSize();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = getValueOrder()[i11];
            IdentityArraySet<T> identityArraySet = getScopeSets()[i12];
            Intrinsics.checkNotNull(identityArraySet);
            removalOperation.invoke(identityArraySet);
            if (identityArraySet.size() > 0) {
                if (i10 != i11) {
                    int i13 = getValueOrder()[i10];
                    getValueOrder()[i10] = i12;
                    getValueOrder()[i11] = i13;
                }
                i10++;
            }
        }
        int size2 = getSize();
        for (int i14 = i10; i14 < size2; i14++) {
            getValues()[getValueOrder()[i14]] = null;
        }
        setSize(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IdentityArraySet<T> scopeSetAt(int index) {
        IdentityArraySet<T> identityArraySet = this.scopeSets[this.valueOrder[index]];
        Intrinsics.checkNotNull(identityArraySet);
        return identityArraySet;
    }

    private final Object valueAt(int index) {
        Object obj = this.values[this.valueOrder[index]];
        Intrinsics.checkNotNull(obj);
        return obj;
    }

    public final boolean add(@NotNull Object value, @NotNull T scope) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return getOrCreateIdentitySet(value).add(scope);
    }

    public final void clear() {
        int length = this.scopeSets.length;
        for (int i10 = 0; i10 < length; i10++) {
            IdentityArraySet<T> identityArraySet = this.scopeSets[i10];
            if (identityArraySet != null) {
                identityArraySet.clear();
            }
            this.valueOrder[i10] = i10;
            this.values[i10] = null;
        }
        this.size = 0;
    }

    public final boolean contains(@NotNull Object element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return find(element) >= 0;
    }

    public final void forEachScopeOf(@NotNull Object value, @NotNull Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(block, "block");
        int iFind = find(value);
        if (iFind >= 0) {
            IdentityArraySet identityArraySetScopeSetAt = scopeSetAt(iFind);
            int size = identityArraySetScopeSetAt.size();
            for (int i10 = 0; i10 < size; i10++) {
                block.invoke((Object) identityArraySetScopeSetAt.get(i10));
            }
        }
    }

    @NotNull
    public final IdentityArraySet<T>[] getScopeSets() {
        return this.scopeSets;
    }

    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final int[] getValueOrder() {
        return this.valueOrder;
    }

    @NotNull
    public final Object[] getValues() {
        return this.values;
    }

    public final boolean remove(@NotNull Object value, @NotNull T scope) {
        int i10;
        IdentityArraySet<T> identityArraySet;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(scope, "scope");
        int iFind = find(value);
        if (iFind < 0 || (identityArraySet = this.scopeSets[(i10 = this.valueOrder[iFind])]) == null) {
            return false;
        }
        boolean zRemove = identityArraySet.remove(scope);
        if (identityArraySet.size() == 0) {
            int i11 = iFind + 1;
            int i12 = this.size;
            if (i11 < i12) {
                int[] iArr = this.valueOrder;
                ArraysKt.copyInto(iArr, iArr, iFind, i11, i12);
            }
            int[] iArr2 = this.valueOrder;
            int i13 = this.size;
            iArr2[i13 - 1] = i10;
            this.values[i10] = null;
            this.size = i13 - 1;
        }
        return zRemove;
    }

    public final void removeScope(@NotNull T scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        int size = getSize();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = getValueOrder()[i11];
            IdentityArraySet<T> identityArraySet = getScopeSets()[i12];
            Intrinsics.checkNotNull(identityArraySet);
            identityArraySet.remove(scope);
            if (identityArraySet.size() > 0) {
                if (i10 != i11) {
                    int i13 = getValueOrder()[i10];
                    getValueOrder()[i10] = i12;
                    getValueOrder()[i11] = i13;
                }
                i10++;
            }
        }
        int size2 = getSize();
        for (int i14 = i10; i14 < size2; i14++) {
            getValues()[getValueOrder()[i14]] = null;
        }
        setSize(i10);
    }

    public final void removeValueIf(@NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = getValueOrder()[i11];
            IdentityArraySet<T> identityArraySet = getScopeSets()[i12];
            Intrinsics.checkNotNull(identityArraySet);
            int size2 = identityArraySet.size();
            int i13 = 0;
            for (int i14 = 0; i14 < size2; i14++) {
                Object obj = identityArraySet.getValues()[i14];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (!predicate.invoke(obj).booleanValue()) {
                    if (i13 != i14) {
                        identityArraySet.getValues()[i13] = obj;
                    }
                    i13++;
                }
            }
            int size3 = identityArraySet.size();
            for (int i15 = i13; i15 < size3; i15++) {
                identityArraySet.getValues()[i15] = null;
            }
            identityArraySet.setSize(i13);
            if (identityArraySet.size() > 0) {
                if (i10 != i11) {
                    int i16 = getValueOrder()[i10];
                    getValueOrder()[i10] = i12;
                    getValueOrder()[i11] = i16;
                }
                i10++;
            }
        }
        int size4 = getSize();
        for (int i17 = i10; i17 < size4; i17++) {
            getValues()[getValueOrder()[i17]] = null;
        }
        setSize(i10);
    }

    public final void setScopeSets(@NotNull IdentityArraySet<T>[] identityArraySetArr) {
        Intrinsics.checkNotNullParameter(identityArraySetArr, "<set-?>");
        this.scopeSets = identityArraySetArr;
    }

    public final void setSize(int i10) {
        this.size = i10;
    }

    public final void setValueOrder(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.valueOrder = iArr;
    }

    public final void setValues(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.values = objArr;
    }
}
