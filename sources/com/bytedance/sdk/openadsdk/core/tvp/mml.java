package com.bytedance.sdk.openadsdk.core.tvp;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class mml {
    private static volatile mml lnr;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static int f17525ud;
    private final List<mzz> qdl = new ArrayList();

    public static mml qdl() {
        if (lnr == null) {
            synchronized (mml.class) {
                try {
                    if (lnr == null) {
                        lnr = new mml();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return lnr;
    }

    public int lnr() {
        return this.qdl.size();
    }

    @Nullable
    public mzz ud() {
        mzz mzzVarRemove;
        if (lnr() > 0 && (mzzVarRemove = this.qdl.remove(0)) != null) {
            return mzzVarRemove;
        }
        return null;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void lnr(mzz mzzVar) {
        if (mzzVar == null || mzzVar.getWebView() == null) {
            return;
        }
        if (mzzVar.getParent() != null) {
            ((ViewGroup) mzzVar.getParent()).removeView(mzzVar);
        }
        try {
            mzzVar.removeAllViews();
            mzzVar.wd();
            mzzVar.setWebChromeClient(null);
            mzzVar.setWebViewClient(null);
            mzzVar.setDownloadListener(null);
            mzzVar.setDefaultTextEncodingName("UTF-8");
            mzzVar.setAllowFileAccess(false);
            mzzVar.setJavaScriptEnabled(true);
            mzzVar.setCacheMode(-1);
            mzzVar.setDatabaseEnabled(true);
            mzzVar.setSupportZoom(false);
            mzzVar.getWebView().setLayerType(0, null);
            mzzVar.setBackgroundColor(0);
            mzzVar.getWebView().setHorizontalScrollBarEnabled(false);
            mzzVar.getWebView().setHorizontalScrollbarOverlay(false);
            mzzVar.getWebView().setVerticalScrollBarEnabled(false);
            mzzVar.getWebView().setVerticalScrollbarOverlay(false);
            com.bytedance.sdk.openadsdk.core.widget.qdl.lnr.qdl(mzzVar);
            mzzVar.rdp();
            mzzVar.setMixedContentMode(0);
        } catch (Exception unused) {
        }
    }

    public void ud(mzz mzzVar) {
        if (mzzVar != null) {
            if (this.qdl.size() >= f17525ud) {
                mzzVar.jtx();
            } else {
                if (this.qdl.contains(mzzVar)) {
                    return;
                }
                lnr(mzzVar);
                this.qdl.add(mzzVar);
            }
        }
    }

    @UiThread
    public void qdl(mzz mzzVar) {
        if (mzzVar != null) {
            ud(mzzVar);
        }
    }
}
