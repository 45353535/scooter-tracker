package androidx.test.internal.platform.content;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface PermissionGranter {
    void addPermissions(@NonNull String... strArr);

    void requestPermissions();
}
