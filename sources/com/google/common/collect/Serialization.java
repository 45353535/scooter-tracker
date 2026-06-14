package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.Multiset;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class Serialization {

    static final class FieldSetter<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Field f30183a;

        void a(Object obj, int i10) {
            try {
                this.f30183a.set(obj, Integer.valueOf(i10));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        void b(Object obj, Object obj2) {
            try {
                this.f30183a.set(obj, obj2);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        private FieldSetter(Field field) {
            this.f30183a = field;
            field.setAccessible(true);
        }
    }

    static FieldSetter a(Class cls, String str) {
        try {
            return new FieldSetter(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e10) {
            throw new AssertionError(e10);
        }
    }

    static void b(Map map, ObjectInputStream objectInputStream) {
        c(map, objectInputStream, objectInputStream.readInt());
    }

    static void c(Map map, ObjectInputStream objectInputStream, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    static void d(Multimap multimap, ObjectInputStream objectInputStream) throws IOException {
        e(multimap, objectInputStream, objectInputStream.readInt());
    }

    static void e(Multimap multimap, ObjectInputStream objectInputStream, int i10) throws IOException {
        for (int i11 = 0; i11 < i10; i11++) {
            Collection collection = multimap.get(objectInputStream.readObject());
            int i12 = objectInputStream.readInt();
            for (int i13 = 0; i13 < i12; i13++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    static void f(Multiset multiset, ObjectInputStream objectInputStream) {
        g(multiset, objectInputStream, objectInputStream.readInt());
    }

    static void g(Multiset multiset, ObjectInputStream objectInputStream, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            multiset.add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    static int h(ObjectInputStream objectInputStream) {
        return objectInputStream.readInt();
    }

    static void i(Map map, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    static void j(Multimap multimap, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(multimap.asMap().size());
        for (Map.Entry entry : multimap.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    static void k(Multiset multiset, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(multiset.entrySet().size());
        for (Multiset.Entry entry : multiset.entrySet()) {
            objectOutputStream.writeObject(entry.getElement());
            objectOutputStream.writeInt(entry.getCount());
        }
    }
}
