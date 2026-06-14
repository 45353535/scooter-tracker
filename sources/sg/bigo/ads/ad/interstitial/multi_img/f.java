package sg.bigo.ads.ad.interstitial.multi_img;

import android.view.View;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements ViewFlow.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final d f101488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Indicator f101489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final a f101490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ValueCallback<Integer> f101491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f101492e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f101493f;

    public f(@NonNull d dVar, @Nullable Indicator indicator, @Nullable a aVar) {
        this.f101488a = dVar;
        this.f101489b = indicator;
        this.f101490c = aVar;
    }

    @Override // sg.bigo.ads.common.view.ViewFlow.c
    public final void a(int i10) {
        Indicator indicator = this.f101489b;
        if (indicator == null || i10 <= 1) {
            return;
        }
        if (indicator.getType() != 1) {
            this.f101489b.setNum(i10);
        } else {
            Indicator indicator2 = this.f101489b;
            indicator2.setLineLength(Indicator.a(i10, indicator2.getDistance(), this.f101489b.getRadius(), this.f101489b.getLengthSelected()));
        }
        this.f101489b.setVisibility(0);
    }

    @Override // sg.bigo.ads.common.view.ViewFlow.c
    public final void a(int i10, int i11) {
        Indicator indicator = this.f101489b;
        if (indicator == null || indicator.getType() != 1) {
            return;
        }
        float fMin = Math.min(1.0f, Math.max(0.0f, (i10 * 1.0f) / i11));
        Indicator indicator2 = this.f101489b;
        if (indicator2.f102874a != fMin) {
            indicator2.f102874a = Math.max(0.0f, Math.min(1.0f, fMin));
            indicator2.invalidate();
        }
    }

    @Override // sg.bigo.ads.common.view.ViewFlow.c
    public final void a(@NonNull View view, int i10) {
        Indicator indicator = this.f101489b;
        if (indicator != null && indicator.getType() != 1) {
            this.f101489b.a(i10);
        }
        this.f101493f = i10;
        a aVar = this.f101490c;
        if (aVar != null) {
            aVar.b(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    @Override // sg.bigo.ads.common.view.ViewFlow.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(@androidx.annotation.NonNull android.view.View r11, int r12, float r13) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.multi_img.f.a(android.view.View, int, float):void");
    }

    public static void a(ViewFlow viewFlow, ValueCallback<Integer> valueCallback) {
        if (viewFlow == null || valueCallback == null) {
            return;
        }
        ViewFlow.c onItemChangeListener = viewFlow.getOnItemChangeListener();
        if (onItemChangeListener instanceof f) {
            ((f) onItemChangeListener).f101491d = valueCallback;
        }
    }

    public static boolean a(ViewFlow viewFlow) {
        ViewFlow.c onItemChangeListener = viewFlow != null ? viewFlow.getOnItemChangeListener() : null;
        if (onItemChangeListener == null || !(onItemChangeListener instanceof f)) {
            return false;
        }
        return ((f) onItemChangeListener).f101492e;
    }
}
