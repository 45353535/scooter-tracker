package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* JADX INFO: loaded from: classes3.dex */
public class n0 extends m0 {
    public n0(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(o.NO_RECEIVER, ((q) kDeclarationContainer).getJClass(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public n0(Class cls, String str, String str2, int i10) {
        super(o.NO_RECEIVER, cls, str, str2, i10);
    }
}
