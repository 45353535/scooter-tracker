package sg.bigo.ads.ad.interstitial.d;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.d.a;
import sg.bigo.ads.common.w.b;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends o {
    public p(@NonNull sg.bigo.ads.ad.b.b bVar) {
        super(bVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.o
    protected final boolean L() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.o, sg.bigo.ads.ad.interstitial.d.m
    protected final void b(int i10) {
        super.b(i10);
        if (B() == null) {
            return;
        }
        final View viewFindViewById = this.f100916q.findViewById(R.id.inter_btn_cta_layout);
        final Button button = (Button) this.f100916q.findViewById(R.id.inter_btn_cta);
        if (button == null) {
            return;
        }
        button.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.p.1
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) ((sg.bigo.ads.ad.interstitial.t) p.this).f101734c)) {
                    return;
                }
                a.C1234a c1234aU = p.this.u();
                b.a aVar = new b.a() { // from class: sg.bigo.ads.ad.interstitial.d.p.1.1
                    @Override // sg.bigo.ads.common.w.b.a
                    public final void b(int i11) {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        if (viewFindViewById == null || !p.this.v()) {
                            return;
                        }
                        sg.bigo.ads.ad.interstitial.c.e(viewFindViewById);
                    }
                };
                if (c1234aU.f100945b) {
                    p.this.a(button, aVar);
                } else {
                    sg.bigo.ads.ad.interstitial.d.a(button, c1234aU.f100944a, aVar);
                }
            }
        }, ((long) Math.max(1, i10)) * 1000);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.o, sg.bigo.ads.ad.interstitial.d.m
    protected final void a(sg.bigo.ads.ad.interstitial.q qVar) {
        super.a(qVar);
        ((m) this).f100986y.setVisibility(4);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f100921v.getLayoutParams();
        marginLayoutParams.topMargin = sg.bigo.ads.common.utils.e.a(this.f100921v.getContext(), 0);
        this.f100921v.setLayoutParams(marginLayoutParams);
    }
}
