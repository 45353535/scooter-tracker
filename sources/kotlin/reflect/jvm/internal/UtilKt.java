package kotlin.reflect.jvm.internal;

import androidx.activity.s;
import com.ironsource.C4240b4;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.x0;
import kotlin.reflect.KCallable;
import kotlin.reflect.KType;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.text.StringsKt;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a/\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017*\u00020\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017*\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0018*\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a!\u0010\"\u001a\u0004\u0018\u00010!*\u0006\u0012\u0002\b\u00030 2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u001d\u0010%\u001a\u0004\u0018\u00010!*\u00020$2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010&\u001a\u0017\u0010(\u001a\u0004\u0018\u00010'*\u0004\u0018\u00010!H\u0000¢\u0006\u0004\b(\u0010)\u001a\u001b\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010**\u0004\u0018\u00010!H\u0000¢\u0006\u0004\b+\u0010,\u001a\u001b\u0010.\u001a\b\u0012\u0002\b\u0003\u0018\u00010-*\u0004\u0018\u00010!H\u0000¢\u0006\u0004\b.\u0010/\u001a\u0019\u00102\u001a\u0004\u0018\u00010!2\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b2\u00103\u001a=\u00108\u001a\u0004\u0018\u000107*\u0006\u0012\u0002\b\u00030\u00012\u0006\u00104\u001a\u00020\f2\u001a\u00106\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000105\"\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0004\b8\u00109\u001a!\u0010;\u001a\u0004\u0018\u00010:*\u0006\u0012\u0002\b\u00030\u00012\u0006\u00104\u001a\u00020\fH\u0000¢\u0006\u0004\b;\u0010<\u001a'\u0010@\u001a\u00028\u0000\"\u0004\b\u0000\u0010=2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0080\bø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001ai\u0010Q\u001a\u00028\u0001\"\b\b\u0000\u0010C*\u00020B\"\b\b\u0001\u0010E*\u00020D2\n\u0010F\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010G\u001a\u00028\u00002\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020L2\u0018\u0010P\u001a\u0014\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010NH\u0000¢\u0006\u0004\bQ\u0010R\"\u001a\u0010T\u001a\u00020S8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0018\u0010Z\u001a\u00020Y*\u00020X8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[\"\u0018\u0010]\u001a\u00020Y*\u00020X8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010[\"\u001a\u0010a\u001a\u0004\u0018\u00010^*\u00020D8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006b"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "Ljava/lang/Class;", "toJavaClass", "(Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;)Ljava/lang/Class;", "Ljava/lang/ClassLoader;", "classLoader", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "kotlinClassId", "", "arrayDimensions", "loadClass", "(Ljava/lang/ClassLoader;Lkotlin/reflect/jvm/internal/impl/name/ClassId;I)Ljava/lang/Class;", "", "packageName", "className", "(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/Class;", "createArrayType", "(Ljava/lang/Class;)Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibility;", "Lkotlin/reflect/KVisibility;", "toKVisibility", "(Lkotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibility;)Lkotlin/reflect/KVisibility;", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/Annotated;", "", "", "computeAnnotations", "(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/Annotated;)Ljava/util/List;", "unwrapRepeatableAnnotations", "(Ljava/util/List;)Ljava/util/List;", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptor;", "toAnnotationInstance", "(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptor;)Ljava/lang/annotation/Annotation;", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ConstantValue;", "", "toRuntimeValue", "(Lkotlin/reflect/jvm/internal/impl/resolve/constants/ConstantValue;Ljava/lang/ClassLoader;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ArrayValue;", "arrayToRuntimeValue", "(Lkotlin/reflect/jvm/internal/impl/resolve/constants/ArrayValue;Ljava/lang/ClassLoader;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/KFunctionImpl;", "asKFunctionImpl", "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/KFunctionImpl;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "asKPropertyImpl", "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "asKCallableImpl", "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "Ljava/lang/reflect/Type;", "type", "defaultPrimitiveValue", "(Ljava/lang/reflect/Type;)Ljava/lang/Object;", "name", "", "parameterTypes", "Ljava/lang/reflect/Method;", "getDeclaredMethodOrNull", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Field;", "getDeclaredFieldOrNull", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;", "R", "Lkotlin/Function0;", "block", "reflectionCall", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/impl/protobuf/MessageLite;", "M", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "D", "moduleAnchor", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/BinaryVersion;", "metadataVersion", "Lkotlin/Function2;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "createDescriptor", "deserializeToDescriptor", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "JVM_STATIC", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "getJVM_STATIC", "()Lorg/jetbrains/kotlin/name/FqName;", "Lkotlin/reflect/KType;", "", "isInlineClassType", "(Lkotlin/reflect/KType;)Z", "getNeedsMultiFieldValueClassFlattening", "needsMultiFieldValueClassFlattening", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "instanceReceiverParameter", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UtilKt {

    @NotNull
    private static final FqName JVM_STATIC = new FqName("kotlin.jvm.JvmStatic");

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Object arrayToRuntimeValue(ArrayValue arrayValue, ClassLoader classLoader) {
        KotlinType type;
        Class clsLoadClass$default;
        TypedArrayValue typedArrayValue = arrayValue instanceof TypedArrayValue ? (TypedArrayValue) arrayValue : null;
        if (typedArrayValue == null || (type = typedArrayValue.getType()) == null) {
            return null;
        }
        List<? extends ConstantValue<?>> value = arrayValue.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            arrayList.add(toRuntimeValue((ConstantValue) it.next(), classLoader));
        }
        PrimitiveType primitiveArrayElementType = KotlinBuiltIns.getPrimitiveArrayElementType(type);
        int i10 = 0;
        switch (primitiveArrayElementType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[primitiveArrayElementType.ordinal()]) {
            case -1:
                if (!KotlinBuiltIns.isArray(type)) {
                    throw new IllegalStateException(("Not an array type: " + type).toString());
                }
                KotlinType type2 = ((TypeProjection) CollectionsKt.single((List) type.getArguments())).getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                ClassifierDescriptor classifierDescriptorMo8663getDeclarationDescriptor = type2.getConstructor().mo8663getDeclarationDescriptor();
                ClassDescriptor classDescriptor = classifierDescriptorMo8663getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo8663getDeclarationDescriptor : null;
                if (classDescriptor == null) {
                    throw new IllegalStateException(("Not a class type: " + type2).toString());
                }
                if (KotlinBuiltIns.isString(type2)) {
                    int size = arrayValue.getValue().size();
                    String[] strArr = new String[size];
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                        strArr[i10] = obj;
                        i10++;
                    }
                    return strArr;
                }
                if (KotlinBuiltIns.isKClass(classDescriptor)) {
                    int size2 = arrayValue.getValue().size();
                    Class[] clsArr = new Class[size2];
                    while (i10 < size2) {
                        Object obj2 = arrayList.get(i10);
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                        clsArr[i10] = obj2;
                        i10++;
                    }
                    return clsArr;
                }
                ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
                if (classId == null || (clsLoadClass$default = loadClass$default(classLoader, classId, 0, 4, null)) == null) {
                    return null;
                }
                Object objNewInstance = Array.newInstance((Class<?>) clsLoadClass$default, arrayValue.getValue().size());
                Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                Object[] objArr = (Object[]) objNewInstance;
                int size3 = arrayList.size();
                while (i10 < size3) {
                    objArr[i10] = arrayList.get(i10);
                    i10++;
                }
                return objArr;
            case 0:
            default:
                throw new m();
            case 1:
                int size4 = arrayValue.getValue().size();
                boolean[] zArr = new boolean[size4];
                while (i10 < size4) {
                    Object obj3 = arrayList.get(i10);
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    zArr[i10] = ((Boolean) obj3).booleanValue();
                    i10++;
                }
                return zArr;
            case 2:
                int size5 = arrayValue.getValue().size();
                char[] cArr = new char[size5];
                while (i10 < size5) {
                    Object obj4 = arrayList.get(i10);
                    Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Char");
                    cArr[i10] = ((Character) obj4).charValue();
                    i10++;
                }
                return cArr;
            case 3:
                int size6 = arrayValue.getValue().size();
                byte[] bArr = new byte[size6];
                while (i10 < size6) {
                    Object obj5 = arrayList.get(i10);
                    Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Byte");
                    bArr[i10] = ((Byte) obj5).byteValue();
                    i10++;
                }
                return bArr;
            case 4:
                int size7 = arrayValue.getValue().size();
                short[] sArr = new short[size7];
                while (i10 < size7) {
                    Object obj6 = arrayList.get(i10);
                    Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Short");
                    sArr[i10] = ((Short) obj6).shortValue();
                    i10++;
                }
                return sArr;
            case 5:
                int size8 = arrayValue.getValue().size();
                int[] iArr = new int[size8];
                while (i10 < size8) {
                    Object obj7 = arrayList.get(i10);
                    Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Int");
                    iArr[i10] = ((Integer) obj7).intValue();
                    i10++;
                }
                return iArr;
            case 6:
                int size9 = arrayValue.getValue().size();
                float[] fArr = new float[size9];
                while (i10 < size9) {
                    Object obj8 = arrayList.get(i10);
                    Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Float");
                    fArr[i10] = ((Float) obj8).floatValue();
                    i10++;
                }
                return fArr;
            case 7:
                int size10 = arrayValue.getValue().size();
                long[] jArr = new long[size10];
                while (i10 < size10) {
                    Object obj9 = arrayList.get(i10);
                    Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type kotlin.Long");
                    jArr[i10] = ((Long) obj9).longValue();
                    i10++;
                }
                return jArr;
            case 8:
                int size11 = arrayValue.getValue().size();
                double[] dArr = new double[size11];
                while (i10 < size11) {
                    Object obj10 = arrayList.get(i10);
                    Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Double");
                    dArr[i10] = ((Double) obj10).doubleValue();
                    i10++;
                }
                return dArr;
        }
    }

    @Nullable
    public static final KCallableImpl<?> asKCallableImpl(@Nullable Object obj) {
        KCallableImpl<?> kCallableImpl = obj instanceof KCallableImpl ? (KCallableImpl) obj : null;
        if (kCallableImpl != null) {
            return kCallableImpl;
        }
        KFunctionImpl kFunctionImplAsKFunctionImpl = asKFunctionImpl(obj);
        return kFunctionImplAsKFunctionImpl != null ? kFunctionImplAsKFunctionImpl : asKPropertyImpl(obj);
    }

    @Nullable
    public static final KFunctionImpl asKFunctionImpl(@Nullable Object obj) {
        KFunctionImpl kFunctionImpl = obj instanceof KFunctionImpl ? (KFunctionImpl) obj : null;
        if (kFunctionImpl != null) {
            return kFunctionImpl;
        }
        x xVar = obj instanceof x ? (x) obj : null;
        KCallable kCallableCompute = xVar != null ? xVar.compute() : null;
        if (kCallableCompute instanceof KFunctionImpl) {
            return (KFunctionImpl) kCallableCompute;
        }
        return null;
    }

    @Nullable
    public static final KPropertyImpl<?> asKPropertyImpl(@Nullable Object obj) {
        KPropertyImpl<?> kPropertyImpl = obj instanceof KPropertyImpl ? (KPropertyImpl) obj : null;
        if (kPropertyImpl != null) {
            return kPropertyImpl;
        }
        q0 q0Var = obj instanceof q0 ? (q0) obj : null;
        KCallable kCallableCompute = q0Var != null ? q0Var.compute() : null;
        if (kCallableCompute instanceof KPropertyImpl) {
            return (KPropertyImpl) kCallableCompute;
        }
        return null;
    }

    @NotNull
    public static final List<Annotation> computeAnnotations(@NotNull Annotated annotated) {
        Annotation annotationInstance;
        Intrinsics.checkNotNullParameter(annotated, "<this>");
        Annotations annotations = annotated.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (AnnotationDescriptor annotationDescriptor : annotations) {
            SourceElement source = annotationDescriptor.getSource();
            if (source instanceof ReflectAnnotationSource) {
                annotationInstance = ((ReflectAnnotationSource) source).getAnnotation();
            } else if (source instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
                ReflectJavaElement javaElement = ((RuntimeSourceElementFactory.RuntimeSourceElement) source).getJavaElement();
                ReflectJavaAnnotation reflectJavaAnnotation = javaElement instanceof ReflectJavaAnnotation ? (ReflectJavaAnnotation) javaElement : null;
                annotationInstance = reflectJavaAnnotation != null ? reflectJavaAnnotation.getAnnotation() : null;
            } else {
                annotationInstance = toAnnotationInstance(annotationDescriptor);
            }
            if (annotationInstance != null) {
                arrayList.add(annotationInstance);
            }
        }
        return unwrapRepeatableAnnotations(arrayList);
    }

    @NotNull
    public static final Class<?> createArrayType(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return Array.newInstance(cls, 0).getClass();
    }

    @Nullable
    public static final Object defaultPrimitiveValue(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!cls.isPrimitive()) {
            return null;
        }
        if (Intrinsics.areEqual(cls, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (Intrinsics.areEqual(cls, Character.TYPE)) {
            return (char) 0;
        }
        if (Intrinsics.areEqual(cls, Byte.TYPE)) {
            return (byte) 0;
        }
        if (Intrinsics.areEqual(cls, Short.TYPE)) {
            return (short) 0;
        }
        if (Intrinsics.areEqual(cls, Integer.TYPE)) {
            return 0;
        }
        if (Intrinsics.areEqual(cls, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (Intrinsics.areEqual(cls, Long.TYPE)) {
            return 0L;
        }
        if (Intrinsics.areEqual(cls, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (Intrinsics.areEqual(cls, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    @NotNull
    public static final <M extends MessageLite, D extends CallableDescriptor> D deserializeToDescriptor(@NotNull Class<?> moduleAnchor, @NotNull M proto, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull BinaryVersion metadataVersion, @NotNull Function2<? super MemberDeserializer, ? super M, ? extends D> createDescriptor) {
        List<ProtoBuf.TypeParameter> typeParameterList;
        Intrinsics.checkNotNullParameter(moduleAnchor, "moduleAnchor");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(createDescriptor, "createDescriptor");
        RuntimeModuleData orCreateModule = ModuleByClassLoaderKt.getOrCreateModule(moduleAnchor);
        if (proto instanceof ProtoBuf.Function) {
            typeParameterList = ((ProtoBuf.Function) proto).getTypeParameterList();
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unsupported message: " + proto).toString());
            }
            typeParameterList = ((ProtoBuf.Property) proto).getTypeParameterList();
        }
        List<ProtoBuf.TypeParameter> list = typeParameterList;
        DeserializationComponents deserialization = orCreateModule.getDeserialization();
        ModuleDescriptor module = orCreateModule.getModule();
        VersionRequirementTable empty = VersionRequirementTable.Companion.getEMPTY();
        Intrinsics.checkNotNull(list);
        return createDescriptor.invoke(new MemberDeserializer(new DeserializationContext(deserialization, nameResolver, module, typeTable, empty, metadataVersion, null, null, list)), proto);
    }

    @Nullable
    public static final Field getDeclaredFieldOrNull(@NotNull Class<?> cls, @NotNull String name) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            return cls.getDeclaredField(name);
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @Nullable
    public static final Method getDeclaredMethodOrNull(@NotNull Class<?> cls, @NotNull String name, @NotNull Class<?>... parameterTypes) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            return cls.getDeclaredMethod(name, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Nullable
    public static final ReceiverParameterDescriptor getInstanceReceiverParameter(@NotNull CallableDescriptor callableDescriptor) {
        Intrinsics.checkNotNullParameter(callableDescriptor, "<this>");
        if (callableDescriptor.getDispatchReceiverParameter() == null) {
            return null;
        }
        DeclarationDescriptor containingDeclaration = callableDescriptor.getContainingDeclaration();
        Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((ClassDescriptor) containingDeclaration).getThisAsReceiverParameter();
    }

    @NotNull
    public static final FqName getJVM_STATIC() {
        return JVM_STATIC;
    }

    public static final boolean getNeedsMultiFieldValueClassFlattening(@NotNull KType kType) {
        KotlinType type;
        Intrinsics.checkNotNullParameter(kType, "<this>");
        KTypeImpl kTypeImpl = kType instanceof KTypeImpl ? (KTypeImpl) kType : null;
        return (kTypeImpl == null || (type = kTypeImpl.getType()) == null || !InlineClassesUtilsKt.needsMfvcFlattening(type)) ? false : true;
    }

    public static final boolean isInlineClassType(@NotNull KType kType) {
        KotlinType type;
        Intrinsics.checkNotNullParameter(kType, "<this>");
        KTypeImpl kTypeImpl = kType instanceof KTypeImpl ? (KTypeImpl) kType : null;
        return (kTypeImpl == null || (type = kTypeImpl.getType()) == null || !InlineClassesUtilsKt.isInlineClassType(type)) ? false : true;
    }

    private static final Class<?> loadClass(ClassLoader classLoader, ClassId classId, int i10) {
        ClassId classIdMapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(classId.asSingleFqName().toUnsafe());
        if (classIdMapKotlinToJava != null) {
            classId = classIdMapKotlinToJava;
        }
        return loadClass(classLoader, classId.getPackageFqName().asString(), classId.getRelativeClassName().asString(), i10);
    }

    static /* synthetic */ Class loadClass$default(ClassLoader classLoader, ClassId classId, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return loadClass(classLoader, classId, i10);
    }

    private static final Annotation toAnnotationInstance(AnnotationDescriptor annotationDescriptor) {
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        Class<?> javaClass = annotationClass != null ? toJavaClass(annotationClass) : null;
        if (!s.a(javaClass)) {
            javaClass = null;
        }
        if (javaClass == null) {
            return null;
        }
        Set<Map.Entry<Name, ConstantValue<?>>> setEntrySet = annotationDescriptor.getAllValueArguments().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Name name = (Name) entry.getKey();
            ConstantValue constantValue = (ConstantValue) entry.getValue();
            ClassLoader classLoader = javaClass.getClassLoader();
            Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
            Object runtimeValue = toRuntimeValue(constantValue, classLoader);
            Pair pair = runtimeValue != null ? TuplesKt.to(name.asString(), runtimeValue) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return (Annotation) AnnotationConstructorCallerKt.createAnnotationInstance$default(javaClass, MapsKt.toMap(arrayList), null, 4, null);
    }

    @Nullable
    public static final Class<?> toJavaClass(@NotNull ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "<this>");
        SourceElement source = classDescriptor.getSource();
        Intrinsics.checkNotNullExpressionValue(source, "getSource(...)");
        if (source instanceof KotlinJvmBinarySourceElement) {
            KotlinJvmBinaryClass binaryClass = ((KotlinJvmBinarySourceElement) source).getBinaryClass();
            Intrinsics.checkNotNull(binaryClass, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((ReflectKotlinClass) binaryClass).getKlass();
        }
        if (source instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
            ReflectJavaElement javaElement = ((RuntimeSourceElementFactory.RuntimeSourceElement) source).getJavaElement();
            Intrinsics.checkNotNull(javaElement, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((ReflectJavaClass) javaElement).getElement();
        }
        ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
        if (classId == null) {
            return null;
        }
        return loadClass(ReflectClassUtilKt.getSafeClassLoader(classDescriptor.getClass()), classId, 0);
    }

    @Nullable
    public static final KVisibility toKVisibility(@NotNull DescriptorVisibility descriptorVisibility) {
        Intrinsics.checkNotNullParameter(descriptorVisibility, "<this>");
        if (Intrinsics.areEqual(descriptorVisibility, DescriptorVisibilities.PUBLIC)) {
            return KVisibility.PUBLIC;
        }
        if (Intrinsics.areEqual(descriptorVisibility, DescriptorVisibilities.PROTECTED)) {
            return KVisibility.PROTECTED;
        }
        if (Intrinsics.areEqual(descriptorVisibility, DescriptorVisibilities.INTERNAL)) {
            return KVisibility.INTERNAL;
        }
        if (Intrinsics.areEqual(descriptorVisibility, DescriptorVisibilities.PRIVATE) || Intrinsics.areEqual(descriptorVisibility, DescriptorVisibilities.PRIVATE_TO_THIS)) {
            return KVisibility.PRIVATE;
        }
        return null;
    }

    private static final Object toRuntimeValue(ConstantValue<?> constantValue, ClassLoader classLoader) {
        if (constantValue instanceof AnnotationValue) {
            return toAnnotationInstance(((AnnotationValue) constantValue).getValue());
        }
        if (constantValue instanceof ArrayValue) {
            return arrayToRuntimeValue((ArrayValue) constantValue, classLoader);
        }
        if (constantValue instanceof EnumValue) {
            Pair<? extends ClassId, ? extends Name> value = ((EnumValue) constantValue).getValue();
            ClassId classIdComponent1 = value.component1();
            Name nameComponent2 = value.component2();
            Class clsLoadClass$default = loadClass$default(classLoader, classIdComponent1, 0, 4, null);
            if (clsLoadClass$default != null) {
                return Util.getEnumConstantByName(clsLoadClass$default, nameComponent2.asString());
            }
            return null;
        }
        if (!(constantValue instanceof KClassValue)) {
            if ((constantValue instanceof ErrorValue) || (constantValue instanceof NullValue)) {
                return null;
            }
            return constantValue.getValue();
        }
        KClassValue.Value value2 = ((KClassValue) constantValue).getValue();
        if (value2 instanceof KClassValue.Value.NormalClass) {
            KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) value2;
            return loadClass(classLoader, normalClass.getClassId(), normalClass.getArrayDimensions());
        }
        if (!(value2 instanceof KClassValue.Value.LocalClass)) {
            throw new m();
        }
        ClassifierDescriptor classifierDescriptorMo8663getDeclarationDescriptor = ((KClassValue.Value.LocalClass) value2).getType().getConstructor().mo8663getDeclarationDescriptor();
        ClassDescriptor classDescriptor = classifierDescriptorMo8663getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo8663getDeclarationDescriptor : null;
        if (classDescriptor != null) {
            return toJavaClass(classDescriptor);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List<? extends java.lang.annotation.Annotation>, java.util.List<java.lang.annotation.Annotation>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List<java.lang.annotation.Annotation>] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList, java.util.Collection] */
    private static final List<Annotation> unwrapRepeatableAnnotations(List<? extends Annotation> list) throws IllegalAccessException, InvocationTargetException {
        List listListOf;
        Iterable<Annotation> iterable = (Iterable) list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return list;
        }
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (Intrinsics.areEqual(xf.a.b(xf.a.a((Annotation) it.next())).getSimpleName(), "Container")) {
                list = new ArrayList<>();
                for (Annotation annotation : iterable) {
                    Class clsB = xf.a.b(xf.a.a(annotation));
                    if (!Intrinsics.areEqual(clsB.getSimpleName(), "Container") || clsB.getAnnotation(x0.class) == null) {
                        listListOf = CollectionsKt.listOf(annotation);
                    } else {
                        Object objInvoke = clsB.getDeclaredMethod("value", null).invoke(annotation, null);
                        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                        listListOf = ArraysKt.asList((Annotation[]) objInvoke);
                    }
                    CollectionsKt.addAll((Collection) list, listListOf);
                }
            }
        }
        return list;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final Class<?> loadClass(ClassLoader classLoader, String str, String str2, int i10) {
        if (Intrinsics.areEqual(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (i10 > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(C4240b4.j.f42672d);
            }
            sb2.append("L");
        }
        if (str.length() > 0) {
            sb2.append(str + '.');
        }
        sb2.append(StringsKt.V(str2, '.', '$', false, 4, null));
        if (i10 > 0) {
            sb2.append(";");
        }
        return ReflectJavaClassFinderKt.tryLoadClass(classLoader, sb2.toString());
    }
}
