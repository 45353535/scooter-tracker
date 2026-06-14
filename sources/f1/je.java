package f1;

import f1.z2;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class je implements pd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x5 f70215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i8 f70216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q1 f70217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public bf f70218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b1.e f70219e;

    public je(x5 downloader, i8 timeSource, q1 videoRepository, bf adType, b1.e eVar) {
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        Intrinsics.checkNotNullParameter(videoRepository, "videoRepository");
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f70215a = downloader;
        this.f70216b = timeSource;
        this.f70217c = videoRepository;
        this.f70218d = adType;
        this.f70219e = eVar;
    }

    public static final void c(je this$0, i6 appRequest, dg adUnit, t1 adUnitLoaderCallback, ab assetDownloadedCallback, boolean z10) {
        sb sbVarB;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(appRequest, "$appRequest");
        Intrinsics.checkNotNullParameter(adUnit, "$adUnit");
        Intrinsics.checkNotNullParameter(adUnitLoaderCallback, "$adUnitLoaderCallback");
        Intrinsics.checkNotNullParameter(assetDownloadedCallback, "$assetDownloadedCallback");
        if (z10) {
            sbVarB = this$0.b(appRequest, adUnit, adUnitLoaderCallback);
        } else {
            if (z10) {
                throw new lf.m();
            }
            sbVarB = sb.f71092b;
        }
        assetDownloadedCallback.b(appRequest, sbVarB);
    }

    @Override // f1.pd
    public void a(final i6 appRequest, String adTypeTraitsName, final ab assetDownloadedCallback, final t1 adUnitLoaderCallback) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(adTypeTraitsName, "adTypeTraitsName");
        Intrinsics.checkNotNullParameter(assetDownloadedCallback, "assetDownloadedCallback");
        Intrinsics.checkNotNullParameter(adUnitLoaderCallback, "adUnitLoaderCallback");
        final dg dgVarA = appRequest.a();
        if (dgVarA == null) {
            return;
        }
        w9 w9Var = new w9() { // from class: f1.ie
            @Override // f1.w9
            public final void a(boolean z10) {
                je.c(this.f70126a, appRequest, dgVarA, adUnitLoaderCallback, assetDownloadedCallback, z10);
            }
        };
        this.f70215a.g();
        this.f70215a.c(r.f70879e, dgVarA.i(), new AtomicInteger(), (w9) jf.a().b(w9Var), adTypeTraitsName);
    }

    public final sb b(i6 i6Var, dg dgVar, t1 t1Var) {
        t1Var.a(i6Var, z2.a.f71694e);
        if (!dgVar.d()) {
            return sb.f71093c;
        }
        if (!this.f70217c.a(dgVar.b())) {
            this.f70217c.d(dgVar.c(), dgVar.b(), false, null);
        }
        return sb.f71094d;
    }
}
