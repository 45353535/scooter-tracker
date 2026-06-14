package com.bytedance.sdk.openadsdk.core.fs;

import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.yt;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mo {
    final Set<Pair<View, FriendlyObstructionPurpose>> qdl = new HashSet();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private wd f17222ud;

    private mo() {
        mzz.qdl(yt.qdl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpc() {
        wd wdVar = this.f17222ud;
        if (wdVar != null) {
            try {
                wdVar.lnr();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mo() {
        if (this.f17222ud != null) {
            try {
                qdl((View) null, (FriendlyObstructionPurpose) null);
                this.f17222ud.ud();
            } catch (Throwable unused) {
            }
        }
    }

    private Handler mzz() {
        return com.bytedance.sdk.component.utils.tvp.ud();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wd() {
        wd wdVar = this.f17222ud;
        if (wdVar != null) {
            try {
                wdVar.mml();
            } catch (Throwable unused) {
            }
        }
    }

    @UiThread
    public void mml() {
        if (com.bykv.vk.openvk.qdl.qdl.ud.ud.qdl.qdl()) {
            jpc();
        } else {
            mzz().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fs.mo.7
                @Override // java.lang.Runnable
                public void run() {
                    mo.this.jpc();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(WebView webView) {
        try {
            if (this.f17222ud == null) {
                this.f17222ud = jpc.qdl(webView);
            }
        } catch (Throwable th2) {
            aaj.lnr("createWebViewSession failed : ".concat(String.valueOf(th2)), new Object[0]);
            HashMap map = new HashMap();
            map.put("scene", "createWebViewSession");
            map.put(PglCryptUtils.KEY_MESSAGE, th2.getMessage());
            mzz.qdl(map);
        }
    }

    @UiThread
    public void lnr() {
        if (com.bykv.vk.openvk.qdl.qdl.ud.ud.qdl.qdl()) {
            wd();
        } else {
            mzz().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fs.mo.6
                @Override // java.lang.Runnable
                public void run() {
                    mo.this.wd();
                }
            });
        }
    }

    public static mo qdl() {
        return new mo();
    }

    @UiThread
    public void qdl(final WebView webView) {
        if (webView == null || this.f17222ud != null) {
            return;
        }
        if (com.bykv.vk.openvk.qdl.qdl.ud.ud.qdl.qdl()) {
            ud(webView);
        } else {
            mzz().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fs.mo.1
                @Override // java.lang.Runnable
                public void run() {
                    mo.this.ud(webView);
                }
            });
        }
    }

    @UiThread
    public void ud() {
        if (com.bykv.vk.openvk.qdl.qdl.ud.ud.qdl.qdl()) {
            mo();
        } else {
            mzz().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fs.mo.4
                @Override // java.lang.Runnable
                public void run() {
                    mo.this.mo();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(boolean z10, float f10) {
        if (this.f17222ud != null) {
            try {
                qdl((View) null, (FriendlyObstructionPurpose) null);
                this.f17222ud.qdl(z10, f10);
            } catch (Throwable unused) {
            }
        }
    }

    public void qdl(final View view, final ljh ljhVar) {
        if (this.f17222ud != null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm = ljhVar.zm();
        final Set<to> setUd = mmlVarZm != null ? mmlVarZm.ud() : null;
        if (view == null || setUd == null) {
            return;
        }
        if (com.bykv.vk.openvk.qdl.qdl.ud.ud.qdl.qdl()) {
            qdl(view, setUd, ljhVar);
        } else {
            mzz().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fs.mo.3
                @Override // java.lang.Runnable
                public void run() {
                    mo.this.qdl(view, (Set<to>) setUd, ljhVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(@Nullable View view, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose) {
        wd wdVar = this.f17222ud;
        try {
            if (wdVar == null) {
                if (view == null || friendlyObstructionPurpose == null) {
                    return;
                }
                this.qdl.add(new Pair<>(view, friendlyObstructionPurpose));
                return;
            }
            if (view != null && friendlyObstructionPurpose != null) {
                wdVar.qdl(view, friendlyObstructionPurpose);
            }
            if (this.qdl.size() > 0) {
                wdVar.qdl(this.qdl);
                this.qdl.clear();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(View view, Set<to> set, ljh ljhVar) {
        try {
            if (this.f17222ud == null) {
                this.f17222ud = jpc.qdl(view, set);
                if (ljhVar.uj()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVar, ljhVar.mzz(), "track_create", (JSONObject) null);
            }
        } catch (Throwable th2) {
            aaj.lnr("createVideoSession failed : ".concat(String.valueOf(th2)), new Object[0]);
            HashMap map = new HashMap();
            map.put("scene", "createVideoSession");
            map.put(PglCryptUtils.KEY_MESSAGE, th2.getMessage());
            mzz.qdl(map);
        }
    }

    public void ud(long j10, boolean z10) {
        wd wdVar = this.f17222ud;
        if (wdVar != null) {
            try {
                wdVar.qdl(j10 / 1000.0f, z10);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(boolean z10) {
        wd wdVar = this.f17222ud;
        if (wdVar != null) {
            try {
                wdVar.qdl(z10);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(int i10) {
        wd wdVar = this.f17222ud;
        if (wdVar != null) {
            try {
                wdVar.ud(i10);
            } catch (Throwable unused) {
            }
        }
    }

    @UiThread
    public void qdl(final boolean z10, final float f10) {
        if (com.bykv.vk.openvk.qdl.qdl.ud.ud.qdl.qdl()) {
            ud(z10, f10);
        } else {
            mzz().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fs.mo.5
                @Override // java.lang.Runnable
                public void run() {
                    mo.this.ud(z10, f10);
                }
            });
        }
    }

    @UiThread
    public void qdl(@Nullable final View view, @Nullable final FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (com.bykv.vk.openvk.qdl.qdl.ud.ud.qdl.qdl()) {
            ud(view, friendlyObstructionPurpose);
        } else {
            mzz().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fs.mo.8
                @Override // java.lang.Runnable
                public void run() {
                    mo.this.ud(view, friendlyObstructionPurpose);
                }
            });
        }
    }

    @UiThread
    public void qdl(final long j10, final boolean z10) {
        if (com.bykv.vk.openvk.qdl.qdl.ud.ud.qdl.qdl()) {
            ud(j10, z10);
        } else {
            mzz().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fs.mo.9
                @Override // java.lang.Runnable
                public void run() {
                    mo.this.ud(j10, z10);
                }
            });
        }
    }

    @UiThread
    public void qdl(final boolean z10) {
        if (com.bykv.vk.openvk.qdl.qdl.ud.ud.qdl.qdl()) {
            ud(z10);
        } else {
            mzz().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fs.mo.10
                @Override // java.lang.Runnable
                public void run() {
                    mo.this.ud(z10);
                }
            });
        }
    }

    @UiThread
    public void qdl(final int i10) {
        if (com.bykv.vk.openvk.qdl.qdl.ud.ud.qdl.qdl()) {
            ud(i10);
        } else {
            mzz().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fs.mo.2
                @Override // java.lang.Runnable
                public void run() {
                    mo.this.ud(i10);
                }
            });
        }
    }
}
