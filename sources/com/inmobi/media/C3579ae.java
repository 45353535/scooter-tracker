package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.RelativeLayout;
import com.inmobi.media.C3579ae;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: renamed from: com.inmobi.media.ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3579ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f38198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f38199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaPlayer f38200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Qm f38201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutableSharedFlow f38202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Q1 f38203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RelativeLayout f38204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f38205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f38206i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3799j5 f38207j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3799j5 f38208k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C3614bn f38209l;

    public C3579ae(RelativeLayout parentView, CoroutineScope coroutineScope, MediaPlayer mediaPlayer, Qm config, MutableSharedFlow mediaPlayerFlow) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(mediaPlayerFlow, "mediaPlayerFlow");
        this.f38198a = parentView;
        this.f38199b = coroutineScope;
        this.f38200c = mediaPlayer;
        this.f38201d = config;
        this.f38202e = mediaPlayerFlow;
        Context context = parentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Q1 q12 = new Q1(context);
        this.f38203f = q12;
        RelativeLayout relativeLayout = new RelativeLayout(parentView.getContext());
        this.f38204g = relativeLayout;
        this.f38205h = J5.b();
        this.f38209l = new C3614bn(coroutineScope, relativeLayout, config.f37619c, mediaPlayerFlow);
        Vd listener = new Vd(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        q12.f37567c = new WeakReference(listener);
        Context context2 = relativeLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f38207j = new C3799j5(context2, (byte) 9, null);
        Context context3 = relativeLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.f38208k = new C3799j5(context3, (byte) 10, null);
        b();
        relativeLayout.setWillNotDraw(true);
        relativeLayout.setBackgroundColor(0);
        Rm.a(mediaPlayer, q12);
    }

    public static final void a(C3579ae c3579ae, View view) {
        P4.a(c3579ae.f38199b, new Zd(c3579ae, null));
    }

    public final void b() {
        this.f38207j.setOnClickListener(new View.OnClickListener() { // from class: w3.w5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3579ae.a(this.f107364b, view);
            }
        });
        this.f38208k.setOnClickListener(new View.OnClickListener() { // from class: w3.x5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3579ae.b(this.f107376b, view);
            }
        });
    }

    public static final void b(C3579ae c3579ae, View view) {
        c3579ae.a();
        c3579ae.f38203f.a();
    }

    public final void a() {
        MediaPlayer mediaPlayer = this.f38200c;
        Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        try {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } catch (IllegalStateException unused) {
        }
        a(this.f38207j, this.f38208k);
        P4.a(this.f38202e, this.f38199b, new S1(0.0f, true));
        this.f38206i = true;
    }

    public final void a(C3799j5 c3799j5, C3799j5 c3799j52) {
        if (Intrinsics.areEqual(c3799j5.getParent(), this.f38204g)) {
            return;
        }
        this.f38204g.removeView(c3799j52);
        O1 audioConfig = this.f38201d.f37620d;
        float f10 = this.f38205h;
        Intrinsics.checkNotNullParameter(c3799j5, "<this>");
        Intrinsics.checkNotNullParameter(audioConfig, "audioConfig");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (audioConfig.f37468b * f10), (int) (audioConfig.f37469c * f10));
        int i10 = audioConfig.f37471e;
        if (i10 == 0) {
            layoutParams.addRule(9, -1);
            layoutParams.addRule(10, -1);
        } else if (i10 == 1) {
            layoutParams.addRule(11, -1);
            layoutParams.addRule(10, -1);
        } else if (i10 == 2) {
            layoutParams.addRule(9, -1);
            layoutParams.addRule(12, -1);
        } else if (i10 == 3) {
            layoutParams.addRule(11, -1);
            layoutParams.addRule(12, -1);
        }
        Yb yb2 = audioConfig.f37470d;
        layoutParams.leftMargin = (int) (yb2.f38043a * f10);
        layoutParams.topMargin = (int) (yb2.f38044b * f10);
        layoutParams.rightMargin = (int) (yb2.f38045c * f10);
        layoutParams.bottomMargin = (int) (yb2.f38046d * f10);
        c3799j5.setLayoutParams(layoutParams);
        this.f38204g.addView(c3799j5);
    }
}
