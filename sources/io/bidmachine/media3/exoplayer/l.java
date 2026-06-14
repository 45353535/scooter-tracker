package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Handler;
import android.os.Looper;
import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.exoplayer.l;
import io.bidmachine.media3.exoplayer.r2;
import j$.util.Objects;
import java.util.Iterator;
import java.util.concurrent.Executor;
import q9.f;

/* JADX INFO: loaded from: classes12.dex */
final class l implements r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r2 f81182a;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b implements r2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AudioManager f81183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private AudioDeviceCallback f81184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private q9.f f81185c;

        class a extends AudioDeviceCallback {
            a() {
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                b.this.f81185c.f(Boolean.valueOf(b.this.h()));
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                b.this.f81185c.f(Boolean.valueOf(b.this.h()));
            }
        }

        private b() {
        }

        public static /* synthetic */ void d(b bVar) {
            AudioManager audioManager = bVar.f81183a;
            if (audioManager != null) {
                audioManager.unregisterAudioDeviceCallback((AudioDeviceCallback) q9.a.e(bVar.f81184b));
            }
        }

        public static /* synthetic */ void e(b bVar, Context context) {
            AudioManager audioManager;
            q9.a.e(bVar.f81185c);
            if (q9.o0.L0(context) && (audioManager = (AudioManager) context.getSystemService("audio")) != null) {
                bVar.f81183a = audioManager;
                a aVar = bVar.new a();
                bVar.f81184b = aVar;
                audioManager.registerAudioDeviceCallback(aVar, new Handler((Looper) q9.a.e(Looper.myLooper())));
                bVar.f81185c.f(Boolean.valueOf(bVar.h()));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean h() {
            for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) q9.a.i(this.f81183a)).getDevices(2)) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i10 = q9.o0.f98837a;
                if (i10 >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (i10 >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (i10 >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (i10 >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }

        @Override // io.bidmachine.media3.exoplayer.r2
        public boolean a() {
            q9.f fVar = this.f81185c;
            if (fVar == null) {
                return true;
            }
            return ((Boolean) fVar.d()).booleanValue();
        }

        @Override // io.bidmachine.media3.exoplayer.r2
        public void b(final r2.a aVar, final Context context, Looper looper, Looper looper2, q9.h hVar) {
            q9.f fVar = new q9.f(Boolean.TRUE, looper2, looper, hVar, new f.a() { // from class: io.bidmachine.media3.exoplayer.m
                @Override // q9.f.a
                public final void a(Object obj, Object obj2) {
                    aVar.a(((Boolean) obj2).booleanValue());
                }
            });
            this.f81185c = fVar;
            fVar.e(new Runnable() { // from class: io.bidmachine.media3.exoplayer.n
                @Override // java.lang.Runnable
                public final void run() {
                    l.b.e(this.f81223b, context);
                }
            });
        }

        @Override // io.bidmachine.media3.exoplayer.r2
        public void disable() {
            ((q9.f) q9.a.e(this.f81185c)).e(new Runnable() { // from class: io.bidmachine.media3.exoplayer.o
                @Override // java.lang.Runnable
                public final void run() {
                    l.b.d(this.f81237b);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c implements r2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final RouteDiscoveryPreference f81187e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MediaRouter2 f81188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MediaRouter2$RouteCallback f81189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private MediaRouter2$ControllerCallback f81190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private q9.f f81191d;

        class a extends MediaRouter2$RouteCallback {
            a() {
            }
        }

        class b extends MediaRouter2$ControllerCallback {
            b() {
            }

            public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
                c.this.f81191d.f(Boolean.valueOf(c.j(c.this.f81188a)));
            }
        }

        static {
            com.google.android.gms.internal.ads.j1.a();
            f81187e = com.google.android.gms.internal.ads.i1.a(ImmutableList.of(), false).build();
        }

        private c() {
        }

        public static /* synthetic */ void d(c cVar) {
            u9.m.a(q9.a.e(cVar.f81188a)).unregisterControllerCallback(u9.f.a(q9.a.e(cVar.f81190c)));
            cVar.f81190c = null;
            cVar.f81188a.unregisterRouteCallback(u9.h.a(q9.a.e(cVar.f81189b)));
        }

        public static /* synthetic */ void e(c cVar, Context context) {
            q9.a.e(cVar.f81191d);
            cVar.f81188a = MediaRouter2.getInstance(context);
            cVar.f81189b = cVar.new a();
            final q9.f fVar = cVar.f81191d;
            Objects.requireNonNull(fVar);
            Executor executor = new Executor() { // from class: u9.t
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    fVar.e(runnable);
                }
            };
            cVar.f81188a.registerRouteCallback(executor, cVar.f81189b, f81187e);
            b bVar = cVar.new b();
            cVar.f81190c = bVar;
            cVar.f81188a.registerControllerCallback(executor, bVar);
            cVar.f81191d.f(Boolean.valueOf(j(cVar.f81188a)));
        }

        private static boolean i(MediaRoute2Info mediaRoute2Info, int i10, boolean z10) {
            int suitabilityStatus = mediaRoute2Info.getSuitabilityStatus();
            return suitabilityStatus == 1 ? (i10 == 1 || i10 == 2) && z10 : suitabilityStatus == 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean j(MediaRouter2 mediaRouter2) {
            int transferReason = u9.m.a(q9.a.e(mediaRouter2)).getSystemController().getRoutingSessionInfo().getTransferReason();
            boolean zWasTransferInitiatedBySelf = mediaRouter2.getSystemController().wasTransferInitiatedBySelf();
            Iterator it = mediaRouter2.getSystemController().getSelectedRoutes().iterator();
            while (it.hasNext()) {
                if (i(u9.s.a(it.next()), transferReason, zWasTransferInitiatedBySelf)) {
                    return true;
                }
            }
            return false;
        }

        @Override // io.bidmachine.media3.exoplayer.r2
        public boolean a() {
            q9.f fVar = this.f81191d;
            if (fVar == null) {
                return true;
            }
            return ((Boolean) fVar.d()).booleanValue();
        }

        @Override // io.bidmachine.media3.exoplayer.r2
        public void b(final r2.a aVar, final Context context, Looper looper, Looper looper2, q9.h hVar) {
            q9.f fVar = new q9.f(Boolean.TRUE, looper2, looper, hVar, new f.a() { // from class: io.bidmachine.media3.exoplayer.p
                @Override // q9.f.a
                public final void a(Object obj, Object obj2) {
                    aVar.a(((Boolean) obj2).booleanValue());
                }
            });
            this.f81191d = fVar;
            fVar.e(new Runnable() { // from class: io.bidmachine.media3.exoplayer.q
                @Override // java.lang.Runnable
                public final void run() {
                    l.c.e(this.f81275b, context);
                }
            });
        }

        @Override // io.bidmachine.media3.exoplayer.r2
        public void disable() {
            ((q9.f) q9.a.i(this.f81191d)).e(new Runnable() { // from class: io.bidmachine.media3.exoplayer.r
                @Override // java.lang.Runnable
                public final void run() {
                    l.c.d(this.f81279b);
                }
            });
        }
    }

    public l() {
        int i10 = q9.o0.f98837a;
        if (i10 >= 35) {
            this.f81182a = new c();
        } else if (i10 >= 23) {
            this.f81182a = new b();
        } else {
            this.f81182a = null;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.r2
    public boolean a() {
        r2 r2Var = this.f81182a;
        return r2Var == null || r2Var.a();
    }

    @Override // io.bidmachine.media3.exoplayer.r2
    public void b(r2.a aVar, Context context, Looper looper, Looper looper2, q9.h hVar) {
        r2 r2Var = this.f81182a;
        if (r2Var != null) {
            r2Var.b(aVar, context, looper, looper2, hVar);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.r2
    public void disable() {
        r2 r2Var = this.f81182a;
        if (r2Var != null) {
            r2Var.disable();
        }
    }
}
