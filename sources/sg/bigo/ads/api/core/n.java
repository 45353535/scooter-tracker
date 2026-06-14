package sg.bigo.ads.api.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Pair;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import sg.bigo.ads.api.core.h;

/* JADX INFO: loaded from: classes4.dex */
public interface n extends sg.bigo.ads.api.core.b {

    public interface a {
        int a();

        int b();

        String c();
    }

    public interface b {
        int a();

        long b();

        int c();

        long d();
    }

    public interface c {
        int a();

        int b();

        String c();
    }

    public interface d {
        long a();

        void a(long j10);

        void a(boolean z10);

        boolean b();

        @IntRange(from = 1, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis)
        int c();

        boolean d();
    }

    @NonNull
    String a(Context context);

    void a(Pair<Bitmap, String> pair);

    void a(m mVar);

    @Nullable
    b aA();

    @Nullable
    d aB();

    int aC();

    int aD();

    long aE();

    boolean aF();

    boolean aG();

    int aH();

    String aI();

    String aJ();

    String aK();

    long aL();

    int aM();

    String aN();

    boolean aO();

    @Nullable
    String aP();

    @Nullable
    String aQ();

    boolean aR();

    boolean aS();

    @Nullable
    String aT();

    long aU();

    @Nullable
    m aV();

    boolean aW();

    void aX();

    String aY();

    boolean aZ();

    @Nullable
    a av();

    @Nullable
    h.b aw();

    @Nullable
    a[] ax();

    @Nullable
    c ay();

    @Nullable
    String az();

    @NonNull
    String b(Context context);

    void b(long j10);

    void ba();

    boolean bb();

    void bc();

    int bd();

    int be();

    int bf();

    int bg();

    Pair<Bitmap, String> bh();

    boolean bi();

    void bj();

    void bk();

    boolean bl();

    int bm();

    int bn();

    int bo();

    int bp();

    String c(Context context);

    void c(String str);

    boolean c(@IntRange(from = 1, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis) long j10);

    void f(int i10);

    void g(int i10);

    void h(int i10);

    void i(int i10);

    void j(int i10);

    void k(int i10);

    void l(int i10);

    void m(int i10);

    void n(int i10);

    void o(int i10);
}
