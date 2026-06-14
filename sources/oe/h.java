package oe;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oe.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final yh.d f96779a = df.a.a("io.ktor.client.plugins.DefaultRequest");

    public static final void c(ie.i iVar, final Function1 block) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        iVar.m(f.f96760b, new Function1() { // from class: oe.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.d(block, (f.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function1 function1, f.a install) {
        Intrinsics.checkNotNullParameter(install, "$this$install");
        function1.invoke(install);
        return Unit.f93236a;
    }
}
