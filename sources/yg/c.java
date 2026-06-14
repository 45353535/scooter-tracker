package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final Void a(String str, KClass baseClass) {
        String str2;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String str3 = "in the polymorphic scope of '" + baseClass.getSimpleName() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.getSimpleName() + "' has to be sealed and '@Serializable'.";
        }
        throw new ug.m(str2);
    }

    public static final Void b(KClass subClass, KClass baseClass) {
        Intrinsics.checkNotNullParameter(subClass, "subClass");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String simpleName = subClass.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(subClass);
        }
        a(simpleName, baseClass);
        throw new lf.g();
    }
}
