package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Fn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3635ci f36893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f36894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdConfig f36895c;

    public Fn(GestureDetectorOnGestureListenerC3635ci container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f36893a = container;
        this.f36895c = container.getAdConfig();
    }

    public void a() {
        WeakReference weakReference = this.f36894b;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    public abstract void a(Context context, byte b10);

    public abstract void a(View view);

    public abstract void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose);

    public abstract void a(Map map);

    public View b() {
        WeakReference weakReference = this.f36894b;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public abstract View c();

    public abstract void d();
}
