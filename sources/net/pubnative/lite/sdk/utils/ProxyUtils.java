package net.pubnative.lite.sdk.utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes3.dex */
public class ProxyUtils {

    @FunctionalInterface
    public interface ProxyMethodHandler {
        Object handleMethod(Object obj, Method method, Object[] objArr);
    }

    public static /* synthetic */ Object a(Class cls, ProxyMethodHandler proxyMethodHandler, Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        name.getClass();
        switch (name) {
            case "toString":
                return "Proxy for " + cls.getName();
            case "equals":
                return Boolean.valueOf(obj == objArr[0]);
            case "hashCode":
                return Integer.valueOf(System.identityHashCode(obj));
            default:
                return proxyMethodHandler.handleMethod(obj, method, objArr);
        }
    }

    public static Object createProxy(ClassLoader classLoader, final Class<?> cls, final ProxyMethodHandler proxyMethodHandler) {
        return Proxy.newProxyInstance(classLoader, new Class[]{cls}, new InvocationHandler() { // from class: net.pubnative.lite.sdk.utils.g
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                return ProxyUtils.a(cls, proxyMethodHandler, obj, method, objArr);
            }
        });
    }
}
