package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.x;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements com.fyber.inneractive.sdk.response.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f21110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f21111b;

    public g(List list, i iVar) {
        this.f21110a = list;
        this.f21111b = iVar;
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        if (xVar == null || this.f21110a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.f21110a) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str.replace("[REASON]", String.valueOf(this.f21111b.mReason)));
            }
        }
        return arrayList;
    }
}
