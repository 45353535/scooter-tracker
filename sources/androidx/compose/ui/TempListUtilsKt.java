package androidx.compose.ui;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.aps.shared.util.APSSharedUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aT\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001aR\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0007\"\b\b\u0001\u0010\u0000*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\t\u0010\n\u001af\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000b\"\u0004\b\u0002\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000e0\rH\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001ah\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001aP\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\rH\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001ai\u0010\u001f\u001a\u00020\u001e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00172\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0017\u0018\u00010\rH\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u007f\u0010%\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010#*\u00060!j\u0002`\"*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010$\u001a\u00028\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00172\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0017\u0018\u00010\rH\u0002¢\u0006\u0004\b%\u0010&\u001a;\u0010)\u001a\u00020(\"\u0004\b\u0000\u0010\u0000*\u00060!j\u0002`\"2\u0006\u0010'\u001a\u00028\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0017\u0018\u00010\rH\u0002¢\u0006\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006+"}, d2 = {"T", "R", "", "Lkotlin/Function2;", "transform", "fastZipWithNext", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", ExifInterface.LATITUDE_SOUTH, "operation", "fastReduce", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Function1;", "Lkotlin/Pair;", "", "fastAssociate", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "other", "fastZip", "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "fastMapNotNull", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "separator", "prefix", "postfix", "", "limit", "truncated", "", "fastJoinToString", "(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "buffer", "fastJoinTo", "(Ljava/util/List;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "element", "", "appendElement", "(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TempListUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void appendElement(Appendable appendable, T t10, Function1<? super T, ? extends CharSequence> function1) throws IOException {
        if (function1 != null) {
            appendable.append(function1.invoke(t10));
            return;
        }
        if (t10 == 0 ? true : t10 instanceof CharSequence) {
            appendable.append((CharSequence) t10);
        } else if (t10 instanceof Character) {
            appendable.append(((Character) t10).charValue());
        } else {
            appendable.append(String.valueOf(t10));
        }
    }

    @NotNull
    public static final <T, K, V> Map<K, V> fastAssociate(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> transform) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair<? extends K, ? extends V> pairInvoke = transform.invoke(list.get(i10));
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, A extends Appendable> A fastJoinTo(List<? extends T> list, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1<? super T, ? extends CharSequence> function1) throws IOException {
        a10.append(charSequence2);
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            T t10 = list.get(i12);
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            appendElement(a10, t10, function1);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    @NotNull
    public static final <T> String fastJoinToString(@NotNull List<? extends T> list, @NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated, @Nullable Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        String string = ((StringBuilder) fastJoinTo(list, new StringBuilder(), separator, prefix, postfix, i10, truncated, function1)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return string;
    }

    public static /* synthetic */ String fastJoinToString$default(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
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
        return fastJoinToString(list, charSequence, charSequence2, charSequence3, i10, charSequence5, function12);
    }

    @NotNull
    public static final <T, R> List<R> fastMapNotNull(@NotNull List<? extends T> list, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            R rInvoke = transform.invoke(list.get(i10));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    public static final <S, T extends S> S fastReduce(@NotNull List<? extends T> list, @NotNull Function2<? super S, ? super T, ? extends S> operation) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        if (list.isEmpty()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S sInvoke = (Object) CollectionsKt.first((List) list);
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                sInvoke = operation.invoke(sInvoke, list.get(i10));
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return sInvoke;
    }

    @NotNull
    public static final <T, R, V> List<V> fastZip(@NotNull List<? extends T> list, @NotNull List<? extends R> other, @NotNull Function2<? super T, ? super R, ? extends V> transform) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(list.size(), other.size());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(list.get(i10), other.get(i10)));
        }
        return arrayList;
    }

    @NotNull
    public static final <T, R> List<R> fastZipWithNext(@NotNull List<? extends T> list, @NotNull Function2<? super T, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (list.size() == 0 || list.size() == 1) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        a.a aVar = list.get(0);
        int lastIndex = CollectionsKt.getLastIndex(list);
        while (i10 < lastIndex) {
            i10++;
            T t10 = list.get(i10);
            arrayList.add(transform.invoke(aVar, t10));
            aVar = t10;
        }
        return arrayList;
    }
}
