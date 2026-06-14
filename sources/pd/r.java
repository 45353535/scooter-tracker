package pd;

import androidx.media3.common.MimeTypes;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f98251a = new r();

    private r() {
    }

    private static final boolean b(byte[] bArr, int i10, int... iArr) {
        if (i10 < 0 || bArr.length < iArr.length + i10) {
            return false;
        }
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if ((bArr[i10 + i11] & 255) != iArr[i11]) {
                return false;
            }
        }
        return true;
    }

    private static final boolean c(byte[] bArr, int... iArr) {
        if (bArr.length < iArr.length) {
            return false;
        }
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if ((bArr[i10] & 255) != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    private final String d(String str) {
        int iU0;
        if (str == null || (iU0 = StringsKt.u0(str, IOUtils.DIR_SEPARATOR_UNIX, 0, false, 6, null)) == -1) {
            return null;
        }
        String strSubstring = str.substring(0, iU0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String a(File file) {
        int i10;
        Intrinsics.checkNotNullParameter(file, "file");
        byte[] bArrCopyOf = new byte[16];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                i10 = fileInputStream.read(bArrCopyOf);
                uf.c.a(fileInputStream, null);
            } finally {
            }
        } catch (Exception unused) {
            i10 = -1;
        }
        if (i10 < 4) {
            return "application/octet-stream";
        }
        if (i10 < 16) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i10);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, newSize)");
        }
        return c(bArrCopyOf, 255, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 255) ? "image/jpeg" : c(bArrCopyOf, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 80, 78, 71) ? MimeTypes.IMAGE_PNG : c(bArrCopyOf, 71, 73, 70) ? "image/gif" : (c(bArrCopyOf, 82, 73, 70, 70) && b(bArrCopyOf, 8, 87, 69, 66, 80)) ? MimeTypes.IMAGE_WEBP : (c(bArrCopyOf, 0, 0, 0, 24, 102, 116, 121, 112, 109, 112, 52) || c(bArrCopyOf, 0, 0, 0, 32, 102, 116, 121, 112, 109, 112, 52)) ? "video/mp4" : c(bArrCopyOf, 26, 69, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 163) ? "video/webm" : (c(bArrCopyOf, 82, 73, 70, 70) && b(bArrCopyOf, 8, 65, 86, 73, 32)) ? "video/avi" : (c(bArrCopyOf, 73, 68, 51) || c(bArrCopyOf, 255, 251) || c(bArrCopyOf, 255, 243)) ? "audio/mpeg" : c(bArrCopyOf, 37, 80, 68, 70) ? "application/pdf" : (c(bArrCopyOf, 80, 75, 3, 4) || c(bArrCopyOf, 80, 75, 5, 6) || c(bArrCopyOf, 80, 75, 7, 8)) ? "application/zip" : "application/octet-stream";
    }

    public final boolean e(String str) {
        return Intrinsics.areEqual("image", d(str));
    }

    public final boolean f(String str) {
        return Intrinsics.areEqual("video", d(str));
    }

    public final boolean g(String str) {
        return f(str) || e(str);
    }
}
