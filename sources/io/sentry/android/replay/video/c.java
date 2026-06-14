package io.sentry.android.replay.video;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import io.sentry.g7;
import io.sentry.v7;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import lf.i;
import lf.l;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v7 f83209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.android.replay.video.a f83210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f83211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f83212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MediaCodec f83213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f83214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final MediaCodec.BufferInfo f83215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final io.sentry.android.replay.video.b f83216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Surface f83217i;

    static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f83218f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean z10 = false;
            MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
            Intrinsics.checkNotNullExpressionValue(codecInfos, "getCodecInfos(...)");
            int length = codecInfos.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                String name = codecInfos[i10].getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (StringsKt.g0(name, "c2.exynos", false, 2, null)) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class b extends Lambda implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final MediaFormat invoke() {
            int iA = c.this.g().a();
            try {
                MediaCodecInfo.VideoCapabilities videoCapabilities = c.this.e().getCodecInfo().getCapabilitiesForType(c.this.g().d()).getVideoCapabilities();
                if (!videoCapabilities.getBitrateRange().contains(Integer.valueOf(iA))) {
                    c.this.h().getLogger().c(g7.DEBUG, "Encoder doesn't support the provided bitRate: " + iA + ", the value will be clamped to the closest one", new Object[0]);
                    Object objClamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(iA));
                    Intrinsics.checkNotNullExpressionValue(objClamp, "clamp(...)");
                    iA = ((Number) objClamp).intValue();
                }
            } catch (Throwable th2) {
                c.this.h().getLogger().a(g7.DEBUG, "Could not retrieve MediaCodec info", th2);
            }
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(c.this.g().d(), c.this.g().f(), c.this.g().e());
            Intrinsics.checkNotNullExpressionValue(mediaFormatCreateVideoFormat, "createVideoFormat(...)");
            mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
            mediaFormatCreateVideoFormat.setInteger(com.taurusx.tax.f.a.f65992s, iA);
            mediaFormatCreateVideoFormat.setFloat("frame-rate", c.this.g().c());
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
            return mediaFormatCreateVideoFormat;
        }
    }

    public c(v7 options, io.sentry.android.replay.video.a muxerConfig, Function0 function0) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(muxerConfig, "muxerConfig");
        this.f83209a = options;
        this.f83210b = muxerConfig;
        this.f83211c = function0;
        l lVar = l.f94211d;
        this.f83212d = i.b(lVar, a.f83218f);
        MediaCodec mediaCodecCreateByCodecName = d() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType(muxerConfig.d());
        Intrinsics.checkNotNull(mediaCodecCreateByCodecName);
        this.f83213e = mediaCodecCreateByCodecName;
        this.f83214f = i.b(lVar, new b());
        this.f83215g = new MediaCodec.BufferInfo();
        String absolutePath = muxerConfig.b().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        this.f83216h = new io.sentry.android.replay.video.b(absolutePath, muxerConfig.c());
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e0, code lost:
    
        throw new java.lang.RuntimeException("encoderOutputBuffer " + r2 + " was null");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a(boolean r9) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.video.c.a(boolean):void");
    }

    private final boolean d() {
        return ((Boolean) this.f83212d.getValue()).booleanValue();
    }

    private final MediaFormat f() {
        return (MediaFormat) this.f83214f.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.graphics.Bitmap r8) {
        /*
            r7 = this;
            java.lang.String r0 = "image"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r2 = "xiaomi"
            r3 = 1
            boolean r2 = kotlin.text.StringsKt.e0(r0, r2, r3)
            r4 = 0
            if (r2 != 0) goto L4a
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "motorola"
            boolean r0 = kotlin.text.StringsKt.e0(r0, r1, r3)
            if (r0 != 0) goto L4a
            io.sentry.android.replay.util.p r0 = io.sentry.android.replay.util.p.f83172a
            io.sentry.android.replay.util.p$a r1 = io.sentry.android.replay.util.p.a.SOC_MANUFACTURER
            r2 = 2
            java.lang.String r5 = io.sentry.android.replay.util.p.b(r0, r1, r4, r2, r4)
            java.lang.String r6 = "spreadtrum"
            boolean r5 = kotlin.text.StringsKt.N(r5, r6, r3)
            if (r5 != 0) goto L4a
            java.lang.String r0 = io.sentry.android.replay.util.p.b(r0, r1, r4, r2, r4)
            java.lang.String r1 = "unisoc"
            boolean r0 = kotlin.text.StringsKt.N(r0, r1, r3)
            if (r0 == 0) goto L3f
            goto L4a
        L3f:
            android.view.Surface r0 = r7.f83217i
            if (r0 == 0) goto L48
            android.graphics.Canvas r0 = r0.lockHardwareCanvas()
            goto L52
        L48:
            r0 = r4
            goto L52
        L4a:
            android.view.Surface r0 = r7.f83217i
            if (r0 == 0) goto L48
            android.graphics.Canvas r0 = r0.lockCanvas(r4)
        L52:
            if (r0 == 0) goto L58
            r1 = 0
            r0.drawBitmap(r8, r1, r1, r4)
        L58:
            android.view.Surface r8 = r7.f83217i
            if (r8 == 0) goto L5f
            r8.unlockCanvasAndPost(r0)
        L5f:
            r8 = 0
            r7.a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.video.c.b(android.graphics.Bitmap):void");
    }

    public final long c() {
        return this.f83216h.a();
    }

    public final MediaCodec e() {
        return this.f83213e;
    }

    public final io.sentry.android.replay.video.a g() {
        return this.f83210b;
    }

    public final v7 h() {
        return this.f83209a;
    }

    public final void i() {
        try {
            Function0 function0 = this.f83211c;
            if (function0 != null) {
                function0.invoke();
            }
            a(true);
            this.f83213e.stop();
            this.f83213e.release();
            Surface surface = this.f83217i;
            if (surface != null) {
                surface.release();
            }
            this.f83216h.d();
        } catch (Throwable th2) {
            this.f83209a.getLogger().a(g7.DEBUG, "Failed to properly release video encoder", th2);
        }
    }

    public final void j() {
        this.f83213e.configure(f(), (Surface) null, (MediaCrypto) null, 1);
        this.f83217i = this.f83213e.createInputSurface();
        this.f83213e.start();
        a(false);
    }

    public /* synthetic */ c(v7 v7Var, io.sentry.android.replay.video.a aVar, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(v7Var, aVar, (i10 & 4) != 0 ? null : function0);
    }
}
