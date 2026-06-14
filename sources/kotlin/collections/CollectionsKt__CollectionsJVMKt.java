package kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0081\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aA\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\u0006\u0010\r\u001a\u00020\f2\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0081\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000e\u001a\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0005H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00052\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0011\u001a)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0087\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a-\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u0019\u0010\u001d\u001a$\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0081\b¢\u0006\u0004\b\"\u0010#\u001a6\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000 \"\u0004\b\u0000\u0010\u00002\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0081\b¢\u0006\u0004\b\"\u0010%\u001a1\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000 \"\u0004\b\u0000\u0010\u00002\u0006\u0010&\u001a\u00020\f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0000¢\u0006\u0004\b'\u0010(\u001a3\u0010+\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010!0 \"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000 2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,\u001a\u0018\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020\fH\u0081\b¢\u0006\u0004\b.\u0010/\u001a\u0018\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020\fH\u0081\b¢\u0006\u0004\b1\u0010/\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00062"}, d2 = {"T", "element", "", "listOf", "(Ljava/lang/Object;)Ljava/util/List;", ExifInterface.LONGITUDE_EAST, "Lkotlin/Function1;", "", "", "builderAction", "buildListInternal", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "capacity", "(ILkotlin/jvm/functions/Function1;)Ljava/util/List;", "createListBuilder", "()Ljava/util/List;", "(I)Ljava/util/List;", "builder", "build", "(Ljava/util/List;)Ljava/util/List;", "Ljava/util/Enumeration;", "toList", "(Ljava/util/Enumeration;)Ljava/util/List;", "", "shuffled", "(Ljava/lang/Iterable;)Ljava/util/List;", "Ljava/util/Random;", "random", "(Ljava/lang/Iterable;Ljava/util/Random;)Ljava/util/List;", "", "collection", "", "", "collectionToArray", "(Ljava/util/Collection;)[Ljava/lang/Object;", "array", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "collectionSize", "terminateCollectionToArray", "(I[Ljava/lang/Object;)[Ljava/lang/Object;", "", "isVarargs", "copyToArrayOfAny", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", FirebaseAnalytics.Param.INDEX, "checkIndexOverflow", "(I)I", "count", "checkCountOverflow", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class CollectionsKt__CollectionsJVMKt {
    @NotNull
    public static <E> List<E> build(@NotNull List<E> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((ListBuilder) builder).build();
    }

    private static final <E> List<E> buildListInternal(Function1<? super List<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        List listCreateListBuilder = createListBuilder();
        builderAction.invoke(listCreateListBuilder);
        return build(listCreateListBuilder);
    }

    private static final int checkCountOverflow(int i10) {
        if (i10 < 0) {
            CollectionsKt__CollectionsKt.throwCountOverflow();
        }
        return i10;
    }

    private static final int checkIndexOverflow(int i10) {
        if (i10 < 0) {
            CollectionsKt__CollectionsKt.throwIndexOverflow();
        }
        return i10;
    }

    private static final Object[] collectionToArray(Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        return s.a(collection);
    }

    @NotNull
    public static final <T> Object[] copyToArrayOfAny(@NotNull T[] tArr, boolean z10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (z10 && Intrinsics.areEqual(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    @NotNull
    public static <E> List<E> createListBuilder() {
        return new ListBuilder(0, 1, null);
    }

    @NotNull
    public static <T> List<T> listOf(T t10) {
        List<T> listSingletonList = Collections.singletonList(t10);
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    @NotNull
    public static final <T> List<T> shuffled(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        List<T> mutableList = CollectionsKt___CollectionsKt.toMutableList(iterable);
        Collections.shuffle(mutableList);
        return mutableList;
    }

    @NotNull
    public static <T> T[] terminateCollectionToArray(int i10, @NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }

    private static final <T> List<T> toList(Enumeration<T> enumeration) {
        Intrinsics.checkNotNullParameter(enumeration, "<this>");
        ArrayList list = Collections.list(enumeration);
        Intrinsics.checkNotNullExpressionValue(list, "list(...)");
        return list;
    }

    private static final <E> List<E> buildListInternal(int i10, Function1<? super List<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        List listCreateListBuilder = createListBuilder(i10);
        builderAction.invoke(listCreateListBuilder);
        return build(listCreateListBuilder);
    }

    private static final <T> T[] collectionToArray(Collection<?> collection, T[] array) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) s.b(collection, array);
    }

    @NotNull
    public static <E> List<E> createListBuilder(int i10) {
        return new ListBuilder(i10);
    }

    @NotNull
    public static final <T> List<T> shuffled(@NotNull Iterable<? extends T> iterable, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        List<T> mutableList = CollectionsKt___CollectionsKt.toMutableList(iterable);
        Collections.shuffle(mutableList, random);
        return mutableList;
    }
}
