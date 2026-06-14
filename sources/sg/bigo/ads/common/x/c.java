package sg.bigo.ads.common.x;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f103121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C1278a f103122b = new C1278a();

        /* JADX INFO: renamed from: sg.bigo.ads.common.x.c$a$a, reason: collision with other inner class name */
        static class C1278a {
            C1278a() {
            }

            public static void a(@NonNull SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        private a() {
        }

        public static a a() {
            if (f103121a == null) {
                f103121a = new a();
            }
            return f103121a;
        }
    }
}
