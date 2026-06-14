package sg.bigo.ads.controller.b;

import android.os.Parcel;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONObject;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements sg.bigo.ads.api.a.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[][] f103323n = {new int[]{1, 2}, new int[]{3, 4}};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f103331h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f103324a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f103325b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f103326c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f103327d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f103328e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f103329f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f103330g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    final a f103332i = new a(3);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    final a f103333j = new a(4);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    final a f103334k = new a(12);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    final a f103335l = new a(1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    final a f103336m = new a(20);

    class a implements sg.bigo.ads.common.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f103337a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f103338b = 20;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f103339c = 5;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f103341e;

        a(int i10) {
            this.f103341e = i10;
        }

        @Override // sg.bigo.ads.common.f
        public final void a(@NonNull Parcel parcel) {
            parcel.writeInt(this.f103337a);
            parcel.writeInt(this.f103338b);
            parcel.writeInt(this.f103341e);
            parcel.writeInt(this.f103339c);
        }

        @Override // sg.bigo.ads.common.f
        public final void b(@NonNull Parcel parcel) {
            this.f103337a = parcel.readInt();
            this.f103338b = parcel.readInt();
            this.f103341e = parcel.readInt();
            this.f103339c = parcel.readInt();
        }

        public final void a(JSONObject jSONObject) {
            String str;
            int i10 = this.f103341e;
            if (i10 == 1) {
                this.f103337a = jSONObject.optInt("nat_load_fail_fill", 0);
                this.f103339c = jSONObject.optInt("nat_time_for_check_process", 5);
                str = "nat_min_video_loading_pro";
            } else if (i10 == 12) {
                this.f103337a = jSONObject.optInt("spl_load_fail_fill", 0);
                this.f103339c = jSONObject.optInt("spl_time_for_check_process", 5);
                str = "spl_min_video_loading_pro";
            } else if (i10 == 20) {
                this.f103337a = jSONObject.optInt("pop_load_fail_fill", 0);
                this.f103339c = jSONObject.optInt("pop_time_for_check_process", 5);
                str = "pop_min_video_loading_pro";
            } else if (i10 == 3) {
                this.f103337a = jSONObject.optInt("int_load_fail_fill", 0);
                this.f103339c = jSONObject.optInt("int_time_for_check_process", 5);
                str = "int_min_video_loading_pro";
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f103337a = jSONObject.optInt("rew_load_fail_fill", 0);
                this.f103339c = jSONObject.optInt("rew_time_for_check_process", 5);
                str = "rew_min_video_loading_pro";
            }
            this.f103338b = jSONObject.optInt(str, 20);
        }
    }

    @Override // sg.bigo.ads.api.a.d
    public final int a() {
        return this.f103324a;
    }

    @Override // sg.bigo.ads.api.a.d
    public final int b(int i10) {
        a aVar;
        if (i10 == 1) {
            aVar = this.f103335l;
        } else if (i10 == 12) {
            aVar = this.f103334k;
        } else if (i10 == 20) {
            aVar = this.f103336m;
        } else if (i10 == 3) {
            aVar = this.f103332i;
        } else {
            if (i10 != 4) {
                return 5;
            }
            aVar = this.f103333j;
        }
        return aVar.f103339c;
    }

    @Override // sg.bigo.ads.api.a.d
    public final boolean c(int i10) {
        return i10 != 1 ? i10 != 12 ? i10 != 20 ? i10 != 3 ? i10 == 4 && this.f103333j.f103337a == 1 : this.f103332i.f103337a == 1 : this.f103336m.f103337a == 1 : this.f103334k.f103337a == 1 : this.f103335l.f103337a == 1;
    }

    @Override // sg.bigo.ads.api.a.d
    public final int d(int i10) {
        a aVar;
        if (i10 == 1) {
            aVar = this.f103335l;
        } else if (i10 == 12) {
            aVar = this.f103334k;
        } else if (i10 == 20) {
            aVar = this.f103336m;
        } else if (i10 == 3) {
            aVar = this.f103332i;
        } else {
            if (i10 != 4) {
                return 20;
            }
            aVar = this.f103333j;
        }
        return aVar.f103338b;
    }

    @Override // sg.bigo.ads.api.a.d
    public final int a(int i10) {
        if (i10 == 1) {
            return this.f103330g;
        }
        if (i10 == 12) {
            return this.f103329f;
        }
        if (i10 == 20) {
            return this.f103331h;
        }
        if (i10 == 3) {
            return this.f103327d;
        }
        if (i10 != 4) {
            return 0;
        }
        return this.f103328e;
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f103324a = parcel.readInt();
        this.f103325b = parcel.readString();
        this.f103326c = parcel.readString();
        this.f103327d = parcel.readInt();
        this.f103328e = parcel.readInt();
        this.f103329f = parcel.readInt();
        this.f103330g = parcel.readInt();
        n.b(parcel, this.f103332i);
        n.b(parcel, this.f103333j);
        n.b(parcel, this.f103334k);
        n.b(parcel, this.f103335l);
        this.f103331h = parcel.readInt();
        n.b(parcel, this.f103336m);
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeInt(this.f103324a);
        parcel.writeString(this.f103325b);
        parcel.writeString(this.f103326c);
        parcel.writeInt(this.f103327d);
        parcel.writeInt(this.f103328e);
        parcel.writeInt(this.f103329f);
        parcel.writeInt(this.f103330g);
        n.a(parcel, this.f103332i);
        n.a(parcel, this.f103333j);
        n.a(parcel, this.f103334k);
        n.a(parcel, this.f103335l);
        parcel.writeInt(this.f103331h);
        n.a(parcel, this.f103336m);
    }

    @Override // sg.bigo.ads.api.a.d
    public final boolean a(String str, int i10) {
        int i11 = !q.a((CharSequence) this.f103325b) ? 1 : 0;
        int i12 = !q.a((CharSequence) this.f103326c) ? 1 : 0;
        if (a(i10) > 0) {
            int i13 = f103323n[i11][i12];
            if (i13 != 1) {
                if (i13 != 2) {
                    return i13 == 3 && q.a(this.f103325b.split(StringUtils.COMMA), str);
                }
                if (!q.a(this.f103326c.split(StringUtils.COMMA), str)) {
                }
            }
            return true;
        }
        return false;
    }
}
