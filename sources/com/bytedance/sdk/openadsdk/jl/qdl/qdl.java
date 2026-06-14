package com.bytedance.sdk.openadsdk.jl.qdl;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.mzz.jpc;
import com.bytedance.sdk.component.mzz.jtx;
import com.bytedance.sdk.component.mzz.rq;
import com.bytedance.sdk.component.mzz.to;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.tvp.mml;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.jl.qdl.qdl$qdl, reason: collision with other inner class name */
    public interface InterfaceC0286qdl {
        void qdl(int i10, String str, Throwable th2);

        void qdl(String str, ud udVar);
    }

    public void qdl(com.bytedance.sdk.openadsdk.jl.qdl qdlVar, final InterfaceC0286qdl interfaceC0286qdl, int i10, int i11, ImageView.ScaleType scaleType, String str, final int i12, ljh ljhVar) {
        to toVarQdl = mml.qdl(qdlVar.qdl).qdl(qdlVar.f17602ud).qdl(i10).ud(i11).mzz(ax.mzz(yt.qdl())).mml(ax.lnr(yt.qdl())).ud(str).qdl(scaleType).qdl(!TextUtils.isEmpty(str));
        if (i12 <= 0 || Build.VERSION.SDK_INT < 26) {
            toVarQdl.lnr(1);
        } else {
            toVarQdl.lnr(2).qdl(new jpc() { // from class: com.bytedance.sdk.openadsdk.jl.qdl.qdl.1
                @Override // com.bytedance.sdk.component.mzz.jpc
                public Bitmap qdl(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.mml.qdl.qdl(yt.qdl(), bitmap, i12);
                }
            });
        }
        toVarQdl.qdl(new com.bytedance.sdk.openadsdk.tvp.ud(ljhVar, qdlVar.qdl, new jtx() { // from class: com.bytedance.sdk.openadsdk.jl.qdl.qdl.2
            @Override // com.bytedance.sdk.component.mzz.jtx
            public void qdl(rq rqVar) {
                qdl.this.qdl(rqVar, interfaceC0286qdl);
            }

            @Override // com.bytedance.sdk.component.mzz.jtx
            public void qdl(int i13, String str2, Throwable th2) {
                qdl.this.qdl(i13, str2, th2, interfaceC0286qdl);
            }
        }));
    }

    protected void qdl(rq rqVar, InterfaceC0286qdl interfaceC0286qdl) {
        if (interfaceC0286qdl != null) {
            Object objUd = rqVar.ud();
            int iQdl = qdl(rqVar);
            if (objUd instanceof Drawable) {
                interfaceC0286qdl.qdl(rqVar.qdl(), new ud((Drawable) objUd, iQdl));
                return;
            }
            if (objUd instanceof byte[]) {
                interfaceC0286qdl.qdl(rqVar.qdl(), new ud((byte[]) objUd, iQdl));
                return;
            }
            if (objUd instanceof Bitmap) {
                interfaceC0286qdl.qdl(rqVar.qdl(), new ud((Bitmap) objUd, rqVar.lnr() instanceof Bitmap ? (Bitmap) rqVar.lnr() : null, iQdl));
            } else {
                interfaceC0286qdl.qdl(0, "not bitmap or gif result!", null);
            }
        }
    }

    private int qdl(rq rqVar) {
        Object obj;
        Map<String, String> mapMml = rqVar.mml();
        if (mapMml == null || (obj = mapMml.get(CampaignEx.JSON_KEY_IMAGE_SIZE)) == null || !(obj instanceof Integer)) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    protected void qdl(int i10, String str, Throwable th2, InterfaceC0286qdl interfaceC0286qdl) {
        if (interfaceC0286qdl != null) {
            interfaceC0286qdl.qdl(i10, str, th2);
        }
    }
}
