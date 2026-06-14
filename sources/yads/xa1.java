package yads;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class xa1 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xa1 f117762b = new xa1();

    public xa1() {
        super(1);
    }

    public static String a(fa1 fa1Var) {
        return "\t·\t" + fa1Var.getMessage();
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a((fa1) obj);
    }
}
