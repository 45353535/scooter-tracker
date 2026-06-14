package sg.bigo.ads.controller.a.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f103199c = r.f102828a.a(30);

    @Nullable
    protected static <T extends a> T a(List<T> list) {
        if (k.a((Collection) list)) {
            return null;
        }
        T t10 = (T) k.a((List) list);
        if (t10 != null) {
            t10.f103144d = false;
        }
        return t10;
    }

    public abstract sg.bigo.ads.controller.a.k a(String str);

    @NonNull
    public String toString() {
        return super.toString();
    }

    public void a(boolean z10) {
    }
}
