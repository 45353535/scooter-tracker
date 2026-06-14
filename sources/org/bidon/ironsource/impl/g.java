package org.bidon.ironsource.impl;

import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.config.BidonError;

/* JADX INFO: loaded from: classes12.dex */
public interface g {

    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f97334a;

        public a(String str) {
            this.f97334a = str;
        }

        @Override // org.bidon.ironsource.impl.g
        public String a() {
            return this.f97334a;
        }
    }

    public static final class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f97335a;

        public b(String str) {
            this.f97335a = str;
        }

        @Override // org.bidon.ironsource.impl.g
        public String a() {
            return this.f97335a;
        }
    }

    public static final class c implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f97336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final BidonError f97337b;

        public c(String str, BidonError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f97336a = str;
            this.f97337b = error;
        }

        @Override // org.bidon.ironsource.impl.g
        public String a() {
            return this.f97336a;
        }

        public final BidonError b() {
            return this.f97337b;
        }
    }

    public static final class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f97338a;

        public d(String str) {
            this.f97338a = str;
        }

        @Override // org.bidon.ironsource.impl.g
        public String a() {
            return this.f97338a;
        }
    }

    public static final class e implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f97339a;

        public e(String str) {
            this.f97339a = str;
        }

        @Override // org.bidon.ironsource.impl.g
        public String a() {
            return this.f97339a;
        }
    }

    public static final class f implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f97340a;

        public f(String str) {
            this.f97340a = str;
        }

        @Override // org.bidon.ironsource.impl.g
        public String a() {
            return this.f97340a;
        }
    }

    /* JADX INFO: renamed from: org.bidon.ironsource.impl.g$g, reason: collision with other inner class name */
    public static final class C1127g implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f97341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final BidonError f97342b;

        public C1127g(String str, BidonError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f97341a = str;
            this.f97342b = error;
        }

        @Override // org.bidon.ironsource.impl.g
        public String a() {
            return this.f97341a;
        }

        public final BidonError b() {
            return this.f97342b;
        }
    }

    String a();
}
