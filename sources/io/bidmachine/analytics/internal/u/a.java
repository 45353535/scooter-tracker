package io.bidmachine.analytics.internal.u;

import android.content.Context;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.a.e;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends io.bidmachine.analytics.internal.s.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0968a f79894i = new C0968a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final File f79895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f79896h = "aints";

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.u.a$a, reason: collision with other inner class name */
    public static final class C0968a {
        public /* synthetic */ C0968a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0968a() {
        }
    }

    public a(File file) {
        this.f79895g = file;
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public String a() {
        return this.f79896h;
    }

    @Override // io.bidmachine.analytics.internal.h.d
    public void d(Context context) {
    }

    @Override // io.bidmachine.analytics.internal.s.a
    public File a(ReaderConfig.Rule rule) {
        if (rule instanceof ReaderConfig.Rule.GeneralRule) {
            return new File(this.f79895g, e.b(((ReaderConfig.Rule.GeneralRule) rule).getPath()));
        }
        throw new IllegalStateException("Check failed.");
    }
}
