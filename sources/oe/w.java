package oe;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ze.a f96942a;

    static {
        KType kTypeO;
        KClass kClassB = kotlin.jvm.internal.v0.b(ze.b.class);
        try {
            kTypeO = kotlin.jvm.internal.v0.o(ze.b.class);
        } catch (Throwable unused) {
            kTypeO = null;
        }
        f96942a = new ze.a("ApplicationPluginRegistry", new ff.a(kClassB, kTypeO));
    }

    public static final ze.a a() {
        return f96942a;
    }

    public static final Object b(ie.c cVar, v plugin) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        Object objC = c(cVar, plugin);
        if (objC != null) {
            return objC;
        }
        throw new IllegalStateException("Plugin " + plugin + " is not installed. Consider using `install(" + plugin.getKey() + ")` in client config first.");
    }

    public static final Object c(ie.c cVar, v plugin) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        ze.b bVar = (ze.b) cVar.getAttributes().a(f96942a);
        if (bVar != null) {
            return bVar.a(plugin.getKey());
        }
        return null;
    }
}
