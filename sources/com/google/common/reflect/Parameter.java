package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
public final class Parameter implements AnnotatedElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Invokable f31168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TypeToken f31170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ImmutableList f31171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f31172e;

    Parameter(Invokable invokable, int i10, TypeToken typeToken, Annotation[] annotationArr, Object obj) {
        this.f31168a = invokable;
        this.f31169b = i10;
        this.f31170c = typeToken;
        this.f31171d = ImmutableList.copyOf(annotationArr);
        this.f31172e = obj;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Parameter) {
            Parameter parameter = (Parameter) obj;
            if (this.f31169b == parameter.f31169b && this.f31168a.equals(parameter.f31168a)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        Preconditions.checkNotNull(cls);
        UnmodifiableIterator it = this.f31171d.iterator();
        while (it.hasNext()) {
            Annotation annotation = (Annotation) it.next();
            if (cls.isInstance(annotation)) {
                return cls.cast(annotation);
            }
        }
        return null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getAnnotations() {
        return getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A[] getAnnotationsByType(Class<A> cls) {
        return (A[]) getDeclaredAnnotationsByType(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A getDeclaredAnnotation(Class<A> cls) {
        Preconditions.checkNotNull(cls);
        return (A) FluentIterable.from(this.f31171d).filter(cls).first().orNull();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getDeclaredAnnotations() {
        return (Annotation[]) this.f31171d.toArray(new Annotation[0]);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A[] getDeclaredAnnotationsByType(Class<A> cls) {
        return (A[]) ((Annotation[]) FluentIterable.from(this.f31171d).filter(cls).toArray(cls));
    }

    public Invokable<?, ?> getDeclaringInvokable() {
        return this.f31168a;
    }

    public TypeToken<?> getType() {
        return this.f31170c;
    }

    public int hashCode() {
        return this.f31169b;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return getAnnotation(cls) != null;
    }

    public String toString() {
        return this.f31170c + " arg" + this.f31169b;
    }
}
