package com.ironsource;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
final class I4 implements U3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final I4 f41078a = new I4();

    private I4() {
    }

    @Override // com.ironsource.U3
    @NotNull
    public InputStream a(@NotNull String url) throws IOException {
        Intrinsics.checkNotNullParameter(url, "url");
        InputStream inputStreamOpenStream = new URL(url).openStream();
        Intrinsics.checkNotNullExpressionValue(inputStreamOpenStream, "URL(url).openStream()");
        return inputStreamOpenStream;
    }
}
