package yads;

import android.graphics.Bitmap;
import android.net.Uri;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageDownloadCallback;

/* JADX INFO: loaded from: classes4.dex */
public final class ug0 implements u21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DivImageDownloadCallback f116635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f116636b;

    public ug0(String str, DivImageDownloadCallback divImageDownloadCallback) {
        this.f116635a = divImageDownloadCallback;
        this.f116636b = str;
    }

    @Override // yads.on2
    public final void a(oj3 oj3Var) {
        this.f116635a.onError();
    }

    @Override // yads.u21
    public final void a(t21 t21Var, boolean z10) {
        Bitmap bitmap = t21Var.f116034a;
        if (bitmap != null) {
            this.f116635a.onSuccess(new CachedBitmap(bitmap, Uri.parse(this.f116636b), z10 ? BitmapSource.MEMORY : BitmapSource.NETWORK));
        }
    }
}
