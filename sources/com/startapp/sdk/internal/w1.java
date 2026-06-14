package com.startapp.sdk.internal;

import android.app.Activity;
import androidx.annotation.NonNull;
import java.net.URLDecoder;
import java.util.Map;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;

/* JADX INFO: loaded from: classes11.dex */
public abstract class w1 implements rc {
    private static final String LOG_TAG = "w1";
    protected v1 openListener;

    public w1(@NonNull v1 v1Var) {
        this.openListener = v1Var;
    }

    public void applyOrientationProperties(Activity activity, ad adVar) {
        try {
            int i10 = 0;
            int i11 = activity.getResources().getConfiguration().orientation == 1 ? 1 : 0;
            int i12 = adVar.f64268b;
            if (i12 == 0) {
                i10 = 1;
            } else if (i12 != 1) {
                i10 = adVar.f64267a ? -1 : i11;
            }
            int i13 = q0.f65128a;
            try {
                activity.setRequestedOrientation(i10);
            } catch (Throwable unused) {
            }
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }

    @Override // com.startapp.sdk.internal.rc
    public abstract void close();

    @Override // com.startapp.sdk.internal.rc
    public void createCalendarEvent(String str) {
        isFeatureSupported(MRAIDNativeFeature.CALENDAR);
    }

    @Override // com.startapp.sdk.internal.rc
    public void expand(String str) {
    }

    public abstract boolean isFeatureSupported(String str);

    @Override // com.startapp.sdk.internal.rc
    public boolean open(String str) {
        try {
            String strTrim = URLDecoder.decode(str, "UTF-8").trim();
            return strTrim.startsWith(MRAIDNativeFeature.SMS) ? openSMS(strTrim) : strTrim.startsWith(MRAIDNativeFeature.TEL) ? openTel(strTrim) : this.openListener.a(strTrim);
        } catch (Exception unused) {
            return this.openListener.a(str);
        }
    }

    public boolean openSMS(String str) {
        isFeatureSupported(MRAIDNativeFeature.SMS);
        return true;
    }

    public boolean openTel(String str) {
        isFeatureSupported(MRAIDNativeFeature.TEL);
        return true;
    }

    @Override // com.startapp.sdk.internal.rc
    public void playVideo(String str) {
        isFeatureSupported(MRAIDNativeFeature.INLINE_VIDEO);
    }

    @Override // com.startapp.sdk.internal.rc
    public void resize() {
    }

    @Override // com.startapp.sdk.internal.rc
    public void setExpandProperties(Map<String, String> map) {
    }

    @Override // com.startapp.sdk.internal.rc
    public abstract void setOrientationProperties(Map<String, String> map);

    @Override // com.startapp.sdk.internal.rc
    public void setResizeProperties(@NonNull Map<String, String> map) {
    }

    @Override // com.startapp.sdk.internal.rc
    public void storePicture(String str) {
        isFeatureSupported(MRAIDNativeFeature.STORE_PICTURE);
    }

    @Override // com.startapp.sdk.internal.rc
    public abstract void useCustomClose(String str);
}
