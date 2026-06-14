package androidx.test.core.graphics;

import android.graphics.Bitmap;
import androidx.annotation.RestrictTo;
import androidx.test.platform.io.PlatformTestStorage;
import androidx.test.platform.io.PlatformTestStorageRegistry;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uf.c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"writeToTestStorage", "", "Landroid/graphics/Bitmap;", "testStorage", "Landroidx/test/platform/io/PlatformTestStorage;", "name", "", "core_java_androidx_test_core-core_internal_kt"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BitmapStorage {
    public static final void writeToTestStorage(@NotNull Bitmap bitmap, @NotNull String name) throws IOException {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        PlatformTestStorage platformTestStorageRegistry = PlatformTestStorageRegistry.getInstance();
        Intrinsics.checkNotNullExpressionValue(platformTestStorageRegistry, "getInstance()");
        writeToTestStorage(bitmap, platformTestStorageRegistry, name);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final void writeToTestStorage(@NotNull Bitmap bitmap, @NotNull PlatformTestStorage testStorage, @NotNull String name) throws IOException {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(testStorage, "testStorage");
        Intrinsics.checkNotNullParameter(name, "name");
        OutputStream outputStreamOpenOutputFile = testStorage.openOutputFile(name + ".png");
        try {
            if (!bitmap.compress(Bitmap.CompressFormat.PNG, 0, outputStreamOpenOutputFile)) {
                throw new IOException("Failed to compress bitmap");
            }
            Unit unit = Unit.f93236a;
            c.a(outputStreamOpenOutputFile, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.a(outputStreamOpenOutputFile, th2);
                throw th3;
            }
        }
    }
}
