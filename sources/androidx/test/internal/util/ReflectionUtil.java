package androidx.test.internal.util;

import android.util.Log;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@Deprecated
public class ReflectionUtil {
    private static final String TAG = "ReflectionUtil";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class ReflectionException extends Exception {
        ReflectionException(Exception exc) {
            super("Reflective call failed", exc);
        }
    }

    public static class ReflectionParams {
        final Class<?> type;
        final Object value;

        public ReflectionParams(Class<?> cls, Object obj) {
            this.type = cls;
            this.value = obj;
        }

        public static Class<?>[] getTypes(ReflectionParams[] reflectionParamsArr) {
            Class<?>[] clsArr = new Class[reflectionParamsArr.length];
            for (int i10 = 0; i10 < reflectionParamsArr.length; i10++) {
                clsArr[i10] = reflectionParamsArr[i10].type;
            }
            return clsArr;
        }

        public static Object[] getValues(ReflectionParams[] reflectionParamsArr) {
            Object[] objArr = new Object[reflectionParamsArr.length];
            for (int i10 = 0; i10 < reflectionParamsArr.length; i10++) {
                objArr[i10] = reflectionParamsArr[i10].value;
            }
            return objArr;
        }
    }

    public static Object callStaticMethod(String str, String str2, ReflectionParams... reflectionParamsArr) throws ReflectionException {
        try {
            return callStaticMethod(Class.forName(str), str2, reflectionParamsArr);
        } catch (ClassNotFoundException e10) {
            throw new ReflectionException(e10);
        }
    }

    public static Object callStaticMethod(Class<?> cls, String str, ReflectionParams... reflectionParamsArr) throws ReflectionException {
        Log.d(TAG, "Attempting to reflectively call: " + str);
        try {
            Class<?>[] types = ReflectionParams.getTypes(reflectionParamsArr);
            Object[] values = ReflectionParams.getValues(reflectionParamsArr);
            Method declaredMethod = cls.getDeclaredMethod(str, types);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, values);
        } catch (IllegalAccessException e10) {
            throw new ReflectionException(e10);
        } catch (NoSuchMethodException e11) {
            throw new ReflectionException(e11);
        } catch (InvocationTargetException e12) {
            throw new ReflectionException(e12);
        }
    }
}
