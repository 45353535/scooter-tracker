package me;

import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.j;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f94861d = 100000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f94862e = 100000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Function1 f94863f = new Function1() { // from class: me.e
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return g.j((HttpsURLConnection) obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Function1 f94864g = new Function1() { // from class: me.f
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return g.i((HttpURLConnection) obj);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(HttpURLConnection httpURLConnection) {
        Intrinsics.checkNotNullParameter(httpURLConnection, "<this>");
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(HttpsURLConnection it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f93236a;
    }

    public final int e() {
        return this.f94861d;
    }

    public final Function1 f() {
        return this.f94864g;
    }

    public final int g() {
        return this.f94862e;
    }

    public final Function1 h() {
        return this.f94863f;
    }
}
