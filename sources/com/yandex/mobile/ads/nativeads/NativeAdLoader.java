package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import eg.i;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.bz1;
import yads.cz1;
import yads.e9;
import yads.iz1;
import yads.p00;
import yads.pr3;
import yads.s00;
import yads.wq3;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/mobile/ads/nativeads/NativeAdLoader;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "<init>", "(Landroid/content/Context;)V", "Lcom/yandex/mobile/ads/nativeads/NativeAdLoadListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setNativeAdLoadListener", "(Lcom/yandex/mobile/ads/nativeads/NativeAdLoadListener;)V", "Lcom/yandex/mobile/ads/nativeads/NativeAdRequestConfiguration;", "nativeAdRequestConfiguration", "loadAd", "(Lcom/yandex/mobile/ads/nativeads/NativeAdRequestConfiguration;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
public class NativeAdLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s00 f68260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f68261b = new e();

    public NativeAdLoader(@NotNull Context context) {
        this.f68260a = new s00(context, new pr3(context));
    }

    public final void loadAd(@NotNull NativeAdRequestConfiguration nativeAdRequestConfiguration) {
        e9 e9VarA = this.f68261b.a(nativeAdRequestConfiguration);
        s00 s00Var = this.f68260a;
        i.d(s00Var.f115656c, null, null, new p00(s00Var, e9VarA, null), 3, null);
    }

    @MainThread
    public final void setNativeAdLoadListener(@Nullable NativeAdLoadListener listener) {
        wq3 wq3Var = listener != null ? new wq3(listener) : null;
        bz1 bz1Var = this.f68260a.f115657d;
        bz1Var.f109160e.a();
        bz1Var.f109161f = wq3Var;
        Iterator it = bz1Var.f109159d.iterator();
        while (it.hasNext()) {
            iz1 iz1Var = ((cz1) it.next()).f109669b.f118874x;
            iz1Var.f112194d = wq3Var;
            iz1Var.f112193c.a(wq3Var, null, null);
        }
    }
}
