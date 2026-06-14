package yads;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sg0 {
    public static k8.rb a(k8.f7 f7Var, String str) {
        List<k8.rb> extensions = f7Var.getExtensions();
        if (extensions == null) {
            return null;
        }
        for (k8.rb rbVar : extensions) {
            if (Intrinsics.areEqual(str, rbVar.f90670a)) {
                return rbVar;
            }
        }
        return null;
    }
}
