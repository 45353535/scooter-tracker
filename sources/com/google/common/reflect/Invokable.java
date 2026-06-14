package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
public abstract class Invokable<T, R> implements AnnotatedElement, Member {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f31160c = e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccessibleObject f31161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Member f31162b;

    static class ConstructorInvokable<T> extends Invokable<T, T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Constructor f31163d;

        ConstructorInvokable(Constructor constructor) {
            super(constructor);
            this.f31163d = constructor;
        }

        private boolean g() {
            Class<T> declaringClass = this.f31163d.getDeclaringClass();
            if (declaringClass.getEnclosingConstructor() != null) {
                return true;
            }
            return declaringClass.getEnclosingMethod() != null ? !Modifier.isStatic(r1.getModifiers()) : (declaringClass.getEnclosingClass() == null || Modifier.isStatic(declaringClass.getModifiers())) ? false : true;
        }

        @Override // com.google.common.reflect.Invokable
        Type[] a() {
            return this.f31163d.getGenericExceptionTypes();
        }

        @Override // com.google.common.reflect.Invokable
        Type[] b() {
            Type[] genericParameterTypes = this.f31163d.getGenericParameterTypes();
            if (genericParameterTypes.length <= 0 || !g()) {
                return genericParameterTypes;
            }
            Class<?>[] parameterTypes = this.f31163d.getParameterTypes();
            return (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) ? (Type[]) Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length) : genericParameterTypes;
        }

        @Override // com.google.common.reflect.Invokable
        Type c() {
            Class<? super T> declaringClass = getDeclaringClass();
            TypeVariable<Class<? super T>>[] typeParameters = declaringClass.getTypeParameters();
            return typeParameters.length > 0 ? Types.l(declaringClass, typeParameters) : declaringClass;
        }

        @Override // com.google.common.reflect.Invokable
        final Annotation[][] d() {
            return this.f31163d.getParameterAnnotations();
        }

        @Override // com.google.common.reflect.Invokable
        final Object f(Object obj, Object[] objArr) {
            try {
                return this.f31163d.newInstance(objArr);
            } catch (InstantiationException e10) {
                throw new RuntimeException(this.f31163d + " failed.", e10);
            }
        }

        @Override // com.google.common.reflect.Invokable
        public final TypeVariable<?>[] getTypeParameters() {
            TypeVariable<Class<? super T>>[] typeParameters = getDeclaringClass().getTypeParameters();
            TypeVariable<Constructor<T>>[] typeParameters2 = this.f31163d.getTypeParameters();
            TypeVariable<?>[] typeVariableArr = new TypeVariable[typeParameters.length + typeParameters2.length];
            System.arraycopy(typeParameters, 0, typeVariableArr, 0, typeParameters.length);
            System.arraycopy(typeParameters2, 0, typeVariableArr, typeParameters.length, typeParameters2.length);
            return typeVariableArr;
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isOverridable() {
            return false;
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isVarArgs() {
            return this.f31163d.isVarArgs();
        }
    }

    static class MethodInvokable<T> extends Invokable<T, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Method f31164d;

        MethodInvokable(Method method) {
            super(method);
            this.f31164d = method;
        }

        @Override // com.google.common.reflect.Invokable
        Type[] a() {
            return this.f31164d.getGenericExceptionTypes();
        }

        @Override // com.google.common.reflect.Invokable
        Type[] b() {
            return this.f31164d.getGenericParameterTypes();
        }

        @Override // com.google.common.reflect.Invokable
        Type c() {
            return this.f31164d.getGenericReturnType();
        }

        @Override // com.google.common.reflect.Invokable
        final Annotation[][] d() {
            return this.f31164d.getParameterAnnotations();
        }

        @Override // com.google.common.reflect.Invokable
        final Object f(Object obj, Object[] objArr) {
            return this.f31164d.invoke(obj, objArr);
        }

        @Override // com.google.common.reflect.Invokable
        public final TypeVariable<?>[] getTypeParameters() {
            return this.f31164d.getTypeParameters();
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isOverridable() {
            return (isFinal() || isPrivate() || isStatic() || Modifier.isFinal(getDeclaringClass().getModifiers())) ? false : true;
        }

        @Override // com.google.common.reflect.Invokable
        public final boolean isVarArgs() {
            return this.f31164d.isVarArgs();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    Invokable(AccessibleObject accessibleObject) {
        Preconditions.checkNotNull(accessibleObject);
        this.f31161a = accessibleObject;
        this.f31162b = (Member) accessibleObject;
    }

    private static boolean e() {
        try {
            Class.forName("java.lang.reflect.AnnotatedType");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Invokable<?, Object> from(Method method) {
        return new MethodInvokable(method);
    }

    abstract Type[] a();

    abstract Type[] b();

    abstract Type c();

    abstract Annotation[][] d();

    public boolean equals(Object obj) {
        if (obj instanceof Invokable) {
            Invokable invokable = (Invokable) obj;
            if (getOwnerType().equals(invokable.getOwnerType()) && this.f31162b.equals(invokable.f31162b)) {
                return true;
            }
        }
        return false;
    }

    abstract Object f(Object obj, Object[] objArr);

    @Override // java.lang.reflect.AnnotatedElement
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.f31161a.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
        return this.f31161a.getAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
        return this.f31161a.getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.Member
    public final Class<? super T> getDeclaringClass() {
        return (Class<? super T>) this.f31162b.getDeclaringClass();
    }

    public final ImmutableList<TypeToken<? extends Throwable>> getExceptionTypes() {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (Type type : a()) {
            builder.add(TypeToken.of(type));
        }
        return builder.build();
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.f31162b.getModifiers();
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        return this.f31162b.getName();
    }

    public TypeToken<T> getOwnerType() {
        return TypeToken.of((Class) getDeclaringClass());
    }

    @IgnoreJRERequirement
    public final ImmutableList<Parameter> getParameters() {
        Type[] typeArrB = b();
        Annotation[][] annotationArrD = d();
        Object[] objArr = new Object[typeArrB.length];
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i10 = 0; i10 < typeArrB.length; i10++) {
            builder.add(new Parameter(this, i10, TypeToken.of(typeArrB[i10]), annotationArrD[i10], objArr[i10]));
        }
        return builder.build();
    }

    public final TypeToken<? extends R> getReturnType() {
        return (TypeToken<? extends R>) TypeToken.of(c());
    }

    public abstract TypeVariable<?>[] getTypeParameters();

    public int hashCode() {
        return this.f31162b.hashCode();
    }

    @CanIgnoreReturnValue
    public final R invoke(T t10, Object... objArr) throws IllegalAccessException, InvocationTargetException {
        return (R) f(t10, (Object[]) Preconditions.checkNotNull(objArr));
    }

    public final boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    public final boolean isAccessible() {
        return this.f31161a.isAccessible();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.f31161a.isAnnotationPresent(cls);
    }

    public final boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    public final boolean isNative() {
        return Modifier.isNative(getModifiers());
    }

    public abstract boolean isOverridable();

    public final boolean isPackagePrivate() {
        return (isPrivate() || isPublic() || isProtected()) ? false : true;
    }

    public final boolean isPrivate() {
        return Modifier.isPrivate(getModifiers());
    }

    public final boolean isProtected() {
        return Modifier.isProtected(getModifiers());
    }

    public final boolean isPublic() {
        return Modifier.isPublic(getModifiers());
    }

    public final boolean isStatic() {
        return Modifier.isStatic(getModifiers());
    }

    public final boolean isSynchronized() {
        return Modifier.isSynchronized(getModifiers());
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.f31162b.isSynthetic();
    }

    public abstract boolean isVarArgs();

    public final <R1 extends R> Invokable<T, R1> returning(Class<R1> cls) {
        return returning(TypeToken.of((Class) cls));
    }

    public final void setAccessible(boolean z10) {
        this.f31161a.setAccessible(z10);
    }

    public String toString() {
        return this.f31162b.toString();
    }

    public final boolean trySetAccessible() {
        try {
            this.f31161a.setAccessible(true);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static <T> Invokable<T, T> from(Constructor<T> constructor) {
        return new ConstructorInvokable(constructor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R1 extends R> Invokable<T, R1> returning(TypeToken<R1> typeToken) {
        if (typeToken.isSupertypeOf(getReturnType())) {
            return this;
        }
        throw new IllegalArgumentException("Invokable is known to return " + getReturnType() + ", not " + typeToken);
    }
}
