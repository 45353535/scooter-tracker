package uh;

import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rh.h;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f105671a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            return h.f99497a.g().c(trustManager);
        }

        private a() {
        }
    }

    public abstract List a(List list, String str);
}
