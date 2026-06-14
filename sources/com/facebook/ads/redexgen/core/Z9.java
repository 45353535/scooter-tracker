package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import java.util.Locale;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class Z9 {
    public static ImageView A00(final C2820dL c2820dL, final C2463Ua c2463Ua, final AbstractC3095hy abstractC3095hy, final InterfaceC2551Xn interfaceC2551Xn, final Z5 z52, Handler handler, Z6 z62) {
        c2820dL.A0F().AAv(z52.name().toLowerCase(Locale.US));
        return abstractC3095hy.A2F() ? new Z4(c2820dL, handler, z62, abstractC3095hy.A1y(), new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Z7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2820dL c2820dL2 = c2820dL;
                C2463Ua c2463Ua2 = c2463Ua;
                InterfaceC2551Xn interfaceC2551Xn2 = interfaceC2551Xn;
                Z5 z53 = z52;
                AbstractC3095hy abstractC3095hy2 = abstractC3095hy;
                Z9.A04(c2820dL2, c2463Ua2, interfaceC2551Xn2, z53, abstractC3095hy2.A25(), abstractC3095hy2.A23());
            }
        }) : new ZA(c2820dL, new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Z8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2820dL c2820dL2 = c2820dL;
                C2463Ua c2463Ua2 = c2463Ua;
                InterfaceC2551Xn interfaceC2551Xn2 = interfaceC2551Xn;
                Z5 z53 = z52;
                AbstractC3095hy abstractC3095hy2 = abstractC3095hy;
                Z9.A04(c2820dL2, c2463Ua2, interfaceC2551Xn2, z53, abstractC3095hy2.A25(), abstractC3095hy2.A23());
            }
        });
    }

    public static ImageView A01(C2820dL c2820dL, C2463Ua c2463Ua, AbstractC3095hy abstractC3095hy, Z5 z52, InterfaceC2551Xn interfaceC2551Xn, Handler handler) {
        return A00(c2820dL, c2463Ua, abstractC3095hy, interfaceC2551Xn, z52, handler, Z6.A03);
    }

    public static void A04(C2820dL c2820dL, C2463Ua c2463Ua, InterfaceC2551Xn interfaceC2551Xn, Z5 z52, String str, N9 n92) {
        if (c2463Ua != null) {
            c2463Ua.A04(UZ.A0A, null);
        }
        c2820dL.A0F().AAu(z52.name().toLowerCase(Locale.US));
        if (O3.A00(c2820dL.A02()).A0O(c2820dL.A02(), true)) {
            interfaceC2551Xn.AAf(str, n92);
        } else {
            if (TextUtils.isEmpty(n92.A00())) {
                return;
            }
            WN.A0O(new WN(), c2820dL, WQ.A00(n92.A00()), str);
        }
    }
}
