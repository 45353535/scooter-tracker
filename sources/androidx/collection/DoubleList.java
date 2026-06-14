package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0013\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\t\u0010\bJ2\u0010\t\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\t\u0010\rJ2\u0010\u000e\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000e\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\u0015\u001a\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0015\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J2\u0010\u0018\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0018\u0010\u001aJF\u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001b2\u0006\u0010\u001c\u001a\u00028\u00002\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\u001dH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001f\u0010 JL\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001b2\u0006\u0010\u001c\u001a\u00028\u00002\u001e\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000!H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\"\u0010#JF\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001b2\u0006\u0010\u001c\u001a\u00028\u00002\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u001dH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b$\u0010 JL\u0010%\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001b2\u0006\u0010\u001c\u001a\u00028\u00002\u001e\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000!H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b%\u0010#J2\u0010(\u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020&0\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b(\u0010)J8\u0010*\u001a\u00020&2\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020&0\u001dH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b*\u0010+J2\u0010,\u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020&0\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b,\u0010)J8\u0010-\u001a\u00020&2\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020&0\u001dH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b-\u0010+J\u001a\u0010/\u001a\u00020\u000b2\b\b\u0001\u0010.\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u000b2\b\b\u0001\u0010.\u001a\u00020\u0002¢\u0006\u0004\b1\u00100J1\u00103\u001a\u00020\u000b2\b\b\u0001\u0010.\u001a\u00020\u00022\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b5\u00106J2\u00107\u001a\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b7\u0010\u0017J2\u00108\u001a\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b8\u0010\u0017J\u0010\u00109\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b9\u0010\bJ\u0010\u0010:\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b:\u0010\bJ\r\u0010;\u001a\u00020\u000b¢\u0006\u0004\b;\u0010\u0019J2\u0010;\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b;\u0010\u001aJ\u0015\u0010<\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b<\u00106J+\u0010?\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010=\u001a\u00020\u00022\b\b\u0002\u0010>\u001a\u00020\u0002H\u0007¢\u0006\u0004\b?\u0010@JA\u0010H\u001a\u00020G2\b\b\u0002\u0010B\u001a\u00020A2\b\b\u0002\u0010C\u001a\u00020A2\b\b\u0002\u0010D\u001a\u00020A2\b\b\u0002\u0010E\u001a\u00020\u00022\b\b\u0002\u0010F\u001a\u00020AH\u0007¢\u0006\u0004\bH\u0010IJ[\u0010H\u001a\u00020G2\b\b\u0002\u0010B\u001a\u00020A2\b\b\u0002\u0010C\u001a\u00020A2\b\b\u0002\u0010D\u001a\u00020A2\b\b\u0002\u0010E\u001a\u00020\u00022\b\b\u0002\u0010F\u001a\u00020A2\u0014\b\u0004\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020A0\nH\u0087\bø\u0001\u0000¢\u0006\u0004\bH\u0010KJ\u000f\u0010L\u001a\u00020\u0002H\u0016¢\u0006\u0004\bL\u0010\u0016J\u001a\u0010N\u001a\u00020\u00062\b\u0010M\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020GH\u0016¢\u0006\u0004\bP\u0010QR\u001c\u0010S\u001a\u00020R8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bS\u0010T\u0012\u0004\bU\u0010VR\u001c\u0010W\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bW\u0010X\u0012\u0004\bY\u0010VR\u0012\u0010[\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\bZ\u0010\u0016R\u0012\u0010]\u001a\u00020\u00028Ç\u0002¢\u0006\u0006\u001a\u0004\b\\\u0010\u0016R\u0012\u0010a\u001a\u00020^8Æ\u0002¢\u0006\u0006\u001a\u0004\b_\u0010`\u0082\u0001\u0001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006c"}, d2 = {"Landroidx/collection/DoubleList;", "", "", "initialCapacity", "<init>", "(I)V", "", "none", "()Z", "any", "Lkotlin/Function1;", "", "predicate", "(Lkotlin/jvm/functions/Function1;)Z", "reversedAny", "element", "contains", "(D)Z", "elements", "containsAll", "(Landroidx/collection/DoubleList;)Z", "count", "()I", "(Lkotlin/jvm/functions/Function1;)I", "first", "()D", "(Lkotlin/jvm/functions/Function1;)D", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function3;", "foldIndexed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "", "block", "forEach", "(Lkotlin/jvm/functions/Function1;)V", "forEachIndexed", "(Lkotlin/jvm/functions/Function2;)V", "forEachReversed", "forEachReversedIndexed", FirebaseAnalytics.Param.INDEX, "get", "(I)D", "elementAt", "defaultValue", "elementAtOrElse", "(ILkotlin/jvm/functions/Function1;)D", "indexOf", "(D)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "last", "lastIndexOf", "fromIndex", "toIndex", "binarySearch", "(III)I", "", "separator", "prefix", "postfix", "limit", "truncated", "", "joinToString", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/String;", "transform", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "content", "[D", "getContent$annotations", "()V", "_size", "I", "get_size$annotations", "getSize", "size", "getLastIndex", "lastIndex", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "indices", "Landroidx/collection/MutableDoubleList;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class DoubleList {
    public int _size;

    @NotNull
    public double[] content;

    public /* synthetic */ DoubleList(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public static /* synthetic */ int binarySearch$default(DoubleList doubleList, int i10, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: binarySearch");
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = doubleList._size;
        }
        return doubleList.binarySearch(i10, i11, i12);
    }

    public static /* synthetic */ void getContent$annotations() {
    }

    public static /* synthetic */ void get_size$annotations() {
    }

    public static /* synthetic */ String joinToString$default(DoubleList doubleList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
        return doubleList.joinToString(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final int binarySearch(int i10) {
        return binarySearch$default(this, i10, 0, 0, 6, null);
    }

    public final boolean contains(double element) {
        double[] dArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (dArr[i11] == element) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(@NotNull DoubleList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        IntRange intRangeV = g.v(0, elements._size);
        int iE = intRangeV.e();
        int iF = intRangeV.f();
        if (iE > iF) {
            return true;
        }
        while (contains(elements.get(iE))) {
            if (iE == iF) {
                return true;
            }
            iE++;
        }
        return false;
    }

    /* JADX INFO: renamed from: count, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final double elementAt(@androidx.annotation.IntRange(from = 0) int index) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[index];
    }

    public final double elementAtOrElse(@androidx.annotation.IntRange(from = 0) int index, @NotNull Function1<? super Integer, Double> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (index < 0 || index >= this._size) ? defaultValue.invoke(Integer.valueOf(index)).doubleValue() : this.content[index];
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof DoubleList) {
            DoubleList doubleList = (DoubleList) other;
            int i10 = doubleList._size;
            int i11 = this._size;
            if (i10 == i11) {
                double[] dArr = this.content;
                double[] dArr2 = doubleList.content;
                IntRange intRangeV = g.v(0, i11);
                int iE = intRangeV.e();
                int iF = intRangeV.f();
                if (iE > iF) {
                    return true;
                }
                while (dArr[iE] == dArr2[iE]) {
                    if (iE == iF) {
                        return true;
                    }
                    iE++;
                }
                return false;
            }
        }
        return false;
    }

    public final double first() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("DoubleList is empty.");
        }
        return this.content[0];
    }

    public final <R> R fold(R initial, @NotNull Function2<? super R, ? super Double, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        double[] dArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            initial = operation.invoke(initial, Double.valueOf(dArr[i11]));
        }
        return initial;
    }

    public final <R> R foldIndexed(R initial, @NotNull Function3<? super Integer, ? super R, ? super Double, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        double[] dArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            R r10 = initial;
            initial = operation.invoke(Integer.valueOf(i11), r10, Double.valueOf(dArr[i11]));
        }
        return initial;
    }

    public final <R> R foldRight(R initial, @NotNull Function2<? super Double, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        double[] dArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return initial;
            }
            initial = operation.invoke(Double.valueOf(dArr[i10]), initial);
        }
    }

    public final <R> R foldRightIndexed(R initial, @NotNull Function3<? super Integer, ? super Double, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        double[] dArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return initial;
            }
            initial = operation.invoke(Integer.valueOf(i10), Double.valueOf(dArr[i10]), initial);
        }
    }

    public final void forEach(@NotNull Function1<? super Double, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        double[] dArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Double.valueOf(dArr[i11]));
        }
    }

    public final void forEachIndexed(@NotNull Function2<? super Integer, ? super Double, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        double[] dArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Integer.valueOf(i11), Double.valueOf(dArr[i11]));
        }
    }

    public final void forEachReversed(@NotNull Function1<? super Double, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        double[] dArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Double.valueOf(dArr[i10]));
            }
        }
    }

    public final void forEachReversedIndexed(@NotNull Function2<? super Integer, ? super Double, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        double[] dArr = this.content;
        int i10 = this._size;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Integer.valueOf(i10), Double.valueOf(dArr[i10]));
            }
        }
    }

    public final double get(@androidx.annotation.IntRange(from = 0) int index) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[index];
    }

    @NotNull
    public final IntRange getIndices() {
        return g.v(0, this._size);
    }

    @androidx.annotation.IntRange(from = -1)
    public final int getLastIndex() {
        return this._size - 1;
    }

    @androidx.annotation.IntRange(from = 0)
    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        double[] dArr = this.content;
        int i10 = this._size;
        int iA = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iA += a.a(dArr[i11]) * 31;
        }
        return iA;
    }

    public final int indexOf(double element) {
        double[] dArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (element == dArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public final int indexOfFirst(@NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        double[] dArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(Double.valueOf(dArr[i11])).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    public final int indexOfLast(@NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        double[] dArr = this.content;
        int i10 = this._size;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (!predicate.invoke(Double.valueOf(dArr[i10])).booleanValue());
        return i10;
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

    public final double last() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("DoubleList is empty.");
        }
        return this.content[this._size - 1];
    }

    public final int lastIndexOf(double element) {
        double[] dArr = this.content;
        int i10 = this._size;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (dArr[i10] != element);
        return i10;
    }

    public final boolean none() {
        return this._size == 0;
    }

    public final boolean reversedAny(@NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        double[] dArr = this.content;
        for (int i10 = this._size - 1; -1 < i10; i10--) {
            if (predicate.invoke(Double.valueOf(dArr[i10])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public String toString() {
        return joinToString$default(this, null, C4240b4.j.f42672d, C4240b4.j.f42674e, 0, null, 25, null);
    }

    private DoubleList(int i10) {
        this.content = i10 == 0 ? DoubleSetKt.getEmptyDoubleArray() : new double[i10];
    }

    public final boolean any(@NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        double[] dArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(Double.valueOf(dArr[i11])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int binarySearch(int i10, int i11) {
        return binarySearch$default(this, i10, i11, 0, 4, null);
    }

    public final int count(@NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        double[] dArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (predicate.invoke(Double.valueOf(dArr[i12])).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    public final int binarySearch(int element, int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex >= toIndex || toIndex > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i10 = toIndex - 1;
        while (fromIndex <= i10) {
            int i11 = (fromIndex + i10) >>> 1;
            double d10 = this.content[i11];
            double d11 = element;
            if (d10 < d11) {
                fromIndex = i11 + 1;
            } else {
                if (d10 <= d11) {
                    return i11;
                }
                i10 = i11 - 1;
            }
        }
        return -(fromIndex + 1);
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    public final double first(@NotNull Function1<? super Double, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        double[] dArr = this.content;
        int i10 = this._size;
        for (int i11 = 0; i11 < i10; i11++) {
            double d10 = dArr[i11];
            if (predicate.invoke(Double.valueOf(d10)).booleanValue()) {
                return d10;
            }
        }
        throw new NoSuchElementException("DoubleList contains no element matching the predicate.");
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public static /* synthetic */ String joinToString$default(DoubleList doubleList, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 transform, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                separator = ", ";
            }
            if ((i11 & 2) != 0) {
                prefix = "";
            }
            if ((i11 & 4) != 0) {
                postfix = "";
            }
            if ((i11 & 8) != 0) {
                i10 = -1;
            }
            if ((i11 & 16) != 0) {
                truncated = APSSharedUtil.TRUNCATE_SEPARATOR;
            }
            Intrinsics.checkNotNullParameter(separator, "separator");
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(postfix, "postfix");
            Intrinsics.checkNotNullParameter(truncated, "truncated");
            Intrinsics.checkNotNullParameter(transform, "transform");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(prefix);
            double[] dArr = doubleList.content;
            int i12 = doubleList._size;
            int i13 = 0;
            while (true) {
                if (i13 < i12) {
                    double d10 = dArr[i13];
                    if (i13 == i10) {
                        sb2.append(truncated);
                        break;
                    }
                    if (i13 != 0) {
                        sb2.append(separator);
                    }
                    sb2.append((CharSequence) transform.invoke(Double.valueOf(d10)));
                    i13++;
                } else {
                    sb2.append(postfix);
                    break;
                }
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i10, null, 16, null);
    }

    public final double last(@NotNull Function1<? super Double, Boolean> predicate) {
        double d10;
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        double[] dArr = this.content;
        int i10 = this._size;
        do {
            i10--;
            if (-1 < i10) {
                d10 = dArr[i10];
            } else {
                throw new NoSuchElementException("DoubleList contains no element matching the predicate.");
            }
        } while (!predicate.invoke(Double.valueOf(d10)).booleanValue());
        return d10;
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        double[] dArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        while (true) {
            if (i11 < i10) {
                double d10 = dArr[i11];
                if (i11 == limit) {
                    sb2.append(truncated);
                    break;
                }
                if (i11 != 0) {
                    sb2.append(separator);
                }
                sb2.append(d10);
                i11++;
            } else {
                sb2.append(postfix);
                break;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @NotNull Function1<? super Double, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        double[] dArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        while (true) {
            if (i11 < i10) {
                double d10 = dArr[i11];
                if (i11 == limit) {
                    sb2.append(truncated);
                    break;
                }
                if (i11 != 0) {
                    sb2.append(separator);
                }
                sb2.append(transform.invoke(Double.valueOf(d10)));
                i11++;
            } else {
                sb2.append(postfix);
                break;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull Function1<? super Double, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        double[] dArr = this.content;
        int i11 = this._size;
        int i12 = 0;
        while (true) {
            if (i12 < i11) {
                double d10 = dArr[i12];
                if (i12 == i10) {
                    sb2.append((CharSequence) APSSharedUtil.TRUNCATE_SEPARATOR);
                    break;
                }
                if (i12 != 0) {
                    sb2.append(separator);
                }
                sb2.append(transform.invoke(Double.valueOf(d10)));
                i12++;
            } else {
                sb2.append(postfix);
                break;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, @NotNull Function1<? super Double, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        double[] dArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        while (true) {
            if (i11 < i10) {
                double d10 = dArr[i11];
                if (i11 == -1) {
                    sb2.append((CharSequence) APSSharedUtil.TRUNCATE_SEPARATOR);
                    break;
                }
                if (i11 != 0) {
                    sb2.append(separator);
                }
                sb2.append(transform.invoke(Double.valueOf(d10)));
                i11++;
            } else {
                sb2.append(postfix);
                break;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull Function1<? super Double, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        double[] dArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        while (true) {
            if (i11 < i10) {
                double d10 = dArr[i11];
                if (i11 == -1) {
                    sb2.append((CharSequence) APSSharedUtil.TRUNCATE_SEPARATOR);
                    break;
                }
                if (i11 != 0) {
                    sb2.append(separator);
                }
                sb2.append(transform.invoke(Double.valueOf(d10)));
                i11++;
            } else {
                sb2.append((CharSequence) "");
                break;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull Function1<? super Double, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        double[] dArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        while (true) {
            if (i11 < i10) {
                double d10 = dArr[i11];
                if (i11 == -1) {
                    sb2.append((CharSequence) APSSharedUtil.TRUNCATE_SEPARATOR);
                    break;
                }
                if (i11 != 0) {
                    sb2.append(separator);
                }
                sb2.append(transform.invoke(Double.valueOf(d10)));
                i11++;
            } else {
                sb2.append((CharSequence) "");
                break;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String joinToString(@NotNull Function1<? super Double, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        double[] dArr = this.content;
        int i10 = this._size;
        int i11 = 0;
        while (true) {
            if (i11 < i10) {
                double d10 = dArr[i11];
                if (i11 == -1) {
                    sb2.append((CharSequence) APSSharedUtil.TRUNCATE_SEPARATOR);
                    break;
                }
                if (i11 != 0) {
                    sb2.append((CharSequence) ", ");
                }
                sb2.append(transform.invoke(Double.valueOf(d10)));
                i11++;
            } else {
                sb2.append((CharSequence) "");
                break;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
