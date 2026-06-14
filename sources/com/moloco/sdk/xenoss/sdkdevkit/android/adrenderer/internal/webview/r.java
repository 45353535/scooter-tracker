package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f58832a;

    public r(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58832a = context;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.x
    public String a(String fileName) throws IOException {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        InputStream inputStreamOpen = this.f58832a.getAssets().open(fileName);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), 8192);
        try {
            String strI = uf.r.i(bufferedReader);
            uf.c.a(bufferedReader, null);
            return strI;
        } finally {
        }
    }
}
