package com.appodeal.consent.cache;

import android.content.Context;
import java.io.File;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static String a(Context context) {
        Object objB;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.f93230c;
            File cacheDir = context.getCacheDir();
            Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
            File file = new File(uf.i.B(cacheDir, "stack_consent_dir"), "form.html");
            if (!file.exists() || !file.isFile()) {
                file = null;
            }
            objB = Result.b(file != null ? file.getAbsolutePath() : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        return (String) (Result.i(objB) ? null : objB);
    }

    public static String b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File cacheDir = context.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        uf.i.B(cacheDir, "stack_consent_dir").mkdirs();
        File cacheDir2 = context.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir2, "getCacheDir(...)");
        String absolutePath = new File(uf.i.B(cacheDir2, "stack_consent_dir"), "form.html").getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }
}
