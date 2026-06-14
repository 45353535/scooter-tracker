package sg.bigo.ads.api;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import sg.bigo.ads.common.p.g;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class AdIconView extends a<sg.bigo.ads.core.adview.a> {
    public AdIconView(@NonNull Context context) {
        super(context);
    }

    @Override // sg.bigo.ads.api.a
    @NonNull
    protected final /* synthetic */ sg.bigo.ads.core.adview.c a() {
        return new sg.bigo.ads.core.adview.a(this);
    }

    public AdIconView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(String str, boolean z10) {
        getViewImpl().a(null, str, z10, null);
    }

    public AdIconView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public final void a(@Nullable Executor executor, String str, boolean z10, @Nullable g gVar) {
        getViewImpl().a(executor, str, z10, gVar);
    }
}
