package com.mbridge.msdk.dycreator.wrapper;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.dycreator.engine.b;
import com.mbridge.msdk.dycreator.error.a;
import com.mbridge.msdk.dycreator.utils.f;
import com.mbridge.msdk.dycreator.viewmodel.BaseViewModel;
import com.mbridge.msdk.dycreator.viewmodel.MBCommonViewVModel;
import com.mbridge.msdk.dycreator.viewmodel.MBRewardViewVModel;
import com.mbridge.msdk.dycreator.viewmodel.MBSplashViewVModel;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.File;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class DynamicViewCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile DynamicViewCreator f48217a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f48218b = -201;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f48219a;

        static {
            int[] iArr = new int[DyAdType.values().length];
            f48219a = iArr;
            try {
                iArr[DyAdType.SPLASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48219a[DyAdType.REWARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private DynamicViewCreator() {
        b.a().a(c.n().d());
    }

    private View a(Context context, DyOption dyOption) {
        List<String> fileDirs;
        ViewGroup viewGroup = null;
        if (dyOption == null || (fileDirs = dyOption.getFileDirs()) == null) {
            return null;
        }
        for (int i10 = 0; i10 < fileDirs.size(); i10++) {
            try {
                if (!TextUtils.isEmpty(fileDirs.get(i10))) {
                    if (i10 == 0) {
                        viewGroup = (ViewGroup) f.a(context).a(fileDirs.get(i10));
                    } else {
                        a(context, viewGroup, fileDirs.get(i10));
                    }
                }
            } catch (Exception e10) {
                q0.b("DynamicViewCreator", e10.getMessage());
            }
        }
        return viewGroup;
    }

    public static DynamicViewCreator getInstance() {
        if (f48217a == null) {
            synchronized (DynamicViewCreator.class) {
                try {
                    if (f48217a == null) {
                        f48217a = new DynamicViewCreator();
                    }
                } finally {
                }
            }
        }
        return f48217a;
    }

    public void createDynamicView(DyOption dyOption, DynamicViewBackListener dynamicViewBackListener) {
        BaseViewModel mBSplashViewVModel;
        BaseViewModel mBCommonViewVModel;
        if (dyOption == null) {
            dynamicViewBackListener.viewCreateFail(new a(com.mbridge.msdk.dycreator.error.b.NOT_FOUND_DYNAMIC_OPTION));
            return;
        }
        if (dynamicViewBackListener == null) {
            return;
        }
        Context contextD = c.n().d();
        if (contextD == null) {
            dynamicViewBackListener.viewCreateFail(new a(com.mbridge.msdk.dycreator.error.b.NOT_FOUND_CONTEXT));
            return;
        }
        if (a(dyOption, dynamicViewBackListener, new String[0])) {
            try {
                View viewA = a(contextD, dyOption);
                if (viewA == null) {
                    dynamicViewBackListener.viewCreateFail(new a(com.mbridge.msdk.dycreator.error.b.FILE_CREATE_VIEW_FILE));
                    return;
                }
                int i10 = AnonymousClass1.f48219a[dyOption.getDyAdType().ordinal()];
                if (i10 == 1) {
                    mBSplashViewVModel = new MBSplashViewVModel(dyOption);
                } else {
                    if (i10 != 2) {
                        mBCommonViewVModel = new MBCommonViewVModel();
                        mBCommonViewVModel.setDynamicViewBackListener(dynamicViewBackListener);
                        com.mbridge.msdk.dycreator.binding.b.a().a(mBCommonViewVModel);
                        mBCommonViewVModel.setModelDataAndBind();
                        dynamicViewBackListener.viewCreatedSuccess(viewA);
                    }
                    mBSplashViewVModel = new MBRewardViewVModel(dyOption);
                }
                mBCommonViewVModel = mBSplashViewVModel;
                mBCommonViewVModel.setDynamicViewBackListener(dynamicViewBackListener);
                com.mbridge.msdk.dycreator.binding.b.a().a(mBCommonViewVModel);
                mBCommonViewVModel.setModelDataAndBind();
                dynamicViewBackListener.viewCreatedSuccess(viewA);
            } catch (Exception e10) {
                q0.b("DynamicViewCreator", e10.getMessage());
                dynamicViewBackListener.viewCreateFail(new a(f48218b, e10.getMessage()));
            }
        }
    }

    private void a(Context context, ViewGroup viewGroup, String str) {
        if (context == null || viewGroup == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("folder_dir");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(jSONObject.optString("ext_template"));
            if (jSONArray.length() == 0) {
                return;
            }
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                if (jSONObject2 != null) {
                    View viewA = f.a(context).a(string + File.separator + jSONObject2.optString("name"));
                    if (viewA != null) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("layout");
                        if (jSONObject3 != null) {
                            a(context, viewGroup, viewA, jSONObject3);
                        } else {
                            viewGroup.addView(viewA, 3);
                        }
                    }
                }
            }
        } catch (Exception e10) {
            q0.b("DynamicViewCreator", e10.getMessage());
        }
    }

    public View createDynamicView(DyOption dyOption) {
        Context contextD;
        if (dyOption == null || (contextD = c.n().d()) == null) {
            return null;
        }
        return a(contextD, dyOption);
    }

    private void a(Context context, ViewGroup viewGroup, View view, JSONObject jSONObject) {
        if (context == null || viewGroup == null || view == null || jSONObject == null) {
            return;
        }
        try {
            String strOptString = jSONObject.optString("parent_id");
            if (!TextUtils.isEmpty(strOptString)) {
                viewGroup = (ViewGroup) f.a(context).a(viewGroup, strOptString);
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            String strOptString2 = jSONObject.optString("below", "");
            if (!TextUtils.isEmpty(strOptString2)) {
                layoutParams.addRule(3, strOptString2.hashCode());
            }
            String strOptString3 = jSONObject.optString("left_of", "");
            if (!TextUtils.isEmpty(strOptString3)) {
                layoutParams.addRule(0, strOptString3.hashCode());
            }
            String strOptString4 = jSONObject.optString("right_of", "");
            if (!TextUtils.isEmpty(strOptString4)) {
                layoutParams.addRule(1, strOptString4.hashCode());
            }
            int iOptInt = jSONObject.optInt(FirebaseAnalytics.Param.INDEX, -2);
            int iOptInt2 = jSONObject.optInt("visibility", -1);
            if (iOptInt2 != -1) {
                view.setVisibility(iOptInt2);
            }
            if (iOptInt != -2) {
                viewGroup.addView(view, iOptInt, layoutParams);
            } else {
                viewGroup.addView(view, layoutParams);
            }
        } catch (Exception e10) {
            q0.b("DynamicViewCreator", e10.getMessage());
        }
    }

    private boolean a(DyOption dyOption, DynamicViewBackListener dynamicViewBackListener, String... strArr) {
        boolean z10 = true;
        if (dyOption != null) {
            if (dyOption.getCampaignEx() == null) {
                dynamicViewBackListener.viewCreateFail(new a(com.mbridge.msdk.dycreator.error.b.NOT_FOUND_CAMPAIGN));
                z10 = false;
            }
            if (dyOption.getFile() == null && dyOption.getFileDirs() != null) {
                dynamicViewBackListener.viewCreateFail(new a(com.mbridge.msdk.dycreator.error.b.BIND_DATA_FILE_OR_DIR));
                z10 = false;
            }
            if (strArr != null && strArr.length > 0) {
                for (String str : strArr) {
                    if (TextUtils.isEmpty(str)) {
                        z10 = false;
                    }
                }
            }
        }
        return z10;
    }
}
