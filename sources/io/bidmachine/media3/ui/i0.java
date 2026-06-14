package io.bidmachine.media3.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import io.bidmachine.media3.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
final class i0 extends FrameLayout implements SubtitleView.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.bidmachine.media3.ui.a f81741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WebView f81742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f81743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private yb.a f81744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f81745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f81746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f81747h;

    class a extends WebView {
        a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f81749a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f81749a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81749a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81749a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i0(Context context) {
        this(context, null);
    }

    private static int b(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String c(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i10 = b.f81749a[alignment.ordinal()];
        return i10 != 1 ? i10 != 2 ? "center" : "end" : "start";
    }

    private static String d(yb.a aVar) {
        int i10 = aVar.f118896d;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "unset" : o0.G("-0.05em -0.05em 0.15em %s", c.b(aVar.f118897e)) : o0.G("0.06em 0.08em 0.15em %s", c.b(aVar.f118897e)) : o0.G("0.1em 0.12em 0.15em %s", c.b(aVar.f118897e)) : o0.G("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", c.b(aVar.f118897e));
    }

    private String e(int i10, float f10) {
        float f11 = g0.f(i10, f10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return f11 == -3.4028235E38f ? "unset" : o0.G("%.2fpx", Float.valueOf(f11 / getContext().getResources().getDisplayMetrics().density));
    }

    private static String f(int i10) {
        return i10 != 1 ? i10 != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    private static String h(p9.a aVar) {
        float f10 = aVar.f98093q;
        if (f10 == 0.0f) {
            return "";
        }
        int i10 = aVar.f98092p;
        return o0.G("%s(%.2fdeg)", (i10 == 2 || i10 == 1) ? "skewY" : "skewX", Float.valueOf(f10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i() {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.ui.i0.i():void");
    }

    @Override // io.bidmachine.media3.ui.SubtitleView.a
    public void a(List list, yb.a aVar, float f10, int i10, float f11) {
        this.f81744e = aVar;
        this.f81745f = f10;
        this.f81746g = i10;
        this.f81747h = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            p9.a aVar2 = (p9.a) list.get(i11);
            if (aVar2.f98080d != null) {
                arrayList.add(aVar2);
            } else {
                arrayList2.add(aVar2);
            }
        }
        if (!this.f81743d.isEmpty() || !arrayList2.isEmpty()) {
            this.f81743d = arrayList2;
            i();
        }
        this.f81741b.a(arrayList, aVar, f10, i10, f11);
        invalidate();
    }

    public void g() {
        this.f81742c.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!z10 || this.f81743d.isEmpty()) {
            return;
        }
        i();
    }

    public i0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f81743d = Collections.EMPTY_LIST;
        this.f81744e = yb.a.f118892g;
        this.f81745f = 0.0533f;
        this.f81746g = 0;
        this.f81747h = 0.08f;
        io.bidmachine.media3.ui.a aVar = new io.bidmachine.media3.ui.a(context, attributeSet);
        this.f81741b = aVar;
        a aVar2 = new a(context, attributeSet);
        this.f81742c = aVar2;
        aVar2.setBackgroundColor(0);
        addView(aVar);
        addView(aVar2);
    }
}
