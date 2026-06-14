package yg;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile SoftReference f119035a = new SoftReference(null);

    public final synchronized Object a(Function0 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object obj = this.f119035a.get();
        if (obj != null) {
            return obj;
        }
        Object objInvoke = factory.invoke();
        this.f119035a = new SoftReference(objInvoke);
        return objInvoke;
    }
}
