package net.pubnative.lite.sdk.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.C4240b4;
import java.lang.ref.WeakReference;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.network.ApiExecutor;
import net.pubnative.lite.sdk.utils.reflection.MethodBuilderFactory;
import net.pubnative.lite.sdk.utils.reflection.ReflectionUtils;

/* JADX INFO: loaded from: classes3.dex */
public class HyBidAdvertisingId {
    private static final String TAG = "HyBidAdvertisingId";
    private static final String sAdvertisingIdClientClassName = "com.google.android.gms.ads.identifier.AdvertisingIdClient";
    private final WeakReference<Context> mContextRef;

    public interface Listener {
        void onHyBidAdvertisingIdFinish(String str, Boolean bool);
    }

    public HyBidAdvertisingId(Context context) {
        this.mContextRef = new WeakReference<>(context);
    }

    public static /* synthetic */ void a(Listener listener, String str, boolean z10) {
        if (listener != null) {
            listener.onHyBidAdvertisingIdFinish(str, Boolean.valueOf(z10));
        }
    }

    public static /* synthetic */ void b(HyBidAdvertisingId hyBidAdvertisingId, Listener listener) {
        if (hyBidAdvertisingId.mContextRef.get() != null) {
            try {
                ReflectionUtils.MethodBuilder methodBuilderCreate = MethodBuilderFactory.create(null, "getAdvertisingIdInfo");
                int i10 = AdvertisingIdClient.f25284a;
                Object objExecute = methodBuilderCreate.setStatic(AdvertisingIdClient.class).addParam(Context.class, hyBidAdvertisingId.mContextRef.get()).execute();
                post(listener, hyBidAdvertisingId.reflectedGetAdvertisingId(objExecute, null), hyBidAdvertisingId.reflectedIsLimitAdTrackingEnabled(objExecute, false));
            } catch (Exception e10) {
                HyBid.reportException(e10);
                Logger.e(TAG, "Unable to obtain Advertising ID.");
            }
        }
    }

    private static void post(final Listener listener, final String str, final boolean z10) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: net.pubnative.lite.sdk.utils.d
            @Override // java.lang.Runnable
            public final void run() {
                HyBidAdvertisingId.a(listener, str, z10);
            }
        }, 0L);
    }

    private String reflectedGetAdvertisingId(Object obj, String str) {
        try {
            return (String) MethodBuilderFactory.create(obj, "getId").execute();
        } catch (Exception e10) {
            HyBid.reportException(e10);
            return str;
        }
    }

    private boolean reflectedIsLimitAdTrackingEnabled(Object obj, boolean z10) {
        try {
            Boolean bool = (Boolean) MethodBuilderFactory.create(obj, C4240b4.j.M).execute();
            return bool != null ? bool.booleanValue() : z10;
        } catch (Exception e10) {
            HyBid.reportException(e10);
            return z10;
        }
    }

    public void execute(final Listener listener) {
        ApiExecutor.getInstance().execute(new Runnable() { // from class: net.pubnative.lite.sdk.utils.c
            @Override // java.lang.Runnable
            public final void run() {
                HyBidAdvertisingId.b(this.f95966b, listener);
            }
        });
    }
}
