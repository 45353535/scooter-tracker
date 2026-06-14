package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z0;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.Sequence;
import kotlin.sequences.k;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class ReflectJavaClass extends ReflectJavaElement implements ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner, JavaClass {

    @NotNull
    private final Class<?> klass;

    public ReflectJavaClass(@NotNull Class<?> klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.klass = klass;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_innerClassNames_$lambda$0(Class cls) {
        String simpleName = cls.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName.length() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Name _get_innerClassNames_$lambda$2(Class cls) {
        String simpleName = cls.getSimpleName();
        if (!Name.isValidIdentifier(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return Name.identifier(simpleName);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_methods_$lambda$7(ReflectJavaClass reflectJavaClass, Method method) {
        if (method.isSynthetic()) {
            return false;
        }
        if (!reflectJavaClass.isEnum()) {
            return true;
        }
        Intrinsics.checkNotNull(method);
        return !reflectJavaClass.isEnumValuesOrValueOf(method);
    }

    private final boolean isEnumValuesOrValueOf(Method method) {
        String name = method.getName();
        if (Intrinsics.areEqual(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
            return parameterTypes.length == 0;
        }
        if (Intrinsics.areEqual(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ReflectJavaClass) && Intrinsics.areEqual(this.klass, ((ReflectJavaClass) obj).klass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ JavaAnnotation findAnnotation(FqName fqName) {
        return findAnnotation(fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    public FqName getFqName() {
        return ReflectClassUtilKt.getClassId(this.klass).asSingleFqName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @Nullable
    public LightClassOriginKind getLightClassOriginKind() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaModifierListOwner
    public int getModifiers() {
        return this.klass.getModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    @NotNull
    public Name getName() {
        if (!this.klass.isAnonymousClass()) {
            Name nameIdentifier = Name.identifier(this.klass.getSimpleName());
            Intrinsics.checkNotNull(nameIdentifier);
            return nameIdentifier;
        }
        String name = this.klass.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Name nameIdentifier2 = Name.identifier(StringsKt.l1(name, ".", null, 2, null));
        Intrinsics.checkNotNull(nameIdentifier2);
        return nameIdentifier2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    public Sequence<JavaClassifierType> getPermittedTypes() throws IllegalAccessException, InvocationTargetException {
        Class<?>[] clsArrLoadGetPermittedSubclasses = Java16SealedRecordLoader.INSTANCE.loadGetPermittedSubclasses(this.klass);
        if (clsArrLoadGetPermittedSubclasses != null) {
            ArrayList arrayList = new ArrayList(clsArrLoadGetPermittedSubclasses.length);
            for (Class<?> cls : clsArrLoadGetPermittedSubclasses) {
                arrayList.add(new ReflectJavaClassifierType(cls));
            }
            Sequence<JavaClassifierType> sequenceAsSequence = CollectionsKt.asSequence(arrayList);
            if (sequenceAsSequence != null) {
                return sequenceAsSequence;
            }
        }
        return k.j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    public Collection<JavaRecordComponent> getRecordComponents() {
        Object[] objArrLoadGetRecordComponents = Java16SealedRecordLoader.INSTANCE.loadGetRecordComponents(this.klass);
        if (objArrLoadGetRecordComponents == null) {
            objArrLoadGetRecordComponents = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArrLoadGetRecordComponents.length);
        for (Object obj : objArrLoadGetRecordComponents) {
            arrayList.add(new ReflectJavaRecordComponent(obj));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    public Collection<JavaClassifierType> getSupertypes() {
        Class cls;
        cls = Object.class;
        if (Intrinsics.areEqual(this.klass, cls)) {
            return CollectionsKt.emptyList();
        }
        z0 z0Var = new z0(2);
        Type genericSuperclass = this.klass.getGenericSuperclass();
        z0Var.a(genericSuperclass != null ? genericSuperclass : Object.class);
        z0Var.b(this.klass.getGenericInterfaces());
        List listListOf = CollectionsKt.listOf(z0Var.d(new Type[z0Var.c()]));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            arrayList.add(new ReflectJavaClassifierType((Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    @NotNull
    public List<ReflectJavaTypeParameter> getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.klass.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    @NotNull
    public Visibility getVisibility() {
        int modifiers = getModifiers();
        return Modifier.isPublic(modifiers) ? Visibilities.Public.INSTANCE : Modifier.isPrivate(modifiers) ? Visibilities.Private.INSTANCE : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? JavaVisibilities.ProtectedStaticVisibility.INSTANCE : JavaVisibilities.ProtectedAndPackage.INSTANCE : JavaVisibilities.PackageVisibility.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean hasDefaultConstructor() {
        return false;
    }

    public int hashCode() {
        return this.klass.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isAnnotationType() {
        return this.klass.isAnnotation();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isEnum() {
        return this.klass.isEnum();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isInterface() {
        return this.klass.isInterface();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isRecord() throws IllegalAccessException, InvocationTargetException {
        Boolean boolLoadIsRecord = Java16SealedRecordLoader.INSTANCE.loadIsRecord(this.klass);
        if (boolLoadIsRecord != null) {
            return boolLoadIsRecord.booleanValue();
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isSealed() throws IllegalAccessException, InvocationTargetException {
        Boolean boolLoadIsSealed = Java16SealedRecordLoader.INSTANCE.loadIsSealed(this.klass);
        if (boolLoadIsSealed != null) {
            return boolLoadIsSealed.booleanValue();
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isStatic() {
        return Modifier.isStatic(getModifiers());
    }

    @NotNull
    public String toString() {
        return ReflectJavaClass.class.getName() + ": " + this.klass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @Nullable
    public ReflectJavaAnnotation findAnnotation(FqName fqName) {
        Annotation[] declaredAnnotations;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        AnnotatedElement element = getElement();
        if (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null) {
            return null;
        }
        return ReflectJavaAnnotationOwnerKt.findAnnotation(declaredAnnotations, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public List<ReflectJavaAnnotation> getAnnotations() {
        Annotation[] declaredAnnotations;
        List<ReflectJavaAnnotation> annotations;
        AnnotatedElement element = getElement();
        return (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null || (annotations = ReflectJavaAnnotationOwnerKt.getAnnotations(declaredAnnotations)) == null) ? CollectionsKt.emptyList() : annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    public List<ReflectJavaConstructor> getConstructors() {
        Constructor<?>[] declaredConstructors = this.klass.getDeclaredConstructors();
        Intrinsics.checkNotNullExpressionValue(declaredConstructors, "getDeclaredConstructors(...)");
        return k.c0(k.Q(k.F(ArraysKt.asSequence(declaredConstructors), ReflectJavaClass$constructors$1.INSTANCE), ReflectJavaClass$constructors$2.INSTANCE));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner
    @NotNull
    public Class<?> getElement() {
        return this.klass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    public List<ReflectJavaField> getFields() {
        Field[] declaredFields = this.klass.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
        return k.c0(k.Q(k.F(ArraysKt.asSequence(declaredFields), ReflectJavaClass$fields$1.INSTANCE), ReflectJavaClass$fields$2.INSTANCE));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    public List<Name> getInnerClassNames() {
        Class<?>[] declaredClasses = this.klass.getDeclaredClasses();
        Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
        return k.c0(k.R(k.F(ArraysKt.asSequence(declaredClasses), new Function1() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$$Lambda$0
            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return Boolean.valueOf(ReflectJavaClass._get_innerClassNames_$lambda$0((Class) obj));
            }
        }), new Function1() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$$Lambda$1
            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return ReflectJavaClass._get_innerClassNames_$lambda$2((Class) obj);
            }
        }));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    public List<ReflectJavaMethod> getMethods() {
        Method[] declaredMethods = this.klass.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        return k.c0(k.Q(k.E(ArraysKt.asSequence(declaredMethods), new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$$Lambda$2
            private final ReflectJavaClass arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return Boolean.valueOf(ReflectJavaClass._get_methods_$lambda$7(this.arg$0, (Method) obj));
            }
        }), ReflectJavaClass$methods$2.INSTANCE));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @Nullable
    public ReflectJavaClass getOuterClass() {
        Class<?> declaringClass = this.klass.getDeclaringClass();
        if (declaringClass != null) {
            return new ReflectJavaClass(declaringClass);
        }
        return null;
    }
}
