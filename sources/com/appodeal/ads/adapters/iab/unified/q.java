package com.appodeal.ads.adapters.iab.unified;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.appodeal.ads.ImageData;
import com.appodeal.ads.MediaAssetsHelperKt;
import com.appodeal.ads.VideoData;
import com.appodeal.ads.ext.DensityExtKt;
import com.appodeal.ads.utils.Log;
import com.ironsource.C4240b4;
import java.util.Timer;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends RelativeLayout implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static q f12273u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VideoData.LocalUri f12274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageData f12275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f12278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12280h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f12281i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f12282j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i2.a f12283k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MediaPlayer f12284l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextureView f12285m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Timer f12286n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f12287o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f12288p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f12289q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f12290r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f12291s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f12292t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12289q = true;
        g gVar = g.f12259b;
    }

    public static final void d(q qVar, TextureView textureView, View view) {
        Uri localUri;
        String fileUri;
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        Log.log("MediaView", "Video", Reporting.EventType.VIDEO_AD_CLICKED);
        f12273u = qVar;
        qVar.f12279g = true;
        int currentPosition = 0;
        if (qVar.h() && (mediaPlayer = qVar.f12284l) != null && mediaPlayer.isPlaying() && (mediaPlayer2 = qVar.f12284l) != null) {
            currentPosition = mediaPlayer2.getCurrentPosition();
        }
        qVar.j();
        VideoData.LocalUri localUri2 = qVar.f12274b;
        if (localUri2 == null || (localUri = localUri2.getLocalUri()) == null || (fileUri = localUri.getPath()) == null) {
            return;
        }
        int i10 = VideoPlayerActivity.f12253e;
        Context context = textureView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileUri, "fileUri");
        Intent intent = new Intent(context, (Class<?>) VideoPlayerActivity.class);
        intent.putExtra("com.appodeal.ads.fileUri", fileUri);
        intent.putExtra("com.appodeal.ads.seekTo", currentPosition);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public static final void e(q qVar, View view) {
        boolean z10;
        if (qVar.h()) {
            if (qVar.f12289q) {
                MediaPlayer mediaPlayer = qVar.f12284l;
                if (mediaPlayer != null) {
                    mediaPlayer.setVolume(1.0f, 1.0f);
                }
                z10 = false;
            } else {
                MediaPlayer mediaPlayer2 = qVar.f12284l;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setVolume(0.0f, 0.0f);
                }
                z10 = true;
            }
            qVar.f12289q = z10;
            String str = z10 ? "iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAMAAADQmBKKAAAAwFBMVEUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAALOy8QAAAAQHRSTlMAT5vPRxSr/1OTn4c4s9cYEMu/XwTDu3fbYwjvt+NA8wwg3/fHKOdLj/tbPDBv03+jl4sca2d7NCTrLINDr6dz72VdRQAAA8FJREFUeAHt2dWW6zgURdEd3GFmZqZi7O7//6rmW7ZiK2VHkYo8X0MreI5GENAiEAgEAoFAIBAIhSORcBSfRSzOf8VjOFMimUpncDFZ/i+XxzkKRZJkKYrLKJNKRZUq/xdJVKAONaoV1WlpNFtQ1qZaUYd23R5U9alUVOlTlBxATZVKRUMeG/WgpE61ojEF6i9SJaJWNKHTKAMF05lSUYgu+vMPLFrQxXJlpGhdLm/gsG3TxVZ/UbRLkrsejhX2bkkL3UVb/meZgLekQ0VrUb7P/43z8JZ0Ba1F67eia7i5qfFY01DRBO5uxxQte2aK2pCYFimaDc0UQaaSpCgyMFIEuT1FcZgowglbiu5MFOGU1ZJ27ZiBIpyUEIvC0F+E0+5pt3zQX4R3xGk3gfYivGOwo11TU5EPj23aPBVMFk0e4CJBuz0MFpHh2DvnT3YrBotIjjZweF7SZg5zRSQ5LsMhSZsslKV4XDSAK9kGXXiizRCKFnSouhdRVnRHmzQ8qzRrI0p4KZIO0VabllkFHuWLFPgukk+IJG1C8KhEqhXxl9EAoudzFv47UrGIbw6njv0ReFOjalGfb9YQlWlTgCdtqhatraISRK2x/w8Recmi0IkPaNp/kHpRCaIX/1sRL1s0hCBKy7LlP0i9aA9BgTYZfUHyohxEEVrKGoPkRTH5j/WtziBp0Vx+jt1rDZIVvcgHwZXeIElRHIIVLQe9QZKiEgQ9Wkp6gyRFOwg2vscrL1w0kv8TMtIYJC/KQXBDS1djkLxoqucVUijSH6RUtKZlpx6kXhTS8rVXKLqlJaUepF6UpOVaPUi9qErLncagmdeiPi2vGoOmHos2tIlpDILHojtautAZ5LEoS8tveoM8FbX6tNThSYPngLeikP9DB154DngpEq/RhjeFEc8A/0UHeDSN0D/4L1rBq0q92qdP8F00HkDNgqfAd9HvgM4i+C6KQmsR/BZ1Aa1F8Fv0B/QWwWdRrgC9RfBZNAD0FsFvETQX4bMV4bMV4bMV4bMV4bMV4bMV4bMV4ZMVtSHxyo8pKsLd/IkfU5SEm1iKFqNFy0c4VZpP5AcVNeEU2pE0XXQ3JsluAsdazRwtBosGq/19tIVjqyeSxovk7kl+pqIH8nMVxen01JxRlIQxT3So3jinyBqm8NjyvgI4ihYwpU9RceM6aaswpUO79l0FEIqMB73SMl4UZNvIAsak33KSefl+tIY5t22SnL2IOWJREia1Qvf3vRZcPE74r9QAn0TlNvvUiEcRCAQCgUAgEAgEdPgLbm7XQrhD8bcAAAAASUVORK5CYII=" : "iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAMAAADQmBKKAAAAw1BMVEUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABAcKsgAAAAQXRSTlMABFeXn38wGNP/u0AMw8tP11+/3/eTOPNH+0tnc3fvb+tDi49TEKMcY8drKCCvFJt7qyQ047eHCCw8g89bp9vns9m2qsEAAAOSSURBVHgB7drVYuNKEEXR03YMJ0aBQXHAYWbm/P9PXZyZBimOHiTVQK9H4zZDFTzP8zzP8zzP83JQtfpSo4mfRqvNfy138HPo9vhNf4CfQYPaMFAQF9IUdSAtpm3UhSza5O+kmBb5O6nPtGgMOQNmmEwhp84MSQ0VUCuz1bGCQ62tM8MGSlebk+RwE67WVlbSNkq2xf8lO0jZbWQk7SmUaZvfxS3kS6pX00NuIct+SNdBNT08RLajmLakU0kP1/GJ40Pa5idV9JD4jBrR1u5W0UN8rkHbaRU9xAIbtM0q6CEWqSU0rZ+V30MstGMXnZffQyx2Qcu49B7iC5c09UvvIb7QbdN0UHYP8ZWrdRrmuyX3EIbDa2TYoalRcg9hIM/PkLZMw40qt8cJYtREynFCw6DcHjeIcfDF+W/L7UkFkRtw7c5pOCm1xw3KLprRcIfc1MFyxMXyBHEGx/06tfk9cmr1SRYRlFzDMaJhBzmFLCiIURe2BxrqyGfGwoK4B8chtTbyWS4wiI+wBTTsIpf1IoNC2O5jagPkwiKDOFjwBN2SCAphe6J2KBHEE1im1JJ7iaAGLLs0jCWChrA9UwskgngGy4jakUjQCiwNag2RoCdYZtTqIkGXsLxQ2xMJCmHpUAtFgtqwNKk9iwRFsJxQi0SCbmDZt46SCBrC8uA+mv5JfQpLjdqrSNAWLAfUzkWCBj/bR8c+LNvUNiSCItgOpb9+bMHSTah1JIIeYOnQsCsQ1IftgtozBIIC2G6pbQsEPStY1IRaDbm8FRm0AtsODS3k8lRg0C0WPGJvyGc3KizovQXbCQ1LyOn4uaigKRx3NATIS631JkUEPcGh3qlNulX/6bkNV42GUdV/C6d77iMaHqr94zy5+GJodljtaGG+iZT9mIaXSocvp/tIe6Vhfl/heGq4iQwdmraqHOApZGjd0DDZlx5xqpCmNfEh8IimNyU9Jg9omUovEjzGNJ1Kr1o8TmiKT4SXUXYSWi6E13UCp6enRBeasErbTUt05evskrZJE6igqI9sK3M6akAVRSNk6S7R1QCqKEqukKaCiK5ToJKig6ycN6aEXZRrFpPkzQ5c90dvTLtUKFv3pXExvYfrJWKGbQUh28yy9nOtwCcHENNj2voAciZM+diHILrWA4gSv3tc7/J3j61u5jTOIG5/zm/eN+7xM7i+4b/eAoWfRHf1I1wawPM8z/M8z/M872/KUtAsVj+VvQAAAABJRU5ErkJggg==";
            i2.a aVar = qVar.f12283k;
            if (aVar != null) {
                aVar.setImage(e2.a.a(str));
            }
        }
    }

    public static final void g(q qVar, View view) {
        qVar.f12277e = true;
        qVar.k();
    }

    public final void a() {
        MediaPlayer mediaPlayer = this.f12284l;
        if (mediaPlayer != null) {
            try {
                if (!this.f12278f) {
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                    }
                    mediaPlayer.reset();
                }
                mediaPlayer.setOnCompletionListener(null);
                mediaPlayer.setOnErrorListener(null);
                mediaPlayer.setOnPreparedListener(null);
                mediaPlayer.setOnVideoSizeChangedListener(null);
                mediaPlayer.release();
            } catch (Exception e10) {
                Log.log(e10);
            }
        }
        this.f12284l = null;
    }

    public final void b(int i10, boolean z10) {
        MediaPlayer mediaPlayer;
        Log.log("MediaView", "State", "videoPlayerActivityClosed, position: " + i10 + ", finished: " + z10);
        try {
            if (z10) {
                l();
            } else if (h() && (mediaPlayer = this.f12284l) != null) {
                mediaPlayer.seekTo(i10);
            }
        } catch (Exception e10) {
            Log.log(e10);
        }
        f12273u = null;
    }

    public final void c(g gVar) {
        int i10 = h.f12263a[gVar.ordinal()];
        if (i10 == 1) {
            ImageView imageView = this.f12281i;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ImageView imageView2 = this.f12281i;
            if (imageView2 != null) {
                imageView2.bringToFront();
            }
            if (this.f12276d) {
                TextureView textureView = this.f12285m;
                if (textureView != null) {
                    textureView.setVisibility(4);
                }
                ImageView imageView3 = this.f12282j;
                if (imageView3 != null) {
                    imageView3.setVisibility(4);
                }
                i2.a aVar = this.f12283k;
                if (aVar != null) {
                    aVar.setVisibility(4);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                throw new lf.m();
            }
            ImageView imageView4 = this.f12281i;
            if (imageView4 != null) {
                imageView4.setVisibility(0);
            }
            ImageView imageView5 = this.f12281i;
            if (imageView5 != null) {
                imageView5.bringToFront();
            }
            if (this.f12276d) {
                ImageView imageView6 = this.f12282j;
                if (imageView6 != null) {
                    imageView6.setVisibility(0);
                }
                ImageView imageView7 = this.f12282j;
                if (imageView7 != null) {
                    imageView7.bringToFront();
                }
                TextureView textureView2 = this.f12285m;
                if (textureView2 != null) {
                    textureView2.setVisibility(4);
                }
                i2.a aVar2 = this.f12283k;
                if (aVar2 != null) {
                    aVar2.setVisibility(4);
                    return;
                }
                return;
            }
            return;
        }
        ImageView imageView8 = this.f12281i;
        if (imageView8 != null) {
            imageView8.setVisibility(4);
        }
        if (this.f12276d) {
            TextureView textureView3 = this.f12285m;
            if (textureView3 != null) {
                textureView3.setVisibility(0);
            }
            TextureView textureView4 = this.f12285m;
            if (textureView4 != null) {
                textureView4.bringToFront();
            }
            i2.a aVar3 = this.f12283k;
            if (aVar3 != null) {
                aVar3.setVisibility(0);
            }
            i2.a aVar4 = this.f12283k;
            if (aVar4 != null) {
                aVar4.bringToFront();
            }
            String str = this.f12289q ? "iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAMAAADQmBKKAAAAwFBMVEUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAALOy8QAAAAQHRSTlMAT5vPRxSr/1OTn4c4s9cYEMu/XwTDu3fbYwjvt+NA8wwg3/fHKOdLj/tbPDBv03+jl4sca2d7NCTrLINDr6dz72VdRQAAA8FJREFUeAHt2dWW6zgURdEd3GFmZqZi7O7//6rmW7ZiK2VHkYo8X0MreI5GENAiEAgEAoFAIBAIhSORcBSfRSzOf8VjOFMimUpncDFZ/i+XxzkKRZJkKYrLKJNKRZUq/xdJVKAONaoV1WlpNFtQ1qZaUYd23R5U9alUVOlTlBxATZVKRUMeG/WgpE61ojEF6i9SJaJWNKHTKAMF05lSUYgu+vMPLFrQxXJlpGhdLm/gsG3TxVZ/UbRLkrsejhX2bkkL3UVb/meZgLekQ0VrUb7P/43z8JZ0Ba1F67eia7i5qfFY01DRBO5uxxQte2aK2pCYFimaDc0UQaaSpCgyMFIEuT1FcZgowglbiu5MFOGU1ZJ27ZiBIpyUEIvC0F+E0+5pt3zQX4R3xGk3gfYivGOwo11TU5EPj23aPBVMFk0e4CJBuz0MFpHh2DvnT3YrBotIjjZweF7SZg5zRSQ5LsMhSZsslKV4XDSAK9kGXXiizRCKFnSouhdRVnRHmzQ8qzRrI0p4KZIO0VabllkFHuWLFPgukk+IJG1C8KhEqhXxl9EAoudzFv47UrGIbw6njv0ReFOjalGfb9YQlWlTgCdtqhatraISRK2x/w8Recmi0IkPaNp/kHpRCaIX/1sRL1s0hCBKy7LlP0i9aA9BgTYZfUHyohxEEVrKGoPkRTH5j/WtziBp0Vx+jt1rDZIVvcgHwZXeIElRHIIVLQe9QZKiEgQ9Wkp6gyRFOwg2vscrL1w0kv8TMtIYJC/KQXBDS1djkLxoqucVUijSH6RUtKZlpx6kXhTS8rVXKLqlJaUepF6UpOVaPUi9qErLncagmdeiPi2vGoOmHos2tIlpDILHojtautAZ5LEoS8tveoM8FbX6tNThSYPngLeikP9DB154DngpEq/RhjeFEc8A/0UHeDSN0D/4L1rBq0q92qdP8F00HkDNgqfAd9HvgM4i+C6KQmsR/BZ1Aa1F8Fv0B/QWwWdRrgC9RfBZNAD0FsFvETQX4bMV4bMV4bMV4bMV4bMV4bMV4bMV4ZMVtSHxyo8pKsLd/IkfU5SEm1iKFqNFy0c4VZpP5AcVNeEU2pE0XXQ3JsluAsdazRwtBosGq/19tIVjqyeSxovk7kl+pqIH8nMVxen01JxRlIQxT3So3jinyBqm8NjyvgI4ihYwpU9RceM6aaswpUO79l0FEIqMB73SMl4UZNvIAsak33KSefl+tIY5t22SnL2IOWJREia1Qvf3vRZcPE74r9QAn0TlNvvUiEcRCAQCgUAgEAgEdPgLbm7XQrhD8bcAAAAASUVORK5CYII=" : "iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAMAAADQmBKKAAAAw1BMVEUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABAcKsgAAAAQXRSTlMABFeXn38wGNP/u0AMw8tP11+/3/eTOPNH+0tnc3fvb+tDi49TEKMcY8drKCCvFJt7qyQ047eHCCw8g89bp9vns9m2qsEAAAOSSURBVHgB7drVYuNKEEXR03YMJ0aBQXHAYWbm/P9PXZyZBimOHiTVQK9H4zZDFTzP8zzP8zzP83JQtfpSo4mfRqvNfy138HPo9vhNf4CfQYPaMFAQF9IUdSAtpm3UhSza5O+kmBb5O6nPtGgMOQNmmEwhp84MSQ0VUCuz1bGCQ62tM8MGSlebk+RwE67WVlbSNkq2xf8lO0jZbWQk7SmUaZvfxS3kS6pX00NuIct+SNdBNT08RLajmLakU0kP1/GJ40Pa5idV9JD4jBrR1u5W0UN8rkHbaRU9xAIbtM0q6CEWqSU0rZ+V30MstGMXnZffQyx2Qcu49B7iC5c09UvvIb7QbdN0UHYP8ZWrdRrmuyX3EIbDa2TYoalRcg9hIM/PkLZMw40qt8cJYtREynFCw6DcHjeIcfDF+W/L7UkFkRtw7c5pOCm1xw3KLprRcIfc1MFyxMXyBHEGx/06tfk9cmr1SRYRlFzDMaJhBzmFLCiIURe2BxrqyGfGwoK4B8chtTbyWS4wiI+wBTTsIpf1IoNC2O5jagPkwiKDOFjwBN2SCAphe6J2KBHEE1im1JJ7iaAGLLs0jCWChrA9UwskgngGy4jakUjQCiwNag2RoCdYZtTqIkGXsLxQ2xMJCmHpUAtFgtqwNKk9iwRFsJxQi0SCbmDZt46SCBrC8uA+mv5JfQpLjdqrSNAWLAfUzkWCBj/bR8c+LNvUNiSCItgOpb9+bMHSTah1JIIeYOnQsCsQ1IftgtozBIIC2G6pbQsEPStY1IRaDbm8FRm0AtsODS3k8lRg0C0WPGJvyGc3KizovQXbCQ1LyOn4uaigKRx3NATIS631JkUEPcGh3qlNulX/6bkNV42GUdV/C6d77iMaHqr94zy5+GJodljtaGG+iZT9mIaXSocvp/tIe6Vhfl/heGq4iQwdmraqHOApZGjd0DDZlx5xqpCmNfEh8IimNyU9Jg9omUovEjzGNJ1Kr1o8TmiKT4SXUXYSWi6E13UCp6enRBeasErbTUt05evskrZJE6igqI9sK3M6akAVRSNk6S7R1QCqKEqukKaCiK5ToJKig6ycN6aEXZRrFpPkzQ5c90dvTLtUKFv3pXExvYfrJWKGbQUh28yy9nOtwCcHENNj2voAciZM+diHILrWA4gSv3tc7/J3j61u5jTOIG5/zm/eN+7xM7i+4b/eAoWfRHf1I1wawPM8z/M8z/M872/KUtAsVj+VvQAAAABJRU5ErkJggg==";
            i2.a aVar5 = this.f12283k;
            if (aVar5 != null) {
                aVar5.setImage(e2.a.a(str));
            }
            ImageView imageView9 = this.f12282j;
            if (imageView9 != null) {
                imageView9.setVisibility(4);
            }
        }
    }

    public final void f() {
        if (this.f12280h) {
            return;
        }
        this.f12280h = true;
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setAdjustViewBounds(true);
        MediaAssetsHelperKt.setImageData(imageView, this.f12275c);
        this.f12281i = imageView;
        addView(imageView);
        if (!this.f12276d) {
            c(g.f12259b);
            return;
        }
        int toPx = DensityExtKt.getToPx(50);
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.ic_media_play);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(toPx, toPx);
        layoutParams.addRule(13, -1);
        imageView2.setLayoutParams(layoutParams);
        imageView2.setBackgroundColor(Color.parseColor("#6b000000"));
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.appodeal.ads.adapters.iab.unified.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.g(this.f12269b, view);
            }
        });
        this.f12282j = imageView2;
        addView(imageView2);
        final TextureView textureView = new TextureView(getContext());
        textureView.setSurfaceTextureListener(this);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13, -1);
        textureView.setLayoutParams(layoutParams2);
        textureView.setOnClickListener(new View.OnClickListener() { // from class: com.appodeal.ads.adapters.iab.unified.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.d(this.f12270b, textureView, view);
            }
        });
        this.f12285m = textureView;
        addView(textureView);
        i2.a aVar = new i2.a(getContext());
        aVar.h(e2.a.f68788a, e2.a.f68790c);
        int toPx2 = DensityExtKt.getToPx(8);
        aVar.setPadding(toPx2, toPx2, toPx2, toPx2);
        int toPx3 = DensityExtKt.getToPx(40);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(toPx3, toPx3);
        layoutParams3.addRule(9);
        layoutParams3.addRule(10);
        aVar.setLayoutParams(layoutParams3);
        aVar.setOnClickListener(new View.OnClickListener() { // from class: com.appodeal.ads.adapters.iab.unified.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.e(this.f12272b, view);
            }
        });
        String str = this.f12289q ? "iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAMAAADQmBKKAAAAwFBMVEUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAALOy8QAAAAQHRSTlMAT5vPRxSr/1OTn4c4s9cYEMu/XwTDu3fbYwjvt+NA8wwg3/fHKOdLj/tbPDBv03+jl4sca2d7NCTrLINDr6dz72VdRQAAA8FJREFUeAHt2dWW6zgURdEd3GFmZqZi7O7//6rmW7ZiK2VHkYo8X0MreI5GENAiEAgEAoFAIBAIhSORcBSfRSzOf8VjOFMimUpncDFZ/i+XxzkKRZJkKYrLKJNKRZUq/xdJVKAONaoV1WlpNFtQ1qZaUYd23R5U9alUVOlTlBxATZVKRUMeG/WgpE61ojEF6i9SJaJWNKHTKAMF05lSUYgu+vMPLFrQxXJlpGhdLm/gsG3TxVZ/UbRLkrsejhX2bkkL3UVb/meZgLekQ0VrUb7P/43z8JZ0Ba1F67eia7i5qfFY01DRBO5uxxQte2aK2pCYFimaDc0UQaaSpCgyMFIEuT1FcZgowglbiu5MFOGU1ZJ27ZiBIpyUEIvC0F+E0+5pt3zQX4R3xGk3gfYivGOwo11TU5EPj23aPBVMFk0e4CJBuz0MFpHh2DvnT3YrBotIjjZweF7SZg5zRSQ5LsMhSZsslKV4XDSAK9kGXXiizRCKFnSouhdRVnRHmzQ8qzRrI0p4KZIO0VabllkFHuWLFPgukk+IJG1C8KhEqhXxl9EAoudzFv47UrGIbw6njv0ReFOjalGfb9YQlWlTgCdtqhatraISRK2x/w8Recmi0IkPaNp/kHpRCaIX/1sRL1s0hCBKy7LlP0i9aA9BgTYZfUHyohxEEVrKGoPkRTH5j/WtziBp0Vx+jt1rDZIVvcgHwZXeIElRHIIVLQe9QZKiEgQ9Wkp6gyRFOwg2vscrL1w0kv8TMtIYJC/KQXBDS1djkLxoqucVUijSH6RUtKZlpx6kXhTS8rVXKLqlJaUepF6UpOVaPUi9qErLncagmdeiPi2vGoOmHos2tIlpDILHojtautAZ5LEoS8tveoM8FbX6tNThSYPngLeikP9DB154DngpEq/RhjeFEc8A/0UHeDSN0D/4L1rBq0q92qdP8F00HkDNgqfAd9HvgM4i+C6KQmsR/BZ1Aa1F8Fv0B/QWwWdRrgC9RfBZNAD0FsFvETQX4bMV4bMV4bMV4bMV4bMV4bMV4bMV4ZMVtSHxyo8pKsLd/IkfU5SEm1iKFqNFy0c4VZpP5AcVNeEU2pE0XXQ3JsluAsdazRwtBosGq/19tIVjqyeSxovk7kl+pqIH8nMVxen01JxRlIQxT3So3jinyBqm8NjyvgI4ihYwpU9RceM6aaswpUO79l0FEIqMB73SMl4UZNvIAsak33KSefl+tIY5t22SnL2IOWJREia1Qvf3vRZcPE74r9QAn0TlNvvUiEcRCAQCgUAgEAgEdPgLbm7XQrhD8bcAAAAASUVORK5CYII=" : "iVBORw0KGgoAAAANSUhEUgAAAJAAAACQCAMAAADQmBKKAAAAw1BMVEUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABAcKsgAAAAQXRSTlMABFeXn38wGNP/u0AMw8tP11+/3/eTOPNH+0tnc3fvb+tDi49TEKMcY8drKCCvFJt7qyQ047eHCCw8g89bp9vns9m2qsEAAAOSSURBVHgB7drVYuNKEEXR03YMJ0aBQXHAYWbm/P9PXZyZBimOHiTVQK9H4zZDFTzP8zzP8zzP83JQtfpSo4mfRqvNfy138HPo9vhNf4CfQYPaMFAQF9IUdSAtpm3UhSza5O+kmBb5O6nPtGgMOQNmmEwhp84MSQ0VUCuz1bGCQ62tM8MGSlebk+RwE67WVlbSNkq2xf8lO0jZbWQk7SmUaZvfxS3kS6pX00NuIct+SNdBNT08RLajmLakU0kP1/GJ40Pa5idV9JD4jBrR1u5W0UN8rkHbaRU9xAIbtM0q6CEWqSU0rZ+V30MstGMXnZffQyx2Qcu49B7iC5c09UvvIb7QbdN0UHYP8ZWrdRrmuyX3EIbDa2TYoalRcg9hIM/PkLZMw40qt8cJYtREynFCw6DcHjeIcfDF+W/L7UkFkRtw7c5pOCm1xw3KLprRcIfc1MFyxMXyBHEGx/06tfk9cmr1SRYRlFzDMaJhBzmFLCiIURe2BxrqyGfGwoK4B8chtTbyWS4wiI+wBTTsIpf1IoNC2O5jagPkwiKDOFjwBN2SCAphe6J2KBHEE1im1JJ7iaAGLLs0jCWChrA9UwskgngGy4jakUjQCiwNag2RoCdYZtTqIkGXsLxQ2xMJCmHpUAtFgtqwNKk9iwRFsJxQi0SCbmDZt46SCBrC8uA+mv5JfQpLjdqrSNAWLAfUzkWCBj/bR8c+LNvUNiSCItgOpb9+bMHSTah1JIIeYOnQsCsQ1IftgtozBIIC2G6pbQsEPStY1IRaDbm8FRm0AtsODS3k8lRg0C0WPGJvyGc3KizovQXbCQ1LyOn4uaigKRx3NATIS631JkUEPcGh3qlNulX/6bkNV42GUdV/C6d77iMaHqr94zy5+GJodljtaGG+iZT9mIaXSocvp/tIe6Vhfl/heGq4iQwdmraqHOApZGjd0DDZlx5xqpCmNfEh8IimNyU9Jg9omUovEjzGNJ1Kr1o8TmiKT4SXUXYSWi6E13UCp6enRBeasErbTUt05evskrZJE6igqI9sK3M6akAVRSNk6S7R1QCqKEqukKaCiK5ToJKig6ycN6aEXZRrFpPkzQ5c90dvTLtUKFv3pXExvYfrJWKGbQUh28yy9nOtwCcHENNj2voAciZM+diHILrWA4gSv3tc7/J3j61u5jTOIG5/zm/eN+7xM7i+4b/eAoWfRHf1I1wawPM8z/M8z/M872/KUtAsVj+VvQAAAABJRU5ErkJggg==";
        i2.a aVar2 = this.f12283k;
        if (aVar2 != null) {
            aVar2.setImage(e2.a.a(str));
        }
        this.f12283k = aVar;
        addView(aVar);
        i();
    }

    public final boolean h() {
        return (this.f12278f || this.f12284l == null) ? false : true;
    }

    public final MediaPlayer i() {
        VideoData.LocalUri localUri;
        Uri localUri2;
        MediaPlayer mediaPlayer = this.f12284l;
        if (mediaPlayer == null) {
            mediaPlayer = new MediaPlayer();
            mediaPlayer.setOnCompletionListener(this);
            mediaPlayer.setOnErrorListener(this);
            mediaPlayer.setOnPreparedListener(this);
            mediaPlayer.setOnVideoSizeChangedListener(this);
            mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13, -1);
            setLayoutParams(layoutParams);
            this.f12284l = mediaPlayer;
        }
        float f10 = this.f12289q ? 0.0f : 1.0f;
        mediaPlayer.setVolume(f10, f10);
        try {
            if (!this.f12290r && !this.f12291s && !this.f12278f && (localUri = this.f12274b) != null && (localUri2 = localUri.getLocalUri()) != null) {
                MediaPlayer mediaPlayer2 = this.f12284l;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.setDataSource(getContext(), localUri2);
                }
                MediaPlayer mediaPlayer3 = this.f12284l;
                if (mediaPlayer3 != null) {
                    mediaPlayer3.prepareAsync();
                }
                this.f12291s = true;
                return mediaPlayer;
            }
        } catch (Exception e10) {
            Log.log(e10);
        }
        return mediaPlayer;
    }

    public final void j() {
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        if (h() && (mediaPlayer = this.f12284l) != null && mediaPlayer.isPlaying() && (mediaPlayer2 = this.f12284l) != null) {
            mediaPlayer2.pause();
        }
        c(g.f12261d);
    }

    public final void k() {
        MediaPlayer mediaPlayerI = i();
        if (h() && !mediaPlayerI.isPlaying() && this.f12290r && this.f12292t) {
            boolean globalVisibleRect = getGlobalVisibleRect(new Rect());
            boolean zIsShown = isShown();
            boolean zHasWindowFocus = hasWindowFocus();
            if (globalVisibleRect && zIsShown && zHasWindowFocus) {
                c(g.f12260c);
                mediaPlayerI.start();
                if (!this.f12287o) {
                    this.f12287o = true;
                    Log.log("MediaView", "Video", C4240b4.i.f42621d0);
                }
                if (this.f12286n == null && this.f12284l != null && this.f12276d) {
                    Timer timer = new Timer();
                    this.f12286n = timer;
                    timer.schedule(new m(this), 0L, 500L);
                }
            }
        }
    }

    public final void l() {
        MediaPlayer mediaPlayer;
        if (!this.f12288p) {
            this.f12288p = true;
            Log.log("MediaView", "Video", "finished");
        }
        Timer timer = this.f12286n;
        if (timer != null) {
            timer.cancel();
        }
        this.f12286n = null;
        j();
        if (h() && (mediaPlayer = this.f12284l) != null) {
            mediaPlayer.seekTo(0);
        }
        this.f12279g = true;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mp) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mp, int i10, int i11) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        Log.log("MediaView", "Player Error", "what: " + i10 + ", extra: " + i11);
        this.f12277e = false;
        a();
        c(g.f12259b);
        Timer timer = this.f12286n;
        if (timer != null) {
            timer.cancel();
        }
        this.f12286n = null;
        this.f12278f = true;
        this.f12276d = false;
        return true;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE) {
            size = kotlin.ranges.g.j(size, measuredWidth);
        } else if (mode != 1073741824) {
            size = measuredWidth;
        }
        int i12 = (int) (size * 0.5625f);
        if (mode2 != 1073741824 || size2 >= i12) {
            size2 = i12;
        } else {
            size = (int) (size2 * 1.7777778f);
        }
        if (Math.abs(size2 - measuredHeight) >= 2 || Math.abs(size - measuredWidth) >= 2) {
            getLayoutParams().width = size;
            getLayoutParams().height = size2;
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mp) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        Log.log("MediaView", "Player", "prepared");
        this.f12290r = true;
        if (this.f12276d) {
            if (this.f12277e) {
                k();
            } else {
                c(g.f12261d);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        try {
            if (this.f12276d) {
                i().setSurface(new Surface(surfaceTexture));
            }
        } catch (Exception e10) {
            Log.log(e10);
            c(g.f12259b);
            this.f12276d = false;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i10, int i11) {
        Intrinsics.checkNotNullParameter(surface, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mp, int i10, int i11) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        if (i10 == 0 || i11 == 0) {
            Log.log("MediaView", "Video", "onVideoSizeChanged - skip: width or height is 0");
            return;
        }
        TextureView textureView = this.f12285m;
        ViewGroup.LayoutParams layoutParams = textureView != null ? textureView.getLayoutParams() : null;
        int width = getWidth();
        int height = getHeight();
        if (i10 > i11) {
            if (layoutParams != null) {
                layoutParams.width = width;
            }
            if (layoutParams != null) {
                layoutParams.height = (width * i11) / i10;
            }
        } else {
            if (layoutParams != null) {
                layoutParams.width = (i10 * height) / i11;
            }
            if (layoutParams != null) {
                layoutParams.height = height;
            }
        }
        TextureView textureView2 = this.f12285m;
        if (textureView2 != null) {
            textureView2.setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        if (this.f12276d) {
            if (i10 != 0) {
                j();
            } else if (this.f12277e) {
                k();
            }
        }
        super.onWindowVisibilityChanged(i10);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
    }
}
