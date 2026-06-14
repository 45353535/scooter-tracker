package sg.bigo.ads.core.f.a;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<C1291a> f104177a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<C1291a> f104178b = new ArrayList();

    /* JADX INFO: renamed from: sg.bigo.ads.core.f.a.a$a, reason: collision with other inner class name */
    public static final class C1291a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f104180b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f104181c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f104182d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f104183e;

        public C1291a(String str, int i10, int i11, @Nullable String str2, String str3) {
            this.f104180b = str;
            this.f104181c = i10;
            this.f104182d = i11;
            this.f104183e = str2;
            this.f104179a = str3;
        }

        public final boolean a() {
            return !TextUtils.isEmpty(this.f104180b);
        }

        public final boolean b() {
            return "image/jpeg".equalsIgnoreCase(this.f104183e) || MimeTypes.IMAGE_PNG.equalsIgnoreCase(this.f104183e);
        }

        public final boolean c() {
            return "image/gif".equalsIgnoreCase(this.f104183e);
        }
    }

    @Nullable
    public final C1291a a() {
        return a(this.f104177a);
    }

    public static C1291a a(List<C1291a> list) {
        if (list == null) {
            return null;
        }
        for (C1291a c1291a : list) {
            if (c1291a != null) {
                return c1291a;
            }
        }
        return null;
    }
}
