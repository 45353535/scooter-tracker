package ib;

import androidx.media3.common.MimeTypes;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
abstract class k {
    public static String a(io.bidmachine.media3.common.a aVar) {
        String str = aVar.f80561o;
        return n9.w.t(str) ? "video/mp4" : n9.w.o(str) ? "audio/mp4" : n9.w.q(str) ? Objects.equals(str, MimeTypes.IMAGE_HEIC) ? MimeTypes.IMAGE_HEIF : Objects.equals(str, MimeTypes.IMAGE_AVIF) ? MimeTypes.IMAGE_AVIF : "application/mp4" : "application/mp4";
    }

    public static String b(List list) {
        Iterator it = list.iterator();
        boolean z10 = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((w) it.next()).f74167a.f74138g.f80561o;
            if (n9.w.t(str2)) {
                return "video/mp4";
            }
            if (n9.w.o(str2)) {
                z10 = true;
            } else if (n9.w.q(str2)) {
                if (Objects.equals(str2, MimeTypes.IMAGE_HEIC)) {
                    str = MimeTypes.IMAGE_HEIF;
                } else if (Objects.equals(str2, MimeTypes.IMAGE_AVIF)) {
                    str = MimeTypes.IMAGE_AVIF;
                }
            }
        }
        return z10 ? "audio/mp4" : str != null ? str : "application/mp4";
    }
}
