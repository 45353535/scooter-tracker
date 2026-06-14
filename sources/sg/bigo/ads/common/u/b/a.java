package sg.bigo.ads.common.u.b;

import android.content.Context;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.u.a;

/* JADX INFO: loaded from: classes4.dex */
public final class a<T extends sg.bigo.ads.common.u.a> extends c<T> {
    public a(int i10, @NonNull T t10, Context context) {
        this(i10, t10, false, context);
    }

    @Override // sg.bigo.ads.common.u.b.c
    @NonNull
    public final String a() {
        return super.a();
    }

    public a(int i10, @NonNull T t10, boolean z10, Context context) {
        super(i10, t10, z10, context);
    }

    public a(@NonNull T t10, Context context) {
        this(sg.bigo.ads.common.y.a.a(), t10, context);
    }
}
