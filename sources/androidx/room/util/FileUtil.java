package androidx.room.util;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.RestrictTo;
import com.my.target.common.menu.MenuActionType;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {MenuActionType.COPY, "", "input", "Ljava/nio/channels/ReadableByteChannel;", "output", "Ljava/nio/channels/FileChannel;", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class FileUtil {
    @SuppressLint({"LambdaLast"})
    public static final void copy(@NotNull ReadableByteChannel input, @NotNull FileChannel output) throws Throwable {
        ReadableByteChannel readableByteChannel;
        FileChannel fileChannel;
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        try {
            try {
                if (Build.VERSION.SDK_INT <= 23) {
                    readableByteChannel = input;
                    fileChannel = output;
                    InputStream inputStreamNewInputStream = Channels.newInputStream(readableByteChannel);
                    OutputStream outputStreamNewOutputStream = Channels.newOutputStream(fileChannel);
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i10 = inputStreamNewInputStream.read(bArr);
                        if (i10 <= 0) {
                            break;
                        } else {
                            outputStreamNewOutputStream.write(bArr, 0, i10);
                        }
                    }
                } else {
                    readableByteChannel = input;
                    fileChannel = output;
                    fileChannel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
                }
                fileChannel.force(false);
                readableByteChannel.close();
                fileChannel.close();
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                readableByteChannel.close();
                fileChannel.close();
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            readableByteChannel = input;
            fileChannel = output;
        }
    }
}
