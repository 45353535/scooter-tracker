package e2;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public class l extends m {
    public l(View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    @Override // e2.m
    protected e l(Context context, e eVar) {
        return a.f68797j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e2.m
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void e(Context context, i2.b bVar, e eVar) {
        super.e(context, bVar, eVar);
        bVar.setText(!TextUtils.isEmpty(eVar.h()) ? eVar.h() : "Learn more");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // e2.m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public i2.b j(Context context, e eVar) {
        return new i2.b(context);
    }
}
