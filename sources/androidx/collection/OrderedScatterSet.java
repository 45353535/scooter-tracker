package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lf.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u0007J\r\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u0007J\r\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u000b\u001a\u00028\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000b\u0010\u000fJ4\u0010\u0010\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\fJ2\u0010\u0011\u001a\u00028\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0011\u0010\u000fJ4\u0010\u0012\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ2\u0010\u0018\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\rH\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0016\u0010\u0017J2\u0010\u0019\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\rH\u0081\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0019\u0010\u0017J2\u0010\u001a\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001a\u0010\u0017J2\u0010\u001b\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001b\u0010\u0017J2\u0010\u001c\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140\rH\u0081\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0086\b¢\u0006\u0004\b\u001e\u0010\u001fJ2\u0010 \u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b \u0010!J2\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0006\u0010!J\u000f\u0010\"\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\"\u0010#J2\u0010\"\u001a\u00020\u00132\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\rH\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\"\u0010$J\u0018\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b&\u0010'JY\u00100\u001a\u00020/2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010*\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020(2\b\b\u0002\u0010,\u001a\u00020\u00132\b\b\u0002\u0010-\u001a\u00020(2\u0016\b\u0002\u0010.\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020(\u0018\u00010\rH\u0007¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0013H\u0016¢\u0006\u0004\b2\u0010#J\u001a\u00104\u001a\u00020\u00052\b\u00103\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b4\u0010'J\u000f\u00105\u001a\u00020/H\u0016¢\u0006\u0004\b5\u00106J\u0018\u00109\u001a\u00020\u00132\u0006\u0010%\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b7\u00108J\u0013\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:¢\u0006\u0004\b;\u0010<R\u001c\u0010>\u001a\u00020=8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b>\u0010?\u0012\u0004\b@\u0010\u0004R$\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020A8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bB\u0010C\u0012\u0004\bD\u0010\u0004R\u001c\u0010E\u001a\u00020=8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bE\u0010?\u0012\u0004\bF\u0010\u0004R\u001c\u0010G\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bG\u0010H\u0012\u0004\bI\u0010\u0004R\u001c\u0010J\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bJ\u0010H\u0012\u0004\bK\u0010\u0004R\u0016\u0010L\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bL\u0010HR\u0016\u0010M\u001a\u00020\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bM\u0010HR\u0011\u0010O\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\bN\u0010#R\u0011\u0010Q\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\bP\u0010#\u0082\u0001\u0001R\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006S"}, d2 = {"Landroidx/collection/OrderedScatterSet;", ExifInterface.LONGITUDE_EAST, "", "<init>", "()V", "", "any", "()Z", "none", "isEmpty", "isNotEmpty", "first", "()Ljava/lang/Object;", "Lkotlin/Function1;", "predicate", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "last", "lastOrNull", "", "", "block", "forEachIndex$collection", "(Lkotlin/jvm/functions/Function1;)V", "forEachIndex", "unorderedForEachIndex", "forEach", "forEachReverse", "unorderedForEach", "", "toList", "()Ljava/util/List;", "all", "(Lkotlin/jvm/functions/Function1;)Z", "count", "()I", "(Lkotlin/jvm/functions/Function1;)I", "element", "contains", "(Ljava/lang/Object;)Z", "", "separator", "prefix", "postfix", "limit", "truncated", "transform", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "hashCode", "other", "equals", "toString", "()Ljava/lang/String;", "findElementIndex$collection", "(Ljava/lang/Object;)I", "findElementIndex", "", "asSet", "()Ljava/util/Set;", "", "metadata", "[J", "getMetadata$annotations", "", "elements", "[Ljava/lang/Object;", "getElements$annotations", "nodes", "getNodes$annotations", "head", "I", "getHead$annotations", "tail", "getTail$annotations", "_capacity", "_size", "getCapacity", "capacity", "getSize", "size", "Landroidx/collection/MutableOrderedScatterSet;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class OrderedScatterSet<E> {
    public int _capacity;
    public int _size;

    @NotNull
    public Object[] elements;
    public int head;

    @NotNull
    public long[] metadata;

    @NotNull
    public long[] nodes;
    public int tail;

    public /* synthetic */ OrderedScatterSet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getElements$annotations() {
    }

    public static /* synthetic */ void getHead$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getNodes$annotations() {
    }

    public static /* synthetic */ void getTail$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String joinToString$default(OrderedScatterSet orderedScatterSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = APSSharedUtil.TRUNCATE_SEPARATOR;
        }
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function12 = function1;
        return orderedScatterSet.joinToString(charSequence, charSequence2, charSequence3, i10, charSequence5, function12);
    }

    public final boolean all(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128 && !predicate.invoke(objArr[(i10 << 3) + i12]).booleanValue()) {
                        return false;
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final boolean any() {
        return this._size != 0;
    }

    @NotNull
    public final Set<E> asSet() {
        return new OrderedSetWrapper(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(E r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0._capacity
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.metadata
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.elements
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            return r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.OrderedScatterSet.contains(java.lang.Object):boolean");
    }

    @IntRange(from = 0)
    public final int count() {
        return get_size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof androidx.collection.OrderedScatterSet
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            androidx.collection.OrderedScatterSet r1 = (androidx.collection.OrderedScatterSet) r1
            int r3 = r1.get_size()
            int r5 = r0.get_size()
            if (r3 == r5) goto L1b
            return r4
        L1b:
            java.lang.Object[] r3 = r0.elements
            long[] r5 = r0.metadata
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L61
            r7 = r4
        L25:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5c
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3f:
            if (r12 >= r10) goto L5a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L56
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            boolean r13 = r1.contains(r13)
            if (r13 != 0) goto L56
            return r4
        L56:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3f
        L5a:
            if (r10 != r11) goto L61
        L5c:
            if (r7 == r6) goto L61
            int r7 = r7 + 1
            goto L25
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.OrderedScatterSet.equals(java.lang.Object):boolean");
    }

    public final int findElementIndex$collection(E element) {
        int i10 = 0;
        int iHashCode = (element != null ? element.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this._capacity;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.metadata;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * ScatterMapKt.BitmaskLsb) ^ j10;
            for (long j12 = (~j11) & (j11 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (Intrinsics.areEqual(this.elements[iNumberOfTrailingZeros], element)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
    }

    public final E first() {
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i10 = this.tail;
        if (i10 != Integer.MAX_VALUE) {
            long j10 = jArr[i10];
            return (E) objArr[i10];
        }
        RuntimeHelpersKt.throwNoSuchElementExceptionForInline("The OrderedScatterSet is empty");
        throw new g();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [E, java.lang.Object] */
    @Nullable
    public final E firstOrNull(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i10 = this.tail;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i10] >> 31) & SieveCacheKt.NodeLinkMask);
            ?? r22 = (Object) objArr[i10];
            if (predicate.invoke(r22).booleanValue()) {
                return r22;
            }
            i10 = i11;
        }
        return null;
    }

    public final void forEach(@NotNull Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i10 = this.tail;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i10] >> 31) & SieveCacheKt.NodeLinkMask);
            block.invoke(objArr[i10]);
            i10 = i11;
        }
    }

    public final void forEachIndex$collection(@NotNull Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.nodes;
        int i10 = this.tail;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i10] >> 31) & SieveCacheKt.NodeLinkMask);
            block.invoke(Integer.valueOf(i10));
            i10 = i11;
        }
    }

    public final void forEachReverse(@NotNull Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i10 = this.head;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) (jArr[i10] & SieveCacheKt.NodeLinkMask);
            block.invoke(objArr[i10]);
            i10 = i11;
        }
    }

    @IntRange(from = 0)
    /* JADX INFO: renamed from: getCapacity, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    @IntRange(from = 0)
    /* JADX INFO: renamed from: getSize, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public int hashCode() {
        int iHashCode = (this._capacity * 31) + this._size;
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            Object obj = objArr[(i10 << 3) + i12];
                            if (!Intrinsics.areEqual(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return iHashCode;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    @NotNull
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final E last() {
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i10 = this.head;
        if (i10 != Integer.MAX_VALUE) {
            long j10 = jArr[i10];
            return (E) objArr[i10];
        }
        RuntimeHelpersKt.throwNoSuchElementExceptionForInline("The OrderedScatterSet is empty");
        throw new g();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [E, java.lang.Object] */
    @Nullable
    public final E lastOrNull(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i10 = this.head;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) (jArr[i10] & SieveCacheKt.NodeLinkMask);
            ?? r22 = (Object) objArr[i10];
            if (predicate.invoke(r22).booleanValue()) {
                return r22;
            }
            i10 = i11;
        }
        return null;
    }

    public final boolean none() {
        return this._size == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final List<E> toList() {
        ArrayList arrayList = new ArrayList(get_size());
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i10 = this.tail;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i10] >> 31) & SieveCacheKt.NodeLinkMask);
            arrayList.add(objArr[i10]);
            i10 = i11;
        }
        return arrayList;
    }

    @NotNull
    public String toString() {
        return joinToString$default(this, null, C4240b4.j.f42672d, C4240b4.j.f42674e, 0, null, new Function1<E, CharSequence>(this) { // from class: androidx.collection.OrderedScatterSet.toString.1
            final /* synthetic */ OrderedScatterSet<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(E e10) {
                return e10 == this.this$0 ? "(this)" : String.valueOf(e10);
            }
        }, 25, null);
    }

    public final void unorderedForEach(@NotNull Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        block.invoke(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void unorderedForEachIndex(@NotNull Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        block.invoke(Integer.valueOf((i10 << 3) + i12));
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    private OrderedScatterSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = ContainerHelpersKt.EMPTY_OBJECTS;
        this.nodes = SieveCacheKt.getEmptyNodes();
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean any(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r15) {
        /*
            r14 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.Object[] r0 = r14.elements
            long[] r1 = r14.metadata
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L53
            r4 = r3
        L10:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L4e
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2a:
            if (r9 >= r7) goto L4c
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L48
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            java.lang.Object r10 = r15.invoke(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L48
            r15 = 1
            return r15
        L48:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2a
        L4c:
            if (r7 != r8) goto L53
        L4e:
            if (r4 == r2) goto L53
            int r4 = r4 + 1
            goto L10
        L53:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.OrderedScatterSet.any(kotlin.jvm.functions.Function1):boolean");
    }

    @IntRange(from = 0)
    public final int count(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128 && predicate.invoke(objArr[(i10 << 3) + i13]).booleanValue()) {
                        i11++;
                    }
                    j10 >>= 8;
                }
                if (i12 != 8) {
                    return i11;
                }
            }
            if (i10 == length) {
                return i11;
            }
            i10++;
        }
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, null, 62, null);
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, null, 60, null);
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i10, null, null, 48, null);
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return joinToString$default(this, separator, prefix, postfix, i10, truncated, null, 32, null);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [E, java.lang.Object] */
    public final E first(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i10 = this.tail;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i10] >> 31) & SieveCacheKt.NodeLinkMask);
            ?? r22 = (Object) objArr[i10];
            if (predicate.invoke(r22).booleanValue()) {
                return r22;
            }
            i10 = i11;
        }
        RuntimeHelpersKt.throwNoSuchElementExceptionForInline("Could not find a match");
        throw new g();
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @Nullable Function1<? super E, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i10 = this.tail;
        int i11 = 0;
        while (true) {
            if (i10 != Integer.MAX_VALUE) {
                int i12 = (int) ((jArr[i10] >> 31) & SieveCacheKt.NodeLinkMask);
                Object obj = objArr[i10];
                if (i11 == limit) {
                    sb2.append(truncated);
                    break;
                }
                if (i11 != 0) {
                    sb2.append(separator);
                }
                if (transform == null) {
                    sb2.append(obj);
                } else {
                    sb2.append(transform.invoke(obj));
                }
                i11++;
                i10 = i12;
            } else {
                sb2.append(postfix);
                break;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [E, java.lang.Object] */
    public final E last(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.nodes;
        int i10 = this.head;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) (jArr[i10] & SieveCacheKt.NodeLinkMask);
            ?? r22 = (Object) objArr[i10];
            if (predicate.invoke(r22).booleanValue()) {
                return r22;
            }
            i10 = i11;
        }
        RuntimeHelpersKt.throwNoSuchElementExceptionForInline("Could not find a match");
        throw new g();
    }
}
