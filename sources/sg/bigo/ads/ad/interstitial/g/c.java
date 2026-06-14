package sg.bigo.ads.ad.interstitial.g;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<String, Integer> f101320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map<String, Integer> f101321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List<String> f101322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f101323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f101324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Paint f101325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint f101326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f101327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f101328i;

    public c(Context context) {
        this(context, (byte) 0);
    }

    private void a() {
        Paint paint;
        int i10;
        if (this.f101324e == 1) {
            this.f101325f.setColor(-1);
            paint = this.f101326g;
            i10 = 872415231;
        } else {
            this.f101325f.setColor(ViewCompat.MEASURED_STATE_MASK);
            paint = this.f101326g;
            i10 = 855638016;
        }
        paint.setColor(i10);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f101320a.isEmpty()) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int i10 = this.f101327h;
        int i11 = (height - i10) / 2;
        int i12 = i10 + i11;
        int size = this.f101320a.size();
        if (size == 0) {
            return;
        }
        int i13 = (width - ((size - 1) * this.f101328i)) / size;
        int i14 = 0;
        for (String str : this.f101322c) {
            Integer num = this.f101320a.get(str);
            Integer num2 = this.f101321b.get(str);
            if (num != null && num2 != null && num.intValue() > 0) {
                int i15 = (this.f101328i + i13) * i14;
                int i16 = 0;
                while (i16 < num.intValue()) {
                    canvas.drawRect((i16 * (i13 / num.intValue())) + i15, i11, i16 == num.intValue() + (-1) ? i15 + i13 : r11 + r12, i12, i16 < num2.intValue() ? this.f101325f : this.f101326g);
                    i16++;
                }
                i14++;
            }
        }
    }

    public final void setStyleType$2563266(int i10) {
        this.f101324e = i10;
        a();
        invalidate();
    }

    public final void setTotalNum(Map<String, Integer> map) {
        this.f101320a.clear();
        this.f101321b.clear();
        this.f101322c.clear();
        this.f101323d = null;
        if (map != null) {
            this.f101320a.putAll(map);
            this.f101322c.addAll(map.keySet());
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                this.f101321b.put(it.next(), 0);
            }
        }
    }

    private c(Context context, byte b10) {
        this(context, (char) 0);
    }

    private c(Context context, char c10) {
        super(context, null, 0);
        this.f101320a = new HashMap();
        this.f101321b = new HashMap();
        this.f101322c = new ArrayList();
        this.f101323d = null;
        this.f101324e = 1;
        this.f101327h = sg.bigo.ads.common.utils.e.a(context, 2);
        this.f101328i = sg.bigo.ads.common.utils.e.a(context, 8);
        this.f101325f = new Paint(1);
        this.f101326g = new Paint(1);
        a();
    }
}
