package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.adjust.sdk.Constants;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.Sequence;
import kotlin.sequences.k;
import kotlin.text.StringsKt;
import lf.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xf.a;

/* JADX INFO: loaded from: classes3.dex */
public final class ReflectClassUtilKt {

    @NotNull
    private static final Map<Class<? extends e>, Integer> FUNCTION_CLASSES;

    @NotNull
    private static final List<KClass<? extends Object>> PRIMITIVE_CLASSES;

    @NotNull
    private static final Map<Class<? extends Object>, Class<? extends Object>> PRIMITIVE_TO_WRAPPER;

    @NotNull
    private static final Map<Class<? extends Object>, Class<? extends Object>> WRAPPER_TO_PRIMITIVE;

    static {
        int i10 = 0;
        List<KClass<? extends Object>> listListOf = CollectionsKt.listOf((Object[]) new KClass[]{v0.b(Boolean.TYPE), v0.b(Byte.TYPE), v0.b(Character.TYPE), v0.b(Double.TYPE), v0.b(Float.TYPE), v0.b(Integer.TYPE), v0.b(Long.TYPE), v0.b(Short.TYPE)});
        PRIMITIVE_CLASSES = listListOf;
        List<KClass<? extends Object>> list = listListOf;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            KClass kClass = (KClass) it.next();
            arrayList.add(TuplesKt.to(a.c(kClass), a.d(kClass)));
        }
        WRAPPER_TO_PRIMITIVE = MapsKt.toMap(arrayList);
        List<KClass<? extends Object>> list2 = PRIMITIVE_CLASSES;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            KClass kClass2 = (KClass) it2.next();
            arrayList2.add(TuplesKt.to(a.d(kClass2), a.c(kClass2)));
        }
        PRIMITIVE_TO_WRAPPER = MapsKt.toMap(arrayList2);
        List listListOf2 = CollectionsKt.listOf((Object[]) new Class[]{Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class});
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf2, 10));
        for (Object obj : listListOf2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList3.add(TuplesKt.to((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        FUNCTION_CLASSES = MapsKt.toMap(arrayList3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParameterizedType _get_parameterizedTypeArguments_$lambda$3(ParameterizedType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Type ownerType = it.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence _get_parameterizedTypeArguments_$lambda$4(ParameterizedType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Type[] actualTypeArguments = it.getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
        return ArraysKt.asSequence(actualTypeArguments);
    }

    @NotNull
    public static final ClassId getClassId(@NotNull Class<?> cls) {
        ClassId classId;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            if (simpleName.length() != 0) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass != null && (classId = getClassId(declaringClass)) != null) {
                    Name nameIdentifier = Name.identifier(cls.getSimpleName());
                    Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
                    ClassId classIdCreateNestedClassId = classId.createNestedClassId(nameIdentifier);
                    if (classIdCreateNestedClassId != null) {
                        return classIdCreateNestedClassId;
                    }
                }
                ClassId.Companion companion = ClassId.Companion;
                String name = cls.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return companion.topLevel(new FqName(name));
            }
        }
        String name2 = cls.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        FqName fqName = new FqName(name2);
        return new ClassId(fqName.parent(), FqName.Companion.topLevel(fqName.shortName()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public static final String getDesc(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return StringsKt.V(name, '.', IOUtils.DIR_SEPARATOR_UNIX, false, 4, null);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('L');
            String name2 = cls.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            sb2.append(StringsKt.V(name2, '.', IOUtils.DIR_SEPARATOR_UNIX, false, 4, null));
            sb2.append(';');
            return sb2.toString();
        }
        String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name3.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name3.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name3.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name3.equals(Constants.LONG)) {
                    return "J";
                }
                break;
            case 3625364:
                if (name3.equals("void")) {
                    return ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
                }
                break;
            case 64711720:
                if (name3.equals(TypedValues.Custom.S_BOOLEAN)) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name3.equals(TypedValues.Custom.S_FLOAT)) {
                    return "F";
                }
                break;
            case 109413500:
                if (name3.equals("short")) {
                    return ExifInterface.LATITUDE_SOUTH;
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    @Nullable
    public static final Integer getFunctionClassArity(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return FUNCTION_CLASSES.get(cls);
    }

    @NotNull
    public static final List<Type> getParameterizedTypeArguments(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return CollectionsKt.emptyList();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return k.c0(k.J(k.q(type, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt$$Lambda$0
                @Override // kotlin.jvm.functions.Function1
                public Object invoke(Object obj) {
                    return ReflectClassUtilKt._get_parameterizedTypeArguments_$lambda$3((ParameterizedType) obj);
                }
            }), new Function1() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt$$Lambda$1
                @Override // kotlin.jvm.functions.Function1
                public Object invoke(Object obj) {
                    return ReflectClassUtilKt._get_parameterizedTypeArguments_$lambda$4((ParameterizedType) obj);
                }
            }));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
        return ArraysKt.toList(actualTypeArguments);
    }

    @Nullable
    public static final Class<?> getPrimitiveByWrapper(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return WRAPPER_TO_PRIMITIVE.get(cls);
    }

    @NotNull
    public static final ClassLoader getSafeClassLoader(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Intrinsics.checkNotNullExpressionValue(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }

    @Nullable
    public static final Class<?> getWrapperByPrimitive(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return PRIMITIVE_TO_WRAPPER.get(cls);
    }

    public static final boolean isEnumClassOrSpecializedEnumEntryClass(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
