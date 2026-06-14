package androidx.test.internal.platform.reflect;

import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ReflectiveField<T> {
    private final String className;
    private final Class<?> clazz;
    private Field field;
    private final String fieldName;
    private boolean initialized;

    public ReflectiveField(String str, String str2) {
        this.initialized = false;
        this.clazz = null;
        this.className = str;
        this.fieldName = str2;
    }

    private Class<?> getClazz() throws ClassNotFoundException {
        Class<?> cls = this.clazz;
        return cls == null ? Class.forName(this.className) : cls;
    }

    private synchronized void initIfNecessary() throws NoSuchFieldException, ClassNotFoundException {
        if (this.initialized) {
            return;
        }
        Field declaredField = getClazz().getDeclaredField(this.fieldName);
        this.field = declaredField;
        declaredField.setAccessible(true);
        this.initialized = true;
    }

    public T get(Object obj) throws ReflectionException {
        try {
            initIfNecessary();
            return (T) this.field.get(obj);
        } catch (ClassNotFoundException e10) {
            throw new ReflectionException(e10);
        } catch (IllegalAccessException e11) {
            throw new ReflectionException(e11);
        } catch (NoSuchFieldException e12) {
            throw new ReflectionException(e12);
        }
    }

    public ReflectiveField(Class<?> cls, String str) {
        this.initialized = false;
        this.clazz = cls;
        this.className = null;
        this.fieldName = str;
    }
}
