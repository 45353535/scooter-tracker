package com.pubmatic.sdk.webrendering.mraid;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.R$id;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.webrendering.POBUIUtil;
import com.pubmatic.sdk.webrendering.R$drawable;
import com.taurusx.tax.utils.webview.TaxBrowserActivity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class POBVideoPlayerActivity extends Activity {
    public static final String ACTION_FINISH = "com.pubmatic.sdk.webrendering.mraid.POBVideoPlayerActivity.finish";
    public static final String ALLOW_ORIENTATION_KEY = "AllowOrientationChange";
    public static final String FORCE_ORIENTATION_KEY = "ForceOrientation";
    public static final String MSG_VIDEO_PLAYER_EMPTY_URL = "Can't launch video player due to null or empty value of URL";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static List f63370g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MediaController f63371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private VideoView f63372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f63373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f63374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BroadcastReceiver f63375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f63376f;

    public interface POBVideoPlayerActivityListener {
        void onDismiss();

        void onStart();
    }

    protected class POBVideoPlayerBroadcast extends BroadcastReceiver {
        protected POBVideoPlayerBroadcast() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !POBVideoPlayerActivity.ACTION_FINISH.equals(intent.getAction())) {
                return;
            }
            POBVideoPlayerActivity.this.finish();
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            POBVideoPlayerActivity.this.finish();
        }
    }

    class b implements MediaPlayer.OnCompletionListener {
        b() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            POBVideoPlayerActivity.this.f63374d = true;
        }
    }

    private void b() {
        List<POBVideoPlayerActivityListener> list = f63370g;
        if (list != null) {
            for (POBVideoPlayerActivityListener pOBVideoPlayerActivityListener : list) {
                if (this.f63376f == pOBVideoPlayerActivityListener.hashCode()) {
                    pOBVideoPlayerActivityListener.onDismiss();
                    a(pOBVideoPlayerActivityListener);
                    return;
                }
            }
        }
    }

    private void c() {
        List<POBVideoPlayerActivityListener> list = f63370g;
        if (list != null) {
            for (POBVideoPlayerActivityListener pOBVideoPlayerActivityListener : list) {
                if (this.f63376f == pOBVideoPlayerActivityListener.hashCode()) {
                    pOBVideoPlayerActivityListener.onStart();
                    return;
                }
            }
        }
    }

    private void d() {
        VideoView videoView = this.f63372b;
        if (videoView == null) {
            POBLog.debug("POBVideoPlayerActivity", "Unable to pause video, VideoView not available.", new Object[0]);
            return;
        }
        videoView.pause();
        this.f63373c = this.f63372b.getCurrentPosition();
        POBLog.debug("POBVideoPlayerActivity", "VideoView visibility is false. Seeked position =" + this.f63373c, new Object[0]);
    }

    private void e() {
        if (this.f63374d) {
            POBLog.debug("POBVideoPlayerActivity", "Video Ad is completed", new Object[0]);
            return;
        }
        VideoView videoView = this.f63372b;
        if (videoView == null) {
            POBLog.debug("POBVideoPlayerActivity", "Unable to resume video, VideoView not available.", new Object[0]);
            return;
        }
        if (videoView.isPlaying()) {
            this.f63372b.seekTo(this.f63373c);
            return;
        }
        POBLog.debug("POBVideoPlayerActivity", "VideoView visibility is false. Seeked position =" + this.f63373c, new Object[0]);
    }

    public static void startNewActivity(@NonNull Context context, @NonNull String str, @Nullable Bundle bundle, @NonNull POBVideoPlayerActivityListener pOBVideoPlayerActivityListener) {
        if (f63370g == null) {
            f63370g = new ArrayList();
        }
        f63370g.add(pOBVideoPlayerActivityListener);
        Intent intent = new Intent(context, (Class<?>) POBVideoPlayerActivity.class);
        intent.addFlags(268435456);
        intent.putExtra(TaxBrowserActivity.f66923n, str);
        intent.putExtra("listener_hash_code", pOBVideoPlayerActivityListener.hashCode());
        intent.putExtra("bundle_extra", bundle);
        try {
            POBUtils.startActivity(context, intent);
        } catch (Exception e10) {
            POBLog.warn("POBVideoPlayerActivity", "Error in starting video player activity. Error: %s", e10.getMessage());
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        String string;
        boolean z10;
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(TaxBrowserActivity.f66923n);
        if (POBUtils.isNullOrEmpty(stringExtra)) {
            POBLog.error("POBVideoPlayerActivity", MSG_VIDEO_PLAYER_EMPTY_URL, new Object[0]);
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("bundle_extra");
        if (bundleExtra != null) {
            string = bundleExtra.getString(FORCE_ORIENTATION_KEY);
            z10 = bundleExtra.getBoolean(ALLOW_ORIENTATION_KEY, true);
        } else {
            string = null;
            z10 = true;
        }
        if (!z10) {
            if (string == null) {
                string = "none";
            }
            switch (string) {
                case "sensor_landscape":
                    setRequestedOrientation(6);
                    break;
                case "reverse_portrait":
                    setRequestedOrientation(7);
                    break;
                case "portrait":
                    setRequestedOrientation(1);
                    break;
                case "landscape":
                    setRequestedOrientation(0);
                    break;
            }
        }
        View viewA = a(a(stringExtra), -1, -1);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            POBUtils.setSystemFitWindowsForEdgeToEdge(viewA);
        }
        setContentView(viewA);
        POBVideoPlayerBroadcast pOBVideoPlayerBroadcast = new POBVideoPlayerBroadcast();
        this.f63375e = pOBVideoPlayerBroadcast;
        try {
            if (i10 >= 33) {
                registerReceiver(pOBVideoPlayerBroadcast, new IntentFilter(ACTION_FINISH), 4);
            } else {
                registerReceiver(pOBVideoPlayerBroadcast, new IntentFilter(ACTION_FINISH));
            }
        } catch (Exception e10) {
            POBLog.warn("POBVideoPlayerActivity", "Error in registering broadcast receiver. Error: %s", e10.getMessage());
        }
        this.f63376f = getIntent().getIntExtra("listener_hash_code", 0);
        c();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        a();
        try {
            unregisterReceiver(this.f63375e);
        } catch (Exception e10) {
            POBLog.warn("POBVideoPlayerActivity", "Error in unregistering broadcast receiver. Error: %s", e10.getMessage());
        }
        this.f63375e = null;
        b();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        d();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        e();
    }

    private void a(POBVideoPlayerActivityListener pOBVideoPlayerActivityListener) {
        List list = f63370g;
        if (list != null) {
            list.remove(pOBVideoPlayerActivityListener);
            if (f63370g.isEmpty()) {
                f63370g = null;
            }
        }
    }

    private void a() {
        VideoView videoView = this.f63372b;
        if (videoView != null) {
            videoView.suspend();
        }
        this.f63372b = null;
        this.f63371a = null;
    }

    private View a(View view, int i10, int i11) {
        FrameLayout frameLayout = new FrameLayout(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i11);
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, 0, 0, 0);
        if (view != null) {
            frameLayout.addView(view, layoutParams);
        }
        ImageButton imageButtonCreateSkipButton = POBUIUtil.createSkipButton(this, R$id.pob_close_btn, R$drawable.pob_ic_close_black_24dp);
        frameLayout.addView(imageButtonCreateSkipButton);
        imageButtonCreateSkipButton.setOnClickListener(new a());
        return frameLayout;
    }

    private View a(String str) {
        this.f63372b = new VideoView(this);
        if (this.f63371a == null) {
            MediaController mediaController = new MediaController(this);
            this.f63371a = mediaController;
            mediaController.setMediaPlayer(this.f63372b);
        }
        this.f63372b.setMediaController(this.f63371a);
        this.f63371a.setAnchorView(this.f63372b);
        this.f63372b.setOnCompletionListener(new b());
        this.f63372b.setVideoURI(Uri.parse(str));
        this.f63372b.start();
        return this.f63372b;
    }
}
