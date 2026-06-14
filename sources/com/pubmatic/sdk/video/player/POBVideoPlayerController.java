package com.pubmatic.sdk.video.player;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.R$drawable;
import com.pubmatic.sdk.video.R$id;
import com.pubmatic.sdk.webrendering.R$color;
import com.pubmatic.sdk.webrendering.R$dimen;
import com.pubmatic.sdk.webrendering.R$integer;

/* JADX INFO: loaded from: classes11.dex */
public class POBVideoPlayerController extends POBPlayerController {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f63129e = "POBVideoPlayerController";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private POBVideoPlayer f63130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SeekBar f63131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageButton f63132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Resources f63133d;

    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (POBVideoPlayerController.this.f63130a != null) {
                POBVideoPlayerController.this.a(!r2.f63130a.isMute());
                POBVideoPlayerController pOBVideoPlayerController = POBVideoPlayerController.this;
                pOBVideoPlayerController.b(pOBVideoPlayerController.f63130a.isMute());
            }
        }
    }

    public POBVideoPlayerController(@NonNull Context context) {
        super(context);
        this.f63133d = getResources();
        this.f63131b = c();
        this.f63132c = b();
        a();
    }

    private SeekBar c() {
        SeekBar seekBar = new SeekBar(getContext());
        seekBar.setPadding(0, 0, 0, POBUtils.convertDpToPixel(1));
        seekBar.setThumb(null);
        try {
            seekBar.setProgressDrawable(this.f63133d.getDrawable(R$drawable.seekbar_progress_drawable, null));
        } catch (Resources.NotFoundException e10) {
            POBLog.error(f63129e, "Error while setting progress drawable for seek bar: ", e10.getMessage());
        }
        seekBar.setOnTouchListener(new a());
        return seekBar;
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayerController, com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onMute(boolean z10) {
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayerController, com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onPause() {
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayerController, com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onProgressUpdate(int i10) {
        this.f63131b.setProgress(i10);
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayerController, com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onResume() {
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayerController, com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onStart() {
        POBVideoPlayer pOBVideoPlayer = this.f63130a;
        if (pOBVideoPlayer != null) {
            this.f63131b.setMax(pOBVideoPlayer.getMediaDuration());
            b(this.f63130a.isMute());
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayerController
    public void setVideoPlayerEvents(@NonNull POBVideoPlayer pOBVideoPlayer) {
        this.f63130a = pOBVideoPlayer;
    }

    private ImageButton b() {
        ImageButton imageButton = new ImageButton(getContext());
        imageButton.setId(R$id.pob_mute_btn);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(this.f63133d.getColor(R$color.pob_controls_background_color));
        gradientDrawable.setStroke(this.f63133d.getDimensionPixelOffset(R$dimen.pob_control_stroke_width), this.f63133d.getColor(R$color.pob_controls_stroke_color));
        gradientDrawable.setAlpha(this.f63133d.getInteger(R$integer.pob_controls_alpha));
        imageButton.setBackground(gradientDrawable);
        imageButton.setPadding(0, 0, 0, 0);
        imageButton.setImageResource(R$drawable.pob_ic_volume_up_black_24dp);
        imageButton.setOnClickListener(new b());
        return imageButton;
    }

    private void a() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f63133d.getDimensionPixelOffset(com.pubmatic.sdk.video.R$dimen.pob_seek_bar_height));
        layoutParams.gravity = 80;
        layoutParams.leftMargin = this.f63133d.getDimensionPixelOffset(com.pubmatic.sdk.video.R$dimen.pob_seek_left_margin);
        layoutParams.rightMargin = this.f63133d.getDimensionPixelOffset(com.pubmatic.sdk.video.R$dimen.pob_seek_right_margin);
        addView(this.f63131b, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.f63133d.getDimensionPixelOffset(R$dimen.pob_control_width), this.f63133d.getDimensionPixelOffset(R$dimen.pob_control_height));
        layoutParams2.gravity = 8388691;
        layoutParams2.bottomMargin = this.f63133d.getDimensionPixelOffset(com.pubmatic.sdk.video.R$dimen.pob_mute_button_bottom_margin);
        layoutParams2.leftMargin = this.f63133d.getDimensionPixelOffset(com.pubmatic.sdk.video.R$dimen.pob_mute_button_left_margin);
        addView(this.f63132c, layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) {
        POBVideoPlayer pOBVideoPlayer = this.f63130a;
        if (pOBVideoPlayer != null) {
            if (z10) {
                pOBVideoPlayer.mute();
            } else {
                pOBVideoPlayer.unMute();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z10) {
        if (z10) {
            this.f63132c.setImageResource(R$drawable.pob_ic_volume_off_black_24dp);
        } else {
            this.f63132c.setImageResource(R$drawable.pob_ic_volume_up_black_24dp);
        }
    }
}
