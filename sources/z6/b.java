package z6;

import com.yandex.div.core.downloader.DivDownloader;
import com.yandex.div.core.downloader.DivPatchDownloadCallback;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.view2.Div2View;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class b {
    static {
        DivDownloader divDownloader = DivDownloader.STUB;
    }

    public static /* synthetic */ LoadReference a(Div2View div2View, String str, DivPatchDownloadCallback divPatchDownloadCallback) {
        throw new AssertionError("To load patch you must provide implementation of DivDownloader to your DivConfiguration. ");
    }
}
