package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5167ia implements Do {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f77401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77402b;

    public C5167ia(@NotNull Context context, @NotNull String str) {
        this.f77401a = context;
        this.f77402b = str;
    }

    @Override // io.appmetrica.analytics.impl.Do
    @Nullable
    public final String a() {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f77401a, this.f77402b);
            if (fileFromSdkStorage == null) {
                return null;
            }
            fileFromSdkStorage.exists();
            File fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f77401a, this.f77402b);
            if (fileFromAppStorage != null) {
                FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
            }
            return uf.i.m(fileFromSdkStorage, null, 1, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final void a(@NotNull String str) {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f77401a, this.f77402b);
            if (fileFromSdkStorage != null) {
                uf.i.p(fileFromSdkStorage, str, null, 2, null);
            }
        } catch (Throwable unused) {
        }
    }
}
