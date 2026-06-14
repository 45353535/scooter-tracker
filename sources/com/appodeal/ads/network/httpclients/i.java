package com.appodeal.ads.network.httpclients;

import java.net.HttpURLConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f13983b;

    public i(Ref$ObjectRef ref$ObjectRef) {
        this.f13983b = ref$ObjectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f13983b.f93280b;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        return Unit.f93236a;
    }
}
