package com.appodeal.ads;

import android.app.Activity;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.utils.exception_handler.AppodealException;

/* JADX INFO: loaded from: classes6.dex */
public final class AppodealUnityBannerView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static AppodealUnityBannerView f11830b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vc f11831a;

    public static AppodealUnityBannerView getInstance() {
        if (f11830b == null) {
            f11830b = new AppodealUnityBannerView();
        }
        return f11830b;
    }

    public final boolean a(Activity activity, int i10, int i11, int i12, String str) {
        int i13;
        FrameLayout mrecView;
        if (activity == null) {
            Log.log(new AppodealException("Unable to show an ad: activity = null"));
            return false;
        }
        if (str == null) {
            Log.log(new AppodealException("Unable to show an ad: placement = null"));
            return false;
        }
        if (i10 == 64) {
            mrecView = Appodeal.getBannerView(activity);
            i13 = 320;
        } else {
            i13 = 300;
            mrecView = i10 == 256 ? Appodeal.getMrecView(activity) : null;
        }
        FrameLayout frameLayout = mrecView;
        if (frameLayout == null) {
            Log.log(new AppodealException("Unable to show an ad: adView = null"));
            return false;
        }
        activity.runOnUiThread(new cc(this, activity, i10, i11 != -1 ? Math.round(j2.t(activity) * i13) : -1, i11, i12, frameLayout));
        return Appodeal.show(activity, i10, str);
    }

    public void hideBannerView(Activity activity) {
        activity.runOnUiThread(new pc(this, activity, 4));
    }

    public void hideMrecView(Activity activity) {
        activity.runOnUiThread(new pc(this, activity, 256));
    }

    public boolean showBannerView(@NonNull Activity activity, int i10, int i11, @NonNull String str) {
        return a(activity, 64, i10, i11, str);
    }

    public boolean showMrecView(@NonNull Activity activity, int i10, int i11, @NonNull String str) {
        return a(activity, 256, i10, i11, str);
    }
}
