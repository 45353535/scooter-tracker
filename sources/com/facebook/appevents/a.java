package com.facebook.appevents;

import com.facebook.AccessToken;
import java.io.ObjectStreamException;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0327a f19631d = new C0327a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f19633c;

    /* JADX INFO: renamed from: com.facebook.appevents.a$a, reason: collision with other inner class name */
    public static final class C0327a {
        public /* synthetic */ C0327a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0327a() {
        }
    }

    public static final class b implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0328a f19634d = new C0328a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f19635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f19636c;

        /* JADX INFO: renamed from: com.facebook.appevents.a$b$a, reason: collision with other inner class name */
        public static final class C0328a {
            public /* synthetic */ C0328a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0328a() {
            }
        }

        public b(String str, String appId) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            this.f19635b = str;
            this.f19636c = appId;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new a(this.f19635b, this.f19636c);
        }
    }

    public a(String str, String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.f19632b = applicationId;
        this.f19633c = com.facebook.internal.z.W(str) ? null : str;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new b(this.f19633c, this.f19632b);
    }

    public final String d() {
        return this.f19633c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return com.facebook.internal.z.e(aVar.f19633c, this.f19633c) && com.facebook.internal.z.e(aVar.f19632b, this.f19632b);
    }

    public final String g() {
        return this.f19632b;
    }

    public int hashCode() {
        String str = this.f19633c;
        return (str != null ? str.hashCode() : 0) ^ this.f19632b.hashCode();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(AccessToken accessToken) {
        this(accessToken.getToken(), com.facebook.s.n());
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
    }
}
