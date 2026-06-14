package com.ironsource;

import android.graphics.drawable.Drawable;
import android.webkit.URLUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class T8 implements U8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final U3 f41803a;

    public T8() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final Object b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            Result.Companion companion = Result.f93230c;
            return Result.b(kotlin.d.a(new Exception("file does not exists")));
        }
        Drawable drawableCreateFromPath = Drawable.createFromPath(file.getPath());
        if (drawableCreateFromPath != null) {
            return Result.b(drawableCreateFromPath);
        }
        Result.Companion companion2 = Result.f93230c;
        return Result.b(kotlin.d.a(new Exception("failed to create a drawable")));
    }

    private final Object c(String str) throws IOException {
        InputStream inputStreamA = this.f41803a.a(str);
        try {
            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamA, new File(str).getName());
            uf.c.a(inputStreamA, null);
            if (drawableCreateFromStream != null) {
                return Result.b(drawableCreateFromStream);
            }
            Result.Companion companion = Result.f93230c;
            return Result.b(kotlin.d.a(new Exception("failed to create a drawable")));
        } finally {
        }
    }

    private final boolean d(String str) {
        return URLUtil.isHttpsUrl(str);
    }

    @Override // com.ironsource.U8
    @NotNull
    public Object a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            return d(url) ? c(url) : b(url);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            Result.Companion companion = Result.f93230c;
            return Result.b(kotlin.d.a(e10));
        }
    }

    public T8(@NotNull U3 connectionFactory) {
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        this.f41803a = connectionFactory;
    }

    public /* synthetic */ T8(U3 u32, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? I4.f41078a : u32);
    }
}
