package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import com.inmobi.media.C4103va;
import com.inmobi.media.GestureDetectorOnGestureListenerC3635ci;
import com.inmobi.media.Ne;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import com.ironsource.C4329g8;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.va, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4103va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3635ci f39764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC3878m9 f39766c;

    public C4103va(int i10, GestureDetectorOnGestureListenerC3635ci mRenderView) {
        Intrinsics.checkNotNullParameter(mRenderView, "mRenderView");
        this.f39764a = mRenderView;
        this.f39765b = i10;
    }

    public static final void b(C4103va c4103va, String str, String str2) {
        Ua.a(c4103va.f39764a.getLandingPageHandler(), "open", str, str2, (Ya) null, 24);
    }

    public static final void c(C4103va c4103va, String str, String str2) {
        Ya ya2;
        try {
            Za za2 = c4103va.f39764a.getLandingPageHandler().f37840f;
            if (za2 != null) {
                String strA = Pa.a(str2);
                Ua landingPageHandler = c4103va.f39764a.getLandingPageHandler();
                int i10 = landingPageHandler.f37843i + 1;
                landingPageHandler.f37843i = i10;
                ya2 = new Ya(za2, strA, i10, SystemClock.elapsedRealtime());
            } else {
                ya2 = null;
            }
            if (ya2 != null) {
                ya2.f38042f = "IN_NATIVE";
            }
            c4103va.f39764a.getLandingPageHandler().d("openEmbedded", str, str2, ya2);
        } catch (Exception e10) {
            c4103va.f39764a.a(str, "Unexpected error", "openEmbedded");
            Kb.a((byte) 1, "InMobi", "Failed to open URL; SDK encountered unexpected error");
            InterfaceC3878m9 interfaceC3878m9 = c4103va.f39766c;
            if (interfaceC3878m9 != null) {
                String str3 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m9).b(str3, "SDK encountered unexpected error in handling openEmbedded() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final void d(C4103va c4103va, String str, String str2) {
        Ua.a(c4103va.f39764a.getLandingPageHandler(), "openWithoutTracker", str, str2, (Ya) null, 8);
    }

    public static final void e(C4103va c4103va, String str, String str2) {
        try {
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = c4103va.f39764a;
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = Intrinsics.compare((int) str2.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            gestureDetectorOnGestureListenerC3635ci.b(str, str2.subSequence(i10, length + 1).toString());
        } catch (Exception e10) {
            c4103va.f39764a.a(str, "Unexpected error", "playVideo");
            Kb.a((byte) 1, "InMobi", "Error playing video; SDK encountered an unexpected error");
            InterfaceC3878m9 interfaceC3878m9 = c4103va.f39766c;
            if (interfaceC3878m9 != null) {
                String str3 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m9).b(str3, "SDK encountered unexpected error in handling playVideo() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final void f(C4103va c4103va, String str, String str2) {
        try {
            c4103va.f39764a.getSiblingWebviewManager().b(c4103va.f39764a.getRoute().f36741b, str, str2);
        } catch (Exception e10) {
            c4103va.f39764a.a(C4329g8.f43165j, AbstractC4061ti.a(str, 310));
            InterfaceC3878m9 interfaceC3878m9 = c4103va.f39766c;
            if (interfaceC3878m9 != null) {
                String str3 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m9).b(str3, "SDK encountered unexpected error in handling sendMessage() request from creative; " + e10.getMessage());
            }
        }
    }

    public final Pm a(String str) {
        try {
            for (Object obj : Pm.f37555c) {
                if (Intrinsics.areEqual(((Pm) obj).f37556a, str)) {
                    return (Pm) obj;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (Exception unused) {
            InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
            if (interfaceC3878m9 == null) {
                return null;
            }
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "No matching action found for - " + str);
            return null;
        }
    }

    @JavascriptInterface
    public final void asyncPing(@Nullable String str, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "asyncPing called: " + url);
        }
        if (!URLUtil.isValidUrl(url)) {
            this.f39764a.a(str, "Invalid url", "asyncPing");
            return;
        }
        try {
            Deferred deferredA = ((C4077u9) He.f37018c.getValue()).a(new Je(url, null, null, null, null, false, 62));
            Function1 onCompleted = new Function1() { // from class: w3.lb
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4103va.a(this.f107172b, (Ne) obj);
                }
            };
            Intrinsics.checkNotNullParameter(deferredA, "<this>");
            Intrinsics.checkNotNullParameter(onCompleted, "onCompleted");
            eg.i.d(A9.f36557c, null, null, new A3(deferredA, onCompleted, null), 3, null);
        } catch (Exception e10) {
            this.f39764a.a(str, "Unexpected error", "asyncPing");
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str3 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str3, "SDK encountered internal error in handling asyncPing() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void cancelSaveContent(@Nullable String str, @NotNull String mediaId) {
        Intrinsics.checkNotNullParameter(mediaId, "mediaId");
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "cancelSaveContent called. mediaId:" + mediaId);
        }
    }

    @JavascriptInterface
    public final void close(@Nullable final String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "close called");
        }
        final GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA = a();
        if (gestureDetectorOnGestureListenerC3635ciA == null) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str3 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).a(str3, "webview not present cannot be closed");
                return;
            }
            return;
        }
        if (!gestureDetectorOnGestureListenerC3635ciA.O0) {
            Wb wb2 = (Wb) AbstractC3925o6.f39166e.getValue();
            Runnable runnable = new Runnable() { // from class: w3.sb
                @Override // java.lang.Runnable
                public final void run() {
                    C4103va.a(gestureDetectorOnGestureListenerC3635ciA, this, str);
                }
            };
            wb2.getClass();
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            wb2.f37946a.post(runnable);
            return;
        }
        InterfaceC3878m9 interfaceC3878m93 = this.f39766c;
        if (interfaceC3878m93 != null) {
            String str4 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m93).b(str4, "close called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void closeAll(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "closeAll is called");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA = a();
        if (gestureDetectorOnGestureListenerC3635ciA != null) {
            gestureDetectorOnGestureListenerC3635ciA.g();
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
        if (interfaceC3878m92 != null) {
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m92).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void closeCustomExpand(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "closeCustomExpand called.");
        }
        if (this.f39765b == 1) {
            if (this.f39764a != null) {
                new Handler(this.f39764a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: w3.wb
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4103va.a(this.f107369b);
                    }
                });
                return;
            }
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str3 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3878m9 interfaceC3878m93 = this.f39766c;
        if (interfaceC3878m93 != null) {
            String str4 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m93).b(str4, "closeCustomExpand called in incorrect Ad type: " + this.f39765b);
        }
    }

    @JavascriptInterface
    public final void createVideoPlayer(@Nullable String str, @Nullable String str2) throws JSONException {
        Object objD;
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str3, "createVideoPlayer is called with config - " + str2);
        }
        EnumC3573a8[] enumC3573a8Arr = EnumC3573a8.f38173a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMessage", "Invalid config");
        jSONObject.put("jsCommand", "createVideoPlayer");
        jSONObject.put("params", "null");
        if (str2 != null) {
            Object obj = null;
            try {
                JSONObject jsonObject = new JSONObject(str2);
                Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                Intrinsics.checkNotNullParameter(HtmlVideoPlayerRequest.class, "type");
                HtmlVideoPlayerRequest htmlVideoPlayerRequest = (HtmlVideoPlayerRequest) HtmlVideoPlayerRequest.class.cast(AbstractC3879ma.a(jsonObject, HtmlVideoPlayerRequest.class, null, null));
                if (htmlVideoPlayerRequest == null || (objD = eg.i.d(A9.f36560f, null, null, new C3954pa(this, htmlVideoPlayerRequest, null), 3, null)) == null) {
                    EnumC3952p8 enumC3952p8 = EnumC3952p8.f39251b;
                    a(str, jSONObject);
                    obj = Unit.f93236a;
                } else {
                    obj = objD;
                }
            } catch (JSONException e10) {
                EnumC3952p8 enumC3952p82 = EnumC3952p8.f39251b;
                a(str, jSONObject);
                InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
                if (interfaceC3878m92 != null) {
                    String str4 = AbstractC4128wa.f39835a;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((C3903n9) interfaceC3878m92).a(str4, "Error while creating config Json.", e10);
                    obj = Unit.f93236a;
                }
            }
            if (obj != null) {
                return;
            }
        }
        EnumC3952p8 enumC3952p83 = EnumC3952p8.f39251b;
        a(str, jSONObject);
        Unit unit = Unit.f93236a;
    }

    @JavascriptInterface
    public final void customExpand(@Nullable String str, @Nullable String str2, int i10, float f10, boolean z10, boolean z11) {
        Ya ya2;
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str3, "customExpand called");
        }
        if (this.f39764a.O0) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str4 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str4, "customExpand called on unloaded ad");
                return;
            }
            return;
        }
        if (this.f39765b != 1) {
            InterfaceC3878m9 interfaceC3878m93 = this.f39766c;
            if (interfaceC3878m93 != null) {
                String str5 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m93).b(str5, "customExpand called in incorrect Ad type: " + this.f39765b);
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i11 = 0;
            boolean z12 = false;
            while (i11 <= length) {
                boolean z13 = Intrinsics.compare((int) str2.charAt(!z12 ? i11 : length), 32) <= 0;
                if (z12) {
                    if (!z13) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z13) {
                    i11++;
                } else {
                    z12 = true;
                }
            }
            if (str2.subSequence(i11, length + 1).toString().length() != 0) {
                if (i10 < 0 || i10 >= R5.values().length) {
                    this.f39764a.a(str, "Invalid inputType", "customExpand");
                    return;
                }
                if (f10 < 0.0f || f10 > 1.0f) {
                    this.f39764a.a(str, "Invalid screenPercentage", "customExpand");
                    return;
                }
                Za za2 = this.f39764a.getLandingPageHandler().f37840f;
                if (za2 != null) {
                    String strA = Pa.a(str2);
                    Ua landingPageHandler = this.f39764a.getLandingPageHandler();
                    int i12 = landingPageHandler.f37843i + 1;
                    landingPageHandler.f37843i = i12;
                    ya2 = new Ya(za2, strA, i12, SystemClock.elapsedRealtime());
                } else {
                    ya2 = null;
                }
                Ya ya3 = ya2;
                if (ya3 != null) {
                    ya3.f38042f = "IN_CUSTOM";
                }
                this.f39764a.getLandingPageHandler().a(Na.f37430d, ya3, (Integer) 8008);
                a(str, str2, i10, f10, z11, ya3);
                return;
            }
        }
        this.f39764a.a(str, "Invalid " + i10, "customExpand");
    }

    @JavascriptInterface
    public final void customExpandInNative(@Nullable String str, @NotNull String url, float f10, boolean z10) {
        Ya ya2;
        Intrinsics.checkNotNullParameter(url, "url");
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "customExpandInNative called");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39764a;
        if (gestureDetectorOnGestureListenerC3635ci.O0) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str3 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str3, "customExpandInNative called on unloaded ad");
                return;
            }
            return;
        }
        if (this.f39765b != 1) {
            InterfaceC3878m9 interfaceC3878m93 = this.f39766c;
            if (interfaceC3878m93 != null) {
                String str4 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m93).b(str4, "customExpandInNative called in incorrect Ad type: " + this.f39765b);
                return;
            }
            return;
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            gestureDetectorOnGestureListenerC3635ci.a(str, "Invalid screenPercentage", "customExpandInNative");
            return;
        }
        Za za2 = gestureDetectorOnGestureListenerC3635ci.getLandingPageHandler().f37840f;
        if (za2 != null) {
            String strA = Pa.a(url);
            Ua landingPageHandler = this.f39764a.getLandingPageHandler();
            int i10 = landingPageHandler.f37843i + 1;
            landingPageHandler.f37843i = i10;
            ya2 = new Ya(za2, strA, i10, SystemClock.elapsedRealtime());
        } else {
            ya2 = null;
        }
        Ya ya3 = ya2;
        if (ya3 != null) {
            ya3.f38042f = "IN_NATIVE";
        }
        this.f39764a.getLandingPageHandler().a(Na.f37430d, ya3, (Integer) 8010);
        int iA = this.f39764a.getLandingPageHandler().a("customExpandInNative", str, url, ya3, new P2(f10, z10));
        InterfaceC3878m9 interfaceC3878m94 = this.f39766c;
        if (interfaceC3878m94 != null) {
            String str5 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m94).a(str5, "customExpandInNativeRequest: " + iA);
        }
        if (iA == 3) {
            R5 r52 = R5.f37637a;
            a(str, url, 0, f10, !z10, ya3);
        }
    }

    @JavascriptInterface
    public final void destroyVideoPlayer(@Nullable String str) {
        eg.i.d(A9.f36560f, null, null, new C3979qa(this, null), 3, null);
    }

    @JavascriptInterface
    public final void destroyWebView(@Nullable String str, @Nullable final String str2) throws JSONException {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str3, "destroyWebView called");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA = a();
        if (gestureDetectorOnGestureListenerC3635ciA != null && gestureDetectorOnGestureListenerC3635ciA.O0) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str4 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str4, "destroyWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39764a;
            if (str2 == null) {
                str2 = "";
            }
            Lazy lazy = AbstractC4061ti.f39603a;
            JSONObject jSONObjectA = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put("errorCode", 108);
            gestureDetectorOnGestureListenerC3635ci.a("destroyWebView", jSONObjectA);
            return;
        }
        if (str2 != null && str2.length() != 0) {
            Wb wb2 = (Wb) AbstractC3925o6.f39166e.getValue();
            Runnable runnable = new Runnable() { // from class: w3.ib
                @Override // java.lang.Runnable
                public final void run() {
                    C4103va.a(this.f107104b, str2);
                }
            };
            wb2.getClass();
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            wb2.f37946a.post(runnable);
            return;
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci2 = this.f39764a;
        if (str2 == null) {
            str2 = "";
        }
        Lazy lazy2 = AbstractC4061ti.f39603a;
        JSONObject jSONObjectA2 = Si.a(str2, "targetViewId", "id", str2);
        jSONObjectA2.put("errorCode", 302);
        gestureDetectorOnGestureListenerC3635ci2.a("destroyWebView", jSONObjectA2);
    }

    @JavascriptInterface
    public final void disableBackButton(@Nullable String str, final boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "disableBackButton called");
        }
        this.f39764a.getWebViewFactory().a(new Function1() { // from class: w3.ub
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4103va.a(z10, (GestureDetectorOnGestureListenerC3635ci) obj);
            }
        });
    }

    @JavascriptInterface
    public final void disableCloseRegion(@Nullable final String str, final boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "disableCloseRegion called");
        }
        Wb wb2 = (Wb) AbstractC3925o6.f39166e.getValue();
        Runnable runnable = new Runnable() { // from class: w3.vb
            @Override // java.lang.Runnable
            public final void run() {
                C4103va.a(this.f107355b, z10, str);
            }
        };
        wb2.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wb2.f37946a.post(runnable);
    }

    @JavascriptInterface
    public final void enableNativeGestures(@Nullable String str, boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "enableNativeGestures called with enabled: " + z10);
        }
        this.f39764a.setEnableNativeGestures(z10);
    }

    @JavascriptInterface
    public final void enableTouchBeginCallback(@Nullable String str, boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "enableTouchBeginCallback called with enabled: " + z10);
        }
        this.f39764a.setEnableTouchBeginCallback(z10);
    }

    @JavascriptInterface
    public final void enableTouchEndCallback(@Nullable String str, boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "enableTouchEndCallback called with enabled: " + z10);
        }
        this.f39764a.setEnableTouchEndCallback(z10);
    }

    @JavascriptInterface
    public final void executeVideoPlayerActions(@Nullable String str, @NotNull String action, @Nullable String str2) throws JSONException {
        Intrinsics.checkNotNullParameter(action, "action");
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str3, "executeVideoPlayerActions is called with action - " + action + ", " + str2);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("videoCommand", action);
        jSONObject.put("config", str2);
        EnumC3573a8[] enumC3573a8Arr = EnumC3573a8.f38173a;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("errorMessage", "Invalid action");
        jSONObject2.put("jsCommand", "executeVideoPlayerActions");
        jSONObject2.put("params", String.valueOf(jSONObject));
        try {
            Pm pmA = a(action);
            if (pmA != null && eg.i.d(A9.f36560f, null, null, new C4003ra(this, pmA, jSONObject, null), 3, null) != null) {
                return;
            }
            EnumC3952p8 enumC3952p8 = EnumC3952p8.f39251b;
            a(str, jSONObject2);
            Unit unit = Unit.f93236a;
        } catch (JSONException e10) {
            EnumC3952p8 enumC3952p82 = EnumC3952p8.f39251b;
            a(str, jSONObject2);
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str4 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).a(str4, "Error while creating action Json.", e10);
            }
        }
    }

    @JavascriptInterface
    public final void fireAdFailed(@Nullable String str) {
        try {
            InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
            if (interfaceC3878m9 != null) {
                String str2 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m9).a(str2, "fireAdFailed called.");
            }
            this.f39764a.p();
        } catch (Exception e10) {
            this.f39764a.a(str, "Unexpected error", "fireAdFailed");
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str3 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str3, "SDK encountered unexpected error in handling fireAdFailed() signal from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void fireAdReady(@Nullable String str) {
        try {
            InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
            if (interfaceC3878m9 != null) {
                String str2 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m9).a(str2, "fireAdReady called.");
            }
            this.f39764a.q();
        } catch (Exception e10) {
            this.f39764a.a(str, "Unexpected error", "fireAdReady");
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str3 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str3, "SDK encountered unexpected error in handling fireAdReady() signal from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void fireComplete(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "fireComplete is called");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39764a;
        if (gestureDetectorOnGestureListenerC3635ci != null) {
            gestureDetectorOnGestureListenerC3635ci.h();
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
        if (interfaceC3878m92 != null) {
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m92).b(str3, "Found a null instance of render view!");
        }
    }

    @JavascriptInterface
    public final void fireSkip(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9;
        InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
        if (interfaceC3878m92 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m92).a(str2, "fireSkip is called");
        }
        if (this.f39764a == null && (interfaceC3878m9 = this.f39766c) != null) {
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).b(str3, "Found a null instance of render view!");
        }
        this.f39764a.P();
    }

    @JavascriptInterface
    @Nullable
    public final String getAdContext(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "getAdContext is called");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA = a();
        if (gestureDetectorOnGestureListenerC3635ciA != null) {
            InterfaceC4118w0 adPodHandler = gestureDetectorOnGestureListenerC3635ciA.getAdPodHandler();
            if (adPodHandler != null) {
                return ((AbstractC3845l1) adPodHandler).u();
            }
            return null;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
        if (interfaceC3878m92 != null) {
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m92).b(str3, "Found a null instance of ad render view!");
        }
        return null;
    }

    @JavascriptInterface
    public final void getBlob(@Nullable String str, @Nullable String str2) {
        E2 e22;
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str3, "getBlob is called");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39764a;
        if (gestureDetectorOnGestureListenerC3635ci == null) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str4 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3878m9 interfaceC3878m93 = gestureDetectorOnGestureListenerC3635ci.f38368i;
        if (interfaceC3878m93 != null) {
            String TAG = GestureDetectorOnGestureListenerC3635ci.f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m93).a(TAG, "getBlob");
        }
        if (str == null || str2 == null || (e22 = gestureDetectorOnGestureListenerC3635ci.f38371j0) == null) {
            return;
        }
        ((AbstractC3845l1) e22).a(str, str2, gestureDetectorOnGestureListenerC3635ci, gestureDetectorOnGestureListenerC3635ci.getImpressionId());
    }

    @JavascriptInterface
    @NotNull
    public final String getCurrentPosition(@Nullable String str) {
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci;
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "getCurrentPosition called");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci2 = this.f39764a;
        if (gestureDetectorOnGestureListenerC3635ci2 == null) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 == null) {
                return "";
            }
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m92).b(str3, "Found a null instance of render view!");
            return "";
        }
        synchronized (gestureDetectorOnGestureListenerC3635ci2.getCurrentPositionMonitor()) {
            this.f39764a.F = true;
            new Handler(this.f39764a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: w3.hb
                @Override // java.lang.Runnable
                public final void run() {
                    C4103va.b(this.f107086b);
                }
            });
            while (true) {
                gestureDetectorOnGestureListenerC3635ci = this.f39764a;
                if (gestureDetectorOnGestureListenerC3635ci.F) {
                    try {
                        gestureDetectorOnGestureListenerC3635ci.getCurrentPositionMonitor().wait();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    Unit unit = Unit.f93236a;
                }
            }
        }
        return gestureDetectorOnGestureListenerC3635ci.getCurrentPosition();
    }

    @JavascriptInterface
    public final int getCurrentRenderingIndex(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "getCurrentRenderingIndex is called");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA = a();
        if (gestureDetectorOnGestureListenerC3635ciA != null) {
            return gestureDetectorOnGestureListenerC3635ciA.getCurrentRenderingPodAdIndex();
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
        if (interfaceC3878m92 == null) {
            return 0;
        }
        String str3 = AbstractC4128wa.f39835a;
        Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
        ((C3903n9) interfaceC3878m92).b(str3, "Found a null instance of ad render view!");
        return 0;
    }

    @JavascriptInterface
    @NotNull
    public final String getDefaultPosition(@Nullable String str) {
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci;
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "getDefaultPosition called");
        }
        synchronized (this.f39764a.getDefaultPositionMonitor()) {
            this.f39764a.E = true;
            new Handler(this.f39764a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: w3.tb
                @Override // java.lang.Runnable
                public final void run() {
                    C4103va.c(this.f107326b);
                }
            });
            while (true) {
                gestureDetectorOnGestureListenerC3635ci = this.f39764a;
                if (gestureDetectorOnGestureListenerC3635ci.E) {
                    try {
                        gestureDetectorOnGestureListenerC3635ci.getDefaultPositionMonitor().wait();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    Unit unit = Unit.f93236a;
                }
            }
        }
        return gestureDetectorOnGestureListenerC3635ci.getDefaultPosition();
    }

    @JavascriptInterface
    public final int getDeviceVolume(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "getDeviceVolume called");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39764a;
        if (gestureDetectorOnGestureListenerC3635ci == null) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str3 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str3, "Found a null instance of render view!");
            }
            return -1;
        }
        try {
            C4130wc mediaProcessor = gestureDetectorOnGestureListenerC3635ci.getMediaProcessor();
            if (mediaProcessor != null) {
                return mediaProcessor.a();
            }
        } catch (Exception e10) {
            this.f39764a.a(str, "Unexpected error", "getDeviceVolume");
            InterfaceC3878m9 interfaceC3878m93 = this.f39766c;
            if (interfaceC3878m93 != null) {
                String str4 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m93).b(str4, "SDK encountered unexpected error in handling getDeviceVolume() request from creative; " + e10.getMessage());
            }
        }
        return -1;
    }

    @JavascriptInterface
    public final int getMaxDeviceVolume(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "getMaxDeviceVolume called");
        }
        try {
            C4148x5 c4148x5 = C4148x5.f39893a;
            c4148x5.getClass();
            return ((Number) C4148x5.f39898f.getValue(c4148x5, C4148x5.f39894b[0])).intValue();
        } catch (Exception e10) {
            this.f39764a.a(str, "Unexpected error", "getMaxDeviceVolume");
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str3 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str3, "SDK encountered unexpected error in handling getMaxDeviceVolume() request from creative; " + e10.getMessage());
            }
            return 0;
        }
    }

    @JavascriptInterface
    @NotNull
    public final String getMaxSize(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "getMaxSize called");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Activity fullScreenActivity = this.f39764a.getFullScreenActivity();
            if (fullScreenActivity == null) {
                Context containerContext = this.f39764a.getContainerContext();
                if ((containerContext instanceof Activity ? (Activity) containerContext : null) == null) {
                    return getScreenSize(str);
                }
                Context containerContext2 = this.f39764a.getContainerContext();
                Intrinsics.checkNotNull(containerContext2, "null cannot be cast to non-null type android.app.Activity");
                fullScreenActivity = (Activity) containerContext2;
            }
            FrameLayout frameLayout = (FrameLayout) fullScreenActivity.findViewById(R.id.content);
            kotlin.jvm.internal.t0 t0Var = new kotlin.jvm.internal.t0();
            t0Var.f93331b = F3.b(frameLayout.getWidth() / J5.b());
            kotlin.jvm.internal.t0 t0Var2 = new kotlin.jvm.internal.t0();
            t0Var2.f93331b = F3.b(frameLayout.getHeight() / J5.b());
            if (this.f39764a.getFullScreenActivity() != null && (t0Var.f93331b == 0 || t0Var2.f93331b == 0)) {
                Intrinsics.checkNotNull(frameLayout);
                ViewTreeObserverOnGlobalLayoutListenerC3929oa viewTreeObserverOnGlobalLayoutListenerC3929oa = new ViewTreeObserverOnGlobalLayoutListenerC3929oa(frameLayout, this.f39766c);
                frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC3929oa);
                eg.i.d(A9.f36557c, null, null, new C4028sa(viewTreeObserverOnGlobalLayoutListenerC3929oa, t0Var, t0Var2, null), 3, null);
            }
            try {
                jSONObject.put("width", t0Var.f93331b);
                jSONObject.put("height", t0Var2.f93331b);
            } catch (JSONException e10) {
                InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
                if (interfaceC3878m92 != null) {
                    String str3 = AbstractC4128wa.f39835a;
                    Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((C3903n9) interfaceC3878m92).a(str3, "Error while creating max size Json.", e10);
                }
            }
            InterfaceC3878m9 interfaceC3878m93 = this.f39766c;
            if (interfaceC3878m93 != null) {
                String str4 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m93).a(str4, "getMaxSize called:" + jSONObject);
            }
        } catch (Exception e11) {
            this.f39764a.a(str, "Unexpected error", "getMaxSize");
            InterfaceC3878m9 interfaceC3878m94 = this.f39766c;
            if (interfaceC3878m94 != null) {
                String str5 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m94).b(str5, "SDK encountered unexpected error in handling getMaxSize() request from creative; " + e11.getMessage());
            }
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @JavascriptInterface
    @NotNull
    public final String getOrientation(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "getOrientation called");
        }
        byte bG = J5.g();
        return bG == 1 ? "0" : bG == 3 ? "90" : bG == 2 ? "180" : bG == 4 ? "270" : com.ironsource.X1.f42014f;
    }

    @JavascriptInterface
    @NotNull
    public final String getOrientationProperties(@Nullable String str) {
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA = a();
        if (gestureDetectorOnGestureListenerC3635ciA == null) {
            gestureDetectorOnGestureListenerC3635ciA = this.f39764a;
        }
        String str2 = gestureDetectorOnGestureListenerC3635ciA.getOrientationProperties().f36853d;
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str3, "getOrientationProperties called: " + str2);
        }
        Intrinsics.checkNotNull(str2);
        return str2;
    }

    @JavascriptInterface
    @NotNull
    public final String getPlacementType(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "getPlacementType called");
        }
        return 1 == this.f39765b ? "interstitial" : "inline";
    }

    @JavascriptInterface
    @NotNull
    public final String getPlatform(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 == null) {
            return "android";
        }
        String str2 = AbstractC4128wa.f39835a;
        Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        ((C3903n9) interfaceC3878m9).a(str2, "getPlatform. Platform:android");
        return "android";
    }

    @JavascriptInterface
    @NotNull
    public final String getPlatformVersion(@Nullable String str) {
        String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "getPlatformVersion. Version:" + strValueOf);
        }
        return strValueOf;
    }

    @JavascriptInterface
    @Nullable
    public final String getPlaybackState(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        eg.i.d(A9.f36560f, null, null, new C4053ta(this, ref$ObjectRef, countDownLatch, null), 3, null);
        if (!countDownLatch.await(1L, TimeUnit.SECONDS) && (interfaceC3878m9 = this.f39766c) != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).b(str2, "getPlaybackState timed out waiting on main thread");
        }
        JSONObject jSONObject = (JSONObject) ref$ObjectRef.f93280b;
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        return null;
    }

    @JavascriptInterface
    @NotNull
    public final String getRenderableAdIndexes(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "getRenderableAdIndexes is called");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA = a();
        if (gestureDetectorOnGestureListenerC3635ciA == null) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str3 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str3, "Found a null instance of ad render view!");
            }
            String string = new JSONArray().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        JSONArray renderableAdIndexes = gestureDetectorOnGestureListenerC3635ciA.getRenderableAdIndexes();
        InterfaceC3878m9 interfaceC3878m93 = this.f39766c;
        if (interfaceC3878m93 != null) {
            String str4 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m93).a(str4, "renderableAdIndexes called:" + renderableAdIndexes);
        }
        String string2 = renderableAdIndexes.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @JavascriptInterface
    @Nullable
    public final String getSafeArea(@Nullable String str) {
        JSONObject safeArea = this.f39764a.getSafeArea();
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "getSafeArea called:" + safeArea);
        }
        if (safeArea != null) {
            return safeArea.toString();
        }
        return null;
    }

    @JavascriptInterface
    @NotNull
    public final String getScreenSize(@Nullable String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", J5.h().f37265a);
            jSONObject.put("height", J5.h().f37266b);
            InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
            if (interfaceC3878m9 != null) {
                String str2 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m9).c(str2, "Message:Width x Height : " + J5.h().f37265a + "x" + J5.h().f37266b);
            }
        } catch (JSONException unused) {
        } catch (Exception e10) {
            this.f39764a.a(str, "Unexpected error", "getScreenSize");
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str3 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str3, "SDK encountered unexpected error while getting screen dimensions; " + e10.getMessage());
            }
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        InterfaceC3878m9 interfaceC3878m93 = this.f39766c;
        if (interfaceC3878m93 != null) {
            String str4 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m93).a(str4, "getScreenSize called:" + string);
        }
        return string;
    }

    @JavascriptInterface
    @NotNull
    public final String getSdkVersion(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 == null) {
            return "11.1.0";
        }
        String str2 = AbstractC4128wa.f39835a;
        Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        ((C3903n9) interfaceC3878m9).a(str2, "getSdkVersion called. Version:11.1.0");
        return "11.1.0";
    }

    @JavascriptInterface
    public final long getShowTimeStamp(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "getShowTimeStamp is called");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA = a();
        if (gestureDetectorOnGestureListenerC3635ciA == null) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 == null) {
                return 0L;
            }
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m92).b(str3, "Found a null instance of ad render view!");
            return 0L;
        }
        long showTimeStamp = gestureDetectorOnGestureListenerC3635ciA.getShowTimeStamp();
        InterfaceC3878m9 interfaceC3878m93 = this.f39766c;
        if (interfaceC3878m93 != null) {
            String str4 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m93).a(str4, "getShowTimeStamp is " + showTimeStamp);
        }
        return showTimeStamp;
    }

    @JavascriptInterface
    @NotNull
    public final String getState(@Nullable String str) {
        String viewState = this.f39764a.getViewState();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = viewState.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).c(str2, "getState called:" + lowerCase);
        }
        return lowerCase;
    }

    @JavascriptInterface
    @NotNull
    public final String getVersion(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 == null) {
            return "2.0";
        }
        String str2 = AbstractC4128wa.f39835a;
        Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        ((C3903n9) interfaceC3878m9).a(str2, "getVersion called. Version:2.0");
        return "2.0";
    }

    @JavascriptInterface
    public final void impressionFired(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "impressionFired is called");
        }
        this.f39764a.C();
    }

    @JavascriptInterface
    public final void incentCompleted(@Nullable String str, @Nullable String str2) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str3, "incentCompleted called. IncentData:" + str2);
        }
        if (str2 == null) {
            try {
                this.f39764a.getListener().b(new HashMap());
                return;
            } catch (Exception e10) {
                this.f39764a.a(str, "Unexpected error", "incentCompleted");
                InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
                if (interfaceC3878m92 != null) {
                    String str4 = AbstractC4128wa.f39835a;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((C3903n9) interfaceC3878m92).b(str4, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e10.getMessage());
                    return;
                }
                return;
            }
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlin.String");
                    String str5 = next;
                    map.put(str5, jSONObject.get(str5));
                }
                try {
                    this.f39764a.getListener().b(map);
                    Unit unit = Unit.f93236a;
                } catch (Exception e11) {
                    this.f39764a.a(str, "Unexpected error", "incentCompleted");
                    InterfaceC3878m9 interfaceC3878m93 = this.f39766c;
                    if (interfaceC3878m93 != null) {
                        String str6 = AbstractC4128wa.f39835a;
                        Intrinsics.checkNotNullExpressionValue(str6, "access$getTAG$p(...)");
                        ((C3903n9) interfaceC3878m93).b(str6, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e11.getMessage());
                        Unit unit2 = Unit.f93236a;
                    }
                }
            } catch (Exception e12) {
                this.f39764a.a(str, "Unexpected error", "incentCompleted");
                InterfaceC3878m9 interfaceC3878m94 = this.f39766c;
                if (interfaceC3878m94 != null) {
                    String str7 = AbstractC4128wa.f39835a;
                    Intrinsics.checkNotNullExpressionValue(str7, "access$getTAG$p(...)");
                    ((C3903n9) interfaceC3878m94).b(str7, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e12.getMessage());
                    Unit unit3 = Unit.f93236a;
                }
            }
        } catch (JSONException unused) {
            this.f39764a.getListener().b(new HashMap());
            Unit unit4 = Unit.f93236a;
        }
    }

    @JavascriptInterface
    public final boolean isBackButtonDisabled(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "isBackButtonDisabled called");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA = a();
        if (gestureDetectorOnGestureListenerC3635ciA == null) {
            gestureDetectorOnGestureListenerC3635ciA = this.f39764a;
        }
        return gestureDetectorOnGestureListenerC3635ciA.K;
    }

    @JavascriptInterface
    @NotNull
    public final String isDeviceMuted(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "isDeviceMuted called");
        }
        if (this.f39764a == null) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 == null) {
                return "false";
            }
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m92).b(str3, "Found a null instance of render view!");
            return "false";
        }
        InterfaceC3878m9 interfaceC3878m93 = this.f39766c;
        if (interfaceC3878m93 != null) {
            String str4 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m93).a(str4, "JavaScript called: isDeviceMuted()");
        }
        boolean z10 = false;
        try {
            C4130wc mediaProcessor = this.f39764a.getMediaProcessor();
            Intrinsics.checkNotNull(mediaProcessor);
            InterfaceC3878m9 interfaceC3878m94 = mediaProcessor.f39840b;
            if (interfaceC3878m94 != null) {
                ((C3903n9) interfaceC3878m94).c("MraidMediaProcessor", "isVolumeMuted");
            }
            Context context = Ji.f37157a;
            if (context != null) {
                Object systemService = context.getSystemService("audio");
                AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
                if (audioManager != null) {
                    if (2 != audioManager.getRingerMode()) {
                        z10 = true;
                    }
                }
            }
        } catch (Exception e10) {
            InterfaceC3878m9 interfaceC3878m95 = this.f39766c;
            if (interfaceC3878m95 != null) {
                String str5 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m95).b(str5, "SDK encountered unexpected error in checking if device is muted; " + e10.getMessage());
            }
        }
        return String.valueOf(z10);
    }

    @JavascriptInterface
    @NotNull
    public final String isHeadphonePlugged(@Nullable String str) {
        boolean zB;
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "isHeadphonePlugged called");
        }
        if (this.f39764a == null) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 == null) {
                return "false";
            }
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m92).b(str3, "Found a null instance of render view!");
            return "false";
        }
        InterfaceC3878m9 interfaceC3878m93 = this.f39766c;
        if (interfaceC3878m93 != null) {
            String str4 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m93).a(str4, "JavaScript called: isHeadphonePlugged()");
        }
        try {
            C4130wc mediaProcessor = this.f39764a.getMediaProcessor();
            Intrinsics.checkNotNull(mediaProcessor);
            mediaProcessor.getClass();
            zB = C4130wc.b();
        } catch (Exception e10) {
            InterfaceC3878m9 interfaceC3878m94 = this.f39766c;
            if (interfaceC3878m94 != null) {
                String str5 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m94).b(str5, "SDK encountered unexpected error in checking if headphones are plugged-in; " + e10.getMessage());
            }
            zB = false;
        }
        return String.valueOf(zB);
    }

    @JavascriptInterface
    public final boolean isViewable(@Nullable String str) {
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39764a;
        if (gestureDetectorOnGestureListenerC3635ci != null) {
            return gestureDetectorOnGestureListenerC3635ci.I == Hn.f37036c;
        }
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).b(str2, "Found a null instance of render view!");
        }
        return false;
    }

    @JavascriptInterface
    public final void loadAd(@Nullable String str, int i10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "loadAd is called with index - " + i10);
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA = a();
        if (gestureDetectorOnGestureListenerC3635ciA != null) {
            gestureDetectorOnGestureListenerC3635ciA.b(i10);
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
        if (interfaceC3878m92 != null) {
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m92).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void loadWebView(@Nullable String str, @Nullable final String str2, @Nullable final String str3) throws JSONException {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str4 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str4, "loadWebView called with html: " + str3);
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA = a();
        if (gestureDetectorOnGestureListenerC3635ciA != null && gestureDetectorOnGestureListenerC3635ciA.O0) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str5 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str5, "loadWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39764a;
            if (str2 == null) {
                str2 = "";
            }
            Lazy lazy = AbstractC4061ti.f39603a;
            JSONObject jSONObjectA = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put("errorCode", 108);
            gestureDetectorOnGestureListenerC3635ci.a("loadWebView", jSONObjectA);
            return;
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA2 = a();
        if (gestureDetectorOnGestureListenerC3635ciA2 == null || gestureDetectorOnGestureListenerC3635ciA2.getPlacementType() != 1) {
            InterfaceC3878m9 interfaceC3878m93 = this.f39766c;
            if (interfaceC3878m93 != null) {
                String str6 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str6, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m93).b(str6, "sibling creation not allowed for inline placement type");
            }
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci2 = this.f39764a;
            if (str2 == null) {
                str2 = "";
            }
            Lazy lazy2 = AbstractC4061ti.f39603a;
            JSONObject jSONObjectA2 = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA2.put("errorCode", 312);
            gestureDetectorOnGestureListenerC3635ci2.a("loadWebView", jSONObjectA2);
            return;
        }
        if (str2 == null || StringsKt.y0(str2)) {
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci3 = this.f39764a;
            Lazy lazy3 = AbstractC4061ti.f39603a;
            JSONObject jSONObjectA3 = Si.a("", "targetViewId", "id", "");
            jSONObjectA3.put("errorCode", 302);
            gestureDetectorOnGestureListenerC3635ci3.a("loadWebView", jSONObjectA3);
            return;
        }
        if (str3 == null || str3.length() == 0) {
            this.f39764a.a("loadWebView", AbstractC4061ti.a(str2, 301));
            return;
        }
        Wb wb2 = (Wb) AbstractC3925o6.f39166e.getValue();
        Runnable runnable = new Runnable() { // from class: w3.yb
            @Override // java.lang.Runnable
            public final void run() {
                C4103va.a(this.f107401b, str2, str3);
            }
        };
        wb2.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wb2.f37946a.post(runnable);
    }

    @JavascriptInterface
    public final void log(@Nullable String str, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).c(str2, "Log called. Message:" + message);
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39764a;
        gestureDetectorOnGestureListenerC3635ci.getClass();
        Mh mh2 = GestureDetectorOnGestureListenerC3635ci.f38345e1;
        mh2.getClass();
        if (!((Boolean) GestureDetectorOnGestureListenerC3635ci.f38348h1.getValue(mh2, Mh.f37378a[0])).booleanValue() || message == null) {
            return;
        }
        gestureDetectorOnGestureListenerC3635ci.getListener().a(message);
    }

    @JavascriptInterface
    public final void logTelemetryEvent(@Nullable String str, @Nullable String eventType, @Nullable String str2) {
        if (eventType == null) {
            InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
            if (interfaceC3878m9 != null) {
                String str3 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m9).b(str3, "eventType is null");
                return;
            }
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
        if (interfaceC3878m92 != null) {
            String str4 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m92).a(str4, "logTelemetryEvent is called: " + eventType);
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39764a;
        gestureDetectorOnGestureListenerC3635ci.getClass();
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        C3887mi c3887mi = gestureDetectorOnGestureListenerC3635ci.f38358d0;
        if (c3887mi != null) {
            c3887mi.a(eventType, str2);
        }
    }

    @JavascriptInterface
    public final void onAudioStateChanged(@Nullable String str, int i10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "onAudioStateChanged is called: " + i10);
        }
        V1.f37869b.getClass();
        V1 v12 = (V1) V1.f37870c.get(i10);
        if (v12 == null) {
            v12 = V1.f37871d;
        }
        if (v12 != V1.f37871d) {
            this.f39764a.getListener().a(v12);
        }
    }

    @JavascriptInterface
    public final void onOrientationChange(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, ">>> onOrientationChange() >>> This API is deprecated!");
        }
    }

    @JavascriptInterface
    public final void onUserAudioMuteInteraction(@Nullable String str, boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "onAudioMuteInteraction is called: " + z10);
        }
        this.f39764a.getListener().a(z10);
    }

    @JavascriptInterface
    public final void onUserInteraction(@Nullable String str, @Nullable String str2) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str3, "onUserInteraction called");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39764a;
        if (gestureDetectorOnGestureListenerC3635ci != null && !gestureDetectorOnGestureListenerC3635ci.a()) {
            this.f39764a.a("onUserInteraction");
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
        if (interfaceC3878m92 != null) {
            String str4 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m92).a(str4, "onUserInteraction called. Params:" + str2);
        }
        if (str2 == null) {
            try {
                this.f39764a.a(new HashMap());
                return;
            } catch (Exception e10) {
                this.f39764a.a(str, "Unexpected error", "onUserInteraction");
                InterfaceC3878m9 interfaceC3878m93 = this.f39766c;
                if (interfaceC3878m93 != null) {
                    String str5 = AbstractC4128wa.f39835a;
                    Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                    ((C3903n9) interfaceC3878m93).b(str5, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e10.getMessage());
                    return;
                }
                return;
            }
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlin.String");
                    String str6 = next;
                    map.put(str6, jSONObject.get(str6));
                }
                try {
                    this.f39764a.a(map);
                    Unit unit = Unit.f93236a;
                } catch (Exception e11) {
                    this.f39764a.a(str, "Unexpected error", "onUserInteraction");
                    InterfaceC3878m9 interfaceC3878m94 = this.f39766c;
                    if (interfaceC3878m94 != null) {
                        String str7 = AbstractC4128wa.f39835a;
                        Intrinsics.checkNotNullExpressionValue(str7, "access$getTAG$p(...)");
                        ((C3903n9) interfaceC3878m94).b(str7, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e11.getMessage());
                        Unit unit2 = Unit.f93236a;
                    }
                }
            } catch (JSONException unused) {
                this.f39764a.a(new HashMap());
                Unit unit3 = Unit.f93236a;
            }
        } catch (Exception e12) {
            this.f39764a.a(str, "Unexpected error", "onUserInteraction");
            InterfaceC3878m9 interfaceC3878m95 = this.f39766c;
            if (interfaceC3878m95 != null) {
                String str8 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str8, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m95).b(str8, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e12.getMessage());
                Unit unit4 = Unit.f93236a;
            }
        }
    }

    @JavascriptInterface
    public final void open(@Nullable final String str, @Nullable final String str2) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str3, "open called");
        }
        if (!this.f39764a.a()) {
            this.f39764a.a("open");
            return;
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39764a;
        if (!gestureDetectorOnGestureListenerC3635ci.O0) {
            gestureDetectorOnGestureListenerC3635ci.s();
            Oj.a(new Runnable() { // from class: w3.jb
                @Override // java.lang.Runnable
                public final void run() {
                    C4103va.b(this.f107128b, str, str2);
                }
            });
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
        if (interfaceC3878m92 != null) {
            String str4 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m92).b(str4, "open called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void openEmbedded(@Nullable final String str, @Nullable final String str2) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str3, "openEmbedded called");
        }
        if (!this.f39764a.a()) {
            this.f39764a.a("openEmbedded");
            return;
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39764a;
        if (!gestureDetectorOnGestureListenerC3635ci.O0) {
            gestureDetectorOnGestureListenerC3635ci.s();
            Oj.a(new Runnable() { // from class: w3.zb
                @Override // java.lang.Runnable
                public final void run() {
                    C4103va.c(this.f107418b, str, str2);
                }
            });
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
        if (interfaceC3878m92 != null) {
            String str4 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m92).b(str4, "openEmbedded called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void openExternal(@Nullable String str, @NotNull String url, @Nullable String str2) {
        Ya ya2;
        Intrinsics.checkNotNullParameter(url, "url");
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str3, "open External");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39764a;
        if (gestureDetectorOnGestureListenerC3635ci == null) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str4 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (gestureDetectorOnGestureListenerC3635ci.O0) {
            InterfaceC3878m9 interfaceC3878m93 = this.f39766c;
            if (interfaceC3878m93 != null) {
                String str5 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m93).b(str5, "open called on unloaded ad");
                return;
            }
            return;
        }
        if (!gestureDetectorOnGestureListenerC3635ci.a()) {
            this.f39764a.a("openExternal");
            return;
        }
        this.f39764a.s();
        InterfaceC3878m9 interfaceC3878m94 = this.f39766c;
        if (interfaceC3878m94 != null) {
            String str6 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str6, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m94).a(str6, "openExternal called with url: " + url + " , schema: " + Pa.a(url) + ", fallback - " + str2);
        }
        Za za2 = this.f39764a.getLandingPageHandler().f37840f;
        if (za2 != null) {
            String strA = Pa.a(url);
            Ua landingPageHandler = this.f39764a.getLandingPageHandler();
            int i10 = landingPageHandler.f37843i + 1;
            landingPageHandler.f37843i = i10;
            ya2 = new Ya(za2, strA, i10, SystemClock.elapsedRealtime());
        } else {
            ya2 = null;
        }
        if (ya2 != null) {
            ya2.f38042f = "EX_NATIVE";
        }
        this.f39764a.getLandingPageHandler().a(Na.f37430d, ya2, (Integer) null);
        Ua landingPageHandler2 = this.f39764a.getLandingPageHandler();
        landingPageHandler2.getClass();
        Intrinsics.checkNotNullParameter("openExternal", "api");
        if (url != null) {
            landingPageHandler2.f(str, url, str2, ya2);
            return;
        }
        if (str2 != null) {
            landingPageHandler2.f(str, str2, null, ya2);
            return;
        }
        landingPageHandler2.a(Na.f37431e, ya2, (Integer) 2);
        Ma ma2 = landingPageHandler2.f37838d;
        if (ma2 != null) {
            ma2.a(str, "Empty url and fallback url", "openExternal");
        }
        InterfaceC3878m9 interfaceC3878m95 = landingPageHandler2.f37841g;
        if (interfaceC3878m95 != null) {
            Intrinsics.checkNotNullExpressionValue("Ua", "TAG");
            ((C3903n9) interfaceC3878m95).b("Ua", "Empty deeplink and fallback urls");
        }
    }

    @JavascriptInterface
    public final void openWithoutTracker(@Nullable final String str, @Nullable final String str2) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str3, "openWithoutTracker called");
        }
        if (!this.f39764a.a()) {
            this.f39764a.a("openWithoutTracker");
            return;
        }
        if (!this.f39764a.O0) {
            Oj.a(new Runnable() { // from class: w3.nb
                @Override // java.lang.Runnable
                public final void run() {
                    C4103va.d(this.f107209b, str, str2);
                }
            });
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
        if (interfaceC3878m92 != null) {
            String str4 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m92).b(str4, "openWithoutTracker called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void ping(@Nullable String str, @Nullable String url, boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "ping called");
        }
        if (this.f39764a == null) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str3 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (url != null) {
            int length = url.length() - 1;
            int i10 = 0;
            boolean z11 = false;
            while (i10 <= length) {
                boolean z12 = Intrinsics.compare((int) url.charAt(!z11 ? i10 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z12) {
                    i10++;
                } else {
                    z11 = true;
                }
            }
            if (url.subSequence(i10, length + 1).toString().length() != 0 && URLUtil.isValidUrl(url)) {
                InterfaceC3878m9 interfaceC3878m93 = this.f39766c;
                if (interfaceC3878m93 != null) {
                    String str4 = AbstractC4128wa.f39835a;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((C3903n9) interfaceC3878m93).a(str4, "JavaScript called ping() URL: >>> " + url + " <<<");
                }
                try {
                    C4121w3 c4121w3 = C4121w3.f39816a;
                    InterfaceC3878m9 interfaceC3878m94 = this.f39766c;
                    Intrinsics.checkNotNullParameter(url, "url");
                    C4121w3.a(url, z10, interfaceC3878m94);
                    return;
                } catch (Exception e10) {
                    this.f39764a.a(str, "Unexpected error", "ping");
                    Kb.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                    InterfaceC3878m9 interfaceC3878m95 = this.f39766c;
                    if (interfaceC3878m95 != null) {
                        String str5 = AbstractC4128wa.f39835a;
                        Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                        ((C3903n9) interfaceC3878m95).b(str5, "SDK encountered unexpected error in handling ping() request from creative; " + e10.getMessage());
                        return;
                    }
                    return;
                }
            }
        }
        this.f39764a.a(str, "Invalid URL:" + url, "ping");
    }

    @JavascriptInterface
    public final void pingInWebView(@Nullable String str, @Nullable String url, boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "openInWebView called");
        }
        if (url != null) {
            int length = url.length() - 1;
            int i10 = 0;
            boolean z11 = false;
            while (i10 <= length) {
                boolean z12 = Intrinsics.compare((int) url.charAt(!z11 ? i10 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z12) {
                    i10++;
                } else {
                    z11 = true;
                }
            }
            if (url.subSequence(i10, length + 1).toString().length() != 0 && URLUtil.isValidUrl(url)) {
                InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
                if (interfaceC3878m92 != null) {
                    String str3 = AbstractC4128wa.f39835a;
                    Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((C3903n9) interfaceC3878m92).a(str3, "JavaScript called pingInWebView() URL: >>> " + url + " <<<");
                }
                try {
                    C4121w3 c4121w3 = C4121w3.f39816a;
                    InterfaceC3878m9 interfaceC3878m93 = this.f39766c;
                    Intrinsics.checkNotNullParameter(url, "url");
                    Dg.a(Ag.f36573b, new C3947p3(url, z10, interfaceC3878m93, null));
                    return;
                } catch (Exception e10) {
                    this.f39764a.a(str, "Unexpected error", "pingInWebView");
                    Kb.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                    InterfaceC3878m9 interfaceC3878m94 = this.f39766c;
                    if (interfaceC3878m94 != null) {
                        String str4 = AbstractC4128wa.f39835a;
                        Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                        ((C3903n9) interfaceC3878m94).b(str4, "SDK encountered unexpected error in handling pingInWebView() request from creative; " + e10.getMessage());
                        return;
                    }
                    return;
                }
            }
        }
        this.f39764a.a(str, "Invalid URL:" + url, "pingInWebView");
    }

    @JavascriptInterface
    public final void pingV2(@Nullable String str, @NotNull String pingJson) {
        Intrinsics.checkNotNullParameter(pingJson, "pingJson");
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "pingV2 called with JSON: >>> " + pingJson + " <<<");
        }
        try {
            this.f39764a.f(pingJson);
        } catch (Exception e10) {
            this.f39764a.a(str, "Unexpected error", "ping");
            this.f39764a.a(e10);
            Kb.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str3 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str3, "SDK encountered unexpected error in handling ping() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void playVideo(@Nullable final String str, @Nullable final String str2) {
        if (this.f39764a == null) {
            InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
            if (interfaceC3878m9 != null) {
                String str3 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m9).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = Intrinsics.compare((int) str2.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (str2.subSequence(i10, length + 1).toString().length() != 0 && StringsKt.a0(str2, "http", false, 2, null) && (StringsKt.M(str2, "mp4", false, 2, null) || StringsKt.M(str2, "avi", false, 2, null) || StringsKt.M(str2, "m4v", false, 2, null))) {
                InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
                if (interfaceC3878m92 != null) {
                    String str4 = AbstractC4128wa.f39835a;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((C3903n9) interfaceC3878m92).a(str4, "JavaScript called: playVideo (" + str2 + ")");
                }
                new Handler(this.f39764a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: w3.qb
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4103va.e(this.f107267b, str, str2);
                    }
                });
                return;
            }
        }
        this.f39764a.a(str, "Null or empty or invalid media playback URL supplied", "playVideo");
    }

    @JavascriptInterface
    public final void registerBackButtonPressedEventListener(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "registerBackButtonPressedEventListener called");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39764a;
        if (gestureDetectorOnGestureListenerC3635ci == null) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str3 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            gestureDetectorOnGestureListenerC3635ci.k(str);
        } catch (Exception e10) {
            this.f39764a.a(str, "Unexpected error", "registerBackButtonPressedEventListener");
            InterfaceC3878m9 interfaceC3878m93 = this.f39766c;
            if (interfaceC3878m93 != null) {
                String str4 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m93).b(str4, "SDK encountered unexpected error in handling registerBackButtonPressedEventListener() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void registerDeviceMuteEventListener(@Nullable String jsCallbackNamespace) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str, "registerDeviceMuteEventListener called");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39764a;
        if (gestureDetectorOnGestureListenerC3635ci == null) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str2 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str2, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (jsCallbackNamespace != null) {
            try {
                C4130wc mediaProcessor = gestureDetectorOnGestureListenerC3635ci.getMediaProcessor();
                if (mediaProcessor != null) {
                    Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
                    if (mediaProcessor.f39842d == null) {
                        C3577ac c3577ac = new C3577ac(new C4030sc(mediaProcessor, jsCallbackNamespace));
                        mediaProcessor.f39842d = c3577ac;
                        c3577ac.b();
                    }
                }
            } catch (Exception e10) {
                this.f39764a.a(jsCallbackNamespace, "Unexpected error", "registerDeviceMuteEventListener");
                InterfaceC3878m9 interfaceC3878m93 = this.f39766c;
                if (interfaceC3878m93 != null) {
                    String str3 = AbstractC4128wa.f39835a;
                    Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((C3903n9) interfaceC3878m93).b(str3, "SDK encountered unexpected error in handling registerDeviceMuteEventListener() request from creative; " + e10.getMessage());
                }
            }
        }
    }

    @JavascriptInterface
    public final void registerDeviceVolumeChangeEventListener(@Nullable String jsCallbackNamespace) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str, "registerDeviceVolumeChangeEventListener called");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39764a;
        if (gestureDetectorOnGestureListenerC3635ci == null) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str2 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str2, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (jsCallbackNamespace != null) {
            try {
                C4130wc mediaProcessor = gestureDetectorOnGestureListenerC3635ci.getMediaProcessor();
                if (mediaProcessor != null) {
                    Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
                    Context context = Ji.f37157a;
                    if (context != null && mediaProcessor.f39843e == null) {
                        C3577ac c3577ac = new C3577ac(new C4080uc(mediaProcessor, jsCallbackNamespace, context, new Handler(Looper.getMainLooper())));
                        mediaProcessor.f39843e = c3577ac;
                        c3577ac.b();
                    }
                }
            } catch (Exception e10) {
                this.f39764a.a(jsCallbackNamespace, "Unexpected error", "registerDeviceVolumeChangeEventListener");
                InterfaceC3878m9 interfaceC3878m93 = this.f39766c;
                if (interfaceC3878m93 != null) {
                    String str3 = AbstractC4128wa.f39835a;
                    Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((C3903n9) interfaceC3878m93).b(str3, "SDK encountered unexpected error in handling registerDeviceVolumeChangeEventListener() request from creative; " + e10.getMessage());
                }
            }
        }
    }

    @JavascriptInterface
    public final void registerHeadphonePluggedEventListener(@Nullable String jsCallbackNamespace) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str, "registerHeadphonePluggedEventListener called");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39764a;
        if (gestureDetectorOnGestureListenerC3635ci == null) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str2 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str2, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (jsCallbackNamespace != null) {
            try {
                C4130wc mediaProcessor = gestureDetectorOnGestureListenerC3635ci.getMediaProcessor();
                if (mediaProcessor != null) {
                    Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
                    if (mediaProcessor.f39844f == null) {
                        C3577ac c3577ac = new C3577ac(new C4005rc(mediaProcessor, jsCallbackNamespace));
                        mediaProcessor.f39844f = c3577ac;
                        c3577ac.b();
                    }
                }
            } catch (Exception e10) {
                this.f39764a.a(jsCallbackNamespace, "Unexpected error", "registerHeadphonePluggedEventListener");
                InterfaceC3878m9 interfaceC3878m93 = this.f39766c;
                if (interfaceC3878m93 != null) {
                    String str3 = AbstractC4128wa.f39835a;
                    Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((C3903n9) interfaceC3878m93).b(str3, "SDK encountered unexpected error in handling registerHeadphonePluggedEventListener() request from creative; " + e10.getMessage());
                }
            }
        }
    }

    @JavascriptInterface
    public final void saveBlob(@Nullable String str, @Nullable String str2) {
        E2 e22;
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str3, "saveBlob is called");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39764a;
        if (gestureDetectorOnGestureListenerC3635ci == null) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str4 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3878m9 interfaceC3878m93 = gestureDetectorOnGestureListenerC3635ci.f38368i;
        if (interfaceC3878m93 != null) {
            String TAG = GestureDetectorOnGestureListenerC3635ci.f38347g1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C3903n9) interfaceC3878m93).a(TAG, "saveBlob");
        }
        if (str2 == null || (e22 = gestureDetectorOnGestureListenerC3635ci.f38371j0) == null) {
            return;
        }
        ((AbstractC3845l1) e22).a(str2, gestureDetectorOnGestureListenerC3635ci.getImpressionId());
    }

    @JavascriptInterface
    public final void sendMessage(@Nullable String str, @Nullable final String str2, @Nullable final String str3) throws JSONException {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str4 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str4, "sendMessage called with message: " + str3);
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA = a();
        if (gestureDetectorOnGestureListenerC3635ciA != null && gestureDetectorOnGestureListenerC3635ciA.O0) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str5 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str5, "sendMessage called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39764a;
            if (str2 == null) {
                str2 = "";
            }
            Lazy lazy = AbstractC4061ti.f39603a;
            JSONObject jSONObjectA = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put("errorCode", 108);
            gestureDetectorOnGestureListenerC3635ci.a(C4329g8.f43165j, jSONObjectA);
            return;
        }
        if (str2 == null || StringsKt.y0(str2)) {
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci2 = this.f39764a;
            if (str2 == null) {
                str2 = "";
            }
            Lazy lazy2 = AbstractC4061ti.f39603a;
            JSONObject jSONObjectA2 = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA2.put("errorCode", 302);
            gestureDetectorOnGestureListenerC3635ci2.a(C4329g8.f43165j, jSONObjectA2);
            return;
        }
        if (str3 == null || StringsKt.y0(str3)) {
            this.f39764a.a(C4329g8.f43165j, AbstractC4061ti.a(str2, 301));
            return;
        }
        Wb wb2 = (Wb) AbstractC3925o6.f39166e.getValue();
        Runnable runnable = new Runnable() { // from class: w3.pb
            @Override // java.lang.Runnable
            public final void run() {
                C4103va.f(this.f107248b, str2, str3);
            }
        };
        wb2.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wb2.f37946a.post(runnable);
    }

    @JavascriptInterface
    public final void setAdContext(@Nullable String str, @NotNull String podAdContext) {
        Intrinsics.checkNotNullParameter(podAdContext, "podAdContext");
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "setAdContext is called " + podAdContext);
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA = a();
        if (gestureDetectorOnGestureListenerC3635ciA != null) {
            InterfaceC4118w0 adPodHandler = gestureDetectorOnGestureListenerC3635ciA.getAdPodHandler();
            if (adPodHandler != null) {
                ((AbstractC3845l1) adPodHandler).b(podAdContext);
                return;
            }
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
        if (interfaceC3878m92 != null) {
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m92).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void setOrientationProperties(@Nullable String str, @NotNull final String orientationPropertiesString) {
        Intrinsics.checkNotNullParameter(orientationPropertiesString, "orientationPropertiesString");
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "setOrientationProperties called: " + orientationPropertiesString);
        }
        Wb wb2 = (Wb) AbstractC3925o6.f39166e.getValue();
        Runnable runnable = new Runnable() { // from class: w3.gb
            @Override // java.lang.Runnable
            public final void run() {
                C4103va.b(this.f107070b, orientationPropertiesString);
            }
        };
        wb2.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wb2.f37946a.post(runnable);
    }

    @JavascriptInterface
    public final void showAd(@Nullable String str, int i10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "showAd is called with index " + i10);
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA = a();
        if (gestureDetectorOnGestureListenerC3635ciA != null) {
            gestureDetectorOnGestureListenerC3635ciA.c(i10);
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
        if (interfaceC3878m92 != null) {
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m92).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void showAlert(@Nullable String str, @NotNull String alert) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "showAlert: " + alert);
        }
    }

    @JavascriptInterface
    public final void showWebView(@Nullable String str, @Nullable final String str2) throws JSONException {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str3, "showEndCard called");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA = a();
        if (gestureDetectorOnGestureListenerC3635ciA != null && gestureDetectorOnGestureListenerC3635ciA.O0) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str4 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str4, "showWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39764a;
            if (str2 == null) {
                str2 = "";
            }
            Lazy lazy = AbstractC4061ti.f39603a;
            JSONObject jSONObjectA = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put("errorCode", 108);
            gestureDetectorOnGestureListenerC3635ci.a("showWebView", jSONObjectA);
            return;
        }
        if (str2 != null && str2.length() != 0) {
            Wb wb2 = (Wb) AbstractC3925o6.f39166e.getValue();
            Runnable runnable = new Runnable() { // from class: w3.mb
                @Override // java.lang.Runnable
                public final void run() {
                    C4103va.c(this.f107191b, str2);
                }
            };
            wb2.getClass();
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            wb2.f37946a.post(runnable);
            return;
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci2 = this.f39764a;
        if (str2 == null) {
            str2 = "";
        }
        Lazy lazy2 = AbstractC4061ti.f39603a;
        JSONObject jSONObjectA2 = Si.a(str2, "targetViewId", "id", str2);
        jSONObjectA2.put("errorCode", 302);
        gestureDetectorOnGestureListenerC3635ci2.a("showWebView", jSONObjectA2);
    }

    @JavascriptInterface
    public final void storePicture(@Nullable String str, @Nullable String str2) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str3, "storePicture is deprecated and no-op. ");
        }
    }

    @JavascriptInterface
    public final void submitAdReport(@Nullable String str, @NotNull String adQualityUrl, @NotNull String enableUserAdReportScreenshot, @NotNull String templateInfo) {
        Intrinsics.checkNotNullParameter(adQualityUrl, "adQualityUrl");
        Intrinsics.checkNotNullParameter(enableUserAdReportScreenshot, "enableUserAdReportScreenshot");
        Intrinsics.checkNotNullParameter(templateInfo, "templateInfo");
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "submitAdReport called");
        }
        this.f39764a.a(adQualityUrl, templateInfo, Intrinsics.areEqual(enableUserAdReportScreenshot, "1"));
    }

    @JavascriptInterface
    @NotNull
    public final String supports(@Nullable String str, @NotNull String feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "Checking support for: " + feature);
        }
        String strValueOf = String.valueOf(this.f39764a.m(feature));
        InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
        if (interfaceC3878m92 != null) {
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m92).c(str3, "Message:" + feature + " support: " + strValueOf);
        }
        return strValueOf;
    }

    @JavascriptInterface
    public final long timeSinceShow(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "timeSinceShow is called");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA = a();
        if (gestureDetectorOnGestureListenerC3635ciA != null) {
            return gestureDetectorOnGestureListenerC3635ciA.V();
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
        if (interfaceC3878m92 == null) {
            return 0L;
        }
        String str3 = AbstractC4128wa.f39835a;
        Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
        ((C3903n9) interfaceC3878m92).b(str3, "Found a null instance of ad render view!");
        return 0L;
    }

    @JavascriptInterface
    public final void unload(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "unload called");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ciA = a();
        if (gestureDetectorOnGestureListenerC3635ciA == null) {
            gestureDetectorOnGestureListenerC3635ciA = this.f39764a;
        }
        try {
            gestureDetectorOnGestureListenerC3635ciA.E();
        } catch (Exception e10) {
            gestureDetectorOnGestureListenerC3635ciA.a(str, "Unexpected error", "unload");
            Kb.a((byte) 1, "InMobi", "Failed to unload ad; SDK encountered an unexpected error");
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str3 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str3, "SDK encountered an expected error in handling the unload() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterBackButtonPressedEventListener(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "unregisterBackButtonPressedEventListener called");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39764a;
        if (gestureDetectorOnGestureListenerC3635ci == null) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str3 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            gestureDetectorOnGestureListenerC3635ci.X();
        } catch (Exception e10) {
            this.f39764a.a(str, "Unexpected error", "unregisterBackButtonPressedEventListener");
            InterfaceC3878m9 interfaceC3878m93 = this.f39766c;
            if (interfaceC3878m93 != null) {
                String str4 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m93).b(str4, "SDK encountered unexpected error in handling unregisterBackButtonPressedEventListener() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterDeviceMuteEventListener(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "unregisterDeviceMuteEventListener called");
        }
        if (this.f39764a == null) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str3 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3878m9 interfaceC3878m93 = this.f39766c;
        if (interfaceC3878m93 != null) {
            String str4 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m93).a(str4, "Unregister device mute event listener ...");
        }
        try {
            C4130wc mediaProcessor = this.f39764a.getMediaProcessor();
            if (mediaProcessor != null) {
                C3577ac c3577ac = mediaProcessor.f39842d;
                if (c3577ac != null) {
                    c3577ac.a();
                }
                mediaProcessor.f39842d = null;
            }
        } catch (Exception e10) {
            this.f39764a.a(str, "Unexpected error", "unRegisterDeviceMuteEventListener");
            InterfaceC3878m9 interfaceC3878m94 = this.f39766c;
            if (interfaceC3878m94 != null) {
                String str5 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m94).b(str5, "SDK encountered unexpected error in handling unregisterDeviceMuteEventListener() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterDeviceVolumeChangeEventListener(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "unregisterDeviceVolumeChangeEventListener called");
        }
        if (this.f39764a == null) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str3 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3878m9 interfaceC3878m93 = this.f39766c;
        if (interfaceC3878m93 != null) {
            String str4 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m93).a(str4, "Unregister device volume change listener ...");
        }
        try {
            C4130wc mediaProcessor = this.f39764a.getMediaProcessor();
            if (mediaProcessor != null) {
                C3577ac c3577ac = mediaProcessor.f39843e;
                if (c3577ac != null) {
                    c3577ac.a();
                }
                mediaProcessor.f39843e = null;
            }
        } catch (Exception e10) {
            this.f39764a.a(str, "Unexpected error", "unregisterDeviceVolumeChangeEventListener");
            InterfaceC3878m9 interfaceC3878m94 = this.f39766c;
            if (interfaceC3878m94 != null) {
                String str5 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m94).b(str5, "SDK encountered unexpected error in handling unregisterDeviceVolumeChangeEventListener() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterHeadphonePluggedEventListener(@Nullable String str) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "unregisterHeadphonePluggedEventListener called");
        }
        if (this.f39764a == null) {
            InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
            if (interfaceC3878m92 != null) {
                String str3 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3878m9 interfaceC3878m93 = this.f39766c;
        if (interfaceC3878m93 != null) {
            String str4 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m93).a(str4, "Unregister headphone plugged event listener ...");
        }
        try {
            C4130wc mediaProcessor = this.f39764a.getMediaProcessor();
            if (mediaProcessor != null) {
                C3577ac c3577ac = mediaProcessor.f39844f;
                if (c3577ac != null) {
                    c3577ac.a();
                }
                mediaProcessor.f39844f = null;
            }
        } catch (Exception e10) {
            this.f39764a.a(str, "Unexpected error", "unregisterHeadphonePluggedEventListener");
            InterfaceC3878m9 interfaceC3878m94 = this.f39766c;
            if (interfaceC3878m94 != null) {
                String str5 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m94).b(str5, "SDK encountered unexpected error in handling unregisterHeadphonePluggedEventListener() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void updateVideoPosition(@Nullable String str, @Nullable String str2) throws JSONException {
        Object objD;
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str3 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str3, "updateVideoPosition is called with position - " + str2);
        }
        EnumC3573a8[] enumC3573a8Arr = EnumC3573a8.f38173a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMessage", "Invalid position");
        jSONObject.put("jsCommand", "updateVideoPlayerPosition");
        jSONObject.put("params", "null");
        if (str2 != null) {
            Object obj = null;
            try {
                JSONObject jsonObject = new JSONObject(str2);
                Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                Intrinsics.checkNotNullParameter(VideoViewPosition.class, "type");
                VideoViewPosition videoViewPosition = (VideoViewPosition) VideoViewPosition.class.cast(AbstractC3879ma.a(jsonObject, VideoViewPosition.class, null, null));
                if (videoViewPosition == null || (objD = eg.i.d(A9.f36560f, null, null, new C4078ua(this, videoViewPosition, str2, null), 3, null)) == null) {
                    EnumC3952p8 enumC3952p8 = EnumC3952p8.f39251b;
                    a(str, jSONObject);
                    obj = Unit.f93236a;
                } else {
                    obj = objD;
                }
            } catch (JSONException e10) {
                EnumC3952p8 enumC3952p82 = EnumC3952p8.f39251b;
                a(str, jSONObject);
                InterfaceC3878m9 interfaceC3878m92 = this.f39766c;
                if (interfaceC3878m92 != null) {
                    String str4 = AbstractC4128wa.f39835a;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((C3903n9) interfaceC3878m92).a(str4, "Error while creating position Json.", e10);
                    obj = Unit.f93236a;
                }
            }
            if (obj != null) {
                return;
            }
        }
        EnumC3952p8 enumC3952p83 = EnumC3952p8.f39251b;
        a(str, jSONObject);
        Unit unit = Unit.f93236a;
    }

    @JavascriptInterface
    public final void useCustomClose(@Nullable final String str, final boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "useCustomClose called:" + z10);
        }
        new Handler(this.f39764a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: w3.ob
            @Override // java.lang.Runnable
            public final void run() {
                C4103va.b(this.f107229b, z10, str);
            }
        });
    }

    @JavascriptInterface
    public final void zoom(@NotNull String jsCallbackNamespace, final int i10) {
        Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str, "zoom is called " + jsCallbackNamespace + " " + i10);
        }
        Oj.a(new Runnable() { // from class: w3.xb
            @Override // java.lang.Runnable
            public final void run() {
                C4103va.a(this.f107384b, i10);
            }
        });
    }

    public static final void b(C4103va c4103va) {
        try {
            c4103va.f39764a.H();
        } catch (Exception e10) {
            InterfaceC3878m9 interfaceC3878m9 = c4103va.f39766c;
            if (interfaceC3878m9 != null) {
                String str = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m9).b(str, "SDK encountered unexpected error in getting/setting current position; " + e10.getMessage());
            }
        }
    }

    public static final void b(final C4103va c4103va, String json) {
        Ff op = c4103va.f39764a.getOrientationProperties();
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(op, "op");
        final Ff ff2 = new Ff();
        ff2.f36853d = json;
        try {
            JSONObject jSONObject = new JSONObject(json);
            String strOptString = jSONObject.optString("forceOrientation", op.f36851b);
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            Intrinsics.checkNotNullParameter(strOptString, "<set-?>");
            ff2.f36851b = strOptString;
            ff2.f36850a = jSONObject.optBoolean("allowOrientationChange", op.f36850a);
            String strOptString2 = jSONObject.optString("direction", op.f36852c);
            Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
            Intrinsics.checkNotNullParameter(strOptString2, "<set-?>");
            ff2.f36852c = strOptString2;
            if (!Intrinsics.areEqual(ff2.f36851b, "portrait") && !Intrinsics.areEqual(ff2.f36851b, "landscape")) {
                Intrinsics.checkNotNullParameter("none", "<set-?>");
                ff2.f36851b = "none";
            }
            if (!Intrinsics.areEqual(ff2.f36852c, "left") && !Intrinsics.areEqual(ff2.f36852c, "right")) {
                Intrinsics.checkNotNullParameter("right", "<set-?>");
                ff2.f36852c = "right";
            }
        } catch (JSONException unused) {
            ff2 = null;
        }
        if (ff2 != null) {
            c4103va.f39764a.getWebViewFactory().a(new Function1() { // from class: w3.rb
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4103va.a(this.f107284b, ff2, (GestureDetectorOnGestureListenerC3635ci) obj);
                }
            });
        }
    }

    public final GestureDetectorOnGestureListenerC3635ci a() {
        if (!Intrinsics.areEqual(this.f39764a.getRoute().f36741b, "default")) {
            ko webViewFactory = this.f39764a.getWebViewFactory();
            webViewFactory.getClass();
            Intrinsics.checkNotNullParameter("default", "id");
            return (GestureDetectorOnGestureListenerC3635ci) webViewFactory.f38911b.get("default");
        }
        return this.f39764a;
    }

    public final void a(final String str, final String str2, final int i10, final float f10, final boolean z10, final Ya ya2) {
        if (ya2 != null) {
            ya2.f38042f = "IN_CUSTOM";
        }
        new Handler(this.f39764a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: w3.kb
            @Override // java.lang.Runnable
            public final void run() {
                C4103va.a(this.f107149b, ya2, str2, i10, str, f10, z10);
            }
        });
    }

    public static final void a(C4103va c4103va, Ya ya2, String str, int i10, String str2, float f10, boolean z10) {
        String str3;
        try {
            if (c4103va.f39764a.getEmbeddedBrowserJsCallbacks() == null) {
                InterfaceC3878m9 interfaceC3878m9 = c4103va.f39766c;
                if (interfaceC3878m9 != null) {
                    String str4 = AbstractC4128wa.f39835a;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((C3903n9) interfaceC3878m9).b(str4, "Found a null instance of EmbeddedBrowserJSCallback instance to customExpand");
                }
                c4103va.f39764a.getLandingPageHandler().a(Na.f37431e, ya2, (Integer) 8002);
                return;
            }
            InterfaceC3878m9 interfaceC3878m92 = c4103va.f39766c;
            if (interfaceC3878m92 != null) {
                String str5 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).a(str5, "Custom expand called. Url: " + str);
            }
            R5 r52 = R5.values()[i10];
            try {
                if (r52 == R5.f37637a) {
                    try {
                        int iA = c4103va.f39764a.getLandingPageHandler().a("customExpand", str2, str, ya2, (P2) null);
                        InterfaceC3878m9 interfaceC3878m93 = c4103va.f39766c;
                        if (interfaceC3878m93 != null) {
                            String str6 = AbstractC4128wa.f39835a;
                            Intrinsics.checkNotNullExpressionValue(str6, "access$getTAG$p(...)");
                            ((C3903n9) interfaceC3878m93).a(str6, "processCustomExpandRequest: " + iA);
                        }
                        if (iA == 3) {
                            S5 embeddedBrowserJsCallbacks = c4103va.f39764a.getEmbeddedBrowserJsCallbacks();
                            if (embeddedBrowserJsCallbacks != null) {
                                ((K8) embeddedBrowserJsCallbacks).a(str, r52, f10, z10, c4103va.f39764a.getViewTouchTimestamp(), ya2);
                            }
                            c4103va.f39764a.getLandingPageHandler().a(Na.f37432f, ya2, (Integer) null);
                            Ma ma2 = c4103va.f39764a.getLandingPageHandler().f37838d;
                            if (ma2 != null) {
                                ma2.b("customExpand", str2, str);
                                return;
                            }
                            return;
                        }
                        S5 embeddedBrowserJsCallbacks2 = c4103va.f39764a.getEmbeddedBrowserJsCallbacks();
                        if (embeddedBrowserJsCallbacks2 != null) {
                            M8.a(((K8) embeddedBrowserJsCallbacks2).f37212a);
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        e = e10;
                        str3 = str2;
                        c4103va.f39764a.a(str3, "Unexpected error", "customExpand");
                        c4103va.f39764a.getLandingPageHandler().a(Na.f37431e, ya2, (Integer) 9);
                        Kb.a((byte) 1, "InMobi", "Failed to custom expand ad; SDK encountered an unexpected error");
                        InterfaceC3878m9 interfaceC3878m94 = c4103va.f39766c;
                        if (interfaceC3878m94 != null) {
                            String str7 = AbstractC4128wa.f39835a;
                            Intrinsics.checkNotNullExpressionValue(str7, "access$getTAG$p(...)");
                            ((C3903n9) interfaceC3878m94).b(str7, "SDK encountered unexpected error in handling customExpand() request; " + e.getMessage());
                            return;
                        }
                        return;
                    }
                }
                S5 embeddedBrowserJsCallbacks3 = c4103va.f39764a.getEmbeddedBrowserJsCallbacks();
                if (embeddedBrowserJsCallbacks3 != null) {
                    ((K8) embeddedBrowserJsCallbacks3).a(str, r52, f10, z10, c4103va.f39764a.getViewTouchTimestamp(), ya2);
                }
                c4103va.f39764a.getLandingPageHandler().a(Na.f37432f, ya2, (Integer) null);
                Ma ma3 = c4103va.f39764a.getLandingPageHandler().f37838d;
                if (ma3 != null) {
                    ma3.b("customExpand", str2, str);
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            str3 = str2;
        }
    }

    public static final void c(C4103va c4103va) {
        try {
            c4103va.f39764a.I();
        } catch (Exception e10) {
            InterfaceC3878m9 interfaceC3878m9 = c4103va.f39766c;
            if (interfaceC3878m9 != null) {
                String str = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m9).b(str, "SDK encountered unexpected error in getting/setting default position; " + e10.getMessage());
            }
        }
    }

    public static final void c(C4103va c4103va, String str) {
        try {
            c4103va.f39764a.getSiblingWebviewManager().b(c4103va.f39764a.getRoute().f36741b, str);
        } catch (Exception e10) {
            c4103va.f39764a.a("showWebView", AbstractC4061ti.a(str, 309));
            InterfaceC3878m9 interfaceC3878m9 = c4103va.f39766c;
            if (interfaceC3878m9 != null) {
                String str2 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m9).b(str2, "SDK encountered unexpected error in handling showEndCard() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final void b(C4103va c4103va, boolean z10, String str) {
        try {
            c4103va.f39764a.f(z10);
        } catch (Exception e10) {
            c4103va.f39764a.a(str, "Unexpected error", "useCustomClose");
            InterfaceC3878m9 interfaceC3878m9 = c4103va.f39766c;
            if (interfaceC3878m9 != null) {
                String str2 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m9).b(str2, "SDK encountered internal error in handling useCustomClose() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final void a(C4103va c4103va) {
        if (c4103va.f39764a.getEmbeddedBrowserJsCallbacks() == null) {
            InterfaceC3878m9 interfaceC3878m9 = c4103va.f39766c;
            if (interfaceC3878m9 != null) {
                String str = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m9).b(str, "Found a null instance of EmbeddedBrowserJSCallback instance to closeCustomExpand");
                return;
            }
            return;
        }
        S5 embeddedBrowserJsCallbacks = c4103va.f39764a.getEmbeddedBrowserJsCallbacks();
        if (embeddedBrowserJsCallbacks != null) {
            M8.a(((K8) embeddedBrowserJsCallbacks).f37212a);
        }
    }

    public static final Unit a(C4103va c4103va, Ff ff2, GestureDetectorOnGestureListenerC3635ci it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.O0) {
            InterfaceC3878m9 interfaceC3878m9 = c4103va.f39766c;
            if (interfaceC3878m9 != null) {
                String str = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m9).b(str, "setOrientationProperties called on unloaded ad");
            }
            return Unit.f93236a;
        }
        it.a(ff2);
        return Unit.f93236a;
    }

    public static final void a(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci, C4103va c4103va, String str) {
        try {
            gestureDetectorOnGestureListenerC3635ci.m();
        } catch (Exception e10) {
            c4103va.f39764a.a(str, "Unexpected error", "close");
            Kb.a((byte) 1, "InMobi", "Failed to close ad; SDK encountered an unexpected error");
            InterfaceC3878m9 interfaceC3878m9 = c4103va.f39766c;
            if (interfaceC3878m9 != null) {
                String str2 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m9).b(str2, "SDK encountered an expected error in handling the close() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final Unit a(C4103va c4103va, Ne response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (AbstractC3741gl.a(response)) {
            InterfaceC3878m9 interfaceC3878m9 = c4103va.f39766c;
            if (interfaceC3878m9 != null) {
                String str = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m9).a(str, "asyncPing Successful");
            }
        } else {
            InterfaceC3878m9 interfaceC3878m92 = c4103va.f39766c;
            if (interfaceC3878m92 != null) {
                String str2 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m92).b(str2, "asyncPing Failed");
            }
        }
        return Unit.f93236a;
    }

    public static final void a(C4103va c4103va, boolean z10, String str) {
        try {
            c4103va.f39764a.e(z10);
        } catch (Exception e10) {
            c4103va.f39764a.a(str, "Unexpected error", "disableCloseRegion");
            InterfaceC3878m9 interfaceC3878m9 = c4103va.f39766c;
            if (interfaceC3878m9 != null) {
                String str2 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m9).b(str2, "SDK encountered unexpected error in handling disableCloseRegion() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final Unit a(boolean z10, GestureDetectorOnGestureListenerC3635ci it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setDisableBackButton(z10);
        return Unit.f93236a;
    }

    public static final void a(C4103va c4103va, int i10) {
        c4103va.f39764a.setInitialScale(i10);
    }

    public static final void a(C4103va c4103va, String str, String str2) {
        try {
            c4103va.f39764a.getSiblingWebviewManager().a(c4103va.f39764a.getRoute().f36741b, str, str2);
        } catch (Exception e10) {
            c4103va.f39764a.a("loadWebView", AbstractC4061ti.a(str, 308));
            InterfaceC3878m9 interfaceC3878m9 = c4103va.f39766c;
            if (interfaceC3878m9 != null) {
                String str3 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m9).b(str3, "SDK encountered unexpected error in handling loadWebView() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final void a(C4103va c4103va, String str) {
        try {
            c4103va.f39764a.getSiblingWebviewManager().a(c4103va.f39764a.getRoute().f36741b, str);
        } catch (Exception e10) {
            c4103va.f39764a.a("destroyWebView", AbstractC4061ti.a(str, 311));
            InterfaceC3878m9 interfaceC3878m9 = c4103va.f39766c;
            if (interfaceC3878m9 != null) {
                String str2 = AbstractC4128wa.f39835a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((C3903n9) interfaceC3878m9).b(str2, "SDK encountered unexpected error in handling destroyWebView() request from creative; " + e10.getMessage());
            }
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39766c;
        if (interfaceC3878m9 != null) {
            String str2 = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str2, "fireVideoError " + this + " - " + jSONObject);
        }
        if (str != null) {
            this.f39764a.a(str, "broadcastEvent('VideoCommandError'," + jSONObject + ")");
        }
    }
}
