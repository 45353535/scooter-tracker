package com.appodeal.ads.adapters.iab.unified;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import com.appodeal.ads.ext.DensityExtKt;
import com.appodeal.ads.utils.Log;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/appodeal/ads/adapters/iab/unified/VideoPlayerActivity;", "Landroid/app/Activity;", "Landroid/media/MediaPlayer$OnErrorListener;", "Landroid/media/MediaPlayer$OnPreparedListener;", "Landroid/media/MediaPlayer$OnCompletionListener;", "<init>", "()V", "iab_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoPlayerActivity extends Activity implements MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f12253e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public VideoView f12255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f12256d;

    public static final void b(VideoPlayerActivity videoPlayerActivity) {
        videoPlayerActivity.getWindow().clearFlags(128);
        videoPlayerActivity.finish();
    }

    public static final void c(VideoPlayerActivity videoPlayerActivity, View view) {
        VideoView videoView = videoPlayerActivity.f12255c;
        int currentPosition = (videoView == null || !videoView.isPlaying()) ? 0 : videoView.getCurrentPosition();
        q qVar = videoPlayerActivity.f12256d;
        if (qVar != null) {
            qVar.b(currentPosition, false);
        }
        videoPlayerActivity.a();
    }

    public final void a() {
        runOnUiThread(new Runnable() { // from class: com.appodeal.ads.adapters.iab.unified.b
            @Override // java.lang.Runnable
            public final void run() {
                VideoPlayerActivity.b(this.f12258b);
            }
        });
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        VideoView videoView = this.f12255c;
        int currentPosition = (videoView == null || !videoView.isPlaying()) ? 0 : videoView.getCurrentPosition();
        q qVar = this.f12256d;
        if (qVar != null) {
            qVar.b(currentPosition, false);
        }
        a();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mp) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        q qVar = this.f12256d;
        if (qVar != null) {
            qVar.b(0, true);
        }
        a();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        this.f12254b = getIntent().getIntExtra("com.appodeal.ads.seekTo", 0);
        String stringExtra = getIntent().getStringExtra("com.appodeal.ads.fileUri");
        a1 a1Var = a1.f93282a;
        String str = String.format("position: %s", Arrays.copyOf(new Object[]{Integer.valueOf(this.f12254b)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Log.log("VideoPlayerActivity", "Start", str);
        if (stringExtra == null) {
            a();
            return;
        }
        this.f12256d = q.f12273u;
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        VideoView videoView = new VideoView(this);
        this.f12255c = videoView;
        videoView.setLayoutParams(layoutParams);
        videoView.setOnCompletionListener(this);
        videoView.setOnPreparedListener(this);
        videoView.setVideoPath(stringExtra);
        relativeLayout.addView(videoView);
        i2.a aVar = new i2.a(this);
        int toPx = DensityExtKt.getToPx(24);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(toPx, toPx);
        layoutParams2.addRule(11, -1);
        layoutParams2.addRule(10, -1);
        int toPx2 = DensityExtKt.getToPx(8);
        layoutParams2.setMargins(toPx2, toPx2, toPx2, toPx2);
        aVar.setImage(e2.a.a("iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAYAAADnRuK4AAACY0lEQVR4Ae3aAWRbURTH4YNiKIqggKEYCiiKYQQABQAMARRBAVAADEEBUAAEAADBAMMwBADFADAURXYQoZdoOLie+338PQK4fnmJ5wUAAAAAAAAAAAAAAAAAAAAAAHACrnJ3uWVunpvFuM5zX3Pf99fz4KiL3HNu1+w195A7i3Gc5R5zb81ZvO0/b86CWe6ljafZZpBv4GXu9wdn8UtE761zuxP2sxrRBOLZnngWjznSbXs4g0Z0Sjztz9lFEPe5XT2iIeJp9y2IVW5Xj2iMeJotguYOVIlogHiazYO4ye3qEQ0VT/MfiPUAEZXjafYjDpjl/k41og7x/Ml9inf4MsWIOsSzzV0G40QkHhGJR0Ti6U9E4hGRePoTkXhEJJ7+RCQeEYmnPxGJR0TiqROReOpEJJ46EYmnTkTiqROReMpEJJ4CEYmnQETiKRGReEpEJJ4kIvH0JyLxiEg8/YlIPCIST38iEo+IxEP9ZbA+L6UhHhGJR0T9iUdE4hFRf+IRkXhE1It4RNQQz7bysFFE4rksPLEWkXj2RFQgHhGViUdEZeIRUZl4RFQmHhGViUdEZeIRkXjqRCQeEXUnHhGJR0T9iUdE4hFRf+IRkXhEJJ5uRCQeEYlHROM47x/PpCLa5M7igKf+8Uwuoodc4rp/PJOM6DU3i2DRP57JRjSPYNU/nslGtIxgOXA81YjuIpgPHk8loqtcYjNqPIWInuOAz7l/o8VTiOgldxENER2/Ez0N9vR1llsfOYt1bhZHMc8tc6vcIncd47rJ3edW++ttAAAAAAAAAAAAAAAAAAAAAAAAfOA/5Zwc/aYfb7AAAAAASUVORK5CYII="));
        aVar.setLayoutParams(layoutParams2);
        aVar.setOnClickListener(new View.OnClickListener() { // from class: com.appodeal.ads.adapters.iab.unified.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoPlayerActivity.c(this.f12257b, view);
            }
        });
        relativeLayout.addView(aVar);
        setContentView(relativeLayout);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f12255c = null;
        this.f12256d = null;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mp, int i10, int i11) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        a();
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mp) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        VideoView videoView = this.f12255c;
        if (videoView == null || !videoView.canSeekForward()) {
            return;
        }
        videoView.seekTo(this.f12254b);
        videoView.start();
    }
}
