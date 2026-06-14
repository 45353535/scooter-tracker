package androidx.test.platform.io;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface PlatformTestStorage {
    void addOutputProperties(Map<String, Serializable> map);

    String getInputArg(String str);

    Map<String, String> getInputArgs();

    Uri getInputFileUri(@NonNull String str);

    Uri getOutputFileUri(@NonNull String str);

    Map<String, Serializable> getOutputProperties();

    boolean isTestStorageFilePath(@NonNull String str);

    InputStream openInputFile(String str) throws FileNotFoundException;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    InputStream openInternalInputFile(String str) throws FileNotFoundException;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    OutputStream openInternalOutputFile(String str) throws FileNotFoundException;

    OutputStream openOutputFile(String str) throws FileNotFoundException;

    OutputStream openOutputFile(String str, boolean z10) throws FileNotFoundException;
}
