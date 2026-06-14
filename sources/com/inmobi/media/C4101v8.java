package com.inmobi.media;

import android.content.Context;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.media3.datasource.cache.SimpleCache;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.ironsource.C4424m2;
import com.my.target.common.menu.MenuActionType;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.v8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4101v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HtmlVideoPlayerRequest f39745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3887mi f39746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3878m9 f39747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineScope f39748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CoroutineScope f39749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Job f39750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f39751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WeakReference f39752h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f39753i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HtmlVideoPlayerConfig f39754j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final N7 f39755k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f39756l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Uh f39757m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C3583ai f39758n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f39759o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C4183yf f39760p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicReference f39761q;

    public C4101v8(GestureDetectorOnGestureListenerC3635ci renderView, AdConfig.HybridNativeConfig hybridNativeConfig, HtmlVideoPlayerRequest videoRequestConfig, C3583ai c3583ai, C3887mi c3887mi, InterfaceC3878m9 interfaceC3878m9) {
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(hybridNativeConfig, "hybridNativeConfig");
        Intrinsics.checkNotNullParameter(videoRequestConfig, "videoRequestConfig");
        this.f39745a = videoRequestConfig;
        this.f39746b = c3887mi;
        this.f39747c = interfaceC3878m9;
        C4076u8 c4076u8 = new C4076u8(eg.c0.J8, this);
        CoroutineScope coroutineScopeA = kotlinx.coroutines.i.a(eg.o0.b().plus(c4076u8));
        this.f39748d = coroutineScopeA;
        this.f39749e = P4.a(coroutineScopeA, c4076u8);
        this.f39751g = new AtomicBoolean(false);
        this.f39752h = new WeakReference(renderView.getContext());
        this.f39754j = videoRequestConfig.getConfig();
        Context context = renderView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f39755k = new N7(context, hybridNativeConfig, coroutineScopeA, videoRequestConfig, interfaceC3878m9);
        this.f39758n = c3583ai;
        this.f39761q = new AtomicReference(EnumC4026s8.f39507a);
    }

    public static /* synthetic */ boolean a(C4101v8 c4101v8, EnumC4026s8[] enumC4026s8Arr, String str, String str2, EnumC4026s8 enumC4026s8, int i10) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            enumC4026s8 = null;
        }
        return c4101v8.a(enumC4026s8Arr, str, str2, enumC4026s8);
    }

    public final void b(boolean z10) throws JSONException {
        if (this.f39751g.get()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", z10 ? C4424m2.f43623v : MenuActionType.HIDE);
        EnumC4026s8[] enumC4026s8Arr = {EnumC4026s8.f39509c, EnumC4026s8.f39511e, EnumC4026s8.f39512f, EnumC4026s8.f39513g, EnumC4026s8.f39514h};
        EnumC3573a8[] enumC3573a8Arr = EnumC3573a8.f38173a;
        if (a(this, enumC4026s8Arr, "executeVideoPlayerActions", jSONObject.toString(), null, 8)) {
            N7 n72 = this.f39755k;
            if (n72.f37409h.get()) {
                return;
            }
            if (z10) {
                n72.e();
            } else {
                n72.f();
            }
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                n72.f37415n.setVisibility(z10 ? 0 : 8);
            } else {
                eg.i.d(n72.f37404c, null, null, new C4175y7(null, n72, z10), 3, null);
            }
        }
    }

    public final boolean a(EnumC4026s8[] enumC4026s8Arr, String str, String str2, EnumC4026s8 enumC4026s8) {
        EnumC4026s8 enumC4026s82 = (EnumC4026s8) this.f39761q.get();
        boolean z10 = false;
        if (ArraysKt.contains(enumC4026s8Arr, enumC4026s82)) {
            if (enumC4026s8 != null && !a(enumC4026s8, str, str2)) {
                z10 = true;
            }
            return !z10;
        }
        if (str != null) {
            String str3 = String.format("Invalid state (%s) for %s. Allowed: %s", Arrays.copyOf(new Object[]{enumC4026s82, str2, ArraysKt.joinToString$default(enumC4026s8Arr, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null)}, 3));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            a(str, str3, str2);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r7 == com.inmobi.media.EnumC4026s8.f39515i) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        if (r7 != com.inmobi.media.EnumC4026s8.f39514h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
    
        if (r7 != com.inmobi.media.EnumC4026s8.f39514h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:
    
        if (r7 != com.inmobi.media.EnumC4026s8.f39515i) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0053, code lost:
    
        if (r7 == com.inmobi.media.EnumC4026s8.f39515i) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0064, code lost:
    
        if (r7 != com.inmobi.media.EnumC4026s8.f39514h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0075, code lost:
    
        if (r7 != com.inmobi.media.EnumC4026s8.f39515i) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x007e, code lost:
    
        if (r7 != com.inmobi.media.EnumC4026s8.f39515i) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.inmobi.media.EnumC4026s8 r7, java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4101v8.a(com.inmobi.media.s8, java.lang.String, java.lang.String):boolean");
    }

    public final void a(String str, String str2, String str3) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39747c;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).b("HybridVideoPlayerHandler", "Manager error (" + str + "): " + str2);
        }
        if (this.f39751g.get()) {
            return;
        }
        EnumC3573a8[] enumC3573a8Arr = EnumC3573a8.f38173a;
        if (Intrinsics.areEqual(str, "unknown")) {
            return;
        }
        X7 obj = new X7(str3);
        C3583ai c3583ai = this.f39758n;
        if (c3583ai != null) {
            EnumC3952p8 htmlVideoTemplateEvents = EnumC3952p8.f39254e;
            Intrinsics.checkNotNullParameter(obj, "obj");
            JSONObject jSONObjectA = AbstractC3879ma.a(obj, X7.class);
            Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents, "htmlVideoTemplateEvents");
            c3583ai.f38212a.a(htmlVideoTemplateEvents, jSONObjectA);
        }
    }

    public final void a(boolean z10) throws JSONException {
        if (this.f39751g.get()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", z10 ? "mute" : "unmute");
        EnumC4026s8[] enumC4026s8Arr = {EnumC4026s8.f39509c, EnumC4026s8.f39511e, EnumC4026s8.f39512f};
        EnumC3573a8[] enumC3573a8Arr = EnumC3573a8.f38173a;
        if (a(this, enumC4026s8Arr, "executeVideoPlayerActions", jSONObject.toString(), null, 8)) {
            N7 n72 = this.f39755k;
            if (n72.f37409h.get()) {
                return;
            }
            if (z10) {
                S7 s72 = n72.f37426y;
                s72.a();
                s72.f37698d.a();
            } else {
                S7 s73 = n72.f37426y;
                P4.a(s73.f37695a, new R7(s73, null));
            }
        }
    }

    public final void a() throws JSONException {
        ViewGroup viewGroup;
        SimpleCache simpleCache;
        if (this.f39751g.getAndSet(true)) {
            return;
        }
        EnumC4026s8 enumC4026s8 = EnumC4026s8.f39515i;
        EnumC3573a8[] enumC3573a8Arr = EnumC3573a8.f38173a;
        a(enumC4026s8, "executeVideoPlayerActions", (String) null);
        InterfaceC3878m9 interfaceC3878m9 = this.f39747c;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("HybridVideoPlayerHandler", "destroy video player");
        }
        N7 n72 = this.f39755k;
        if (!n72.f37409h.getAndSet(true)) {
            InterfaceC3878m9 interfaceC3878m92 = n72.f37403b;
            if (interfaceC3878m92 != null) {
                ((C3903n9) interfaceC3878m92).a("HtmlMediaPlayer", "destroy called");
            }
            Job job = n72.f37423v;
            if (job != null) {
                Job.a.a(job, null, 1, null);
            }
            n72.f37423v = null;
            n72.f37413l.set(EnumC4034sg.f39539h);
            n72.f37408g.set(false);
            P4.a(n72.f37412k);
            n72.f37425x.a();
            if (n72.f37407f.get()) {
                n72.f37407f.set(false);
                if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    eg.i.d(n72.f37404c, null, null, new I7(null, n72), 3, null);
                } else {
                    n72.f37417p.removeListener(n72.B);
                }
            }
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                eg.i.d(n72.f37404c, null, null, new H7(null, n72), 3, null);
            } else {
                n72.f37417p.stop();
                n72.f37417p.clearMediaItems();
                n72.f37417p.release();
                n72.f37427z.a();
                n72.f37426y.f37698d.c();
            }
            K2 k22 = n72.f37424w;
            while (true) {
                int i10 = k22.f37190f.get();
                if (i10 <= 0) {
                    break;
                }
                int i11 = i10 - 1;
                if (k22.f37190f.compareAndSet(i10, i11)) {
                    if (i11 == 0) {
                        synchronized (k22.f37185a) {
                            try {
                                if (k22.f37190f.get() == 0) {
                                    simpleCache = k22.f37191g;
                                    k22.f37191g = null;
                                } else {
                                    simpleCache = null;
                                }
                                Unit unit = Unit.f93236a;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        simpleCache = null;
                    }
                    if (simpleCache != null) {
                        simpleCache.release();
                    }
                }
            }
            n72.f37415n.setOnPositionChangeListener(null);
            n72.f37415n.removeAllViews();
            WeakReference weakReference = n72.f37419r;
            if (weakReference != null && (viewGroup = (ViewGroup) weakReference.get()) != null) {
                viewGroup.removeView(n72.f37415n);
            }
            WeakReference weakReference2 = n72.f37419r;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            kotlinx.coroutines.i.f(n72.f37404c, null, 1, null);
            kotlinx.coroutines.i.f(n72.f37405d, null, 1, null);
        }
        N7 n73 = this.f39755k;
        n73.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("totalDuration", n73.f37417p.getDuration());
        jSONObject.put("playbackTime", n73.f37417p.getCurrentPosition());
        jSONObject.put("bufferTime", n73.f37417p.getBufferedPosition());
        String durationPayload = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(durationPayload, "toString(...)");
        C3887mi c3887mi = this.f39746b;
        if (c3887mi != null) {
            Intrinsics.checkNotNullParameter(durationPayload, "durationPayload");
            Map mapA = c3887mi.a();
            mapA.put("payload", durationPayload);
            Wj wj = Wj.f37959a;
            Wj.b("VideoDestroyed", mapA, EnumC3585ak.f38215a);
        }
        C3583ai c3583ai = this.f39758n;
        if (c3583ai != null) {
            EnumC3952p8 htmlVideoTemplateEvents = EnumC3952p8.f39260k;
            Intrinsics.checkNotNullParameter(htmlVideoTemplateEvents, "htmlVideoTemplateEvents");
            c3583ai.f38212a.a(htmlVideoTemplateEvents, (Object) null);
        }
        Job job2 = this.f39750f;
        if (job2 != null) {
            Job.a.a(job2, null, 1, null);
        }
        this.f39750f = null;
        this.f39757m = null;
        this.f39758n = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.inmobi.media.Rl r15) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4101v8.a(com.inmobi.media.Rl):void");
    }
}
