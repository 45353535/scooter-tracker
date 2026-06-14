package hf;

import kotlin.jvm.internal.Intrinsics;
import pg.r;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final r a() {
        return new pg.a();
    }

    public static final int b(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return (int) rVar.getBuffer().s();
    }
}
