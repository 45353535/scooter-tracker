package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.view.WindowManager;
import com.fyber.inneractive.sdk.config.IAConfigManager;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f23213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f23217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f23218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f23219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f23221i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f23222j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f23223k;

    public h() {
        double refreshRate = ((WindowManager) IAConfigManager.O.f20316v.a().getSystemService("window")).getDefaultDisplay().getRefreshRate();
        this.f23214b = true;
        this.f23213a = g.f23208e;
        long j10 = (long) (1.0E9d / refreshRate);
        this.f23215c = j10;
        this.f23216d = (j10 * 80) / 100;
    }
}
