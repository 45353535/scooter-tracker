package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import oe.m0;
import oe.p0;
import oe.r0;
import oe.t0;
import ve.u;
import ve.z;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f56227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f56228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.error.b f56229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ie.c f56230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f56231e;

    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f56232r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f56233s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f56234t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f56235u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f56237w;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56235u = obj;
            this.f56237w |= Integer.MIN_VALUE;
            return f.this.l(null, null, this);
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {
        public final /* synthetic */ File A;
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a B;
        public final /* synthetic */ String C;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56238r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f56239s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f56240t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f56241u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public long f56242v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f56243w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f56244x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f56246z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, File file, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar, String str2, Continuation continuation) {
            super(2, continuation);
            this.f56246z = str;
            this.A = file;
            this.B = aVar;
            this.C = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return f.this.new b(this.f56246z, this.A, this.B, this.C, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:101:0x03fd A[Catch: Exception -> 0x0034, TRY_LEAVE, TryCatch #1 {Exception -> 0x0034, blocks: (B:9:0x0029, B:48:0x0167, B:51:0x0185, B:53:0x018d, B:55:0x0191, B:56:0x019b, B:58:0x019e, B:62:0x01e6, B:65:0x01f7, B:67:0x0250, B:69:0x02a5, B:71:0x02ac, B:77:0x02ea, B:81:0x0320, B:85:0x0341, B:87:0x0345, B:90:0x0363, B:91:0x0379, B:76:0x02ce, B:94:0x039c, B:95:0x03a1, B:96:0x03a2, B:101:0x03fd, B:16:0x004e, B:19:0x006a, B:22:0x0080, B:26:0x008e, B:27:0x00b4, B:29:0x00be, B:31:0x00d0, B:33:0x00d8, B:39:0x00fd, B:41:0x0101, B:42:0x010a, B:44:0x0139, B:46:0x0157, B:37:0x00e0), top: B:109:0x0013, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0167 A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:9:0x0029, B:48:0x0167, B:51:0x0185, B:53:0x018d, B:55:0x0191, B:56:0x019b, B:58:0x019e, B:62:0x01e6, B:65:0x01f7, B:67:0x0250, B:69:0x02a5, B:71:0x02ac, B:77:0x02ea, B:81:0x0320, B:85:0x0341, B:87:0x0345, B:90:0x0363, B:91:0x0379, B:76:0x02ce, B:94:0x039c, B:95:0x03a1, B:96:0x03a2, B:101:0x03fd, B:16:0x004e, B:19:0x006a, B:22:0x0080, B:26:0x008e, B:27:0x00b4, B:29:0x00be, B:31:0x00d0, B:33:0x00d8, B:39:0x00fd, B:41:0x0101, B:42:0x010a, B:44:0x0139, B:46:0x0157, B:37:0x00e0), top: B:109:0x0013, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x018d A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:9:0x0029, B:48:0x0167, B:51:0x0185, B:53:0x018d, B:55:0x0191, B:56:0x019b, B:58:0x019e, B:62:0x01e6, B:65:0x01f7, B:67:0x0250, B:69:0x02a5, B:71:0x02ac, B:77:0x02ea, B:81:0x0320, B:85:0x0341, B:87:0x0345, B:90:0x0363, B:91:0x0379, B:76:0x02ce, B:94:0x039c, B:95:0x03a1, B:96:0x03a2, B:101:0x03fd, B:16:0x004e, B:19:0x006a, B:22:0x0080, B:26:0x008e, B:27:0x00b4, B:29:0x00be, B:31:0x00d0, B:33:0x00d8, B:39:0x00fd, B:41:0x0101, B:42:0x010a, B:44:0x0139, B:46:0x0157, B:37:0x00e0), top: B:109:0x0013, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x019e A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:9:0x0029, B:48:0x0167, B:51:0x0185, B:53:0x018d, B:55:0x0191, B:56:0x019b, B:58:0x019e, B:62:0x01e6, B:65:0x01f7, B:67:0x0250, B:69:0x02a5, B:71:0x02ac, B:77:0x02ea, B:81:0x0320, B:85:0x0341, B:87:0x0345, B:90:0x0363, B:91:0x0379, B:76:0x02ce, B:94:0x039c, B:95:0x03a1, B:96:0x03a2, B:101:0x03fd, B:16:0x004e, B:19:0x006a, B:22:0x0080, B:26:0x008e, B:27:0x00b4, B:29:0x00be, B:31:0x00d0, B:33:0x00d8, B:39:0x00fd, B:41:0x0101, B:42:0x010a, B:44:0x0139, B:46:0x0157, B:37:0x00e0), top: B:109:0x0013, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01f6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01f7 A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:9:0x0029, B:48:0x0167, B:51:0x0185, B:53:0x018d, B:55:0x0191, B:56:0x019b, B:58:0x019e, B:62:0x01e6, B:65:0x01f7, B:67:0x0250, B:69:0x02a5, B:71:0x02ac, B:77:0x02ea, B:81:0x0320, B:85:0x0341, B:87:0x0345, B:90:0x0363, B:91:0x0379, B:76:0x02ce, B:94:0x039c, B:95:0x03a1, B:96:0x03a2, B:101:0x03fd, B:16:0x004e, B:19:0x006a, B:22:0x0080, B:26:0x008e, B:27:0x00b4, B:29:0x00be, B:31:0x00d0, B:33:0x00d8, B:39:0x00fd, B:41:0x0101, B:42:0x010a, B:44:0x0139, B:46:0x0157, B:37:0x00e0), top: B:109:0x0013, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0345 A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:9:0x0029, B:48:0x0167, B:51:0x0185, B:53:0x018d, B:55:0x0191, B:56:0x019b, B:58:0x019e, B:62:0x01e6, B:65:0x01f7, B:67:0x0250, B:69:0x02a5, B:71:0x02ac, B:77:0x02ea, B:81:0x0320, B:85:0x0341, B:87:0x0345, B:90:0x0363, B:91:0x0379, B:76:0x02ce, B:94:0x039c, B:95:0x03a1, B:96:0x03a2, B:101:0x03fd, B:16:0x004e, B:19:0x006a, B:22:0x0080, B:26:0x008e, B:27:0x00b4, B:29:0x00be, B:31:0x00d0, B:33:0x00d8, B:39:0x00fd, B:41:0x0101, B:42:0x010a, B:44:0x0139, B:46:0x0157, B:37:0x00e0), top: B:109:0x0013, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x035c  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0363 A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:9:0x0029, B:48:0x0167, B:51:0x0185, B:53:0x018d, B:55:0x0191, B:56:0x019b, B:58:0x019e, B:62:0x01e6, B:65:0x01f7, B:67:0x0250, B:69:0x02a5, B:71:0x02ac, B:77:0x02ea, B:81:0x0320, B:85:0x0341, B:87:0x0345, B:90:0x0363, B:91:0x0379, B:76:0x02ce, B:94:0x039c, B:95:0x03a1, B:96:0x03a2, B:101:0x03fd, B:16:0x004e, B:19:0x006a, B:22:0x0080, B:26:0x008e, B:27:0x00b4, B:29:0x00be, B:31:0x00d0, B:33:0x00d8, B:39:0x00fd, B:41:0x0101, B:42:0x010a, B:44:0x0139, B:46:0x0157, B:37:0x00e0), top: B:109:0x0013, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0379 A[Catch: Exception -> 0x0034, TryCatch #1 {Exception -> 0x0034, blocks: (B:9:0x0029, B:48:0x0167, B:51:0x0185, B:53:0x018d, B:55:0x0191, B:56:0x019b, B:58:0x019e, B:62:0x01e6, B:65:0x01f7, B:67:0x0250, B:69:0x02a5, B:71:0x02ac, B:77:0x02ea, B:81:0x0320, B:85:0x0341, B:87:0x0345, B:90:0x0363, B:91:0x0379, B:76:0x02ce, B:94:0x039c, B:95:0x03a1, B:96:0x03a2, B:101:0x03fd, B:16:0x004e, B:19:0x006a, B:22:0x0080, B:26:0x008e, B:27:0x00b4, B:29:0x00be, B:31:0x00d0, B:33:0x00d8, B:39:0x00fd, B:41:0x0101, B:42:0x010a, B:44:0x0139, B:46:0x0157, B:37:0x00e0), top: B:109:0x0013, inners: #0 }] */
        /* JADX WARN: Type inference failed for: r10v13 */
        /* JADX WARN: Type inference failed for: r10v14 */
        /* JADX WARN: Type inference failed for: r10v19 */
        /* JADX WARN: Type inference failed for: r10v2 */
        /* JADX WARN: Type inference failed for: r10v20 */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r10v5 */
        /* JADX WARN: Type inference failed for: r10v9 */
        /* JADX WARN: Type inference failed for: r13v10, types: [int] */
        /* JADX WARN: Type inference failed for: r13v11 */
        /* JADX WARN: Type inference failed for: r13v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x03f5 -> B:100:0x03f6). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r34) {
            /*
                Method dump skipped, instruction units count: 1091
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f56247r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f56248s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f56249t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f56250u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f56252w;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56250u = obj;
            this.f56252w |= Integer.MIN_VALUE;
            return f.this.x(null, null, this);
        }
    }

    public f(o mediaConfig, e0 connectivityService, com.moloco.sdk.internal.error.b errorReportingService, ie.c httpClient) {
        Intrinsics.checkNotNullParameter(mediaConfig, "mediaConfig");
        Intrinsics.checkNotNullParameter(connectivityService, "connectivityService");
        Intrinsics.checkNotNullParameter(errorReportingService, "errorReportingService");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.f56227a = mediaConfig;
        this.f56228b = connectivityService;
        this.f56229c = errorReportingService;
        this.f56230d = httpClient;
        this.f56231e = "ChunkedMediaDownloader";
    }

    public static final long d(r0 delayMillis, int i10) {
        Intrinsics.checkNotNullParameter(delayMillis, "$this$delayMillis");
        return 100L;
    }

    public static final Unit o(long j10, f fVar, int i10, String str, ve.p headers) {
        Intrinsics.checkNotNullParameter(headers, "$this$headers");
        String str2 = "bytes=" + j10 + '-' + Math.min(j10 + ((long) fVar.f56227a.a()), i10);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        String str3 = fVar.f56231e;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Adding ");
        u uVar = u.f106718a;
        sb2.append(uVar.t());
        sb2.append(" header: ");
        sb2.append(str2);
        MolocoLogger.info$default(molocoLogger, str3, sb2.toString(), null, false, 12, null);
        headers.e(uVar.t(), str2);
        if (str != null) {
            MolocoLogger.info$default(molocoLogger, fVar.f56231e, "Adding " + uVar.p() + " header: " + str, null, false, 12, null);
            headers.e(uVar.p(), str);
            MolocoLogger.info$default(molocoLogger, fVar.f56231e, "Adding " + uVar.l() + " header: " + str, null, false, 12, null);
            headers.e(uVar.l(), str);
        }
        return Unit.f93236a;
    }

    public static final Unit p(final f fVar, m0 retry) {
        Intrinsics.checkNotNullParameter(retry, "$this$retry");
        retry.D(10);
        m0.g(retry, false, new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Long.valueOf(f.d((r0) obj, ((Integer) obj2).intValue()));
            }
        }, 1, null);
        retry.v(10, true);
        retry.A(10);
        retry.r(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return f.q(this.f56226b, (t0) obj, (re.d) obj2);
            }
        });
        return Unit.f93236a;
    }

    public static final Unit q(f fVar, t0 modifyRequest, re.d it) {
        Intrinsics.checkNotNullParameter(modifyRequest, "$this$modifyRequest");
        Intrinsics.checkNotNullParameter(it, "it");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, fVar.f56231e, "Retry attempt #" + modifyRequest.b() + " for " + modifyRequest.a().i(), null, false, 12, null);
        return Unit.f93236a;
    }

    public final String C(File file) {
        File fileZ = z(file);
        if (fileZ.exists()) {
            return uf.i.m(fileZ, null, 1, null);
        }
        return null;
    }

    public final String D(File file) {
        File fileE = E(file);
        if (fileE.exists()) {
            return uf.i.m(fileE, null, 1, null);
        }
        return null;
    }

    public final File E(File file) {
        return new File(file.getParent(), file.getName() + ".range");
    }

    public final void F(File file) {
        z(file).delete();
    }

    public final void G(File file) {
        E(file).delete();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a
    public boolean a(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return file.exists() && !E(file).exists();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a
    public boolean b(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return file.exists() && E(file).exists();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a
    public Object c(String str, File file, String str2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar, Continuation continuation) {
        return eg.g.g(com.moloco.sdk.internal.scheduling.c.a().getIo(), new b(str, file, aVar, str2, null), continuation);
    }

    public final m.a h(File file, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar) {
        F(file);
        G(file);
        if (aVar != null) {
            aVar.b(new h.a(file));
        }
        return new m.a.b(file);
    }

    public final m.a i(File file, se.c cVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar) {
        int iE0 = cVar.d().e0();
        if (400 <= iE0 && iE0 < 500) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f56231e, "Failed to fetch media from url: " + se.e.d(cVar).getUrl() + ", status: " + cVar.d(), null, false, 12, null);
            if (aVar != null) {
                aVar.a(new h.b(m.a.AbstractC0696a.e.f56272a));
            }
            return m.a.AbstractC0696a.e.f56272a;
        }
        if (500 > iE0 || iE0 >= 600) {
            return new m.a.b(file);
        }
        MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f56231e, "Failed to fetch media from url: " + se.e.d(cVar).getUrl() + ", status: " + cVar.d(), null, false, 12, null);
        if (aVar != null) {
            aVar.a(new h.b(m.a.AbstractC0696a.h.f56275a));
        }
        return m.a.AbstractC0696a.h.f56275a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(java.io.File r13, se.c r14, kotlin.coroutines.Continuation r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.l(java.io.File, se.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object m(String str, final long j10, final int i10, final String str2, Continuation continuation) {
        ie.c cVar = this.f56230d;
        re.d dVar = new re.d();
        re.f.c(dVar, str);
        p0.v(dVar, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.p(this.f56221b, (m0) obj);
            }
        });
        re.f.b(dVar, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.o(j10, this, i10, str2, (ve.p) obj);
            }
        });
        dVar.o(z.f106771b.b());
        return new se.g(dVar, cVar).b(continuation);
    }

    public final void t(File file, String str) {
        uf.i.p(E(file), str, null, 2, null);
    }

    public final void u(File file, se.c cVar) {
        ve.o headers = cVar.getHeaders();
        u uVar = u.f106718a;
        String str = headers.get(uVar.l());
        if (str != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f56231e, uVar.l() + ": " + str, null, false, 12, null);
            uf.i.p(z(file), str, null, 2, null);
            return;
        }
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, this.f56231e, "No " + uVar.l() + " in header", null, false, 12, null);
        F(file);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        if (r15 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x007e -> B:26:0x0081). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(java.io.File r13, se.c r14, kotlin.coroutines.Continuation r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.c
            if (r0 == 0) goto L13
            r0 = r15
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f$c r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.c) r0
            int r1 = r0.f56252w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56252w = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f$c r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f$c
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f56250u
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f56252w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r13 = r0.f56249t
            io.ktor.utils.io.e r13 = (io.ktor.utils.io.e) r13
            java.lang.Object r14 = r0.f56248s
            java.io.File r14 = (java.io.File) r14
            java.lang.Object r2 = r0.f56247r
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f r2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f) r2
            kotlin.d.b(r15)
            goto L81
        L38:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L40:
            java.lang.Object r13 = r0.f56248s
            java.io.File r13 = (java.io.File) r13
            java.lang.Object r14 = r0.f56247r
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f r14 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f) r14
            kotlin.d.b(r15)
            goto L5d
        L4c:
            kotlin.d.b(r15)
            r0.f56247r = r12
            r0.f56248s = r13
            r0.f56252w = r4
            java.lang.Object r15 = se.e.a(r14, r0)
            if (r15 != r1) goto L5c
            goto L80
        L5c:
            r14 = r12
        L5d:
            io.ktor.utils.io.e r15 = (io.ktor.utils.io.e) r15
            r2 = r14
            r14 = r13
            r13 = r15
        L62:
            boolean r15 = r13.h()
            if (r15 != 0) goto Lb7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o r15 = r2.f56227a
            int r15 = r15.a()
            long r4 = (long) r15
            r6 = 2
            long r4 = r4 * r6
            r0.f56247r = r2
            r0.f56248s = r14
            r0.f56249t = r13
            r0.f56252w = r3
            java.lang.Object r15 = io.ktor.utils.io.h.i(r13, r4, r0)
            if (r15 != r1) goto L81
        L80:
            return r1
        L81:
            pg.s r15 = (pg.s) r15
        L83:
            boolean r4 = hf.f.a(r15)
            if (r4 != 0) goto L62
            byte[] r4 = hf.g.a(r15)
            uf.i.d(r14, r4)
            com.moloco.sdk.internal.MolocoLogger r5 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            java.lang.String r6 = r2.f56231e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "dst file length: "
            r4.append(r7)
            long r7 = r14.length()
            r4.append(r7)
            java.lang.String r7 = " bytes"
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            r10 = 12
            r11 = 0
            r8 = 0
            r9 = 0
            com.moloco.sdk.internal.MolocoLogger.info$default(r5, r6, r7, r8, r9, r10, r11)
            goto L83
        Lb7:
            kotlin.Unit r13 = kotlin.Unit.f93236a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.x(java.io.File, se.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final File z(File file) {
        return new File(file.getParent(), file.getName() + ".etag");
    }
}
