package com.inmobi.media;

import android.app.Activity;
import com.inmobi.media.E0;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class E0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static A0 f36763b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static CoroutineScope f36766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static CoroutineScope f36767f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f36762a = lf.i.a(new Function0() { // from class: w3.w
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return E0.a();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy f36764c = lf.i.a(new Function0() { // from class: w3.x
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return E0.b();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B0 f36765d = new B0();

    public static final H0 a() {
        return new H0(AbstractC3754h9.b());
    }

    public static final CopyOnWriteArrayList b() {
        return new CopyOnWriteArrayList();
    }

    public static void a(Activity activity, GestureDetectorOnGestureListenerC3635ci renderView, String beaconUrl, boolean z10, JSONObject extras, Qh listener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(beaconUrl, "url");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(listener, "listener");
        renderView.getAdQualityManager().a(activity, beaconUrl, z10, extras, listener);
        A0 a02 = f36763b;
        if (a02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            a02 = null;
        }
        a02.getClass();
        Intrinsics.checkNotNullParameter(beaconUrl, "beaconUrl");
        Intrinsics.checkNotNullParameter(listener, "listener");
        a02.f36537c.put(beaconUrl, new WeakReference(listener));
        String creativeID = renderView.getCreativeID();
        if (creativeID.length() > 0) {
            C3774i4 c3774i4 = Y3.f38021a;
            Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
            AdConfig adConfig = (AdConfig) Y3.f38021a.a(AdConfig.class);
            Lazy lazy = f36764c;
            if (((CopyOnWriteArrayList) lazy.getValue()).size() < adConfig.getAdReport().getCridls()) {
                ((CopyOnWriteArrayList) lazy.getValue()).add(creativeID);
            }
        }
    }

    public static void a(GestureDetectorOnGestureListenerC3635ci adView, GestureDetectorOnGestureListenerC3635ci renderView, String beaconUrl, boolean z10, JSONObject extras, Qh listener) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(beaconUrl, "url");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(listener, "listener");
        renderView.getAdQualityManager().a(adView, beaconUrl, z10, extras, listener);
        A0 a02 = f36763b;
        if (a02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            a02 = null;
        }
        a02.getClass();
        Intrinsics.checkNotNullParameter(beaconUrl, "beaconUrl");
        Intrinsics.checkNotNullParameter(listener, "listener");
        a02.f36537c.put(beaconUrl, new WeakReference(listener));
        String creativeID = renderView.getCreativeID();
        if (creativeID.length() > 0) {
            C3774i4 c3774i4 = Y3.f38021a;
            Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
            AdConfig adConfig = (AdConfig) Y3.f38021a.a(AdConfig.class);
            Lazy lazy = f36764c;
            if (((CopyOnWriteArrayList) lazy.getValue()).size() < adConfig.getAdReport().getCridls()) {
                ((CopyOnWriteArrayList) lazy.getValue()).add(creativeID);
            }
        }
    }
}
