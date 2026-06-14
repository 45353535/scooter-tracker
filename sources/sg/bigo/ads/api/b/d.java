package sg.bigo.ads.api.b;

import androidx.annotation.NonNull;
import sg.bigo.ads.api.Ad;

/* JADX INFO: loaded from: classes4.dex */
public interface d<T extends Ad> {

    public interface a<T extends Ad> {
        void a(T t10);

        void a(T t10, int i10, int i11, String str);

        void a(T t10, boolean z10, int i10, int i11, String str, boolean z11);
    }

    void a(@NonNull a<T> aVar);
}
