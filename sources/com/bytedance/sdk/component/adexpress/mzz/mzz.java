package com.bytedance.sdk.component.adexpress.mzz;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.bytedance.sdk.component.qdl.aaj;
import com.bytedance.sdk.component.tvp.mo;
import com.bytedance.sdk.component.utils.vu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class mzz {
    private static int jpc = 10;
    private static int mo = 10;
    private static final byte[] mzz = new byte[0];
    private static volatile mzz tvp;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private final AtomicBoolean f16450wd = new AtomicBoolean(false);
    private List<mo> qdl = new ArrayList();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private List<mo> f16449ud = new ArrayList();
    private Map<Integer, lnr> lnr = new HashMap();
    private Map<Integer, mml> mml = new HashMap();

    private mzz() {
        com.bytedance.sdk.component.adexpress.qdl.qdl.lnr lnrVarLnr = com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().lnr();
        if (lnrVarLnr != null) {
            mo = lnrVarLnr.to();
            jpc = lnrVarLnr.rq();
        }
    }

    private void mo(mo moVar) {
        if (moVar == null) {
            return;
        }
        if (vu.ud(moVar.getScene())) {
            vu.qdl(moVar);
            return;
        }
        if (this.qdl.size() >= mo) {
            try {
                Context context = moVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                moVar.jtx();
                return;
            } catch (Throwable th2) {
                th2.getMessage();
                return;
            }
        }
        if (this.qdl.contains(moVar)) {
            return;
        }
        try {
            Context context2 = moVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                moVar.setRecycler(true);
                this.qdl.add(moVar);
                lnr();
            }
        } catch (Throwable th3) {
            lnr();
            th3.getMessage();
        }
    }

    public static mzz qdl() {
        if (tvp == null) {
            synchronized (mzz.class) {
                try {
                    if (tvp == null) {
                        tvp = new mzz();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return tvp;
    }

    @UiThread
    public void lnr(mo moVar) {
        if (moVar == null) {
            return;
        }
        vu.ud(moVar);
        moVar.b_("SDK_INJECT_GLOBAL");
        mzz(moVar);
        mo(moVar);
    }

    public boolean mml(mo moVar) {
        if (moVar == null) {
            return false;
        }
        try {
            Context context = moVar.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            moVar.jtx();
            return true;
        } catch (Throwable th2) {
            th2.getMessage();
            return true;
        }
    }

    public void mzz(mo moVar) {
        WebView webView;
        if (moVar == null || (webView = moVar.getWebView()) == null) {
            return;
        }
        lnr lnrVar = this.lnr.get(Integer.valueOf(webView.hashCode()));
        if (lnrVar != null) {
            lnrVar.qdl(null);
        }
        moVar.b_("SDK_INJECT_GLOBAL");
    }

    @UiThread
    public void ud(mo moVar) {
        if (moVar == null) {
            return;
        }
        vu.ud(moVar);
        moVar.b_("SDK_INJECT_GLOBAL");
        mzz(moVar);
        qdl(moVar);
    }

    public int lnr() {
        return this.qdl.size();
    }

    @Nullable
    public mo ud(Context context, String str) {
        mo.lnr lnrVar = mo.lnr.ADS;
        if (vu.ud(lnrVar)) {
            if (!com.bytedance.sdk.component.adexpress.mml.mzz.qdl(str) || vu.qdl(lnrVar) > 1) {
                return vu.qdl(context, null, 0, lnrVar);
            }
            return null;
        }
        if (lnr() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.mml.mzz.qdl(str) && lnr() <= 1) {
            lnr();
            return null;
        }
        mo moVarRemove = this.qdl.remove(0);
        if (moVarRemove == null) {
            return null;
        }
        try {
            Context context2 = moVarRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                moVarRemove.setRecycler(false);
                lnr();
            }
            return moVarRemove;
        } catch (Throwable unused) {
            lnr();
            return null;
        }
    }

    public int mml() {
        return this.f16449ud.size();
    }

    @Nullable
    public mo qdl(Context context, String str) {
        mo.lnr lnrVar = mo.lnr.ADS_V3;
        if (vu.ud(lnrVar)) {
            if (!com.bytedance.sdk.component.adexpress.mml.mzz.qdl(str) || vu.qdl(lnrVar) > 1) {
                return vu.qdl(context, null, 0, lnrVar);
            }
            return null;
        }
        if (mml() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.mml.mzz.qdl(str) && mml() <= 1) {
            mml();
            return null;
        }
        mo moVarRemove = this.f16449ud.remove(0);
        if (moVarRemove == null) {
            return null;
        }
        try {
            Context context2 = moVarRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                moVarRemove.setRecycler(false);
                mml();
            }
            return moVarRemove;
        } catch (Throwable unused) {
            mml();
            return null;
        }
    }

    public void ud() {
        for (mo moVar : this.qdl) {
            if (moVar != null) {
                try {
                    Context context = moVar.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    }
                    moVar.jtx();
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        }
        this.qdl.clear();
        for (mo moVar2 : this.f16449ud) {
            if (moVar2 != null) {
                try {
                    Context context2 = moVar2.getContext();
                    if (context2 instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    }
                    moVar2.jtx();
                } catch (Throwable th3) {
                    th3.getMessage();
                }
            }
        }
        this.f16449ud.clear();
    }

    public void qdl(mo moVar) {
        if (moVar == null) {
            return;
        }
        if (vu.ud(moVar.getScene())) {
            vu.qdl(moVar);
            return;
        }
        if (this.f16449ud.size() >= jpc) {
            try {
                Context context = moVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                moVar.jtx();
                return;
            } catch (Throwable th2) {
                th2.getMessage();
                return;
            }
        }
        if (this.f16449ud.contains(moVar)) {
            return;
        }
        try {
            Context context2 = moVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                moVar.setRecycler(true);
                this.f16449ud.add(moVar);
                mml();
            }
        } catch (Throwable th3) {
            mml();
            th3.getMessage();
        }
    }

    public void ud(int i10) {
        synchronized (mzz) {
            jpc = i10;
        }
    }

    @SuppressLint({"JavascriptInterface"})
    public void qdl(mo moVar, ud udVar) {
        WebView webView;
        if (moVar == null || udVar == null || (webView = moVar.getWebView()) == null) {
            return;
        }
        lnr lnrVar = this.lnr.get(Integer.valueOf(webView.hashCode()));
        if (lnrVar != null) {
            lnrVar.qdl(udVar);
        } else {
            lnrVar = new lnr(udVar);
            this.lnr.put(Integer.valueOf(webView.hashCode()), lnrVar);
        }
        moVar.qdl(lnrVar, "SDK_INJECT_GLOBAL");
    }

    @SuppressLint({"JavascriptInterface"})
    public void qdl(WebView webView, aaj aajVar, String str) {
        if (webView == null || aajVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        mml mmlVar = this.mml.get(Integer.valueOf(webView.hashCode()));
        if (mmlVar != null) {
            mmlVar.qdl(aajVar);
        } else {
            mmlVar = new mml(aajVar);
            this.mml.put(Integer.valueOf(webView.hashCode()), mmlVar);
        }
        webView.addJavascriptInterface(mmlVar, str);
    }

    public void qdl(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        mml mmlVar = this.mml.get(Integer.valueOf(webView.hashCode()));
        if (mmlVar != null) {
            mmlVar.qdl(null);
        }
        webView.removeJavascriptInterface(str);
    }

    public void qdl(int i10) {
        synchronized (mzz) {
            mo = i10;
        }
    }
}
