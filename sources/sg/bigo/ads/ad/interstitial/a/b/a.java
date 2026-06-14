package sg.bigo.ads.ad.interstitial.a.b;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public interface a {

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.a.b.a$a, reason: collision with other inner class name */
    public static final class C1223a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Set<Integer> f100661a = new HashSet();

        public final void a(sg.bigo.ads.api.core.b bVar, int i10, long j10) {
            if (this.f100661a.contains(Integer.valueOf(i10))) {
                return;
            }
            this.f100661a.add(Integer.valueOf(i10));
            sg.bigo.ads.core.d.b.a(bVar, i10, j10, (String) null, -1, (String) null, (String) null);
        }

        public final void a(sg.bigo.ads.api.core.b bVar, int i10, long j10, @Nullable String str, int i11, @Nullable String str2, @Nullable String str3) {
            if (this.f100661a.contains(Integer.valueOf(i10))) {
                return;
            }
            this.f100661a.add(Integer.valueOf(i10));
            sg.bigo.ads.core.d.b.a(bVar, i10, j10, str, i11, str2, str3);
        }
    }

    @Nullable
    View a();

    void a(int i10);

    void a(int i10, int i11);

    boolean a(Context context);

    boolean b();

    void c();

    void d();

    void e();

    void f();
}
