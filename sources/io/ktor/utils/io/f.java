package io.ktor.utils.io;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static final void a(e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        eVar.a(new IOException("Channel was cancelled"));
    }
}
