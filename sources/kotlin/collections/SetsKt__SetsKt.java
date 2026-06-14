package kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000H\u0087\b¢\u0006\u0004\b\t\u0010\u0003\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\t\u0010\u0007\u001a&\u0010\f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\nj\b\u0012\u0004\u0012\u00028\u0000`\u000b\"\u0004\b\u0000\u0010\u0000H\u0087\b¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\nj\b\u0012\u0004\u0012\u00028\u0000`\u000b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\f\u0010\u000e\u001a&\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000H\u0087\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a7\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0013\u001a)\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a7\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u00142\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0004\"\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u0007\u001aH\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00182\u001a\b\u0001\u0010\u001b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001aP\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u001a\b\u0001\u0010\u001b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u001c\u0010 \u001a(\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001H\u0087\b¢\u0006\u0004\b!\u0010\"\u001a%\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b#\u0010\"\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006$"}, d2 = {"T", "", "emptySet", "()Ljava/util/Set;", "", "elements", "setOf", "([Ljava/lang/Object;)Ljava/util/Set;", "", "mutableSetOf", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "hashSetOf", "()Ljava/util/HashSet;", "([Ljava/lang/Object;)Ljava/util/HashSet;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "linkedSetOf", "()Ljava/util/LinkedHashSet;", "([Ljava/lang/Object;)Ljava/util/LinkedHashSet;", "", "element", "setOfNotNull", "(Ljava/lang/Object;)Ljava/util/Set;", ExifInterface.LONGITUDE_EAST, "Lkotlin/Function1;", "", "builderAction", "buildSet", "(Lkotlin/jvm/functions/Function1;)Ljava/util/Set;", "", "capacity", "(ILkotlin/jvm/functions/Function1;)Ljava/util/Set;", "orEmpty", "(Ljava/util/Set;)Ljava/util/Set;", "optimizeReadOnlySet", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
public class SetsKt__SetsKt extends SetsKt__SetsJVMKt {
    private static final <E> Set<E> buildSet(Function1<? super Set<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Set setCreateSetBuilder = SetsKt__SetsJVMKt.createSetBuilder();
        builderAction.invoke(setCreateSetBuilder);
        return SetsKt__SetsJVMKt.build(setCreateSetBuilder);
    }

    @NotNull
    public static <T> Set<T> emptySet() {
        return EmptySet.INSTANCE;
    }

    private static final <T> HashSet<T> hashSetOf() {
        return new HashSet<>();
    }

    private static final <T> LinkedHashSet<T> linkedSetOf() {
        return new LinkedHashSet<>();
    }

    private static final <T> Set<T> mutableSetOf() {
        return new LinkedHashSet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> Set<T> optimizeReadOnlySet(@NotNull Set<? extends T> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : SetsKt__SetsJVMKt.setOf(set.iterator().next()) : emptySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> Set<T> orEmpty(Set<? extends T> set) {
        return set == 0 ? emptySet() : set;
    }

    @NotNull
    public static <T> Set<T> setOf(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return ArraysKt___ArraysKt.toSet(elements);
    }

    @NotNull
    public static final <T> Set<T> setOfNotNull(@Nullable T t10) {
        return t10 != null ? SetsKt__SetsJVMKt.setOf(t10) : emptySet();
    }

    private static final <E> Set<E> buildSet(int i10, Function1<? super Set<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Set setCreateSetBuilder = SetsKt__SetsJVMKt.createSetBuilder(i10);
        builderAction.invoke(setCreateSetBuilder);
        return SetsKt__SetsJVMKt.build(setCreateSetBuilder);
    }

    @NotNull
    public static <T> HashSet<T> hashSetOf(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (HashSet) ArraysKt___ArraysKt.toCollection(elements, new HashSet(MapsKt__MapsJVMKt.mapCapacity(elements.length)));
    }

    @NotNull
    public static <T> LinkedHashSet<T> linkedSetOf(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (LinkedHashSet) ArraysKt___ArraysKt.toCollection(elements, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(elements.length)));
    }

    @NotNull
    public static <T> Set<T> mutableSetOf(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (Set) ArraysKt___ArraysKt.toCollection(elements, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(elements.length)));
    }

    private static final <T> Set<T> setOf() {
        return emptySet();
    }

    @NotNull
    public static final <T> Set<T> setOfNotNull(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (Set) ArraysKt___ArraysKt.filterNotNullTo(elements, new LinkedHashSet());
    }
}
