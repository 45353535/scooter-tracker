package com.mbridge.msdk.config.dynamic.baseview.video;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.SimpleExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultDataSourceFactory;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f47539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SimpleExoPlayer f47540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f47541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.baseview.video.a f47542e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f47538a = 5000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f47543f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f47544g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f47545h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f47546i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Handler f47547j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f47548k = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.b();
        }
    }

    public c(Context context, SimpleExoPlayer simpleExoPlayer) {
        this.f47539b = context;
        this.f47540c = simpleExoPlayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        q0.b("LocalVideoFileMonitor", " 触发 一次检查");
        try {
            File file = new File(this.f47541d);
            if (file.exists()) {
                a(file);
                return;
            }
            q0.b("LocalVideoFileMonitor", " 资源异常 原因 地址文件不存在");
            if (System.currentTimeMillis() - this.f47543f < this.f47538a) {
                this.f47547j.postDelayed(this.f47548k, 1000L);
            } else {
                a("resource buffer exception file is not found");
            }
        } catch (Exception e10) {
            a("resource buffer exception" + e10.getMessage());
        }
    }

    private void d() {
        this.f47543f = 0L;
        this.f47544g = 0L;
        this.f47545h = 0L;
        this.f47546i = 0L;
    }

    private void e() {
        if (this.f47540c != null) {
            com.mbridge.msdk.config.dynamic.baseview.video.a aVar = this.f47542e;
            if (aVar != null) {
                aVar.onBufferingEnd();
            }
            ExtractorMediaSource extractorMediaSourceCreateMediaSource = new ExtractorMediaSource.Factory(new DefaultDataSourceFactory(this.f47539b, "MBridge_ExoPlayer")).createMediaSource(Uri.parse(this.f47541d));
            this.f47540c.setRepeatMode(0);
            this.f47540c.prepare(extractorMediaSourceCreateMediaSource);
            this.f47540c.seekTo(this.f47544g);
            this.f47540c.setPlayWhenReady(true);
        }
        a();
    }

    public void c() {
        a();
        this.f47544g = 0L;
        this.f47545h = 0L;
        this.f47546i = 0L;
        this.f47539b = null;
        this.f47540c = null;
        this.f47542e = null;
    }

    public void a(String str, com.mbridge.msdk.config.dynamic.baseview.video.a aVar, int i10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f47542e = aVar;
        if (i10 > 0) {
            this.f47538a = i10 * 1000;
        }
        this.f47541d = str;
    }

    public boolean a(ExoPlaybackException exoPlaybackException) {
        if (exoPlaybackException == null || exoPlaybackException.type != 0) {
            return false;
        }
        q0.b("LocalVideoFileMonitor", " 触发 资源异常 监控");
        d();
        com.mbridge.msdk.config.dynamic.baseview.video.a aVar = this.f47542e;
        if (aVar != null) {
            aVar.onBufferingStart();
        }
        this.f47543f = System.currentTimeMillis();
        SimpleExoPlayer simpleExoPlayer = this.f47540c;
        if (simpleExoPlayer != null) {
            this.f47544g = simpleExoPlayer.getCurrentPosition();
        }
        this.f47547j.post(this.f47548k);
        return true;
    }

    private void a(File file) {
        q0.b("LocalVideoFileMonitor", " 资源异常 原因 地址文件存在 但是不完整");
        long length = file.length();
        long jLastModified = file.lastModified();
        long j10 = this.f47545h;
        boolean z10 = false;
        boolean z11 = (j10 == 0 || length == j10) ? false : true;
        long j11 = this.f47546i;
        if (j11 != 0 && jLastModified != j11) {
            z10 = true;
        }
        this.f47545h = length;
        this.f47546i = jLastModified;
        if (z11 || z10) {
            q0.b("LocalVideoFileMonitor", " 资源状态发生过变化 触发播放");
            e();
        } else if (System.currentTimeMillis() - this.f47543f < this.f47538a) {
            this.f47547j.postDelayed(this.f47548k, 1000L);
        } else {
            a("resource buffer time out");
        }
    }

    private void a() {
        this.f47547j.removeCallbacks(this.f47548k);
    }

    private void a(String str) {
        q0.b("LocalVideoFileMonitor", "通知外部 规定时间内 缓冲未成功");
        com.mbridge.msdk.config.dynamic.baseview.video.a aVar = this.f47542e;
        if (aVar != null) {
            aVar.onBufferingTimeOut(str);
            this.f47542e.onPlayError(str);
        }
    }
}
