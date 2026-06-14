package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5525wh implements InterfaceC5406rn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5368q9 f78510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5600zh f78511b;

    public C5525wh(C5600zh c5600zh, C5368q9 c5368q9) {
        this.f78511b = c5600zh;
        this.f78510a = c5368q9;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5406rn
    public final void a(Object obj) {
        List list = (List) obj;
        C5368q9 c5368q9 = this.f78510a;
        if (no.a((Collection) list)) {
            return;
        }
        c5368q9.f78056d = new C5318o9[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            C5280ml c5280ml = (C5280ml) list.get(i10);
            C5318o9[] c5318o9Arr = c5368q9.f78056d;
            Map map = Uf.f76560a;
            C5318o9 c5318o9 = new C5318o9();
            Integer num = c5280ml.f77766a;
            if (num != null) {
                c5318o9.f77887a = num.intValue();
            }
            Integer num2 = c5280ml.f77767b;
            if (num2 != null) {
                c5318o9.f77888b = num2.intValue();
            }
            if (!TextUtils.isEmpty(c5280ml.f77769d)) {
                c5318o9.f77889c = c5280ml.f77769d;
            }
            c5318o9.f77890d = c5280ml.f77768c;
            c5318o9Arr[i10] = c5318o9;
            this.f78511b.f78640g += CodedOutputByteBufferNano.computeMessageSizeNoTag(c5368q9.f78056d[i10]);
            this.f78511b.f78640g += CodedOutputByteBufferNano.computeTagSize(10);
        }
    }
}
