package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import xf.a;

/* JADX INFO: loaded from: classes3.dex */
final class ReflectClassStructure {

    @NotNull
    public static final ReflectClassStructure INSTANCE = new ReflectClassStructure();

    private ReflectClassStructure() {
    }

    private final ClassLiteralValue classLiteralValue(Class<?> cls) {
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
        }
        if (cls.isPrimitive()) {
            if (Intrinsics.areEqual(cls, Void.TYPE)) {
                return new ClassLiteralValue(ClassId.Companion.topLevel(StandardNames.FqNames.unit.toSafe()), i10);
            }
            PrimitiveType primitiveType = JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
            Intrinsics.checkNotNullExpressionValue(primitiveType, "getPrimitiveType(...)");
            return i10 > 0 ? new ClassLiteralValue(ClassId.Companion.topLevel(primitiveType.getArrayTypeFqName()), i10 - 1) : new ClassLiteralValue(ClassId.Companion.topLevel(primitiveType.getTypeFqName()), i10);
        }
        ClassId classId = ReflectClassUtilKt.getClassId(cls);
        ClassId classIdMapJavaToKotlin = JavaToKotlinClassMap.INSTANCE.mapJavaToKotlin(classId.asSingleFqName());
        if (classIdMapJavaToKotlin != null) {
            classId = classIdMapJavaToKotlin;
        }
        return new ClassLiteralValue(classId, i10);
    }

    private final void loadConstructorAnnotations(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) throws InvocationTargetException {
        Iterator itA = i.a(cls.getDeclaredConstructors());
        while (itA.hasNext()) {
            Constructor<?> constructor = (Constructor) itA.next();
            Name name = SpecialNames.INIT;
            SignatureSerializer signatureSerializer = SignatureSerializer.INSTANCE;
            Intrinsics.checkNotNull(constructor);
            KotlinJvmBinaryClass.MethodAnnotationVisitor methodAnnotationVisitorVisitMethod = memberVisitor.visitMethod(name, signatureSerializer.constructorDesc(constructor));
            if (methodAnnotationVisitorVisitMethod != null) {
                Iterator itA2 = i.a(constructor.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    Intrinsics.checkNotNull(annotation);
                    processAnnotation(methodAnnotationVisitorVisitMethod, annotation);
                }
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                Intrinsics.checkNotNull(parameterAnnotations);
                if (!(parameterAnnotations.length == 0)) {
                    int length = constructor.getParameterTypes().length - parameterAnnotations.length;
                    int length2 = parameterAnnotations.length;
                    for (int i10 = 0; i10 < length2; i10++) {
                        Iterator itA3 = i.a(parameterAnnotations[i10]);
                        while (itA3.hasNext()) {
                            Annotation annotation2 = (Annotation) itA3.next();
                            Class<?> clsB = a.b(a.a(annotation2));
                            ClassId classId = ReflectClassUtilKt.getClassId(clsB);
                            Intrinsics.checkNotNull(annotation2);
                            KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitParameterAnnotation = methodAnnotationVisitorVisitMethod.visitParameterAnnotation(i10 + length, classId, new ReflectAnnotationSource(annotation2));
                            if (annotationArgumentVisitorVisitParameterAnnotation != null) {
                                INSTANCE.processAnnotationArguments(annotationArgumentVisitorVisitParameterAnnotation, annotation2, clsB);
                            }
                        }
                    }
                }
                methodAnnotationVisitorVisitMethod.visitEnd();
            }
        }
    }

    private final void loadFieldAnnotations(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) throws InvocationTargetException {
        Iterator itA = i.a(cls.getDeclaredFields());
        while (itA.hasNext()) {
            Field field = (Field) itA.next();
            Name nameIdentifier = Name.identifier(field.getName());
            Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
            SignatureSerializer signatureSerializer = SignatureSerializer.INSTANCE;
            Intrinsics.checkNotNull(field);
            KotlinJvmBinaryClass.AnnotationVisitor annotationVisitorVisitField = memberVisitor.visitField(nameIdentifier, signatureSerializer.fieldDesc(field), null);
            if (annotationVisitorVisitField != null) {
                Iterator itA2 = i.a(field.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    Intrinsics.checkNotNull(annotation);
                    processAnnotation(annotationVisitorVisitField, annotation);
                }
                annotationVisitorVisitField.visitEnd();
            }
        }
    }

    private final void loadMethodAnnotations(Class<?> cls, KotlinJvmBinaryClass.MemberVisitor memberVisitor) throws InvocationTargetException {
        Iterator itA = i.a(cls.getDeclaredMethods());
        while (itA.hasNext()) {
            Method method = (Method) itA.next();
            Name nameIdentifier = Name.identifier(method.getName());
            Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
            SignatureSerializer signatureSerializer = SignatureSerializer.INSTANCE;
            Intrinsics.checkNotNull(method);
            KotlinJvmBinaryClass.MethodAnnotationVisitor methodAnnotationVisitorVisitMethod = memberVisitor.visitMethod(nameIdentifier, signatureSerializer.methodDesc(method));
            if (methodAnnotationVisitorVisitMethod != null) {
                Iterator itA2 = i.a(method.getDeclaredAnnotations());
                while (itA2.hasNext()) {
                    Annotation annotation = (Annotation) itA2.next();
                    Intrinsics.checkNotNull(annotation);
                    processAnnotation(methodAnnotationVisitorVisitMethod, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "getParameterAnnotations(...)");
                Annotation[][] annotationArr = parameterAnnotations;
                int length = annotationArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    Iterator itA3 = i.a(annotationArr[i10]);
                    while (itA3.hasNext()) {
                        Annotation annotation2 = (Annotation) itA3.next();
                        Class<?> clsB = a.b(a.a(annotation2));
                        ClassId classId = ReflectClassUtilKt.getClassId(clsB);
                        Intrinsics.checkNotNull(annotation2);
                        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitParameterAnnotation = methodAnnotationVisitorVisitMethod.visitParameterAnnotation(i10, classId, new ReflectAnnotationSource(annotation2));
                        if (annotationArgumentVisitorVisitParameterAnnotation != null) {
                            INSTANCE.processAnnotationArguments(annotationArgumentVisitorVisitParameterAnnotation, annotation2, clsB);
                        }
                    }
                }
                methodAnnotationVisitorVisitMethod.visitEnd();
            }
        }
    }

    private final void processAnnotation(KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor, Annotation annotation) throws InvocationTargetException {
        Class<?> clsB = a.b(a.a(annotation));
        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitAnnotation = annotationVisitor.visitAnnotation(ReflectClassUtilKt.getClassId(clsB), new ReflectAnnotationSource(annotation));
        if (annotationArgumentVisitorVisitAnnotation != null) {
            INSTANCE.processAnnotationArguments(annotationArgumentVisitorVisitAnnotation, annotation, clsB);
        }
    }

    private final void processAnnotationArgumentValue(KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, Name name, Object obj) throws InvocationTargetException {
        Class<?> enclosingClass = obj.getClass();
        if (Intrinsics.areEqual(enclosingClass, Class.class)) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            annotationArgumentVisitor.visitClassLiteral(name, classLiteralValue((Class) obj));
            return;
        }
        if (ReflectKotlinClassKt.TYPES_ELIGIBLE_FOR_SIMPLE_VISIT.contains(enclosingClass)) {
            annotationArgumentVisitor.visit(name, obj);
            return;
        }
        if (ReflectClassUtilKt.isEnumClassOrSpecializedEnumEntryClass(enclosingClass)) {
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            Intrinsics.checkNotNull(enclosingClass);
            ClassId classId = ReflectClassUtilKt.getClassId(enclosingClass);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
            Name nameIdentifier = Name.identifier(((Enum) obj).name());
            Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
            annotationArgumentVisitor.visitEnum(name, classId, nameIdentifier);
            return;
        }
        if (Annotation.class.isAssignableFrom(enclosingClass)) {
            Class<?>[] interfaces = enclosingClass.getInterfaces();
            Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
            Class<?> cls = (Class) ArraysKt.single(interfaces);
            Intrinsics.checkNotNull(cls);
            KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitAnnotation = annotationArgumentVisitor.visitAnnotation(name, ReflectClassUtilKt.getClassId(cls));
            if (annotationArgumentVisitorVisitAnnotation == null) {
                return;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Annotation");
            processAnnotationArguments(annotationArgumentVisitorVisitAnnotation, (Annotation) obj, cls);
            return;
        }
        if (!enclosingClass.isArray()) {
            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + obj);
        }
        KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor annotationArrayArgumentVisitorVisitArray = annotationArgumentVisitor.visitArray(name);
        if (annotationArrayArgumentVisitorVisitArray == null) {
            return;
        }
        Class<?> componentType = enclosingClass.getComponentType();
        int i10 = 0;
        if (componentType.isEnum()) {
            Intrinsics.checkNotNull(componentType);
            ClassId classId2 = ReflectClassUtilKt.getClassId(componentType);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i10 < length) {
                Object obj2 = objArr[i10];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                Name nameIdentifier2 = Name.identifier(((Enum) obj2).name());
                Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
                annotationArrayArgumentVisitorVisitArray.visitEnum(classId2, nameIdentifier2);
                i10++;
            }
        } else if (Intrinsics.areEqual(componentType, Class.class)) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr2 = (Object[]) obj;
            int length2 = objArr2.length;
            while (i10 < length2) {
                Object obj3 = objArr2[i10];
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                annotationArrayArgumentVisitorVisitArray.visitClassLiteral(classLiteralValue((Class) obj3));
                i10++;
            }
        } else if (Annotation.class.isAssignableFrom(componentType)) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr3 = (Object[]) obj;
            int length3 = objArr3.length;
            while (i10 < length3) {
                Object obj4 = objArr3[i10];
                Intrinsics.checkNotNull(componentType);
                KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitAnnotation2 = annotationArrayArgumentVisitorVisitArray.visitAnnotation(ReflectClassUtilKt.getClassId(componentType));
                if (annotationArgumentVisitorVisitAnnotation2 != null) {
                    Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                    processAnnotationArguments(annotationArgumentVisitorVisitAnnotation2, (Annotation) obj4, componentType);
                }
                i10++;
            }
        } else {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr4 = (Object[]) obj;
            int length4 = objArr4.length;
            while (i10 < length4) {
                annotationArrayArgumentVisitorVisitArray.visit(objArr4[i10]);
                i10++;
            }
        }
        annotationArrayArgumentVisitorVisitArray.visitEnd();
    }

    private final void processAnnotationArguments(KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, Annotation annotation, Class<?> cls) throws InvocationTargetException {
        Iterator itA = i.a(cls.getDeclaredMethods());
        while (itA.hasNext()) {
            Method method = (Method) itA.next();
            try {
                Object objInvoke = method.invoke(annotation, null);
                Intrinsics.checkNotNull(objInvoke);
                Name nameIdentifier = Name.identifier(method.getName());
                Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
                processAnnotationArgumentValue(annotationArgumentVisitor, nameIdentifier, objInvoke);
            } catch (IllegalAccessException unused) {
            }
        }
        annotationArgumentVisitor.visitEnd();
    }

    public final void loadClassAnnotations(@NotNull Class<?> klass, @NotNull KotlinJvmBinaryClass.AnnotationVisitor visitor) throws InvocationTargetException {
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        Iterator itA = i.a(klass.getDeclaredAnnotations());
        while (itA.hasNext()) {
            Annotation annotation = (Annotation) itA.next();
            Intrinsics.checkNotNull(annotation);
            processAnnotation(visitor, annotation);
        }
        visitor.visitEnd();
    }

    public final void visitMembers(@NotNull Class<?> klass, @NotNull KotlinJvmBinaryClass.MemberVisitor memberVisitor) throws InvocationTargetException {
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(memberVisitor, "memberVisitor");
        loadMethodAnnotations(klass, memberVisitor);
        loadConstructorAnnotations(klass, memberVisitor);
        loadFieldAnnotations(klass, memberVisitor);
    }
}
