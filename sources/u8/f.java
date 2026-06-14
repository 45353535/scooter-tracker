package u8;

import android.content.Context;
import io.bidmachine.AdView;

/* JADX INFO: loaded from: classes12.dex */
public class f extends AdView {
    public f(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.AdView
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a createAd(Context context) {
        return new a(context);
    }
}
