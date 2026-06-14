package yads;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f113321a = "yandex_ad_info";

    public static String a(rb3 rb3Var) {
        Object next;
        Iterator it = rb3Var.f115396a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((so0) next).f115886a, f113321a)) {
                break;
            }
        }
        so0 so0Var = (so0) next;
        if (so0Var != null) {
            return so0Var.f115887b;
        }
        return null;
    }
}
