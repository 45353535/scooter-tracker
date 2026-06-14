package sg.bigo.ads.common.w;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.ArrayMap;
import android.util.SparseBooleanArray;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(api = 19)
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final b f103096b = new b() { // from class: sg.bigo.ads.common.w.c.1
        @Override // sg.bigo.ads.common.w.c.b
        public final boolean a(float[] fArr) {
            float f10 = fArr[2];
            if (f10 < 0.95f && f10 > 0.05f) {
                float f11 = fArr[1];
                if ((f11 > 0.1f || f10 < 0.55f) && ((f11 > 0.5f || f10 < 0.75f) && (f11 > 0.2f || f10 < 0.7f))) {
                    float f12 = fArr[0];
                    if (f12 < 10.0f || f12 > 37.0f || f11 > 0.82f) {
                        return true;
                    }
                }
            }
            return false;
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<C1277c> f103098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<d> f103099d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseBooleanArray f103101f = new SparseBooleanArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<d, C1277c> f103100e = new ArrayMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    final C1277c f103097a = b();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        final Bitmap f103102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final List<d> f103103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f103104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f103105d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f103106e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final List<b> f103107f;

        public a(@NonNull Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f103103b = arrayList;
            this.f103104c = 16;
            this.f103105d = 12544;
            this.f103106e = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f103107f = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(c.f103096b);
            this.f103102a = bitmap;
            arrayList.add(d.f103114a);
        }
    }

    interface b {
        boolean a(@NonNull float[] fArr);
    }

    /* JADX INFO: renamed from: sg.bigo.ads.common.w.c$c, reason: collision with other inner class name */
    public static final class C1277c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f103108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f103109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f103110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f103111d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f103112e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private float[] f103113f;

        public C1277c(@ColorInt int i10, int i11) {
            this.f103110c = Color.red(i10);
            this.f103111d = Color.green(i10);
            this.f103112e = Color.blue(i10);
            this.f103108a = i10;
            this.f103109b = i11;
        }

        @NonNull
        public final float[] a() {
            if (this.f103113f == null) {
                this.f103113f = new float[3];
            }
            sg.bigo.ads.common.w.b.a(this.f103110c, this.f103111d, this.f103112e, this.f103113f);
            return this.f103113f;
        }
    }

    c(List<C1277c> list, List<d> list2) {
        this.f103098c = list;
        this.f103099d = list2;
    }

    @NonNull
    public static a a(@NonNull Bitmap bitmap) {
        return new a(bitmap);
    }

    @Nullable
    private C1277c b() {
        int size = this.f103098c.size();
        int i10 = Integer.MIN_VALUE;
        C1277c c1277c = null;
        for (int i11 = 0; i11 < size; i11++) {
            C1277c c1277c2 = this.f103098c.get(i11);
            int i12 = c1277c2.f103109b;
            if (i12 > i10) {
                c1277c = c1277c2;
                i10 = i12;
            }
        }
        return c1277c;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void a() {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.w.c.a():void");
    }
}
