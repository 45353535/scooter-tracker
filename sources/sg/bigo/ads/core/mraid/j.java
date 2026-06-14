package sg.bigo.ads.core.mraid;

import android.content.Context;
import android.graphics.Rect;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    final Rect f104500a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    final Rect f104501b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    final Rect f104502c = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    final Rect f104503d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    final Rect f104504e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    final Rect f104505f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    final Rect f104506g = new Rect();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    final Rect f104507h = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    private final Context f104508i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f104509j;

    j(Context context, float f10) {
        this.f104508i = context.getApplicationContext();
        this.f104509j = f10;
    }

    final void a(Rect rect, Rect rect2) {
        rect2.set(sg.bigo.ads.common.utils.e.a(this.f104508i, rect.left), sg.bigo.ads.common.utils.e.a(this.f104508i, rect.top), sg.bigo.ads.common.utils.e.a(this.f104508i, rect.right), sg.bigo.ads.common.utils.e.a(this.f104508i, rect.bottom));
    }
}
