package io.bidmachine.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;
import com.google.common.base.Function;
import io.bidmachine.media3.exoplayer.p2;
import q9.f;

/* JADX INFO: loaded from: classes12.dex */
final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f81263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f81264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q9.f f81265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AudioManager f81266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f81267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f81268f;

    public interface b {
        void onStreamTypeChanged(int i10);

        void onStreamVolumeChanged(int i10, boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f81269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f81270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f81271c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f81272d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f81273e;

        public c(int i10, int i11, boolean z10, int i12, int i13) {
            this.f81269a = i10;
            this.f81270b = i11;
            this.f81271c = z10;
            this.f81272d = i12;
            this.f81273e = i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class d extends BroadcastReceiver {
        private d() {
        }

        public static /* synthetic */ void a(d dVar) {
            if (p2.this.f81267e == null) {
                return;
            }
            p2.this.f81265c.f(p2.this.h(((c) p2.this.f81265c.d()).f81269a));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            p2.this.f81265c.e(new Runnable() { // from class: io.bidmachine.media3.exoplayer.q2
                @Override // java.lang.Runnable
                public final void run() {
                    p2.d.a(this.f81278b);
                }
            });
        }
    }

    public p2(Context context, b bVar, final int i10, Looper looper, Looper looper2, q9.h hVar) {
        this.f81263a = context.getApplicationContext();
        this.f81264b = bVar;
        q9.f fVar = new q9.f(new c(i10, 0, false, 0, 0), looper, looper2, hVar, new f.a() { // from class: io.bidmachine.media3.exoplayer.l2
            @Override // q9.f.a
            public final void a(Object obj, Object obj2) {
                this.f81201a.k((p2.c) obj, (p2.c) obj2);
            }
        });
        this.f81265c = fVar;
        fVar.e(new Runnable() { // from class: io.bidmachine.media3.exoplayer.m2
            @Override // java.lang.Runnable
            public final void run() {
                p2.c(this.f81221b, i10);
            }
        });
    }

    public static /* synthetic */ c a(c cVar) {
        return cVar;
    }

    public static /* synthetic */ void c(p2 p2Var, int i10) {
        p2Var.f81266d = (AudioManager) q9.a.i((AudioManager) p2Var.f81263a.getSystemService("audio"));
        d dVar = new d();
        try {
            p2Var.f81263a.registerReceiver(dVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            p2Var.f81267e = dVar;
        } catch (RuntimeException e10) {
            q9.u.i("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
        p2Var.f81265c.f(p2Var.h(i10));
    }

    public static /* synthetic */ c d(p2 p2Var, c cVar) {
        d dVar = p2Var.f81267e;
        if (dVar != null) {
            try {
                p2Var.f81263a.unregisterReceiver(dVar);
            } catch (RuntimeException e10) {
                q9.u.i("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            p2Var.f81267e = null;
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c h(int i10) {
        q9.a.e(this.f81266d);
        return new c(i10, o9.d.f(this.f81266d, i10), o9.d.g(this.f81266d, i10), o9.d.e(this.f81266d, i10), o9.d.d(this.f81266d, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(c cVar, c cVar2) {
        boolean z10 = cVar.f81271c;
        if (!z10 && cVar2.f81271c) {
            this.f81268f = cVar.f81270b;
        }
        int i10 = cVar.f81270b;
        int i11 = cVar2.f81270b;
        if (i10 != i11 || z10 != cVar2.f81271c) {
            this.f81264b.onStreamVolumeChanged(i11, cVar2.f81271c);
        }
        int i12 = cVar.f81269a;
        int i13 = cVar2.f81269a;
        if (i12 == i13 && cVar.f81272d == cVar2.f81272d && cVar.f81273e == cVar2.f81273e) {
            return;
        }
        this.f81264b.onStreamTypeChanged(i13);
    }

    public int i() {
        return ((c) this.f81265c.d()).f81273e;
    }

    public int j() {
        return ((c) this.f81265c.d()).f81272d;
    }

    public void l() {
        this.f81265c.g(new Function() { // from class: io.bidmachine.media3.exoplayer.n2
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return p2.a((p2.c) obj);
            }
        }, new Function() { // from class: io.bidmachine.media3.exoplayer.o2
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return p2.d(this.f81242b, (p2.c) obj);
            }
        });
    }
}
