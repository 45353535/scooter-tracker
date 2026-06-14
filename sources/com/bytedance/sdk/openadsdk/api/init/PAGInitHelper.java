package com.bytedance.sdk.openadsdk.api.init;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.common.mzz;
import com.bytedance.sdk.openadsdk.core.fs;
import com.bytedance.sdk.openadsdk.core.qdl.qdl;
import com.bytedance.sdk.openadsdk.core.to.lnr;
import com.bytedance.sdk.openadsdk.core.tvp;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.mml.qdl.ud;
import com.bytedance.sdk.openadsdk.multipro.mml.mml;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.ekw;
import com.bytedance.sdk.openadsdk.utils.uw;
import com.ironsource.N6;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class PAGInitHelper {
    public static final List<PAGSdk.PAGInitCallback> CALLBACK_LIST = new ArrayList();
    public static float animationScale = 1.0f;

    public static void initAPM() {
        if (mzz.qdl()) {
            return;
        }
        try {
            String strMml = tvp.ud().mml();
            if (TextUtils.isEmpty(strMml)) {
                return;
            }
            ApmHelper.initApm(yt.qdl(), new PAGConfig.Builder().appId(strMml).build());
        } catch (Exception unused) {
        }
    }

    public static void initAnimationScale(Context context) {
        try {
            float f10 = Settings.System.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
            animationScale = f10;
            if (f10 <= 0.0f) {
                animationScale = 1.0f;
            }
        } catch (Throwable unused) {
            animationScale = 1.0f;
        }
    }

    public static void initMemoryData() {
        yt.mml();
        mml.qdl("ttopenadsdk", "a", 0);
        mml.qdl("sp_global_file", "a", 0);
        mml.qdl("sp_global_privacy", "a", 0);
        mml.qdl("sp_global_app_id", "a", 0);
        mml.qdl("sp_global_icon_id", "a", 0);
        mml.qdl("tpl_fetch_model", "a", 0);
        mml.qdl("tt_sp", "a", 0);
        mml.qdl("pag_sp_bad_par", "did");
        mml.qdl("pag_sp_bad_par", N6.V0);
    }

    public static void maybeAsyncInitTask(Context context) {
        qdl.qdl(context);
        ekw.qdl();
        ax.qdl(context);
        qdl();
        yt.mzz();
        String strQdl = fs.qdl(context);
        lnr.ud(strQdl);
        ud.qdl(strQdl, true);
        com.bytedance.sdk.component.adexpress.qdl.ud.ud.qdl();
        com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.qdl().ud();
        initAnimationScale(context);
    }

    private static void qdl() {
        com.bytedance.sdk.openadsdk.core.lnr.qdl().qdl(CommonUrlParts.UUID, uw.qdl());
    }
}
