package com.bytedance.sdk.openadsdk.core.rq;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.bytedance.adsdk.ugeno.qdl;
import com.bytedance.adsdk.ugeno.tvp.mml.a;
import com.bytedance.adsdk.ugeno.tvp.mml.b;
import com.bytedance.sdk.component.jpc.jpc;
import com.bytedance.sdk.component.mzz.jtx;
import com.bytedance.sdk.component.mzz.rq;
import com.bytedance.sdk.component.mzz.to;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.wd;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.fco;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class qdl implements com.bytedance.adsdk.ugeno.qdl {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.rq.qdl$qdl, reason: collision with other inner class name */
    public interface InterfaceC0271qdl {
        void qdl(Drawable drawable);
    }

    private static class ud implements jtx {
        private final int lnr;
        private final int mml;
        private final WeakReference<ImageView> qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private final qdl f17448ud;

        public ud(ImageView imageView, qdl qdlVar, int i10, int i11) {
            this.qdl = new WeakReference<>(imageView);
            this.f17448ud = qdlVar;
            this.lnr = i10;
            this.mml = i11;
        }

        @Override // com.bytedance.sdk.component.mzz.jtx
        public void qdl(int i10, String str, Throwable th2) {
        }

        @Override // com.bytedance.sdk.component.mzz.jtx
        public void qdl(rq rqVar) {
            try {
                final ImageView imageView = this.qdl.get();
                if (imageView == null) {
                    return;
                }
                final Object objUd = rqVar.ud();
                if (objUd instanceof Drawable) {
                    fco.qdl((Runnable) new jpc("load_draw_img") { // from class: com.bytedance.sdk.openadsdk.core.rq.qdl.ud.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28 && a.a(objUd)) {
                                b.a(objUd).start();
                            }
                            imageView.setImageDrawable((Drawable) objUd);
                        }
                    });
                    return;
                }
                if (!(objUd instanceof byte[])) {
                    if (objUd instanceof Bitmap) {
                        fco.qdl((Runnable) new jpc("ug_load_bitmap") { // from class: com.bytedance.sdk.openadsdk.core.rq.qdl.ud.3
                            @Override // java.lang.Runnable
                            public void run() {
                                imageView.setImageBitmap((Bitmap) objUd);
                            }
                        });
                    }
                } else {
                    if (rqVar.mzz()) {
                        if (Build.VERSION.SDK_INT <= 30) {
                            this.f17448ud.qdl((byte[]) objUd, imageView);
                            return;
                        } else {
                            this.f17448ud.qdl(imageView, (byte[]) objUd, this.lnr, this.mml);
                            return;
                        }
                    }
                    if (this.f17448ud.qdl((byte[]) objUd)) {
                        this.f17448ud.qdl(imageView, (byte[]) objUd, this.lnr, this.mml);
                        return;
                    }
                    final Bitmap bitmapQdl = new com.bytedance.sdk.component.mzz.mml.lnr.ud.ud(this.lnr, this.mml, imageView.getScaleType(), Bitmap.Config.RGB_565, this.lnr, this.mml).qdl((byte[]) objUd);
                    if (bitmapQdl != null) {
                        fco.qdl((Runnable) new jpc("load_static_img") { // from class: com.bytedance.sdk.openadsdk.core.rq.qdl.ud.2
                            @Override // java.lang.Runnable
                            public void run() {
                                imageView.setImageBitmap(bitmapQdl);
                            }
                        });
                    }
                }
            } catch (Throwable th2) {
                aaj.lnr("ImageLoaderProvider", th2.getMessage());
            }
        }
    }

    private void ud(final ImageView imageView, byte[] bArr, int i10, int i11) {
        final Bitmap bitmapQdl = new com.bytedance.sdk.component.mzz.mml.lnr.ud.ud(i10, i11, imageView.getScaleType(), Bitmap.Config.ARGB_4444, i10, i11).qdl(bArr);
        if (bitmapQdl != null) {
            fco.qdl((Runnable) new jpc("loadStaticImage") { // from class: com.bytedance.sdk.openadsdk.core.rq.qdl.2
                @Override // java.lang.Runnable
                public void run() {
                    imageView.setImageBitmap(bitmapQdl);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable ud(byte[] bArr) {
        FileOutputStream fileOutputStream;
        File fileQdl;
        try {
            boolean zLnr = com.bytedance.sdk.openadsdk.multipro.ud.lnr();
            fileQdl = wd.qdl(yt.qdl(), zLnr, zLnr ? "UGEN_GIF_AD_CACHE/" : "/UGEN_GIF_CACHE/", "TT_UGEN_GIF_FILE");
            fileOutputStream = new FileOutputStream(fileQdl);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        try {
            fileOutputStream.write(bArr, 0, bArr.length);
            if (Build.VERSION.SDK_INT >= 28) {
                Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(fileQdl));
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                return drawableDecodeDrawable;
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(yt.qdl().getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            try {
                fileOutputStream.close();
            } catch (Throwable unused2) {
            }
            return bitmapDrawable;
        } catch (Throwable th3) {
            th = th3;
            try {
                aaj.qdl("ImageLoaderProvider", "GifView  getSourceByFile fail : ", th);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused3) {
                    }
                }
                return null;
            } catch (Throwable th4) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused4) {
                    }
                }
                throw th4;
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.qdl
    public void qdl(com.bytedance.adsdk.ugeno.core.rq rqVar, String str, ImageView imageView, int i10, int i11, qdl.InterfaceC0211qdl interfaceC0211qdl) {
        String strQdl = lnr.qdl(str);
        to toVarLnr = com.bytedance.sdk.openadsdk.tvp.mml.qdl(strQdl).lnr(1);
        qdl(rqVar, toVarLnr, strQdl);
        toVarLnr.qdl(new ud(imageView, this, i10, i11), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(final ImageView imageView, byte[] bArr, int i10, int i11) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                final Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap));
                if (drawableDecodeDrawable != null) {
                    fco.qdl((Runnable) new jpc("loadAnimatedDrawable") { // from class: com.bytedance.sdk.openadsdk.core.rq.qdl.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (a.a(drawableDecodeDrawable)) {
                                b.a(drawableDecodeDrawable).start();
                            }
                            imageView.setImageDrawable(drawableDecodeDrawable);
                        }
                    });
                    return;
                }
                return;
            } catch (IOException e10) {
                aaj.lnr("ImageLoaderProvider", e10.getMessage());
                return;
            }
        }
        ud(imageView, bArr, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(byte[] bArr, final ImageView imageView) {
        try {
            qdl(bArr, new InterfaceC0271qdl() { // from class: com.bytedance.sdk.openadsdk.core.rq.qdl.3
                @Override // com.bytedance.sdk.openadsdk.core.rq.qdl.InterfaceC0271qdl
                public void qdl(final Drawable drawable) {
                    fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.rq.qdl.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28 && a.a(drawable)) {
                                b.a(drawable).start();
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            });
        } catch (Exception e10) {
            aaj.lnr("ImageLoaderProvider", e10.getMessage());
        }
    }

    private void qdl(final byte[] bArr, final InterfaceC0271qdl interfaceC0271qdl) {
        fco.ud(new jpc("pag_animation_drawable") { // from class: com.bytedance.sdk.openadsdk.core.rq.qdl.4
            @Override // java.lang.Runnable
            public void run() {
                Drawable drawableUd = qdl.this.ud(bArr);
                InterfaceC0271qdl interfaceC0271qdl2 = interfaceC0271qdl;
                if (interfaceC0271qdl2 != null) {
                    interfaceC0271qdl2.qdl(drawableUd);
                }
            }
        });
    }

    public boolean qdl(byte[] bArr) {
        return com.bytedance.sdk.component.utils.rq.qdl(bArr, 0);
    }

    public void ud(com.bytedance.adsdk.ugeno.core.rq rqVar, String str, final qdl.InterfaceC0211qdl interfaceC0211qdl) {
        to toVarLnr = com.bytedance.sdk.openadsdk.tvp.mml.qdl(str).lnr(2);
        qdl(rqVar, toVarLnr, str);
        toVarLnr.qdl(new jtx() { // from class: com.bytedance.sdk.openadsdk.core.rq.qdl.5
            @Override // com.bytedance.sdk.component.mzz.jtx
            public void qdl(rq rqVar2) {
                if (rqVar2 == null) {
                    interfaceC0211qdl.qdl(null);
                    return;
                }
                if (interfaceC0211qdl != null) {
                    Object objUd = rqVar2.ud();
                    if (objUd instanceof Bitmap) {
                        interfaceC0211qdl.qdl((Bitmap) objUd);
                        return;
                    }
                    if (rqVar2.ud() instanceof byte[]) {
                        try {
                            interfaceC0211qdl.qdl(BitmapFactory.decodeByteArray((byte[]) rqVar2.ud(), 0, ((byte[]) rqVar2.ud()).length));
                            return;
                        } catch (Throwable unused) {
                        }
                    }
                    interfaceC0211qdl.qdl(null);
                }
            }

            @Override // com.bytedance.sdk.component.mzz.jtx
            public void qdl(int i10, String str2, Throwable th2) {
                qdl.InterfaceC0211qdl interfaceC0211qdl2 = interfaceC0211qdl;
                if (interfaceC0211qdl2 != null) {
                    interfaceC0211qdl2.qdl(null);
                }
            }
        }, 4);
    }

    @Override // com.bytedance.adsdk.ugeno.qdl
    public void qdl(com.bytedance.adsdk.ugeno.core.rq rqVar, String str, qdl.InterfaceC0211qdl interfaceC0211qdl) {
        ud(rqVar, lnr.qdl(str), interfaceC0211qdl);
    }

    private void qdl(com.bytedance.adsdk.ugeno.core.rq rqVar, @NonNull to toVar, String str) {
        Map<String, Object> mapUd;
        if (rqVar == null || (mapUd = rqVar.ud()) == null) {
            return;
        }
        Object obj = mapUd.get("image_info");
        if (obj instanceof Map) {
            toVar.qdl((String) ((Map) obj).get(str));
        }
        String str2 = (String) mapUd.get("cache_dir");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        toVar.ud(str2);
    }
}
