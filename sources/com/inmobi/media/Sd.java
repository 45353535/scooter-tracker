package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes9.dex */
public final class Sd implements InterfaceC3680ec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f37711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Qm f37712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3903n9 f37713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f37714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EnumC4034sg f37715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableSharedFlow f37716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RelativeLayout f37717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MediaPlayer f37718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3579ae f37719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3717fn f37720j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C3967pn f37721k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rd f37722l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final MutableSharedFlow f37723m;

    public Sd(Context context, CoroutineScope coroutineScope, Qm config, C3903n9 c3903n9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f37711a = coroutineScope;
        this.f37712b = config;
        this.f37713c = c3903n9;
        this.f37714d = new ArrayList();
        this.f37715e = EnumC4034sg.f39532a;
        MutableSharedFlow mutableSharedFlowB = hg.c0.b(0, 0, null, 7, null);
        this.f37716f = mutableSharedFlowB;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f37717g = relativeLayout;
        Context context2 = relativeLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        MediaPlayer mediaPlayerA = Rm.a(context2);
        this.f37718h = mediaPlayerA;
        this.f37719i = new C3579ae(relativeLayout, coroutineScope, mediaPlayerA, config, mutableSharedFlowB);
        this.f37720j = new C3717fn(mediaPlayerA, coroutineScope, config.f37619c.f36859f, mutableSharedFlowB);
        this.f37721k = new C3967pn(coroutineScope, mediaPlayerA, relativeLayout, config, c3903n9);
        this.f37722l = new Rd(this);
        this.f37723m = mutableSharedFlowB;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.ArrayList r7, kotlin.coroutines.jvm.internal.d r8) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Sd.a(java.util.ArrayList, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
