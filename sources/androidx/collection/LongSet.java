package androidx.collection;

import androidx.annotation.IntRange;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0016\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\nH\u0086\b¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000b\u0010\u000fJ2\u0010\u0013\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\rH\u0081\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0013\u0010\u0014J2\u0010\u0015\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00110\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0015\u0010\u0014J2\u0010\u0016\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0016\u0010\u0017J2\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\rH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0005\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J2\u0010\u0018\u001a\u00020\u00102\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\rH\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0018\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001dJA\u0010%\u001a\u00020$2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\"\u001a\u00020\u00102\b\b\u0002\u0010#\u001a\u00020\u001eH\u0007¢\u0006\u0004\b%\u0010&J[\u0010%\u001a\u00020$2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\"\u001a\u00020\u00102\b\b\u0002\u0010#\u001a\u00020\u001e2\u0014\b\u0004\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001e0\rH\u0087\bø\u0001\u0000¢\u0006\u0004\b%\u0010(J\u000f\u0010)\u001a\u00020\u0010H\u0016¢\u0006\u0004\b)\u0010\u0019J\u001a\u0010+\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020$H\u0016¢\u0006\u0004\b-\u0010.J\u0018\u00101\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\nH\u0080\b¢\u0006\u0004\b/\u00100R\u001c\u00103\u001a\u0002028\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b3\u00104\u0012\u0004\b5\u0010\u0003R\u001c\u00106\u001a\u0002028\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b6\u00104\u0012\u0004\b7\u0010\u0003R\u0016\u00108\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b:\u00109R\u0011\u0010<\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b;\u0010\u0019R\u0011\u0010>\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b=\u0010\u0019\u0082\u0001\u0001?\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006@"}, d2 = {"Landroidx/collection/LongSet;", "", "<init>", "()V", "", "any", "()Z", "none", "isEmpty", "isNotEmpty", "", "first", "()J", "Lkotlin/Function1;", "predicate", "(Lkotlin/jvm/functions/Function1;)J", "", "", "block", "forEachIndex", "(Lkotlin/jvm/functions/Function1;)V", "forEach", "all", "(Lkotlin/jvm/functions/Function1;)Z", "count", "()I", "(Lkotlin/jvm/functions/Function1;)I", "element", "contains", "(J)Z", "", "separator", "prefix", "postfix", "limit", "truncated", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "transform", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "findElementIndex$collection", "(J)I", "findElementIndex", "", "metadata", "[J", "getMetadata$annotations", "elements", "getElements$annotations", "_capacity", "I", "_size", "getCapacity", "capacity", "getSize", "size", "Landroidx/collection/MutableLongSet;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class LongSet {
    public int _capacity;
    public int _size;

    @NotNull
    public long[] elements;

    @NotNull
    public long[] metadata;

    public /* synthetic */ LongSet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getElements$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ String joinToString$default(LongSet longSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return longSet.joinToString(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public final boolean all(@NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128 && !predicate.invoke(Long.valueOf(jArr[(i10 << 3) + i12])).booleanValue()) {
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(long r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = androidx.collection.b.a(r18)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0._capacity
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.metadata
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L42:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L5f
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.elements
            r15 = r14[r10]
            int r14 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r14 != 0) goto L59
            goto L69
        L59:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L42
        L5f:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L6d
            r10 = -1
        L69:
            if (r10 < 0) goto L6c
            return r11
        L6c:
            return r4
        L6d:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.contains(long):boolean");
    }

    @IntRange(from = 0)
    /* JADX INFO: renamed from: count, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
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
            boolean r3 = r1 instanceof androidx.collection.LongSet
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            androidx.collection.LongSet r1 = (androidx.collection.LongSet) r1
            int r3 = r1._size
            int r5 = r0._size
            if (r3 == r5) goto L17
            return r4
        L17:
            long[] r3 = r0.elements
            long[] r5 = r0.metadata
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L5d
            r7 = r4
        L21:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L58
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3b:
            if (r12 >= r10) goto L56
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L52
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            boolean r13 = r1.contains(r13)
            if (r13 != 0) goto L52
            return r4
        L52:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3b
        L56:
            if (r10 != r11) goto L5d
        L58:
            if (r7 == r6) goto L5d
            int r7 = r7 + 1
            goto L21
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.equals(java.lang.Object):boolean");
    }

    public final int findElementIndex$collection(long element) {
        int iA = b.a(element) * ScatterMapKt.MurmurHashC1;
        int i10 = iA ^ (iA << 16);
        int i11 = i10 & 127;
        int i12 = this._capacity;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * ScatterMapKt.BitmaskLsb) ^ j10;
            for (long j12 = (~j11) & (j11 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.elements[iNumberOfTrailingZeros] == element) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long first() {
        /*
            r14 = this;
            long[] r0 = r14.elements
            long[] r1 = r14.metadata
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L41
            r3 = 0
            r4 = r3
        Lb:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L3c
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L25:
            if (r9 >= r7) goto L3a
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L36
            int r1 = r4 << 3
            int r1 = r1 + r9
            r1 = r0[r1]
            return r1
        L36:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L25
        L3a:
            if (r7 != r8) goto L41
        L3c:
            if (r4 == r2) goto L41
            int r4 = r4 + 1
            goto Lb
        L41:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "The LongSet is empty"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.first():long");
    }

    public final void forEach(@NotNull Function1<? super Long, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        block.invoke(Long.valueOf(jArr[(i10 << 3) + i12]));
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

    public final void forEachIndex(@NotNull Function1<? super Integer, Unit> block) {
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

    @IntRange(from = 0)
    /* JADX INFO: renamed from: getCapacity, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    @IntRange(from = 0)
    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iA = 0;
        while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        iA += b.a(jArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return iA;
                }
            }
            if (i10 == length) {
                return iA;
            }
            i10++;
        }
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    @NotNull
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final boolean none() {
        return this._size == 0;
    }

    @NotNull
    public String toString() {
        return joinToString$default(this, null, C4240b4.j.f42672d, C4240b4.j.f42674e, 0, null, 25, null);
    }

    private LongSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = LongSetKt.getEmptyLongArray();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean any(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> r15) {
        /*
            r14 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            long[] r0 = r14.elements
            long[] r1 = r14.metadata
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L57
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
            if (r7 == 0) goto L52
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2a:
            if (r9 >= r7) goto L50
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.Object r10 = r15.invoke(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L4c
            r15 = 1
            return r15
        L4c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2a
        L50:
            if (r7 != r8) goto L57
        L52:
            if (r4 == r2) goto L57
            int r4 = r4 + 1
            goto L10
        L57:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.any(kotlin.jvm.functions.Function1):boolean");
    }

    @IntRange(from = 0)
    public final int count(@NotNull Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128 && predicate.invoke(Long.valueOf(jArr[(i10 << 3) + i13])).booleanValue()) {
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
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5 A[PHI: r11
  0x00b5: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:28:0x006e, B:42:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.LongSet r20, java.lang.CharSequence r21, java.lang.CharSequence r22, java.lang.CharSequence r23, int r24, java.lang.CharSequence r25, kotlin.jvm.functions.Function1 r26, int r27, java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.joinToString$default(androidx.collection.LongSet, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function1, int, java.lang.Object):java.lang.String");
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i10, null, 16, null);
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated) {
        int i10;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i13 = 0;
            int i14 = 0;
            loop0: while (true) {
                long j10 = jArr2[i13];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8;
                    int i16 = 8 - ((~(i13 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j10 & 255) < 128) {
                            i11 = i13;
                            long j11 = jArr[(i13 << 3) + i17];
                            i12 = i15;
                            if (i14 == limit) {
                                sb2.append(truncated);
                                break loop0;
                            }
                            if (i14 != 0) {
                                sb2.append(separator);
                            }
                            sb2.append(j11);
                            i14++;
                        } else {
                            i11 = i13;
                            i12 = i15;
                        }
                        j10 >>= i12;
                        i17++;
                        i15 = i12;
                        i13 = i11;
                    }
                    int i18 = i13;
                    if (i16 != i15) {
                        break;
                    }
                    i10 = i18;
                } else {
                    i10 = i13;
                }
                if (i10 == length) {
                    break;
                }
                i13 = i10 + 1;
            }
            sb2.append(postfix);
        } else {
            sb2.append(postfix);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long first(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> r15) {
        /*
            r14 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            long[] r0 = r14.elements
            long[] r1 = r14.metadata
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L56
            r3 = 0
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
            if (r7 == 0) goto L51
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2a:
            if (r9 >= r7) goto L4f
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4b
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            java.lang.Long r12 = java.lang.Long.valueOf(r10)
            java.lang.Object r12 = r15.invoke(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L4b
            return r10
        L4b:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2a
        L4f:
            if (r7 != r8) goto L56
        L51:
            if (r4 == r2) goto L56
            int r4 = r4 + 1
            goto L10
        L56:
            java.util.NoSuchElementException r15 = new java.util.NoSuchElementException
            java.lang.String r0 = "Could not find a match"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.first(kotlin.jvm.functions.Function1):long");
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @NotNull Function1<? super Long, ? extends CharSequence> transform) {
        int i10;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            loop0: while (true) {
                long j10 = jArr2[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i11 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j10 & 255) < 128) {
                            long j11 = jArr[(i11 << 3) + i15];
                            i10 = i13;
                            if (i12 == limit) {
                                sb2.append(truncated);
                                break loop0;
                            }
                            if (i12 != 0) {
                                sb2.append(separator);
                            }
                            sb2.append(transform.invoke(Long.valueOf(j11)));
                            i12++;
                        } else {
                            i10 = i13;
                        }
                        j10 >>= i10;
                        i15++;
                        i13 = i10;
                    }
                    if (i14 != i13) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
            sb2.append(postfix);
        } else {
            sb2.append(postfix);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull Function1<? super Long, ? extends CharSequence> transform) {
        int i11;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            loop0: while (true) {
                long j10 = jArr2[i12];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i12 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j10 & 255) < 128) {
                            long j11 = jArr[(i12 << 3) + i16];
                            if (i13 == i10) {
                                sb2.append((CharSequence) APSSharedUtil.TRUNCATE_SEPARATOR);
                                break loop0;
                            }
                            if (i13 != 0) {
                                sb2.append(separator);
                            }
                            i11 = i14;
                            sb2.append(transform.invoke(Long.valueOf(j11)));
                            i13++;
                        } else {
                            i11 = i14;
                        }
                        j10 >>= i11;
                        i16++;
                        i14 = i11;
                    }
                    if (i15 != i14) {
                        break;
                    }
                }
                if (i12 == length) {
                    break;
                }
                i12++;
            }
            sb2.append(postfix);
        } else {
            sb2.append(postfix);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0080 A[PHI: r10
  0x0080: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x003f, B:18:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull java.lang.CharSequence r21, @org.jetbrains.annotations.NotNull java.lang.CharSequence r22, @org.jetbrains.annotations.NotNull java.lang.CharSequence r23, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends java.lang.CharSequence> r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            java.lang.String r5 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            java.lang.String r5 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            java.lang.String r5 = "postfix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r5)
            java.lang.String r5 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            long[] r2 = r0.elements
            long[] r6 = r0.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L85
            r9 = 0
            r10 = 0
        L31:
            r11 = r6[r9]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L80
            int r13 = r9 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L4b:
            if (r15 >= r13) goto L7e
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L7a
            int r16 = r9 << 3
            int r16 = r16 + r15
            r16 = r2[r16]
            r8 = -1
            if (r10 != r8) goto L66
            java.lang.String r1 = "..."
            r5.append(r1)
            goto L88
        L66:
            if (r10 == 0) goto L6b
            r5.append(r1)
        L6b:
            java.lang.Long r8 = java.lang.Long.valueOf(r16)
            java.lang.Object r8 = r4.invoke(r8)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r5.append(r8)
            int r10 = r10 + 1
        L7a:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            goto L4b
        L7e:
            if (r13 != r14) goto L85
        L80:
            if (r9 == r7) goto L85
            int r9 = r9 + 1
            goto L31
        L85:
            r5.append(r3)
        L88:
            java.lang.String r1 = r5.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function1):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0077 A[PHI: r9
  0x0077: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:6:0x0038, B:18:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull java.lang.CharSequence r20, @org.jetbrains.annotations.NotNull java.lang.CharSequence r21, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends java.lang.CharSequence> r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            java.lang.String r4 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.lang.String r4 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            long[] r2 = r0.elements
            long[] r5 = r0.metadata
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L7c
            r8 = 0
            r9 = 0
        L2a:
            r10 = r5[r8]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L77
            int r12 = r8 - r6
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L44:
            if (r14 >= r12) goto L75
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L71
            int r15 = r8 << 3
            int r15 = r15 + r14
            r15 = r2[r15]
            r7 = -1
            if (r9 != r7) goto L5d
            java.lang.String r1 = "..."
            r4.append(r1)
            goto L81
        L5d:
            if (r9 == 0) goto L62
            r4.append(r1)
        L62:
            java.lang.Long r7 = java.lang.Long.valueOf(r15)
            java.lang.Object r7 = r3.invoke(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r4.append(r7)
            int r9 = r9 + 1
        L71:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L44
        L75:
            if (r12 != r13) goto L7c
        L77:
            if (r8 == r6) goto L7c
            int r8 = r8 + 1
            goto L2a
        L7c:
            java.lang.String r1 = ""
            r4.append(r1)
        L81:
            java.lang.String r1 = r4.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.joinToString(java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function1):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[PHI: r10
  0x0074: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x0033, B:18:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull java.lang.CharSequence r21, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends java.lang.CharSequence> r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            java.lang.String r3 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = ""
            r3.append(r4)
            long[] r5 = r0.elements
            long[] r6 = r0.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L79
            r9 = 0
            r10 = 0
        L25:
            r11 = r6[r9]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L74
            int r13 = r9 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L3f:
            if (r15 >= r13) goto L72
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L6e
            int r16 = r9 << 3
            int r16 = r16 + r15
            r16 = r5[r16]
            r8 = -1
            if (r10 != r8) goto L5a
            java.lang.String r1 = "..."
            r3.append(r1)
            goto L7c
        L5a:
            if (r10 == 0) goto L5f
            r3.append(r1)
        L5f:
            java.lang.Long r8 = java.lang.Long.valueOf(r16)
            java.lang.Object r8 = r2.invoke(r8)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r3.append(r8)
            int r10 = r10 + 1
        L6e:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            goto L3f
        L72:
            if (r13 != r14) goto L79
        L74:
            if (r9 == r7) goto L79
            int r9 = r9 + 1
            goto L25
        L79:
            r3.append(r4)
        L7c:
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.joinToString(java.lang.CharSequence, kotlin.jvm.functions.Function1):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[PHI: r9
  0x006d: PHI (r9v2 int) = (r9v1 int), (r9v3 int) binds: [B:6:0x002c, B:18:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends java.lang.CharSequence> r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ""
            r2.append(r3)
            long[] r4 = r0.elements
            long[] r5 = r0.metadata
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L72
            r8 = 0
            r9 = 0
        L1e:
            r10 = r5[r8]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L6d
            int r12 = r8 - r6
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L38:
            if (r14 >= r12) goto L6b
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L67
            int r15 = r8 << 3
            int r15 = r15 + r14
            r15 = r4[r15]
            r7 = -1
            if (r9 != r7) goto L51
            java.lang.String r1 = "..."
            r2.append(r1)
            goto L75
        L51:
            if (r9 == 0) goto L58
            java.lang.String r7 = ", "
            r2.append(r7)
        L58:
            java.lang.Long r7 = java.lang.Long.valueOf(r15)
            java.lang.Object r7 = r1.invoke(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r2.append(r7)
            int r9 = r9 + 1
        L67:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L38
        L6b:
            if (r12 != r13) goto L72
        L6d:
            if (r8 == r6) goto L72
            int r8 = r8 + 1
            goto L1e
        L72:
            r2.append(r3)
        L75:
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.joinToString(kotlin.jvm.functions.Function1):java.lang.String");
    }
}
