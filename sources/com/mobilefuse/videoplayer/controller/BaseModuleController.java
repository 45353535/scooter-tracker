package com.mobilefuse.videoplayer.controller;

import android.content.Context;
import android.webkit.WebView;
import com.mobilefuse.videoplayer.VideoPlayer;
import com.mobilefuse.videoplayer.endcard.EndCardPresenter;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v0;
import kotlin.properties.a;
import kotlin.properties.e;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR+\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t8D@DX\u0084\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\fR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/mobilefuse/videoplayer/controller/BaseModuleController;", "", "<init>", "()V", "", "js", "", "callJsBridgeCmd", "(Ljava/lang/String;)V", "Lcom/mobilefuse/videoplayer/VideoPlayer;", "videoPlayer", MobileAdsBridgeBase.initializeMethodName, "(Lcom/mobilefuse/videoplayer/VideoPlayer;)V", "<set-?>", "videoPlayer$delegate", "Lkotlin/properties/e;", "getVideoPlayer", "()Lcom/mobilefuse/videoplayer/VideoPlayer;", "setVideoPlayer", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "webView", "Lcom/mobilefuse/videoplayer/endcard/EndCardPresenter;", "getEndCardPresenter", "()Lcom/mobilefuse/videoplayer/endcard/EndCardPresenter;", "endCardPresenter", "Lcom/mobilefuse/videoplayer/VideoPlayer$PlayerState;", "getPlayerState", "()Lcom/mobilefuse/videoplayer/VideoPlayer$PlayerState;", "playerState", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public class BaseModuleController {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {v0.f(new g0(BaseModuleController.class, "videoPlayer", "getVideoPlayer()Lcom/mobilefuse/videoplayer/VideoPlayer;", 0))};

    /* JADX INFO: renamed from: videoPlayer$delegate, reason: from kotlin metadata */
    @NotNull
    private final e videoPlayer = a.f93338a.a();

    protected final void callJsBridgeCmd(@NotNull String js) {
        Intrinsics.checkNotNullParameter(js, "js");
        getVideoPlayer().callJsBridgeCmd$mobilefuse_video_player_release(js);
    }

    @NotNull
    protected final Context getContext() {
        Context context = getVideoPlayer().getContext();
        Intrinsics.checkNotNull(context);
        return context;
    }

    @Nullable
    protected final EndCardPresenter getEndCardPresenter() {
        return getVideoPlayer().getEndCardPresenter();
    }

    @NotNull
    protected final VideoPlayer.PlayerState getPlayerState() {
        return getVideoPlayer().getPlayerState();
    }

    @NotNull
    protected final VideoPlayer getVideoPlayer() {
        return (VideoPlayer) this.videoPlayer.getValue(this, $$delegatedProperties[0]);
    }

    @Nullable
    protected final WebView getWebView() {
        return getVideoPlayer().getWebView();
    }

    public final void initialize(@NotNull VideoPlayer videoPlayer) {
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        setVideoPlayer(videoPlayer);
    }

    protected final void setVideoPlayer(@NotNull VideoPlayer videoPlayer) {
        Intrinsics.checkNotNullParameter(videoPlayer, "<set-?>");
        this.videoPlayer.setValue(this, $$delegatedProperties[0], videoPlayer);
    }
}
