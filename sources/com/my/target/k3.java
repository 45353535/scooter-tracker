package com.my.target;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.UnstableApi;
import com.my.target.instreamads.InstreamAdPlayer;
import com.my.target.y;

/* JADX INFO: loaded from: classes11.dex */
public class k3 extends FrameLayout implements InstreamAdPlayer, y.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f59983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f59984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InstreamAdPlayer.AdPlayerListener f59985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f59986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f59987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f59988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f59989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public y f59990h;

    public k3(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, new z(context));
    }

    @Override // com.my.target.y.a
    public void a(float f10, float f11) {
    }

    @Override // com.my.target.y.a
    public void b() {
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.f59985c;
        if (adPlayerListener != null) {
            adPlayerListener.onAdVideoCompleted();
        }
    }

    @Override // com.my.target.y.a
    public void d() {
        this.f59989g = true;
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.f59985c;
        if (adPlayerListener != null) {
            adPlayerListener.onAdVideoPaused();
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public void destroy() {
        y yVar = this.f59990h;
        if (yVar != null) {
            yVar.destroy();
        }
    }

    @Override // com.my.target.y.a
    public void e() {
    }

    @Override // com.my.target.y.a
    public void f() {
        if (this.f59989g) {
            InstreamAdPlayer.AdPlayerListener adPlayerListener = this.f59985c;
            if (adPlayerListener != null) {
                adPlayerListener.onAdVideoResumed();
            }
            this.f59989g = false;
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    @Nullable
    public InstreamAdPlayer.AdPlayerListener getAdPlayerListener() {
        return this.f59985c;
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public float getAdVideoDuration() {
        y yVar = this.f59990h;
        if (yVar != null) {
            return yVar.getDuration();
        }
        return 0.0f;
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public float getAdVideoPosition() {
        if (this.f59990h != null) {
            return r0.i() / 1000.0f;
        }
        return 0.0f;
    }

    @VisibleForTesting
    public int getPlaceholderHeight() {
        return this.f59987e;
    }

    @VisibleForTesting
    public int getPlaceholderWidth() {
        return this.f59986d;
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    @NonNull
    public View getView() {
        return this;
    }

    @Override // com.my.target.y.a
    public void l() {
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.f59985c;
        if (adPlayerListener != null) {
            adPlayerListener.onAdVideoStopped();
        }
    }

    @Override // com.my.target.y.a
    public void n() {
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[PHI: r0
  0x004c: PHI (r0v11 int) = (r0v7 int), (r0v7 int), (r0v18 int), (r0v18 int) binds: [B:37:0x006b, B:38:0x006d, B:25:0x0041, B:26:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f A[PHI: r0
  0x005f: PHI (r0v10 int) = (r0v4 int), (r0v4 int), (r0v15 int), (r0v15 int) binds: [B:43:0x0080, B:44:0x0082, B:30:0x0054, B:31:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            int r2 = android.view.View.MeasureSpec.getSize(r8)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L11
            r0 = r3
        L11:
            if (r1 != 0) goto L14
            r1 = r3
        L14:
            int r4 = r6.f59987e
            if (r4 == 0) goto L99
            int r5 = r6.f59986d
            if (r5 != 0) goto L1e
            goto L99
        L1e:
            float r8 = (float) r5
            float r4 = (float) r4
            float r8 = r8 / r4
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            if (r2 == 0) goto L2b
            float r4 = (float) r7
            float r5 = (float) r2
            float r4 = r4 / r5
            goto L2c
        L2b:
            r4 = 0
        L2c:
            r5 = 1073741824(0x40000000, float:2.0)
            if (r0 != r5) goto L33
            if (r1 != r5) goto L33
            goto L8d
        L33:
            if (r0 != r3) goto L61
            if (r1 != r3) goto L61
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 >= 0) goto L4e
            float r0 = (float) r2
            float r0 = r0 * r8
            int r0 = java.lang.Math.round(r0)
            if (r7 <= 0) goto L4c
            if (r0 <= r7) goto L4c
            float r0 = (float) r7
            float r0 = r0 / r8
            int r2 = java.lang.Math.round(r0)
            goto L8d
        L4c:
            r7 = r0
            goto L8d
        L4e:
            float r0 = (float) r7
            float r0 = r0 / r8
            int r0 = java.lang.Math.round(r0)
            if (r2 <= 0) goto L5f
            if (r0 <= r2) goto L5f
            float r7 = (float) r2
            float r7 = r7 * r8
            int r7 = java.lang.Math.round(r7)
            goto L8d
        L5f:
            r2 = r0
            goto L8d
        L61:
            if (r0 != r3) goto L76
            if (r1 != r5) goto L76
            float r0 = (float) r2
            float r0 = r0 * r8
            int r0 = java.lang.Math.round(r0)
            if (r7 <= 0) goto L4c
            if (r0 <= r7) goto L4c
            float r0 = (float) r7
            float r0 = r0 / r8
            int r2 = java.lang.Math.round(r0)
            goto L8d
        L76:
            if (r0 != r5) goto L8b
            if (r1 != r3) goto L8b
            float r0 = (float) r7
            float r0 = r0 / r8
            int r0 = java.lang.Math.round(r0)
            if (r2 <= 0) goto L5f
            if (r0 <= r2) goto L5f
            float r7 = (float) r2
            float r7 = r7 * r8
            int r7 = java.lang.Math.round(r7)
            goto L8d
        L8b:
            r2 = 0
            r7 = r2
        L8d:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            super.onMeasure(r7, r8)
            return
        L99:
            super.onMeasure(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.k3.onMeasure(int, int):void");
    }

    @Override // com.my.target.y.a
    public void p() {
        InstreamAdPlayer.AdPlayerListener adPlayerListener;
        if (this.f59988f || (adPlayerListener = this.f59985c) == null) {
            return;
        }
        adPlayerListener.onAdVideoStarted();
        this.f59988f = true;
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public void pauseAdVideo() {
        y yVar = this.f59990h;
        if (yVar != null) {
            yVar.pause();
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public void playAdVideo(Uri uri, int i10, int i11) {
        this.f59986d = i10;
        this.f59987e = i11;
        this.f59988f = false;
        if (this.f59990h == null) {
            y yVarA = w5.a(this.f59984b, getContext());
            this.f59990h = yVarA;
            yVarA.a(this);
        }
        this.f59983a.a(i10, i11);
        this.f59990h.a(uri, this.f59983a);
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public void resumeAdVideo() {
        y yVar = this.f59990h;
        if (yVar != null) {
            yVar.resume();
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public void setAdPlayerListener(@Nullable InstreamAdPlayer.AdPlayerListener adPlayerListener) {
        this.f59985c = adPlayerListener;
    }

    public void setUseExoPlayer(boolean z10) {
        this.f59984b = z10;
    }

    @OptIn(markerClass = {UnstableApi.class})
    @VisibleForTesting
    public void setVideoPlayer(@Nullable b2 b2Var) {
        this.f59990h = b2Var;
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public void setVolume(float f10) {
        y yVar = this.f59990h;
        if (yVar != null) {
            yVar.setVolume(f10);
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public void stopAdVideo() {
        y yVar = this.f59990h;
        if (yVar != null) {
            yVar.stop();
        }
    }

    public k3(Context context) {
        this(context, null);
    }

    @Override // com.my.target.y.a
    public void a(float f10) {
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.f59985c;
        if (adPlayerListener != null) {
            adPlayerListener.onVolumeChanged(f10);
        }
    }

    public k3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public k3(Context context, AttributeSet attributeSet, int i10, z zVar) {
        super(context, attributeSet, i10);
        this.f59984b = true;
        this.f59983a = zVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        addView(zVar, layoutParams);
    }

    @Override // com.my.target.y.a
    public void a(String str) {
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.f59985c;
        if (adPlayerListener != null) {
            adPlayerListener.onAdVideoError(str);
        }
    }

    @Override // com.my.target.instreamads.InstreamAdPlayer
    public void playAdVideo(Uri uri, int i10, int i11, float f10) {
        playAdVideo(uri, i10, i11);
        y yVar = this.f59990h;
        if (yVar != null) {
            yVar.seekTo((long) (f10 * 1000.0f));
        }
    }
}
