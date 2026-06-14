package q9;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public abstract class x {
    public static void a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void b(MediaFormat mediaFormat, n9.g gVar) {
        if (gVar != null) {
            d(mediaFormat, "color-transfer", gVar.f95309c);
            d(mediaFormat, "color-standard", gVar.f95307a);
            d(mediaFormat, "color-range", gVar.f95308b);
            a(mediaFormat, "hdr-static-info", gVar.f95310d);
        }
    }

    public static void c(MediaFormat mediaFormat, String str, float f10) {
        if (f10 != -1.0f) {
            mediaFormat.setFloat(str, f10);
        }
    }

    public static void d(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void e(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer("csd-" + i10, ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }
}
