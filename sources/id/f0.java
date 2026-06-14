package id;

import com.adjust.sdk.Constants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum f0 implements pd.p {
    Normal(Constants.NORMAL, 0),
    Bold("bold", 1),
    Italic("italic", 2),
    BoldItalic("bold_italic", 3);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f74486d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f74492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f74493c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f0 a(String str) {
            return (f0) pd.g0.l(f0.values(), str);
        }

        private a() {
        }
    }

    f0(String str, int i10) {
        this.f74492b = str;
        this.f74493c = i10;
    }

    public final int g() {
        return this.f74493c;
    }

    @Override // pd.p
    public String getKey() {
        return this.f74492b;
    }
}
