package com.bytedance.sdk.component.mzz.lnr.qdl.ud;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.mzz.yt;

/* JADX INFO: loaded from: classes6.dex */
public class ud implements yt {
    private com.bytedance.sdk.component.mzz.lnr.qdl.lnr<String, Bitmap> lnr;
    private int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f16600ud;

    public ud(int i10, int i11) {
        this.f16600ud = i10;
        this.qdl = i11;
        this.lnr = new com.bytedance.sdk.component.mzz.lnr.qdl.lnr<String, Bitmap>(i10) { // from class: com.bytedance.sdk.component.mzz.lnr.qdl.ud.ud.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.bytedance.sdk.component.mzz.lnr.qdl.lnr
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public int ud(String str, Bitmap bitmap) {
                if (bitmap == null) {
                    return 0;
                }
                return ud.qdl(bitmap);
            }
        };
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public boolean ud(String str) {
        return this.lnr.qdl(str) != null;
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public boolean qdl(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            return false;
        }
        this.lnr.qdl(str, bitmap);
        return true;
    }

    @Override // com.bytedance.sdk.component.mzz.qdl
    public Bitmap qdl(String str) {
        return this.lnr.qdl(str);
    }

    public static int qdl(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}
