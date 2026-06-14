package com.bytedance.sdk.component.adexpress.mo;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class to extends com.bytedance.adsdk.ud.mo {
    private Map<String, Bitmap> qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private String f16436ud;

    private static class qdl implements com.bytedance.sdk.component.mzz.jtx {
        private final String lnr;
        private final Map<String, Bitmap> mml;
        private final WeakReference<to> qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private final com.bytedance.adsdk.ud.to f16438ud;

        public qdl(to toVar, com.bytedance.adsdk.ud.to toVar2, String str, Map<String, Bitmap> map) {
            this.qdl = new WeakReference<>(toVar);
            this.f16438ud = toVar2;
            this.lnr = str;
            this.mml = map;
        }

        @Override // com.bytedance.sdk.component.mzz.jtx
        public void qdl(int i10, String str, Throwable th2) {
        }

        @Override // com.bytedance.sdk.component.mzz.jtx
        public void qdl(com.bytedance.sdk.component.mzz.rq rqVar) {
            Object objUd = rqVar.ud();
            if (objUd instanceof Bitmap) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap((Bitmap) objUd, this.f16438ud.qdl(), this.f16438ud.ud(), false);
                this.mml.put(this.lnr, bitmapCreateScaledBitmap);
                to toVar = this.qdl.get();
                if (toVar != null) {
                    toVar.qdl(this.f16438ud.jpc(), bitmapCreateScaledBitmap);
                }
            }
        }
    }

    public to(Context context) {
        super(context);
        this.qdl = new HashMap();
    }

    public void jpc() {
        if (TextUtils.isEmpty(this.f16436ud)) {
            return;
        }
        setProgress(0.0f);
        qdl(true);
        setAnimationFromUrl(this.f16436ud);
        setImageAssetDelegate(new com.bytedance.adsdk.ud.mml() { // from class: com.bytedance.sdk.component.adexpress.mo.to.1
            @Override // com.bytedance.adsdk.ud.mml
            public Bitmap qdl(final com.bytedance.adsdk.ud.to toVar) {
                final String strJpc = toVar.jpc();
                String str = toVar.to();
                String strTvp = toVar.tvp();
                if (TextUtils.equals(strJpc, "image_0") && TextUtils.equals(strTvp, "Lark20201123-180048_2.png")) {
                    strTvp = "hand.png";
                }
                Bitmap bitmap = (Bitmap) to.this.qdl.get(strJpc);
                if (bitmap != null) {
                    return bitmap;
                }
                if (TextUtils.isEmpty(str) || !TextUtils.isEmpty(strTvp)) {
                    if (!TextUtils.isEmpty(strTvp) && TextUtils.isEmpty(str)) {
                        str = strTvp;
                    } else if (TextUtils.isEmpty(strTvp) || TextUtils.isEmpty(str)) {
                        str = "";
                    } else {
                        str = str + strTvp;
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                com.bytedance.sdk.component.mzz.to toVarQdl = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().mzz().qdl(str).lnr(2).qdl(new com.bytedance.sdk.component.mzz.jpc() { // from class: com.bytedance.sdk.component.adexpress.mo.to.1.1
                    @Override // com.bytedance.sdk.component.mzz.jpc
                    public Bitmap qdl(Bitmap bitmap2) {
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, toVar.qdl(), toVar.ud(), false);
                        to.this.qdl.put(strJpc, bitmapCreateScaledBitmap);
                        return bitmapCreateScaledBitmap;
                    }
                });
                to toVar2 = to.this;
                toVarQdl.qdl(new qdl(toVar2, toVar, strJpc, toVar2.qdl));
                return (Bitmap) to.this.qdl.get(strJpc);
            }
        });
        qdl();
    }

    public void setAnimationsLoop(boolean z10) {
    }

    public void setData(Map<String, String> map) {
    }

    public void setImageLottieTosPath(String str) {
        this.f16436ud = str;
    }

    public void setLottieAdDescMaxLength(int i10) {
    }

    public void setLottieAdTitleMaxLength(int i10) {
    }

    public void setLottieAppNameMaxLength(int i10) {
    }
}
