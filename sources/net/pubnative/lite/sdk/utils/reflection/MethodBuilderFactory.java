package net.pubnative.lite.sdk.utils.reflection;

import net.pubnative.lite.sdk.utils.reflection.ReflectionUtils;

/* JADX INFO: loaded from: classes3.dex */
public class MethodBuilderFactory {
    protected static MethodBuilderFactory instance = new MethodBuilderFactory();

    public static ReflectionUtils.MethodBuilder create(Object obj, String str) {
        return instance.internalCreate(obj, str);
    }

    @Deprecated
    public static void setInstance(MethodBuilderFactory methodBuilderFactory) {
        instance = methodBuilderFactory;
    }

    protected ReflectionUtils.MethodBuilder internalCreate(Object obj, String str) {
        return new ReflectionUtils.MethodBuilder(obj, str);
    }
}
