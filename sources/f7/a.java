package f7;

import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {
    public static Boolean a(DivImageLoader divImageLoader) {
        return Boolean.FALSE;
    }

    public static LoadReference b(DivImageLoader divImageLoader, String str, DivImageDownloadCallback divImageDownloadCallback, int i10) {
        return divImageLoader.loadImage(str, divImageDownloadCallback);
    }

    public static LoadReference c(DivImageLoader divImageLoader, String str, DivImageDownloadCallback divImageDownloadCallback, int i10) {
        return divImageLoader.loadImageBytes(str, divImageDownloadCallback);
    }
}
