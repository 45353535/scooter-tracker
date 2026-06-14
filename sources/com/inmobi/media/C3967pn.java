package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.Surface;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.pn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3967pn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f39310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaPlayer f39311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3903n9 f39312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f39313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f39314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ud f39315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Surface f39316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Ij f39317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Wm f39318i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3942on f39319j;

    public C3967pn(CoroutineScope coroutineScope, MediaPlayer mediaPlayer, RelativeLayout mediaPlayerLayout, Qm config, C3903n9 c3903n9) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        Intrinsics.checkNotNullParameter(mediaPlayerLayout, "mediaPlayerLayout");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f39310a = coroutineScope;
        this.f39311b = mediaPlayer;
        this.f39312c = c3903n9;
        this.f39313d = new AtomicBoolean(false);
        this.f39314e = new ArrayList();
        Context context = mediaPlayerLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C3750h5 c3750h5 = new C3750h5(context);
        this.f39315f = new Ud(c3750h5, mediaPlayerLayout, mediaPlayer, c3903n9);
        this.f39318i = new Wm(coroutineScope, c3750h5, config.f37621e);
        this.f39319j = new C3942on(this);
    }

    public final void a() {
        if (this.f39316g != null && this.f39313d.get()) {
            C4134wg c4134wg = (C4134wg) this.f39318i.f37976d.getValue();
            c4134wg.f39857f.set(false);
            c4134wg.a();
        } else {
            C4134wg c4134wg2 = (C4134wg) this.f39318i.f37976d.getValue();
            c4134wg2.f39853b.setValue(Mn.f37387a);
            c4134wg2.f39857f.set(true);
            H6.a(c4134wg2.f39856e);
            c4134wg2.f39856e = null;
        }
    }

    public final void b() {
        P4.a(this.f39314e);
        Ud ud2 = this.f39315f;
        ud2.f37851e = null;
        ud2.f37847a.setSurfaceTextureListener(null);
        ud2.f37849c.setOnVideoSizeChangedListener(null);
        C4134wg c4134wg = (C4134wg) this.f39318i.f37976d.getValue();
        c4134wg.f39857f.set(true);
        H6.a(c4134wg.f39856e);
        c4134wg.f39856e = null;
        Surface surface = this.f39316g;
        if (surface != null) {
            surface.release();
        }
        this.f39316g = null;
        this.f39317h = null;
    }
}
