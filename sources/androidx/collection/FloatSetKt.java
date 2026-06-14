package androidx.collection;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u001d\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\b\u001a%\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0003\u0010\n\u001a\u0019\u0010\u0003\u001a\u00020\u00002\n\u0010\f\u001a\u00020\u000b\"\u00020\u0004¢\u0006\u0004\b\u0003\u0010\r\u001a\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0011\u001a\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0012\u001a%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0013\u001a\u0019\u0010\u000f\u001a\u00020\u000e2\n\u0010\f\u001a\u00020\u000b\"\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0014\u001a4\u0010\u0018\u001a\u00020\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a<\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00160\u0015H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0018\u0010\u001c\u001a\u0018\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010 \u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\"\u001a\u0010\"\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006&"}, d2 = {"Landroidx/collection/FloatSet;", "emptyFloatSet", "()Landroidx/collection/FloatSet;", "floatSetOf", "", "element1", "(F)Landroidx/collection/FloatSet;", "element2", "(FF)Landroidx/collection/FloatSet;", "element3", "(FFF)Landroidx/collection/FloatSet;", "", "elements", "([F)Landroidx/collection/FloatSet;", "Landroidx/collection/MutableFloatSet;", "mutableFloatSetOf", "()Landroidx/collection/MutableFloatSet;", "(F)Landroidx/collection/MutableFloatSet;", "(FF)Landroidx/collection/MutableFloatSet;", "(FFF)Landroidx/collection/MutableFloatSet;", "([F)Landroidx/collection/MutableFloatSet;", "Lkotlin/Function1;", "", "builderAction", "buildFloatSet", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/FloatSet;", "", "initialCapacity", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/FloatSet;", CampaignEx.JSON_KEY_AD_K, "hash", "(F)I", "EmptyFloatSet", "Landroidx/collection/MutableFloatSet;", "EmptyFloatArray", "[F", "getEmptyFloatArray", "()[F", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FloatSetKt {

    @NotNull
    private static final MutableFloatSet EmptyFloatSet = new MutableFloatSet(0);

    @NotNull
    private static final float[] EmptyFloatArray = new float[0];

    @NotNull
    public static final FloatSet buildFloatSet(@NotNull Function1<? super MutableFloatSet, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(0, 1, null);
        builderAction.invoke(mutableFloatSet);
        return mutableFloatSet;
    }

    @NotNull
    public static final FloatSet emptyFloatSet() {
        return EmptyFloatSet;
    }

    @NotNull
    public static final FloatSet floatSetOf() {
        return EmptyFloatSet;
    }

    @NotNull
    public static final float[] getEmptyFloatArray() {
        return EmptyFloatArray;
    }

    public static final int hash(float f10) {
        int iFloatToIntBits = Float.floatToIntBits(f10) * ScatterMapKt.MurmurHashC1;
        return iFloatToIntBits ^ (iFloatToIntBits << 16);
    }

    @NotNull
    public static final MutableFloatSet mutableFloatSetOf() {
        return new MutableFloatSet(0, 1, null);
    }

    @NotNull
    public static final FloatSet buildFloatSet(int i10, @NotNull Function1<? super MutableFloatSet, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(i10);
        builderAction.invoke(mutableFloatSet);
        return mutableFloatSet;
    }

    @NotNull
    public static final FloatSet floatSetOf(float f10) {
        return mutableFloatSetOf(f10);
    }

    @NotNull
    public static final MutableFloatSet mutableFloatSetOf(float f10) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(1);
        mutableFloatSet.plusAssign(f10);
        return mutableFloatSet;
    }

    @NotNull
    public static final FloatSet floatSetOf(float f10, float f11) {
        return mutableFloatSetOf(f10, f11);
    }

    @NotNull
    public static final MutableFloatSet mutableFloatSetOf(float f10, float f11) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(2);
        mutableFloatSet.plusAssign(f10);
        mutableFloatSet.plusAssign(f11);
        return mutableFloatSet;
    }

    @NotNull
    public static final FloatSet floatSetOf(float f10, float f11, float f12) {
        return mutableFloatSetOf(f10, f11, f12);
    }

    @NotNull
    public static final FloatSet floatSetOf(@NotNull float... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(elements.length);
        mutableFloatSet.plusAssign(elements);
        return mutableFloatSet;
    }

    @NotNull
    public static final MutableFloatSet mutableFloatSetOf(float f10, float f11, float f12) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(3);
        mutableFloatSet.plusAssign(f10);
        mutableFloatSet.plusAssign(f11);
        mutableFloatSet.plusAssign(f12);
        return mutableFloatSet;
    }

    @NotNull
    public static final MutableFloatSet mutableFloatSetOf(@NotNull float... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(elements.length);
        mutableFloatSet.plusAssign(elements);
        return mutableFloatSet;
    }
}
