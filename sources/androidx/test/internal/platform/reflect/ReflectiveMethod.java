package androidx.test.internal.platform.reflect;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ReflectiveMethod<T> {
    private final String className;
    private final Class<?> clazz;
    private boolean initialized;
    private Method method;
    private final String methodName;
    private final Class<?>[] paramTypes;

    public ReflectiveMethod(String str, String str2, Class<?>... clsArr) {
        this.initialized = false;
        this.className = str;
        this.clazz = null;
        this.paramTypes = clsArr;
        this.methodName = str2;
    }

    @NonNull
    private Class<?> getClazz() throws ClassNotFoundException {
        Class<?> cls = this.clazz;
        return cls == null ? Class.forName(this.className) : cls;
    }

    private synchronized void initIfNecessary() throws NoSuchMethodException, ClassNotFoundException {
        if (this.initialized) {
            return;
        }
        Method declaredMethod = getClazz().getDeclaredMethod(this.methodName, this.paramTypes);
        this.method = declaredMethod;
        declaredMethod.setAccessible(true);
        this.initialized = true;
    }

    public T invoke(Object obj, Object... objArr) throws ReflectionException {
        try {
            initIfNecessary();
            return (T) this.method.invoke(obj, objArr);
        } catch (ClassNotFoundException e10) {
            throw new ReflectionException(e10);
        } catch (IllegalAccessException e11) {
            throw new ReflectionException(e11);
        } catch (NoSuchMethodException e12) {
            throw new ReflectionException(e12);
        } catch (InvocationTargetException e13) {
            throw new ReflectionException(e13);
        }
    }

    public T invokeStatic(Object... objArr) throws ReflectionException {
        return invoke(null, objArr);
    }

    public ReflectiveMethod(Class<?> cls, String str, Class<?>... clsArr) {
        this.initialized = false;
        this.className = null;
        this.clazz = cls;
        this.paramTypes = clsArr;
        this.methodName = str;
    }
}
