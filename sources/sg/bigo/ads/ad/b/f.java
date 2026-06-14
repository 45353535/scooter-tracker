package sg.bigo.ads.ad.b;

import android.content.Context;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.b.d;
import sg.bigo.ads.core.f.a.p;
import sg.bigo.ads.core.player.b;

/* JADX INFO: loaded from: classes4.dex */
public final class f<T extends Ad> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    T f100236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    Context f100237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    sg.bigo.ads.core.a.a f100238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    p f100239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    d.a<T> f100240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final sg.bigo.ads.core.g.c f100241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    b.a f100242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    sg.bigo.ads.core.player.b.d f100243h;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.b.f$1, reason: invalid class name */
    final class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f100244a;

        AnonymousClass1(int i10) {
            this.f100244a = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = this.f100244a;
            if (i10 != 0) {
                f fVar = f.this;
                fVar.f100240e.a(fVar.f100236a, 1006, i10, "Invalid VPAID media files.");
                return;
            }
            f.this.f100242g = new b.a() { // from class: sg.bigo.ads.ad.b.f.1.1
                @Override // sg.bigo.ads.core.player.b.a
                public final void a() {
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void b(int i11) {
                    f fVar2 = f.this;
                    fVar2.f100240e.a(fVar2.f100236a, 1006, i11, "Failed to download VPAID.");
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void a(int i11) {
                    f fVar2 = f.this;
                    if (fVar2.f100239d == null) {
                        fVar2.f100240e.a(fVar2.f100236a, 1006, 10075, "VPAID video config is empty.");
                    } else {
                        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.b.f.1.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                sg.bigo.ads.api.c.b bVarB = sg.bigo.ads.api.c.b.b(f.this.f100238c.x());
                                bVarB.f102148c = false;
                                f fVar3 = f.this;
                                p pVar = fVar3.f100239d;
                                int i12 = pVar.f104273x;
                                int i13 = pVar.f104272w;
                                f fVar4 = f.this;
                                fVar3.f100243h = new sg.bigo.ads.core.player.b.d(fVar4.f100237b, i12, i13, bVarB, fVar4.f100238c);
                                f fVar5 = f.this;
                                fVar5.f100243h.setOnEventListener(fVar5.f100241f);
                            }
                        });
                    }
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void a(String str, sg.bigo.ads.common.h.a aVar) {
                }
            };
            sg.bigo.ads.core.player.b bVarA = sg.bigo.ads.core.player.b.a();
            f fVar2 = f.this;
            bVarA.a(fVar2.f100237b, fVar2.f100238c, fVar2.f100242g);
        }
    }

    public f(@NonNull Context context, sg.bigo.ads.core.g.c cVar, @NonNull sg.bigo.ads.core.a.a aVar, p pVar, @NonNull d.a<T> aVar2, @NonNull T t10) {
        this.f100237b = context;
        this.f100241f = cVar;
        this.f100238c = aVar;
        this.f100239d = pVar;
        this.f100240e = aVar2;
        this.f100236a = t10;
    }

    public final boolean a() {
        return this.f100238c.at() == 1;
    }
}
