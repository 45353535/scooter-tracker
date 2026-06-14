package sg.bigo.ads.a;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ColorInt
    private final int f100061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ColorInt
    private final int f100062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f100063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Bitmap f100064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f100065f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f100066g;

    /* JADX INFO: renamed from: sg.bigo.ads.a.a$a, reason: collision with other inner class name */
    public static class C1201a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f100067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f100068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f100069c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @ColorInt
        private int f100070d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @ColorInt
        private int f100071e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f100072f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bitmap f100073g;

        public final a a() {
            return new a(this.f100067a, this.f100070d, this.f100071e, this.f100072f, this.f100073g, this.f100068b, this.f100069c);
        }
    }

    public interface b {
        void a(Context context, String str, int i10, @Nullable String str2);

        void a(String str, String str2, String str3);
    }

    public interface c {
        void a();

        void b();

        void c();

        void d();

        void e();

        void f();
    }

    public a(String str, int i10, int i11, boolean z10, Bitmap bitmap, c cVar, b bVar) {
        this.f100060a = str;
        this.f100061b = i10;
        this.f100062c = i11;
        this.f100063d = z10;
        this.f100064e = bitmap;
        this.f100065f = cVar;
        this.f100066g = bVar;
    }

    public final void a(Context context) {
        sg.bigo.ads.a.c.a(context, this.f100060a, this.f100061b, this.f100062c, this.f100063d, this.f100064e, this.f100065f, this.f100066g);
    }
}
