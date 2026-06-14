package com.startapp.sdk.internal;

import android.os.SystemClock;
import android.widget.TextView;

/* JADX INFO: loaded from: classes11.dex */
public final class vc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xc f65396a;

    public vc(xc xcVar) {
        this.f65396a = xcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jUptimeMillis = (((long) this.f65396a.f65542a.f65446r) * 1000) - SystemClock.uptimeMillis();
        xc xcVar = this.f65396a;
        long j10 = jUptimeMillis + xcVar.f65542a.f65684y;
        TextView textView = xcVar.f65548g;
        if (textView != null) {
            long j11 = j10 / 1000;
            if (j11 > 0 && j10 % 1000 < 100) {
                j11--;
            }
            textView.setText(String.valueOf(j11));
        }
        if (j10 >= 1000) {
            long j12 = j10 % 1000;
            this.f65396a.f65552k.postDelayed(this, j12 != 0 ? j12 : 1000L);
            return;
        }
        xc xcVar2 = this.f65396a;
        if (xcVar2.f65548g != null) {
            xcVar2.f65549h.setVisibility(8);
            this.f65396a.f65548g.setVisibility(8);
        }
        this.f65396a.f65542a.s();
    }
}
