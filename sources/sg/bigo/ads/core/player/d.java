package sg.bigo.ads.core.player;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import sg.bigo.ads.common.aa.b;
import sg.bigo.ads.core.player.b.f;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f104690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    final Handler f104691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<WeakReference<View>> f104692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f104693d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f104695a = new d(0);
    }

    private d() {
        this.f104690a = false;
        this.f104691b = new Handler(Looper.getMainLooper());
        this.f104692c = new ArrayList<>();
        this.f104693d = new Runnable() { // from class: sg.bigo.ads.core.player.d.1
            @Override // java.lang.Runnable
            public final void run() {
                if (d.this.a()) {
                    d.this.f104691b.postDelayed(this, 500L);
                }
            }
        };
    }

    private synchronized void b() {
        c();
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayerManager", "startCheckTask called");
        this.f104691b.post(this.f104693d);
    }

    private synchronized void c() {
        sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayerManager", "removeCheckTask called");
        this.f104691b.removeCallbacksAndMessages(null);
        a();
    }

    @Override // sg.bigo.ads.common.aa.b.a
    public final void a(int i10) {
        if (i10 == 1) {
            b();
        }
    }

    /* synthetic */ d(byte b10) {
        this();
    }

    public final synchronized void a(@NonNull f fVar) {
        try {
            Iterator<WeakReference<View>> it = this.f104692c.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view == null) {
                    it.remove();
                } else if (view == fVar) {
                    sg.bigo.ads.common.t.a.b("VideoPlayerManager", "register playerView exist already");
                    return;
                }
            }
            this.f104692c.add(new WeakReference<>(fVar));
            sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayerManager", "register playerView, size = " + this.f104692c.size());
            b();
            if (!this.f104690a) {
                this.f104690a = true;
                sg.bigo.ads.common.aa.b.a(fVar.getContext().getApplicationContext(), this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(@NonNull f fVar) {
        try {
            Iterator<WeakReference<View>> it = this.f104692c.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    if (view == fVar) {
                        fVar.s();
                    }
                }
                it.remove();
            }
            sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayerManager", "unregister player, size = " + this.f104692c.size());
            if (this.f104692c.isEmpty()) {
                c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final synchronized boolean a() {
        f fVar;
        int playStatus;
        try {
            if (this.f104692c.isEmpty()) {
                return false;
            }
            Iterator<WeakReference<View>> it = this.f104692c.iterator();
            View view = null;
            boolean z10 = false;
            int i10 = 0;
            while (it.hasNext()) {
                View view2 = it.next().get();
                if (view2 instanceof f) {
                    z10 = view2.getContext() != null && sg.bigo.ads.common.aa.b.a(view2.getContext().getApplicationContext());
                    float f10 = 0.0f;
                    if (sg.bigo.ads.common.ab.a.a(view2, new Rect())) {
                        float height = view2.getHeight() * 1.0f * view2.getWidth();
                        float fHeight = r6.height() * 1.0f * r6.width();
                        if (height <= 0.0f) {
                            sg.bigo.ads.common.t.a.a(0, 3, "ImpressionChecker", "adView is not visible, width or height is 0");
                        } else {
                            f10 = fHeight / height;
                        }
                    }
                    int i11 = (int) (100.0f * f10);
                    if (i11 < i10 || i11 < 50 || !z10) {
                        ((f) view2).s();
                    } else {
                        if (i11 == i10) {
                            f fVar2 = (f) view;
                            if (fVar2.f104667f) {
                                fVar2.s();
                            }
                        } else {
                            i10 = i11;
                        }
                        view = view2;
                    }
                } else {
                    it.remove();
                    sg.bigo.ads.common.t.a.a(0, 3, "VideoPlayerManager", "playView is recycled, remove it");
                }
            }
            if (view != null && (playStatus = (fVar = (f) view).getPlayStatus()) != 2 && playStatus != 5 && playStatus != 0) {
                fVar.b();
            }
            return z10;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
