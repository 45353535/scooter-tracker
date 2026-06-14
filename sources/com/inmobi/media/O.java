package com.inmobi.media;

import android.graphics.RectF;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class O implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f37466a;

    public O(U u10) {
        this.f37466a = u10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float fHeight;
        E6 e62;
        M mA = U.a(this.f37466a);
        U u10 = this.f37466a;
        u10.getClass();
        ArrayList arrayList = null;
        if (mA == null) {
            e62 = new E6(0.0f, null, null);
        } else {
            RectF rectF = mA.f37324a;
            if (rectF.isEmpty()) {
                e62 = new E6(0.0f, null, null);
            } else {
                float measuredHeight = u10.f37799a.getMeasuredHeight() * u10.f37799a.getMeasuredWidth();
                if (measuredHeight <= 0.0f) {
                    e62 = new E6(0.0f, null, null);
                } else {
                    ArrayList<RectF> arrayList2 = new ArrayList();
                    u10.f37799a.getLocationInWindow(new int[2]);
                    Pair pair = new Pair(Float.valueOf(r7[0]), Float.valueOf(r7[1]));
                    float fFloatValue = ((Number) pair.component1()).floatValue();
                    float fFloatValue2 = ((Number) pair.component2()).floatValue();
                    for (RectF rectF2 : mA.f37325b) {
                        arrayList2.add(new RectF(rectF2.left - fFloatValue, rectF2.top - fFloatValue2, rectF2.right - fFloatValue, rectF2.bottom - fFloatValue2));
                    }
                    ArrayList<RectF> arrayList3 = mA.f37325b;
                    if (arrayList3.isEmpty()) {
                        fHeight = 0.0f;
                    } else {
                        fHeight = 0.0f;
                        for (RectF rectF3 : arrayList3) {
                            fHeight += rectF3.height() * rectF3.width();
                        }
                    }
                    float fMin = Math.min(fHeight, measuredHeight);
                    RectF rectF4 = new RectF(rectF);
                    float fWidth = rectF4.width();
                    float fHeight2 = rectF4.height();
                    float fA = F3.a(Math.min((Math.max(0.0f, ((fWidth <= 0.0f || fHeight2 <= 0.0f) ? 0.0f : Math.max(0.0f, fWidth * fHeight2)) - fMin) / measuredHeight) * 100.0f, 100.0f));
                    F6 f62 = new F6(Math.max(0.0f, F3.a(rectF.left / J5.b())), Math.max(0.0f, F3.a(rectF.top / J5.b())), Math.max(0, F3.b(rectF.width() / J5.b())), Math.max(0, F3.b(rectF.height() / J5.b())));
                    if (!arrayList2.isEmpty()) {
                        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                        for (RectF rectF5 : arrayList2) {
                            arrayList4.add(new F6(Math.max(0.0f, F3.a(rectF5.left / J5.b())), Math.max(0.0f, F3.a(rectF5.top / J5.b())), Math.max(0, F3.b(rectF5.width() / J5.b())), Math.max(0, F3.b(F3.b(rectF5.height()) / J5.b()))));
                        }
                        arrayList = new ArrayList(CollectionsKt.sortedWith(arrayList4, new P()));
                    }
                    e62 = new E6(fA, f62, arrayList);
                }
            }
        }
        U u11 = this.f37466a;
        if (Intrinsics.areEqual(e62, u11.f37806h)) {
            return;
        }
        ((Sh) u11.f37802d).a(e62);
        u11.f37806h = e62;
    }
}
