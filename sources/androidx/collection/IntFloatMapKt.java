package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u001d\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\b\u001a-\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u000b\u001a=\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u000e\u001aM\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0011\u001a]\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0014\u001a\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0018\u001a-\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0019\u001a=\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u001a\u001aM\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u001b\u001a]\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u001c\u001a4\u0010 \u001a\u00020\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001e0\u001dH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b \u0010!\u001a<\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00042\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001e0\u001dH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b \u0010#\"\u0014\u0010$\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006&"}, d2 = {"Landroidx/collection/IntFloatMap;", "emptyIntFloatMap", "()Landroidx/collection/IntFloatMap;", "intFloatMapOf", "", "key1", "", "value1", "(IF)Landroidx/collection/IntFloatMap;", "key2", "value2", "(IFIF)Landroidx/collection/IntFloatMap;", "key3", "value3", "(IFIFIF)Landroidx/collection/IntFloatMap;", "key4", "value4", "(IFIFIFIF)Landroidx/collection/IntFloatMap;", "key5", "value5", "(IFIFIFIFIF)Landroidx/collection/IntFloatMap;", "Landroidx/collection/MutableIntFloatMap;", "mutableIntFloatMapOf", "()Landroidx/collection/MutableIntFloatMap;", "(IF)Landroidx/collection/MutableIntFloatMap;", "(IFIF)Landroidx/collection/MutableIntFloatMap;", "(IFIFIF)Landroidx/collection/MutableIntFloatMap;", "(IFIFIFIF)Landroidx/collection/MutableIntFloatMap;", "(IFIFIFIFIF)Landroidx/collection/MutableIntFloatMap;", "Lkotlin/Function1;", "", "builderAction", "buildIntFloatMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/IntFloatMap;", "initialCapacity", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/IntFloatMap;", "EmptyIntFloatMap", "Landroidx/collection/MutableIntFloatMap;", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class IntFloatMapKt {

    @NotNull
    private static final MutableIntFloatMap EmptyIntFloatMap = new MutableIntFloatMap(0);

    @NotNull
    public static final IntFloatMap buildIntFloatMap(@NotNull Function1<? super MutableIntFloatMap, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        builderAction.invoke(mutableIntFloatMap);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final IntFloatMap emptyIntFloatMap() {
        return EmptyIntFloatMap;
    }

    @NotNull
    public static final IntFloatMap intFloatMapOf() {
        return EmptyIntFloatMap;
    }

    @NotNull
    public static final MutableIntFloatMap mutableIntFloatMapOf() {
        return new MutableIntFloatMap(0, 1, null);
    }

    @NotNull
    public static final IntFloatMap buildIntFloatMap(int i10, @NotNull Function1<? super MutableIntFloatMap, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(i10);
        builderAction.invoke(mutableIntFloatMap);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final IntFloatMap intFloatMapOf(int i10, float f10) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f10);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final MutableIntFloatMap mutableIntFloatMapOf(int i10, float f10) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f10);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final IntFloatMap intFloatMapOf(int i10, float f10, int i11, float f11) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f10);
        mutableIntFloatMap.set(i11, f11);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final MutableIntFloatMap mutableIntFloatMapOf(int i10, float f10, int i11, float f11) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f10);
        mutableIntFloatMap.set(i11, f11);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final IntFloatMap intFloatMapOf(int i10, float f10, int i11, float f11, int i12, float f12) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f10);
        mutableIntFloatMap.set(i11, f11);
        mutableIntFloatMap.set(i12, f12);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final MutableIntFloatMap mutableIntFloatMapOf(int i10, float f10, int i11, float f11, int i12, float f12) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f10);
        mutableIntFloatMap.set(i11, f11);
        mutableIntFloatMap.set(i12, f12);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final IntFloatMap intFloatMapOf(int i10, float f10, int i11, float f11, int i12, float f12, int i13, float f13) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f10);
        mutableIntFloatMap.set(i11, f11);
        mutableIntFloatMap.set(i12, f12);
        mutableIntFloatMap.set(i13, f13);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final MutableIntFloatMap mutableIntFloatMapOf(int i10, float f10, int i11, float f11, int i12, float f12, int i13, float f13) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f10);
        mutableIntFloatMap.set(i11, f11);
        mutableIntFloatMap.set(i12, f12);
        mutableIntFloatMap.set(i13, f13);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final IntFloatMap intFloatMapOf(int i10, float f10, int i11, float f11, int i12, float f12, int i13, float f13, int i14, float f14) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f10);
        mutableIntFloatMap.set(i11, f11);
        mutableIntFloatMap.set(i12, f12);
        mutableIntFloatMap.set(i13, f13);
        mutableIntFloatMap.set(i14, f14);
        return mutableIntFloatMap;
    }

    @NotNull
    public static final MutableIntFloatMap mutableIntFloatMapOf(int i10, float f10, int i11, float f11, int i12, float f12, int i13, float f13, int i14, float f14) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i10, f10);
        mutableIntFloatMap.set(i11, f11);
        mutableIntFloatMap.set(i12, f12);
        mutableIntFloatMap.set(i13, f13);
        mutableIntFloatMap.set(i14, f14);
        return mutableIntFloatMap;
    }
}
