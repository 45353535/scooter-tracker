package androidx.core.util;

import com.ironsource.D5;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.z;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a(\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\t\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0014\u0010\u0011\u001a\u00020\u0007*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroid/util/AtomicFile;", "Lkotlin/Function1;", "Ljava/io/FileOutputStream;", "", "block", "tryWrite", "(Landroid/util/AtomicFile;Lkotlin/jvm/functions/Function1;)V", "", "array", "writeBytes", "(Landroid/util/AtomicFile;[B)V", "", "text", "Ljava/nio/charset/Charset;", D5.M, "writeText", "(Landroid/util/AtomicFile;Ljava/lang/String;Ljava/nio/charset/Charset;)V", "readBytes", "(Landroid/util/AtomicFile;)[B", "readText", "(Landroid/util/AtomicFile;Ljava/nio/charset/Charset;)Ljava/lang/String;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AtomicFileKt {
    @NotNull
    public static final byte[] readBytes(@NotNull android.util.AtomicFile atomicFile) {
        return atomicFile.readFully();
    }

    @NotNull
    public static final String readText(@NotNull android.util.AtomicFile atomicFile, @NotNull Charset charset) {
        return new String(atomicFile.readFully(), charset);
    }

    public static /* synthetic */ String readText$default(android.util.AtomicFile atomicFile, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return readText(atomicFile, charset);
    }

    public static final void tryWrite(@NotNull android.util.AtomicFile atomicFile, @NotNull Function1<? super FileOutputStream, Unit> function1) throws IOException {
        FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
        try {
            function1.invoke(fileOutputStreamStartWrite);
            z.b(1);
            atomicFile.finishWrite(fileOutputStreamStartWrite);
            z.a(1);
        } catch (Throwable th2) {
            z.b(1);
            atomicFile.failWrite(fileOutputStreamStartWrite);
            z.a(1);
            throw th2;
        }
    }

    public static final void writeBytes(@NotNull android.util.AtomicFile atomicFile, @NotNull byte[] bArr) throws IOException {
        FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
        try {
            fileOutputStreamStartWrite.write(bArr);
            atomicFile.finishWrite(fileOutputStreamStartWrite);
        } catch (Throwable th2) {
            atomicFile.failWrite(fileOutputStreamStartWrite);
            throw th2;
        }
    }

    public static final void writeText(@NotNull android.util.AtomicFile atomicFile, @NotNull String str, @NotNull Charset charset) throws IOException {
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        writeBytes(atomicFile, bytes);
    }

    public static /* synthetic */ void writeText$default(android.util.AtomicFile atomicFile, String str, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        writeText(atomicFile, str, charset);
    }
}
