package io.appmetrica.analytics.impl;

import android.content.Context;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.UUID;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes12.dex */
public final class Ge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qo f75821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ro f75822c;

    public Ge(Context context) {
        this(context, new qo(), new ro());
    }

    public final String a(String str) {
        try {
            this.f75822c.getClass();
            if (!ro.a(str)) {
                this.f75821b.getClass();
                str = StringsKt.W(UUID.randomUUID().toString(), TokenBuilder.TOKEN_DELIMITER, "", false, 4, null).toLowerCase(Locale.US);
            }
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f75820a, "uuid.dat");
            if (fileFromSdkStorage != null && str != null) {
                Qa.a(str, new FileOutputStream(fileFromSdkStorage));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Ge(Context context, qo qoVar, ro roVar) {
        this.f75820a = context;
        this.f75821b = qoVar;
        this.f75822c = roVar;
    }

    public final void a() {
        File fileFromAppStorage;
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f75820a, "uuid.dat");
        if (fileFromSdkStorage == null || fileFromSdkStorage.exists() || (fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f75820a, "uuid.dat")) == null || !fileFromAppStorage.exists()) {
            return;
        }
        FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
    }
}
