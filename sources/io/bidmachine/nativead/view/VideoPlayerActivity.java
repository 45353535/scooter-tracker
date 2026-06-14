package io.bidmachine.nativead.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import io.bidmachine.core.h;

/* JADX INFO: loaded from: classes12.dex */
public class VideoPlayerActivity extends Activity implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f81840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private VideoView f81841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f81842d;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoPlayerActivity.this.c();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                VideoPlayerActivity.this.getWindow().clearFlags(128);
            } catch (Exception e10) {
                io.bidmachine.core.a.p(e10);
            }
        }
    }

    interface c {
        void a(int i10, boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f81842d != null) {
            this.f81842d.a(this.f81841c.isPlaying() ? this.f81841c.getCurrentPosition() : 0, false);
        }
        d();
    }

    private void d() {
        runOnUiThread(new b());
        finish();
    }

    public static Intent e(Context context, String str, int i10) {
        Intent intent = new Intent(context, (Class<?>) VideoPlayerActivity.class);
        intent.putExtra("io.bidmachine.fileUri", str);
        intent.putExtra("io.bidmachine.seekTo", i10);
        return intent;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        c();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        c cVar = this.f81842d;
        if (cVar != null) {
            cVar.a(0, true);
        }
        d();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("io.bidmachine.fileUri");
        this.f81840b = intent.getIntExtra("io.bidmachine.seekTo", 0);
        io.bidmachine.core.a.a(new ce.b() { // from class: dc.u
            @Override // ce.b
            public final Object get() {
                return String.format("VideoPlayerActivity started, position: %s", Integer.valueOf(this.f68656a.f81840b));
            }
        });
        if (stringExtra == null) {
            return;
        }
        this.f81842d = io.bidmachine.nativead.view.a.E;
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f81841c = new VideoView(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f81841c.setLayoutParams(layoutParams);
        this.f81841c.setOnCompletionListener(this);
        this.f81841c.setOnPreparedListener(this);
        this.f81841c.setVideoPath(stringExtra);
        relativeLayout.addView(this.f81841c);
        float fA = h.A(this);
        int iRound = Math.round(24.0f * fA);
        int iRound2 = Math.round(fA * 8.0f);
        f9.a aVar = new f9.a(this);
        aVar.h(b9.a.f5837a, b9.a.f5839c);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iRound, iRound);
        layoutParams2.addRule(11, -1);
        layoutParams2.addRule(10, -1);
        layoutParams2.setMargins(iRound2, iRound2, iRound2, iRound2);
        aVar.setImage(b9.a.a("iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAYAAADnRuK4AAACY0lEQVR4Ae3aAWRbURTH4YNiKIqggKEYCiiKYQQABQAMARRBAVAADEEBUAAEAADBAMMwBADFADAURXYQoZdoOLie+338PQK4fnmJ5wUAAAAAAAAAAAAAAAAAAAAAAHACrnJ3uWVunpvFuM5zX3Pf99fz4KiL3HNu1+w195A7i3Gc5R5zb81ZvO0/b86CWe6ljafZZpBv4GXu9wdn8UtE761zuxP2sxrRBOLZnngWjznSbXs4g0Z0Sjztz9lFEPe5XT2iIeJp9y2IVW5Xj2iMeJotguYOVIlogHiazYO4ye3qEQ0VT/MfiPUAEZXjafYjDpjl/k41og7x/Ml9inf4MsWIOsSzzV0G40QkHhGJR0Ti6U9E4hGRePoTkXhEJJ7+RCQeEYmnPxGJR0TiqROReOpEJJ46EYmnTkTiqROReMpEJJ4CEYmnQETiKRGReEpEJJ4kIvH0JyLxiEg8/YlIPCIST38iEo+IxEP9ZbA+L6UhHhGJR0T9iUdE4hFRf+IRkXhE1It4RNQQz7bysFFE4rksPLEWkXj2RFQgHhGViUdEZeIRUZl4RFQmHhGViUdEZeIRkXjqRCQeEXUnHhGJR0T9iUdE4hFRf+IRkXhEJJ5uRCQeEYlHROM47x/PpCLa5M7igKf+8Uwuoodc4rp/PJOM6DU3i2DRP57JRjSPYNU/nslGtIxgOXA81YjuIpgPHk8loqtcYjNqPIWInuOAz7l/o8VTiOgldxENER2/Ez0N9vR1llsfOYt1bhZHMc8tc6vcIncd47rJ3edW++ttAAAAAAAAAAAAAAAAAAAAAAAAfOA/5Zwc/aYfb7AAAAAASUVORK5CYII="));
        aVar.setLayoutParams(layoutParams2);
        aVar.setOnClickListener(new a());
        relativeLayout.addView(aVar);
        setContentView(relativeLayout);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        d();
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        VideoView videoView = this.f81841c;
        if (videoView == null || !videoView.canSeekForward()) {
            return;
        }
        this.f81841c.seekTo(this.f81840b);
        this.f81841c.start();
    }
}
