package com.explorestack.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class g0 extends com.explorestack.protobuf.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map f19021b = new ConcurrentHashMap();

    public static class a extends t {
    }

    public enum b {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static final class c implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f19030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f19031c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final byte[] f19032d;

        c(MessageLite messageLite) {
            Class<?> cls = messageLite.getClass();
            this.f19030b = cls;
            this.f19031c = cls.getName();
            this.f19032d = messageLite.toByteArray();
        }

        private Object d() {
            try {
                java.lang.reflect.Field declaredField = g().getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((MessageLite) declaredField.get(null)).newBuilderForType().mergeFrom(this.f19032d).buildPartial();
            } catch (InvalidProtocolBufferException e10) {
                throw new RuntimeException("Unable to understand proto buffer", e10);
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.f19031c, e11);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Unable to call parsePartialFrom", e12);
            } catch (NoSuchFieldException e13) {
                throw new RuntimeException("Unable to find defaultInstance in " + this.f19031c, e13);
            } catch (SecurityException e14) {
                throw new RuntimeException("Unable to call defaultInstance in " + this.f19031c, e14);
            }
        }

        private Class g() {
            Class cls = this.f19030b;
            return cls != null ? cls : Class.forName(this.f19031c);
        }

        protected Object readResolve() throws ObjectStreamException {
            try {
                java.lang.reflect.Field declaredField = g().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((MessageLite) declaredField.get(null)).newBuilderForType().mergeFrom(this.f19032d).buildPartial();
            } catch (InvalidProtocolBufferException e10) {
                throw new RuntimeException("Unable to understand proto buffer", e10);
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.f19031c, e11);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Unable to call parsePartialFrom", e12);
            } catch (NoSuchFieldException unused) {
                return d();
            } catch (SecurityException e13) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.f19031c, e13);
            }
        }
    }

    static g0 b(Class cls) {
        androidx.privacysandbox.ads.adservices.topics.a.a(f19021b.get(cls));
        try {
            Class.forName(cls.getName(), true, cls.getClassLoader());
            androidx.privacysandbox.ads.adservices.topics.a.a(f19021b.get(cls));
            androidx.privacysandbox.ads.adservices.topics.a.a(w2.l(cls));
            throw null;
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException("Class initialization cannot fail.", e10);
        }
    }
}
