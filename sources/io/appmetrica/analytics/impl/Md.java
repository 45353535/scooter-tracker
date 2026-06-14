package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Function;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class Md implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Od f76126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ld f76127b;

    public Md(@NotNull Od od2, @NotNull Ld ld2) {
        this.f76126a = od2;
        this.f76127b = ld2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String apply(@NotNull File file) {
        byte[] bArrC;
        FileInputStream fileInputStream;
        try {
            String absolutePath = file.getAbsolutePath();
            if (absolutePath != null) {
                try {
                    fileInputStream = new FileInputStream(new File(absolutePath));
                    try {
                        bArrC = uf.b.c(fileInputStream);
                        no.a((Closeable) fileInputStream);
                    } catch (Throwable unused) {
                        no.a((Closeable) fileInputStream);
                        bArrC = null;
                    }
                } catch (Throwable unused2) {
                    fileInputStream = null;
                }
            } else {
                bArrC = null;
            }
            if (bArrC == null) {
                return null;
            }
            if (bArrC.length == 0) {
                bArrC = null;
            }
            if (bArrC != null) {
                return Base64Utils.compressBase64(MessageNano.toByteArray(this.f76127b.fromModel(new Rd(bArrC, this.f76126a))));
            }
            return null;
        } catch (Throwable unused3) {
            return null;
        }
    }
}
