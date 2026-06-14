package androidx.test.platform.io;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {
    public static InputStream a(PlatformTestStorage platformTestStorage, String str) {
        return platformTestStorage.openInputFile(str);
    }

    public static OutputStream b(PlatformTestStorage platformTestStorage, String str) {
        return platformTestStorage.openOutputFile(str);
    }
}
