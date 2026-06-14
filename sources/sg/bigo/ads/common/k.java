package sg.bigo.ads.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public interface k {

    public static class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f102542a;

        public a(String str) {
            this.f102542a = str;
        }

        @Override // sg.bigo.ads.common.k.b
        @Nullable
        public final String a() {
            return this.f102542a;
        }

        @Override // sg.bigo.ads.common.k.b
        @Nullable
        public final String b() {
            return this.f102542a;
        }

        @Override // sg.bigo.ads.common.k.b
        @Nullable
        public final String c() {
            return "";
        }

        @Override // sg.bigo.ads.common.k.b
        public final boolean d() {
            return false;
        }
    }

    public interface b {
        @Nullable
        String a();

        @Nullable
        String b();

        @Nullable
        String c();

        boolean d();
    }

    @NonNull
    b a(@Nullable String str);
}
