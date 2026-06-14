package sg.bigo.ads.ad.interstitial;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.ValueCallback;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.core.n;

/* JADX INFO: loaded from: classes4.dex */
public final class r {
    public static int a(NativeAd nativeAd, int i10) {
        Integer numA = a(nativeAd);
        return numA != null ? numA.intValue() : i10;
    }

    public static int a(NativeAd nativeAd, int i10, boolean[] zArr) {
        int iIntValue;
        boolean z10 = true;
        if (i10 == 2) {
            iIntValue = -14972829;
        } else if (i10 == 3) {
            Integer numA = a(nativeAd);
            if (numA != null) {
                iIntValue = numA.intValue();
            } else {
                z10 = false;
                iIntValue = -16736769;
            }
        } else {
            iIntValue = -16736769;
        }
        a(zArr, z10);
        return iIntValue;
    }

    @LayoutRes
    public static int a(@NonNull sg.bigo.ads.common.p pVar, int i10) {
        sg.bigo.ads.common.t.a.a(0, 3, "interNo6", "layoutStyle:" + i10 + "...materialSize:" + pVar);
        return ((31 == i10 || 32 == i10) && pVar.a()) ? pVar.getWidth() / pVar.getHeight() > 0 ? R.layout.bigo_ad_activity_interstitial_rich_video_land_material_31_32 : 31 == i10 ? R.layout.bigo_ad_activity_interstitial_rich_video_left_material_31 : R.layout.bigo_ad_activity_interstitial_rich_video_right_material_32 : R.layout.bigo_ad_activity_interstitial_native_center;
    }

    public static Bitmap a(Context context, sg.bigo.ads.ad.b.b bVar, f fVar, @NonNull g gVar) {
        return a(context, bVar, fVar, gVar, false);
    }

    public static Bitmap a(Context context, sg.bigo.ads.ad.b.b bVar, f fVar, @NonNull g gVar, boolean z10) {
        if (context == null || gVar == null) {
            return null;
        }
        String creativeId = fVar != null ? fVar.f101207c : "";
        if (bVar != null && sg.bigo.ads.common.utils.q.a((CharSequence) creativeId)) {
            creativeId = bVar.getCreativeId();
        }
        return sg.bigo.ads.common.utils.d.a(context, (sg.bigo.ads.ad.b.e.a(creativeId, 4) * 0.5f) + 3.5f, gVar.f101285f, gVar.f101283d, gVar.f101284e, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static Integer a(NativeAd nativeAd) {
        Integer numI;
        if (!(nativeAd instanceof sg.bigo.ads.ad.b.d) || (numI = ((sg.bigo.ads.ad.b.d) nativeAd).I()) == null) {
            return null;
        }
        return numI;
    }

    @NonNull
    public static sg.bigo.ads.common.p a(sg.bigo.ads.ad.b.b bVar) {
        n.a aVar;
        if (bVar == null) {
            return new sg.bigo.ads.common.p(-1, -1);
        }
        sg.bigo.ads.api.core.m mVarAV = ((sg.bigo.ads.core.a.a) bVar.f()).aV();
        if (mVarAV != null) {
            sg.bigo.ads.common.p pVar = new sg.bigo.ads.common.p(mVarAV.f102207a, mVarAV.f102208b);
            if (pVar.a()) {
                return pVar;
            }
        }
        if (bVar instanceof sg.bigo.ads.ad.b.c) {
            sg.bigo.ads.core.f.a.p pVar2 = ((sg.bigo.ads.ad.b.c) bVar).J;
            if (pVar2 != null) {
                sg.bigo.ads.common.p pVar3 = new sg.bigo.ads.common.p(pVar2.f104273x, pVar2.f104272w);
                if (pVar3.a()) {
                    return pVar3;
                }
            }
            n.c cVarAy = ((sg.bigo.ads.core.a.a) bVar.f()).ay();
            if (cVarAy != null) {
                sg.bigo.ads.common.p pVar4 = new sg.bigo.ads.common.p(cVarAy.a(), cVarAy.b());
                if (pVar4.a()) {
                    return pVar4;
                }
            }
        } else {
            n.a[] aVarArrAx = ((sg.bigo.ads.core.a.a) bVar.f()).ax();
            if (!sg.bigo.ads.common.utils.k.a(aVarArrAx)) {
                for (int i10 = 0; i10 < aVarArrAx.length && (aVar = aVarArrAx[i10]) != null; i10++) {
                    sg.bigo.ads.common.p pVar5 = new sg.bigo.ads.common.p(aVar.a(), aVarArrAx[i10].b());
                    if (pVar5.a()) {
                        return pVar5;
                    }
                }
            }
        }
        return new sg.bigo.ads.common.p(-1, -1);
    }

    public static void a(int i10, AdCountDownButton adCountDownButton) {
        int i11;
        boolean z10;
        if (adCountDownButton == null) {
            return;
        }
        if (i10 != 2) {
            z10 = false;
            i11 = i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 6 ? -1 : R.drawable.bigo_ad_ic_close5 : R.drawable.bigo_ad_ic_close4 : R.drawable.bigo_ad_ic_close3 : R.drawable.bigo_ad_ic_close;
        } else {
            i11 = R.drawable.bigo_ad_ic_close3;
            z10 = true;
        }
        if (i11 == -1) {
            adCountDownButton.a(R.layout.bigo_ad_item_inter_default_countdown_bg);
            return;
        }
        adCountDownButton.a(R.layout.bigo_ad_item_inter_countdown_bg);
        adCountDownButton.setCloseImageResource(i11);
        if (!adCountDownButton.f100519c) {
            adCountDownButton.b(z10);
        }
        if (i10 != 2) {
            adCountDownButton.setShowCloseButtonInCountdown(true);
        }
    }

    public static void a(final sg.bigo.ads.ad.b.b bVar, final ValueCallback<Bitmap> valueCallback) {
        if (bVar == null) {
            return;
        }
        sg.bigo.ads.core.a.a aVar = (sg.bigo.ads.core.a.a) bVar.f();
        if (!aVar.aR()) {
            String strAT = aVar.aT();
            if (sg.bigo.ads.common.utils.q.a((CharSequence) strAT)) {
                valueCallback.onReceiveValue(null);
                return;
            } else {
                sg.bigo.ads.common.p.e.a(bVar.f100335b.f102178e, strAT, aVar.al(), new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.interstitial.r.4
                    @Override // sg.bigo.ads.common.p.g
                    public final void a(int i10, @NonNull String str, String str2) {
                        valueCallback.onReceiveValue(null);
                    }

                    @Override // sg.bigo.ads.common.p.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar) {
                        valueCallback.onReceiveValue(bitmap);
                    }
                });
                return;
            }
        }
        String strB = sg.bigo.ads.common.o.b(bVar.f100335b.f102178e, aVar.aN());
        if (sg.bigo.ads.common.utils.q.a((CharSequence) strB)) {
            valueCallback.onReceiveValue(null);
        } else {
            final String path = Uri.parse(strB).getPath();
            sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.r.3
                @Override // java.lang.Runnable
                public final void run() {
                    valueCallback.onReceiveValue(sg.bigo.ads.common.utils.d.a(Uri.parse(path).getPath(), bVar.f100335b.f102178e));
                }
            });
        }
    }

    private static void a(boolean[] zArr, boolean z10) {
        if (sg.bigo.ads.common.utils.k.a(zArr)) {
            return;
        }
        zArr[0] = z10;
    }
}
