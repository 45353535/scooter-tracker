package sh;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f104722j = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Class f104723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Class f104724i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ k b(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.a(str);
        }

        public final k a(String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
                Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> paramsClass = Class.forName(packageName + ".SSLParametersImpl");
                Intrinsics.checkNotNullExpressionValue(paramsClass, "paramsClass");
                return new l(cls, cls2, paramsClass);
            } catch (Exception e10) {
                rh.h.f99497a.g().k("unable to load android socket classes", 5, e10);
                return null;
            }
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Class sslSocketClass, Class sslSocketFactoryClass, Class paramClass) {
        super(sslSocketClass);
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
        Intrinsics.checkNotNullParameter(paramClass, "paramClass");
        this.f104723h = sslSocketFactoryClass;
        this.f104724i = paramClass;
    }
}
