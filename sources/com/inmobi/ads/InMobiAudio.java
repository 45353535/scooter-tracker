package com.inmobi.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import androidx.annotation.IntRange;
import androidx.annotation.UiThread;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.ads.exceptions.InvalidPlacementIdException;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.AudioAdEventListener;
import com.inmobi.media.C3774i4;
import com.inmobi.media.C4148x5;
import com.inmobi.media.F3;
import com.inmobi.media.J5;
import com.inmobi.media.Jg;
import com.inmobi.media.Ji;
import com.inmobi.media.Kb;
import com.inmobi.media.Ki;
import com.inmobi.media.L5;
import com.inmobi.media.N1;
import com.inmobi.media.Oj;
import com.inmobi.media.R1;
import com.inmobi.media.S8;
import com.inmobi.media.W1;
import com.inmobi.media.Y3;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4424m2;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001)B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u0012\u001a\u00020\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\rJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001e\u0010\rJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001f\u0010\rJ!\u0010#\u001a\u00020\u000b2\b\b\u0001\u0010!\u001a\u00020 2\b\b\u0001\u0010\"\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0007¢\u0006\u0004\b%\u0010\rJ\r\u0010&\u001a\u00020\u000b¢\u0006\u0004\b&\u0010\rJ\r\u0010'\u001a\u00020\u000b¢\u0006\u0004\b'\u0010\rJ\u000f\u0010(\u001a\u00020\u000bH\u0007¢\u0006\u0004\b(\u0010\rR$\u0010.\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u001cR$\u00106\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u00109\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/inmobi/ads/InMobiAudio;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "placementId", "(Landroid/content/Context;J)V", "", "load", "()V", C4424m2.f43623v, "", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "setExtras", "(Ljava/util/Map;)V", "keywords", "setKeywords", "(Ljava/lang/String;)V", "contentUrl", "setContentUrl", "Lcom/inmobi/ads/listeners/AudioAdEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lcom/inmobi/ads/listeners/AudioAdEventListener;)V", "disableHardwareAcceleration", "onAttachedToWindow", "onDetachedFromWindow", "", "widthInDp", "heightInDp", "setAudioSize", "(II)V", "setupViewSizeObserver", "resume", "pause", "destroy", "a", "Lcom/inmobi/ads/listeners/AudioAdEventListener;", "getMPubListener$media_release", "()Lcom/inmobi/ads/listeners/AudioAdEventListener;", "setMPubListener$media_release", "mPubListener", "Lcom/inmobi/media/W1;", "b", "Lcom/inmobi/media/W1;", "getMAdManager$media_release", "()Lcom/inmobi/media/W1;", "setMAdManager$media_release", "(Lcom/inmobi/media/W1;)V", "mAdManager", "getFrameSizeString", "()Ljava/lang/String;", "frameSizeString", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiAudio extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public AudioAdEventListener mPubListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public W1 mAdManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f36484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Jg f36485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f36486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f36488g;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/inmobi/ads/InMobiAudio$a;", "Lcom/inmobi/media/R1;", "Lcom/inmobi/ads/InMobiAudio;", "audio", "<init>", "(Lcom/inmobi/ads/InMobiAudio;)V", "Lcom/inmobi/ads/AdMetaInfo;", "info", "", "onAdFetchSuccessful", "(Lcom/inmobi/ads/AdMetaInfo;)V", "Lcom/inmobi/ads/InMobiAdRequestStatus;", "status", "onAdFetchFailed", "(Lcom/inmobi/ads/InMobiAdRequestStatus;)V", "", "getType", "()B", "type", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends R1 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull InMobiAudio audio) {
            super(audio);
            Intrinsics.checkNotNullParameter(audio, "audio");
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(@NotNull InMobiAdRequestStatus status) {
            AudioAdEventListener mPubListener;
            Intrinsics.checkNotNullParameter(status, "status");
            InMobiAudio inMobiAudio = a().get();
            if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
                return;
            }
            mPubListener.onAdLoadFailed(inMobiAudio, status);
        }

        @Override // com.inmobi.media.R1, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(@NotNull AdMetaInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            super.onAdFetchSuccessful(info);
            InMobiAudio inMobiAudio = a().get();
            if (inMobiAudio == null) {
                return;
            }
            try {
                W1 mAdManager = inMobiAudio.getMAdManager();
                if (mAdManager != null) {
                    mAdManager.k();
                }
            } catch (IllegalStateException e10) {
                Kb.a((byte) 1, "InMobiAudio", e10.getMessage());
                AudioAdEventListener mPubListener = inMobiAudio.getMPubListener();
                if (mPubListener != null) {
                    mPubListener.onAdLoadFailed(inMobiAudio, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiAudio(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        a aVar = new a(this);
        Jg jg2 = new Jg();
        this.f36485d = jg2;
        if (!Ji.d()) {
            throw new SdkNotInitializedException("InMobiAudio");
        }
        if (context instanceof Activity) {
            this.f36484c = new WeakReference(context);
        }
        this.mAdManager = new W1(aVar);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", "placementId");
        if (attributeValue != null) {
            long jA = a(attributeValue);
            if (jA == Long.MIN_VALUE) {
                throw new InvalidPlacementIdException();
            }
            jg2.f37141a = jA;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        W1 w12 = this.mAdManager;
        if (w12 != null) {
            w12.a(context2, jg2, getFrameSizeString());
        }
    }

    public static final boolean access$hasValidSize(InMobiAudio inMobiAudio) {
        return inMobiAudio.f36487f > 0 && inMobiAudio.f36488g > 0;
    }

    private final String getFrameSizeString() {
        return this.f36487f + "x" + this.f36488g;
    }

    public final boolean a() {
        if (this.f36487f <= 0 || this.f36488g <= 0) {
            if (getLayoutParams() == null) {
                Kb.a((byte) 1, "InMobiAudio", "The layout params of the audio ad view must be set before calling load or call setAudioSize(int widthInDp, int heightInDp) before load");
                return false;
            }
            if (getLayoutParams().width == -2 || getLayoutParams().height == -2) {
                Kb.a((byte) 1, "InMobiAudio", "The height or width of a Audio ad can't be WRAP_CONTENT or call setAudioSize(int widthInDp, int heightInDp) before load");
                return false;
            }
            if (getLayoutParams() != null) {
                this.f36487f = F3.b(getLayoutParams().width / J5.b());
                this.f36488g = F3.b(getLayoutParams().height / J5.b());
            }
        }
        return true;
    }

    public final void b() {
        W1 w12;
        N1 n12;
        try {
            C3774i4 c3774i4 = Y3.f38021a;
            Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
            C3774i4 c3774i42 = Y3.f38021a;
            if (!((AdConfig) c3774i42.a(AdConfig.class)).getAudio().getIsAudioEnabled()) {
                W1 w13 = this.mAdManager;
                if (w13 != null) {
                    w13.a((short) 107);
                }
                W1 w14 = this.mAdManager;
                if (w14 != null) {
                    w14.a(w14.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.FEATURE_DISABLED));
                }
                Kb.a((byte) 1, "InMobi", "");
                return;
            }
            Jg jg2 = this.f36485d;
            jg2.getClass();
            Intrinsics.checkNotNullParameter("NonAB", "<set-?>");
            jg2.f37147g = "NonAB";
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            W1 w15 = this.mAdManager;
            if (w15 != null) {
                w15.a(context, this.f36485d, getFrameSizeString());
            }
            W1 w16 = this.mAdManager;
            if (w16 != null && (n12 = w16.f37926j) != null && n12.f38916b == 7) {
                w16.b((short) 15);
                AudioAdEventListener audioAdEventListener = this.mPubListener;
                if (audioAdEventListener != null) {
                    audioAdEventListener.onAdLoadFailed(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                }
                Kb.a((byte) 1, "InMobiAudio", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                return;
            }
            if (!a()) {
                W1 w17 = this.mAdManager;
                if (w17 != null) {
                    w17.a((short) 108);
                }
                W1 w18 = this.mAdManager;
                if (w18 != null) {
                    w18.a(w18.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID));
                    return;
                }
                return;
            }
            Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
            if (((AdConfig) c3774i42.a(AdConfig.class)).getAudio().getMinDeviceVolume() > C4148x5.f39893a.a(Ji.f37157a, Ji.f37162f)) {
                W1 w19 = this.mAdManager;
                if (w19 != null) {
                    w19.a((short) 106);
                }
                W1 w110 = this.mAdManager;
                if (w110 != null) {
                    w110.a(w110.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.DEVICE_AUDIO_LEVEL_LOW));
                    return;
                }
                return;
            }
            if (this.f36487f <= 0 || this.f36488g <= 0) {
                Runnable runnable = new Runnable() { // from class: u3.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        InMobiAudio.a(this.f105208b);
                    }
                };
                Lazy lazy = Oj.f37505a;
                Intrinsics.checkNotNullParameter(runnable, "runnable");
                ((Handler) Oj.f37505a.getValue()).postDelayed(runnable, 200L);
                return;
            }
            long j10 = this.f36486e;
            if (j10 == 0 || (w12 = this.mAdManager) == null || w12.a(j10)) {
                this.f36486e = SystemClock.elapsedRealtime();
                W1 w111 = this.mAdManager;
                if (w111 != null) {
                    w111.b(getFrameSizeString());
                }
            }
        } catch (Exception e10) {
            W1 w112 = this.mAdManager;
            if (w112 != null) {
                w112.a((short) 105);
            }
            Kb.a((byte) 1, "InMobiAudio", "Unable to load ad; SDK encountered an unexpected error");
            e10.getMessage();
        }
    }

    @UiThread
    public final void destroy() {
        removeAllViews();
        W1 w12 = this.mAdManager;
        if (w12 != null) {
            w12.h();
        }
        this.mPubListener = null;
    }

    public final void disableHardwareAcceleration() {
        this.f36485d.f37144d = true;
    }

    @Nullable
    /* JADX INFO: renamed from: getMAdManager$media_release, reason: from getter */
    public final W1 getMAdManager() {
        return this.mAdManager;
    }

    @Nullable
    /* JADX INFO: renamed from: getMPubListener$media_release, reason: from getter */
    public final AudioAdEventListener getMPubListener() {
        return this.mPubListener;
    }

    @UiThread
    public final void load() {
        W1 w12 = this.mAdManager;
        if (w12 != null) {
            w12.g();
        }
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            W1 w12 = this.mAdManager;
            if (w12 != null) {
                w12.j();
            }
            if (getLayoutParams() != null) {
                this.f36487f = F3.b(getLayoutParams().width / J5.b());
                this.f36488g = F3.b(getLayoutParams().height / J5.b());
            }
            if (this.f36487f <= 0 || this.f36488g <= 0) {
                setupViewSizeObserver();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                L5 l52 = J5.f37099a;
                Context context = getContext();
                WindowInsets rootWindowInsets = getRootWindowInsets();
                Intrinsics.checkNotNullExpressionValue(rootWindowInsets, "getRootWindowInsets(...)");
                J5.a(rootWindowInsets, context);
            }
        } catch (Exception e10) {
            Kb.a((byte) 1, "InMobiAudio", "InMobiAudio#onAttachedToWindow() handler threw unexpected error");
            e10.getMessage();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            W1 w12 = this.mAdManager;
            if (w12 != null) {
                w12.p();
            }
        } catch (Exception e10) {
            Kb.a((byte) 1, "InMobiAudio", "InMobiAudio.onDetachedFromWindow() handler threw unexpected error");
            e10.getMessage();
        }
    }

    public final void pause() {
        W1 w12;
        try {
            if (this.f36484c != null || (w12 = this.mAdManager) == null) {
                return;
            }
            w12.i();
        } catch (Exception e10) {
            Kb.a((byte) 1, "InMobi", "Could not pause ad; SDK encountered an unexpected error");
            e10.getMessage();
        }
    }

    public final void resume() {
        W1 w12;
        try {
            if (this.f36484c != null || (w12 = this.mAdManager) == null) {
                return;
            }
            w12.l();
        } catch (Exception e10) {
            Kb.a((byte) 1, "InMobi", "Could not resume ad; SDK encountered an unexpected error");
            e10.getMessage();
        }
    }

    public final void setAudioSize(@IntRange(from = 1) int widthInDp, @IntRange(from = 1) int heightInDp) {
        this.f36487f = widthInDp;
        this.f36488g = heightInDp;
    }

    public final void setContentUrl(@NotNull String contentUrl) {
        Intrinsics.checkNotNullParameter(contentUrl, "contentUrl");
        this.f36485d.f37145e = contentUrl;
    }

    public final void setExtras(@Nullable Map<String, String> extras) {
        if (extras != null) {
            String str = extras.get("tp");
            if (str != null && !TextUtils.isEmpty(str)) {
                Ki.f37226b = str;
            }
            String str2 = extras.get("tp-v");
            if (str2 != null && !TextUtils.isEmpty(str2)) {
                Ki.f37225a = str2;
            }
        }
        this.f36485d.f37143c = extras;
    }

    public final void setKeywords(@Nullable String keywords) {
        this.f36485d.f37142b = keywords;
    }

    public final void setListener(@NotNull AudioAdEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mPubListener = listener;
    }

    public final void setMAdManager$media_release(@Nullable W1 w12) {
        this.mAdManager = w12;
    }

    public final void setMPubListener$media_release(@Nullable AudioAdEventListener audioAdEventListener) {
        this.mPubListener = audioAdEventListener;
    }

    @TargetApi(16)
    public final void setupViewSizeObserver() {
        getViewTreeObserver().addOnGlobalLayoutListener(new S8(this));
    }

    @UiThread
    public final void show() {
        W1 w12 = this.mAdManager;
        if (w12 != null) {
            w12.n();
        }
        W1 w13 = this.mAdManager;
        if (w13 != null) {
            w13.a(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiAudio(@NotNull Context context, long j10) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        a aVar = new a(this);
        Jg jg2 = new Jg();
        this.f36485d = jg2;
        if (Ji.d()) {
            if (context instanceof Activity) {
                this.f36484c = new WeakReference(context);
            }
            W1 w12 = new W1(aVar);
            this.mAdManager = w12;
            jg2.f37141a = j10;
            w12.a(context, jg2, getFrameSizeString());
            return;
        }
        throw new SdkNotInitializedException("InMobiAudio");
    }

    public static final void a(InMobiAudio inMobiAudio) {
        W1 w12;
        try {
            if (inMobiAudio.f36487f > 0 && inMobiAudio.f36488g > 0) {
                long j10 = inMobiAudio.f36486e;
                if (j10 == 0 || (w12 = inMobiAudio.mAdManager) == null || w12.a(j10)) {
                    inMobiAudio.f36486e = SystemClock.elapsedRealtime();
                    W1 w13 = inMobiAudio.mAdManager;
                    if (w13 != null) {
                        w13.b(inMobiAudio.getFrameSizeString());
                        return;
                    }
                    return;
                }
                return;
            }
            Kb.a((byte) 1, "InMobiAudio", "The height or width of the audio ad can not be determined");
            W1 w14 = inMobiAudio.mAdManager;
            if (w14 != null) {
                w14.a((short) 108);
            }
            W1 w15 = inMobiAudio.mAdManager;
            if (w15 != null) {
                w15.a(w15.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        } catch (Exception e10) {
            W1 w16 = inMobiAudio.mAdManager;
            if (w16 != null) {
                w16.a((short) 105);
            }
            Kb.a((byte) 1, "InMobiAudio", "SDK encountered unexpected error while loading an ad");
            e10.getMessage();
        }
    }

    public static long a(String str) {
        try {
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = Intrinsics.compare((int) str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            StringBuilder sb2 = new StringBuilder(str.subSequence(i10, length + 1).toString());
            if (StringsKt.N("plid-", sb2.substring(0, 5), true)) {
                String strSubstring = sb2.substring(5, sb2.length());
                Intrinsics.checkNotNull(strSubstring);
                int length2 = strSubstring.length() - 1;
                int i11 = 0;
                boolean z12 = false;
                while (i11 <= length2) {
                    boolean z13 = Intrinsics.compare((int) strSubstring.charAt(!z12 ? i11 : length2), 32) <= 0;
                    if (z12) {
                        if (!z13) {
                            break;
                        }
                        length2--;
                    } else if (z13) {
                        i11++;
                    } else {
                        z12 = true;
                    }
                }
                return Long.parseLong(strSubstring.subSequence(i11, length2 + 1).toString());
            }
            Kb.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Please make sure placement id is in plid-0123456789 format.");
            Kb.a((byte) 1, "InMobiAudio", "Invalid Placement id: " + str);
            return Long.MIN_VALUE;
        } catch (NumberFormatException unused) {
            Kb.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Audio creation failed.");
            Kb.a((byte) 1, "InMobiAudio", "Invalid Placement id: " + str);
            return Long.MIN_VALUE;
        } catch (StringIndexOutOfBoundsException unused2) {
            Kb.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Please make sure placement id is in plid-0123456789 format.");
            Kb.a((byte) 1, "InMobiAudio", "Invalid Placement id: " + str);
            return Long.MIN_VALUE;
        }
    }
}
