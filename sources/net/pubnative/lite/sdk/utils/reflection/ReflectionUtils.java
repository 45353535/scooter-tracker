package net.pubnative.lite.sdk.utils.reflection;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import net.pubnative.lite.sdk.HyBid;

/* JADX INFO: loaded from: classes3.dex */
public class ReflectionUtils {
    public static Method getDeclaredMethodWithTraversal(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        while (cls != null) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException e10) {
                HyBid.reportException((Exception) e10);
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchMethodException();
    }

    public static class MethodBuilder {
        private Class<?> mClass;
        private final Object mInstance;
        private boolean mIsAccessible;
        private boolean mIsStatic;
        private final String mMethodName;
        private final List<Class<?>> mParameterClasses = new ArrayList();
        private final List<Object> mParameters = new ArrayList();

        public MethodBuilder(Object obj, String str) {
            this.mInstance = obj;
            this.mMethodName = str;
            this.mClass = obj != null ? obj.getClass() : null;
        }

        public <T> MethodBuilder addParam(Class<T> cls, T t10) {
            this.mParameterClasses.add(cls);
            this.mParameters.add(t10);
            return this;
        }

        public Object execute() throws NoSuchMethodException {
            Method declaredMethodWithTraversal = ReflectionUtils.getDeclaredMethodWithTraversal(this.mClass, this.mMethodName, (Class[]) this.mParameterClasses.toArray(new Class[this.mParameterClasses.size()]));
            if (this.mIsAccessible) {
                declaredMethodWithTraversal.setAccessible(true);
            }
            Object[] array = this.mParameters.toArray();
            return this.mIsStatic ? declaredMethodWithTraversal.invoke(null, array) : declaredMethodWithTraversal.invoke(this.mInstance, array);
        }

        public MethodBuilder setStatic(Class<?> cls) {
            this.mIsStatic = true;
            this.mClass = cls;
            return this;
        }

        public MethodBuilder setStatic(String str) {
            this.mIsStatic = true;
            this.mClass = Class.forName(str);
            return this;
        }
    }
}
