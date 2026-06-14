package hf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final boolean a(pg.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return !aVar.exhausted();
    }
}
