package com.bytedance.sdk.component.mzz.mml.lnr.ud;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.sdk.component.mzz.mml.lnr.mo;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.wd;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.mzz.mml.lnr.ud.qdl$qdl, reason: collision with other inner class name */
    public interface InterfaceC0234qdl {
        void qdl();

        void qdl(Drawable drawable);

        void qdl(byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(byte[] bArr, mo moVar, InterfaceC0234qdl interfaceC0234qdl) {
        File fileQdl;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            boolean zWd = moVar.wd();
            fileQdl = wd.qdl(moVar.qdl(), zWd, zWd ? "P_GIF_MUTIL_CACHE/" : "/P_GIF_CACHE/", "P_U_GIF_FILE");
            fileOutputStream = new FileOutputStream(fileQdl);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            fileOutputStream.write(bArr, 0, bArr.length);
            if (Build.VERSION.SDK_INT >= 28) {
                Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(fileQdl));
                if (interfaceC0234qdl != null) {
                    interfaceC0234qdl.qdl(drawableDecodeDrawable);
                }
            } else if (interfaceC0234qdl != null) {
                interfaceC0234qdl.qdl(bArr);
            }
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            try {
                aaj.qdl("PAGGifDefaultDecoder", "Gif  getSourceByFile fail : ", th);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Throwable unused2) {
                    }
                }
                if (interfaceC0234qdl != null) {
                    interfaceC0234qdl.qdl();
                }
            } catch (Throwable th4) {
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Throwable unused3) {
                    }
                }
                throw th4;
            }
        }
    }

    public void qdl(byte[] bArr, mo moVar, InterfaceC0234qdl interfaceC0234qdl) {
        if (Build.VERSION.SDK_INT <= 30) {
            qdl(bArr, interfaceC0234qdl, moVar);
        } else {
            qdl(bArr, interfaceC0234qdl);
        }
    }

    public void qdl(byte[] bArr, InterfaceC0234qdl interfaceC0234qdl) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT < 28) {
            if (interfaceC0234qdl != null) {
                interfaceC0234qdl.qdl(bArr);
                return;
            }
            return;
        }
        try {
            Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap));
            if (interfaceC0234qdl != null) {
                interfaceC0234qdl.qdl(drawableDecodeDrawable);
            }
        } catch (Throwable th2) {
            aaj.lnr("PAGGifDefaultDecoder", th2.getMessage());
            if (interfaceC0234qdl != null) {
                interfaceC0234qdl.qdl();
            }
        }
    }

    private void qdl(final byte[] bArr, final InterfaceC0234qdl interfaceC0234qdl, final mo moVar) {
        try {
            moVar.jpc().submit(new Runnable() { // from class: com.bytedance.sdk.component.mzz.mml.lnr.ud.qdl.1
                @Override // java.lang.Runnable
                public void run() {
                    qdl.this.ud(bArr, moVar, interfaceC0234qdl);
                }
            });
        } catch (Throwable th2) {
            aaj.lnr("PAGGifDefaultDecoder", th2.getMessage());
            if (interfaceC0234qdl != null) {
                interfaceC0234qdl.qdl();
            }
        }
    }
}
