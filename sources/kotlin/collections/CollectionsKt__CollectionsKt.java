package kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000~\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000H\u0087\b¢\u0006\u0004\b\t\u0010\u0007\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000H\u0087\b¢\u0006\u0004\b\f\u0010\u0007\u001a&\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\rj\b\u0012\u0004\u0012\u00028\u0000`\u000e\"\u0004\b\u0000\u0010\u0000H\u0087\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\f\u0010\n\u001a7\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\rj\b\u0012\u0004\u0012\u00028\u0000`\u000e\"\u0004\b\u0000\u0010\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0011\u001a'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0000*\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0000*\u00020\u00122\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001\"\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0014\u0010\n\u001a;\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00028\u00000\u0018H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a;\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00028\u00000\u0018H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001b\u001aH\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u001d2\u001a\b\u0001\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0004\u0012\u00020\u001e0\u0018H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b \u0010!\u001aP\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u001d2\u0006\u0010\"\u001a\u00020\u00162\u001a\b\u0001\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0004\u0012\u00020\u001e0\u0018H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b \u0010\u001b\u001a \u0010$\u001a\u00020#\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0087\b¢\u0006\u0004\b$\u0010%\u001a3\u0010&\u001a\u00020#\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000¢\u0006\u0004\b&\u0010%\u001a(\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002H\u0087\b¢\u0006\u0004\b'\u0010(\u001a(\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005H\u0087\b¢\u0006\u0004\b'\u0010)\u001aJ\u0010.\u001a\u00028\u0001\"\u0010\b\u0000\u0010**\u0006\u0012\u0002\b\u00030\u0002*\u00028\u0001\"\u0004\b\u0001\u0010+*\u00028\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00010,H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b.\u0010/\u001a.\u00100\u001a\u00020#\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0087\b¢\u0006\u0004\b0\u00101\u001a-\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u0000022\u0006\u00104\u001a\u000203H\u0007¢\u0006\u0004\b5\u00106\u001a%\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000¢\u0006\u0004\b7\u0010)\u001aG\u0010;\u001a\u00020\u0016\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u000008*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00052\b\u0010\u0013\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u00109\u001a\u00020\u00162\b\b\u0002\u0010:\u001a\u00020\u0016¢\u0006\u0004\b;\u0010<\u001aU\u0010;\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0013\u001a\u00028\u00002\u001a\u0010?\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000=j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`>2\b\b\u0002\u00109\u001a\u00020\u00162\b\b\u0002\u0010:\u001a\u00020\u0016¢\u0006\u0004\b;\u0010@\u001ai\u0010D\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010A*\b\u0012\u0004\u0012\u00028\u000108*\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0010B\u001a\u0004\u0018\u00018\u00012\b\b\u0002\u00109\u001a\u00020\u00162\b\b\u0002\u0010:\u001a\u00020\u00162\u0016\b\u0004\u0010C\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0018H\u0086\bø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001aE\u0010;\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\b\b\u0002\u00109\u001a\u00020\u00162\b\b\u0002\u0010:\u001a\u00020\u00162\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u0018¢\u0006\u0004\b;\u0010G\u001a'\u0010J\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00109\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u0016H\u0002¢\u0006\u0004\bH\u0010I\u001a\u000f\u0010K\u001a\u00020\u001eH\u0001¢\u0006\u0004\bK\u0010L\u001a\u000f\u0010M\u001a\u00020\u001eH\u0001¢\u0006\u0004\bM\u0010L\u001a#\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00012\n\u0010N\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\bO\u0010P\u001a5\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\n\u0010N\u001a\u0006\u0012\u0002\b\u00030\u00022\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\bO\u0010R\"\u0019\u0010V\u001a\u00020S*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\bT\u0010U\"!\u0010Y\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001a\u0004\bW\u0010X\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006Z"}, d2 = {"T", "", "", "asCollection", "([Ljava/lang/Object;)Ljava/util/Collection;", "", "emptyList", "()Ljava/util/List;", "elements", "listOf", "([Ljava/lang/Object;)Ljava/util/List;", "", "mutableListOf", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "arrayListOf", "()Ljava/util/ArrayList;", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "", "element", "listOfNotNull", "(Ljava/lang/Object;)Ljava/util/List;", "", "size", "Lkotlin/Function1;", "init", "List", "(ILkotlin/jvm/functions/Function1;)Ljava/util/List;", "MutableList", ExifInterface.LONGITUDE_EAST, "", "builderAction", "buildList", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "capacity", "", "isNotEmpty", "(Ljava/util/Collection;)Z", "isNullOrEmpty", "orEmpty", "(Ljava/util/Collection;)Ljava/util/Collection;", "(Ljava/util/List;)Ljava/util/List;", "C", "R", "Lkotlin/Function0;", "defaultValue", "ifEmpty", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "containsAll", "(Ljava/util/Collection;Ljava/util/Collection;)Z", "", "Lkotlin/random/d;", "random", "shuffled", "(Ljava/lang/Iterable;Lkotlin/random/d;)Ljava/util/List;", "optimizeReadOnlyList", "", "fromIndex", "toIndex", "binarySearch", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;II)I", "K", C4240b4.i.W, "selector", "binarySearchBy", "(Ljava/util/List;Ljava/lang/Comparable;IILkotlin/jvm/functions/Function1;)I", "comparison", "(Ljava/util/List;IILkotlin/jvm/functions/Function1;)I", "rangeCheck$CollectionsKt__CollectionsKt", "(III)V", "rangeCheck", "throwIndexOverflow", "()V", "throwCountOverflow", "collection", "collectionToArrayCommonImpl", "(Ljava/util/Collection;)[Ljava/lang/Object;", "array", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "Lkotlin/ranges/IntRange;", "getIndices", "(Ljava/util/Collection;)Lkotlin/ranges/IntRange;", "indices", "getLastIndex", "(Ljava/util/List;)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class CollectionsKt__CollectionsKt extends CollectionsKt__CollectionsJVMKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.CollectionsKt__CollectionsKt$binarySearchBy$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    public static final class AnonymousClass1<T> implements Function1<T, Integer> {

        /* JADX INFO: Incorrect field signature: TK; */
        final /* synthetic */ Comparable $key;
        final /* synthetic */ Function1<T, K> $selector;

        /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function1<-TT;+TK;>;TK;)V */
        public AnonymousClass1(Function1 function1, Comparable comparable) {
            this.$selector = function1;
            this.$key = comparable;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(T t10) {
            return Integer.valueOf(mf.a.d((Comparable) this.$selector.invoke(t10), this.$key));
        }
    }

    private static final <T> List<T> List(int i10, Function1<? super Integer, ? extends T> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(init.invoke(Integer.valueOf(i11)));
        }
        return arrayList;
    }

    private static final <T> List<T> MutableList(int i10, Function1<? super Integer, ? extends T> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(init.invoke(Integer.valueOf(i11)));
        }
        return arrayList;
    }

    private static final <T> ArrayList<T> arrayListOf() {
        return new ArrayList<>();
    }

    @NotNull
    public static final <T> Collection<T> asCollection(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new ArrayAsCollection(tArr, false);
    }

    public static final <T extends Comparable<? super T>> int binarySearch(@NotNull List<? extends T> list, @Nullable T t10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        rangeCheck$CollectionsKt__CollectionsKt(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iD = mf.a.d(list.get(i13), t10);
            if (iD < 0) {
                i10 = i13 + 1;
            } else {
                if (iD <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int binarySearch$default(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return binarySearch((List<? extends Comparable>) list, comparable, i10, i11);
    }

    public static final <T, K extends Comparable<? super K>> int binarySearchBy(@NotNull List<? extends T> list, @Nullable K k10, int i10, int i11, @NotNull Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return binarySearch(list, i10, i11, new AnonymousClass1(selector, k10));
    }

    public static /* synthetic */ int binarySearchBy$default(List list, Comparable comparable, int i10, int i11, Function1 selector, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return binarySearch(list, i10, i11, new AnonymousClass1(selector, comparable));
    }

    private static final <E> List<E> buildList(Function1<? super List<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        List listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        builderAction.invoke(listCreateListBuilder);
        return CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder);
    }

    @NotNull
    public static final Object[] collectionToArrayCommonImpl(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        int i10 = 0;
        if (collection.isEmpty()) {
            return new Object[0];
        }
        Object[] objArr = new Object[collection.size()];
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return objArr;
    }

    private static final <T> boolean containsAll(Collection<? extends T> collection, Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return collection.containsAll(elements);
    }

    @NotNull
    public static <T> List<T> emptyList() {
        return EmptyList.INSTANCE;
    }

    @NotNull
    public static IntRange getIndices(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new IntRange(0, collection.size() - 1);
    }

    public static <T> int getLastIndex(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }

    /* JADX WARN: Incorrect types in method signature: <C::Ljava/util/Collection<*>;:TR;R:Ljava/lang/Object;>(TC;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    private static final Object ifEmpty(Collection collection, Function0 defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return collection.isEmpty() ? defaultValue.invoke() : collection;
    }

    private static final <T> boolean isNotEmpty(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return !collection.isEmpty();
    }

    private static final <T> boolean isNullOrEmpty(Collection<? extends T> collection) {
        return collection == null || collection.isEmpty();
    }

    @NotNull
    public static <T> List<T> listOf(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? ArraysKt___ArraysJvmKt.asList(elements) : emptyList();
    }

    @NotNull
    public static <T> List<T> listOfNotNull(@Nullable T t10) {
        return t10 != null ? CollectionsKt__CollectionsJVMKt.listOf(t10) : emptyList();
    }

    private static final <T> List<T> mutableListOf() {
        return new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> List<T> optimizeReadOnlyList(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : CollectionsKt__CollectionsJVMKt.listOf(list.get(0)) : emptyList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> Collection<T> orEmpty(Collection<? extends T> collection) {
        return collection == 0 ? emptyList() : collection;
    }

    private static final void rangeCheck$CollectionsKt__CollectionsKt(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        }
        if (i12 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
    }

    @NotNull
    public static final <T> List<T> shuffled(@NotNull Iterable<? extends T> iterable, @NotNull kotlin.random.d random) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        List<T> mutableList = CollectionsKt___CollectionsKt.toMutableList(iterable);
        CollectionsKt___CollectionsKt.shuffle(mutableList, random);
        return mutableList;
    }

    public static void throwCountOverflow() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void throwIndexOverflow() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    @NotNull
    public static <T> ArrayList<T> arrayListOf(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList<>() : new ArrayList<>(new ArrayAsCollection(elements, true));
    }

    public static /* synthetic */ int binarySearch$default(List list, Object obj, Comparator comparator, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = list.size();
        }
        return binarySearch(list, obj, comparator, i10, i11);
    }

    private static final <E> List<E> buildList(int i10, Function1<? super List<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        List listCreateListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder(i10);
        builderAction.invoke(listCreateListBuilder);
        return CollectionsKt__CollectionsJVMKt.build(listCreateListBuilder);
    }

    private static final <T> List<T> listOf() {
        return emptyList();
    }

    @NotNull
    public static <T> List<T> listOfNotNull(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return ArraysKt___ArraysKt.filterNotNull(elements);
    }

    @NotNull
    public static <T> List<T> mutableListOf(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new ArrayAsCollection(elements, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> List<T> orEmpty(List<? extends T> list) {
        return list == 0 ? emptyList() : list;
    }

    public static /* synthetic */ int binarySearch$default(List list, int i10, int i11, Function1 function1, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = list.size();
        }
        return binarySearch(list, i10, i11, function1);
    }

    public static final <T> int binarySearch(@NotNull List<? extends T> list, T t10, @NotNull Comparator<? super T> comparator, int i10, int i11) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        rangeCheck$CollectionsKt__CollectionsKt(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iCompare = comparator.compare(list.get(i13), t10);
            if (iCompare < 0) {
                i10 = i13 + 1;
            } else {
                if (iCompare <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    @NotNull
    public static final <T> T[] collectionToArrayCommonImpl(@NotNull Collection<?> collection, @NotNull T[] array) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(array, "array");
        int i10 = 0;
        if (collection.isEmpty()) {
            return (T[]) CollectionsKt__CollectionsJVMKt.terminateCollectionToArray(0, array);
        }
        int length = array.length;
        Object[] objArr = array;
        if (length < collection.size()) {
            objArr = (T[]) ArraysKt__ArraysJVMKt.arrayOfNulls(array, collection.size());
        }
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return (T[]) CollectionsKt__CollectionsJVMKt.terminateCollectionToArray(collection.size(), objArr);
    }

    public static <T> int binarySearch(@NotNull List<? extends T> list, int i10, int i11, @NotNull Function1<? super T, Integer> comparison) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(comparison, "comparison");
        rangeCheck$CollectionsKt__CollectionsKt(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iIntValue = comparison.invoke(list.get(i13)).intValue();
            if (iIntValue < 0) {
                i10 = i13 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }
}
