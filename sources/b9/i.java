package b9;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes12.dex */
public class i extends l {
    public i(View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    @Override // b9.l
    protected k j(Context context, k kVar) {
        return a.f5846j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b9.l
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void c(Context context, f9.b bVar, k kVar) {
        super.c(context, bVar, kVar);
        bVar.setText(!TextUtils.isEmpty(kVar.h()) ? kVar.h() : "Learn more");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // b9.l
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public f9.b h(Context context, k kVar) {
        return new f9.b(context);
    }
}
