package hf;

import kotlin.jvm.internal.Intrinsics;
import pg.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static final boolean a(s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        return sVar.exhausted();
    }
}
