package kotlin.random;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends d implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final a f93344j = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f93345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f93346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f93347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f93348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f93349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f93350i;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public f(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f93345d = i10;
        this.f93346e = i11;
        this.f93347f = i12;
        this.f93348g = i13;
        this.f93349h = i14;
        this.f93350i = i15;
        if ((i10 | i11 | i12 | i13 | i14) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
        for (int i16 = 0; i16 < 64; i16++) {
            i();
        }
    }

    @Override // kotlin.random.d
    public int g(int i10) {
        return e.f(i(), i10);
    }

    @Override // kotlin.random.d
    public int i() {
        int i10 = this.f93345d;
        int i11 = i10 ^ (i10 >>> 2);
        this.f93345d = this.f93346e;
        this.f93346e = this.f93347f;
        this.f93347f = this.f93348g;
        int i12 = this.f93349h;
        this.f93348g = i12;
        int i13 = ((i11 ^ (i11 << 1)) ^ i12) ^ (i12 << 4);
        this.f93349h = i13;
        int i14 = this.f93350i + 362437;
        this.f93350i = i14;
        return i13 + i14;
    }

    public f(int i10, int i11) {
        this(i10, i11, 0, 0, ~i10, (i10 << 10) ^ (i11 >>> 4));
    }
}
