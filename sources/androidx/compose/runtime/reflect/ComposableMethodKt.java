package androidx.compose.runtime.reflect;

import androidx.compose.runtime.Composer;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adjust.sdk.Constants;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z0;
import kotlin.ranges.IntRange;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b\u001a(\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u0002H\u000b2\u0006\u0010\f\u001a\u00020\u0001H\u0082\b¢\u0006\u0002\u0010\r\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\bH\u0002\u001a7\u0010\u0010\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u001a\u0010\u0014\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00110\n\"\u0006\u0012\u0002\b\u00030\u0011¢\u0006\u0002\u0010\u0015\u001a\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u0006\u0012\u0002\b\u00030\u0011H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"BITS_PER_INT", "", "changedParamCount", "realValueParams", "thisParams", "defaultParamCount", "asComposableMethod", "Landroidx/compose/runtime/reflect/ComposableMethod;", "Ljava/lang/reflect/Method;", "dup", "", "T", "count", "(Ljava/lang/Object;I)[Ljava/lang/Object;", "getComposableInfo", "Landroidx/compose/runtime/reflect/ComposableInfo;", "getDeclaredComposableMethod", "Ljava/lang/Class;", "methodName", "", "args", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Landroidx/compose/runtime/reflect/ComposableMethod;", "getDefaultValue", "", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ComposableMethodKt {
    private static final int BITS_PER_INT = 31;

    @Nullable
    public static final ComposableMethod asComposableMethod(@NotNull Method method) {
        Intrinsics.checkNotNullParameter(method, "<this>");
        ComposableInfo composableInfo = getComposableInfo(method);
        if (composableInfo.isComposable()) {
            return new ComposableMethod(method, composableInfo);
        }
        return null;
    }

    private static final int changedParamCount(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        return (int) Math.ceil(((double) (i10 + i11)) / 10.0d);
    }

    private static final int defaultParamCount(int i10) {
        return (int) Math.ceil(((double) i10) / 31.0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final /* synthetic */ <T> T[] dup(T t10, int i10) {
        IntRange intRangeV = g.v(0, i10);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeV, 10));
        Iterator<T> it = intRangeV.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            arrayList.add(t10);
        }
        Intrinsics.reifiedOperationMarker(0, "T?");
        return (T[]) arrayList.toArray(new Object[0]);
    }

    private static final ComposableInfo getComposableInfo(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "parameterTypes");
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (Intrinsics.areEqual(parameterTypes[length], Composer.class)) {
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
            length = -1;
        } else {
            length = -1;
        }
        if (length == -1) {
            return new ComposableInfo(false, method.getParameterTypes().length, 0, 0);
        }
        int iChangedParamCount = changedParamCount(length, !Modifier.isStatic(method.getModifiers()) ? 1 : 0);
        int i11 = length + 1 + iChangedParamCount;
        int length2 = method.getParameterTypes().length;
        int iDefaultParamCount = length2 != i11 ? defaultParamCount(length) : 0;
        return new ComposableInfo(i11 + iDefaultParamCount == length2, length, iChangedParamCount, iDefaultParamCount);
    }

    @NotNull
    public static final ComposableMethod getDeclaredComposableMethod(@NotNull Class<?> cls, @NotNull String methodName, @NotNull Class<?>... args) throws NoSuchMethodException {
        Method declaredMethod;
        Class cls2 = Integer.TYPE;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(args, "args");
        int iChangedParamCount = changedParamCount(args.length, 0);
        try {
            z0 z0Var = new z0(3);
            z0Var.b(args);
            z0Var.a(Composer.class);
            IntRange intRangeV = g.v(0, iChangedParamCount);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeV, 10));
            Iterator it = intRangeV.iterator();
            while (it.hasNext()) {
                ((IntIterator) it).nextInt();
                arrayList.add(cls2);
            }
            z0Var.b(arrayList.toArray(new Class[0]));
            declaredMethod = cls.getDeclaredMethod(methodName, (Class[]) z0Var.d(new Class[z0Var.c()]));
        } catch (ReflectiveOperationException unused) {
            int iDefaultParamCount = defaultParamCount(args.length);
            try {
                z0 z0Var2 = new z0(4);
                z0Var2.b(args);
                z0Var2.a(Composer.class);
                IntRange intRangeV2 = g.v(0, iChangedParamCount);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeV2, 10));
                Iterator it2 = intRangeV2.iterator();
                while (it2.hasNext()) {
                    ((IntIterator) it2).nextInt();
                    arrayList2.add(cls2);
                }
                z0Var2.b(arrayList2.toArray(new Class[0]));
                IntRange intRangeV3 = g.v(0, iDefaultParamCount);
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeV3, 10));
                Iterator it3 = intRangeV3.iterator();
                while (it3.hasNext()) {
                    ((IntIterator) it3).nextInt();
                    arrayList3.add(cls2);
                }
                z0Var2.b(arrayList3.toArray(new Class[0]));
                declaredMethod = cls.getDeclaredMethod(methodName, (Class[]) z0Var2.d(new Class[z0Var2.c()]));
            } catch (ReflectiveOperationException unused2) {
                declaredMethod = null;
            }
        }
        if (declaredMethod != null) {
            ComposableMethod composableMethodAsComposableMethod = asComposableMethod(declaredMethod);
            Intrinsics.checkNotNull(composableMethodAsComposableMethod);
            return composableMethodAsComposableMethod;
        }
        throw new NoSuchMethodException(cls.getName() + '.' + methodName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Object getDefaultValue(Class<?> cls) {
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.valueOf(0.0d);
                }
                return null;
            case 104431:
                return !name.equals("int") ? null : 0;
            case 3039496:
                return !name.equals("byte") ? null : (byte) 0;
            case 3052374:
                return !name.equals("char") ? null : (char) 0;
            case 3327612:
                return !name.equals(Constants.LONG) ? null : 0L;
            case 64711720:
                if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                    return Boolean.FALSE;
                }
                return null;
            case 97526364:
                if (name.equals(TypedValues.Custom.S_FLOAT)) {
                    return Float.valueOf(0.0f);
                }
                return null;
            case 109413500:
                return !name.equals("short") ? null : (short) 0;
            default:
                return null;
        }
    }
}
