package io.sentry.android.replay.util;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.view.ViewCompat;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Drawable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f83153e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f83154f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f83155g = Color.argb(32, 255, 20, 20);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f83156h = Color.argb(128, 255, 20, 20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f83157a = new Paint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f83158b = 6.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f83159c = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f83160d = CollectionsKt.emptyList();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void a(Canvas canvas, String str, float f10, float f11) {
        this.f83157a.setColor(-1);
        this.f83157a.setStyle(Paint.Style.STROKE);
        canvas.drawText(str, f10, f11, this.f83157a);
        this.f83157a.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f83157a.setStyle(Paint.Style.FILL);
        canvas.drawText(str, f10, f11, this.f83157a);
    }

    public final void b(List masks) {
        Intrinsics.checkNotNullParameter(masks, "masks");
        this.f83160d = masks;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f83157a.setTextSize(32.0f);
        this.f83157a.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f83157a.setStrokeWidth(6.0f);
        for (Rect rect : this.f83160d) {
            this.f83157a.setColor(f83155g);
            this.f83157a.setStyle(Paint.Style.FILL);
            canvas.drawRect(rect, this.f83157a);
            this.f83157a.setColor(f83156h);
            this.f83157a.setStyle(Paint.Style.STROKE);
            canvas.drawRect(rect, this.f83157a);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(rect.left);
            sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb2.append(rect.top);
            String string = sb2.toString();
            this.f83157a.getTextBounds(string, 0, string.length(), this.f83159c);
            a(canvas, string, rect.left, rect.top);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(rect.right);
            sb3.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb3.append(rect.bottom);
            String string2 = sb3.toString();
            this.f83157a.getTextBounds(string2, 0, string2.length(), this.f83159c);
            a(canvas, string2, rect.right - this.f83159c.width(), rect.bottom + this.f83159c.height());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
