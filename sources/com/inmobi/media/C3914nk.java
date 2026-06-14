package com.inmobi.media;

import java.util.TimerTask;

/* JADX INFO: renamed from: com.inmobi.media.nk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3914nk extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3939ok f39115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte f39116b;

    public C3914nk(C3939ok c3939ok, byte b10) {
        this.f39115a = c3939ok;
        this.f39116b = b10;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f39115a.b(this.f39116b);
    }
}
