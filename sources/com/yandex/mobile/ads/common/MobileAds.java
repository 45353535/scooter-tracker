package com.yandex.mobile.ads.common;

import android.content.Context;
import androidx.annotation.MainThread;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import yads.bg1;
import yads.ct1;
import yads.dt1;
import yads.ft1;
import yads.pr3;
import yads.to3;
import yads.ut2;
import yads.vt2;
import yads.wp0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\u0005J\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/yandex/mobile/ads/common/MobileAds;", "", "", "enableLogging", "", "(Z)V", C4240b4.j.f42669b0, "setUserConsent", "ageRestrictedUser", "setAgeRestrictedUser", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/yandex/mobile/ads/common/InitializationListener;", "initializationListener", MobileAdsBridgeBase.initializeMethodName, "(Landroid/content/Context;Lcom/yandex/mobile/ads/common/InitializationListener;)V", "", "getLibraryVersion", "()Ljava/lang/String;", "getLibraryVersion$annotations", "()V", "libraryVersion", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
@MainThread
public final class MobileAds {

    @NotNull
    public static final MobileAds INSTANCE = new MobileAds();

    private MobileAds() {
    }

    public static final void enableLogging(boolean enableLogging) {
        ft1.a(enableLogging);
    }

    @NotNull
    public static final String getLibraryVersion() {
        return "7.17.0";
    }

    public static final void initialize(@NotNull Context context, @NotNull InitializationListener initializationListener) {
        to3 to3Var = new to3(initializationListener);
        pr3 pr3Var = new pr3(context);
        new wp0(new bg1()).a(new ct1(context, pr3Var, to3Var), new dt1(context, pr3Var, to3Var));
    }

    public static final void setAgeRestrictedUser(boolean ageRestrictedUser) {
        ft1.b(ageRestrictedUser);
    }

    public static final void setUserConsent(boolean consent) {
        Object obj = vt2.f117186j;
        vt2 vt2VarA = ut2.a();
        synchronized (vt2.f117186j) {
            vt2VarA.f117189b = Boolean.valueOf(consent);
            Unit unit = Unit.f93236a;
        }
    }
}
