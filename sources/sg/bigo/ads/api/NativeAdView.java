package sg.bigo.ads.api;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.core.adview.g;

/* JADX INFO: loaded from: classes4.dex */
public class NativeAdView extends a<g> {
    public NativeAdView(@NonNull Context context) {
        super(context);
    }

    @Override // sg.bigo.ads.api.a
    @NonNull
    protected final /* synthetic */ sg.bigo.ads.core.adview.c a() {
        return new g(this);
    }

    public NativeAdView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NativeAdView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
