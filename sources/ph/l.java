package ph;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f98543a = a.f98545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f98544b = new a.C1165a();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f98545a = new a();

        /* JADX INFO: renamed from: ph.l$a$a, reason: collision with other inner class name */
        private static final class C1165a implements l {
            @Override // ph.l
            public boolean a(int i10, vh.g source, int i11, boolean z10) {
                Intrinsics.checkNotNullParameter(source, "source");
                source.skip(i11);
                return true;
            }

            @Override // ph.l
            public void b(int i10, b errorCode) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            }

            @Override // ph.l
            public boolean onHeaders(int i10, List responseHeaders, boolean z10) {
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // ph.l
            public boolean onRequest(int i10, List requestHeaders) {
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                return true;
            }
        }

        private a() {
        }
    }

    boolean a(int i10, vh.g gVar, int i11, boolean z10);

    void b(int i10, b bVar);

    boolean onHeaders(int i10, List list, boolean z10);

    boolean onRequest(int i10, List list);
}
