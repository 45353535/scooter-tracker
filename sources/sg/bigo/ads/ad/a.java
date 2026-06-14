package sg.bigo.ads.ad;

import android.content.Context;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.core.f;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: sg.bigo.ads.ad.a$a, reason: collision with other inner class name */
    static class C1203a implements AdBid {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f100120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final sg.bigo.ads.api.core.b f100121b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final sg.bigo.ads.core.e.a.b f100122c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f100123d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f100124e = false;

        public C1203a(f fVar, sg.bigo.ads.api.core.b bVar, sg.bigo.ads.core.e.a.b bVar2) {
            this.f100120a = fVar;
            this.f100121b = bVar;
            this.f100122c = bVar2;
        }

        @Override // sg.bigo.ads.api.AdBid
        public final double getPrice() {
            return this.f100121b.ai();
        }

        @Override // sg.bigo.ads.api.AdBid
        public final void notifyLoss(Double d10, String str, int i10) {
            if (this.f100124e) {
                return;
            }
            this.f100124e = true;
            if (d10 != null) {
                this.f100122c.b("first_price", String.valueOf(d10));
            }
            if (str != null) {
                this.f100122c.b("first_bidder", str);
            }
            this.f100122c.b("loss_reason", String.valueOf(i10));
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.e.a.b.4

                /* JADX INFO: renamed from: a */
                final /* synthetic */ Context f104070a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ boolean f104071b = false;

                public AnonymousClass4(Context context) {
                    context = context;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b.this.b(context, this.f104071b);
                }
            });
            sg.bigo.ads.api.core.b bVar = this.f100121b;
            sg.bigo.ads.core.d.b.a(bVar, bVar.aj(), d10, str, i10);
        }

        @Override // sg.bigo.ads.api.AdBid
        public final void notifyWin(Double d10, String str) {
            if (this.f100123d) {
                return;
            }
            this.f100123d = true;
            if (d10 != null) {
                this.f100122c.b("sec_price", String.valueOf(d10));
            }
            if (str != null) {
                this.f100122c.b("sec_bidder", str);
            }
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.e.a.b.3

                /* JADX INFO: renamed from: a */
                final /* synthetic */ Context f104067a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ boolean f104068b = false;

                public AnonymousClass3(Context context) {
                    context = context;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b.this.a(context, this.f104068b);
                }
            });
            sg.bigo.ads.api.core.b bVar = this.f100121b;
            sg.bigo.ads.core.d.b.a(bVar, bVar.aj(), d10, str);
            f fVar = this.f100120a;
            sg.bigo.ads.core.b.b.a().a("win", sg.bigo.ads.core.b.a.a("win", fVar.f102175b, fVar.f102176c, fVar.f102174a, Integer.valueOf(this.f100121b.aj()), d10 == null ? null : String.valueOf(d10), str, null));
        }
    }
}
