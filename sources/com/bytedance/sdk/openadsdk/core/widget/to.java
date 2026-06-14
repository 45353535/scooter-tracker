package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.ljh;

/* JADX INFO: loaded from: classes6.dex */
public class to extends wd {
    private long qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private long f17581ud;

    public to(@NonNull Context context) {
        super(context);
        setVisibility(8);
        setClickable(true);
    }

    public long getDisplayDuration() {
        if (this.qdl == 0) {
            return 0L;
        }
        if (this.f17581ud == 0) {
            this.f17581ud = SystemClock.elapsedRealtime();
        }
        return this.f17581ud - this.qdl;
    }

    public void lnr() {
        setVisibility(8);
        if (this.qdl != 0) {
            this.f17581ud = SystemClock.elapsedRealtime();
        }
    }

    public boolean mml() {
        return this.qdl > 0 && this.f17581ud > 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.wd
    protected boolean qdl() {
        return false;
    }

    public void ud(ljh ljhVar, int i10) {
        if (isShown()) {
            return;
        }
        ud();
        setVisibility(0);
        this.qdl = SystemClock.elapsedRealtime();
        qdl(ljhVar, i10);
    }
}
