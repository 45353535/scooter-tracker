package yads;

import android.content.Context;
import android.util.TypedValue;
import android.view.TextureView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer;
import com.yandex.mobile.ads.R$drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f116527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qf3 f116528b;

    public /* synthetic */ u52() {
        this(new t0(), new qf3());
    }

    public final r52 a(Context context, lf3 lf3Var, sj1 sj1Var, gb3 gb3Var, int i10) {
        sj1 h20Var;
        TextureView textureView = new TextureView(context);
        textureView.setVisibility(8);
        t0 t0Var = this.f116527a;
        rj1 rj1Var = t0Var.f116002b;
        rj1Var.f115465a.getClass();
        ImageView imageView = null;
        if (sj1Var.getMuteControl() == null && sj1Var.getVideoProgress() == null && sj1Var.getCountDownProgress() == null) {
            rj1Var.f115466b.getClass();
            h20Var = (sj1) zp2.a(context, CorePlaybackControlsContainer.class, i10, null);
        } else {
            h20Var = new h20(sj1Var.getMuteControl(), sj1Var.getVideoProgress(), sj1Var.getCountDownProgress());
        }
        Button buttonA = t0Var.f116001a.f115497a.a(context);
        buttonA.setTag(ni3.a("replay_button"));
        buttonA.setVisibility(8);
        pl2 pl2Var = new pl2(context, buttonA);
        pl2Var.addView(buttonA);
        d42 d42Var = new d42(context, pl2Var, h20Var);
        t0Var.f116003c.getClass();
        sj1 sj1Var2 = d42Var.f109755b;
        d42Var.f109754a.setVisibility(8);
        CheckBox muteControl = sj1Var2 != null ? sj1Var2.getMuteControl() : null;
        if (muteControl != null) {
            muteControl.setVisibility(8);
        }
        ProgressBar videoProgress = sj1Var2 != null ? sj1Var2.getVideoProgress() : null;
        if (videoProgress != null) {
            videoProgress.setVisibility(8);
        }
        TextView countDownProgress = sj1Var2 != null ? sj1Var2.getCountDownProgress() : null;
        if (countDownProgress != null) {
            countDownProgress.setVisibility(8);
        }
        CheckBox muteControl2 = sj1Var2 != null ? sj1Var2.getMuteControl() : null;
        if (muteControl2 != null) {
            muteControl2.setChecked(Intrinsics.areEqual(lf3Var.f113089d, 0.0d) || lf3Var.f113089d == null);
        }
        d42Var.setVisibility(8);
        qf3 qf3Var = this.f116528b;
        qf3Var.f114992b.getClass();
        if ((gb3Var != null ? gb3Var.f111138c : null) != null) {
            imageView = new ImageView(context);
            imageView.setAdjustViewBounds(true);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        dh2 dh2Var = qf3Var.f114991a;
        dh2Var.getClass();
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminateDrawable(ContextCompat.getDrawable(context, R$drawable.monetization_ads_video_progress_bar_background));
        dh2Var.f109925a.getClass();
        int iD = zf.a.d(TypedValue.applyDimension(1, 45.0f, context.getResources().getDisplayMetrics()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iD, iD);
        layoutParams.gravity = 17;
        progressBar.setLayoutParams(layoutParams);
        progressBar.setVisibility(8);
        progressBar.setTag(ni3.a("video_placeholder_spinner"));
        pf3 pf3Var = new pf3(context, progressBar, imageView);
        pf3Var.addView(progressBar);
        if (imageView != null) {
            pf3Var.addView(imageView);
        }
        pf3Var.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        pf3Var.setVisibility(8);
        r52 r52Var = new r52(context, pf3Var, textureView, d42Var);
        r52Var.addView(pf3Var);
        r52Var.addView(textureView);
        r52Var.addView(d42Var);
        r52Var.setTag(ni3.a("native_video_view"));
        return r52Var;
    }

    public u52(t0 t0Var, qf3 qf3Var) {
        this.f116527a = t0Var;
        this.f116528b = qf3Var;
    }
}
