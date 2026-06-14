package com.my.target;

import android.view.ViewGroup;
import com.my.target.dc;
import com.my.target.instreamads.postview.InstreamAdPostViewPlayer;
import com.my.target.instreamads.postview.models.PostViewData;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public final class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f59559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InstreamAdPostViewPlayer f59560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f59561c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f59562d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f59563e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f59564f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f59565g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f59566h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public WeakReference f59567i = new WeakReference(null);

    public class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u8 f59568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f59569b;

        public a(u8 u8Var, int i10) {
            this.f59568a = u8Var;
            this.f59569b = i10;
        }

        @Override // com.my.target.e3.b.a
        public void a(int i10) {
            e3.this.a(i10, this.f59569b);
        }

        @Override // com.my.target.e3.b.a
        public void b() {
            e3.this.f59566h = true;
        }

        @Override // com.my.target.e3.b.a
        public void c() {
            e3.this.a(this.f59568a);
        }

        @Override // com.my.target.e3.b.a
        public void a() {
            e3.this.i();
        }
    }

    public interface c {
        void a();

        void b();

        void onPostViewStart();
    }

    public e3(c cVar) {
        this.f59559a = cVar;
    }

    public void a(InstreamAdPostViewPlayer instreamAdPostViewPlayer) {
        this.f59560b = instreamAdPostViewPlayer;
    }

    public InstreamAdPostViewPlayer b() {
        return this.f59560b;
    }

    public boolean c() {
        return this.f59561c == 2;
    }

    public boolean d() {
        return this.f59561c == 1;
    }

    public boolean e() {
        return d() || c();
    }

    public boolean f() {
        return b() != null && this.f59561c == 0;
    }

    public final /* synthetic */ void g() {
        dc dcVar = (dc) this.f59567i.get();
        if (dcVar != null) {
            this.f59567i.clear();
            dcVar.setStateChangedListener(null);
            ViewGroup viewGroup = (ViewGroup) dcVar.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(dcVar);
                gb.b("InstreamAdPostViewCtrl", "Viewability view is removed");
            } else {
                gb.b("InstreamAdPostViewCtrl", "Viewability view doesn't have any parent. Skip removing");
            }
        }
        InstreamAdPostViewPlayer instreamAdPostViewPlayer = this.f59560b;
        if (instreamAdPostViewPlayer != null) {
            instreamAdPostViewPlayer.hide();
            gb.b("InstreamAdPostViewCtrl", "Player is hidden");
        }
        if (this.f59566h) {
            this.f59559a.a();
            gb.b("InstreamAdPostViewCtrl", "PostView is canceled");
        } else {
            this.f59559a.b();
            gb.b("InstreamAdPostViewCtrl", "PostView is completed");
        }
        this.f59566h = false;
        this.f59565g = false;
        this.f59561c = 0;
    }

    public void h() {
        b bVar;
        if (!d() || !this.f59562d || (bVar = this.f59563e) == null || this.f59560b == null) {
            return;
        }
        bVar.e();
        this.f59560b.pause();
        this.f59561c = 2;
        gb.b("InstreamAdPostViewCtrl", "Player is paused");
    }

    public void i() {
        if (this.f59564f) {
            InstreamAdPostViewPlayer instreamAdPostViewPlayer = this.f59560b;
            if (instreamAdPostViewPlayer == null) {
                gb.b("InstreamAdPostViewCtrl", "PostView couldn't complete because player is null");
                return;
            }
            instreamAdPostViewPlayer.getView().post(new Runnable() { // from class: k5.f0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86027b.g();
                }
            });
        }
        this.f59565g = true;
    }

    public void j() {
        b bVar;
        if (!c() || (bVar = this.f59563e) == null || this.f59560b == null || !bVar.c()) {
            return;
        }
        this.f59563e.f();
        this.f59560b.resume();
        this.f59561c = 1;
        gb.b("InstreamAdPostViewCtrl", "Player is resumed");
    }

    public void a() {
        if (this.f59563e != null && e()) {
            this.f59563e.a();
            this.f59563e = null;
            gb.b("InstreamAdPostViewCtrl", "Player is cancelled");
        }
    }

    public void b(u8 u8Var) {
        if (f()) {
            this.f59562d = u8Var.d();
            int iB = (int) (u8Var.b() * 1000.0d);
            if (iB == 0) {
                gb.b("InstreamAdPostViewCtrl", "Duration of PostViewInfo is 0. Skip playing.");
                return;
            }
            if (e()) {
                gb.b("InstreamAdPostViewCtrl", "Show was called while player is still playing");
                a();
            }
            this.f59564f = true;
            b bVar = new b(new a(u8Var, iB));
            this.f59563e = bVar;
            bVar.a(iB);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f59572b;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Runnable f59577g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u9 f59571a = u9.a(100);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f59573c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f59574d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f59575e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f59576f = false;

        public interface a {
            void a();

            void a(int i10);

            void b();

            void c();
        }

        public b(a aVar) {
            this.f59572b = aVar;
        }

        public void a(int i10) {
            this.f59574d = i10;
            this.f59575e = false;
            this.f59576f = false;
            this.f59572b.c();
            g();
        }

        public void b() {
            this.f59573c = 0;
            this.f59574d = 0;
            h();
            this.f59572b.a();
        }

        public boolean c() {
            return this.f59575e;
        }

        public final /* synthetic */ void d() {
            if (this.f59575e || this.f59576f) {
                return;
            }
            int i10 = this.f59573c;
            int i11 = this.f59574d;
            if (i10 >= i11) {
                this.f59572b.a(i11);
                b();
            } else {
                this.f59572b.a(i10);
                this.f59573c += 100;
            }
        }

        public void e() {
            this.f59575e = true;
            h();
        }

        public void f() {
            if (this.f59575e) {
                this.f59575e = false;
                g();
            }
        }

        public final void g() {
            h();
            Runnable runnable = new Runnable() { // from class: k5.h0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f86044b.d();
                }
            };
            this.f59577g = runnable;
            this.f59571a.a(runnable);
        }

        public final void h() {
            Runnable runnable = this.f59577g;
            if (runnable != null) {
                this.f59571a.b(runnable);
            }
            this.f59577g = null;
        }

        public void a() {
            this.f59576f = true;
            this.f59572b.b();
            b();
        }
    }

    public void a(u8 u8Var) {
        InstreamAdPostViewPlayer instreamAdPostViewPlayer = this.f59560b;
        if (instreamAdPostViewPlayer != null) {
            instreamAdPostViewPlayer.show(PostViewData.a(u8Var.a(), u8Var.e(), u8Var.b(), u8Var.c()));
            gb.b("InstreamAdPostViewCtrl", "Player is shown");
            dc dcVar = new dc(this.f59560b.getView().getContext());
            this.f59567i.clear();
            this.f59567i = new WeakReference(dcVar);
            kb.b(dcVar, "viewability_view");
            dcVar.setStateChangedListener(new dc.a() { // from class: k5.g0
                @Override // com.my.target.dc.a
                public final void a(boolean z10) {
                    this.f86038a.a(z10);
                }
            });
            this.f59560b.getView().addView(dcVar);
            gb.b("InstreamAdPostViewCtrl", "ViewbilityView added");
        }
        this.f59559a.onPostViewStart();
        this.f59561c = 1;
    }

    public void a(int i10, int i11) {
        InstreamAdPostViewPlayer instreamAdPostViewPlayer = this.f59560b;
        if (instreamAdPostViewPlayer != null) {
            instreamAdPostViewPlayer.updateProgress(i10, i11);
        }
    }

    public final void a(boolean z10) {
        this.f59564f = z10;
        if (this.f59562d) {
            if (z10) {
                j();
                return;
            } else {
                h();
                return;
            }
        }
        if (this.f59565g && z10) {
            i();
        }
    }
}
