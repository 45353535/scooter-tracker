package com.bytedance.sdk.openadsdk.utils;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.jl.qdl.qdl;
import j$.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class yt {

    public interface qdl {
        void qdl();

        void qdl(com.bytedance.sdk.openadsdk.jl.qdl.ud udVar);
    }

    public static void qdl(com.bytedance.sdk.openadsdk.jl.qdl qdlVar, int i10, int i11, qdl qdlVar2, String str) {
        qdl(qdlVar, i10, i11, qdlVar2, str, 0);
    }

    public static void qdl(com.bytedance.sdk.openadsdk.jl.qdl qdlVar, int i10, int i11, final qdl qdlVar2, String str, int i12) {
        Objects.toString(qdlVar);
        com.bytedance.sdk.openadsdk.jl.ud.ud().mml().qdl(qdlVar, new qdl.InterfaceC0286qdl() { // from class: com.bytedance.sdk.openadsdk.utils.yt.1
            @Override // com.bytedance.sdk.openadsdk.jl.qdl.qdl.InterfaceC0286qdl
            public void qdl(String str2, com.bytedance.sdk.openadsdk.jl.qdl.ud udVar) {
                qdl qdlVar3;
                if (udVar.mzz() && (qdlVar3 = qdlVar2) != null) {
                    qdlVar3.qdl(udVar);
                    return;
                }
                qdl qdlVar4 = qdlVar2;
                if (qdlVar4 != null) {
                    qdlVar4.qdl();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.jl.qdl.qdl.InterfaceC0286qdl
            public void qdl(int i13, String str2, Throwable th2) {
                qdl qdlVar3 = qdlVar2;
                if (qdlVar3 != null) {
                    qdlVar3.qdl();
                }
            }
        }, i10, i11, ImageView.ScaleType.CENTER_INSIDE, str, i12, null);
    }

    public static Drawable qdl(byte[] bArr, int i10) {
        if (bArr != null && bArr.length > 0) {
            try {
                return new BitmapDrawable(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            } catch (Throwable unused) {
                return new ColorDrawable(0);
            }
        }
        return new ColorDrawable(0);
    }
}
