package com.inmobi.media;

import android.view.OrientationEventListener;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes9.dex */
public final class O8 extends OrientationEventListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f37482d = {kotlin.jvm.internal.v0.f(new kotlin.jvm.internal.g0(O8.class, "currentOrientation", "getCurrentOrientation()Lcom/inmobi/ads/rendering/orientation/Orientation;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiAdActivity f37483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f37484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N8 f37485c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O8(InMobiAdActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f37483a = activity;
        this.f37484b = new HashSet();
        kotlin.properties.a aVar = kotlin.properties.a.f93338a;
        this.f37485c = new N8(Ef.a(J5.g()), this);
    }

    public final void a(Ff orientationProperties) {
        Intrinsics.checkNotNullParameter(orientationProperties, "orientationProperties");
        try {
            if (orientationProperties.f36850a) {
                this.f37483a.setRequestedOrientation(13);
                return;
            }
            String str = orientationProperties.f36851b;
            if (Intrinsics.areEqual(str, "landscape")) {
                this.f37483a.setRequestedOrientation(6);
            } else if (Intrinsics.areEqual(str, "portrait")) {
                this.f37483a.setRequestedOrientation(7);
            } else {
                this.f37483a.setRequestedOrientation(13);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public final void b() {
        int i10 = this.f37483a.getResources().getConfiguration().orientation;
        byte bG = J5.g();
        int i11 = 1;
        if (bG != 1 && bG != 2 && (bG == 3 || bG == 4)) {
            i11 = 2;
        }
        if (i10 == i11) {
            this.f37485c.setValue(this, f37482d[0], Ef.a(J5.g()));
        }
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        b();
    }

    public final void a() {
        if (this.f37484b.isEmpty()) {
            disable();
        } else {
            enable();
        }
    }
}
