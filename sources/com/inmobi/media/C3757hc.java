package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.VideoView;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.inmobi.media.C3757hc;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.inmobi.media.hc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3757hc extends VideoView implements MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3878m9 f38698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3706fc f38699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f38700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC3732gc f38701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f38702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference f38703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f38705h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f38706i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f38707j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f38708k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3757hc(Activity activity, InterfaceC3878m9 interfaceC3878m9) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f38698a = interfaceC3878m9;
        setZOrderOnTop(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT < 28) {
            setDrawingCacheEnabled(true);
        }
        this.f38704g = 100;
        this.f38707j = -1;
        this.f38708k = 0;
        this.f38703f = new WeakReference(activity);
        Context context = Ji.f37157a;
        Intrinsics.checkNotNullParameter(this, "lifecycleCallbacks");
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        activity.getApplication().registerActivityLifecycleCallbacks(this);
    }

    public static final void a(C3757hc c3757hc, MediaPlayer mediaPlayer, int i10, int i11) {
        InterfaceC3878m9 interfaceC3878m9 = c3757hc.f38698a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("MediaRenderView", ">>> onVideoSizeChanged");
        }
        if (c3757hc.f38699b == null) {
            C3706fc c3706fc = new C3706fc(c3757hc.getContext());
            c3757hc.f38699b = c3706fc;
            c3706fc.setAnchorView(c3757hc);
            c3757hc.setMediaController(c3757hc.f38699b);
            c3757hc.requestLayout();
            c3757hc.requestFocus();
        }
    }

    public final void b() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38698a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("MediaRenderView", "Release the media render view");
        }
        stopPlayback();
        ViewGroup viewGroup = this.f38700c;
        if (viewGroup != null) {
            ViewParent parent = viewGroup.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f38700c);
            }
            ViewParent parent2 = getParent();
            ViewGroup viewGroup3 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup3 != null) {
                viewGroup3.removeView(this);
            }
            setBackgroundColor(0);
            this.f38700c = null;
        }
        setMediaController(null);
        this.f38699b = null;
        InterfaceC3732gc interfaceC3732gc = this.f38701d;
        if (interfaceC3732gc != null) {
            Intrinsics.checkNotNullParameter(this, "mp");
            InterfaceC3878m9 interfaceC3878m92 = ((C4105vc) interfaceC3732gc).f39770a.f39840b;
            if (interfaceC3878m92 != null) {
                ((C3903n9) interfaceC3878m92).a("MraidMediaProcessor", ">>> onPlayerCompleted");
            }
            ViewGroup viewContainer = getViewContainer();
            if (viewContainer != null) {
                ViewParent parent3 = viewContainer.getParent();
                ViewGroup viewGroup4 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
                if (viewGroup4 != null) {
                    viewGroup4.removeView(viewContainer);
                }
            }
            setViewContainer(null);
        }
    }

    public final int getCurrentAudioVolume() {
        return this.f38704g;
    }

    @Override // android.view.View
    @Nullable
    public final String getId() {
        return this.f38705h;
    }

    @Nullable
    public final InterfaceC3732gc getListener() {
        return this.f38701d;
    }

    public final int getMCurrentPosition() {
        return this.f38708k;
    }

    @Nullable
    public final String getPlaybackUrl() {
        return this.f38706i;
    }

    public final int getPreviousPosition() {
        return this.f38707j;
    }

    @Nullable
    public final ViewGroup getViewContainer() {
        return this.f38700c;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f38703f.get() == null || !Intrinsics.areEqual(this.f38703f.get(), activity)) {
            return;
        }
        this.f38702e = false;
        start();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Activity activity2 = (Activity) this.f38703f.get();
        if (activity2 == null || !Intrinsics.areEqual(activity2, activity)) {
            return;
        }
        this.f38702e = true;
        if (getCurrentPosition() != 0) {
            this.f38708k = getCurrentPosition();
        }
        pause();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mp) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        InterfaceC3878m9 interfaceC3878m9 = this.f38698a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("MediaRenderView", ">>> onCompletion");
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mp, int i10, int i11) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        InterfaceC3878m9 interfaceC3878m9 = this.f38698a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).b("MediaRenderView", ">>> onError (" + i10 + ", " + i11 + ")");
        }
        b();
        return false;
    }

    @Override // android.widget.VideoView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        getHolder().setSizeFromLayout();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mp) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        InterfaceC3878m9 interfaceC3878m9 = this.f38698a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("MediaRenderView", ">>> onPrepared");
        }
        mp.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: w3.c8
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
                C3757hc.a(this.f107007b, mediaPlayer, i10, i11);
            }
        });
        int i10 = this.f38708k;
        if (i10 < getDuration()) {
            this.f38708k = i10;
            seekTo(i10);
        }
        InterfaceC3732gc interfaceC3732gc = this.f38701d;
        if (interfaceC3732gc != null) {
            Intrinsics.checkNotNullParameter(this, "mp");
            InterfaceC3878m9 interfaceC3878m92 = ((C4105vc) interfaceC3732gc).f39770a.f39840b;
            if (interfaceC3878m92 != null) {
                ((C3903n9) interfaceC3878m92).a("MraidMediaProcessor", ">>> onPlayerPrepared");
            }
        }
        start();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        Context context;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onVisibilityChanged(view, i10);
        InterfaceC3878m9 interfaceC3878m9 = this.f38698a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("MediaRenderView", ">>> onVisibilityChanged (" + i10 + ")");
        }
        if (i10 != 0 || (context = Ji.f37157a) == null) {
            return;
        }
        setBackground(new BitmapDrawable(context.getResources(), (Bitmap) null));
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        InterfaceC3878m9 interfaceC3878m9 = this.f38698a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("MediaRenderView", ">>> onWindowVisibilityChanged (" + i10 + ")");
        }
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        InterfaceC3878m9 interfaceC3878m9 = this.f38698a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("MediaRenderView", "Pause media playback");
        }
        super.pause();
    }

    public final void setAudioMuted(boolean z10) {
    }

    public final void setCurrentAudioVolume(int i10) {
        this.f38704g = i10;
    }

    public final void setId(@Nullable String str) {
        this.f38705h = str;
    }

    public final void setListener(@Nullable InterfaceC3732gc interfaceC3732gc) {
        this.f38701d = interfaceC3732gc;
    }

    public final void setMCurrentPosition(int i10) {
        this.f38708k = i10;
    }

    public final void setPlaybackData(@NotNull String url) {
        String str;
        Intrinsics.checkNotNullParameter(url, "url");
        byte[] bytes = url.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bytes) {
            if (((byte) (b10 & UnsignedBytes.MAX_POWER_OF_TWO)) > 0) {
                sb2.append("%");
                char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
                sb2.append(new String(new char[]{cArr[(b10 >> 4) & 15], cArr[(byte) (b10 & Ascii.SI)]}));
            } else {
                sb2.append((char) b10);
            }
        }
        try {
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            byte[] bytes2 = string.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
            str = new String(bytes2, Charsets.ISO_8859_1);
        } catch (UnsupportedEncodingException unused) {
            str = "";
        }
        this.f38706i = str;
        this.f38705h = "anonymous";
    }

    public final void setPlaybackUrl(@Nullable String str) {
        this.f38706i = str;
    }

    public final void setPlayerPrepared(boolean z10) {
    }

    public final void setPreviousPosition(int i10) {
        this.f38707j = i10;
    }

    public final void setViewContainer(@Nullable ViewGroup viewGroup) {
        this.f38700c = viewGroup;
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public final void start() {
        if (this.f38702e) {
            return;
        }
        InterfaceC3878m9 interfaceC3878m9 = this.f38698a;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("MediaRenderView", "Start media playback");
        }
        super.start();
    }

    public final void a() {
        setVideoPath(this.f38706i);
        setOnCompletionListener(this);
        setOnPreparedListener(this);
        setOnErrorListener(this);
        if (this.f38699b == null) {
            C3706fc c3706fc = new C3706fc(getContext());
            this.f38699b = c3706fc;
            c3706fc.setAnchorView(this);
            setMediaController(this.f38699b);
        }
    }
}
