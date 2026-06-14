package androidx.compose.runtime.reflect;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import com.ironsource.C4424m2;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0014\u001a\u00020\u0003J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\bH\u0016J:\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u001d\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u0001H\u0086\u0002¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/reflect/ComposableMethod;", "", "method", "Ljava/lang/reflect/Method;", "composableInfo", "Landroidx/compose/runtime/reflect/ComposableInfo;", "(Ljava/lang/reflect/Method;Landroidx/compose/runtime/reflect/ComposableInfo;)V", "parameterCount", "", "getParameterCount", "()I", "parameterTypes", "", "Ljava/lang/Class;", "getParameterTypes", "()[Ljava/lang/Class;", "parameters", "Ljava/lang/reflect/Parameter;", "getParameters", "()[Ljava/lang/reflect/Parameter;", "asMethod", "equals", "", "other", "hashCode", "invoke", "composer", "Landroidx/compose/runtime/Composer;", C4424m2.f43617p, "args", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposableMethod {
    public static final int $stable = 8;

    @NotNull
    private final ComposableInfo composableInfo;

    @NotNull
    private final Method method;

    public ComposableMethod(@NotNull Method method, @NotNull ComposableInfo composableInfo) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(composableInfo, "composableInfo");
        this.method = method;
        this.composableInfo = composableInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: asMethod, reason: from getter */
    public final Method getMethod() {
        return this.method;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof ComposableMethod) {
            return Intrinsics.areEqual(this.method, ((ComposableMethod) other).method);
        }
        return false;
    }

    public final int getParameterCount() {
        return this.composableInfo.getRealParamsCount();
    }

    @NotNull
    public final Class<?>[] getParameterTypes() {
        Class<?>[] parameterTypes = this.method.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "method.parameterTypes");
        return (Class[]) ArraysKt.copyOfRange(parameterTypes, 0, this.composableInfo.getRealParamsCount());
    }

    @NotNull
    public final Parameter[] getParameters() {
        Parameter[] parameters = this.method.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "method.parameters");
        return (Parameter[]) ArraysKt.copyOfRange(parameters, 0, this.composableInfo.getRealParamsCount());
    }

    public int hashCode() {
        return this.method.hashCode();
    }

    @Nullable
    public final Object invoke(@NotNull Composer composer, @Nullable Object instance, @NotNull Object... args) {
        Object defaultValue;
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(args, "args");
        ComposableInfo composableInfo = this.composableInfo;
        int realParamsCount = composableInfo.getRealParamsCount();
        int changedParams = composableInfo.getChangedParams();
        int defaultParams = composableInfo.getDefaultParams();
        int length = this.method.getParameterTypes().length;
        int i10 = realParamsCount + 1;
        int i11 = changedParams + i10;
        Object[] objArr = new Integer[defaultParams];
        for (int i12 = 0; i12 < defaultParams; i12++) {
            int i13 = i12 * 31;
            IntRange intRangeV = g.v(i13, Math.min(i13 + 31, realParamsCount));
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeV, 10));
            Iterator it = intRangeV.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                arrayList.add(Integer.valueOf((iNextInt >= args.length || args[iNextInt] == null) ? 1 : 0));
            }
            int iIntValue = 0;
            int i14 = 0;
            for (Object obj : arrayList) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                iIntValue |= ((Number) obj).intValue() << i14;
                i14 = i15;
            }
            objArr[i12] = Integer.valueOf(iIntValue);
        }
        Object[] objArr2 = new Object[length];
        for (int i16 = 0; i16 < length; i16++) {
            if (i16 < 0 || i16 >= realParamsCount) {
                if (i16 == realParamsCount) {
                    defaultValue = composer;
                } else if (i16 == i10 || (realParamsCount + 2 <= i16 && i16 < i11)) {
                    defaultValue = 0;
                } else {
                    if (i11 > i16 || i16 >= length) {
                        throw new IllegalStateException("Unexpected index");
                    }
                    defaultValue = objArr[i16 - i11];
                }
            } else if (i16 < 0 || i16 > ArraysKt.getLastIndex(args)) {
                Class<?> cls = this.method.getParameterTypes()[i16];
                Intrinsics.checkNotNullExpressionValue(cls, "method.parameterTypes[idx]");
                defaultValue = ComposableMethodKt.getDefaultValue(cls);
            } else {
                defaultValue = args[i16];
            }
            objArr2[i16] = defaultValue;
        }
        return this.method.invoke(instance, Arrays.copyOf(objArr2, length));
    }
}
