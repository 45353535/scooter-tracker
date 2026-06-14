package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.common.base.Function;
import com.google.common.base.Supplier;
import ga.f0;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.exoplayer.i;
import io.bidmachine.media3.exoplayer.image.ImageOutput;
import v9.s1;

/* JADX INFO: loaded from: classes12.dex */
public interface ExoPlayer extends n9.a0 {

    public interface a {
        void onOffloadedPlayback(boolean z10);

        void onSleepingForOffloadChanged(boolean z10);
    }

    public static final class b {
        long A;
        boolean B;
        boolean C;
        u9.h0 D;
        boolean E;
        boolean F;
        String G;
        boolean H;
        r2 I;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f80599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        q9.h f80600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f80601c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Supplier f80602d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Supplier f80603e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Supplier f80604f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Supplier f80605g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Supplier f80606h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Function f80607i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Looper f80608j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f80609k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        n9.c f80610l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f80611m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f80612n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f80613o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f80614p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f80615q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f80616r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f80617s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f80618t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        u9.m0 f80619u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        long f80620v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        long f80621w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        long f80622x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        u9.e0 f80623y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        long f80624z;

        public b(final Context context) {
            this(context, new Supplier() { // from class: u9.v
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.b.a(context);
                }
            }, new Supplier() { // from class: u9.w
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.b.b(context);
                }
            });
        }

        public static /* synthetic */ u9.l0 a(Context context) {
            return new u9.d(context);
        }

        public static /* synthetic */ f0.a b(Context context) {
            return new ga.r(context, new oa.m());
        }

        public static /* synthetic */ ja.w c(Context context) {
            return new ja.n(context);
        }

        public ExoPlayer e() {
            q9.a.g(!this.E);
            this.E = true;
            return new v0(this, null);
        }

        private b(final Context context, Supplier supplier, Supplier supplier2) {
            this(context, supplier, supplier2, new Supplier() { // from class: u9.x
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ExoPlayer.b.c(context);
                }
            }, new Supplier() { // from class: u9.y
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return new io.bidmachine.media3.exoplayer.j();
                }
            }, new Supplier() { // from class: u9.z
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return ka.j.k(context);
                }
            }, new Function() { // from class: u9.a0
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return new s1((q9.h) obj);
                }
            });
        }

        private b(Context context, Supplier supplier, Supplier supplier2, Supplier supplier3, Supplier supplier4, Supplier supplier5, Function function) {
            this.f80599a = (Context) q9.a.e(context);
            this.f80602d = supplier;
            this.f80603e = supplier2;
            this.f80604f = supplier3;
            this.f80605g = supplier4;
            this.f80606h = supplier5;
            this.f80607i = function;
            this.f80608j = q9.o0.X();
            this.f80610l = n9.c.f95224g;
            this.f80612n = 0;
            this.f80616r = 1;
            this.f80617s = 0;
            this.f80618t = true;
            this.f80619u = u9.m0.f105320g;
            this.f80620v = 5000L;
            this.f80621w = 15000L;
            this.f80622x = 3000L;
            this.f80623y = new i.b().a();
            this.f80600b = q9.h.f98789a;
            this.f80624z = 500L;
            this.A = 2000L;
            this.C = true;
            this.G = "";
            this.f80609k = -1000;
            this.I = new l();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f80625b = new c(-9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f80626a;

        public c(long j10) {
            this.f80626a = j10;
        }
    }

    void release();

    void setImageOutput(@Nullable ImageOutput imageOutput);
}
