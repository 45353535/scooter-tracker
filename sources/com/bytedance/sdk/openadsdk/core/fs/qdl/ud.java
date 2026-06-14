package com.bytedance.sdk.openadsdk.core.fs.qdl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.fs.ud.lnr;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;
import java.io.File;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ud {
    protected int lnr;
    protected double mml;
    public qdl mo;
    public int mzz;
    public int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    protected final Context f17238ud;

    public static class qdl {
        public boolean lnr;
        public int qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        public int f17239ud;
    }

    public ud(Context context, int i10, int i11) {
        this.lnr = 0;
        this.mml = 0.0d;
        if (i11 > 0 && i10 > 0) {
            this.mml = ((double) i10) / ((double) i11);
        }
        float fJpc = ax.jpc(context);
        if (fJpc != 0.0f && i10 > 0) {
            this.lnr = (int) (i10 / fJpc);
        }
        this.f17238ud = context.getApplicationContext();
    }

    public abstract com.bytedance.sdk.openadsdk.core.fs.qdl qdl(String str, File file, List<lnr> list);

    protected void qdl(Exception exc, int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", exc.getMessage());
            jSONObject.put("error_code", i10);
            com.bytedance.sdk.openadsdk.bjy.lnr.qdl().qdl("load_vast", jSONObject);
        } catch (Exception unused) {
        }
    }

    protected boolean qdl(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return Integer.parseInt(str) < 2;
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    protected String qdl(String str, List<lnr> list) {
        int i10 = this.qdl;
        String strMml = null;
        if (i10 >= 5) {
            return null;
        }
        this.qdl = i10 + 1;
        if (str == null) {
            return null;
        }
        try {
            com.bytedance.sdk.component.wd.ud.ud udVarLnr = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().lnr();
            udVarLnr.ud(str);
            com.bytedance.sdk.component.wd.ud udVarQdl = udVarLnr.qdl();
            strMml = udVarQdl.mml();
            udVarQdl.qdl();
            return strMml;
        } catch (Exception e10) {
            qdl(e10, 0);
            if (!list.isEmpty()) {
                lnr.ud((ljh) null, list, com.bytedance.sdk.openadsdk.core.fs.qdl.qdl.WRAPPER_TIMEOUT, -1L, (String) null, (String) null);
            }
            return strMml;
        }
    }
}
