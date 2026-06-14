package q;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import q.i;
import q.p;
import vh.l0;
import vh.x;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f98551e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f98552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y.m f98553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ng.g f98554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f98555d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b extends vh.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Exception f98556b;

        public b(l0 l0Var) {
            super(l0Var);
        }

        public final Exception m() {
            return this.f98556b;
        }

        @Override // vh.o, vh.l0
        public long read(vh.e eVar, long j10) throws Exception {
            try {
                return super.read(eVar, j10);
            } catch (Exception e10) {
                this.f98556b = e10;
                throw e10;
            }
        }
    }

    public static final class c implements i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l f98557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ng.g f98558b;

        public c(int i10, l lVar) {
            this.f98557a = lVar;
            this.f98558b = ng.k.b(i10, 0, 2, null);
        }

        @Override // q.i.a
        public i a(s.m mVar, y.m mVar2, o.e eVar) {
            return new d(mVar.b(), mVar2, this.f98558b, this.f98557a);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return c.class.hashCode();
        }
    }

    /* JADX INFO: renamed from: q.d$d, reason: collision with other inner class name */
    static final class C1166d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f98559r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f98560s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f98561t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f98563v;

        C1166d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f98561t = obj;
            this.f98563v |= Integer.MIN_VALUE;
            return d.this.a(this);
        }
    }

    static final class e extends Lambda implements Function0 {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            return d.this.e(new BitmapFactory.Options());
        }
    }

    public d(p pVar, y.m mVar, ng.g gVar, l lVar) {
        this.f98552a = pVar;
        this.f98553b = mVar;
        this.f98554c = gVar;
        this.f98555d = lVar;
    }

    private final void c(BitmapFactory.Options options, j jVar) {
        Bitmap.Config configF = this.f98553b.f();
        if (jVar.b() || n.a(jVar)) {
            configF = c0.a.e(configF);
        }
        if (this.f98553b.d() && configF == Bitmap.Config.ARGB_8888 && Intrinsics.areEqual(options.outMimeType, "image/jpeg")) {
            configF = Bitmap.Config.RGB_565;
        }
        if (Build.VERSION.SDK_INT >= 26 && options.outConfig == Bitmap.Config.RGBA_F16 && configF != Bitmap.Config.HARDWARE) {
            configF = Bitmap.Config.RGBA_F16;
        }
        options.inPreferredConfig = configF;
    }

    private final void d(BitmapFactory.Options options, j jVar) {
        p.a aVarM = this.f98552a.m();
        if ((aVarM instanceof r) && z.b.a(this.f98553b.n())) {
            options.inSampleSize = 1;
            options.inScaled = true;
            options.inDensity = ((r) aVarM).a();
            options.inTargetDensity = this.f98553b.g().getResources().getDisplayMetrics().densityDpi;
            return;
        }
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            options.inSampleSize = 1;
            options.inScaled = false;
            return;
        }
        int i10 = n.b(jVar) ? options.outHeight : options.outWidth;
        int i11 = n.b(jVar) ? options.outWidth : options.outHeight;
        z.i iVarN = this.f98553b.n();
        int iZ = z.b.a(iVarN) ? i10 : c0.i.z(iVarN.b(), this.f98553b.m());
        z.i iVarN2 = this.f98553b.n();
        int iZ2 = z.b.a(iVarN2) ? i11 : c0.i.z(iVarN2.a(), this.f98553b.m());
        int iA = h.a(i10, i11, iZ, iZ2, this.f98553b.m());
        options.inSampleSize = iA;
        double dB = h.b(((double) i10) / ((double) iA), ((double) i11) / ((double) iA), iZ, iZ2, this.f98553b.m());
        if (this.f98553b.c()) {
            dB = kotlin.ranges.g.h(dB, 1.0d);
        }
        boolean z10 = dB == 1.0d;
        options.inScaled = !z10;
        if (z10) {
            return;
        }
        if (dB > 1.0d) {
            options.inDensity = zf.a.c(((double) Integer.MAX_VALUE) / dB);
            options.inTargetDensity = Integer.MAX_VALUE;
        } else {
            options.inDensity = Integer.MAX_VALUE;
            options.inTargetDensity = zf.a.c(((double) Integer.MAX_VALUE) * dB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g e(BitmapFactory.Options options) throws Exception {
        b bVar = new b(this.f98552a.n());
        vh.g gVarD = x.d(bVar);
        boolean z10 = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(gVarD.peek().inputStream(), null, options);
        Exception excM = bVar.m();
        if (excM != null) {
            throw excM;
        }
        options.inJustDecodeBounds = false;
        m mVar = m.f98584a;
        j jVarA = mVar.a(options.outMimeType, gVarD, this.f98555d);
        Exception excM2 = bVar.m();
        if (excM2 != null) {
            throw excM2;
        }
        options.inMutable = false;
        if (Build.VERSION.SDK_INT >= 26 && this.f98553b.e() != null) {
            options.inPreferredColorSpace = this.f98553b.e();
        }
        options.inPremultiplied = this.f98553b.l();
        c(options, jVarA);
        d(options, jVarA);
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(gVarD.inputStream(), null, options);
            uf.c.a(gVarD, null);
            Exception excM3 = bVar.m();
            if (excM3 != null) {
                throw excM3;
            }
            if (bitmapDecodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            bitmapDecodeStream.setDensity(this.f98553b.g().getResources().getDisplayMetrics().densityDpi);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f98553b.g().getResources(), mVar.b(bitmapDecodeStream, jVarA));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z10 = false;
            }
            return new g(bitmapDrawable, z10);
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof q.d.C1166d
            if (r0 == 0) goto L13
            r0 = r8
            q.d$d r0 = (q.d.C1166d) r0
            int r1 = r0.f98563v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f98563v = r1
            goto L18
        L13:
            q.d$d r0 = new q.d$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f98561t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f98563v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r0 = r0.f98559r
            ng.g r0 = (ng.g) r0
            kotlin.d.b(r8)     // Catch: java.lang.Throwable -> L30
            goto L70
        L30:
            r8 = move-exception
            goto L7a
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            java.lang.Object r2 = r0.f98560s
            ng.g r2 = (ng.g) r2
            java.lang.Object r5 = r0.f98559r
            q.d r5 = (q.d) r5
            kotlin.d.b(r8)
            r8 = r2
            goto L5a
        L47:
            kotlin.d.b(r8)
            ng.g r8 = r7.f98554c
            r0.f98559r = r7
            r0.f98560s = r8
            r0.f98563v = r4
            java.lang.Object r2 = r8.b(r0)
            if (r2 != r1) goto L59
            goto L6c
        L59:
            r5 = r7
        L5a:
            q.d$e r2 = new q.d$e     // Catch: java.lang.Throwable -> L76
            r2.<init>()     // Catch: java.lang.Throwable -> L76
            r0.f98559r = r8     // Catch: java.lang.Throwable -> L76
            r5 = 0
            r0.f98560s = r5     // Catch: java.lang.Throwable -> L76
            r0.f98563v = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = eg.z0.c(r5, r2, r0, r4, r5)     // Catch: java.lang.Throwable -> L76
            if (r0 != r1) goto L6d
        L6c:
            return r1
        L6d:
            r6 = r0
            r0 = r8
            r8 = r6
        L70:
            q.g r8 = (q.g) r8     // Catch: java.lang.Throwable -> L30
            r0.release()
            return r8
        L76:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L7a:
            r0.release()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q.d.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
