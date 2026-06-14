package yb;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f118892g = new a(-1, ViewCompat.MEASURED_STATE_MASK, 0, 0, -1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f118893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f118894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f118895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f118896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f118897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Typeface f118898f;

    public a(int i10, int i11, int i12, int i13, int i14, Typeface typeface) {
        this.f118893a = i10;
        this.f118894b = i11;
        this.f118895c = i12;
        this.f118896d = i13;
        this.f118897e = i14;
        this.f118898f = typeface;
    }

    public static a a(CaptioningManager.CaptionStyle captionStyle) {
        return new a(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f118892g.f118893a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f118892g.f118894b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f118892g.f118895c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f118892g.f118896d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f118892g.f118897e, captionStyle.getTypeface());
    }
}
