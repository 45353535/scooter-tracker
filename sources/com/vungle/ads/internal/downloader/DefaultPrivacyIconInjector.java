package com.vungle.ads.internal.downloader;

import android.util.Base64;
import androidx.annotation.WorkerThread;
import com.ironsource.C4240b4;
import com.vungle.ads.internal.Constants;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uf.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0002¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/downloader/DefaultPrivacyIconInjector;", "", "()V", "injectPrivacyIcon", "Ljava/io/File;", "dir", "writePrivacyFileFromString", "", C4240b4.i.f42616b, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DefaultPrivacyIconInjector {

    @NotNull
    public static final DefaultPrivacyIconInjector INSTANCE = new DefaultPrivacyIconInjector();

    private DefaultPrivacyIconInjector() {
    }

    private final boolean writePrivacyFileFromString(File file) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            byte[] bArrDecode = Base64.decode(Constants.LO_PRIVACY_ICON_STRING, 0);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArrDecode);
                Unit unit = Unit.f93236a;
                c.a(fileOutputStream, null);
                objB = Result.b(Boolean.TRUE);
            } finally {
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.i(objB)) {
            objB = bool;
        }
        return ((Boolean) objB).booleanValue();
    }

    @WorkerThread
    @Nullable
    public final File injectPrivacyIcon(@NotNull File dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        File file = new File(dir, Constants.PRIVACY_ICON_FILE_NAME);
        if (file.exists() || writePrivacyFileFromString(file)) {
            return file;
        }
        return null;
    }
}
