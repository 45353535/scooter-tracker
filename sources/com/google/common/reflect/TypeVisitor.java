package com.google.common.reflect;

import com.google.common.collect.Sets;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
abstract class TypeVisitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f31211a = Sets.newHashSet();

    TypeVisitor() {
    }

    void a(Class cls) {
    }

    void b(GenericArrayType genericArrayType) {
    }

    void c(ParameterizedType parameterizedType) {
    }

    void d(TypeVariable typeVariable) {
    }

    void e(WildcardType wildcardType) {
    }

    public final void visit(Type... typeArr) {
        for (Type type : typeArr) {
            if (type != null && this.f31211a.add(type)) {
                try {
                    if (type instanceof TypeVariable) {
                        d((TypeVariable) type);
                    } else if (type instanceof WildcardType) {
                        e((WildcardType) type);
                    } else if (type instanceof ParameterizedType) {
                        c((ParameterizedType) type);
                    } else if (type instanceof Class) {
                        a((Class) type);
                    } else {
                        if (!(type instanceof GenericArrayType)) {
                            throw new AssertionError("Unknown type: " + type);
                        }
                        b((GenericArrayType) type);
                    }
                } catch (Throwable th2) {
                    this.f31211a.remove(type);
                    throw th2;
                }
            }
        }
    }
}
