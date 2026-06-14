package io.sentry.android.replay;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.sentry.android.replay.capture.h;
import io.sentry.android.replay.h;
import io.sentry.android.replay.r;
import io.sentry.b1;
import io.sentry.b4;
import io.sentry.c4;
import io.sentry.e7;
import io.sentry.f1;
import io.sentry.g1;
import io.sentry.g7;
import io.sentry.i0;
import io.sentry.j4;
import io.sentry.n0;
import io.sentry.r1;
import io.sentry.r2;
import io.sentry.transport.b0;
import io.sentry.util.z;
import io.sentry.v7;
import io.sentry.x7;
import io.sentry.y0;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import net.pubnative.lite.sdk.utils.AtomManager;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0096\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0003TV'BA\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u0019J\u0019\u0010 \u001a\u00020\u00172\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010\u0019J\u001f\u0010'\u001a\u00020\u00172\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0017H\u0016¢\u0006\u0004\b,\u0010\u0019J\u000f\u0010-\u001a\u00020\u0017H\u0016¢\u0006\u0004\b-\u0010\u0019J\u0019\u0010/\u001a\u00020\u00172\b\u0010.\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0011H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00172\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u000203H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0017H\u0016¢\u0006\u0004\b9\u0010\u0019J\u000f\u0010:\u001a\u00020)H\u0016¢\u0006\u0004\b:\u0010+J\u000f\u0010;\u001a\u00020\u0017H\u0016¢\u0006\u0004\b;\u0010\u0019J\u0017\u0010>\u001a\u00020\u00172\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0017H\u0016¢\u0006\u0004\b@\u0010\u0019J\u0017\u0010C\u001a\u00020\u00172\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\u00172\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\u00172\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ\u001f\u0010P\u001a\u00020\u00172\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020MH\u0016¢\u0006\u0004\bP\u0010QJ\u0015\u0010T\u001a\u00020\u00172\u0006\u0010S\u001a\u00020R¢\u0006\u0004\bT\u0010UR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010XR\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010YR\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010ZR\u0016\u0010\\\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010[R\u0016\u0010_\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010`R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010e\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010i\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u001b\u0010o\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u001b\u0010s\u001a\u00020p8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b:\u0010l\u001a\u0004\bq\u0010rR\u001b\u0010w\u001a\u00020t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010l\u001a\u0004\bu\u0010vR\u001a\u0010|\u001a\u00020x8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010y\u001a\u0004\bz\u0010{R\u001a\u0010~\u001a\u00020x8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u0010y\u001a\u0004\b}\u0010{R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0019\u0010\u0085\u0001\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R&\u0010\u0087\u0001\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u007f\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010ZR\u001a\u0010\u008b\u0001\u001a\u00030\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R \u0010\u008d\u0001\u001a\n\u0012\u0004\u0012\u00020f\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010YR\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001¨\u0006\u0097\u0001"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration;", "Lio/sentry/r1;", "Ljava/io/Closeable;", "Lio/sentry/android/replay/q;", "Lio/sentry/android/replay/gestures/c;", "Lio/sentry/c4;", "Lio/sentry/n0$b;", "Lio/sentry/transport/b0$b;", "Lio/sentry/android/replay/t;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lio/sentry/transport/p;", "dateProvider", "Lkotlin/Function0;", "Lio/sentry/android/replay/f;", "recorderProvider", "Lkotlin/Function1;", "Lio/sentry/protocol/x;", "Lio/sentry/android/replay/h;", "replayCacheProvider", "<init>", "(Landroid/content/Context;Lio/sentry/transport/p;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "(Landroid/content/Context;Lio/sentry/transport/p;)V", "", "u0", "()V", "s0", "z", "t0", "x0", "", "unfinishedReplayId", "M", "(Ljava/lang/String;)V", "U", "Lio/sentry/b1;", "scopes", "Lio/sentry/v7;", "options", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "(Lio/sentry/b1;Lio/sentry/v7;)V", "", "n0", "()Z", "start", "resume", "isTerminating", "n", "(Ljava/lang/Boolean;)V", "e0", "()Lio/sentry/protocol/x;", "Lio/sentry/b4;", "converter", EidRequestBuilder.REQUEST_FIELD_EMAIL, "(Lio/sentry/b4;)V", "p", "()Lio/sentry/b4;", "pause", "m", AtomManager.ATOM_STOP_METHOD_NAME, "Landroid/graphics/Bitmap;", "bitmap", "d", "(Landroid/graphics/Bitmap;)V", "close", "Lio/sentry/n0$a;", "status", InneractiveMediationDefs.GENDER_FEMALE, "(Lio/sentry/n0$a;)V", "Lio/sentry/transport/b0;", "rateLimiter", "o", "(Lio/sentry/transport/b0;)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "", "width", "height", "h", "(II)V", "Lio/sentry/android/replay/r;", "config", "a", "(Lio/sentry/android/replay/r;)V", "b", "Landroid/content/Context;", "Lio/sentry/transport/p;", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "Lio/sentry/n0$a;", "lastKnownConnectionStatus", "g", "Z", "debugMaskingEnabled", "Lio/sentry/v7;", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "Lio/sentry/b1;", "j", "Lio/sentry/android/replay/f;", "recorder", "Lio/sentry/android/replay/gestures/a;", CampaignEx.JSON_KEY_AD_K, "Lio/sentry/android/replay/gestures/a;", "gestureRecorder", "Lio/sentry/util/z;", CmcdData.Factory.STREAM_TYPE_LIVE, "Lkotlin/Lazy;", ExifInterface.LONGITUDE_WEST, "()Lio/sentry/util/z;", "random", "Lio/sentry/android/replay/o;", "i0", "()Lio/sentry/android/replay/o;", "rootViewsSpy", "Lio/sentry/android/replay/util/m;", "b0", "()Lio/sentry/android/replay/util/m;", "replayExecutor", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isEnabled$sentry_android_replay_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isEnabled", "isManualPause$sentry_android_replay_release", "isManualPause", "Lio/sentry/android/replay/capture/h;", CampaignEx.JSON_KEY_AD_Q, "Lio/sentry/android/replay/capture/h;", "captureStrategy", "r", "Lio/sentry/b4;", "replayBreadcrumbConverter", "s", "replayCaptureStrategyProvider", "Lio/sentry/android/replay/util/j;", ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "Lio/sentry/android/replay/util/j;", "mainLooperHandler", ApsMetricsDataMap.APSMETRICS_FIELD_URL, "gestureRecorderProvider", "Lio/sentry/util/a;", "v", "Lio/sentry/util/a;", "lifecycleLock", "Lio/sentry/android/replay/l;", POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, "Lio/sentry/android/replay/l;", "lifecycle", "x", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ReplayIntegration implements r1, Closeable, q, io.sentry.android.replay.gestures.c, c4, n0.b, b0.b, t, AutoCloseable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final a f82828x = new a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f82829y = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.transport.p dateProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function0 recorderProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function1 replayCacheProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private volatile n0.a lastKnownConnectionStatus;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean debugMaskingEnabled;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private v7 options;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private b1 scopes;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private io.sentry.android.replay.f recorder;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private io.sentry.android.replay.gestures.a gestureRecorder;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Lazy random;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Lazy rootViewsSpy;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Lazy replayExecutor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isEnabled;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isManualPause;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private io.sentry.android.replay.capture.h captureStrategy;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private b4 replayBreadcrumbConverter;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private Function1 replayCaptureStrategyProvider;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private io.sentry.android.replay.util.j mainLooperHandler;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private Function0 gestureRecorderProvider;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.util.a lifecycleLock;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final l lifecycle;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b implements io.sentry.hints.c {
        @Override // io.sentry.hints.c
        public boolean e() {
            return false;
        }
    }

    private static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f82852a;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r10) {
            Intrinsics.checkNotNullParameter(r10, "r");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryReplayIntegration-");
            int i10 = this.f82852a;
            this.f82852a = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(r10, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    static final class d extends Lambda implements Function1 {
        d() {
            super(1);
        }

        public final void a(Date newTimestamp) {
            Intrinsics.checkNotNullParameter(newTimestamp, "newTimestamp");
            io.sentry.android.replay.capture.h hVar = ReplayIntegration.this.captureStrategy;
            if (hVar != null) {
                io.sentry.android.replay.capture.h hVar2 = ReplayIntegration.this.captureStrategy;
                Integer numValueOf = hVar2 != null ? Integer.valueOf(hVar2.c()) : null;
                Intrinsics.checkNotNull(numValueOf);
                hVar.b(numValueOf.intValue() + 1);
            }
            io.sentry.android.replay.capture.h hVar3 = ReplayIntegration.this.captureStrategy;
            if (hVar3 == null) {
                return;
            }
            hVar3.i(newTimestamp);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Date) obj);
            return Unit.f93236a;
        }
    }

    static final class e extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Bitmap f82854f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f82855g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Bitmap bitmap, Ref$ObjectRef ref$ObjectRef) {
            super(2);
            this.f82854f = bitmap;
            this.f82855g = ref$ObjectRef;
        }

        public final void a(io.sentry.android.replay.h onScreenshotRecorded, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(onScreenshotRecorded, "$this$onScreenshotRecorded");
            onScreenshotRecorded.m(this.f82854f, j10, (String) this.f82855g.f93280b);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            a((io.sentry.android.replay.h) obj, ((Number) obj2).longValue());
            return Unit.f93236a;
        }
    }

    static final class f extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final f f82856f = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final z invoke() {
            return new z();
        }
    }

    static final class g extends Lambda implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final io.sentry.android.replay.util.m invoke() {
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new c());
            Intrinsics.checkNotNull(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
            v7 v7Var = ReplayIntegration.this.options;
            if (v7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("options");
                v7Var = null;
            }
            return new io.sentry.android.replay.util.m(scheduledExecutorServiceNewSingleThreadScheduledExecutor, v7Var);
        }
    }

    static final class h extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final h f82858f = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return o.f83057f.b();
        }
    }

    static {
        e7.d().b("maven:io.sentry:sentry-android-replay", "8.26.0");
    }

    public ReplayIntegration(Context context, io.sentry.transport.p dateProvider, Function0 function0, Function1 function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.context = context;
        this.dateProvider = dateProvider;
        this.recorderProvider = function0;
        this.replayCacheProvider = function1;
        this.lastKnownConnectionStatus = n0.a.UNKNOWN;
        this.random = lf.i.a(f.f82856f);
        this.rootViewsSpy = lf.i.a(h.f82858f);
        this.replayExecutor = lf.i.a(new g());
        this.isEnabled = new AtomicBoolean(false);
        this.isManualPause = new AtomicBoolean(false);
        r2 r2VarB = r2.b();
        Intrinsics.checkNotNullExpressionValue(r2VarB, "getInstance(...)");
        this.replayBreadcrumbConverter = r2VarB;
        this.mainLooperHandler = new io.sentry.android.replay.util.j(null, 1, null);
        this.lifecycleLock = new io.sentry.util.a();
        this.lifecycle = new l();
    }

    private final void M(String unfinishedReplayId) {
        File[] fileArrListFiles;
        v7 v7Var = this.options;
        if (v7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("options");
            v7Var = null;
        }
        String cacheDirPath = v7Var.getCacheDirPath();
        if (cacheDirPath == null || (fileArrListFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        Intrinsics.checkNotNull(fileArrListFiles);
        for (File file : fileArrListFiles) {
            String name = file.getName();
            Intrinsics.checkNotNull(name);
            if (StringsKt.a0(name, "replay_", false, 2, null)) {
                String string = e0().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                if (!StringsKt.g0(name, string, false, 2, null) && (StringsKt.y0(unfinishedReplayId) || !StringsKt.g0(name, unfinishedReplayId, false, 2, null))) {
                    io.sentry.util.h.a(file);
                }
            }
        }
    }

    static /* synthetic */ void R(ReplayIntegration replayIntegration, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        replayIntegration.M(str);
    }

    private final void U() {
        v7 v7Var = this.options;
        v7 v7Var2 = null;
        if (v7Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("options");
            v7Var = null;
        }
        f1 executorService = v7Var.getExecutorService();
        Intrinsics.checkNotNullExpressionValue(executorService, "getExecutorService(...)");
        v7 v7Var3 = this.options;
        if (v7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("options");
        } else {
            v7Var2 = v7Var3;
        }
        io.sentry.android.replay.util.f.b(executorService, v7Var2, "ReplayIntegration.finalize_previous_replay", new Runnable() { // from class: io.sentry.android.replay.j
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                ReplayIntegration.V(this.f83053b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(ReplayIntegration replayIntegration) throws IOException {
        v7 v7Var;
        v7 v7Var2 = replayIntegration.options;
        if (v7Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("options");
            v7Var2 = null;
        }
        io.sentry.cache.q qVarFindPersistingScopeObserver = v7Var2.findPersistingScopeObserver();
        if (qVarFindPersistingScopeObserver != null) {
            v7 v7Var3 = replayIntegration.options;
            if (v7Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("options");
                v7Var3 = null;
            }
            String str = (String) qVarFindPersistingScopeObserver.r(v7Var3, "replay.json", String.class);
            if (str != null) {
                io.sentry.protocol.x xVar = new io.sentry.protocol.x(str);
                if (Intrinsics.areEqual(xVar, io.sentry.protocol.x.f84062c)) {
                    R(replayIntegration, null, 1, null);
                    return;
                }
                h.a aVar = io.sentry.android.replay.h.f83031m;
                v7 v7Var4 = replayIntegration.options;
                if (v7Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                    v7Var4 = null;
                }
                io.sentry.android.replay.d dVarC = aVar.c(v7Var4, xVar, replayIntegration.replayCacheProvider);
                if (dVarC == null) {
                    R(replayIntegration, null, 1, null);
                    return;
                }
                v7 v7Var5 = replayIntegration.options;
                if (v7Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                    v7Var5 = null;
                }
                Object objR = qVarFindPersistingScopeObserver.r(v7Var5, "breadcrumbs.json", List.class);
                List list = objR instanceof List ? (List) objR : null;
                h.a aVar2 = io.sentry.android.replay.capture.h.f82982a;
                b1 b1Var = replayIntegration.scopes;
                v7 v7Var6 = replayIntegration.options;
                if (v7Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                    v7Var = null;
                } else {
                    v7Var = v7Var6;
                }
                h.c cVarC = aVar2.c(b1Var, v7Var, dVarC.b(), dVarC.h(), xVar, dVarC.d(), dVarC.e().c(), dVarC.e().d(), dVarC.f(), dVarC.a(), dVarC.e().b(), dVarC.e().a(), dVarC.g(), list, new LinkedList(dVarC.c()));
                if (cVarC instanceof h.c.a) {
                    i0 i0VarE = io.sentry.util.m.e(new b());
                    b1 b1Var2 = replayIntegration.scopes;
                    Intrinsics.checkNotNull(i0VarE);
                    ((h.c.a) cVarC).a(b1Var2, i0VarE);
                }
                replayIntegration.M(str);
                return;
            }
        }
        R(replayIntegration, null, 1, null);
    }

    private final z W() {
        return (z) this.random.getValue();
    }

    private final io.sentry.android.replay.util.m b0() {
        return (io.sentry.android.replay.util.m) this.replayExecutor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(Ref$ObjectRef ref$ObjectRef, y0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String strY = it.y();
        ref$ObjectRef.f93280b = strY != null ? StringsKt.k1(strY, '.', null, 2, null) : null;
    }

    private final void s0() throws Exception {
        g1 g1VarD = this.lifecycleLock.d();
        try {
            if (this.isEnabled.get()) {
                l lVar = this.lifecycle;
                m mVar = m.PAUSED;
                if (lVar.b(mVar)) {
                    io.sentry.android.replay.f fVar = this.recorder;
                    if (fVar != null) {
                        fVar.pause();
                    }
                    io.sentry.android.replay.capture.h hVar = this.captureStrategy;
                    if (hVar != null) {
                        hVar.pause();
                    }
                    this.lifecycle.d(mVar);
                    Unit unit = Unit.f93236a;
                    wf.a.a(g1VarD, null);
                    return;
                }
            }
            wf.a.a(g1VarD, null);
        } finally {
        }
    }

    private final void t0() {
        if (this.recorder instanceof io.sentry.android.replay.e) {
            CopyOnWriteArrayList copyOnWriteArrayListM = i0().m();
            io.sentry.android.replay.f fVar = this.recorder;
            Intrinsics.checkNotNull(fVar, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            copyOnWriteArrayListM.add((io.sentry.android.replay.e) fVar);
        }
        i0().m().add(this.gestureRecorder);
    }

    private final void u0() throws Exception {
        b1 b1Var;
        b1 b1Var2;
        b0 b0VarV;
        b0 b0VarV2;
        g1 g1VarD = this.lifecycleLock.d();
        try {
            if (this.isEnabled.get()) {
                l lVar = this.lifecycle;
                m mVar = m.RESUMED;
                if (lVar.b(mVar)) {
                    if (!this.isManualPause.get() && this.lastKnownConnectionStatus != n0.a.DISCONNECTED && (((b1Var = this.scopes) == null || (b0VarV2 = b1Var.v()) == null || !b0VarV2.p(io.sentry.k.All)) && ((b1Var2 = this.scopes) == null || (b0VarV = b1Var2.v()) == null || !b0VarV.p(io.sentry.k.Replay)))) {
                        this.lifecycle.d(mVar);
                        io.sentry.android.replay.capture.h hVar = this.captureStrategy;
                        if (hVar != null) {
                            hVar.resume();
                        }
                        io.sentry.android.replay.f fVar = this.recorder;
                        if (fVar != null) {
                            fVar.resume();
                            Unit unit = Unit.f93236a;
                        }
                        wf.a.a(g1VarD, null);
                        return;
                    }
                    wf.a.a(g1VarD, null);
                    return;
                }
            }
            wf.a.a(g1VarD, null);
        } finally {
        }
    }

    private final void x0() {
        if (this.recorder instanceof io.sentry.android.replay.e) {
            CopyOnWriteArrayList copyOnWriteArrayListM = i0().m();
            io.sentry.android.replay.f fVar = this.recorder;
            Intrinsics.checkNotNull(fVar, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            copyOnWriteArrayListM.remove((io.sentry.android.replay.e) fVar);
        }
        i0().m().remove(this.gestureRecorder);
    }

    private final void z() throws Exception {
        b1 b1Var;
        b1 b1Var2;
        b0 b0VarV;
        b0 b0VarV2;
        if (this.captureStrategy instanceof io.sentry.android.replay.capture.m) {
            if (this.lastKnownConnectionStatus == n0.a.DISCONNECTED || !(((b1Var = this.scopes) == null || (b0VarV2 = b1Var.v()) == null || !b0VarV2.p(io.sentry.k.All)) && ((b1Var2 = this.scopes) == null || (b0VarV = b1Var2.v()) == null || !b0VarV.p(io.sentry.k.Replay)))) {
                s0();
            }
        }
    }

    public final void a(r config) {
        io.sentry.android.replay.f fVar;
        Intrinsics.checkNotNullParameter(config, "config");
        if (this.isEnabled.get() && n0()) {
            io.sentry.android.replay.capture.h hVar = this.captureStrategy;
            if (hVar != null) {
                hVar.a(config);
            }
            io.sentry.android.replay.f fVar2 = this.recorder;
            if (fVar2 != null) {
                fVar2.a(config);
            }
            if (this.lifecycle.a() != m.PAUSED || (fVar = this.recorder) == null) {
                return;
            }
            fVar.pause();
        }
    }

    @Override // io.sentry.r1
    public void c(b1 scopes, v7 options) {
        ReplayIntegration replayIntegration;
        v7 v7Var;
        io.sentry.android.replay.f vVar;
        io.sentry.android.replay.gestures.a aVar;
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
        if (Build.VERSION.SDK_INT < 26) {
            options.getLogger().c(g7.INFO, "Session replay is only supported on API 26 and above", new Object[0]);
            return;
        }
        if (!options.getSessionReplay().q() && !options.getSessionReplay().r()) {
            options.getLogger().c(g7.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
            return;
        }
        this.scopes = scopes;
        Function0 function0 = this.recorderProvider;
        if (function0 == null || (vVar = (io.sentry.android.replay.f) function0.invoke()) == null) {
            replayIntegration = this;
            v7Var = options;
            vVar = new v(v7Var, replayIntegration, this, this.mainLooperHandler, b0());
        } else {
            replayIntegration = this;
            v7Var = options;
        }
        replayIntegration.recorder = vVar;
        Function0 function02 = replayIntegration.gestureRecorderProvider;
        if (function02 == null || (aVar = (io.sentry.android.replay.gestures.a) function02.invoke()) == null) {
            aVar = new io.sentry.android.replay.gestures.a(v7Var, this);
        }
        replayIntegration.gestureRecorder = aVar;
        replayIntegration.isEnabled.set(true);
        v7Var.getConnectionStatusProvider().m0(this);
        b0 b0VarV = scopes.v();
        if (b0VarV != null) {
            b0VarV.h(this);
        }
        io.sentry.util.o.a("Replay");
        U();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        b0 b0VarV;
        g1 g1VarD = this.lifecycleLock.d();
        try {
            if (this.isEnabled.get()) {
                l lVar = this.lifecycle;
                m mVar = m.CLOSED;
                if (lVar.b(mVar)) {
                    v7 v7Var = this.options;
                    if (v7Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("options");
                        v7Var = null;
                    }
                    v7Var.getConnectionStatusProvider().N(this);
                    b1 b1Var = this.scopes;
                    if (b1Var != null && (b0VarV = b1Var.v()) != null) {
                        b0VarV.M(this);
                    }
                    stop();
                    io.sentry.android.replay.f fVar = this.recorder;
                    if (fVar != null) {
                        fVar.close();
                    }
                    this.recorder = null;
                    i0().close();
                    b0().shutdown();
                    this.lifecycle.d(mVar);
                    Unit unit = Unit.f93236a;
                    wf.a.a(g1VarD, null);
                    return;
                }
            }
            wf.a.a(g1VarD, null);
        } finally {
        }
    }

    @Override // io.sentry.android.replay.q
    public void d(Bitmap bitmap) throws Exception {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        b1 b1Var = this.scopes;
        if (b1Var != null) {
            b1Var.x(new j4() { // from class: io.sentry.android.replay.k
                @Override // io.sentry.j4
                public final void a(y0 y0Var) {
                    ReplayIntegration.r0(ref$ObjectRef, y0Var);
                }
            });
        }
        io.sentry.android.replay.capture.h hVar = this.captureStrategy;
        if (hVar != null) {
            hVar.d(bitmap, new e(bitmap, ref$ObjectRef));
        }
        z();
    }

    @Override // io.sentry.c4
    public void e(b4 converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.replayBreadcrumbConverter = converter;
    }

    public io.sentry.protocol.x e0() {
        io.sentry.protocol.x xVarG;
        io.sentry.android.replay.capture.h hVar = this.captureStrategy;
        if (hVar != null && (xVarG = hVar.g()) != null) {
            return xVarG;
        }
        io.sentry.protocol.x EMPTY_ID = io.sentry.protocol.x.f84062c;
        Intrinsics.checkNotNullExpressionValue(EMPTY_ID, "EMPTY_ID");
        return EMPTY_ID;
    }

    @Override // io.sentry.n0.b
    public void f(n0.a status) throws Exception {
        Intrinsics.checkNotNullParameter(status, "status");
        this.lastKnownConnectionStatus = status;
        if (this.captureStrategy instanceof io.sentry.android.replay.capture.m) {
            if (status == n0.a.DISCONNECTED) {
                s0();
            } else {
                u0();
            }
        }
    }

    @Override // io.sentry.android.replay.t
    public void h(int width, int height) {
        if (this.isEnabled.get() && n0()) {
            v7 v7Var = this.options;
            v7 v7Var2 = null;
            if (v7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("options");
                v7Var = null;
            }
            if (v7Var.getSessionReplay().s()) {
                r.a aVar = r.f83074g;
                Context context = this.context;
                v7 v7Var3 = this.options;
                if (v7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                } else {
                    v7Var2 = v7Var3;
                }
                x7 sessionReplay = v7Var2.getSessionReplay();
                Intrinsics.checkNotNullExpressionValue(sessionReplay, "getSessionReplay(...)");
                a(aVar.b(context, sessionReplay, width, height));
            }
        }
    }

    public final o i0() {
        return (o) this.rootViewsSpy.getValue();
    }

    @Override // io.sentry.c4
    /* JADX INFO: renamed from: m, reason: from getter */
    public boolean getDebugMaskingEnabled() {
        return this.debugMaskingEnabled;
    }

    @Override // io.sentry.c4
    public void n(Boolean isTerminating) {
        if (this.isEnabled.get() && n0()) {
            io.sentry.protocol.x xVar = io.sentry.protocol.x.f84062c;
            io.sentry.android.replay.capture.h hVar = this.captureStrategy;
            v7 v7Var = null;
            if (xVar.equals(hVar != null ? hVar.g() : null)) {
                v7 v7Var2 = this.options;
                if (v7Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                } else {
                    v7Var = v7Var2;
                }
                v7Var.getLogger().c(g7.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                return;
            }
            io.sentry.android.replay.capture.h hVar2 = this.captureStrategy;
            if (hVar2 != null) {
                hVar2.h(Intrinsics.areEqual(isTerminating, Boolean.TRUE), new d());
            }
            io.sentry.android.replay.capture.h hVar3 = this.captureStrategy;
            this.captureStrategy = hVar3 != null ? hVar3.e() : null;
        }
    }

    public boolean n0() {
        return this.lifecycle.a().compareTo(m.STARTED) >= 0 && this.lifecycle.a().compareTo(m.STOPPED) < 0;
    }

    @Override // io.sentry.transport.b0.b
    public void o(b0 rateLimiter) throws Exception {
        Intrinsics.checkNotNullParameter(rateLimiter, "rateLimiter");
        if (this.captureStrategy instanceof io.sentry.android.replay.capture.m) {
            if (rateLimiter.p(io.sentry.k.All) || rateLimiter.p(io.sentry.k.Replay)) {
                s0();
            } else {
                u0();
            }
        }
    }

    @Override // io.sentry.android.replay.gestures.c
    public void onTouchEvent(MotionEvent event) {
        io.sentry.android.replay.capture.h hVar;
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.isEnabled.get() && this.lifecycle.c() && (hVar = this.captureStrategy) != null) {
            hVar.onTouchEvent(event);
        }
    }

    @Override // io.sentry.c4
    /* JADX INFO: renamed from: p, reason: from getter */
    public b4 getReplayBreadcrumbConverter() {
        return this.replayBreadcrumbConverter;
    }

    @Override // io.sentry.c4
    public void pause() throws Exception {
        this.isManualPause.set(true);
        s0();
    }

    @Override // io.sentry.c4
    public void resume() throws Exception {
        this.isManualPause.set(false);
        u0();
    }

    @Override // io.sentry.c4
    public void start() throws Exception {
        io.sentry.android.replay.capture.h fVar;
        v7 v7Var;
        v7 v7Var2;
        g1 g1VarD = this.lifecycleLock.d();
        try {
            if (!this.isEnabled.get()) {
                wf.a.a(g1VarD, null);
                return;
            }
            l lVar = this.lifecycle;
            m mVar = m.STARTED;
            if (!lVar.b(mVar)) {
                v7 v7Var3 = this.options;
                if (v7Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                    v7Var3 = null;
                }
                v7Var3.getLogger().c(g7.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                wf.a.a(g1VarD, null);
                return;
            }
            z zVarW = W();
            v7 v7Var4 = this.options;
            if (v7Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("options");
                v7Var4 = null;
            }
            boolean zA = io.sentry.android.replay.util.o.a(zVarW, v7Var4.getSessionReplay().l());
            if (!zA) {
                v7 v7Var5 = this.options;
                if (v7Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                    v7Var5 = null;
                }
                if (!v7Var5.getSessionReplay().r()) {
                    v7 v7Var6 = this.options;
                    if (v7Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("options");
                        v7Var6 = null;
                    }
                    v7Var6.getLogger().c(g7.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                    wf.a.a(g1VarD, null);
                    return;
                }
            }
            this.lifecycle.d(mVar);
            Function1 function1 = this.replayCaptureStrategyProvider;
            if (function1 == null || (fVar = (io.sentry.android.replay.capture.h) function1.invoke(Boolean.valueOf(zA))) == null) {
                if (zA) {
                    v7 v7Var7 = this.options;
                    if (v7Var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("options");
                        v7Var2 = null;
                    } else {
                        v7Var2 = v7Var7;
                    }
                    fVar = new io.sentry.android.replay.capture.m(v7Var2, this.scopes, this.dateProvider, b0(), this.replayCacheProvider);
                } else {
                    v7 v7Var8 = this.options;
                    if (v7Var8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("options");
                        v7Var = null;
                    } else {
                        v7Var = v7Var8;
                    }
                    fVar = new io.sentry.android.replay.capture.f(v7Var, this.scopes, this.dateProvider, W(), b0(), this.replayCacheProvider);
                }
            }
            this.captureStrategy = fVar;
            io.sentry.android.replay.f fVar2 = this.recorder;
            if (fVar2 != null) {
                fVar2.start();
            }
            io.sentry.android.replay.capture.h hVar = this.captureStrategy;
            if (hVar != null) {
                h.b.a(hVar, 0, null, null, 7, null);
            }
            t0();
            Unit unit = Unit.f93236a;
            wf.a.a(g1VarD, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                wf.a.a(g1VarD, th2);
                throw th3;
            }
        }
    }

    @Override // io.sentry.c4
    public void stop() throws Exception {
        g1 g1VarD = this.lifecycleLock.d();
        try {
            if (this.isEnabled.get()) {
                l lVar = this.lifecycle;
                m mVar = m.STOPPED;
                if (lVar.b(mVar)) {
                    x0();
                    io.sentry.android.replay.f fVar = this.recorder;
                    if (fVar != null) {
                        fVar.reset();
                    }
                    io.sentry.android.replay.f fVar2 = this.recorder;
                    if (fVar2 != null) {
                        fVar2.stop();
                    }
                    io.sentry.android.replay.gestures.a aVar = this.gestureRecorder;
                    if (aVar != null) {
                        aVar.b();
                    }
                    io.sentry.android.replay.capture.h hVar = this.captureStrategy;
                    if (hVar != null) {
                        hVar.stop();
                    }
                    this.captureStrategy = null;
                    this.lifecycle.d(mVar);
                    Unit unit = Unit.f93236a;
                    wf.a.a(g1VarD, null);
                    return;
                }
            }
            wf.a.a(g1VarD, null);
        } finally {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReplayIntegration(Context context, io.sentry.transport.p dateProvider) {
        this(io.sentry.android.replay.util.c.a(context), dateProvider, null, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
    }
}
