package ec;

import android.content.Context;
import b9.r;
import eg.m1;
import ic.j;
import ic.v;
import java.util.concurrent.atomic.AtomicBoolean;
import jd.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.i;
import pd.x;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f69047a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f69048b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static k f69049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile Function0 f69050d;

    /* JADX INFO: renamed from: ec.a$a, reason: collision with other inner class name */
    static final class C0867a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ qd.a f69051f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0867a(qd.a aVar) {
            super(0);
            this.f69051f = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final qd.a invoke() {
            return this.f69051f;
        }
    }

    private a() {
    }

    public static final Function0 b() {
        return f69050d;
    }

    public static final String c() {
        k kVar = f69049c;
        if (kVar != null) {
            return kVar.getUserAgent();
        }
        return null;
    }

    public static final void f(k kVar) {
        f69049c = kVar;
    }

    public final b a(qd.a mediaFileCacheManager) {
        Intrinsics.checkNotNullParameter(mediaFileCacheManager, "mediaFileCacheManager");
        return new cd.a(new C0867a(mediaFileCacheManager), i.a(m1.b(null, 1, null).plus(x.f98252g.a().f())), j.f74267i.a());
    }

    public final void d(Context context, Function0 mediaFileCacheManagerProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediaFileCacheManagerProvider, "mediaFileCacheManagerProvider");
        if (f69048b.compareAndSet(false, true)) {
            f69050d = mediaFileCacheManagerProvider;
        }
    }

    public final void e(boolean z10) {
        v.e(z10);
        io.bidmachine.iab.mraid.i.g(z10 ? r.a.debug : r.a.none);
    }
}
