package io.bidmachine.analytics.internal.t;

import android.content.Context;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.a.e;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends io.bidmachine.analytics.internal.s.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0967a f79892h = new C0967a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f79893g = "aexs";

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.t.a$a, reason: collision with other inner class name */
    public static final class C0967a {
        public /* synthetic */ C0967a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0967a() {
        }
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public String a() {
        return this.f79893g;
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public void d(Context context) {
    }

    @Override // io.bidmachine.analytics.internal.s.a
    public File a(ReaderConfig.Rule rule) {
        if (rule instanceof ReaderConfig.Rule.GeneralRule) {
            return new File(e.b(((ReaderConfig.Rule.GeneralRule) rule).getPath()));
        }
        throw new IllegalStateException("Check failed.");
    }
}
